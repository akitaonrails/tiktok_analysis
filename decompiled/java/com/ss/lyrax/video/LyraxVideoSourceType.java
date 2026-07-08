package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoSourceType {
    EXTERNAL_RAW_FRAME(0),
    INTERNAL_RAW_FRAME(1),
    EXTERNAL_ENCODED_WITH_AUTO_SIMULCAST(2),
    EXTERNAL_ENCODED_WITHOUT_AUTO_SIMULCAST(3),
    EXTERNAL_FILE_RAW_FRAME(4);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoSourceType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType;

        static {
            int[] iArr = new int[LyraxVideoSourceType.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType = iArr;
            try {
                iArr[LyraxVideoSourceType.EXTERNAL_RAW_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType[LyraxVideoSourceType.INTERNAL_RAW_FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType[LyraxVideoSourceType.EXTERNAL_ENCODED_WITH_AUTO_SIMULCAST.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType[LyraxVideoSourceType.EXTERNAL_ENCODED_WITHOUT_AUTO_SIMULCAST.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType[LyraxVideoSourceType.EXTERNAL_FILE_RAW_FRAME.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoSourceType[ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "kExternalRawFrame" : "kExternalFileRawFrame" : "kExternalEncodedWithoutAutoSimulcast" : "kExternalEncodedWithAutoSimulcast" : "kInternalRawFrame";
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoSourceType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return EXTERNAL_RAW_FRAME;
                        }
                        return EXTERNAL_FILE_RAW_FRAME;
                    }
                    return EXTERNAL_ENCODED_WITHOUT_AUTO_SIMULCAST;
                }
                return EXTERNAL_ENCODED_WITH_AUTO_SIMULCAST;
            }
            return INTERNAL_RAW_FRAME;
        }
        return EXTERNAL_RAW_FRAME;
    }

    public static LyraxVideoSourceType valueOf(String str) {
        return (LyraxVideoSourceType) C08FF.LIZ(LyraxVideoSourceType.class, str);
    }

    LyraxVideoSourceType(int i) {
        this.value = i;
    }
}
