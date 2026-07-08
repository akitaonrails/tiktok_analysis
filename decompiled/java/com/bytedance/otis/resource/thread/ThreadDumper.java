package com.bytedance.otis.resource.thread;

import X.C1C86;
import X.C1C87;
import X.C1C88;

/* JADX INFO: loaded from: classes35.dex */
public final class ThreadDumper {
    public static final ThreadDumper LIZ = new ThreadDumper();
    public static C1C88 LIZIZ;

    public static final void type(int i) {
        C1C87 c1c87;
        C1C88 c1c88 = LIZIZ;
        if (c1c88 != null) {
            C1C87.Companion.getClass();
            C1C87[] c1c87ArrValues = C1C87.values();
            int length = c1c87ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c1c87 = c1c87ArrValues[i2];
                    if (c1c87.getAction() == i) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    c1c87 = C1C87.ACTION_UNKNOWN;
                    break;
                }
            }
            c1c88.LIZIZ(c1c87);
        }
    }

    public static final void add(int i, String str, long j, int i2, String str2, String str3) {
        C1C86 c1c86;
        C1C86.Companion.getClass();
        C1C86[] c1c86ArrValues = C1C86.values();
        int length = c1c86ArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                c1c86 = c1c86ArrValues[i3];
                if (c1c86.getAction() == i2) {
                    break;
                } else {
                    i3++;
                }
            } else {
                c1c86 = C1C86.ACTION_UNKNOWN;
                break;
            }
        }
        C1C88 c1c88 = LIZIZ;
        if (c1c88 != null) {
            c1c88.LIZ(str, j, c1c86);
        }
    }
}
