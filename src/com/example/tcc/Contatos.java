package com.example.tcc;


import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.Button;


public class Contatos extends Activity   implements OnClickListener {
	//public static String url2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contatos);
		
	String it = this.getIntent().getStringExtra("infos");
	
	 
	final String s[] = it.split("§"); 
	//System.out.println(s[0]);
	MontaContatos(s[0], s[1],s[2], s[3], Integer.parseInt(s[4])  );
	
	
	
	
	EditText conFace  = (EditText) findViewById(R.id.conFace);		 
	conFace.setOnClickListener(new View.OnClickListener() {  			  
        public void onClick(View v) {  
        	System.out.println(s[0]);
        	//chamarBrowser();  
        	//chamarBrowser(s[0]);  
        }
        
       /* public void chamarBrowser() { // da erro 
    		
   		// url2 ="200.132.38.214:8000";
   		
   		Log.d(TAG_NAME, "Recuperando componentes...");
        meuSiteWV = (WebView) findViewById(R.layout.visualizar);
        Log.d(TAG_NAME, "Carregando web-site...");
        meuSiteWV.getSettings().setJavaScriptEnabled(true);
        meuSiteWV.loadUrl("http://www.thiagovespa.com.br");
        Log.d(TAG_NAME, "Acabou!");
   		
   		
   	} */ 
         
    });  
	
	EditText conTwitter  = (EditText) findViewById(R.id.conTwitter);		 
	conTwitter.setOnClickListener(new View.OnClickListener() {  			  
        public void onClick(View v) {  
        //	chamarBrowser(s[1]);  
        }
        
    });  
	
	EditText conGmail  = (EditText) findViewById(R.id.conGmail);		 
	conGmail.setOnClickListener(new View.OnClickListener() {  			  
        public void onClick(View v) {  
        	//chamarBrowser(s[2]);  
        }
        
    });  
	

	EditText conLinkedin  = (EditText) findViewById(R.id.conLinkedin);		 
	conLinkedin.setOnClickListener(new View.OnClickListener() {  			  
        public void onClick(View v) {  
        	//chamarBrowser(s[3]);  
        }
          
    }); 
	
		
	}
	
	 public void MontaContatos(String face, String twiter,String gmais, String link,int imagem){
		
		// função utlizada para alterar o texto dos botões;
		EditText conFace  = (EditText) findViewById(R.id.conFace);	CharSequence text=face;	conFace.setText(text);
		EditText conGmais  = (EditText) findViewById(R.id.conGmail);	 text=gmais;	conGmais.setText(text);
		EditText conTwitter  = (EditText) findViewById(R.id.conTwitter);	 text=twiter;	conTwitter.setText(text);
		EditText confLink  = (EditText) findViewById(R.id.conLinkedin);	 text=link;	confLink.setText(text);
		ImageView confImg  = (ImageView) findViewById(R.id.imgAll);	
		//if (imagem == "bar"){
		//getAndroidDrawable(confImg);	
		/*
		 * 
		 * Drawable d = getResources().getDrawable(android.R.drawable.ic_dialog_email);
    ImageView image = (ImageView)findViewById(R.id.image);
    image.setImageDrawable(d);
		 */ 
		System.out.println(imagem);
		System.out.println(R.drawable.barbaratransp);
		confImg.setImageResource(imagem);
		
				
		
		//} 
	} 
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	 
	
	
	
	
	
	
}
