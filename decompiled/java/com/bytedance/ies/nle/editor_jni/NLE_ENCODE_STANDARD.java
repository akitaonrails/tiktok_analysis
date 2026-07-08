package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLE_ENCODE_STANDARD {
    ENCODE_STANDARD_H264,
    ENCODE_STANDARD_ByteVC1,
    ENCODE_STANDARD_MPEG4,
    ENCODE_STANDARD_AUTO;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_ENCODE_STANDARD swigToEnum(int i) {
        NLE_ENCODE_STANDARD[] nle_encode_standardArr = (NLE_ENCODE_STANDARD[]) NLE_ENCODE_STANDARD.class.getEnumConstants();
        if (i < nle_encode_standardArr.length && i >= 0) {
            NLE_ENCODE_STANDARD nle_encode_standard = nle_encode_standardArr[i];
            if (nle_encode_standard.swigValue == i) {
                return nle_encode_standard;
            }
        }
        for (NLE_ENCODE_STANDARD nle_encode_standard2 : nle_encode_standardArr) {
            if (nle_encode_standard2.swigValue == i) {
                return nle_encode_standard2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_ENCODE_STANDARD.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_ENCODE_STANDARD valueOf(String str) {
        return (NLE_ENCODE_STANDARD) C08FF.LIZ(NLE_ENCODE_STANDARD.class, str);
    }

    NLE_ENCODE_STANDARD() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_ENCODE_STANDARD(NLE_ENCODE_STANDARD nle_encode_standard) {
        int i = nle_encode_standard.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_ENCODE_STANDARD(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
