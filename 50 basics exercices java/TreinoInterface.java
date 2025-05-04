import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanoOperadora {
    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("Minha Interface Gráfica");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Campo de texto
        JTextField campoTexto = new JTextField(20);

        // Botão
        JButton botao = new JButton("Clique aqui");

        // Rótulo para exibir mensagem
        JLabel rotulo = new JLabel("Digite algo acima e clique no botão.");

        // Ação do botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoTexto.getText();
                rotulo.setText("Você digitou: " + texto);
            }
        });

        // Adicionando componentes na janela
        frame.add(new JLabel("Digite seu nome:"));
        frame.add(campoTexto);
        frame.add(botao);
        frame.add(rotulo);

        // Exibindo a janela
        frame.setVisible(true);
    }
}
