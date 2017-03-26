package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main extends JFrame implements ActionListener{
	
	JButton bLosuj,bWyjscie;
	JLabel numer1,numer2,numer3,numer4,numer5,numer6,Napis,typ,proby,kasa,blad,p0,p1,p2,p3,p4,p5,p6;
	JTextField t1,t2,t3,t4,t5,t6;
	int z,i0=0,i1=0,i2=0,i3=0,i4=0,i5=0,i6=0,p;
	
	public Main(){
		
		setSize(650,800);
		setTitle("Lotto");
		setLayout(null);
		
		bLosuj = new JButton("Losuj");
		bLosuj.setBounds(200,250,200,80);		
		add(bLosuj);
		bLosuj.addActionListener(this);
		
		Napis = new JLabel("Numerki na dziœ:");
		Napis.setBounds(140,80,500,80);
		Napis.setForeground(new Color(150,150,150));
		Napis.setFont(new Font("Sans Serif",Font.BOLD,30));	
		add(Napis);	
		
		typ = new JLabel("Twój typ:");
		typ.setBounds(50,20,500,80);
		typ.setForeground(new Color(150,150,150));
		typ.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(typ);	
		
		numer1 = new JLabel("_");
		numer1.setBounds(100,150,200,80);
		numer1.setForeground(new Color(30,80,100));
		numer1.setFont(new Font("Sans Serif",Font.BOLD,40));	
		add(numer1);	
		
		numer2 = new JLabel("_");
		numer2.setBounds(180,150,80,80);
		numer2.setForeground(new Color(30,80,100));
		numer2.setFont(new Font("Sans Serif",Font.BOLD,40));	
		add(numer2);
		
		numer3 = new JLabel("_");
		numer3.setBounds(260,150,80,80);
		numer3.setForeground(new Color(30,80,100));
		numer3.setFont(new Font("Sans Serif",Font.BOLD,40));	
		add(numer3);
		
		numer4 = new JLabel("_");
		numer4.setBounds(340,150,80,80);
		numer4.setForeground(new Color(30,80,100));
		numer4.setFont(new Font("Sans Serif",Font.BOLD,40));	
		add(numer4);
		
		numer5 = new JLabel("_");
		numer5.setBounds(420,150,80,80);
		numer5.setForeground(new Color(30,80,100));
		numer5.setFont(new Font("Sans Serif",Font.BOLD,40));	
		add(numer5);
		
		numer6 = new JLabel("_");
		numer6.setBounds(500,150,80,80);
		numer6.setForeground(new Color(30,80,100));
		numer6.setFont(new Font("Sans Serif",Font.BOLD,40));	
		add(numer6);
		
		bWyjscie = new JButton("Wyjœcie");
		bWyjscie.setBounds(200,350,200,40);
		add(bWyjscie);
		bWyjscie.addActionListener(this);
		
		t1 = new JTextField();
		t1.setBounds(150,45,30,30);
		add(t1);
		t2 = new JTextField();
		t2.setBounds(190,45,30,30);
		add(t2);
		t3 = new JTextField();
		t3.setBounds(230,45,30,30);
		add(t3);
		t4 = new JTextField();
		t4.setBounds(270,45,30,30);
		add(t4);
		t5 = new JTextField();
		t5.setBounds(310,45,30,30);
		add(t5);
		t6 = new JTextField();
		t6.setBounds(350,45,30,30);
		add(t6);
		
		proby = new JLabel("iloœæ prób: "+z);
		proby.setBounds(100,400,200,80);
		proby.setForeground(new Color(30,80,100));
		proby.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(proby);
		
		kasa = new JLabel("Na kupony wyda³byœ ju¿: "+z*3+"z³");
		kasa.setBounds(100,450,400,80);
		kasa.setForeground(new Color(30,80,100));
		kasa.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(kasa);
		
		blad= new JLabel();
		blad.setBounds(50,500,500,80);
		blad.setForeground(new Color(250,0,0));
		blad.setFont(new Font("Sans Serif",Font.BOLD,15));	
		add(blad);
		
		p0 = new JLabel("brak trafieñ: "+i0);
		p0.setBounds(100,520,300,80);
		p0.setForeground(new Color(30,80,100));
		p0.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p0);
		
		p1 = new JLabel("Trafionych jedynek: "+i1);
		p1.setBounds(100,540,300,80);
		p1.setForeground(new Color(30,80,100));
		p1.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p1);
		
		p2 = new JLabel("Trafionych dwójek: "+i1);
		p2.setBounds(100,560,300,80);
		p2.setForeground(new Color(30,80,100));
		p2.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p2);
		
		p3 = new JLabel("Trafionych trójek: "+i3);
		p3.setBounds(100,580,300,80);
		p3.setForeground(new Color(30,80,100));
		p3.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p3);
		
		p4 = new JLabel("Trafionych czwórek: "+i4);
		p4.setBounds(100,600,300,80);
		p4.setForeground(new Color(30,80,100));
		p4.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p4);
		
		p5 = new JLabel("Trafionych pi¹tek: "+i5);
		p5.setBounds(100,620,300,80);
		p5.setForeground(new Color(30,80,100));
		p5.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p5);
		
		p6 = new JLabel("Trafionych szóstek: "+i6);
		p6.setBounds(100,640,300,80);
		p6.setForeground(new Color(30,80,100));
		p6.setFont(new Font("Sans Serif",Font.BOLD,20));	
		add(p6);
		
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, InterruptedException{
		
		Main okno = new Main();
		//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);		
		
		//while(true){
			//okno.repaint();
			
			//Thread.sleep(10);
		//}
	}
