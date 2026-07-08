package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLEPlayerState {
    ANY(0),
    IDLE(3),
    PREPARED(5),
    STARTED(6),
    PAUSED(7),
    SEEKING(8),
    STOPPED(9),
    COMPLETED(10),
    ENGINE_NOT_CRATED(11),
    DESTROYING(12);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEPlayerState swigToEnum(int i) {
        NLEPlayerState[] nLEPlayerStateArr = (NLEPlayerState[]) NLEPlayerState.class.getEnumConstants();
        if (i < nLEPlayerStateArr.length && i >= 0) {
            NLEPlayerState nLEPlayerState = nLEPlayerStateArr[i];
            if (nLEPlayerState.swigValue == i) {
                return nLEPlayerState;
            }
        }
        for (NLEPlayerState nLEPlayerState2 : nLEPlayerStateArr) {
            if (nLEPlayerState2.swigValue == i) {
                return nLEPlayerState2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEPlayerState.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEPlayerState valueOf(String str) {
        return (NLEPlayerState) C08FF.LIZ(NLEPlayerState.class, str);
    }

    NLEPlayerState() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEPlayerState(NLEPlayerState nLEPlayerState) {
        int i = nLEPlayerState.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEPlayerState(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
