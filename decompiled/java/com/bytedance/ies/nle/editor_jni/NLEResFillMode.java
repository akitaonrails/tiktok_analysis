package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEResFillMode {
    RES_FILL_MODE_NONE(0),
    RES_FILL_MODE_ASPECT_FILL(1),
    RES_FILL_MODE_ASPECT_WIDTH(2),
    RES_FILL_MODE_ASPECT_FIT(3),
    RES_FILL_MODE_FREE_MODE(4),
    RES_FILL_MODE_CENTER_ZOOM(5),
    RES_FILL_MODE_FREE_MODE_ROT(6),
    RES_FILL_MODE_CENTER_ZOOM_AND_ASPECT_WIDTH(7);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEResFillMode swigToEnum(int i) {
        NLEResFillMode[] nLEResFillModeArr = (NLEResFillMode[]) NLEResFillMode.class.getEnumConstants();
        if (i < nLEResFillModeArr.length && i >= 0) {
            NLEResFillMode nLEResFillMode = nLEResFillModeArr[i];
            if (nLEResFillMode.swigValue == i) {
                return nLEResFillMode;
            }
        }
        for (NLEResFillMode nLEResFillMode2 : nLEResFillModeArr) {
            if (nLEResFillMode2.swigValue == i) {
                return nLEResFillMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEResFillMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEResFillMode valueOf(String str) {
        return (NLEResFillMode) C08FF.LIZ(NLEResFillMode.class, str);
    }

    NLEResFillMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEResFillMode(NLEResFillMode nLEResFillMode) {
        int i = nLEResFillMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEResFillMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
