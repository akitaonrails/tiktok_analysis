package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEAllowListOperationType {
    NLE_ALLOWLISTOPERATION_TYPE_ADD(0),
    NLE_ALLOWLISTOPERATION_TYPE_REMOVE(1),
    NLE_ALLOWLISTOPERATION_TYPE_RESET(2),
    NLE_ALLOWLISTOPERATION_TYPE_CLEAR(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEAllowListOperationType swigToEnum(int i) {
        NLEAllowListOperationType[] nLEAllowListOperationTypeArr = (NLEAllowListOperationType[]) NLEAllowListOperationType.class.getEnumConstants();
        if (i < nLEAllowListOperationTypeArr.length && i >= 0) {
            NLEAllowListOperationType nLEAllowListOperationType = nLEAllowListOperationTypeArr[i];
            if (nLEAllowListOperationType.swigValue == i) {
                return nLEAllowListOperationType;
            }
        }
        for (NLEAllowListOperationType nLEAllowListOperationType2 : nLEAllowListOperationTypeArr) {
            if (nLEAllowListOperationType2.swigValue == i) {
                return nLEAllowListOperationType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEAllowListOperationType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEAllowListOperationType valueOf(String str) {
        return (NLEAllowListOperationType) C08FF.LIZ(NLEAllowListOperationType.class, str);
    }

    NLEAllowListOperationType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEAllowListOperationType(NLEAllowListOperationType nLEAllowListOperationType) {
        int i = nLEAllowListOperationType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEAllowListOperationType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
