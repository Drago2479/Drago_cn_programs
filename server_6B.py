import socket 
rarp = {"AA:BB:CC:DD:EE:01": "192.168.1.2", "AA:BB:CC:DD:EE:02": "192.168.1.3"} 
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
s.bind(('localhost', 55555)) 
print("RARP Server is running...") 
while True: 
    d,a = s.recvfrom(1024) 
    print("received query for", d.decode()) 
    s.sendto(rarp.get(d.decode(), "IP not found").encode(), a)