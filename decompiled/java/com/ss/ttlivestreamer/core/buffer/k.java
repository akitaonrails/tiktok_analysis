package com.ss.ttlivestreamer.core.buffer;

import X.C1267520j5a;
import X.C1271750jCP;
import X.C1273510jFF;
import X.C2188811AlT;
import X.EnumC1273550jFJ;
import X.InterfaceC1268620j7M;
import X.InterfaceC1271560jC6;
import X.InterfaceC1271740jCO;
import X.InterfaceC1271770jCR;
import Y.ARunnableS120S0100000_20;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.UVRange;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;

/* JADX INFO: loaded from: classes21.dex */
public class k extends VideoFrame.a implements InterfaceC1271560jC6 {
    public InterfaceC1271740jCO callback;
    public long captureMs;
    public long captureServerNtpMs;
    public long effectServerNtpMs;
    public VideoFrame.IExtraData extData;
    public int height;
    public int id;
    public long mFenceObj;
    public RoiInfo mROIInfo;
    public InterfaceC1268620j7M mToI420Interface;
    public UVRange mUVRange;
    public int refCount;
    public final Object refCountLock;
    public Runnable releaseCallback;
    public SurfaceTextureHelper surfaceTextureHelper;
    public InterfaceC1271770jCR textureBufferCreator;
    public Matrix transformMatrix;
    public float[] transformMatrixArray;
    public EnumC1273550jFJ type;
    public int width;

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return true;
    }

    public void recycle() {
    }

    private void deleteFence() {
        long j = this.mFenceObj;
        if (j <= 0 || !GLES30.glIsSync(j)) {
            return;
        }
        GLES30.glDeleteSync(this.mFenceObj);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteFence mFenceObj:");
            sbLIZ.append(this.mFenceObj);
            C2188811AlT.LIZIZ(sbLIZ);
            GLES20.glGetError();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1267520j5a.LIZ()) {
                AVLog.logKibana(6, "TextureBufferImpl", e.toString(), null);
            }
            GlUtil.clearAllGLError();
        }
        this.mFenceObj = 0L;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void destroy() {
        RoiInfo roiInfo = this.mROIInfo;
        if (roiInfo != null) {
            roiInfo.release();
            this.mROIInfo = null;
        }
        deleteFence();
    }

    public boolean isFenceValid() {
        long j = this.mFenceObj;
        return j > 0 && GLES30.glIsSync(j);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void release() {
        synchronized (this.refCountLock) {
            try {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0) {
                    Runnable runnable = this.releaseCallback;
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        recycle();
                    }
                    RoiInfo roiInfo = this.mROIInfo;
                    if (roiInfo != null) {
                        roiInfo.release();
                        this.mROIInfo = null;
                    }
                    deleteFence();
                    onBufferReleased();
                } else if (i < 0) {
                    throw new AndroidRuntimeException("Texture reference BUG, abort it!");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void retain() {
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            return surfaceTextureHelper.textureToYuv(this);
        }
        InterfaceC1268620j7M interfaceC1268620j7M = this.mToI420Interface;
        if (interfaceC1268620j7M != null) {
            return interfaceC1268620j7M.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    public void waitGlFence() {
        long j = this.mFenceObj;
        if (j <= 0 || !GLES30.glIsSync(j)) {
            return;
        }
        GLES30.glWaitSync(this.mFenceObj, 0, -1L);
        try {
            GLES20.glGetError();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1267520j5a.LIZ()) {
                AVLog.logKibana(6, "TextureBufferImpl", e.toString(), null);
            }
            GlUtil.clearAllGLError();
        }
    }

    public k() {
        this.transformMatrixArray = C1273510jFF.LIZIZ();
        this.refCountLock = new Object();
        this.mFenceObj = 0L;
        this.mUVRange = new UVRange();
    }

    public void generateGlFence() {
        if (GLES20.glGetError() != 0) {
            return;
        }
        this.mFenceObj = GLES30.glFenceSync(37143, 0);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer, com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public int getBufferType() {
        return getType() == EnumC1273550jFJ.OES ? 2 : 1;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getCaptureServerNtpMs() {
        return this.captureServerNtpMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getEffectServerNtpMs() {
        return this.effectServerNtpMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return this.extData;
    }

    public long getFence() {
        return this.mFenceObj;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getRefCount() {
        return this.refCount;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getTextureId() {
        return this.id;
    }

    @Override // X.InterfaceC1271560jC6
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // X.InterfaceC1271560jC6
    public float[] getTransformMatrixArray() {
        return this.transformMatrixArray;
    }

    @Override // X.InterfaceC1271560jC6
    public EnumC1273550jFJ getType() {
        return this.type;
    }

    public UVRange getUVRange() {
        return this.mUVRange;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void release(String str) {
        InterfaceC1271740jCO interfaceC1271740jCO = this.callback;
        if (interfaceC1271740jCO == null) {
            release();
        } else {
            interfaceC1271740jCO.release(str);
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void retain(String str) {
        InterfaceC1271740jCO interfaceC1271740jCO = this.callback;
        if (interfaceC1271740jCO == null) {
            retain();
        } else {
            interfaceC1271740jCO.retain(str);
        }
    }

    public void setLifeCycleCallback(InterfaceC1271740jCO interfaceC1271740jCO) {
        this.callback = interfaceC1271740jCO;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.mROIInfo;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.mROIInfo = roiInfo;
        }
    }

    public void setTextureBufferCreator(InterfaceC1271770jCR interfaceC1271770jCR) {
        this.textureBufferCreator = interfaceC1271770jCR;
    }

    @Override // X.InterfaceC1271560jC6
    public void setTransformMatrix(Matrix matrix) {
        this.transformMatrix = matrix;
    }

    @Override // X.InterfaceC1271560jC6
    public void setTransformMatrixArray(float[] fArr) {
        this.transformMatrixArray = fArr;
    }

    public void setUVRange(UVRange uVRange) {
        this.mUVRange = uVRange;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j) {
        this.captureMs = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateCaptureServerNtpMs(long j) {
        this.captureServerNtpMs = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateEffectServerNtpMs(long j) {
        this.effectServerNtpMs = j;
    }

    @Override // X.InterfaceC1271560jC6
    public void updateExtraData(VideoFrame.IExtraData iExtraData) {
        this.extData = iExtraData;
    }

    public k(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Runnable runnable) {
        this.transformMatrixArray = C1273510jFF.LIZIZ();
        this.refCountLock = new Object();
        this.mFenceObj = 0L;
        this.mUVRange = new UVRange();
        init(i, i2, enumC1273550jFJ, i3, null, null, null, runnable, null, 0L);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        k kVar;
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(i / this.width, i2 / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 106);
        InterfaceC1271770jCR interfaceC1271770jCR = this.textureBufferCreator;
        if (interfaceC1271770jCR != null) {
            EnumC1273550jFJ enumC1273550jFJ = this.type;
            int i7 = this.id;
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            kVar = ((C1271750jCP) interfaceC1271770jCR).LIZ.LIZLLL(i5, i6, enumC1273550jFJ, i7, matrix, surfaceTextureHelper, null, aRunnableS120S0100000_20, null, 0L);
            if (kVar == null) {
                kVar = new k(i5, i6, enumC1273550jFJ, i7, matrix, surfaceTextureHelper, aRunnableS120S0100000_20);
            }
        } else {
            kVar = new k(i5, i6, this.type, this.id, matrix, this.surfaceTextureHelper, aRunnableS120S0100000_20);
        }
        kVar.mToI420Interface = this.mToI420Interface;
        kVar.setROIInfo(this.mROIInfo);
        this.mROIInfo = null;
        kVar.captureMs = this.captureMs;
        kVar.captureServerNtpMs = this.captureServerNtpMs;
        kVar.effectServerNtpMs = this.effectServerNtpMs;
        return kVar;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.a, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void cropAndScaleV2(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i == 0 && i2 == 0 && i3 == (i7 = this.width) && i4 == (i8 = this.height) && i5 == i7 && i6 == i8) {
            return;
        }
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(i / this.width, i2 / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.transformMatrix = matrix;
        this.width = i5;
        this.height = i6;
    }

    public k(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable) {
        this(i, i2, enumC1273550jFJ, i3, matrix, interfaceC1268620j7M, runnable, (VideoFrame.IExtraData) null);
    }

    public k(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable) {
        this(i, i2, enumC1273550jFJ, i3, matrix, surfaceTextureHelper, runnable, (VideoFrame.IExtraData) null);
    }

    public k(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this(i, i2, enumC1273550jFJ, i3, matrix, null, interfaceC1268620j7M, runnable, iExtraData, TimeUtils.currentTimeMs());
    }

    public k(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this(i, i2, enumC1273550jFJ, i3, matrix, surfaceTextureHelper, null, runnable, iExtraData, 0L);
    }

    public k(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable, VideoFrame.IExtraData iExtraData, long j) {
        this.transformMatrixArray = C1273510jFF.LIZIZ();
        this.refCountLock = new Object();
        this.mFenceObj = 0L;
        this.mUVRange = new UVRange();
        init(i, i2, enumC1273550jFJ, i3, matrix, surfaceTextureHelper, interfaceC1268620j7M, runnable, iExtraData, j);
    }

    private void init(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable, VideoFrame.IExtraData iExtraData, long j) {
        this.width = i;
        this.height = i2;
        this.type = enumC1273550jFJ;
        this.id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.releaseCallback = runnable;
        this.mToI420Interface = interfaceC1268620j7M;
        this.extData = iExtraData;
        this.captureMs = j;
        this.refCount = 1;
    }

    public void reuseTextureBuffer(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable, VideoFrame.IExtraData iExtraData, long j) {
        init(i, i2, enumC1273550jFJ, i3, matrix, surfaceTextureHelper, interfaceC1268620j7M, runnable, iExtraData, j);
        this.mROIInfo = null;
        this.captureServerNtpMs = 0L;
        this.effectServerNtpMs = 0L;
        this.mFenceObj = 0L;
        reuseBuffer();
    }
}
