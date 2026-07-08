package com.ss.bytertc.engine.lyraxwrapper;

import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoPixelFormat;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoSinkWrapper implements ILyraxVideoFrameSink {
    public final LyraxVideoPixelFormat mRequiredFormat;
    public final IVideoSink mSink;

    @Override // com.ss.lyrax.video.ILyraxVideoFrameSink
    public int getRenderElapse() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getRenderElapse();
        }
        return 0;
    }

    public LyraxVideoPixelFormat getRequiredFormat() {
        return this.mRequiredFormat;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoFrameSink
    public void onFrame(LyraxVideoFrame lyraxVideoFrame) {
        if (this.mSink != null && lyraxVideoFrame != null) {
            this.mSink.onFrame(new LyraxVideoFrameWrapper(lyraxVideoFrame));
        }
    }

    public LyraxVideoSinkWrapper(IVideoSink iVideoSink, LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        this.mSink = iVideoSink;
        this.mRequiredFormat = lyraxVideoPixelFormat;
    }
}
