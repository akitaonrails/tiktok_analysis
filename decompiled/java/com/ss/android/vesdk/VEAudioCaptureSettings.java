package com.ss.android.vesdk;

import X.EnumC2217951BrN;
import android.util.Pair;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.nativePort.TESystemUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public class VEAudioCaptureSettings {
    public int audioSource;
    public int bitSamples;
    public int channel;
    public int dataStore;
    public boolean enableSysKaraoke;
    public int framesPerBuffer;
    public boolean lowLatency;
    public HashMap<EnumC2217951BrN, Cert> mAudioPrivacyCertMap;
    public boolean preferBuiltinMicInBluetoothScene;
    public int sampleRate;

    public static class Builder {
        public VEAudioCaptureSettings settings;

        public Builder() {
            this.settings = new VEAudioCaptureSettings();
        }

        public VEAudioCaptureSettings build() {
            return this.settings;
        }

        public Builder(VEAudioCaptureSettings vEAudioCaptureSettings) {
            new VEAudioCaptureSettings();
            this.settings = vEAudioCaptureSettings;
        }

        public Builder enableSysKaraoke(boolean z) {
            this.settings.enableSysKaraoke = z;
            return this;
        }

        public Builder preferBuiltinMicInBluetoothScene(boolean z) {
            this.settings.preferBuiltinMicInBluetoothScene = z;
            return this;
        }

        public Builder setAudioCaptureLowLatency(boolean z) {
            if (z) {
                Pair<Integer, Integer> suggestedOutputProperty = TESystemUtils.getSuggestedOutputProperty();
                if (suggestedOutputProperty != null) {
                    this.settings.sampleRate = ((Integer) suggestedOutputProperty.first).intValue();
                    this.settings.framesPerBuffer = ((Integer) suggestedOutputProperty.second).intValue();
                }
            } else {
                VEAudioCaptureSettings vEAudioCaptureSettings = this.settings;
                vEAudioCaptureSettings.sampleRate = 44100;
                vEAudioCaptureSettings.framesPerBuffer = 256;
            }
            this.settings.lowLatency = z;
            return this;
        }

        public Builder setAudioDataStore(int i) {
            this.settings.dataStore = i;
            return this;
        }

        public Builder setAudioPrivacyCertMap(HashMap<EnumC2217951BrN, Cert> map) {
            this.settings.mAudioPrivacyCertMap = map;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.settings.audioSource = i;
            return this;
        }

        public Builder setBitSamples(int i) {
            this.settings.bitSamples = i;
            return this;
        }

        public Builder setChannel(int i) {
            this.settings.channel = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            this.settings.sampleRate = i;
            return this;
        }
    }

    public VEAudioCaptureSettings() {
        this.channel = 2;
        this.sampleRate = 44100;
        this.bitSamples = 16;
        this.audioSource = 1;
        this.framesPerBuffer = 256;
        this.preferBuiltinMicInBluetoothScene = true;
    }

    public HashMap<EnumC2217951BrN, Cert> getAudioPrivacyCertMap() {
        return this.mAudioPrivacyCertMap;
    }

    public int getAudioSource() {
        return this.audioSource;
    }

    public int getBitSamples() {
        return this.bitSamples;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getDataStore() {
        return this.dataStore;
    }

    public int getFramesPerBuffer() {
        return this.framesPerBuffer;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public boolean isEnableSysKaraoke() {
        return this.enableSysKaraoke;
    }

    public boolean isLowLatency() {
        return this.lowLatency;
    }

    public boolean isPreferBuiltinMicInBluetoothScene() {
        return this.preferBuiltinMicInBluetoothScene;
    }
}
