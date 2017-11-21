import javax.swing.*;
import java.awt.*;

public class LayoutPro extends JFrame  
{
    private JLabel lb_peso;
    private JLabel lb_planeta;
    private JTextField tf_peso;
    private JLabel lb_res;
    private JTextField tf_mostraRes;
    private JRadioButton rb_merc;
    private JRadioButton rb_ven;
    private JRadioButton rb_mar;
    private JRadioButton rb_jup;
    private JRadioButton rb_sat;
    private JRadioButton rb_ura;

    public LayoutPro(){
        
        super("Calcule seu peso! - Abel Pinheiro e Matheus Gomes");
        lb_peso = new JLabel("Peso:");
        lb_planeta = new JLabel("Planeta: ");
        tf_peso = new JTextField("0.0",2);
        lb_res = new JLabel("Resultado:                                 ");
        
        //instanciaçao e modificaçao do tf_field mostraRes
        tf_mostraRes = new JTextField("", 8);
        tf_mostraRes.setEditable(false);
        Font fonte = new Font("Arial",Font.PLAIN,30);
        tf_mostraRes.setFont(fonte);
        tf_mostraRes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        //instanciçao dos radiobuttons
        rb_merc = new JRadioButton("Mercurio");
        rb_ven = new JRadioButton("Venus");
        rb_mar = new JRadioButton("Marte");
        rb_jup = new JRadioButton("Jupiter");
        rb_sat = new JRadioButton("Saturno");
        rb_ura = new JRadioButton("Urano");
        
        //adiçao das açoes nos textsfields e radiobuttons
        
        //modificação da cor dos radio buttons
        rb_merc.setBackground(Color.GRAY);
        rb_ven.setBackground(Color.GRAY);
        rb_mar.setBackground(Color.GRAY);
        rb_jup.setBackground(Color.GRAY);
        rb_sat.setBackground(Color.GRAY);
        rb_ura.setBackground(Color.GRAY);
        
        //modificação do layout do frame
        this.setLayout(new BorderLayout());
        
        //criacao do painel norte
        Panel norte = new Panel();
        norte.setLayout(new BorderLayout());
        norte.add("West",lb_peso);
        
        //emcpsulmento de tf_Peso para reduçao do tamanho e adicao do painel peso ao painel norte
        Panel peso = new Panel();
        peso.setLayout(new BorderLayout());
        peso.add("East",new Panel());
        peso.add("Center",tf_peso);
        peso.add("West",new Panel());
        peso.add("North",new Panel());
        peso.add("South",new Panel());
        norte.add("Center",peso);
        
        //importaçao do gif e adiçao e ajuste de espaço do gif dentro do painel norte
        ImageIcon terra = new ImageIcon("planeta.gif");
        JLabel ter1 = new JLabel(terra);
        Panel ter2 = new Panel();
        ter2.setLayout(new GridLayout(1,2));
        ter2.add(ter1);
        ter2.add(new Panel());
        norte.add("East",ter2);
        
        //espaço entre a barra de título e o Frame
        norte.add("North",new Panel());
        
        
        //espaçamento entre os componentes presentes na regiao norte do border layout e
        //as regiões sul,centro leste e oeste
        Panel achatamento = new Panel();
        achatamento.setLayout(new BoxLayout(achatamento, BoxLayout.Y_AXIS));
        achatamento.add(new Panel());
        achatamento.add(new Panel());
        achatamento.add(new Panel());
        norte.add("South",achatamento);
        
        //adiçao do painel norte ao layoute do frame
        this.add("North", norte);
        
        //criaçao do painel oeste
        Panel oeste = new Panel();
        oeste.setLayout(new BoxLayout(oeste, BoxLayout.Y_AXIS));
        
        //ediçao do label planeta com espaçamento 
        Panel plane = new Panel();
        plane.setLayout(new GridLayout(1,2));
        plane.add(lb_planeta);
        plane.add(new Panel());
        oeste.add(plane);
        
        //instanciçao dos paineis onde ficam cada radio button
        Panel mercurio = new Panel();
        Panel venus = new Panel();
        Panel marte = new Panel();
        Panel jupiter = new Panel();
        Panel saturno = new Panel();
        Panel urano  = new Panel();
        
        //tratamento de cada panel em que o radiobutton mercurio se encontra
        mercurio.setLayout(new BorderLayout());
        mercurio.add("Center",rb_merc);
        mercurio.add("North",new Panel());
        mercurio.add("South",new Panel());
        mercurio.add("East",new Panel());
        
        //tratamento de cada panel em que o radiobutton venus se encontra
        venus.setLayout(new BorderLayout());
        venus.add("Center",rb_ven);
        venus.add("North",new Panel());
        venus.add("South",new Panel());
        venus.add("East",new Panel());
        
        //tratamento de cada panel em que o radiobutton jupiter se encontra
        jupiter.setLayout(new BorderLayout());
        jupiter.add("Center",rb_jup);
        jupiter.add("North",new Panel());
        jupiter.add("South",new Panel());
        jupiter.add("East",new Panel());
        
        //tratamento de cada panel em que o radiobutton martes se encontra
        saturno.setLayout(new BorderLayout());
        saturno.add("Center",rb_sat);
        saturno.add("North",new Panel());
        saturno.add("South",new Panel());
        saturno.add("East",new Panel());
        
        //tratamento de cada panel em que o radiobutton urano se encontra
        marte.setLayout(new BorderLayout());
        marte.add("Center",rb_mar);
        marte.add("North",new Panel());
        marte.add("South",new Panel());
        marte.add("East",new Panel());
        
        //tratamento de cada panel em que o radiobutton mercurio se encontra
        urano.setLayout(new BorderLayout());
        urano.add("Center",rb_ura);
        urano.add("North",new Panel());
        urano.add("South",new Panel());
        urano.add("East",new Panel());
        
        //adiçao dos panels de cada radiobutton ao painel oeste
        oeste.add(mercurio);
        oeste.add(saturno);
        oeste.add(venus);
        oeste.add(jupiter);
        oeste.add(urano);
        oeste.add(marte);
        
        //adiçao do painel oeste ao frame 
        this.add("West", oeste);
        
        //criacao do painel leste
        Panel leste1 = new Panel();
        leste1.setLayout(new BoxLayout(leste1, BoxLayout.Y_AXIS));
        
        //achatamento dos componentes  do painel leste para baixo
        leste1.add(new Panel());
        leste1.add(new Panel());
        leste1.add(new Panel());
        leste1.add(new Panel());
        
        //adicao da label resultado e da tx field resultado
        leste1.add(lb_res);
        leste1.add(tf_mostraRes);
        
        //achatamento dos componentes  do painel leste para cima
        leste1.add(new Panel());
        leste1.add(new Panel());
        leste1.add(new Panel());
        leste1.add(new Panel());
        leste1.add(new Panel());
        
        //configuraçao do frame
        this.getContentPane().setBackground(Color.GRAY);
        this.add("East", leste1);
        this.setSize(400,400);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    //Os metodos get tem a funçao de estabelecer uma comunicaçao entre o objeto layout e o  oobjjeto PesoPlaneta
    public JTextField getTfpeso(){return tf_peso;}
    public JTextField getTfmostraRes(){return tf_mostraRes;}
    public JRadioButton getRbmerc(){return rb_merc;}
    public JRadioButton getRbven(){return rb_ven;}
    public JRadioButton getRbmar(){return rb_mar;}
    public JRadioButton getRbjup(){return rb_jup;}
    public JRadioButton getRbsat(){return rb_sat;}
    public JRadioButton getRbura(){return rb_ura;}
}