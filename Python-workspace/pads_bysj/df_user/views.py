# -*-coding:utf-8 -*-
from django.shortcuts import render,redirect,HttpResponseRedirect
from .models import *
from hashlib import sha1
from django.http import JsonResponse
# Create your views here.

def register(request):
    return render(request, 'df_user/register.html')
def register_handle(request):
    post = request.POST

    uname = post.get('user_name')
    upwd = post.get('pwd')
    upwd2 = post.get('cpwd')
    uemail =post.get('email')
    if upwd != upwd2:
        return redirect('register.html')


    #加密
    s1 = sha1()
    s1.update(upwd.encode('utf-8'))
    upwd3 = s1.hexdigest()


    user = UserInfo()
    user.uname = uname
    user.upwd = upwd3
    user.uemail = uemail
    user.save()
    return redirect('login.html')

def login(request):
    uname = request.COOKIES.get('uname','')
    context={'title':'用户登录','error_name':0,'error_pwd':0,'uname':uname}
    return render(request, 'df_user/login.html', context)

# 登录处理
def login_handle(request):
    # 接收请求信息
    post = request.POST
    uname = post.get('username')
    upwd = post.get('pwd')
    jizhu = post.get('jizhu', 0)
    # 根据用户名查询对象
    users = UserInfo.objects.filter(uname=uname)
    print(uname)
    # 判断如果未查到则用户名错，查到再判断密码是否正确，正确则转到用户中心
    if len(users) == 1:
        s1 = sha1()
        s1.update(upwd.encode('utf-8'))
        if s1.hexdigest() == users[0].upwd:
            red = HttpResponseRedirect('/user/info')
            # 记住用户名
            if jizhu != 0:
                red.set_cookie('uname', uname)
            else:
                red.set_cookie('uname', '', max_age=-1)
            request.session['user_id'] = users[0].id
            request.session['user_name'] = uname
            return red
        else:
            context = {'title': '用户登录', 'error_name': 0, 'error_pwd': 1, 'uname': uname, 'upwd': upwd}
            return render(request, 'df_user/login.html', context)
    else:
        context = {'title': '用户登录', 'error_name': 1, 'error_pwd': 0, 'uname': uname, 'upwd': upwd}
        return render(request, 'df_user/login.html', context)


# 判断用户是否已经存在
def register_exist(requset):
    uname = requset.GET.get('uname')
    count = UserInfo.objects.filter(uname=uname).count()
    return JsonResponse({'count': count})

def info(request):
    print(request.session['user_id'])
    user_email = UserInfo.objects.get(id=request.session['user_id']).uemail
    print(user_email)

    # # 最近浏览
    # goods_ids = request.COOKIES.get('goods_ids', '')
    # goods_id_list = goods_ids.split(',')
    # goods_list = []
    # for goods_id in goods_id_list:
    #     goods_list.append(GoodsInfo.objects.get(id=int(goods_id)))

    context = {'title': '用户中心',
               'user_email': user_email,
                'user_name': request.session['user_name']
               # 'page_name': 1, 'info': 1,
               # 'goods_list': goods_list
            }
    return render(request, 'df_user/user_center_info.html', context)

# 收货地址

def site(request):
    user = UserInfo.objects.get(id=request.session['user_id'])
    if request.method == 'POST':
        post = request.POST
        user.ushou = post.get('ushou')
        user.uaddress = post.get('uaddress')
        user.uphone = post.get('uphone')
        user.uyoubian = post.get('uyoubian')
        user.save()
    context = {'title': '用户中心', 'user': user,'page_name':1,'site':1}
    return render(request, 'df_user/user _center_site.html', context)


