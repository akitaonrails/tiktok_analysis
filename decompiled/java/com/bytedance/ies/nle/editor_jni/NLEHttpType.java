package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLEHttpType {
    HTTP_GET(0),
    HTTP_POST(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEHttpType swigToEnum(int i) {
        NLEHttpType[] nLEHttpTypeArr = (NLEHttpType[]) NLEHttpType.class.getEnumConstants();
        if (i < nLEHttpTypeArr.length && i >= 0) {
            NLEHttpType nLEHttpType = nLEHttpTypeArr[i];
            if (nLEHttpType.swigValue == i) {
                return nLEHttpType;
            }
        }
        for (NLEHttpType nLEHttpType2 : nLEHttpTypeArr) {
            if (nLEHttpType2.swigValue == i) {
                return nLEHttpType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEHttpType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEHttpType valueOf(String str) {
        return (NLEHttpType) C08FF.LIZ(NLEHttpType.class, str);
    }

    NLEHttpType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEHttpType(NLEHttpType nLEHttpType) {
        int i = nLEHttpType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEHttpType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
