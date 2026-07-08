package pvo;

import X.C1272880jEE;
import X.C1273730jFb;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1271560jC6;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.nio.ByteBuffer;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class b extends C1272880jEE {
    public SafeHandlerThread LLLZI;
    public Handler LLLZIIL;
    public int LLLZIL;
    public SurfaceHolder LLLZL;
    public boolean LLLZLL;
    public boolean LLLZLZ;
    public boolean LLLZZ;
    public int LLLZZIL;
    public int LLZ;
    public boolean LLZIL;
    public final Matrix LLZILL;

    @Override // X.C1272880jEE, X.SurfaceHolderCallbackC1272890jEF
    public final void LLIZLLLIL() {
        SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "CanvasRenderThread");
        this.LLLZI = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
        this.LLLZIIL = this.LLLZI.getHandler();
        this.LLILZIL = this;
    }

    @Override // X.C1272880jEE, X.SurfaceHolderCallbackC1272890jEF, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("begin release[");
        sbLIZ.append(this);
        sbLIZ.append(e3.f);
        AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LLLZIIL;
        if (handler != null) {
            if (!C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20((Object) this, 308))) {
                AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already release at")));
                return;
            } else {
                C1273730jFb.LIZLLL(this.LLLZI);
                this.LLLZI = null;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("end release[");
        sbLIZ2.append(this);
        sbLIZ2.append(e3.f);
        AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF, X.InterfaceC1274490jGp
    public final Handler LJJLIIIJJI() {
        return this.LLLZIIL;
    }

    public b(SurfaceView surfaceView) {
        super(surfaceView);
        new Paint();
        this.LLZILL = new Matrix();
    }

    @Override // X.C1272880jEE, X.InterfaceC1274490jGp
    public final void LJLLJ(boolean z) {
        this.LLLZLL = z;
        this.LLZIL = true;
    }

    @Override // X.C1272880jEE, X.InterfaceC1272990jEP
    public final void LLILII(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF
    public final void LLJ(SurfaceView surfaceView) {
        super.LLJ(surfaceView);
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF
    public final void LLJI(TextureView textureView) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // X.C1272880jEE, X.SurfaceHolderCallbackC1272890jEF, com.ss.ttlivestreamer.core.engine.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.LLLZI != null) {
            videoFrame.retain();
            if (this.LLLZIL == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.LLLZIL = iArr[0];
            }
            InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) videoFrame.getBuffer();
            GLES20.glBindFramebuffer(36160, this.LLLZIL);
            GLES20.glFramebufferTexture2D(36160, 36064, interfaceC1271560jC6.getType().getGlTarget(), interfaceC1271560jC6.getTextureId(), 0);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(interfaceC1271560jC6.getWidth() * interfaceC1271560jC6.getHeight() * 4);
            GLES20.glReadPixels(0, 0, interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight(), 6408, 5121, byteBufferAllocateDirect);
            GlUtil.checkAnyGLES2Error("BUG");
            GLES20.glBindFramebuffer(36160, 0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
            C786410Ut5.LJJZZIII(this.LLLZIIL, new ARunnableS53S0300000_20(bitmapCreateBitmap, videoFrame, this, 57));
        }
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceCreated() [");
        sbLIZ.append(this);
        sbLIZ.append(e3.f);
        AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = true;
        if (this.LLLZL == null) {
            this.LLLZL = surfaceHolder;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mSurfaceHolder is set to ");
            sbLIZ2.append(this.LLLZL);
            AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already received onSurfaceCreated at")));
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceDestroy() [");
        sbLIZ.append(this);
        sbLIZ.append(e3.f);
        AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLZL == null) {
            return;
        }
        synchronized (this) {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mSurfaceHolder: ");
                sbLIZ2.append(this.LLLZL);
                sbLIZ2.append(" is set to null");
                AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLLZL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1272880jEE
    public final void LLJJIII(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = this.LLLZLL;
        float f5 = i;
        float f6 = i2;
        float f7 = f5 / f6;
        int i3 = this.LLLJ;
        int i4 = this.LLLJIL;
        float f8 = i3 / i4;
        float f9 = 0.0f;
        if (z) {
            if (f7 > f8) {
                f = i3 / f5;
                f3 = (-(i4 - (f6 * f))) / 2.0f;
            } else {
                f = i3 / f5;
                f2 = -(i3 - (f5 * f));
                f9 = f2 / 2.0f;
                f3 = 0.0f;
            }
        } else if (f7 < f8) {
            f = i3 / f5;
            f3 = ((f6 * f) - i4) / 2.0f;
        } else {
            f = i4 / f6;
            f2 = (f5 * f) - i3;
            f9 = f2 / 2.0f;
            f3 = 0.0f;
        }
        this.LLZILL.reset();
        this.LLZILL.postScale(f, f);
        this.LLZILL.postTranslate(-f9, -f3);
        this.LLZILL.postTranslate((-this.LLLJ) / 2.0f, (-this.LLLJIL) / 2.0f);
        Matrix matrix = this.LLZILL;
        float f10 = -1.0f;
        if (this.LLLZLZ) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        if (!this.LLLZZ) {
            f10 = 1.0f;
        }
        matrix.postScale(f4, f10);
        this.LLZILL.postTranslate(this.LLLJ / 2.0f, this.LLLJIL / 2.0f);
        this.LLZ = i2;
        this.LLLZZIL = i;
    }

    @Override // X.C1272880jEE
    public final void LLJJJ(boolean z, boolean z2) {
        if (z2) {
            this.LLLZLZ = z;
        } else {
            this.LLLZZ = z;
        }
        this.LLZIL = true;
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF, android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceChanged() [");
        sbLIZ.append(this);
        sbLIZ.append("] + width: ");
        sbLIZ.append(i2);
        sbLIZ.append("height:");
        sbLIZ.append(i3);
        AVLog.ioi("CanvasRenderView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLJ = i2;
        this.LLLJIL = i3;
        this.LLZIL = true;
    }
}
