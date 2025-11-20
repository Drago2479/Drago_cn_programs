import socket,zlib

s=socket.socket();s.connect(('localhost',9999))
data=input("Enter message: ").encode()
crc=zlib.crc32(data).to_bytes(4,'big')
s.send(data+crc)
print(f"Sent: {data.decode()} | CRC: {int.from_bytes(crc,'big')} ✅")
s.close()
