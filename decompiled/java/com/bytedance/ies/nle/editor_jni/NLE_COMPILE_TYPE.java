package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLE_COMPILE_TYPE {
    COMPILE_TYPE_MP4,
    COMPILE_TYPE_GIF,
    COMPILE_TYPE_HIGH_GIF,
    COMPILE_TYPE_JPEG,
    COMPILE_TYPE_PNG,
    COMPILE_TYPE_AAC,
    COMPILE_TYPE_WAV,
    COMPILE_TYPE_WEBP;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_COMPILE_TYPE swigToEnum(int i) {
        NLE_COMPILE_TYPE[] nle_compile_typeArr = (NLE_COMPILE_TYPE[]) NLE_COMPILE_TYPE.class.getEnumConstants();
        if (i < nle_compile_typeArr.length && i >= 0) {
            NLE_COMPILE_TYPE nle_compile_type = nle_compile_typeArr[i];
            if (nle_compile_type.swigValue == i) {
                return nle_compile_type;
            }
        }
        for (NLE_COMPILE_TYPE nle_compile_type2 : nle_compile_typeArr) {
            if (nle_compile_type2.swigValue == i) {
                return nle_compile_type2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_COMPILE_TYPE.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_COMPILE_TYPE valueOf(String str) {
        return (NLE_COMPILE_TYPE) C08FF.LIZ(NLE_COMPILE_TYPE.class, str);
    }

    NLE_COMPILE_TYPE() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_COMPILE_TYPE(NLE_COMPILE_TYPE nle_compile_type) {
        int i = nle_compile_type.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_COMPILE_TYPE(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
