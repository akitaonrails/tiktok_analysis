package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoContentType {
    CAMERA(0),
    SCREEN(1),
    FILE(4);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoContentType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoContentType;

        static {
            int[] iArr = new int[LyraxVideoContentType.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoContentType = iArr;
            try {
                iArr[LyraxVideoContentType.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoContentType[LyraxVideoContentType.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoContentType[LyraxVideoContentType.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoContentType[ordinal()];
        return i != 2 ? i != 3 ? "kCamera" : "kFile" : "kScreen";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoContentType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    return CAMERA;
                }
                return FILE;
            }
            return SCREEN;
        }
        return CAMERA;
    }

    public static LyraxVideoContentType valueOf(String str) {
        return (LyraxVideoContentType) C08FF.LIZ(LyraxVideoContentType.class, str);
    }

    LyraxVideoContentType(int i) {
        this.value = i;
    }
}
