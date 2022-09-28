

import java.awt.*;

import javax.swing.*;



/**

 * <p> Заголовок: Демо вкладки </p>

 * <p> Описание: это демонстрационная вкладка. Нажмите на разные карточки, чтобы отобразить разный контент </p>

 */



public class JTabbedPaneDemo1 extends JPanel {



    public JTabbedPaneDemo1() {

        super(new GridLayout(1, 1));



        ImageIcon icon = createImageIcon("images/MyIcon.gif");

        JTabbedPane tabbedPane = new JTabbedPane();



        Component panel1 = makeTextPanel("#       #");

        tabbedPane.addTab("One", icon, panel1, "s");

        tabbedPane.setSelectedIndex(0);



        Component panel2 = makeTextPanel("##       ##");

        tabbedPane.addTab("Two", icon, panel2,"s2");



        Component panel3 = makeTextPanel("###     ###");

        tabbedPane.addTab("Three", icon, panel3, "s3");



        Component panel4 = makeTextPanel("####     ####");

        tabbedPane.addTab("Four", icon, panel4, "s4");



        // добавляем вкладку в панель

        add(tabbedPane);

    }



    /**

     * <br>

     * Описание метода: добавить информацию во вкладку <br>

     * Входной параметр: содержание информации, отображаемой в виде строкового текста <br>

     * Тип возврата: объект-член компонента

     */

    protected Component makeTextPanel(String text) {

        JPanel panel = new JPanel(false);

        JLabel filler = new JLabel(text);

        filler.setHorizontalAlignment(JLabel.CENTER);

        panel.setLayout(new GridLayout(1, 1));

        panel.add(filler);

        return panel;

    }



    /**

     * <br>

     * Описание метода: получить изображения <br>

     * Входной параметр: String path Путь к картинке <br>

     * Тип возврата: объект изображения ImageIcon

     */

    protected static ImageIcon createImageIcon(String path) {

        // java.net.URL imgURL = TabbedPaneDemo.class.getResource(path);

        if (path != null) {

            return new ImageIcon(path);

        } else {

            System.out.println("Couldn't find file: " + path);

            return null;

        }

    }



    public static void main(String[] args) {

        // Используем описание формы Swing

        // JFrame.setDefaultLookAndFeelDecorated(true);



        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception e) {



        }

        // Создаем форму

        JFrame frame = new JFrame("TabbedPaneDemo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new JTabbedPaneDemo1(), BorderLayout.CENTER);



        // показать форму

        frame.setSize(400, 200);

        frame.setVisible(true);

    }

}


