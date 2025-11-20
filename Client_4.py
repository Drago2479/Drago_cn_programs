import socket 
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
domain = input("enter domain name: ") 
s.sendto(domain.encode(), ('localhost', 53535)) 
data, _ = s.recvfrom(1024) 
print("IP address:", data.decode()) 
s.close()