package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEKeyframePropertyType {
    KeyframePropertyVideoTransformX,
    KeyframePropertyVideoTransformY,
    KeyframePropertyVideoScaleX,
    KeyframePropertyVideoScaleY,
    KeyframePropertyVideoRotation,
    KeyframePropertyAlpha,
    KeyframePropertyVolume,
    KeyframePropertyMaskCenterX,
    KeyframePropertyMaskCenterY,
    KeyframePropertyMaskScaleX,
    KeyframePropertyMaskScaleY,
    KeyframePropertyMaskFeather,
    KeyframePropertyMaskWidth,
    KeyframePropertyMaskHeight,
    KeyframePropertyMaskRotation,
    KeyframePropertyMaskRoundCorner;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEKeyframePropertyType swigToEnum(int i) {
        NLEKeyframePropertyType[] nLEKeyframePropertyTypeArr = (NLEKeyframePropertyType[]) NLEKeyframePropertyType.class.getEnumConstants();
        if (i < nLEKeyframePropertyTypeArr.length && i >= 0) {
            NLEKeyframePropertyType nLEKeyframePropertyType = nLEKeyframePropertyTypeArr[i];
            if (nLEKeyframePropertyType.swigValue == i) {
                return nLEKeyframePropertyType;
            }
        }
        for (NLEKeyframePropertyType nLEKeyframePropertyType2 : nLEKeyframePropertyTypeArr) {
            if (nLEKeyframePropertyType2.swigValue == i) {
                return nLEKeyframePropertyType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEKeyframePropertyType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEKeyframePropertyType valueOf(String str) {
        return (NLEKeyframePropertyType) C08FF.LIZ(NLEKeyframePropertyType.class, str);
    }

    NLEKeyframePropertyType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEKeyframePropertyType(NLEKeyframePropertyType nLEKeyframePropertyType) {
        int i = nLEKeyframePropertyType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEKeyframePropertyType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
