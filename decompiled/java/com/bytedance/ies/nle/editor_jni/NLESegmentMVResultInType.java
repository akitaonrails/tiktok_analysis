package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public enum NLESegmentMVResultInType {
    TYPE_IMAGE(0),
    TYPE_VIDEO(1),
    TYPE_JSON(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLESegmentMVResultInType swigToEnum(int i) {
        NLESegmentMVResultInType[] nLESegmentMVResultInTypeArr = (NLESegmentMVResultInType[]) NLESegmentMVResultInType.class.getEnumConstants();
        if (i < nLESegmentMVResultInTypeArr.length && i >= 0) {
            NLESegmentMVResultInType nLESegmentMVResultInType = nLESegmentMVResultInTypeArr[i];
            if (nLESegmentMVResultInType.swigValue == i) {
                return nLESegmentMVResultInType;
            }
        }
        for (NLESegmentMVResultInType nLESegmentMVResultInType2 : nLESegmentMVResultInTypeArr) {
            if (nLESegmentMVResultInType2.swigValue == i) {
                return nLESegmentMVResultInType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLESegmentMVResultInType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLESegmentMVResultInType valueOf(String str) {
        return (NLESegmentMVResultInType) C08FF.LIZ(NLESegmentMVResultInType.class, str);
    }

    NLESegmentMVResultInType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLESegmentMVResultInType(NLESegmentMVResultInType nLESegmentMVResultInType) {
        int i = nLESegmentMVResultInType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLESegmentMVResultInType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
