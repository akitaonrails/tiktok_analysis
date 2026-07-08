package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum AudioPlaybackDevice {
    AUDIO_PLAYBACK_DEVICE_HEADSET(1),
    AUDIO_PLAYBACK_DEVICE_EARPIECE(2),
    AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE(3),
    AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH(4),
    AUDIO_PLAYBACK_DEVICE_HEADSET_USB(5);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioPlaybackDevice$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice;

        static {
            int[] iArr = new int[AudioPlaybackDevice.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice = iArr;
            try {
                iArr[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_USB.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "kAudioPlaybackDeviceHeadsetUSB" : "kAudioPlaybackDeviceHeadsetBluetooth" : "kAudioPlaybackDeviceHeadset" : "kAudioPlaybackDeviceEarpiece" : "kAudioPlaybackDeviceSpeakerphone";
    }

    public int value() {
        return this.value;
    }

    public static AudioPlaybackDevice fromId(int i) {
        for (AudioPlaybackDevice audioPlaybackDevice : values()) {
            if (audioPlaybackDevice.value() == i) {
                return audioPlaybackDevice;
            }
        }
        return null;
    }

    public static AudioPlaybackDevice valueOf(String str) {
        return (AudioPlaybackDevice) C08FF.LIZ(AudioPlaybackDevice.class, str);
    }

    AudioPlaybackDevice(int i) {
        this.value = i;
    }
}
