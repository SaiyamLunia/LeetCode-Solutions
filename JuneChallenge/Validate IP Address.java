import java.util.regex.Pattern;
class Solution {
    public String validIPAddress(String IP) {
        String ipV4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        String ipV6 = "([0-9a-fA-F]{1,4})";
        
        Pattern patternipV4 = Pattern.compile("^(" + ipV4 + "\\.){3}" + ipV4 + "$");
        Pattern patternipV6 = Pattern.compile("^(" + ipV6 + "\\:){7}" + ipV6 + "$");
        
        if(patternipV4.matcher(IP).matches()) return "IPv4";
        return (patternipV6.matcher(IP).matches()) ? "IPv6" : "Neither";
        
    }
}