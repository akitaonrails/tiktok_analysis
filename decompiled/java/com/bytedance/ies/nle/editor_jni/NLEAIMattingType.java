package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEAIMattingType {
    TYPE_OPEN(1),
    TYPE_AI(2),
    TYPE_CUSTOM(4),
    TYPE_HEAD(8),
    TYPE_INTERACTIVE(16),
    TYPE_TAG(32),
    MATTING_TYPE_PORTRAIT(64),
    MATTING_TYPE_FACE(128),
    MATTING_TYPE_SCRIPT_SALIENCY(256);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEAIMattingType swigToEnum(int i) {
        NLEAIMattingType[] nLEAIMattingTypeArr = (NLEAIMattingType[]) NLEAIMattingType.class.getEnumConstants();
        if (i < nLEAIMattingTypeArr.length && i >= 0) {
            NLEAIMattingType nLEAIMattingType = nLEAIMattingTypeArr[i];
            if (nLEAIMattingType.swigValue == i) {
                return nLEAIMattingType;
            }
        }
        for (NLEAIMattingType nLEAIMattingType2 : nLEAIMattingTypeArr) {
            if (nLEAIMattingType2.swigValue == i) {
                return nLEAIMattingType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEAIMattingType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEAIMattingType valueOf(String str) {
        return (NLEAIMattingType) C08FF.LIZ(NLEAIMattingType.class, str);
    }

    NLEAIMattingType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEAIMattingType(NLEAIMattingType nLEAIMattingType) {
        int i = nLEAIMattingType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEAIMattingType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
