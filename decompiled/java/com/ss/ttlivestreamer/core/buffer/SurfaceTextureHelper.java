package com.ss.ttlivestreamer.core.buffer;

import X.C1269250j8N;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1283100jUi;
import X.C143900gn;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1273550jFJ;
import X.InterfaceC1270400jAE;
import X.InterfaceC1271560jC6;
import Y.ACallableS425S0100000_20;
import Y.ARunnableS0S0304000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS53S0300000_20;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceTextureHelper {
    public final Handler handler;
    public volatile boolean hasPendingTexture;
    public C1269250j8N interruptChecker;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public InterfaceC1270400jAE listener;
    public final int oesTextureId;
    public SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public InterfaceC1270400jAE pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    public void returnTextureFrame() {
        returnTextureFrame(false);
    }

    public void dispose() {
        C1283100jUi.LIZIZ(this.handler, new ARunnableS120S0100000_20(this, 104));
    }

    public void handlerExit() {
        this.handler.getLooper().quit();
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
        this.listener.LLII(jCurrentTimeMillis, this.oesTextureId, fArr);
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
            yuvConverter.release();
        }
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        handlerExit();
    }

    public void stopListening() {
        this.handler.removeCallbacks(this.setListenerRunnable);
        C1269250j8N c1269250j8N = this.interruptChecker;
        this.interruptChecker = null;
        if (c1269250j8N != null) {
            C1269250j8N.LIZJ();
        }
        C1283100jUi.LIZIZ(this.handler, new ARunnableS120S0100000_20(this, 103));
    }

    public void updateTexImage() {
        try {
            this.surfaceTexture.updateTexImage();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1274080jGA.LIZ.LIZ("SurfaceTextureHelper.updateTexImage", th);
            AVLog.logKibana(6, "SurfaceTextureHelper", "updateTexImage failed", th);
            String message = th.getMessage();
            if (C1274040jG6.LIZ()) {
                if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(message);
                    sbLIZ.append(";;;Error egl dpy env, code:");
                    sbLIZ.append(EGL14.eglGetError());
                    message = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(message);
                    sbLIZ2.append(";;;");
                    sbLIZ2.append("Error egl ctx env, code:");
                    sbLIZ2.append(EGL14.eglGetError());
                    message = C2188811AlT.LIZIZ(sbLIZ2);
                }
                throw new AndroidRuntimeException(message);
            }
        }
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

    public static SurfaceTextureHelper create(String str) {
        GLThread gLThread = new GLThread(str, C143900gn.LIZ(0, str));
        gLThread.start();
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(gLThread));
        return (SurfaceTextureHelper) C1283100jUi.LIZ(bPEAHandler, new ACallableS425S0100000_20(bPEAHandler, 9));
    }

    public void returnTextureFrame(boolean z) {
        C786410Ut5.LJJZZIII(this.handler, new ARunnableS39S0110000_20(this, z, 6));
    }

    public void setInterruptChecker(C1269250j8N c1269250j8N) {
        if (this.interruptChecker != null) {
            C1269250j8N.LIZJ();
        }
        this.interruptChecker = c1269250j8N;
    }

    public void startListening(InterfaceC1270400jAE interfaceC1270400jAE) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = interfaceC1270400jAE;
            C786410Ut5.LJJZZIII(this.handler, this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(InterfaceC1271560jC6 interfaceC1271560jC6) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        C1283100jUi.LIZIZ(this.handler, new ARunnableS53S0300000_20(i420BufferArr, interfaceC1271560jC6, this, 17));
        return i420BufferArr[0];
    }

    public void tryDeliverTextureFrame(boolean z) {
        if (this.handler.getLooper().getThread() == C786410Ut5.u3()) {
            C1269250j8N c1269250j8N = this.interruptChecker;
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                this.isTextureInUse = !z;
                this.hasPendingTexture = false;
                if (c1269250j8N != null) {
                    C1269250j8N.LIZ();
                }
                updateTexImage();
                if (!z) {
                    long jCurrentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
                    float[] fArr = new float[16];
                    this.surfaceTexture.getTransformMatrix(fArr);
                    this.listener.LLII(jCurrentTimeMillis, this.oesTextureId, fArr);
                    return;
                }
                return;
            }
            if (c1269250j8N != null) {
                C1269250j8N.LIZIZ(this.hasPendingTexture, this.isTextureInUse);
                return;
            }
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public SurfaceTextureHelper(Handler handler, boolean z) {
        this.setListenerRunnable = new ARunnableS120S0100000_20(this, 102);
        this.onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jAD
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                this.LL.hasPendingTexture = true;
                C1269250j8N c1269250j8N = this.LL.interruptChecker;
                this.LL.tryDeliverTextureFrame(false);
            }
        };
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            this.handler = handler;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Using finalizeCheck ");
            sbLIZ.append(z);
            AVLog.iow("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ));
            final int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            if (z) {
                this.surfaceTexture = new SurfaceTexture(iGenerateTexture) { // from class: X.0jAC
                    public Boolean LIZ = Boolean.FALSE;

                    @Override // android.graphics.SurfaceTexture
                    public final void finalize() {
                        if (this.LIZ.booleanValue()) {
                            return;
                        }
                        synchronized (this.LIZ) {
                            try {
                                if (this.LIZ.booleanValue()) {
                                    return;
                                }
                                this.LIZ = Boolean.TRUE;
                                super.finalize();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // android.graphics.SurfaceTexture
                    public final void release() {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, texture already finalized!");
                        if (this.LIZ.booleanValue()) {
                            C1274080jGA.LIZ.LIZ("SurfaceTextureHelper.release", androidRuntimeException);
                            if (C1274040jG6.LIZ()) {
                                throw androidRuntimeException;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("BUG, texture already finalized.");
                            sbLIZ2.append(this);
                            AVLog.ioe("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        synchronized (this.LIZ) {
                            try {
                                if (!this.LIZ.booleanValue()) {
                                    super.release();
                                    return;
                                }
                                C1274080jGA.LIZ.LIZ("SurfaceTextureHelper.release", androidRuntimeException);
                                if (C1274040jG6.LIZ()) {
                                    throw androidRuntimeException;
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("BUG, texture already finalized.");
                                sbLIZ3.append(this);
                                AVLog.ioe("SurfaceTextureHelper", C2188811AlT.LIZIZ(sbLIZ3));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                };
            } else {
                this.surfaceTexture = new SurfaceTexture(iGenerateTexture);
            }
            setOnFrameAvailableListener(this.surfaceTexture, this.onFrameAvailableListener, handler);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public InterfaceC1271560jC6 createTextureBuffer(int i, int i2, Matrix matrix) {
        return new k(i, i2, EnumC1273550jFJ.OES, this.oesTextureId, matrix, this, new ARunnableS120S0100000_20(this, 105));
    }

    public void textureToYUV(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        if (i4 == this.oesTextureId) {
            C1283100jUi.LIZIZ(this.handler, new ARunnableS0S0304000_20(this, byteBuffer, i, i2, i3, i4, fArr, 1));
            return;
        }
        throw new IllegalStateException("textureToByteBuffer called with unexpected textureId");
    }
}
