package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum UIAnnotationChangedType {
    UIAnnotationChangedType_None(0),
    UIAnnotationChangedType_Texture,
    UIAnnotationChangedType_Sequence,
    UIAnnotationChangedType_Video,
    UIAnnotationChangedType_Number,
    UIAnnotationChangedType_Text,
    UIAnnotationChangedType_Option,
    UIAnnotationChangedType_Cache;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationChangedType swigToEnum(int i) {
        UIAnnotationChangedType[] uIAnnotationChangedTypeArr = (UIAnnotationChangedType[]) UIAnnotationChangedType.class.getEnumConstants();
        if (i < uIAnnotationChangedTypeArr.length && i >= 0) {
            UIAnnotationChangedType uIAnnotationChangedType = uIAnnotationChangedTypeArr[i];
            if (uIAnnotationChangedType.swigValue == i) {
                return uIAnnotationChangedType;
            }
        }
        for (UIAnnotationChangedType uIAnnotationChangedType2 : uIAnnotationChangedTypeArr) {
            if (uIAnnotationChangedType2.swigValue == i) {
                return uIAnnotationChangedType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationChangedType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationChangedType valueOf(String str) {
        return (UIAnnotationChangedType) C08FF.LIZ(UIAnnotationChangedType.class, str);
    }

    UIAnnotationChangedType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationChangedType(UIAnnotationChangedType uIAnnotationChangedType) {
        int i = uIAnnotationChangedType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationChangedType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
