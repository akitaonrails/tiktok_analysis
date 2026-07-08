package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEStickerAnimType {
    Atomic(0),
    In(1),
    Out(2),
    Loop(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEStickerAnimType swigToEnum(int i) {
        NLEStickerAnimType[] nLEStickerAnimTypeArr = (NLEStickerAnimType[]) NLEStickerAnimType.class.getEnumConstants();
        if (i < nLEStickerAnimTypeArr.length && i >= 0) {
            NLEStickerAnimType nLEStickerAnimType = nLEStickerAnimTypeArr[i];
            if (nLEStickerAnimType.swigValue == i) {
                return nLEStickerAnimType;
            }
        }
        for (NLEStickerAnimType nLEStickerAnimType2 : nLEStickerAnimTypeArr) {
            if (nLEStickerAnimType2.swigValue == i) {
                return nLEStickerAnimType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEStickerAnimType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEStickerAnimType valueOf(String str) {
        return (NLEStickerAnimType) C08FF.LIZ(NLEStickerAnimType.class, str);
    }

    NLEStickerAnimType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEStickerAnimType(NLEStickerAnimType nLEStickerAnimType) {
        int i = nLEStickerAnimType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEStickerAnimType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
