package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum NLECompileLevel {
    NLECompileLevelReencode(0),
    NLECompileLevelRemux(1),
    NLECompileLevelCopyWithMetadata(2),
    NLECompileLevelCopy(3),
    NLECompileLevelConcatWithMetadata(4),
    NLECompileLevelUploadDirectly(5),
    NLECloudProcessWithMusic(6),
    NLECompileLevelPicUploadDirectly(7),
    NLECompileLevelVideoAndAudioRemux(8);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLECompileLevel swigToEnum(int i) {
        NLECompileLevel[] nLECompileLevelArr = (NLECompileLevel[]) NLECompileLevel.class.getEnumConstants();
        if (i < nLECompileLevelArr.length && i >= 0) {
            NLECompileLevel nLECompileLevel = nLECompileLevelArr[i];
            if (nLECompileLevel.swigValue == i) {
                return nLECompileLevel;
            }
        }
        for (NLECompileLevel nLECompileLevel2 : nLECompileLevelArr) {
            if (nLECompileLevel2.swigValue == i) {
                return nLECompileLevel2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLECompileLevel.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLECompileLevel valueOf(String str) {
        return (NLECompileLevel) C08FF.LIZ(NLECompileLevel.class, str);
    }

    NLECompileLevel() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLECompileLevel(NLECompileLevel nLECompileLevel) {
        int i = nLECompileLevel.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLECompileLevel(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
