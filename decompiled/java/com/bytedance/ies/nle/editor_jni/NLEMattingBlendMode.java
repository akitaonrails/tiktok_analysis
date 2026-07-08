package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEMattingBlendMode {
    NLEMattingBlendModeNormal(0),
    NLEMattingBlendModePreview(1),
    NLEMattingBlendModeNormalWithBackgroud(2),
    NLEMattingBlendModeNone(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEMattingBlendMode swigToEnum(int i) {
        NLEMattingBlendMode[] nLEMattingBlendModeArr = (NLEMattingBlendMode[]) NLEMattingBlendMode.class.getEnumConstants();
        if (i < nLEMattingBlendModeArr.length && i >= 0) {
            NLEMattingBlendMode nLEMattingBlendMode = nLEMattingBlendModeArr[i];
            if (nLEMattingBlendMode.swigValue == i) {
                return nLEMattingBlendMode;
            }
        }
        for (NLEMattingBlendMode nLEMattingBlendMode2 : nLEMattingBlendModeArr) {
            if (nLEMattingBlendMode2.swigValue == i) {
                return nLEMattingBlendMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEMattingBlendMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEMattingBlendMode valueOf(String str) {
        return (NLEMattingBlendMode) C08FF.LIZ(NLEMattingBlendMode.class, str);
    }

    NLEMattingBlendMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEMattingBlendMode(NLEMattingBlendMode nLEMattingBlendMode) {
        int i = nLEMattingBlendMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEMattingBlendMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
