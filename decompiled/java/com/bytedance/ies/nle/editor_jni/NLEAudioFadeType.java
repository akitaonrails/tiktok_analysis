package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEAudioFadeType {
    Sine(1),
    Linear(2),
    Log(3),
    Exp(4);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEAudioFadeType swigToEnum(int i) {
        NLEAudioFadeType[] nLEAudioFadeTypeArr = (NLEAudioFadeType[]) NLEAudioFadeType.class.getEnumConstants();
        if (i < nLEAudioFadeTypeArr.length && i >= 0) {
            NLEAudioFadeType nLEAudioFadeType = nLEAudioFadeTypeArr[i];
            if (nLEAudioFadeType.swigValue == i) {
                return nLEAudioFadeType;
            }
        }
        for (NLEAudioFadeType nLEAudioFadeType2 : nLEAudioFadeTypeArr) {
            if (nLEAudioFadeType2.swigValue == i) {
                return nLEAudioFadeType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEAudioFadeType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEAudioFadeType valueOf(String str) {
        return (NLEAudioFadeType) C08FF.LIZ(NLEAudioFadeType.class, str);
    }

    NLEAudioFadeType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEAudioFadeType(NLEAudioFadeType nLEAudioFadeType) {
        int i = nLEAudioFadeType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEAudioFadeType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
