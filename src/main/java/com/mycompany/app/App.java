/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Solver mySolver = SolverFactory.getSolver("MergeIntervals");
        if (mySolver != null) {
            mySolver.solve();
        } else {
            System.out.println("未找到对应的求解器。");
        }
    }
}
