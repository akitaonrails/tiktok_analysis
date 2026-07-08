package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEResTag {
    NORMAL(0),
    AMAZING(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEResTag swigToEnum(int i) {
        NLEResTag[] nLEResTagArr = (NLEResTag[]) NLEResTag.class.getEnumConstants();
        if (i < nLEResTagArr.length && i >= 0) {
            NLEResTag nLEResTag = nLEResTagArr[i];
            if (nLEResTag.swigValue == i) {
                return nLEResTag;
            }
        }
        for (NLEResTag nLEResTag2 : nLEResTagArr) {
            if (nLEResTag2.swigValue == i) {
                return nLEResTag2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEResTag.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEResTag valueOf(String str) {
        return (NLEResTag) C08FF.LIZ(NLEResTag.class, str);
    }

    NLEResTag() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEResTag(NLEResTag nLEResTag) {
        int i = nLEResTag.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEResTag(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
