/*
 * The MIT License
 *
 * Copyright 2017 Camille Rose and Edmund Wright.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package orderprocessor;

/**
 *
 * @author Camille Rose and Edmund Wright
 */
public class FacilityRecord implements Comparable <FacilityRecord> {
    public String facilityName;
    public int quantityNeeded;
    public double processingNumDays;
    public int processingEndDay;
    public int travelTime;
    public int arrivalDay;
    
    FacilityRecord(String name, int itemQty, double processNumDays, int endDay, int tt) {
        facilityName = name;
        quantityNeeded = itemQty;
        processingNumDays = processNumDays;
        processingEndDay = endDay;
        travelTime = tt;
        arrivalDay = travelTime + processingEndDay;
    }

    @Override
    public int compareTo(FacilityRecord fr) {
        //return arrivalDay - fr.arrivalDay;
        if (arrivalDay > fr.arrivalDay) return 1;
        else if (arrivalDay < fr.arrivalDay) return -1;
        else return 0;
    }
    
    public void print(){
        System.out.println("Facility Name: " + facilityName);
        System.out.println("Qty Needed: " + quantityNeeded);
        System.out.println("Travel Time: " + travelTime);
        System.out.println("Processing Num Days: " + processingNumDays);
        System.out.println("Processing End Day: " + processingEndDay);
        System.out.println("Arrival Day: " + arrivalDay + "\n");
    }
    
}


