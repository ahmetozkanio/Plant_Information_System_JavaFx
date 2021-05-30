package Modals;

import javafx.geometry.Pos;

public class Modeller {

		public Modeller() {
			// TODO Auto-generated constructor stub
		}
		private String id;
	    private String latinName;
	    private String turkishName;
	    private String buyumeFormu;
	    private String anavatani;
	    private String yetisitigiBolge;
	    private String ailesi;
	    private String notlar;
	    
	    private String sekli;
	    private String boyu;
	    private String capi;
	    private String dokusu;
	    private String habitusNotlar;
	    
	    private String cicekDurumu;
	    private String cicekBuyuklugu;
	    private String cicekKokusu;
	    private String cicekRengi;
	    private String ciceklenmeZamani;
	    private String cicekNotlar;
	    
	    private String yaprakDokme;
	    private String yaprakTipi;
	    private String yaprakSekli;
	    private String yaprakBuyuklugu;
	    private String yaprakKokusu;
	    private String yaprakDokusu;
	    private String yaprakRengi;
	    private String yaprakGuzRengi;
	    private String yaprakNotlar;
	    
	    private String meyvedurumu;
	    private String meyveTipi;
	    private String meyveBuyuklugu;
	    private String meyveRengi;
	    private String meyveYenilebilirligi;
	    private String meyveZamani;
	    
	    private String kirsalKullanimAlanlari;
	    private String kentselKullanimAlanlari;
	    private String digerKullanimAlanlari;
	    private String peyzajTarzi;
	    private String KullanimAlanlariNotlar;
	    
	    private String muhendislikIslevleri;
	    private String mimarlikIslevleri;
	    private String ekOzellikler;
	    
	    private String gunIsigiIstegi;
	    private String suIstegi;
	    private String besinGereksimi;
	    private String toprakIstegi;
	    private String toprakDrenaji;
	    
	    private String buyumeHizi;
	    private String bakimIhtiyaci;
	    private String zehirlilik;
	    private String uretimi;
	    
	    
	    
	    
	    