public void actionPerformed(ActionEvent e){
		
		Object x = e.getSource();
		
		if (x == bLosuj){
			
			if((Double.parseDouble(t1.getText())<50 && Double.parseDouble(t2.getText())>0) && (Double.parseDouble(t2.getText())<50 && Double.parseDouble(t1.getText())>0) && (Double.parseDouble(t3.getText())<50 && Double.parseDouble(t3.getText())>0) &&(Double.parseDouble(t4.getText())<50 && Double.parseDouble(t4.getText())>0) &&(Double.parseDouble(t5.getText())<50 && Double.parseDouble(t5.getText())>0) &&(Double.parseDouble(t6.getText())<50 && Double.parseDouble(t6.getText())>0)){
			z++;
			blad.setText("");
			
			kasa.setText("Na kupony wyda³byœ ju¿: "+String.valueOf(z*3)+" z³");	
			proby.setText("iloœæ prób: "+String.valueOf(z));	

			int[] tab = new int[6];
					
			tab = Los.cyfra();
			
			p=0;
			porownaj(tab[0],1);
			porownaj(tab[1],2);
			porownaj(tab[2],3);
			porownaj(tab[3],4);
			porownaj(tab[4],5);
			porownaj(tab[5],6);
			switch (p) {
			
			case 0:
				i0++;
				p0.setText(String.valueOf("brak trafieñ: "+i0));
				break;
			case 1:
				i1++;
				p1.setText(String.valueOf("Trafionych jedynek: "+i1));
				break;
			case 2:
				i2++;
				p2.setText(String.valueOf("Trafionych dwójek: "+i2));
				break;
			case 3:
				i3++;
				p3.setText(String.valueOf("Trafionych trójek: "+i3));
				break;
			case 4:
				i4++;
				p4.setText(String.valueOf("Trafionych czwórek: "+i4));
				break;
			case 5:
				i5++;
				p5.setText(String.valueOf("Trafionych pi¹tek: "+i5));
				break;
			case 6:
				i6++;
				p6.setText(String.valueOf("Trafionych szóstek: "+i6));
				break;
			}
			}
			else
			{
				blad.setText("B³êdnie wpisa³eœ dane. Wpisz liczby z przedzia³u od 1 do 49");	
			}
		
			
		}else if (x == bWyjscie){
			dispose();
		}
	}
private void porownaj(int x,int i) {
	
	try{
	if(x==Double.parseDouble(t1.getText()) || x==Double.parseDouble(t2.getText())|| x==Double.parseDouble(t3.getText())|| x==Double.parseDouble(t4.getText())|| x==Double.parseDouble(t5.getText())|| x==Double.parseDouble(t6.getText())){
			switch (i) {
		
		case 1:
			numer1.setForeground(new Color(0,250,0));
			//------------------------
			
			//for(int odl=0; odl<=x;odl++)
			//{
			//	numer1.setText(String.valueOf(odl));
			//}
			//-----------------------
			numer1.setText(String.valueOf(x));	
			break;	
		case 2:		
			numer2.setForeground(new Color(0,250,0));
			numer2.setText(String.valueOf(x));	
			break;		
		case 3:	
			numer3.setForeground(new Color(0,250,0));
			numer3.setText(String.valueOf(x));	
			break;	
		case 4:			
			numer4.setForeground(new Color(0,250,0));
			numer4.setText(String.valueOf(x));	
			break;
		case 5:	
			numer5.setForeground(new Color(0,250,0));
			numer5.setText(String.valueOf(x));
			break;
		case 6:	
			numer6.setForeground(new Color(0,250,0));
			numer6.setText(String.valueOf(x));	
			break;
			}
			
			p++;
			
			
	}else {
		switch (i) {
		
		case 1:
			numer1.setForeground(new Color(30,80,100));
//--        //----------------------
			
		//	for(int odl=0; odl<=x;odl++)
		//	{
		//		numer1.setText(String.valueOf(odl));
		//	}
			//-----------------------
			numer1.setText(String.valueOf(x));	
			break;	
		case 2:		
			numer2.setForeground(new Color(30,80,100));
			numer2.setText(String.valueOf(x));	
			break;		
		case 3:	
			numer3.setForeground(new Color(30,80,100));
			numer3.setText(String.valueOf(x));	
			break;	
		case 4:			
			numer4.setForeground(new Color(30,80,100));
			numer4.setText(String.valueOf(x));	
			break;
		case 5:	
			numer5.setForeground(new Color(30,80,100));
			numer5.setText(String.valueOf(x));	
			break;
		case 6:	
			numer6.setForeground(new Color(30,80,100));
			numer6.setText(String.valueOf(x));	
			break;
			}
	}
	
	}catch(Exception e){	
		blad.setText("B³êdnie wpisa³eœ dane. Wpisz liczby z przedzia³u od 1 do 49");	
	}
}	
}
	


