package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum UIAnnotationCallbackMoreFunctionType {
    UIAnnotationCallbackMoreFunction_Unknown(0),
    UIAnnotationCallbackMoreFunction_Single,
    UIAnnotationCallbackMoreFunction_OneToMany,
    UIAnnotationCallbackMoreFunction_OneToOne;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationCallbackMoreFunctionType swigToEnum(int i) {
        UIAnnotationCallbackMoreFunctionType[] uIAnnotationCallbackMoreFunctionTypeArr = (UIAnnotationCallbackMoreFunctionType[]) UIAnnotationCallbackMoreFunctionType.class.getEnumConstants();
        if (i < uIAnnotationCallbackMoreFunctionTypeArr.length && i >= 0) {
            UIAnnotationCallbackMoreFunctionType uIAnnotationCallbackMoreFunctionType = uIAnnotationCallbackMoreFunctionTypeArr[i];
            if (uIAnnotationCallbackMoreFunctionType.swigValue == i) {
                return uIAnnotationCallbackMoreFunctionType;
            }
        }
        for (UIAnnotationCallbackMoreFunctionType uIAnnotationCallbackMoreFunctionType2 : uIAnnotationCallbackMoreFunctionTypeArr) {
            if (uIAnnotationCallbackMoreFunctionType2.swigValue == i) {
                return uIAnnotationCallbackMoreFunctionType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationCallbackMoreFunctionType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationCallbackMoreFunctionType valueOf(String str) {
        return (UIAnnotationCallbackMoreFunctionType) C08FF.LIZ(UIAnnotationCallbackMoreFunctionType.class, str);
    }

    UIAnnotationCallbackMoreFunctionType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationCallbackMoreFunctionType(UIAnnotationCallbackMoreFunctionType uIAnnotationCallbackMoreFunctionType) {
        int i = uIAnnotationCallbackMoreFunctionType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationCallbackMoreFunctionType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
