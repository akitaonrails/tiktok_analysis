package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEVEEditorMode {
    PREVIEW_COMPILE(0),
    PREVIEW_ONLY(1),
    COMPILE_ONLY(2),
    SNAPSHOT(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEVEEditorMode swigToEnum(int i) {
        NLEVEEditorMode[] nLEVEEditorModeArr = (NLEVEEditorMode[]) NLEVEEditorMode.class.getEnumConstants();
        if (i < nLEVEEditorModeArr.length && i >= 0) {
            NLEVEEditorMode nLEVEEditorMode = nLEVEEditorModeArr[i];
            if (nLEVEEditorMode.swigValue == i) {
                return nLEVEEditorMode;
            }
        }
        for (NLEVEEditorMode nLEVEEditorMode2 : nLEVEEditorModeArr) {
            if (nLEVEEditorMode2.swigValue == i) {
                return nLEVEEditorMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEVEEditorMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEVEEditorMode valueOf(String str) {
        return (NLEVEEditorMode) C08FF.LIZ(NLEVEEditorMode.class, str);
    }

    NLEVEEditorMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEVEEditorMode(NLEVEEditorMode nLEVEEditorMode) {
        int i = nLEVEEditorMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEVEEditorMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
