import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  private static final char[] chasterUTF8 = {1040, 1072, 1041, 1073, 1042, 1074, 1043, 1075, 1044, 1076, 1045, 1077,
    1025, 1105, 1046, 1078, 1047, 1079, 1048, 1080, 1049, 1081, 1050, 1082, 1051, 1083, 1052,
    1084, 1053, 1085, 1054, 1086, 1055, 1087, 1056, 1088, 1057, 1089, 1058, 1090, 1059, 1091,
    1060, 1092, 1061, 1093, 1062, 1094, 1063, 1095, 1064, 1096, 1065, 1097, 1066, 1098, 1067,
    1099, 1068, 1100, 1069, 1101, 1070, 1102, 1071, 1103};
  private static final char[] chasterCP1251 = {1026, 160, 1027, 1038, 8218, 1118, 1107, 1032, 8222, 164, 8230, 1168, 1088, 1089,
    8224, 166, 8225, 167, 8364, 1025, 8240, 169, 1033, 1028, 8249, 171, 1034, 172, 1036, 173, 1035,
    174, 1039, 1031, 1106, 1072, 8216, 1073, 8217, 1074, 8220, 1075, 8221, 1076, 8226, 1077, 8211,
    1078, 8212, 1079, 65533, 1080, 8482, 1081, 1113, 1082, 8250, 1083, 1114, 1084, 1116, 1085, 1115, 1086, 1119, 1087};
  private static final ArrayList<Character> newText = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    char[] inputText = input.toCharArray();

    for (char c : inputText) {
      addUtf8(c);
    }

    StringBuilder str = new StringBuilder();
    for (Character c : newText) {
      str.append(c);
    }
    newText.clear();
    System.out.println(str);
  }

  private static void addUtf8(char c) {
    for (int j = 0; j < chasterCP1251.length; j++) {
      if (c == chasterCP1251[j]) {
        newText.add(chasterUTF8[j]);
        return;
      }
    }
    newText.add(c);
  }
}

//    char[] chasterUTF8 = {'À','à','Á','á','Â','â','Ã','ã','Ä','ä','Å','å','¨','¸','Æ','æ','Ç','ç','È','è','É','é','Ê','ê',
//            'Ë','ë','Ì','ì','Í','í','Î','î','Ï','ï','Ð','ð','Ñ','ñ','Ò','ò','Ó','ó','Ô','ô','Õ','õ','Ö','ö','×','÷',
//            'Ø','ø','Ù','ù','Ú','ú','Û','û','Ü','ü','Ý','ý','Þ','þ','ß','ÿ'};
//ÀàÁáÂâÃãÄäÅå¨¸ÆæÇçÈèÉéÊêËëÌìÍíÎîÏïÐðÑñÒòÓóÔôÕõÖö×÷ØøÙùÚúÛûÜüÝýÞþßÿ