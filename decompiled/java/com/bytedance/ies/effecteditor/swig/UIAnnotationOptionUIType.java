package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum UIAnnotationOptionUIType {
    UIAnnotationOptionUIType_Texture(0),
    UIAnnotationOptionUIType_Unknown;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationOptionUIType swigToEnum(int i) {
        UIAnnotationOptionUIType[] uIAnnotationOptionUITypeArr = (UIAnnotationOptionUIType[]) UIAnnotationOptionUIType.class.getEnumConstants();
        if (i < uIAnnotationOptionUITypeArr.length && i >= 0) {
            UIAnnotationOptionUIType uIAnnotationOptionUIType = uIAnnotationOptionUITypeArr[i];
            if (uIAnnotationOptionUIType.swigValue == i) {
                return uIAnnotationOptionUIType;
            }
        }
        for (UIAnnotationOptionUIType uIAnnotationOptionUIType2 : uIAnnotationOptionUITypeArr) {
            if (uIAnnotationOptionUIType2.swigValue == i) {
                return uIAnnotationOptionUIType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationOptionUIType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationOptionUIType valueOf(String str) {
        return (UIAnnotationOptionUIType) C08FF.LIZ(UIAnnotationOptionUIType.class, str);
    }

    UIAnnotationOptionUIType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationOptionUIType(UIAnnotationOptionUIType uIAnnotationOptionUIType) {
        int i = uIAnnotationOptionUIType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationOptionUIType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
