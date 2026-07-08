package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum AudioProcessorMethod {
    AUDIO_FRAME_PROCESSOR_RECORD(0),
    AUDIO_FRAME_PROCESSOR_PLAYBACK(1),
    AUDIO_FRAME_PROCESSOR_REMOTE_USER(2),
    AUDIO_FRAME_PROCESSOR_EAR_MONITOR(3),
    AUDIO_FRAME_PROCESSOR_SCREEN(4);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioProcessorMethod$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod;

        static {
            int[] iArr = new int[AudioProcessorMethod.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod = iArr;
            try {
                iArr[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_REMOTE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_EAR_MONITOR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "AUDIO_FRAME_PROCESSOR_SCREEN" : "AUDIO_FRAME_PROCESSOR_EAR_MONITOR" : "AUDIO_FRAME_PROCESSOR_REMOTE_USER" : "AUDIO_FRAME_PROCESSOR_PLAYBACK" : "AUDIO_FRAME_PROCESSOR_RECORD";
    }

    public int value() {
        return this.value;
    }

    public static AudioProcessorMethod fromId(int i) {
        for (AudioProcessorMethod audioProcessorMethod : values()) {
            if (audioProcessorMethod.value() == i) {
                return audioProcessorMethod;
            }
        }
        return null;
    }

    public static AudioProcessorMethod valueOf(String str) {
        return (AudioProcessorMethod) C08FF.LIZ(AudioProcessorMethod.class, str);
    }

    AudioProcessorMethod(int i) {
        this.value = i;
    }
}
