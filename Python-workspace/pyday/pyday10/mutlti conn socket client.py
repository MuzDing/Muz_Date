# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-4 上午11:07'


import socket
import sys



messages = [ b'This is the message. ',
             b'It will be sent ',
             b'in parts.',
             ]
server_address = ('localhost', 9999)
def func():
    # Create a TCP/IP socket
    socks = [socket.socket(socket.AF_INET, socket.SOCK_STREAM) for i in range(11000)]
    print(socks)
    # Connect the socket to the port where the server is listening
    print('connecting to %s port %s' % server_address)
    for s in socks:
        s.connect(server_address)

    for message in messages:

        # Send messages on both sockets
        for s in socks:
            print('%s: sending "%s"' % (s.getsockname(), message))
            s.send(message)

        # Read responses on both sockets
        for s in socks:
            data = s.recv(1024)
            print('%s: received "%s"' % (s.getsockname(), data))
            if not data:
                print('closing socket', s.getsockname())


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    func()