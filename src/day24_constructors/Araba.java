package day24_constructors;

public class Araba {

        String marka = "Marka belirtilmedi";
        String model = "Model belirtilmedi";
        String yakit;
        int yil;
        int fiyat;


        public Araba(String mrk, String mdl){
        }


        public Araba() {
        }


    public String toString() {

            return "Araba Ozellikleri " +
                    "\nmarka : " + marka +
                    "\nmodel : " + model +
                    "\nyakit : " + yakit +
                    "\nyil : " + yil +
                    "\nfiyat : " + fiyat;

        }


    }
