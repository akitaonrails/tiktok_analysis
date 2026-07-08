package com.ss.bytertc.engine.utils;

import X.C0VSJ;
import X.C0VSV;
import X.C1280200jQ2;
import X.C1280210jQ3;
import X.C1C7U;
import X.C2179971ATj;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.opengl.EGLContext;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.video.ITextureBuffer;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer, EglContextCarrier, ITextureBuffer {
    public final int height;
    public final int id;
    public EglBase.Context mEglBaseContext;
    public int refCount;
    public final Object refCountLock;
    public final Runnable releaseCallback;
    public FilterType scaleFilter;
    public final TextureHelper textureHelper;
    public final Matrix transformMatrix;
    public final VideoFrame.TextureBuffer.Type type;
    public final int width;
    public YuvImage yuvImage;

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return C1280210jQ3.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C1280200jQ2.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        int i;
        final int iDequeueTexture = this.textureHelper.dequeueTexture();
        if (iDequeueTexture == 0) {
            return null;
        }
        VideoFrame.TextureBuffer.Type type = this.type;
        if (type == VideoFrame.TextureBuffer.Type.RGB) {
            i = 10;
        } else {
            if (type != VideoFrame.TextureBuffer.Type.OES) {
                return null;
            }
            i = 11;
        }
        this.textureHelper.drawTexture(i, this.id, iDequeueTexture);
        return new TextureBufferImpl(this.width, this.height, this.type, this.id, this.transformMatrix, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureBufferImpl@2f58.copyData$1");
                com_ss_bytertc_engine_utils_TextureBufferImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureBufferImpl@2f58.copyData$1");
            }

            public void com_ss_bytertc_engine_utils_TextureBufferImpl$2__run$___twin___() {
                TextureBufferImpl.this.textureHelper.queueTexture(iDequeueTexture);
            }

            public static void com_ss_bytertc_engine_utils_TextureBufferImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_ss_bytertc_engine_utils_TextureBufferImpl$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        TextureHelper textureHelper = this.textureHelper;
        if (textureHelper != null) {
            return textureHelper.getEglBaseContext().getEgl14Context();
        }
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        TextureHelper textureHelper = this.textureHelper;
        if (textureHelper != null) {
            return textureHelper.getNativeEglContext();
        }
        return 0L;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        Runnable runnable;
        synchronized (this.refCountLock) {
            try {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
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

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.textureHelper.textureToYuv(this);
    }

    @Override // com.ss.bytertc.engine.utils.EglContextCarrier
    public EglBase.Context getEglBaseContext() {
        return this.mEglBaseContext;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    public TextureHelper getTextureHelper() {
        return this.textureHelper;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.bytertc.engine.utils.EglContextCarrier
    public void setEglBaseContext(EglBase.Context context) {
        this.mEglBaseContext = context;
    }

    public void setTransFormMatrix(float[] fArr) {
        RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
    }

    public void saveMyBitmap(String str, byte[] bArr, int i, int i2) {
        C0VSV c0vsv;
        LogUtil.i("texturebuffer", "saveMyBitmap");
        C0VSJ c0vsj = new C0VSJ(str);
        try {
            c0vsj.createNewFile();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            c0vsv = new C0VSV(c0vsj);
        } catch (FileNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            c0vsv = null;
        }
        try {
            new YuvImage(bArr, 17, this.width, this.height, null).compressToJpeg(new Rect(0, 0, this.width, this.height), 50, c0vsv);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            c0vsv.flush();
        } catch (IOException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            c0vsv.close();
        } catch (IOException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        matrix.preScale(Math.min(i, (getWidth() * i2) / getHeight()) / getWidth(), Math.min(i2, (getHeight() * i) / getWidth()) / getHeight());
        matrix.preTranslate(i3 / i, (i2 - (i4 + r3)) / i2);
        return new TextureBufferImpl(i, i2, this.type, this.id, matrix, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.5
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureBufferImpl@2f58.scaleAndFill$1");
                com_ss_bytertc_engine_utils_TextureBufferImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureBufferImpl@2f58.scaleAndFill$1");
            }

            public void com_ss_bytertc_engine_utils_TextureBufferImpl$5__run$___twin___() {
                TextureBufferImpl.this.release();
            }

            public static void com_ss_bytertc_engine_utils_TextureBufferImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                try {
                    anonymousClass5.com_ss_bytertc_engine_utils_TextureBufferImpl$5__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public TextureBufferImpl(int i, int i2, int i3, final int i4, final TextureHelper textureHelper) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.OES;
        if (i3 == type.getGlTarget()) {
            this.type = type;
        } else {
            this.type = VideoFrame.TextureBuffer.Type.RGB;
        }
        this.id = i4;
        Matrix matrix = new Matrix();
        this.transformMatrix = matrix;
        matrix.reset();
        this.textureHelper = textureHelper;
        this.releaseCallback = new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureBufferImpl@2f58.<init>$1");
                com_ss_bytertc_engine_utils_TextureBufferImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureBufferImpl@2f58.<init>$1");
            }

            public void com_ss_bytertc_engine_utils_TextureBufferImpl$1__run$___twin___() {
                textureHelper.releaseTextureID(i4);
            }

            public static void com_ss_bytertc_engine_utils_TextureBufferImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_bytertc_engine_utils_TextureBufferImpl$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.refCount = 1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.width, (r4 - (i2 + i4)) / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = null;
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i5, i6, this.type, this.id, matrix2, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.3
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureBufferImpl@2f58.cropAndScale$1");
                com_ss_bytertc_engine_utils_TextureBufferImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureBufferImpl@2f58.cropAndScale$1");
            }

            public void com_ss_bytertc_engine_utils_TextureBufferImpl$3__run$___twin___() {
                TextureBufferImpl.this.release();
            }

            public static void com_ss_bytertc_engine_utils_TextureBufferImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                try {
                    anonymousClass3.com_ss_bytertc_engine_utils_TextureBufferImpl$3__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, TextureHelper textureHelper, Runnable runnable) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.textureHelper = textureHelper;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.width, (r4 - (i2 + i4)) / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.fromValue(i7);
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i5, i6, this.type, this.id, matrix2, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.4
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureBufferImpl@2f58.cropAndScaleWithFilter$1");
                com_ss_bytertc_engine_utils_TextureBufferImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureBufferImpl@2f58.cropAndScaleWithFilter$1");
            }

            public void com_ss_bytertc_engine_utils_TextureBufferImpl$4__run$___twin___() {
                TextureBufferImpl.this.release();
            }

            public static void com_ss_bytertc_engine_utils_TextureBufferImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                try {
                    anonymousClass4.com_ss_bytertc_engine_utils_TextureBufferImpl$4__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
