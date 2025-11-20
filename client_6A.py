import socket 
c = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
c.sendto(input("Enter IP address: ").encode(), ('localhost', 54545)) 
print("MAC Address:", c.recvfrom(1024)[0].decode()) 
c.close() 