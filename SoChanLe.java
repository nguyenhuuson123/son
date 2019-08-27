/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtratinhchat1so;

public class SoNguyenTo {
	public int xetSoNguyenTo(int soa) {
		int count=0;
         if(soa<2) {
        	 return 0;// không phải là số nguyên tố
         }
         // cho chạy vòng for với i  bắt đầu từ 2 và i<= căn bậc 2 của số a 
         for(int i=2;i<=Math.sqrt(soa);i++) {
        	 if(soa%i==0) {
        		 count ++;
        	 }
         }
         //trong quá trình đếm nếu count bằng 0 thì nghĩa là soa chỉ chia hết cho 0 và chính nó
         if(count==0) {
        	 return 1;// là số nguyên tố
        //trong quá trình đếm nếu count khác 0 thì nghĩa là soa chia hết cho nhiều số
         }
         else 
        	 return 2;// không phải số nguyên tố
         
	}

}


public class SoChinhPhuong {
     public int xetSoChinhPhuong(int soa) {
    	 int i=0;
    	 while(	Math.pow(i,2)<=soa) {
    		 if(Math.pow(i,2)==soa) {
    			 return 0;// là số chính phương
    		 }
    		 ++i; 
    	 }
    	 return 1;	// không phải là số chính phương
     }
}

public class SoHoanHao {
   public Boolean xetSoHoanHao(int soa) {
	   int sum=0;
	   for(int i=1;i<=soa/2;i++) {
		   if(soa%i==0) {
			   sum+=i;
		   }
	   }
	  return sum==soa?true:false;
   }
}

public class SoChanLe {
	public boolean xetSoChanLe(int soa) {
		return soa%2==0?true:false;
	}

}

public class Main {
	
	public static void soNguyenTo(int soa) {
		SoNguyenTo soNguyenTo=new SoNguyenTo();
		int n=soNguyenTo.xetSoNguyenTo(soa);
		if(n==1) {
			System.out.println(soa+"  "+"là số nguyên tố");
		}else {
			System.out.println(soa+"  "+"không phải là số nguyên tố");
		}
	}
	
	
	public static void soHoanHao(int soa) {
	    SoHoanHao soHoanHao=new SoHoanHao();
	    boolean n=soHoanHao.xetSoHoanHao(soa);
         if(n==true) {
        	 System.out.println(soa+"  "+"là số hoàn hảo");
         }else {
        	 System.out.println(soa+"  "+"không phải là số hoàn hảo");
         }
	}
	
	public static void  soChinhPhuong(int soa) {
		SoChinhPhuong soChinhPhuong=new SoChinhPhuong();
		int n=soChinhPhuong.xetSoChinhPhuong(soa);
		if(n==0) {
			System.out.println(soa+"  "+"là số chính phương");
		}else {
			System.out.println(soa+"  "+"không phải là số chính phương");
		}
	}
	
	public static void soChanLe( int soa) {
		SoChanLe soChanLe=new SoChanLe();
		boolean n=soChanLe.xetSoChanLe(soa);
		if(n==true) {
			System.out.println(soa+" "+"là số chẵn");
		}else {
			System.out.println(soa+"  "+"không phải số chẵn");
		}
	}

	public static void menu() {
		System.out.println("1.Số chính phương");
		System.out.println("2.Số hoàn hảo");
		System.out.println("3.Số nguyên tố");
		System.out.println("4.Số chẵn lẻ");
	}
	
  public static void option() {
	  Scanner s=new Scanner(System.in);
	  System.out.print("chọn tính chất của số:");
	   int n=s.nextInt();
	  System.out.print("nhập vào số bạn cần kiểm tra:");
       int soa=s.nextInt();
       switch(n) {
       case 1:
    	   soChinhPhuong(soa);
    	   menu();
    	   option();
    	   break;
       case 2:
    	   soHoanHao(soa);
    	   menu();
    	   option();
    	   break;
       case 3:
    	   soNguyenTo(soa);
    	   menu();
    	   option();
    	   break;
       case 4:
    	   soChanLe(soa);
    	   menu();
    	   option();
    	   break;
        default:
        	System.out.println("số bạn chọn không hợp lệ");
        	break;
       }
     }
  public static void main(String[] args) {
	   menu();
	   option();
   }

}
