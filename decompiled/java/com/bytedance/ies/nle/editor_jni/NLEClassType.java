package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEClassType {
    NONE(0),
    VIDEO(2),
    AUDIO(3),
    IMAGE(4),
    TRANSITION(5),
    EFFECT(6),
    FILTER(7),
    INFO_STICKER(8),
    IMAGE_STICKER(9),
    TEXT_STICKER(10),
    SUBTITLE_STICKER(11),
    EMOJI_STICKER(12),
    TIME_EFFECT(13),
    TEXT_TEMPLATE(14),
    VIDEO_ANIMATION(15),
    MASK(16),
    CHROMA(17),
    MV(18),
    NEW_TEXT_TEMPLATE(19);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEClassType swigToEnum(int i) {
        NLEClassType[] nLEClassTypeArr = (NLEClassType[]) NLEClassType.class.getEnumConstants();
        if (i < nLEClassTypeArr.length && i >= 0) {
            NLEClassType nLEClassType = nLEClassTypeArr[i];
            if (nLEClassType.swigValue == i) {
                return nLEClassType;
            }
        }
        for (NLEClassType nLEClassType2 : nLEClassTypeArr) {
            if (nLEClassType2.swigValue == i) {
                return nLEClassType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEClassType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEClassType valueOf(String str) {
        return (NLEClassType) C08FF.LIZ(NLEClassType.class, str);
    }

    NLEClassType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEClassType(NLEClassType nLEClassType) {
        int i = nLEClassType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEClassType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
