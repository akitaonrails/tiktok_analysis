package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum UIAnnotationCallbackMoreType {
    UIAnnotationCallbackMoreType_Unknown(0),
    UIAnnotationCallbackMoreType_Property,
    UIAnnotationCallbackMoreType_Method,
    UIAnnotationCallbackMoreType_ScriptMethod;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationCallbackMoreType swigToEnum(int i) {
        UIAnnotationCallbackMoreType[] uIAnnotationCallbackMoreTypeArr = (UIAnnotationCallbackMoreType[]) UIAnnotationCallbackMoreType.class.getEnumConstants();
        if (i < uIAnnotationCallbackMoreTypeArr.length && i >= 0) {
            UIAnnotationCallbackMoreType uIAnnotationCallbackMoreType = uIAnnotationCallbackMoreTypeArr[i];
            if (uIAnnotationCallbackMoreType.swigValue == i) {
                return uIAnnotationCallbackMoreType;
            }
        }
        for (UIAnnotationCallbackMoreType uIAnnotationCallbackMoreType2 : uIAnnotationCallbackMoreTypeArr) {
            if (uIAnnotationCallbackMoreType2.swigValue == i) {
                return uIAnnotationCallbackMoreType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationCallbackMoreType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationCallbackMoreType valueOf(String str) {
        return (UIAnnotationCallbackMoreType) C08FF.LIZ(UIAnnotationCallbackMoreType.class, str);
    }

    UIAnnotationCallbackMoreType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationCallbackMoreType(UIAnnotationCallbackMoreType uIAnnotationCallbackMoreType) {
        int i = uIAnnotationCallbackMoreType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationCallbackMoreType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
