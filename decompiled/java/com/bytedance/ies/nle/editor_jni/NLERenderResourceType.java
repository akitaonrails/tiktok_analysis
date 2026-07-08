package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLERenderResourceType {
    NONE(0),
    AUDIO(1),
    VIDEO(2),
    STICKER(3),
    EFFECT(4),
    FILTER(5),
    TRANSITION(6),
    VIDEO_ANIMATION(7),
    VIDEO_MASK(8),
    VIDEO_FILTER(9),
    VIDEO_EFFECT(10),
    VIDEO_TRANSFORM(11),
    STICKER_ANIMATION(12);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLERenderResourceType swigToEnum(int i) {
        NLERenderResourceType[] nLERenderResourceTypeArr = (NLERenderResourceType[]) NLERenderResourceType.class.getEnumConstants();
        if (i < nLERenderResourceTypeArr.length && i >= 0) {
            NLERenderResourceType nLERenderResourceType = nLERenderResourceTypeArr[i];
            if (nLERenderResourceType.swigValue == i) {
                return nLERenderResourceType;
            }
        }
        for (NLERenderResourceType nLERenderResourceType2 : nLERenderResourceTypeArr) {
            if (nLERenderResourceType2.swigValue == i) {
                return nLERenderResourceType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLERenderResourceType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLERenderResourceType valueOf(String str) {
        return (NLERenderResourceType) C08FF.LIZ(NLERenderResourceType.class, str);
    }

    NLERenderResourceType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLERenderResourceType(NLERenderResourceType nLERenderResourceType) {
        int i = nLERenderResourceType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLERenderResourceType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
