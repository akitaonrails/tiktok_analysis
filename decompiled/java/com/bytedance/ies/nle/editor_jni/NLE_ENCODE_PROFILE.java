package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLE_ENCODE_PROFILE {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_ENCODE_PROFILE swigToEnum(int i) {
        NLE_ENCODE_PROFILE[] nle_encode_profileArr = (NLE_ENCODE_PROFILE[]) NLE_ENCODE_PROFILE.class.getEnumConstants();
        if (i < nle_encode_profileArr.length && i >= 0) {
            NLE_ENCODE_PROFILE nle_encode_profile = nle_encode_profileArr[i];
            if (nle_encode_profile.swigValue == i) {
                return nle_encode_profile;
            }
        }
        for (NLE_ENCODE_PROFILE nle_encode_profile2 : nle_encode_profileArr) {
            if (nle_encode_profile2.swigValue == i) {
                return nle_encode_profile2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_ENCODE_PROFILE.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_ENCODE_PROFILE valueOf(String str) {
        return (NLE_ENCODE_PROFILE) C08FF.LIZ(NLE_ENCODE_PROFILE.class, str);
    }

    NLE_ENCODE_PROFILE() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_ENCODE_PROFILE(NLE_ENCODE_PROFILE nle_encode_profile) {
        int i = nle_encode_profile.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_ENCODE_PROFILE(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
