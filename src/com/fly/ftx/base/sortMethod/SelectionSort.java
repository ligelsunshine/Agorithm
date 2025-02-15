package com.fly.ftx.base.sortMethod;
import com.fly.ftx.base.Util;
import com.fly.ftx.base.sortMethod.baseSortInterface.BaseSort;

/**
 * 选择排序
 */
public class SelectionSort implements BaseSort{

    @Override
    public Object sort(int[] source) {
            if(source.length == 0) return source;
            int n = source.length;
            for (int i = 0; i < n-1; i++) {
                int min = i;
                for (int j = i+1; j < n; j++) {
                    if(source[min] > source[j])  
                        min = j;
                }
              if(min != i) {
                   Util.swap(source, i, min);
               }
            }
        return source;
    }

    
}