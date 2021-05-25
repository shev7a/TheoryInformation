package com.company;

public class Main {
    public static void main(String[] args) {
        String text = new String();
        text = "Я научилась просто, мудро жить,\n" +
                "Смотреть на небо и молиться Богу,\n" +
                "И долго перед вечером бродить,\n" +
                "Чтоб утомить ненужную тревогу.\n" +
                "\n" +
                "Когда шуршат в овраге лопухи\n" +
                "И никнет гроздь рябины желто-красной,\n" +
                "Слагаю я веселые стихи\n" +
                "О жизни тленной, тленной и прекрасной.\n" +
                "\n" +
                "Я возвращаюсь. Лижет мне ладонь\n" +
                "Пушистый кот, мурлыкает умильней,\n" +
                "И яркий загорается огонь\n" +
                "На башенке озерной лесопильни.\n" +
                "\n" +
                "Лишь изредка прорезывает тишь\n" +
                "Крик аиста, слетевшего на крышу.\n" +
                "И если в дверь мою ты постучишь,\n" +
                "Мне кажется, я даже не услышу.\n";
        text = text.replaceAll("[^А-Яа-я ]+", "");
        text = text.toLowerCase();
        char[] bukvy = {'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ь','ы','э','ю','я', ' '};
        int length_text = text.length();
        int length_bukvy = bukvy.length;
        int[] count = new int[length_bukvy];
        for (int i = 0; i<length_bukvy; i++) {
            for (int j = 0; j<length_text; j++) {
                if (text.charAt(j) == bukvy[i]) count[i]++;
                if (text.charAt(j) == 'ё') count[5]++;
                if (text.charAt(j) == 'ъ') count[26]++;
            }
        }

        int sum = 0;
        for (int i=0; i<count.length; i++) {
            sum += count[i];
            System.out.println(bukvy[i]+": "+count[i]);
        }
        System.out.println("Всего букв: "+sum);
    }
}
