package com.ss.lyrax.video;

import X.InterfaceC1294060jmO;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
@InterfaceC1294060jmO
public final class LyraxPreviewSink implements ILyraxVideoFrameSink {
    public View displayView;
    public final Object lock;
    public ILyraxVideoRenderer renderer;

    public LyraxPreviewSink() {
        this(null, null);
    }

    public final View displayView() {
        View view;
        synchronized (this.lock) {
            try {
                view = this.displayView;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return view;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoFrameSink
    public int getRenderElapse() {
        ILyraxVideoRenderer iLyraxVideoRenderer;
        synchronized (this.lock) {
            try {
                iLyraxVideoRenderer = this.renderer;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (iLyraxVideoRenderer != null) {
            return iLyraxVideoRenderer.getRenderElapse();
        }
        return 0;
    }

    public final void release() {
        synchronized (this.lock) {
            try {
                ILyraxVideoRenderer iLyraxVideoRenderer = this.renderer;
                if (iLyraxVideoRenderer != null) {
                    iLyraxVideoRenderer.release();
                }
                this.renderer = null;
                this.displayView = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public LyraxPreviewSink(View view) {
        this(view, null);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoFrameSink
    public void onFrame(LyraxVideoFrame lyraxVideoFrame) {
        ILyraxVideoRenderer iLyraxVideoRenderer;
        synchronized (this.lock) {
            try {
                iLyraxVideoRenderer = this.renderer;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (iLyraxVideoRenderer != null) {
            iLyraxVideoRenderer.renderFrame(lyraxVideoFrame);
        }
    }

    public final void setDisplayView(View view) {
        synchronized (this.lock) {
            try {
                this.displayView = view;
                ILyraxVideoRenderer iLyraxVideoRenderer = this.renderer;
                if (iLyraxVideoRenderer != null) {
                    iLyraxVideoRenderer.setRenderTargetView(view);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void setRenderer(ILyraxVideoRenderer iLyraxVideoRenderer) {
        synchronized (this.lock) {
            try {
                this.renderer = iLyraxVideoRenderer;
                if (iLyraxVideoRenderer != null) {
                    iLyraxVideoRenderer.setRenderTargetView(this.displayView);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public LyraxPreviewSink(View view, ILyraxVideoRenderer iLyraxVideoRenderer) {
        Object obj = new Object();
        this.lock = obj;
        synchronized (obj) {
            try {
                this.displayView = view;
                this.renderer = iLyraxVideoRenderer;
                if (iLyraxVideoRenderer != null) {
                    iLyraxVideoRenderer.setRenderTargetView(view);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
