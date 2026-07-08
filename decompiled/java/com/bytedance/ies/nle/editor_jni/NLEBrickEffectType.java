package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEBrickEffectType {
    BrickAnimator,
    BrickBackground,
    BrickBlendShape,
    BrickMainBody,
    BrickMainLight;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEBrickEffectType swigToEnum(int i) {
        NLEBrickEffectType[] nLEBrickEffectTypeArr = (NLEBrickEffectType[]) NLEBrickEffectType.class.getEnumConstants();
        if (i < nLEBrickEffectTypeArr.length && i >= 0) {
            NLEBrickEffectType nLEBrickEffectType = nLEBrickEffectTypeArr[i];
            if (nLEBrickEffectType.swigValue == i) {
                return nLEBrickEffectType;
            }
        }
        for (NLEBrickEffectType nLEBrickEffectType2 : nLEBrickEffectTypeArr) {
            if (nLEBrickEffectType2.swigValue == i) {
                return nLEBrickEffectType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEBrickEffectType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEBrickEffectType valueOf(String str) {
        return (NLEBrickEffectType) C08FF.LIZ(NLEBrickEffectType.class, str);
    }

    NLEBrickEffectType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEBrickEffectType(NLEBrickEffectType nLEBrickEffectType) {
        int i = nLEBrickEffectType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEBrickEffectType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
