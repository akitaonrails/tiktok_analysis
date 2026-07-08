package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;

/* JADX INFO: loaded from: classes21.dex */
public abstract class IExternalVideoEncoderEventHandler {
    public abstract void onActiveVideoLayer(StreamIndex streamIndex, int i, boolean z);

    public abstract void onRateUpdate(StreamIndex streamIndex, int i, int i2, int i3);

    public abstract void onRequestKeyFrame(StreamIndex streamIndex, int i);

    public abstract void onStart(StreamIndex streamIndex);

    public abstract void onStop(StreamIndex streamIndex);
}
