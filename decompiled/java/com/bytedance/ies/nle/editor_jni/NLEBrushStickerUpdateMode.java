package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEBrushStickerUpdateMode {
    UPDATE_SYNC_MODE(0),
    UPDATE_ASYNC_MODE,
    UPDATE_ASYNC_HIGH_PRIORITY_MODE,
    UPDATE_DIRECT_MODE;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEBrushStickerUpdateMode swigToEnum(int i) {
        NLEBrushStickerUpdateMode[] nLEBrushStickerUpdateModeArr = (NLEBrushStickerUpdateMode[]) NLEBrushStickerUpdateMode.class.getEnumConstants();
        if (i < nLEBrushStickerUpdateModeArr.length && i >= 0) {
            NLEBrushStickerUpdateMode nLEBrushStickerUpdateMode = nLEBrushStickerUpdateModeArr[i];
            if (nLEBrushStickerUpdateMode.swigValue == i) {
                return nLEBrushStickerUpdateMode;
            }
        }
        for (NLEBrushStickerUpdateMode nLEBrushStickerUpdateMode2 : nLEBrushStickerUpdateModeArr) {
            if (nLEBrushStickerUpdateMode2.swigValue == i) {
                return nLEBrushStickerUpdateMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEBrushStickerUpdateMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEBrushStickerUpdateMode valueOf(String str) {
        return (NLEBrushStickerUpdateMode) C08FF.LIZ(NLEBrushStickerUpdateMode.class, str);
    }

    NLEBrushStickerUpdateMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEBrushStickerUpdateMode(NLEBrushStickerUpdateMode nLEBrushStickerUpdateMode) {
        int i = nLEBrushStickerUpdateMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEBrushStickerUpdateMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
