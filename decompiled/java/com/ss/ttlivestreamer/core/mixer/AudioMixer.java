package com.ss.ttlivestreamer.core.mixer;

import com.ss.ttlivestreamer.core.engine.AudioSink;

/* JADX INFO: loaded from: classes21.dex */
public class AudioMixer extends NativeMixer {
    private native void nativeAddAudioSink(long j, AudioSink audioSink);

    private native void nativeAudioMixerRelease(long j);

    private native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isAudioMixer() {
        return true;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeAudioMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0L;
    }

    public static class AudioMixerDescription {
        public float volumeCoeff;

        public AudioMixerDescription() {
            this.volumeCoeff = 1.0f;
        }

        public float getColumeCoeff() {
            return this.volumeCoeff;
        }

        public AudioMixerDescription(float f) {
            this.volumeCoeff = f;
        }
    }

    public AudioMixer(long j) {
        setNativeObj(j);
    }

    public void addAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    public int createTrack(AudioMixerDescription audioMixerDescription) {
        return super.nativeCreateTrack(audioMixerDescription);
    }

    public AudioMixerDescription getDescription(int i) {
        return (AudioMixerDescription) super.nativeGetDescription(i);
    }

    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }

    public void updateDescription(int i, AudioMixerDescription audioMixerDescription) {
        super.nativeUpdateDescription(i, audioMixerDescription);
    }
}
