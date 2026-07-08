package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.video.VideoStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRemoteEncodedVideoFrameObserver {
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCRemoteEncodedVideoFrameObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void onRemoteEncodedVideoFrame(String str, String str2, int i, VideoStream videoStream, long j, long j2, int i2, int i3, int i4) {
        RTCVideoImpl rTCVideoImpl;
        IRemoteEncodedVideoFrameObserver remoteEncodedVideoFrameObserver;
        if (videoStream == null) {
            return;
        }
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (remoteEncodedVideoFrameObserver = rTCVideoImpl.getRemoteEncodedVideoFrameObserver()) != null) {
            remoteEncodedVideoFrameObserver.onRemoteEncodedVideoFrame(new StreamKey(str, str2, StreamIndex.fromId(i)), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        videoStream.release();
    }
}
