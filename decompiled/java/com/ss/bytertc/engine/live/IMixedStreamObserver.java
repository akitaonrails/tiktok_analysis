package com.ss.bytertc.engine.live;

import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IMixedStreamObserver {
    boolean isSupportClientPushStream();

    void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i);

    void onMixingAudioFrame(String str, byte[] bArr, int i, long j);

    void onMixingDataFrame(String str, byte[] bArr, long j);

    void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, int i, String str2, MixedStreamType mixedStreamType);

    void onMixingVideoFrame(String str, VideoFrame videoFrame);
}
