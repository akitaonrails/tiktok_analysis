package com.ss.ttlivestreamer.core.engine;

import X.C1269610j8x;
import X.InterfaceC1269980j9Y;
import android.os.Bundle;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VideoSink extends NativeObject implements InterfaceC1269980j9Y {
    public abstract void OnDiscardedFrame();

    public /* bridge */ /* synthetic */ void appendSerializedEvent(C1269610j8x c1269610j8x) {
    }

    public /* bridge */ /* synthetic */ void appendSerializedEventWithReplace(C1269610j8x c1269610j8x) {
    }

    public /* bridge */ /* synthetic */ void appendSerializedEvents(List list) {
    }

    public float getAvgRenderCountAndInvalidate() {
        return -1.0f;
    }

    public long getLatestRenderCostMs() {
        return 0L;
    }

    public String getNodeName() {
        return "";
    }

    public /* bridge */ /* synthetic */ void handleSerializedEvents(List list) {
    }

    public void onData(VideoFrame videoFrame, Bundle bundle) {
    }

    public abstract void onFrame(VideoFrame videoFrame);

    public /* bridge */ /* synthetic */ void tryDeliverEvents(VideoFrame videoFrame, List list) {
    }

    public void onFrameOnJava(VideoFrame videoFrame) {
        onFrame(videoFrame);
    }
}
