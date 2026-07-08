package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.RefCounted;
import com.ss.bytertc.engine.type.VideoStrategyChannelResult;

/* JADX INFO: loaded from: classes21.dex */
public class VideoStrategyResultListener implements RefCounted, IVideoStrategyResultListener {
    public final long handle;

    public static native void nativeOnVideoStrategyResult(long j, VideoStrategyChannelResult[] videoStrategyChannelResultArr);

    @Override // com.bytedance.realx.base.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.handle);
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.handle);
    }

    public void finalize() {
        release();
    }

    public VideoStrategyResultListener(long j) {
        if (j != 0) {
            Logging.e("VideoStrategyResultListener", "VideoStrategyResultListener create");
            this.handle = j;
            retain();
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    @Override // com.ss.bytertc.engine.video.IVideoStrategyResultListener
    public void onVideoStrategyResult(VideoStrategyChannelResult[] videoStrategyChannelResultArr) {
        nativeOnVideoStrategyResult(this.handle, videoStrategyChannelResultArr);
    }
}
