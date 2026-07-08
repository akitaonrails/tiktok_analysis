package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLERenderAction {
    ACTION_UNKNOWN(-1),
    ACTION_INSERT(0),
    ACTION_UPDATE(1),
    ACTION_DELETE(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLERenderAction swigToEnum(int i) {
        NLERenderAction[] nLERenderActionArr = (NLERenderAction[]) NLERenderAction.class.getEnumConstants();
        if (i < nLERenderActionArr.length && i >= 0) {
            NLERenderAction nLERenderAction = nLERenderActionArr[i];
            if (nLERenderAction.swigValue == i) {
                return nLERenderAction;
            }
        }
        for (NLERenderAction nLERenderAction2 : nLERenderActionArr) {
            if (nLERenderAction2.swigValue == i) {
                return nLERenderAction2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLERenderAction.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLERenderAction valueOf(String str) {
        return (NLERenderAction) C08FF.LIZ(NLERenderAction.class, str);
    }

    NLERenderAction() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLERenderAction(NLERenderAction nLERenderAction) {
        int i = nLERenderAction.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLERenderAction(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
