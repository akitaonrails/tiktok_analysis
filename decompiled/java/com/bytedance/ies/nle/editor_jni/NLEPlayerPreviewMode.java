package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum NLEPlayerPreviewMode {
    STRETCH(0),
    FIT(1),
    FILL(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEPlayerPreviewMode swigToEnum(int i) {
        NLEPlayerPreviewMode[] nLEPlayerPreviewModeArr = (NLEPlayerPreviewMode[]) NLEPlayerPreviewMode.class.getEnumConstants();
        if (i < nLEPlayerPreviewModeArr.length && i >= 0) {
            NLEPlayerPreviewMode nLEPlayerPreviewMode = nLEPlayerPreviewModeArr[i];
            if (nLEPlayerPreviewMode.swigValue == i) {
                return nLEPlayerPreviewMode;
            }
        }
        for (NLEPlayerPreviewMode nLEPlayerPreviewMode2 : nLEPlayerPreviewModeArr) {
            if (nLEPlayerPreviewMode2.swigValue == i) {
                return nLEPlayerPreviewMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEPlayerPreviewMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEPlayerPreviewMode valueOf(String str) {
        return (NLEPlayerPreviewMode) C08FF.LIZ(NLEPlayerPreviewMode.class, str);
    }

    NLEPlayerPreviewMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEPlayerPreviewMode(NLEPlayerPreviewMode nLEPlayerPreviewMode) {
        int i = nLEPlayerPreviewMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEPlayerPreviewMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
