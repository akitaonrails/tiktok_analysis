package com.ss.bytertc.engine.adapter;

import X.C1C7U;
import X.C2179971ATj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameSinkAdapter implements IVideoSink {
    public com.ss.bytertc.engine.mediaio.IVideoSink mBridgedOldSink;
    public boolean mDirectPush;
    public boolean mInitialized;
    public IVideoSink mSink;
    public boolean mStarted;
    public VideoSinkTask mVideoSinkTask;

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public int getRenderElapse() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getRenderElapse();
        }
        com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink2 = this.mBridgedOldSink;
        if (iVideoSink2 != null) {
            return iVideoSink2.getRenderElapse();
        }
        return 0;
    }

    public void release() {
        VideoSinkTask videoSinkTask;
        if (this.mBridgedOldSink == null || (videoSinkTask = this.mVideoSinkTask) == null) {
            return;
        }
        videoSinkTask.post(new Runnable() { // from class: com.ss.bytertc.engine.adapter.VideoFrameSinkAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("VideoFrameSinkAdapter@53da.release$1");
                com_ss_bytertc_engine_adapter_VideoFrameSinkAdapter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("VideoFrameSinkAdapter@53da.release$1");
            }

            public void com_ss_bytertc_engine_adapter_VideoFrameSinkAdapter$1__run$___twin___() {
                com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink = VideoFrameSinkAdapter.this.mBridgedOldSink;
                if (iVideoSink != null) {
                    iVideoSink.onStop();
                    VideoFrameSinkAdapter.this.mBridgedOldSink.onDispose();
                }
            }

            public static void com_ss_bytertc_engine_adapter_VideoFrameSinkAdapter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_bytertc_engine_adapter_VideoFrameSinkAdapter$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public VideoFrameSinkAdapter(IVideoSink iVideoSink) {
        this.mSink = iVideoSink;
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public void onFrame(VideoFrame videoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            iVideoSink.onFrame(videoFrame);
            return;
        }
        com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink2 = this.mBridgedOldSink;
        if (iVideoSink2 == null) {
            return;
        }
        iVideoSink2.consumeVideoFrame(videoFrame);
    }

    public void onVideoFrame(VideoFrame videoFrame) {
        if (videoFrame == null) {
            return;
        }
        onFrame(videoFrame);
    }

    public VideoFrameSinkAdapter(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, VideoSinkTask videoSinkTask) {
        this.mBridgedOldSink = iVideoSink;
        this.mVideoSinkTask = videoSinkTask;
    }

    public VideoFrameSinkAdapter(IVideoSink iVideoSink, boolean z) {
        this.mSink = iVideoSink;
        this.mDirectPush = z;
    }
}
