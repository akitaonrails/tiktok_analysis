package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEBrushOption {
    BrushNone(0),
    BrushBegin(1),
    BrushEnd(2),
    BrushUndo(4),
    BrushRedo(8),
    BrushClear(16),
    BrushSetParam(32),
    BrushSetResource(64),
    BrushTouchDown(128),
    BrushTouchPan(256),
    BrushTouchUp(512),
    BrushSavePng(1024),
    BrushToSnapshot(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE),
    BrushBatchPan(SpeechEngineDefines.TTS_WORK_MODE_BOTH),
    BrushTransform(8192),
    BrushMultiUndo(16384);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEBrushOption swigToEnum(int i) {
        NLEBrushOption[] nLEBrushOptionArr = (NLEBrushOption[]) NLEBrushOption.class.getEnumConstants();
        if (i < nLEBrushOptionArr.length && i >= 0) {
            NLEBrushOption nLEBrushOption = nLEBrushOptionArr[i];
            if (nLEBrushOption.swigValue == i) {
                return nLEBrushOption;
            }
        }
        for (NLEBrushOption nLEBrushOption2 : nLEBrushOptionArr) {
            if (nLEBrushOption2.swigValue == i) {
                return nLEBrushOption2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEBrushOption.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEBrushOption valueOf(String str) {
        return (NLEBrushOption) C08FF.LIZ(NLEBrushOption.class, str);
    }

    NLEBrushOption() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEBrushOption(NLEBrushOption nLEBrushOption) {
        int i = nLEBrushOption.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEBrushOption(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
