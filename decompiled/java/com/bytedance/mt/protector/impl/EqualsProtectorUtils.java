package com.bytedance.mt.protector.impl;

import X.C09EU;
import X.C09EY;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class EqualsProtectorUtils {
    public static boolean equals(Object obj, Object obj2) {
        if (C09EU.LIZIZ() && obj == null) {
            C09EY c09ey = C09EU.LIZJ;
            if (c09ey != null) {
                NullPointerException nullPointerException = new NullPointerException("equals NPE");
                if (nullPointerException.getStackTrace() != null && nullPointerException.getStackTrace().length != 0) {
                    StackTraceElement[] stackTrace = nullPointerException.getStackTrace();
                    ArrayList arrayList = new ArrayList();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (stackTraceElement != null && !equals(stackTraceElement.getClassName(), EqualsProtectorUtils.class.getName())) {
                            arrayList.add(stackTraceElement);
                        }
                    }
                    nullPointerException.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
                c09ey.LJI(nullPointerException);
            }
            return false;
        }
        return obj.equals(obj2);
    }
}
