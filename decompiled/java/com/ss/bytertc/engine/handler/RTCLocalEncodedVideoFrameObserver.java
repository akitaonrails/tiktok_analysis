package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.video.VideoStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class RTCLocalEncodedVideoFrameObserver {
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCLocalEncodedVideoFrameObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void onLocalEncodedVideoFrame(int i, VideoStream videoStream, long j, long j2, int i2, int i3, int i4) {
        RTCVideoImpl rTCVideoImpl;
        ILocalEncodedVideoFrameObserver encodedVideoFrameObserver;
        if (videoStream == null) {
            return;
        }
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (encodedVideoFrameObserver = rTCVideoImpl.getEncodedVideoFrameObserver()) != null) {
            encodedVideoFrameObserver.onLocalEncodedVideoFrame(StreamIndex.fromId(i), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        videoStream.release();
    }
}
