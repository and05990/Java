import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

//Fatto da: @AndreaQuagliotti, @LetiziaRocchi, @GloriaMauraBerlinghieri

public class Main extends JFrame{
    public static void main(String[] args) {

        /*Progetto p1 = new Tecnico("Mario", "Rossi", 1, 2010, 40, true, true); //tecnico informatico interno
        Progetto p2 = new Tecnico("Luigi", "Verdi", 2, 2015, 40, false, true); //tecnico elettronico interno
        Progetto p3 = new Tecnico("Giovanni", "Bianchi", 3, 2018, 40, true, false); //tecnico informatico esterno
        Progetto p4 = new Tecnico("Giorgio", "Gialli", 4, 2010, 40, false, false); //tecnico elettronico esterno
        Progetto p5 = new Funzionario("Giuseppe", "Gialli", 5, 2010, 40); //funzionario senior
        Progetto p6 = new Funzionario("Giacomo", "Neri", 6, 2015, 40); //funzionario junior
        Progetto p7 = new Dirigente("Gianmarco", "Azzurri", 7, 2010, 40); //dirigente
        Progetto p8 = new Dirigente("Gianfranco", "Viola", 8, 2015, 40); //dirigente

        System.out.println("Stipendio di " + p1.getNome() + " " + p1.getCognome() + ": " + p1.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p2.getNome() + " " + p2.getCognome() + ": " + p2.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p3.getNome() + " " + p3.getCognome() + ": " + p3.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p4.getNome() + " " + p4.getCognome() + ": " + p4.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p5.getNome() + " " + p5.getCognome() + ": " + p5.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p6.getNome() + " " + p6.getCognome() + ": " + p6.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p7.getNome() + " " + p7.getCognome() + ": " + p7.calcolaStipendio() + "€");
        System.out.println("Stipendio di " + p8.getNome() + " " + p8.getCognome() + ": " + p8.calcolaStipendio() + "€") ;
        double costo_complessivo = p1.calcolaStipendio() + p2.calcolaStipendio() + p3.calcolaStipendio() + p4.calcolaStipendio() +
        p5.calcolaStipendio() + p6.calcolaStipendio() + p7.calcolaStipendio() + p8.calcolaStipendio();
        System.out.println("Costo complessivo del progetto: " + costo_complessivo + "€");*/

        Scanner input = new Scanner(System.in);
        ArrayList<Progetto> dipendenti = new ArrayList<>();
        /*int cod = 0;
        int scelta = 0;
        String nome, cognome;
        char operatore;
        int anno_inizio = 0, stipendio = 0;
        boolean interno = false, informatico = false, errore = true, trovato = false;
        double ore_lavoro = 0;*/

        /* scelta mi fa inserire il tipo di operazione, errore serve a far ciclare per inserire un valore corretto,
        trovato controlla che il dipendete sia presente nella lista, operatore serve per inserire il tipo di dipendente nel punto 8 tutte le altre variabili servono per definire un dipendente.*/

    /*   do{
            //lista delle operazioni
            System.out.println("--- Gestione dipendenti ---");
            System.out.println("1) Aggiungi nuovo dipendente");
            System.out.println("2) Licenzia dipendente");
            System.out.println("3) Stampa stipendio dipendente");
            System.out.println("4) Stampa costo complessivo");
            System.out.println("5) Stampa lista dipendenti");
            System.out.println("6) Salva su file");
            System.out.println("7) Carica da file");
            System.out.println("8) Modifica stipendio");
            System.out.println("0) Esci");

            System.out.println();
            System.out.print("Inserire numero dell'operazione: "); //input della scelta
            do{try{ //controllo che l'input sia un numero
                scelta = input.nextInt();
                errore = false;
            }catch(InputMismatchException e){
                System.out.print("Errore: Inserire un numero: ");
                input.nextLine();
            }}while(errore);

            errore = true;
            switch (scelta){
                case 1 -> { //chiedo che tipo di dipendente si vuole aggiungere
                    System.out.println("1) Tecnico");
                    System.out.println("2) Funzionario");
                    System.out.println("3) Dirigente");
                    System.out.println("99) Esci");

                    System.out.print("Inserire numero dell'operazione: ");
                    do{try{
                        scelta = input.nextInt();
                        errore = false;
                    }catch(InputMismatchException e){
                        System.out.print("Errore: Inserire un numero: ");
                        input.nextLine();
                    }}while(errore);

                    input.nextLine();
                    errore = true;

                    //inserisco i dati astratti
                    System.out.print("Inserire nome: ");
                    nome = input.next();

                    System.out.print("Inserire cognome: ");
                    cognome = input.next();

                    System.out.print("Inserire anno di inizio: ");
                    do{try{
                        anno_inizio = input.nextInt();
                        if(anno_inizio > 0)
                            errore = false;
                        else
                            System.out.print("Errore: Inserire un numero maggiore di 0: ");
                    }catch(Exception e){
                        System.out.print("Errore: Inserire un numero: ");
                        input.nextLine();
                    }}while(errore);
                    errore = true;

                    System.out.print("Inserire ore di lavoro: ");
                    do{try{
                        ore_lavoro = input.nextDouble();
                        if(ore_lavoro > 0)
                            errore = false;
                        else
                            System.out.print("Errore: Inserire un numero maggiore di 0: ");
                    }catch(Exception e){
                        System.out.print("Errore: Inserire un numero: ");
                        input.nextLine();
                    }}while(errore);
                    errore = true;
                    switch (scelta){
                        case 1 -> {
                            //chiedo se il dipendente è tecnico informatico/elettronico e se è interno o esterno
                            System.out.print("Inserire se è tecnico informatico/elettronico (true/false): ");
                            do{try{
                                informatico = input.nextBoolean();
                                errore = false;
                            }catch(Exception e){
                                System.out.print("Errore: Inserire (true/false): ");
                                input.nextLine();
                            }}while(errore);
                            errore = true;

                            System.out.print("Inserire se è interno (true/false): ");
                            do{try{
                                interno = input.nextBoolean();
                                errore = false;
                            }catch(Exception e){
                                System.out.print("Errore: Inserire un valore booleano (true/false): ");
                                input.nextLine();
                            }}while(errore);
                            errore = true;

                            dipendenti.add(new Tecnico(nome, cognome, cod, anno_inizio, ore_lavoro, interno, informatico));
                        }
                        case 2 -> {
                            dipendenti.add(new Funzionario(nome, cognome, cod, anno_inizio, ore_lavoro));
                        }
                        case 3 -> {
                            dipendenti.add(new Dirigente(nome, cognome, cod, anno_inizio, ore_lavoro));
                        }
                        default -> {
                            if(scelta != 99)
                                System.out.println("Errore: Inserire un numero tra 1 e 3 o 99 per uscire");
                        }
                    }
                    cod++; //incremento il codice del dipendente
                }
                case 2 -> {
                    input.nextLine();
                    if(dipendenti.size() == 0){ //controllo se la lista è vuota
                        System.out.println("Non ci sono dipendenti");
                    }else{
                        //inserisco i dati del dipendente da licenziare
                        System.out.print("Inserire nome del dipendente da licenziare: ");
                        nome = input.nextLine();
                        System.out.print("Inserire cognome del dipendente da licenziare: ");
                        cognome = input.nextLine();

                        for(int i = 0; i < dipendenti.size(); i++){ //cerco il dipendete
                            if(dipendenti.get(i).getNome().equals(nome) && dipendenti.get(i).getCognome().equals(cognome)){
                                dipendenti.remove(i); //lo rimuovo
                                trovato = true;
                                System.out.println("Dipendente licenziato");
                                break;
                            }
                        }
                        if(!trovato) //se non trovato stampo un messaggio di errore
                            System.out.println("Dipendente non trovato");

                        trovato = false;
                    }
                }
                case 3 -> {
                    if(dipendenti.size() == 0){ //controllo se la lista è vuota
                        System.out.println("Non ci sono dipendenti");
                    }else{
                        //inserisco i dati del dipendente da cercare
                        System.out.print("Inserire nome del dipendente da cercare: ");
                        nome = input.next();
                        System.out.print("Inserire cognome del dipendente da cercare: ");
                        cognome = input.next();

                        for (Progetto dipendente : dipendenti) { //cerco il dipendente
                            if (dipendente.getNome().equals(nome) && dipendente.getCognome().equals(cognome)) {
                                trovato = true; //se trovato stampo il suo stipendio
                                System.out.println("Stipendio di " + dipendente.getNome() + " " + dipendente.getCognome() + ": " + dipendente.calcolaStipendio() + "€");
                                break;
                            }
                        }
                        if(!trovato) //se non trovato stampo un messaggio di errore
                            System.out.println("Dipendente non trovato");

                        trovato = false;
                    }
                }
                case 4 -> {
                    if(dipendenti.size() == 0){ //controllo se la lista è vuota
                        System.out.println("Non ci sono dipendenti");
                    }else{
                        double costo_complessivo = 0; //stampo il costo complessivo
                        for (Progetto dipendente : dipendenti) {
                            System.out.println("Stipendio di " + dipendente.getNome() + " " + dipendente.getCognome() + ": " + dipendente.calcolaStipendio() + "€") ;
                            costo_complessivo += dipendente.getCosto();
                        }
                        System.out.println("Costo complessivo del progetto: " + costo_complessivo + "€");
                    }
                }
                case 5 -> {
                    if(dipendenti.size() == 0){ //controllo se la lista è vuota
                        System.out.println("Non ci sono dipendenti");
                    }else{
                        //stampo la lista dei dipendenti
                        for (Progetto dipendente : dipendenti) {
                            System.out.println(dipendente.toString());
                        }
                    }
                }
                case 6 -> {
                    try{
                        FileWriter fw = new FileWriter("dipendenti.txt");
                        BufferedWriter bw = new BufferedWriter(fw);

                        for (Progetto dipendente : dipendenti) {
                            bw.write(dipendente.toString());
                            bw.newLine();
                        }

                        bw.close();
                        fw.close();
                        System.out.println("File salvato");
                    }catch(Exception e){
                        System.out.println("Errore: File non salvato");
                    }
                }
                case 8 -> {
                    //chiedo a che tipo di dipendente voglio modificare lo stipendio
                    System.out.println("1) Tecnico");
                    System.out.println("2) Funzionario");
                    System.out.println("3) Dirigente");
                    System.out.println("99) Esci");

                    System.out.print("Inserire numero dell'operazione: ");
                    do{try{
                        scelta = input.nextInt();
                        errore = false;
                    }catch(InputMismatchException e){
                        System.out.print("Errore: Inserire un numero: ");
                        input.nextLine();
                    }}while(errore);
                    errore = true;
                    input.nextLine();

                    //inserimento nuovo stipendio
                    System.out.print("Inserire nuovo stipendio: ");
                    do{try{
                        stipendio = input.nextInt();
                        if (stipendio > 0)
                            errore = false;
                        else
                            System.out.print("Errore: Inserire un numero maggiore di 0: ");
                    }catch(InputMismatchException e){
                        System.out.print("Errore: Inserire(e/i): ");
                        input.nextLine();
                    }}while(errore);

                    switch (scelta) {
                        case 1 -> {
                            //chiedo se elettronico o informatico
                            System.out.print("Inserire(e/i): ");
                            operatore = input.next().charAt(0);

                            if(operatore == 'e')
                                Tecnico.setStipendio_elettronico(stipendio);
                            else if (operatore == 'i')
                                Tecnico.setStipendio_informatico(stipendio);
                            else
                                System.out.println("Errore: Tipo dipendente non valido");
                        }
                        case 2 -> {
                            //chiedo se junior o senior
                            System.out.print("Inserire(j/s): ");
                            operatore = input.next().charAt(0);

                            if(operatore == 'j')
                                Funzionario.setStipendio_junior(stipendio);
                            else if(operatore == 's')
                                Funzionario.setStipendio_senior(stipendio);
                            else
                                System.out.println("Errore: Tipo dipendente non valido");
                        }
                        case 3 -> {
                            Dirigente.setStipendio(stipendio);
                        }
                        default -> {
                            if(scelta != 99)
                                System.out.println("Errore: Inserire un numero tra 1 e 3 o 99 per uscire");
                        }
                    }
                }
                default -> {
                    if(scelta != 0)
                        System.out.println("Errore: Inserire un numero tra 1 a 5, 8 o 0 per uscire");
                }
            }

            System.out.println();
        }while(scelta != 0);*/


        //make a simple graphic interface with JFrame
        JFrame frame = new JFrame("Gestione dipendenti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        //frame.setResizable(false);

        //make a panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1000, 600);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        frame.add(panel);

        JLabel label = new JLabel("Gestione dipendenti");
        label.setBounds(450, 0, 200, 20);
        panel.add(label);



        //add a button to add a new dipendente
        JButton buttonAdd = new JButton("Aggiungi dipendente");
        //replace the setBounds with setSize and setLocation
        buttonAdd.setSize(200, 20);
        buttonAdd.setLocation(85, 20);
        panel.add(buttonAdd);

        //add a button to remove a dipendente
        JButton buttonRem = new JButton("Rimuovi dipendente");
        buttonRem.setSize(200, 20);
        buttonRem.setLocation(85, 50);
        panel.add(buttonRem);

        //add a button to change the salary of a dipendente
        JButton buttonChange = new JButton("Cambia stipendio");
        buttonChange.setSize(200, 20);
        buttonChange.setLocation(85, 80);
        panel.add(buttonChange);

        //add a table with three columns String, one Integer and two Double
        String[] columnNames = {"Codice", "Nome", "Cognome", "Anno di inizio", "Ruolo", "Interno/Esterno", "Ore di lavoro", "Stipendio(€)"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(300, 50, 600, 300);
        panel.add(scrollPane);

        JLabel labelName = new JLabel("Nome");
        labelName.setSize(50, 20);
        labelName.setLocation(10, 200);
        JTextField textFieldName = new JTextField();
        textFieldName.setSize(200, 20);
        textFieldName.setLocation(85, 200);

        JLabel labelSurname = new JLabel("Cognome");
        labelSurname.setSize(50, 20);
        labelSurname.setLocation(10, 230);
        JTextField textFieldSurname = new JTextField();
        textFieldSurname.setSize(200, 20);
        textFieldSurname.setLocation(85, 230);

        JLabel labelCodice = new JLabel("Codice");
        labelCodice.setSize(50, 20);
        labelCodice.setLocation(10, 260);
        JTextField textFieldCodice = new JTextField();
        textFieldCodice.setSize(200, 20);
        textFieldCodice.setLocation(85, 260);

        JLabel labelOre = new JLabel("Ore");
        labelOre.setSize(50, 20);
        labelOre.setLocation(10, 290);
        JTextField textFieldOre = new JTextField();
        textFieldOre.setSize(200, 20);
        textFieldOre.setLocation(85, 290);

        JLabel labelAnno = new JLabel("Anno di inizio");
        labelAnno.setSize(100, 20);
        labelAnno.setLocation(10, 320);
        JTextField textFieldAnno = new JTextField();
        textFieldAnno.setSize(200, 20);
        textFieldAnno.setLocation(85, 320);

        //make a menu to choose the type of the dipendente
        String[] type = {"Tecnico", "Funzionario", "Dirigente"};
        JComboBox<String> comboBoxTipo = new JComboBox<>(type);
        comboBoxTipo.setBounds(85, 370, 200, 20);

        //if type is Tecnico, make a menu to choose the type of the Tecnico (elettronico or informatico) and (interno or esterno)
        String[] typeTecnico = {"Elettronico", "Informatico"};
        JComboBox<String> comboBoxTecnico = new JComboBox<>(typeTecnico);
        comboBoxTecnico.setBounds(85, 400, 200, 20);

        String[] typeTecnico2 = {"Interno", "Esterno"};
        JComboBox<String> comboBoxTecnico2 = new JComboBox<>(typeTecnico2);
        comboBoxTecnico2.setBounds(85, 430, 200, 20);

        //add all the components to the frame
        panel.add(labelName);
        panel.add(textFieldName);
        panel.add(labelSurname);
        panel.add(textFieldSurname);
        panel.add(labelCodice);
        panel.add(textFieldCodice);
        panel.add(labelOre);
        panel.add(textFieldOre);
        panel.add(labelAnno);
        panel.add(textFieldAnno);
        panel.add(comboBoxTipo);
        panel.add(comboBoxTecnico);
        panel.add(comboBoxTecnico2);


        //if type Funzionario or Dirigente make the comboBoxTecnico and comboBoxTecnico2 invisible
        comboBoxTipo.addActionListener(e -> {
            if(comboBoxTipo.getSelectedIndex() == 0){
                comboBoxTecnico.setVisible(true);
                comboBoxTecnico2.setVisible(true);
            }else{
                comboBoxTecnico.setVisible(false);
                comboBoxTecnico2.setVisible(false);
            }
        });

        JLabel labelCost = new JLabel("Costo totale: ");
        labelCost.setText("Costo totale: 0");
        labelCost.setBounds(810, 350, 200, 20);
        frame.add(labelCost);
        //on click buttonAdd, fill the table with textField and comboBox data
        buttonAdd.addActionListener(e -> {
            try{
                String nome = textFieldName.getText();
                String cognome = textFieldSurname.getText();
                int cod = Integer.parseInt(textFieldCodice.getText());
                int anno_di_inizio = Integer.parseInt(textFieldAnno.getText());
                String ruolo = (String) comboBoxTipo.getSelectedItem();
                String tipo = (String) comboBoxTecnico.getSelectedItem();
                String interno = (String) comboBoxTecnico2.getSelectedItem();
                double ore = Double.parseDouble(textFieldOre.getText());

                if(cod < 0 || anno_di_inizio < 0 || ore < 0){
                    JOptionPane.showMessageDialog(null, "Errore: i campi Codice, Anno di inizio e Ore devono essere positivi");
                    return;
                }

                if(comboBoxTipo.getSelectedIndex() == 0){
                    Tecnico tecnico;
                    if(tipo.equals("Elettronico") && interno.equals("Interno")) {
                        tecnico = new Tecnico(nome, cognome, cod, anno_di_inizio, ore, false, true);
                    }else if(tipo.equals("Elettronico") && interno.equals("Esterno")) {
                        tecnico = new Tecnico(nome, cognome, cod, anno_di_inizio, ore, false, false);
                    }else if(tipo.equals("Informatico") && interno.equals("Interno")) {
                        tecnico = new Tecnico(nome, cognome, cod, anno_di_inizio, ore, true, true);
                    }else {
                        tecnico = new Tecnico(nome, cognome, cod, anno_di_inizio, ore, true, false);
                    }
                    dipendenti.add(tecnico);
                    tableModel.addRow(new Object[]{tecnico.getCodice(), tecnico.getNome(), tecnico.getCognome(), tecnico.getAnno_inizio(), ruolo + " " + tipo, interno, ore, tecnico.calcolaStipendio()});
                }else if(comboBoxTipo.getSelectedIndex() == 1){
                    Funzionario funzionario = new Funzionario(nome, cognome, cod, anno_di_inizio, ore);
                    tableModel.addRow(new Object[]{funzionario.getCodice(), funzionario.getNome(), funzionario.getCognome(), funzionario.getAnno_inizio(), ruolo, "Interno", ore, funzionario.calcolaStipendio()});
                    dipendenti.add(funzionario);
                }else if(comboBoxTipo.getSelectedIndex() == 2){
                    Dirigente dirigente = new Dirigente(nome, cognome, cod, anno_di_inizio, ore);
                    dipendenti.add(dirigente);
                    tableModel.addRow(new Object[]{dirigente.getCodice(), dirigente.getNome(), dirigente.getCognome(), dirigente.getAnno_inizio(), ruolo, "", ore, dirigente.calcolaStipendio()});
                }

                double cost = 0;
                for(Progetto dipendente : dipendenti){
                    cost += dipendente.calcolaStipendio();
                }
                labelCost.setText("Costo totale: " + cost);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Errore: i campi Codice, Anno di inizio e Ore devono essere numeri");
            }

        });

        //on click buttonDelete, delete the selected row
        buttonRem.addActionListener(e -> {
            int row = table.getSelectedRow();
            if(row >= 0){
                tableModel.removeRow(row);
            }
        });

        //on buttonChange, show a input dialog with combobox
        buttonChange.addActionListener(e -> {
            try{
                String[] type2 = {"Tecnico", "Funzionario", "Dirigente"};
                JComboBox<String> comboBox3 = new JComboBox<>(type2);
                comboBox3.setBounds(85, 400, 200, 20);
                JOptionPane.showMessageDialog(null, comboBox3, "Seleziona il ruolo", JOptionPane.QUESTION_MESSAGE);
                String ruolo = (String) comboBox3.getSelectedItem();

                //if type is Tecnico, make a menu to choose the type of the Tecnico (elettronico or informatico) and (interno or esterno)

                switch (Objects.requireNonNull(ruolo)) {
                    case "Tecnico" -> {
                        String[] tipoTecnico = {"Elettronico", "Informatico"};
                        JComboBox<String> cbTecnico = new JComboBox<>(tipoTecnico);
                        comboBoxTecnico.setBounds(85, 430, 200, 20);
                        JOptionPane.showMessageDialog(null, cbTecnico, "Seleziona il nuovo tipo", JOptionPane.QUESTION_MESSAGE);
                        String tipo = (String) cbTecnico.getSelectedItem();

                        //show input dialog for stipendio
                        int stipendio = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il nuovo stipendio"));
                        if (stipendio < 0) {
                            JOptionPane.showMessageDialog(null, "Errore: lo stipendio deve essere positivo");
                        }
                        //check if the type is elettronico or informatico
                        if (tipo.equals("Elettronico")) {
                            Tecnico.setStipendio_elettronico(stipendio);
                        } else {
                            Tecnico.setStipendio_informatico(stipendio);
                        }
                    }
                    case "Funzionario" -> {
                        String[] tipoFunzionario = {"Junior", "Senior"};
                        JComboBox<String> cbFunzionario = new JComboBox<>(tipoFunzionario);
                        comboBoxTecnico.setBounds(85, 430, 200, 20);
                        JOptionPane.showMessageDialog(null, cbFunzionario, "Seleziona il nuovo tipo", JOptionPane.QUESTION_MESSAGE);
                        String tipo = (String) cbFunzionario.getSelectedItem();
                        int stipendio = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il nuovo stipendio"));
                        if (stipendio < 0) {
                            JOptionPane.showMessageDialog(null, "Errore: lo stipendio deve essere positivo");
                        }
                        if (tipo.equals("Junior")) {
                            Funzionario.setStipendio_junior(stipendio);
                        } else {
                            Funzionario.setStipendio_senior(stipendio);
                        }
                    }
                    case "Dirigente" -> {
                        int stipendio = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il nuovo stipendio"));
                        if (stipendio < 0) {
                            JOptionPane.showMessageDialog(null, "Errore: lo stipendio deve essere positivo");
                        }
                        Dirigente.setStipendio(stipendio);
                    }
                    default -> JOptionPane.showMessageDialog(null, "Errore: seleziona un ruolo");
                }

                //update every row column 7 with the new stipendio
                for(int i = 0; i < tableModel.getRowCount(); i++){
                    tableModel.setValueAt(dipendenti.get(i).calcolaStipendio(), i, 7);
                }

                double cost = 0;
                for(Progetto dipendente : dipendenti){
                    cost += dipendente.calcolaStipendio();
                }
                labelCost.setText("Costo totale: " + cost);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Errore: lo stipendio deve essere un numero");
            }
        });
    }
}