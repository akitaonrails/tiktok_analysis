package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum UIAnnotationNumberDisplayMode {
    UIAnnotationNumberDisplayMode_PercentWithoutSign(0),
    UIAnnotationNumberDisplayMode_Percent(1),
    UIAnnotationNumberDisplayMode_Raw(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationNumberDisplayMode swigToEnum(int i) {
        UIAnnotationNumberDisplayMode[] uIAnnotationNumberDisplayModeArr = (UIAnnotationNumberDisplayMode[]) UIAnnotationNumberDisplayMode.class.getEnumConstants();
        if (i < uIAnnotationNumberDisplayModeArr.length && i >= 0) {
            UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode = uIAnnotationNumberDisplayModeArr[i];
            if (uIAnnotationNumberDisplayMode.swigValue == i) {
                return uIAnnotationNumberDisplayMode;
            }
        }
        for (UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode2 : uIAnnotationNumberDisplayModeArr) {
            if (uIAnnotationNumberDisplayMode2.swigValue == i) {
                return uIAnnotationNumberDisplayMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationNumberDisplayMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationNumberDisplayMode valueOf(String str) {
        return (UIAnnotationNumberDisplayMode) C08FF.LIZ(UIAnnotationNumberDisplayMode.class, str);
    }

    UIAnnotationNumberDisplayMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationNumberDisplayMode(UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode) {
        int i = uIAnnotationNumberDisplayMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationNumberDisplayMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
