package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioSceneType {
    DEFAULT(0),
    CHAT_ROOM(1),
    HIGH_QUALITY_CHAT_ROOM(2),
    LOW_LATENCY(3),
    KARAOKE(4);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioSceneType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType;

        static {
            int[] iArr = new int[LyraxAudioSceneType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType = iArr;
            try {
                iArr[LyraxAudioSceneType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType[LyraxAudioSceneType.CHAT_ROOM.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType[LyraxAudioSceneType.HIGH_QUALITY_CHAT_ROOM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType[LyraxAudioSceneType.LOW_LATENCY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType[LyraxAudioSceneType.KARAOKE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioSceneType[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i == 5 ? "KARAOKE" : LivePreviewCTASmartDisplayManager.DEFAULT : "LOW_LATENCY" : "HIGH_QUALITY_CHAT_ROOM" : "CHAT_ROOM" : LivePreviewCTASmartDisplayManager.DEFAULT;
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioSceneType fromId(int i) {
        for (LyraxAudioSceneType lyraxAudioSceneType : values()) {
            if (lyraxAudioSceneType.value() == i) {
                return lyraxAudioSceneType;
            }
        }
        return DEFAULT;
    }

    public static LyraxAudioSceneType valueOf(String str) {
        return (LyraxAudioSceneType) C08FF.LIZ(LyraxAudioSceneType.class, str);
    }

    LyraxAudioSceneType(int i) {
        this.value = i;
    }
}
