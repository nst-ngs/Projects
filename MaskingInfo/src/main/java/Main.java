public class Main {

    public static void main(String[] args) {
        searchAndReplaceDiamonds("Номер кредитной карты <4008> 1234 <5678> 8912", "***");
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<') {
                int diamondOn = text.indexOf('<');
                int diamondOff = text.indexOf('>') + 1;
                if (diamondOn < diamondOff){
                    String maskingInfo = text.substring(diamondOn, diamondOff);
                    text = text.replace(maskingInfo, placeholder);
                }
            }
        }
        System.out.println(text);
        return text;
    }
}