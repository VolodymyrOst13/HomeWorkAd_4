package task2;

import java.io.*;
public class Main {
    static String replace_word(String sentence, String pattern){
        String[] word_list = sentence.split("\s+");
        String my_result = "";
        String asterisk_val = "";
        for (int i = 0; i < 1; i++)
            asterisk_val += "Java";
        int my_index = 0;
        for (String i : word_list){
            if (i.compareTo(pattern) == 0)
                word_list[my_index] = asterisk_val;
            my_index++;
        }
        for (String i : word_list)
            my_result += i + ' ';
        return my_result;
    }
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")))){
            out.writeUTF("Мотря махнула на себе хусточкою, сіла на призьбі й задумалася. Ілько, пильно слідкуючи за нею, проти волі задивився на красу її, що тепер іще якось виразніше виявлялася на сірому тлі стіни, — на ту красу, що не б’є у вічі, що на перший погляд ледве примітна, а тільки в неї вдивишся, можна впитися й очима, і серцем, всею істотою. То була краса, що виховується тільки на Україні, але не така, як малюють деякі з наших письменників. Не було в неї ні «губок, як пуп’янок, червоних, як добре намисто», ні «підборіддя, як горішок», ні «щік, як повна рожа», і сама вона не «вилискувалась, як маківка на городі». " +
                    "Чорна, без лиску, товста коса; невисокий, трохи випнутий лоб; ніс тонкий, рівний, з живими ніздрями; свіжі, наче дитячі, губи, що якось мило загинались на кінцях; легка смага на матових, наче мармурових, щоках і великі, надзвичайно великі, з довгими віями, темно-сірі очі, з яких здавалося, дивлячись, наче лилося якесь тихе, м’яке, ласкаве світло, — то була й уся краса сієї дівчини (В. Винниченко).");

            out.flush();

            String sentence = in.readUTF();
            String pattern = "на";

            System.out.println(replace_word(sentence,pattern));

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
