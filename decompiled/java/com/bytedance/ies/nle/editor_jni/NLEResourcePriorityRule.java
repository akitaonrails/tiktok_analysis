package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEResourcePriorityRule {
    DEFAULT,
    TIME_CLOSE(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEResourcePriorityRule swigToEnum(int i) {
        NLEResourcePriorityRule[] nLEResourcePriorityRuleArr = (NLEResourcePriorityRule[]) NLEResourcePriorityRule.class.getEnumConstants();
        if (i < nLEResourcePriorityRuleArr.length && i >= 0) {
            NLEResourcePriorityRule nLEResourcePriorityRule = nLEResourcePriorityRuleArr[i];
            if (nLEResourcePriorityRule.swigValue == i) {
                return nLEResourcePriorityRule;
            }
        }
        for (NLEResourcePriorityRule nLEResourcePriorityRule2 : nLEResourcePriorityRuleArr) {
            if (nLEResourcePriorityRule2.swigValue == i) {
                return nLEResourcePriorityRule2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEResourcePriorityRule.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEResourcePriorityRule valueOf(String str) {
        return (NLEResourcePriorityRule) C08FF.LIZ(NLEResourcePriorityRule.class, str);
    }

    NLEResourcePriorityRule() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEResourcePriorityRule(NLEResourcePriorityRule nLEResourcePriorityRule) {
        int i = nLEResourcePriorityRule.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEResourcePriorityRule(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
