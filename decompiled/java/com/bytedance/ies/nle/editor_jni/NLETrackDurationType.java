package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLETrackDurationType {
    NLEDurationType_Unknown(-1),
    NLEDurationType_Fixed(0),
    NLEDurationType_FollowMax(1),
    NLEDurationType_FollowMin(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLETrackDurationType swigToEnum(int i) {
        NLETrackDurationType[] nLETrackDurationTypeArr = (NLETrackDurationType[]) NLETrackDurationType.class.getEnumConstants();
        if (i < nLETrackDurationTypeArr.length && i >= 0) {
            NLETrackDurationType nLETrackDurationType = nLETrackDurationTypeArr[i];
            if (nLETrackDurationType.swigValue == i) {
                return nLETrackDurationType;
            }
        }
        for (NLETrackDurationType nLETrackDurationType2 : nLETrackDurationTypeArr) {
            if (nLETrackDurationType2.swigValue == i) {
                return nLETrackDurationType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLETrackDurationType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLETrackDurationType valueOf(String str) {
        return (NLETrackDurationType) C08FF.LIZ(NLETrackDurationType.class, str);
    }

    NLETrackDurationType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLETrackDurationType(NLETrackDurationType nLETrackDurationType) {
        int i = nLETrackDurationType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLETrackDurationType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
