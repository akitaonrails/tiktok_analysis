package com.ss.bytertc.engine.mediaio;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.base.media.SurfaceEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceEglRender extends SurfaceEglRenderer {
    public SurfaceHolder.Callback mCallback;
    public final AtomicBoolean mHasBindAtomic;
    public final AtomicBoolean mHasInitAtomic;
    public final Object mSurfaceCallbackLock;
    public VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    public final Object mSurfaceLifecycleCallbackLock;
    public SoftReference<SurfaceView> surfaceViewSoftReference;

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, com.ss.bytertc.base.media.EglRenderer
    public void release() {
        SurfaceView surfaceView;
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
        }
        LogUtil.d("SurfaceEglRender", "release");
        super.release();
        this.mHasBindAtomic.compareAndSet(true, false);
        SoftReference<SurfaceView> softReference = this.surfaceViewSoftReference;
        if (softReference == null || (surfaceView = softReference.get()) == null) {
            return;
        }
        surfaceView.getHolder().removeCallback(this);
    }

    public SurfaceEglRender(String str) {
        super(str);
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mSurfaceLifecycleCallbackLock = new Object();
        this.mSurfaceCallbackLock = new Object();
        this.surfaceViewSoftReference = new SoftReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bind$0(SurfaceView surfaceView) {
        C1C7U.LIZ("SurfaceEglRender@fdda.bind$1L");
        SurfaceHolder holder = surfaceView.getHolder();
        synchronized (this.mSurfaceCallbackLock) {
            try {
                SurfaceHolder.Callback callback = this.mCallback;
                if (callback != null) {
                    holder.addCallback(callback);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (holder.getSurface() != null && holder.getSurface().isValid()) {
            setLayoutAspectRatio(surfaceView.getMeasuredWidth() / surfaceView.getMeasuredHeight());
            surfaceCreated(holder);
        }
        holder.addCallback(this);
        C1C7U.LIZIZ("SurfaceEglRender@fdda.bind$1L");
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    }

    public void bind(final SurfaceView surfaceView) {
        if (this.mHasInitAtomic.get()) {
            if (this.mHasBindAtomic.compareAndSet(false, true)) {
                LogUtil.d("SurfaceEglRender", "bind");
                runOnUIThread(new Runnable() { // from class: X.0jQo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$bind$0(surfaceView);
                    }
                });
                return;
            }
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
        throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, com.ss.bytertc.base.media.EglRenderer, com.ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get()) {
            super.onFrame(videoFrame);
        }
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        synchronized (this.mSurfaceCallbackLock) {
            try {
                this.mCallback = callback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setSurfaceLifecycleLisenter(VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        LogUtil.d("SurfaceEglRender", "surfaceCreated");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
                if (surfaceLifecycleCallback != null) {
                    surfaceLifecycleCallback.onCreated();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.d("SurfaceEglRender", "surfaceDestroyed");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
                if (surfaceLifecycleCallback != null) {
                    surfaceLifecycleCallback.onDestroy();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, com.ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            LogUtil.d("SurfaceEglRender", "init");
            super.init(context, iArr, glDrawer);
            return;
        }
        throw new IllegalStateException("SurfaceEglRender has already init!!!!!!");
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        LogUtil.d("SurfaceEglRender", "surfaceChanged");
    }
}
