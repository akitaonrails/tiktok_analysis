package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxVideoPictureType {
    UNKNOWN(0),
    IFRAME(1),
    PFRAME(2),
    BFRAME(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoPictureType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoPictureType;

        static {
            int[] iArr = new int[LyraxVideoPictureType.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoPictureType = iArr;
            try {
                iArr[LyraxVideoPictureType.IFRAME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPictureType[LyraxVideoPictureType.PFRAME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPictureType[LyraxVideoPictureType.BFRAME.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoPictureType[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "kUnknown" : "kBFrame" : "kPFrame" : "kIFrame";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoPictureType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return UNKNOWN;
                    }
                    return BFRAME;
                }
                return PFRAME;
            }
            return IFRAME;
        }
        return UNKNOWN;
    }

    public static LyraxVideoPictureType valueOf(String str) {
        return (LyraxVideoPictureType) C08FF.LIZ(LyraxVideoPictureType.class, str);
    }

    LyraxVideoPictureType(int i) {
        this.value = i;
    }
}
