/*
 * The MIT License
 *
 * Copyright 2017 Edmund Wright and Camille Rose.
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
package facilityinterface;

import customexceptions.FacilityInventoryOverwriteException;
import customexceptions.ItemQuantityException;
import java.util.HashMap;

/**
 *
 * @author Edmund Wright and Camille Rose
 */
public interface Facility {
    // void updateSchedule();
    // method to get current schedule details

    /**
     * 
     * @return HashMap with the name of each neighbor's name and the distance to it.
     */
    HashMap<String, Integer> getNeighbors();
    void loadInventory(HashMap<String, Integer> inventory) throws FacilityInventoryOverwriteException;
    int itemQuanity (String itemName);
    boolean hasItem (String itemName);
    void printReport();
    int updateSchedule(int orderDay, int qty);
    int processingEndDate(int orderDay, int qty);
    void reduceInventory(String itemName, int itemQty) throws ItemQuantityException;
    double processingNumDays(int orderDay, int qty);
    FacilityDTO getFacilityDTO();
}
