package com.ss.bytertc.engine.mediaio;

import com.ss.bytertc.engine.data.StreamKey;

/* JADX INFO: loaded from: classes21.dex */
public abstract class IRemoteEncodedVideoFrameObserver {
    public abstract void onRemoteEncodedVideoFrame(StreamKey streamKey, RTCEncodedVideoFrame rTCEncodedVideoFrame);
}
