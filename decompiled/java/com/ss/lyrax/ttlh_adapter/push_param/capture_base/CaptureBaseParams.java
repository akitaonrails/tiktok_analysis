package com.ss.lyrax.ttlh_adapter.push_param.capture_base;

/* JADX INFO: loaded from: classes21.dex */
public class CaptureBaseParams {
    public AudioCaptureParams audioCaptureParams;
    public VideoCaptureParams videoCaptureParams;

    public CaptureBaseParams() {
        this.audioCaptureParams = new AudioCaptureParams();
        this.videoCaptureParams = new VideoCaptureParams();
    }

    public void setIncrementalParsing(boolean z) {
        AudioCaptureParams audioCaptureParams = this.audioCaptureParams;
        if (audioCaptureParams != null) {
            audioCaptureParams.setIncrementalParsing(z);
        }
        VideoCaptureParams videoCaptureParams = this.videoCaptureParams;
        if (videoCaptureParams != null) {
            videoCaptureParams.setIncrementalParsing(z);
        }
    }

    public CaptureBaseParams(AudioCaptureParams audioCaptureParams, VideoCaptureParams videoCaptureParams) {
        this.audioCaptureParams = new AudioCaptureParams();
        new VideoCaptureParams();
        this.audioCaptureParams = audioCaptureParams;
        this.videoCaptureParams = videoCaptureParams;
    }
}
