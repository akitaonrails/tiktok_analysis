package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLE_ENCODE_PRESET {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_ENCODE_PRESET swigToEnum(int i) {
        NLE_ENCODE_PRESET[] nle_encode_presetArr = (NLE_ENCODE_PRESET[]) NLE_ENCODE_PRESET.class.getEnumConstants();
        if (i < nle_encode_presetArr.length && i >= 0) {
            NLE_ENCODE_PRESET nle_encode_preset = nle_encode_presetArr[i];
            if (nle_encode_preset.swigValue == i) {
                return nle_encode_preset;
            }
        }
        for (NLE_ENCODE_PRESET nle_encode_preset2 : nle_encode_presetArr) {
            if (nle_encode_preset2.swigValue == i) {
                return nle_encode_preset2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_ENCODE_PRESET.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_ENCODE_PRESET valueOf(String str) {
        return (NLE_ENCODE_PRESET) C08FF.LIZ(NLE_ENCODE_PRESET.class, str);
    }

    NLE_ENCODE_PRESET() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_ENCODE_PRESET(NLE_ENCODE_PRESET nle_encode_preset) {
        int i = nle_encode_preset.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_ENCODE_PRESET(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
