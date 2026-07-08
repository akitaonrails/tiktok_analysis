package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum KeyframeType {
    AudioKeyframe(0),
    ChromaKeyframe(1),
    FilterKeyframe(2),
    MaskKeyframe(3),
    StickerKeyframe(4),
    TextKeyframe(5),
    VideoKeyframe(6);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static KeyframeType swigToEnum(int i) {
        KeyframeType[] keyframeTypeArr = (KeyframeType[]) KeyframeType.class.getEnumConstants();
        if (i < keyframeTypeArr.length && i >= 0) {
            KeyframeType keyframeType = keyframeTypeArr[i];
            if (keyframeType.swigValue == i) {
                return keyframeType;
            }
        }
        for (KeyframeType keyframeType2 : keyframeTypeArr) {
            if (keyframeType2.swigValue == i) {
                return keyframeType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(KeyframeType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static KeyframeType valueOf(String str) {
        return (KeyframeType) C08FF.LIZ(KeyframeType.class, str);
    }

    KeyframeType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    KeyframeType(KeyframeType keyframeType) {
        int i = keyframeType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    KeyframeType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
