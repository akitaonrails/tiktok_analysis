package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLETrackType {
    NONE(0),
    AUDIO(1),
    VIDEO(2),
    STICKER(3),
    EFFECT(4),
    FILTER(5),
    IMAGE(6),
    MV(7),
    EFFECT_STICKER(8),
    COLLECTION(10);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLETrackType swigToEnum(int i) {
        NLETrackType[] nLETrackTypeArr = (NLETrackType[]) NLETrackType.class.getEnumConstants();
        if (i < nLETrackTypeArr.length && i >= 0) {
            NLETrackType nLETrackType = nLETrackTypeArr[i];
            if (nLETrackType.swigValue == i) {
                return nLETrackType;
            }
        }
        for (NLETrackType nLETrackType2 : nLETrackTypeArr) {
            if (nLETrackType2.swigValue == i) {
                return nLETrackType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLETrackType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLETrackType valueOf(String str) {
        return (NLETrackType) C08FF.LIZ(NLETrackType.class, str);
    }

    NLETrackType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLETrackType(NLETrackType nLETrackType) {
        int i = nLETrackType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLETrackType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
