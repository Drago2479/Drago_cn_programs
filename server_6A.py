import socket 
arp = {"192.168.1.2": "AA:BB:CC:DD:EE:01", "192.168.1.3": "AA:BB:CC:DD:EE:02"} 
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
s.bind(('localhost', 54545)) 
print("ARP Server is running...") 
while True: 
    d,a = s.recvfrom(1024) 
    print("received query for", d.decode()) 
    s.sendto(arp.get(d.decode(), "MAC not found").encode(), a) 