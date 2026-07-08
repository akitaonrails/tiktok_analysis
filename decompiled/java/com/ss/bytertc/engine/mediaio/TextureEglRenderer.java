package com.ss.bytertc.engine.mediaio;

import X.C1C7U;
import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.base.media.EglRenderer;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
    public final AtomicBoolean mHasBindAtomic;
    public final AtomicBoolean mHasInitAtomic;
    public VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    public TextureView.SurfaceTextureListener mSurfaceTextureListener;
    public final Object mSurfaceTextureListenerLock;
    public volatile WeakReference<TextureView> mTextureViewRef;
    public final Handler mainHandler;

    public static /* synthetic */ void lambda$semisugar$countDown$0(CountDownLatch countDownLatch) {
        C1C7U.LIZ("TextureEglRenderer@3191.onSurfaceTextureDestroyed$1L");
        countDownLatch.countDown();
        C1C7U.LIZIZ("TextureEglRenderer@3191.onSurfaceTextureDestroyed$1L");
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void release() {
        TextureView textureView;
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
        }
        LogUtil.d("TextureEglRenderer", "release");
        super.release();
        this.mHasBindAtomic.compareAndSet(true, false);
        if (this.mTextureViewRef == null || (textureView = this.mTextureViewRef.get()) == null) {
            return;
        }
        textureView.setSurfaceTextureListener(null);
    }

    public TextureEglRenderer(String str) {
        super(str);
        this.mSurfaceTextureListenerLock = new Object();
        this.mainHandler = new BPEAHandler(Looper.getMainLooper());
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mTextureViewRef = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bind$0(TextureView textureView) {
        C1C7U.LIZ("TextureEglRenderer@3191.bind$1L");
        if (textureView.getSurfaceTexture() != null) {
            createEglSurface(textureView.getSurfaceTexture());
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
        textureView.setSurfaceTextureListener(this);
        C1C7U.LIZIZ("TextureEglRenderer@3191.bind$1L");
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    }

    @Override // com.ss.bytertc.base.media.EglRenderer, com.ss.bytertc.base.media.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get() && this.mTextureViewRef != null) {
            TextureView textureView = this.mTextureViewRef.get();
            if (videoFrame != null && textureView != null && textureView.isShown()) {
                if ((videoFrame.getBuffer() instanceof CountDownLatchI420Buffer) && (textureView instanceof IVideoSink)) {
                    final CountDownLatchI420Buffer countDownLatchI420Buffer = (CountDownLatchI420Buffer) videoFrame.getBuffer();
                    countDownLatchI420Buffer.retain();
                    if (!postOnMainThreadAndLock(new Runnable() { // from class: X.0jQm
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.LL.lambda$onFrame$1(videoFrame, countDownLatchI420Buffer);
                        }
                    }, countDownLatchI420Buffer.getLatch())) {
                        countDownLatchI420Buffer.release();
                        return;
                    }
                    return;
                }
                super.onFrame(videoFrame);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.d("TextureEglRenderer", "onSurfaceTextureDestroyed");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable() { // from class: X.0jQp
            @Override // java.lang.Runnable
            public final void run() {
                TextureEglRenderer.lambda$semisugar$countDown$0(countDownLatch);
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onDestroy();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                this.mSurfaceTextureListener = surfaceTextureListener;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrame$1(VideoFrame videoFrame, CountDownLatchI420Buffer countDownLatchI420Buffer) {
        C1C7U.LIZ("TextureEglRenderer@3191.onFrame$1L");
        super.onFrame(videoFrame);
        countDownLatchI420Buffer.release();
        C1C7U.LIZIZ("TextureEglRenderer@3191.onFrame$1L");
    }

    public static void lambda$postOnMainThreadAndLock$2(Runnable runnable, CountDownLatch countDownLatch) {
        C1C7U.LIZ("TextureEglRenderer@3191.postOnMainThreadAndLock$1L");
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("TextureEglRenderer@3191.postOnMainThreadAndLock$1L");
    }

    private boolean postOnMainThreadAndLock(final Runnable runnable, final CountDownLatch countDownLatch) {
        return C786410Ut5.LJJZZIII(this.mainHandler, new Runnable() { // from class: X.0jQq
            @Override // java.lang.Runnable
            public final void run() {
                TextureEglRenderer.lambda$postOnMainThreadAndLock$2(runnable, countDownLatch);
            }
        });
    }

    public void bind(final TextureView textureView, VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        if (this.mHasInitAtomic.get()) {
            if (this.mHasBindAtomic.compareAndSet(false, true)) {
                LogUtil.d("TextureEglRenderer", "bind");
                this.mTextureViewRef = new WeakReference<>(textureView);
                this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
                runOnUIThread(new Runnable() { // from class: X.0jQr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$bind$0(textureView);
                    }
                });
                return;
            }
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
        throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            LogUtil.d("TextureEglRenderer", "init");
            super.init(context, iArr, glDrawer);
            return;
        }
        throw new IllegalStateException("TextureEglRenderer has already init!!!!!!");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.d("TextureEglRenderer", "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onCreated();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.d("TextureEglRenderer", "onSurfaceTextureSizeChanged");
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
