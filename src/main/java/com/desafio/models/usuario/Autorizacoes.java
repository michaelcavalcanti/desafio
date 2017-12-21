package com.desafio.models.usuario;

public class Autorizacoes {

	private boolean web, desktop, mobile;
	private boolean pdf, doc, txt, img;

	public Autorizacoes(boolean web, boolean desktop, boolean mobile,
			boolean pdf, boolean doc, boolean txt, boolean img){
		setWeb(web);
		setWeb(desktop);
		setWeb(mobile);
		setWeb(pdf);
		setWeb(doc);
		setWeb(txt);
		setWeb(img);
	}

	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public boolean isDesktop() {
		return desktop;
	}
	public void setDesktop(boolean desktop) {
		this.desktop = desktop;
	}
	public boolean isMobile() {
		return mobile;
	}
	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}
	public boolean isPdf() {
		return pdf;
	}
	public void setPdf(boolean pdf) {
		this.pdf = pdf;
	}
	public boolean isDoc() {
		return doc;
	}
	public void setDoc(boolean doc) {
		this.doc = doc;
	}
	public boolean isTxt() {
		return txt;
	}
	public void setTxt(boolean txt) {
		this.txt = txt;
	}
	public boolean isImg() {
		return img;
	}
	public void setImg(boolean img) {
		this.img = img;
	}
}
