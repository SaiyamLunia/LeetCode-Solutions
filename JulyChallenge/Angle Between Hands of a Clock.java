class Solution {
    public double angleClock(int hour, int minutes) {
        int hourDegree = 30;
        int minDegree = 6;
        
        double val = minutes / 60.0;
        double hourHand = (hour + val ) * hourDegree;
        double minuteHand = minutes * 6;
        
        return (double) Math.min(Math.abs(hourHand - minuteHand) , 360 - Math.abs(hourHand - minuteHand));
    }
}