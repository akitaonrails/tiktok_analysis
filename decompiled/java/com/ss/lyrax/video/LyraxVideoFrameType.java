package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoFrameType {
    UNKNOWN(0),
    RAW_MEMORY(1),
    GL_TEXTURE(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoFrameType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoFrameType;

        static {
            int[] iArr = new int[LyraxVideoFrameType.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoFrameType = iArr;
            try {
                iArr[LyraxVideoFrameType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoFrameType[LyraxVideoFrameType.RAW_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoFrameType[LyraxVideoFrameType.GL_TEXTURE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoFrameType[ordinal()];
        return i != 2 ? i != 3 ? "kUnknown" : "kGlTexture" : "kRawMemory";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoFrameType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return UNKNOWN;
                }
                return GL_TEXTURE;
            }
            return RAW_MEMORY;
        }
        return UNKNOWN;
    }

    public static LyraxVideoFrameType valueOf(String str) {
        return (LyraxVideoFrameType) C08FF.LIZ(LyraxVideoFrameType.class, str);
    }

    LyraxVideoFrameType(int i) {
        this.value = i;
    }
}
