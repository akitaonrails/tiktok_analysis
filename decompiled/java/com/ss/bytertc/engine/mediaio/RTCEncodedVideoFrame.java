package com.ss.bytertc.engine.mediaio;

import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class RTCEncodedVideoFrame {
    public final ByteBuffer buffer;
    public int height;
    public long timestampDtsUs;
    public long timestampUs;
    public VideoCodecType videoCodecType;
    public VideoPictureType videoPictureType;
    public VideoRotation videoRotation;
    public int width;

    public RTCEncodedVideoFrame(ByteBuffer byteBuffer, long j, long j2, int i, int i2, VideoCodecType videoCodecType, VideoPictureType videoPictureType, VideoRotation videoRotation) {
        this.buffer = byteBuffer;
        this.timestampUs = j;
        this.timestampDtsUs = j2;
        this.width = i;
        this.height = i2;
        this.videoCodecType = videoCodecType;
        this.videoPictureType = videoPictureType;
        this.videoRotation = videoRotation;
    }
}
