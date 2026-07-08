package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public enum NLEHttpClientCallbackAction {
    SUCCESS(0),
    RECEIVING_DATA(1),
    CANCELED(2),
    FAIL(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEHttpClientCallbackAction swigToEnum(int i) {
        NLEHttpClientCallbackAction[] nLEHttpClientCallbackActionArr = (NLEHttpClientCallbackAction[]) NLEHttpClientCallbackAction.class.getEnumConstants();
        if (i < nLEHttpClientCallbackActionArr.length && i >= 0) {
            NLEHttpClientCallbackAction nLEHttpClientCallbackAction = nLEHttpClientCallbackActionArr[i];
            if (nLEHttpClientCallbackAction.swigValue == i) {
                return nLEHttpClientCallbackAction;
            }
        }
        for (NLEHttpClientCallbackAction nLEHttpClientCallbackAction2 : nLEHttpClientCallbackActionArr) {
            if (nLEHttpClientCallbackAction2.swigValue == i) {
                return nLEHttpClientCallbackAction2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEHttpClientCallbackAction.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEHttpClientCallbackAction valueOf(String str) {
        return (NLEHttpClientCallbackAction) C08FF.LIZ(NLEHttpClientCallbackAction.class, str);
    }

    NLEHttpClientCallbackAction() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEHttpClientCallbackAction(NLEHttpClientCallbackAction nLEHttpClientCallbackAction) {
        int i = nLEHttpClientCallbackAction.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEHttpClientCallbackAction(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
