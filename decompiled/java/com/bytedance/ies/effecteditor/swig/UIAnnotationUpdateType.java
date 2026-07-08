package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum UIAnnotationUpdateType {
    UIAnnotationUpdateType_Preview(0),
    UIAnnotationUpdateType_Done;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationUpdateType swigToEnum(int i) {
        UIAnnotationUpdateType[] uIAnnotationUpdateTypeArr = (UIAnnotationUpdateType[]) UIAnnotationUpdateType.class.getEnumConstants();
        if (i < uIAnnotationUpdateTypeArr.length && i >= 0) {
            UIAnnotationUpdateType uIAnnotationUpdateType = uIAnnotationUpdateTypeArr[i];
            if (uIAnnotationUpdateType.swigValue == i) {
                return uIAnnotationUpdateType;
            }
        }
        for (UIAnnotationUpdateType uIAnnotationUpdateType2 : uIAnnotationUpdateTypeArr) {
            if (uIAnnotationUpdateType2.swigValue == i) {
                return uIAnnotationUpdateType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationUpdateType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationUpdateType valueOf(String str) {
        return (UIAnnotationUpdateType) C08FF.LIZ(UIAnnotationUpdateType.class, str);
    }

    UIAnnotationUpdateType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationUpdateType(UIAnnotationUpdateType uIAnnotationUpdateType) {
        int i = uIAnnotationUpdateType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationUpdateType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
