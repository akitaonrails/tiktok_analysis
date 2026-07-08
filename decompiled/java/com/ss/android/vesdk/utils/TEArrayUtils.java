package com.ss.android.vesdk.utils;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class TEArrayUtils {
    public static double[] toDoubleArray(List<Double> list) {
        if (list != null && !list.isEmpty()) {
            double[] dArr = new double[list.size()];
            for (int i = 0; i < list.size(); i++) {
                dArr[i] = ((Double) ListProtector.get(list, i)).doubleValue();
            }
            return dArr;
        }
        return new double[0];
    }

    public static float[] toFloatArray(List<Float> list) {
        if (list != null && !list.isEmpty()) {
            float[] fArr = new float[list.size()];
            for (int i = 0; i < list.size(); i++) {
                fArr[i] = ((Float) ListProtector.get(list, i)).floatValue();
            }
            return fArr;
        }
        return new float[0];
    }

    public static int[] toIntArray(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            int[] iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = ((Integer) ListProtector.get(list, i)).intValue();
            }
            return iArr;
        }
        return new int[0];
    }

    public static long[] toLongArray(List<Long> list) {
        if (list != null && !list.isEmpty()) {
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = ((Long) ListProtector.get(list, i)).longValue();
            }
            return jArr;
        }
        return new long[0];
    }

    public static String[] toStringArray(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return (String[]) list.toArray(new String[list.size()]);
        }
        return new String[0];
    }
}
