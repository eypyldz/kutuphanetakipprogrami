package Siniflar;




public class HataAyiklama {

    public boolean bosMu(String gelen) {
        if (gelen == null) {
            return false;
        } else {
            gelen = gelen.trim();
            if (gelen.equals("")) {
                return false;
            }
        }
        return true;
    }

    public boolean metinMi(String gelen) {
        if (!bosMu(gelen)) {
            return false;
        } else {
            for (char c : gelen.toCharArray()) {
                if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean tamSayiMi(String gelen) {
        if (!bosMu(gelen)) {
            return false;
        } else {
            if (!gelen.substring(0, 1).equals("-") && !Character.isDigit(gelen.charAt(0))) {
                return false;
            }
            for (int i=1;i<gelen.length();i++) {
                if (!Character.isDigit(gelen.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean tamSayiPozitifMi(String gelen){
        if(!bosMu(gelen)){
            return false;
        }else{
            for (char c : gelen.toCharArray()) {
                 if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }
            return true;
    }
    public boolean tamSayiSifirdanBuyukMu(String gelen){
        if(!tamSayiPozitifMi(gelen)){
            return false;
        }else{
            int sayi=Integer.valueOf(gelen);
            if(sayi<=0){
                return false;
            }
        }
        return true;
    }
    public boolean mailAdresiMi(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    public boolean telNoMu(String tel){
        String ePattern = "0\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(tel);
           return m.matches();
    }
    public String adSoyadHarfDuzenle(String adSoyad){
        String[] adSoyDizi =adSoyad.split(" ");
        String ad="";
        String soyad=adSoyDizi[adSoyDizi.length-1].toUpperCase();
        for(int i=0;i<adSoyDizi.length-1;i++){
            ad+=adSoyDizi[i].substring(0, 1).toUpperCase();
            ad+=adSoyDizi[i].substring(1).toLowerCase();
            ad+=" ";
        }
        return ad+soyad;
    }
    public boolean ondalikliSayiMi(String sayi){
        String[] sayiDizi=sayi.split("\\.");
        if(sayiDizi.length>2){
            return false;
        }else{
            for(int i=0;i<sayiDizi.length;i++){
                if(!tamSayiMi(sayiDizi[i])){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean ondalikliSayiPozitifMi(String sayi){
        if(!ondalikliSayiMi(sayi)){
            return false;
        }else{
            double say=Double.valueOf(sayi);
            if(say<0){
                return false;
            }
        }
        return true;
    }
    public boolean isValidTckn(Long tckn) {
	try {
		String tmp = tckn.toString();
 
		if (tmp.length() == 11) {
			int totalOdd = 0;
 
			int totalEven = 0;
 
			for (int i = 0; i < 9; i++) {
				int val = Integer.valueOf(tmp.substring(i, i + 1));
 
				if (i % 2 == 0) {
					totalOdd += val;
				} else {
					totalEven += val;
				}
			}
 
			int total = totalOdd + totalEven + Integer.valueOf(tmp.substring(9, 10));
 
			int lastDigit = total % 10;
 
			if (tmp.substring(10).equals(String.valueOf(lastDigit))) {
				int check = (totalOdd * 7 - totalEven) % 10;
 
				if (tmp.substring(9, 10).equals(String.valueOf(check))) {
					return true;
				}
			}
		}
	} catch (NumberFormatException e) {
		
	}
 
	return false;
}
    
}
