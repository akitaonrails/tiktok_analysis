package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum Quaility {
    Q480P(1),
    Q720P(2),
    Q1080P(3),
    Q1440P(4),
    Q2160P(5);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static Quaility swigToEnum(int i) {
        Quaility[] quailityArr = (Quaility[]) Quaility.class.getEnumConstants();
        if (i < quailityArr.length && i >= 0) {
            Quaility quaility = quailityArr[i];
            if (quaility.swigValue == i) {
                return quaility;
            }
        }
        for (Quaility quaility2 : quailityArr) {
            if (quaility2.swigValue == i) {
                return quaility2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(Quaility.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Quaility valueOf(String str) {
        return (Quaility) C08FF.LIZ(Quaility.class, str);
    }

    Quaility() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    Quaility(Quaility quaility) {
        int i = quaility.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    Quaility(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
