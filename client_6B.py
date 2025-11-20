import socket 
c = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
c.sendto(input("Enter MAC address: ").encode(), ('localhost', 55555)) 
print("IP Address:", c.recvfrom(1024)[0].decode()) 
c.close() 