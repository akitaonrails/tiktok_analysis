package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLE_GET_FRAME_FLAGS {
    NLE_GET_FRAMES_MODE_NORMAL,
    NLE_GET_FRAMES_MODE_NOEFFECT,
    NLE_GET_FRAMES_MODE_NOEFFECT_MULTI,
    NLE_GET_FRAMES_MODE_NORMAL_SCORE,
    NLE_GET_FRAMES_MODE_NOEFFECT_SCORE;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_GET_FRAME_FLAGS swigToEnum(int i) {
        NLE_GET_FRAME_FLAGS[] nle_get_frame_flagsArr = (NLE_GET_FRAME_FLAGS[]) NLE_GET_FRAME_FLAGS.class.getEnumConstants();
        if (i < nle_get_frame_flagsArr.length && i >= 0) {
            NLE_GET_FRAME_FLAGS nle_get_frame_flags = nle_get_frame_flagsArr[i];
            if (nle_get_frame_flags.swigValue == i) {
                return nle_get_frame_flags;
            }
        }
        for (NLE_GET_FRAME_FLAGS nle_get_frame_flags2 : nle_get_frame_flagsArr) {
            if (nle_get_frame_flags2.swigValue == i) {
                return nle_get_frame_flags2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_GET_FRAME_FLAGS.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_GET_FRAME_FLAGS valueOf(String str) {
        return (NLE_GET_FRAME_FLAGS) C08FF.LIZ(NLE_GET_FRAME_FLAGS.class, str);
    }

    NLE_GET_FRAME_FLAGS() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_GET_FRAME_FLAGS(NLE_GET_FRAME_FLAGS nle_get_frame_flags) {
        int i = nle_get_frame_flags.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_GET_FRAME_FLAGS(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
