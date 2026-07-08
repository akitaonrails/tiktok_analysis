package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEPreviewResampleMode {
    NLEPreviewResampleModeDefault(0),
    NLEPreviewResampleModeLanczos2(1),
    NLEPreviewResampleModeLanczos3(2),
    NLEPreviewResampleModeLanczos3_original(3),
    NLEPreviewResampleModeSuperResolution(4),
    NLEPreviewResampleModeLanczos3_simple(5),
    NLEPreviewResampleModeEasu(6);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEPreviewResampleMode swigToEnum(int i) {
        NLEPreviewResampleMode[] nLEPreviewResampleModeArr = (NLEPreviewResampleMode[]) NLEPreviewResampleMode.class.getEnumConstants();
        if (i < nLEPreviewResampleModeArr.length && i >= 0) {
            NLEPreviewResampleMode nLEPreviewResampleMode = nLEPreviewResampleModeArr[i];
            if (nLEPreviewResampleMode.swigValue == i) {
                return nLEPreviewResampleMode;
            }
        }
        for (NLEPreviewResampleMode nLEPreviewResampleMode2 : nLEPreviewResampleModeArr) {
            if (nLEPreviewResampleMode2.swigValue == i) {
                return nLEPreviewResampleMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEPreviewResampleMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEPreviewResampleMode valueOf(String str) {
        return (NLEPreviewResampleMode) C08FF.LIZ(NLEPreviewResampleMode.class, str);
    }

    NLEPreviewResampleMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEPreviewResampleMode(NLEPreviewResampleMode nLEPreviewResampleMode) {
        int i = nLEPreviewResampleMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEPreviewResampleMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
