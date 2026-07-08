package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEKeyframeType {
    None,
    Video,
    Text,
    Sticker,
    Mask,
    ChromaChannel,
    Effect,
    Filter,
    Volume,
    Sami,
    Alpha,
    Composite;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEKeyframeType swigToEnum(int i) {
        NLEKeyframeType[] nLEKeyframeTypeArr = (NLEKeyframeType[]) NLEKeyframeType.class.getEnumConstants();
        if (i < nLEKeyframeTypeArr.length && i >= 0) {
            NLEKeyframeType nLEKeyframeType = nLEKeyframeTypeArr[i];
            if (nLEKeyframeType.swigValue == i) {
                return nLEKeyframeType;
            }
        }
        for (NLEKeyframeType nLEKeyframeType2 : nLEKeyframeTypeArr) {
            if (nLEKeyframeType2.swigValue == i) {
                return nLEKeyframeType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEKeyframeType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEKeyframeType valueOf(String str) {
        return (NLEKeyframeType) C08FF.LIZ(NLEKeyframeType.class, str);
    }

    NLEKeyframeType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEKeyframeType(NLEKeyframeType nLEKeyframeType) {
        int i = nLEKeyframeType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEKeyframeType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
