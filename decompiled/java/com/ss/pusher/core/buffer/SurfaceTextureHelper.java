package com.ss.pusher.core.buffer;

import X.C1277790jM9;
import X.C1283060jUe;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1277800jMA;
import X.InterfaceC1273800jFi;
import X.InterfaceC1278160jMk;
import Y.ARunnableS0S0304000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS53S0300000_20;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.buffer.SurfaceTextureHelper;
import com.ss.pusher.core.buffer.SurfaceTextureSharedHandler;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.opengl.GlUtil;
import com.ss.pusher.core.opengl.YuvConverter;
import com.ss.pusher.core.utils.AVLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceTextureHelper {
    public static boolean syncBooleanOptimized;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public InterfaceC1273800jFi listener;
    public final int oesTextureId;
    public SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public InterfaceC1273800jFi pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    public void handlerExit() {
    }

    public void returnTextureFrame() {
        returnTextureFrame(false);
    }

    public void dispose() {
        C1283060jUe.LIZIZ(this.handler, new ARunnableS120S0100000_20(this, 88));
    }

    public void insertTextureFrameIfNeed() {
        if (this.handler.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isQuitting || this.isTextureInUse || this.listener == null) {
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        long jCurrentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        ((SurfaceTextureSharedHandler.SurfaceInternal) this.listener).LIZ(jCurrentTimeMillis, this.oesTextureId, fArr);
    }

    public void release() {
        if (this.handler.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        YuvConverter yuvConverter = this.yuvConverter;
        if (yuvConverter != null) {
            try {
                yuvConverter.LIZ.LIZ();
                yuvConverter.LIZLLL();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                if (GlUtil.nativeIsOpenGlThread()) {
                    yuvConverter.LIZLLL();
                } else {
                    C786410Ut5.LJJZZIII(GLThreadManager.LJ().LIZ, new ARunnableS120S0100000_20(yuvConverter, 95));
                }
            }
        }
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        handlerExit();
    }

    public void stopListening() {
        this.handler.removeCallbacks(this.setListenerRunnable);
        C1283060jUe.LIZIZ(this.handler, new ARunnableS120S0100000_20(this, 87));
    }

    public void updateTexImage() {
        this.surfaceTexture.updateTexImage();
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public int getTextureId() {
        return this.oesTextureId;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public SurfaceTextureHelper(Handler handler) {
        this(handler, false);
    }

    public static void setSyncBooleanOptimized(boolean z) {
        syncBooleanOptimized = z;
    }

    public void returnTextureFrame(boolean z) {
        C786410Ut5.LJJZZIII(this.handler, new ARunnableS39S0110000_20(this, z, 5));
    }

    public void startListening(InterfaceC1273800jFi interfaceC1273800jFi) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = interfaceC1273800jFi;
            C786410Ut5.LJJZZIII(this.handler, this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(InterfaceC1278160jMk interfaceC1278160jMk) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        C1283060jUe.LIZIZ(this.handler, new ARunnableS53S0300000_20(i420BufferArr, interfaceC1278160jMk, this, 16));
        return i420BufferArr[0];
    }

    public void tryDeliverTextureFrame(boolean z) {
        if (this.handler.getLooper().getThread() == C786410Ut5.u3()) {
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                this.isTextureInUse = !z;
                this.hasPendingTexture = false;
                updateTexImage();
                if (!z) {
                    long jCurrentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
                    float[] fArr = new float[16];
                    this.surfaceTexture.getTransformMatrix(fArr);
                    ((SurfaceTextureSharedHandler.SurfaceInternal) this.listener).LIZ(jCurrentTimeMillis, this.oesTextureId, fArr);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public SurfaceTextureHelper(Handler handler, boolean z) {
        this.setListenerRunnable = new ARunnableS120S0100000_20(this, 86);
        this.onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jN8
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                SurfaceTextureHelper surfaceTextureHelper = this.LL;
                surfaceTextureHelper.hasPendingTexture = true;
                surfaceTextureHelper.tryDeliverTextureFrame(false);
            }
        };
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            this.handler = handler;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Using finalizeCheck ");
            sbLIZ.append(z);
            AVLog.iow("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ));
            final int iLIZLLL = GlUtil.LIZLLL(36197);
            this.oesTextureId = iLIZLLL;
            if (z) {
                this.surfaceTexture = new SurfaceTexture(iLIZLLL) { // from class: X.0jBr
                    public Boolean LIZ = Boolean.FALSE;
                    public final Object LIZIZ = new Object();

                    @Override // android.graphics.SurfaceTexture
                    public final void finalize() {
                        if (this.LIZ.booleanValue()) {
                            return;
                        }
                        if (SurfaceTextureHelper.syncBooleanOptimized) {
                            synchronized (this.LIZIZ) {
                                try {
                                    if (this.LIZ.booleanValue()) {
                                        return;
                                    }
                                    this.LIZ = Boolean.TRUE;
                                    super.finalize();
                                    return;
                                } finally {
                                }
                            }
                        }
                        synchronized (this.LIZ) {
                            try {
                                if (this.LIZ.booleanValue()) {
                                    return;
                                }
                                this.LIZ = Boolean.TRUE;
                                super.finalize();
                            } finally {
                            }
                        }
                    }

                    @Override // android.graphics.SurfaceTexture
                    public final void release() {
                        if (this.LIZ.booleanValue()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("BUG, texture already finalized.");
                            sbLIZ2.append(this);
                            AVLog.ioe("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        if (SurfaceTextureHelper.syncBooleanOptimized) {
                            synchronized (this.LIZIZ) {
                                try {
                                    if (!this.LIZ.booleanValue()) {
                                        super.release();
                                        return;
                                    }
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("BUG, texture already finalized.");
                                    sbLIZ3.append(this);
                                    AVLog.ioe("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                    return;
                                } finally {
                                }
                            }
                        }
                        synchronized (this.LIZ) {
                            try {
                                if (!this.LIZ.booleanValue()) {
                                    super.release();
                                    return;
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("BUG, texture already finalized.");
                                sbLIZ4.append(this);
                                AVLog.ioe("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ4));
                            } finally {
                            }
                        }
                    }
                };
            } else {
                this.surfaceTexture = new SurfaceTexture(iLIZLLL);
            }
            setOnFrameAvailableListener(this.surfaceTexture, this.onFrameAvailableListener, handler);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public InterfaceC1278160jMk createTextureBuffer(int i, int i2, Matrix matrix) {
        return new C1277790jM9(i, i2, EnumC1277800jMA.OES, this.oesTextureId, matrix, this, new ARunnableS120S0100000_20(this, 89));
    }

    public void textureToYUV(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        if (i4 == this.oesTextureId) {
            C1283060jUe.LIZIZ(this.handler, new ARunnableS0S0304000_20(this, byteBuffer, i, i2, i3, i4, fArr, 0));
            return;
        }
        throw new IllegalStateException("textureToByteBuffer called with unexpected textureId");
    }
}
