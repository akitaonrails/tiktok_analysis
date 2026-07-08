package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum AudioChannel {
    AUDIO_CHANNEL_AUTO(-1),
    AUDIO_CHANNEL_MONO(1),
    AUDIO_CHANNEL_STEREO(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioChannel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioChannel;

        static {
            int[] iArr = new int[AudioChannel.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioChannel = iArr;
            try {
                iArr[AudioChannel.AUDIO_CHANNEL_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_MONO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_STEREO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioChannel[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "kAudioChannelUnknown" : "kAudioChannelStereo" : "kAudioChannelMono" : "kAudioChannelAuto";
    }

    public int value() {
        return this.value;
    }

    public static AudioChannel fromId(int i) {
        for (AudioChannel audioChannel : values()) {
            if (audioChannel.value() == i) {
                return audioChannel;
            }
        }
        return null;
    }

    public static AudioChannel valueOf(String str) {
        return (AudioChannel) C08FF.LIZ(AudioChannel.class, str);
    }

    AudioChannel(int i) {
        this.value = i;
    }
}
