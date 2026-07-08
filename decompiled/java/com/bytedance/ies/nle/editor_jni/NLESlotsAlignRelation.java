package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLESlotsAlignRelation {
    UNCONNECTED(0),
    SUBSET(1),
    SUPERSET(2),
    INTERSECTION(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLESlotsAlignRelation swigToEnum(int i) {
        NLESlotsAlignRelation[] nLESlotsAlignRelationArr = (NLESlotsAlignRelation[]) NLESlotsAlignRelation.class.getEnumConstants();
        if (i < nLESlotsAlignRelationArr.length && i >= 0) {
            NLESlotsAlignRelation nLESlotsAlignRelation = nLESlotsAlignRelationArr[i];
            if (nLESlotsAlignRelation.swigValue == i) {
                return nLESlotsAlignRelation;
            }
        }
        for (NLESlotsAlignRelation nLESlotsAlignRelation2 : nLESlotsAlignRelationArr) {
            if (nLESlotsAlignRelation2.swigValue == i) {
                return nLESlotsAlignRelation2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLESlotsAlignRelation.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLESlotsAlignRelation valueOf(String str) {
        return (NLESlotsAlignRelation) C08FF.LIZ(NLESlotsAlignRelation.class, str);
    }

    NLESlotsAlignRelation() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLESlotsAlignRelation(NLESlotsAlignRelation nLESlotsAlignRelation) {
        int i = nLESlotsAlignRelation.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLESlotsAlignRelation(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
