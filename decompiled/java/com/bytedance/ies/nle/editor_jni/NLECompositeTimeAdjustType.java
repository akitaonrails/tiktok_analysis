package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLECompositeTimeAdjustType {
    ByParent(0),
    Unchanged(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLECompositeTimeAdjustType swigToEnum(int i) {
        NLECompositeTimeAdjustType[] nLECompositeTimeAdjustTypeArr = (NLECompositeTimeAdjustType[]) NLECompositeTimeAdjustType.class.getEnumConstants();
        if (i < nLECompositeTimeAdjustTypeArr.length && i >= 0) {
            NLECompositeTimeAdjustType nLECompositeTimeAdjustType = nLECompositeTimeAdjustTypeArr[i];
            if (nLECompositeTimeAdjustType.swigValue == i) {
                return nLECompositeTimeAdjustType;
            }
        }
        for (NLECompositeTimeAdjustType nLECompositeTimeAdjustType2 : nLECompositeTimeAdjustTypeArr) {
            if (nLECompositeTimeAdjustType2.swigValue == i) {
                return nLECompositeTimeAdjustType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLECompositeTimeAdjustType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLECompositeTimeAdjustType valueOf(String str) {
        return (NLECompositeTimeAdjustType) C08FF.LIZ(NLECompositeTimeAdjustType.class, str);
    }

    NLECompositeTimeAdjustType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLECompositeTimeAdjustType(NLECompositeTimeAdjustType nLECompositeTimeAdjustType) {
        int i = nLECompositeTimeAdjustType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLECompositeTimeAdjustType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
