package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLERotateDegree {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLERotateDegree swigToEnum(int i) {
        NLERotateDegree[] nLERotateDegreeArr = (NLERotateDegree[]) NLERotateDegree.class.getEnumConstants();
        if (i < nLERotateDegreeArr.length && i >= 0) {
            NLERotateDegree nLERotateDegree = nLERotateDegreeArr[i];
            if (nLERotateDegree.swigValue == i) {
                return nLERotateDegree;
            }
        }
        for (NLERotateDegree nLERotateDegree2 : nLERotateDegreeArr) {
            if (nLERotateDegree2.swigValue == i) {
                return nLERotateDegree2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLERotateDegree.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLERotateDegree valueOf(String str) {
        return (NLERotateDegree) C08FF.LIZ(NLERotateDegree.class, str);
    }

    NLERotateDegree() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLERotateDegree(NLERotateDegree nLERotateDegree) {
        int i = nLERotateDegree.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLERotateDegree(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
