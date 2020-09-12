class  Keramik():

	def __init__(self):
		global ukuran, isi, harga
		self.kategori = {"A":[30*30,10,54000],"B":[40*40,5,65000],"C":[30*40,8,60000]}

	def hitung(self,kategori):
		## 100m2 = 1000000cm2
		data = self.kategori[kategori]
		for i in range(len(data)):
			jumlah_keramik = 1000000//data[0]
			jumlah_box = jumlah_keramik//data[1]
			harga_total = jumlah_box*data[2]

		return harga_total

def main():
	pakbejo = Keramik()
	print("A : ",pakbejo.hitung("A"))
	print("B : ",pakbejo.hitung("B"))
	print("C : ",pakbejo.hitung("C"))

if __name__ == "__main__":
	main()
