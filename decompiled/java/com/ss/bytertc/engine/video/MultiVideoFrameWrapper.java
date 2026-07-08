package com.ss.bytertc.engine.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public class MultiVideoFrameWrapper {
    public final Type frameType;
    public final Object videoFrame;

    public boolean isByteRTCVideoFrame() {
        return this.frameType == Type.BYTE_RTC_FRAME;
    }

    public boolean isWebRTCVideoFrame() {
        return this.frameType == Type.WEB_RTC_FRAME;
    }

    public Object getVideoFrame() {
        return this.videoFrame;
    }

    public enum Type {
        BYTE_RTC_FRAME,
        WEB_RTC_FRAME;

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }
    }

    public MultiVideoFrameWrapper(com.bytedance.realx.video.VideoFrame videoFrame) {
        this.videoFrame = videoFrame;
        this.frameType = Type.WEB_RTC_FRAME;
    }

    public MultiVideoFrameWrapper(VideoFrame videoFrame) {
        this.videoFrame = videoFrame;
        this.frameType = Type.BYTE_RTC_FRAME;
    }
}
