package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEAudioChanger {
    NONE(0),
    BOY(1),
    GIRL(2),
    LOLI(3),
    UNCLE(4),
    MONSTER(5);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEAudioChanger swigToEnum(int i) {
        NLEAudioChanger[] nLEAudioChangerArr = (NLEAudioChanger[]) NLEAudioChanger.class.getEnumConstants();
        if (i < nLEAudioChangerArr.length && i >= 0) {
            NLEAudioChanger nLEAudioChanger = nLEAudioChangerArr[i];
            if (nLEAudioChanger.swigValue == i) {
                return nLEAudioChanger;
            }
        }
        for (NLEAudioChanger nLEAudioChanger2 : nLEAudioChangerArr) {
            if (nLEAudioChanger2.swigValue == i) {
                return nLEAudioChanger2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEAudioChanger.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEAudioChanger valueOf(String str) {
        return (NLEAudioChanger) C08FF.LIZ(NLEAudioChanger.class, str);
    }

    NLEAudioChanger() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEAudioChanger(NLEAudioChanger nLEAudioChanger) {
        int i = nLEAudioChanger.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEAudioChanger(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