		public Modeller(String id, String latinName, String turkishName, String buyumeFormu, String anavatani,
				String yetisitigiBolge, String ailesi, String notlar, String sekli, String boyu, String capi,
				String dokusu, String habitusNotlar, String cicekDurumu, String cicekBuyuklugu, String cicekKokusu,
				String cicekRengi, String ciceklenmeZamani, String cicekNotlar, String yaprakDokme, String yaprakTipi,
				String yaprakSekli, String yaprakBuyuklugu, String yaprakKokusu, String yaprakDokusu,
				String yaprakRengi, String yaprakGuzRengi, String yaprakNotlar, String meyvedurumu, String meyveTipi,
				String meyveBuyuklugu, String meyveRengi, String meyveYenilebilirligi, String meyveZamani,
				String kirsalKullanimAlanlari, String kentselKullanimAlanlari, String digerKullanimAlanlari,
				String peyzajTarzi, String kullanimAlanlariNotlar, String muhendislikIslevleri,
				String mimarlikIslevleri, String ekOzellikler, String gunIsigiIstegi, String suIstegi,
				String besinGereksimi, String toprakIstegi, String toprakDrenaji, String buyumeHizi,
				String bakimIhtiyaci, String zehirlilik, String uretimi) {
			super();
			this.id = id;
			this.latinName = latinName;
			this.turkishName = turkishName;
			this.buyumeFormu = buyumeFormu;
			this.anavatani = anavatani;
			this.yetisitigiBolge = yetisitigiBolge;
			this.ailesi = ailesi;
			this.notlar = notlar;
			this.sekli = sekli;
			this.boyu = boyu;
			this.capi = capi;
			this.dokusu = dokusu;
			this.habitusNotlar = habitusNotlar;
			this.cicekDurumu = cicekDurumu;
			this.cicekBuyuklugu = cicekBuyuklugu;
			this.cicekKokusu = cicekKokusu;
			this.cicekRengi = cicekRengi;
			this.ciceklenmeZamani = ciceklenmeZamani;
			this.cicekNotlar = cicekNotlar;
			this.yaprakDokme = yaprakDokme;
			this.yaprakTipi = yaprakTipi;
			this.yaprakSekli = yaprakSekli;
			this.yaprakBuyuklugu = yaprakBuyuklugu;
			this.yaprakKokusu = yaprakKokusu;
			this.yaprakDokusu = yaprakDokusu;
			this.yaprakRengi = yaprakRengi;
			this.yaprakGuzRengi = yaprakGuzRengi;
			this.yaprakNotlar = yaprakNotlar;
			this.meyvedurumu = meyvedurumu;
			this.meyveTipi = meyveTipi;
			this.meyveBuyuklugu = meyveBuyuklugu;
			this.meyveRengi = meyveRengi;
			this.meyveYenilebilirligi = meyveYenilebilirligi;
			this.meyveZamani = meyveZamani;
			this.kirsalKullanimAlanlari = kirsalKullanimAlanlari;
			this.kentselKullanimAlanlari = kentselKullanimAlanlari;
			this.digerKullanimAlanlari = digerKullanimAlanlari;
			this.peyzajTarzi = peyzajTarzi;
			KullanimAlanlariNotlar = kullanimAlanlariNotlar;
			this.muhendislikIslevleri = muhendislikIslevleri;
			this.mimarlikIslevleri = mimarlikIslevleri;
			this.ekOzellikler = ekOzellikler;
			this.gunIsigiIstegi = gunIsigiIstegi;
			this.suIstegi = suIstegi;
			this.besinGereksimi = besinGereksimi;
			this.toprakIstegi = toprakIstegi;
			this.toprakDrenaji = toprakDrenaji;
			this.buyumeHizi = buyumeHizi;
			this.bakimIhtiyaci = bakimIhtiyaci;
			this.zehirlilik = zehirlilik;
			this.uretimi = uretimi;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLatinName() {
			return latinName;
		}
		public void setLatinName(String latinName) {
			this.latinName = latinName;
		}
		public String getTurkishName() {
			return turkishName;
		}
		public void setTurkishName(String turkishName) {
			this.turkishName = turkishName;
		}
		public String getBuyumeFormu() {
			return buyumeFormu;
		}
		public void setBuyumeFormu(String buyumeFormu) {
			this.buyumeFormu = buyumeFormu;
		}
		public String getAnavatani() {
			return anavatani;
		}
		public void setAnavatani(String anavatani) {
			this.anavatani = anavatani;
		}
		public String getYetisitigiBolge() {
			return yetisitigiBolge;
		}
		public void setYetisitigiBolge(String yetisitigiBolge) {
			this.yetisitigiBolge = yetisitigiBolge;
		}
		public String getAilesi() {
			return ailesi;
		}
		public void setAilesi(String ailesi) {
			this.ailesi = ailesi;
		}
		public String getNotlar() {
			return notlar;
		}
		public void setNotlar(String notlar) {
			this.notlar = notlar;
		}
		public String getSekli() {
			return sekli;
		}
		public void setSekli(String sekli) {
			this.sekli = sekli;
		}
		public String getBoyu() {
			return boyu;
		}
		public void setBoyu(String boyu) {
			this.boyu = boyu;
		}
		public String getCapi() {
			return capi;
		}
		public void setCapi(String capi) {
			this.capi = capi;
		}
		public String getDokusu() {
			return dokusu;
		}
		public void setDokusu(String dokusu) {
			this.dokusu = dokusu;
		}
		public String getHabitusNotlar() {
			return habitusNotlar;
		}
		public void setHabitusNotlar(String habitusNotlar) {
			this.habitusNotlar = habitusNotlar;
		}
		public String getCicekDurumu() {
			return cicekDurumu;
		}
		public void setCicekDurumu(String cicekDurumu) {
			this.cicekDurumu = cicekDurumu;
		}
		public String getCicekBuyuklugu() {
			return cicekBuyuklugu;
		}
		public void setCicekBuyuklugu(String cicekBuyuklugu) {
			this.cicekBuyuklugu = cicekBuyuklugu;
		}
		public String getCicekKokusu() {
			return cicekKokusu;
		}
		public void setCicekKokusu(String cicekKokusu) {
			this.cicekKokusu = cicekKokusu;
		}
		public String getCicekRengi() {
			return cicekRengi;
		}
		public void setCicekRengi(String cicekRengi) {
			this.cicekRengi = cicekRengi;
		}
		public String getCiceklenmeZamani() {
			return ciceklenmeZamani;
		}
		public void setCiceklenmeZamani(String ciceklenmeZamani) {
			this.ciceklenmeZamani = ciceklenmeZamani;
		}
		public String getCicekNotlar() {
			return cicekNotlar;
		}
		public void setCicekNotlar(String cicekNotlar) {
			this.cicekNotlar = cicekNotlar;
		}
		public String getYaprakDokme() {
			return yaprakDokme;
		}
		public void setYaprakDokme(String yaprakDokme) {
			this.yaprakDokme = yaprakDokme;
		}
		public String getYaprakTipi() {
			return yaprakTipi;
		}
		public void setYaprakTipi(String yaprakTipi) {
			this.yaprakTipi = yaprakTipi;
		}
		public String getYaprakSekli() {
			return yaprakSekli;
		}
		public void setYaprakSekli(String yaprakSekli) {
			this.yaprakSekli = yaprakSekli;
		}
		public String getYaprakBuyuklugu() {
			return yaprakBuyuklugu;
		}
		public void setYaprakBuyuklugu(String yaprakBuyuklugu) {
			this.yaprakBuyuklugu = yaprakBuyuklugu;
		}
		public String getYaprakKokusu() {
			return yaprakKokusu;
		}
		public void setYaprakKokusu(String yaprakKokusu) {
			this.yaprakKokusu = yaprakKokusu;
		}
		public String getYaprakDokusu() {
			return yaprakDokusu;
		}
		public void setYaprakDokusu(String yaprakDokusu) {
			this.yaprakDokusu = yaprakDokusu;
		}
		public String getYaprakRengi() {
			return yaprakRengi;
		}
		public void setYaprakRengi(String yaprakRengi) {
			this.yaprakRengi = yaprakRengi;
		}
		public String getYaprakGuzRengi() {
			return yaprakGuzRengi;
		}
		public void setYaprakGuzRengi(String yaprakGuzRengi) {
			this.yaprakGuzRengi = yaprakGuzRengi;
		}
		public String getYaprakNotlar() {
			return yaprakNotlar;
		}
		public void setYaprakNotlar(String yaprakNotlar) {
			this.yaprakNotlar = yaprakNotlar;
		}
		public String getMeyvedurumu() {
			return meyvedurumu;
		}
		public void setMeyvedurumu(String meyvedurumu) {
			this.meyvedurumu = meyvedurumu;
		}
		public String getMeyveTipi() {
			return meyveTipi;
		}
		public void setMeyveTipi(String meyveTipi) {
			this.meyveTipi = meyveTipi;
		}
		public String getMeyveBuyuklugu() {
			return meyveBuyuklugu;
		}
		public void setMeyveBuyuklugu(String meyveBuyuklugu) {
			this.meyveBuyuklugu = meyveBuyuklugu;
		}
		public String getMeyveRengi() {
			return meyveRengi;
		}
		public void setMeyveRengi(String meyveRengi) {
			this.meyveRengi = meyveRengi;
		}
		public String getMeyveYenilebilirligi() {
			return meyveYenilebilirligi;
		}
		public void setMeyveYenilebilirligi(String meyveYenilebilirligi) {
			this.meyveYenilebilirligi = meyveYenilebilirligi;
		}
		public String getMeyveZamani() {
			return meyveZamani;
		}
		public void setMeyveZamani(String meyveZamani) {
			this.meyveZamani = meyveZamani;
		}
		public String getKirsalKullanimAlanlari() {
			return kirsalKullanimAlanlari;
		}
		public void setKirsalKullanimAlanlari(String kirsalKullanimAlanlari) {
			this.kirsalKullanimAlanlari = kirsalKullanimAlanlari;
		}
		public String getKentselKullanimAlanlari() {
			return kentselKullanimAlanlari;
		}
		public void setKentselKullanimAlanlari(String kentselKullanimAlanlari) {
			this.kentselKullanimAlanlari = kentselKullanimAlanlari;
		}
		public String getDigerKullanimAlanlari() {
			return digerKullanimAlanlari;
		}
		public void setDigerKullanimAlanlari(String digerKullanimAlanlari) {
			this.digerKullanimAlanlari = digerKullanimAlanlari;
		}
		public String getPeyzajTarzi() {
			return peyzajTarzi;
		}
		public void setPeyzajTarzi(String peyzajTarzi) {
			this.peyzajTarzi = peyzajTarzi;
		}
		public String getKullanimAlanlariNotlar() {
			return KullanimAlanlariNotlar;
		}
		public void setKullanimAlanlariNotlar(String kullanimAlanlariNotlar) {
			KullanimAlanlariNotlar = kullanimAlanlariNotlar;
		}
		public String getMuhendislikIslevleri() {
			return muhendislikIslevleri;
		}
		public void setMuhendislikIslevleri(String muhendislikIslevleri) {
			this.muhendislikIslevleri = muhendislikIslevleri;
		}
		public String getMimarlikIslevleri() {
			return mimarlikIslevleri;
		}
		public void setMimarlikIslevleri(String mimarlikIslevleri) {
			this.mimarlikIslevleri = mimarlikIslevleri;
		}
		public String getEkOzellikler() {
			return ekOzellikler;
		}
		public void setEkOzellikler(String ekOzellikler) {
			this.ekOzellikler = ekOzellikler;
		}
		public String getGunIsigiIstegi() {
			return gunIsigiIstegi;
		}
		public void setGunIsigiIstegi(String gunIsigiIstegi) {
			this.gunIsigiIstegi = gunIsigiIstegi;
		}
		public String getSuIstegi() {
			return suIstegi;
		}
		public void setSuIstegi(String suIstegi) {
			this.suIstegi = suIstegi;
		}
		public String getBesinGereksimi() {
			return besinGereksimi;
		}
		public void setBesinGereksimi(String besinGereksimi) {
			this.besinGereksimi = besinGereksimi;
		}
		public String getToprakIstegi() {
			return toprakIstegi;
		}
		public void setToprakIstegi(String toprakIstegi) {
			this.toprakIstegi = toprakIstegi;
		}
		public String getToprakDrenaji() {
			return toprakDrenaji;
		}
		public void setToprakDrenaji(String toprakDrenaji) {
			this.toprakDrenaji = toprakDrenaji;
		}
		public String getBuyumeHizi() {
			return buyumeHizi;
		}
		public void setBuyumeHizi(String buyumeHizi) {
			this.buyumeHizi = buyumeHizi;
		}
		public String getBakimIhtiyaci() {
			return bakimIhtiyaci;
		}
		public void setBakimIhtiyaci(String bakimIhtiyaci) {
			this.bakimIhtiyaci = bakimIhtiyaci;
		}
		public String getZehirlilik() {
			return zehirlilik;
		}
		public void setZehirlilik(String zehirlilik) {
			this.zehirlilik = zehirlilik;
		}
		public String getUretimi() {
			return uretimi;
		}
		public void setUretimi(String uretimi) {
			this.uretimi = uretimi;
		}
	    
	    
}
