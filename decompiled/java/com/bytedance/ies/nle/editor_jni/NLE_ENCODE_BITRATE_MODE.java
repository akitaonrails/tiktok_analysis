package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLE_ENCODE_BITRATE_MODE {
    NLE_ENCODE_BITRATE_ABR,
    NLE_ENCODE_BITRATE_CRF,
    NLE_ENCODE_BITRATE_QP,
    NLE_ENCODE_BITRATE_VBR;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_ENCODE_BITRATE_MODE swigToEnum(int i) {
        NLE_ENCODE_BITRATE_MODE[] nle_encode_bitrate_modeArr = (NLE_ENCODE_BITRATE_MODE[]) NLE_ENCODE_BITRATE_MODE.class.getEnumConstants();
        if (i < nle_encode_bitrate_modeArr.length && i >= 0) {
            NLE_ENCODE_BITRATE_MODE nle_encode_bitrate_mode = nle_encode_bitrate_modeArr[i];
            if (nle_encode_bitrate_mode.swigValue == i) {
                return nle_encode_bitrate_mode;
            }
        }
        for (NLE_ENCODE_BITRATE_MODE nle_encode_bitrate_mode2 : nle_encode_bitrate_modeArr) {
            if (nle_encode_bitrate_mode2.swigValue == i) {
                return nle_encode_bitrate_mode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_ENCODE_BITRATE_MODE.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_ENCODE_BITRATE_MODE valueOf(String str) {
        return (NLE_ENCODE_BITRATE_MODE) C08FF.LIZ(NLE_ENCODE_BITRATE_MODE.class, str);
    }

    NLE_ENCODE_BITRATE_MODE() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_ENCODE_BITRATE_MODE(NLE_ENCODE_BITRATE_MODE nle_encode_bitrate_mode) {
        int i = nle_encode_bitrate_mode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_ENCODE_BITRATE_MODE(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
