package com.ss.ttlivestreamer.core.engine;

import X.InterfaceC1272820jE8;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;

/* JADX INFO: loaded from: classes21.dex */
public class MediaEditorStream {
    public volatile boolean enableAudioMixer = true;
    public AudioMixer mAudioMixer;
    public long mNativeObj;
    public VideoMixer mVideoMixer;
    public InterfaceC1272820jE8 serviceManager;

    private native void nativeCreateAudioMixer(long j);

    private native void nativeCreateVideoMixer(long j);

    private native long nativeGetAudioMixer(long j);

    private native long nativeGetVideoMixer(long j);

    private native boolean nativeSetAudioMixerDescription(long j, String str, AudioMixer.AudioMixerDescription audioMixerDescription);

    private native void nativeSetOriginAudioTrack(long j, String str);

    private native void nativeSetOriginVideoTrack(long j, String str);

    private native boolean nativeSetVideoMixerDescription(long j, String str, VideoMixer.VideoMixerDescription videoMixerDescription);

    public synchronized void release() {
        if (this.mNativeObj == 0) {
            return;
        }
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.release();
            this.mVideoMixer = null;
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        this.mNativeObj = 0L;
    }

    public void createNativeAudioMixer() {
        nativeCreateAudioMixer(this.mNativeObj);
    }

    public void createNativeVideoMixer() {
        nativeCreateVideoMixer(this.mNativeObj);
    }

    public AudioMixer getAudioMixer() {
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null || !this.enableAudioMixer) {
            return audioMixer;
        }
        AudioMixer audioMixer2 = new AudioMixer(nativeGetAudioMixer(this.mNativeObj));
        this.mAudioMixer = audioMixer2;
        return audioMixer2;
    }

    public VideoMixer getVideoMixer() {
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            return videoMixer;
        }
        VideoMixer videoMixer2 = new VideoMixer(nativeGetVideoMixer(this.mNativeObj));
        videoMixer2.setServiceManager(this.serviceManager);
        this.mVideoMixer = videoMixer2;
        return videoMixer2;
    }

    public MediaEditorStream(long j) {
        this.mNativeObj = j;
    }

    public void enableAudioMixer(boolean z) {
        this.enableAudioMixer = z;
    }

    public void setOriginAudioTrack(String str) {
        nativeSetOriginAudioTrack(this.mNativeObj, str);
    }

    public void setOriginVideoTrack(String str) {
        nativeSetOriginVideoTrack(this.mNativeObj, str);
    }

    public void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8) {
        this.serviceManager = interfaceC1272820jE8;
    }

    public boolean setAudioMixerDescription(String str, AudioMixer.AudioMixerDescription audioMixerDescription) {
        return nativeSetAudioMixerDescription(this.mNativeObj, str, audioMixerDescription);
    }

    public boolean setVideoMixerDescription(String str, VideoMixer.VideoMixerDescription videoMixerDescription) {
        return nativeSetVideoMixerDescription(this.mNativeObj, str, videoMixerDescription);
    }
}
