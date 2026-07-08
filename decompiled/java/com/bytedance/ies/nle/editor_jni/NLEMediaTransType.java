package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEMediaTransType {
    NONE(0),
    PATH(1),
    ZOOM(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEMediaTransType swigToEnum(int i) {
        NLEMediaTransType[] nLEMediaTransTypeArr = (NLEMediaTransType[]) NLEMediaTransType.class.getEnumConstants();
        if (i < nLEMediaTransTypeArr.length && i >= 0) {
            NLEMediaTransType nLEMediaTransType = nLEMediaTransTypeArr[i];
            if (nLEMediaTransType.swigValue == i) {
                return nLEMediaTransType;
            }
        }
        for (NLEMediaTransType nLEMediaTransType2 : nLEMediaTransTypeArr) {
            if (nLEMediaTransType2.swigValue == i) {
                return nLEMediaTransType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEMediaTransType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEMediaTransType valueOf(String str) {
        return (NLEMediaTransType) C08FF.LIZ(NLEMediaTransType.class, str);
    }

    NLEMediaTransType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEMediaTransType(NLEMediaTransType nLEMediaTransType) {
        int i = nLEMediaTransType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEMediaTransType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
