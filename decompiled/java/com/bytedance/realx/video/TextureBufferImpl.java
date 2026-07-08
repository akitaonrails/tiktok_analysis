package com.bytedance.realx.video;

import X.C1280200jQ2;
import X.C1280210jQ3;
import X.C1C7U;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    public final int height;
    public final int id;
    public final RefCountDelegate refCountDelegate;
    public FilterType scaleFilter;
    public final Handler toI420Handler;
    public final Matrix transformMatrix;
    public final VideoFrame.TextureBuffer.Type type;
    public final int unscaledHeight;
    public final int unscaledWidth;
    public final int width;
    public final YuvConverter yuvConverter;

    public static /* synthetic */ void lambda$semisugar$release$0(TextureBufferImpl textureBufferImpl) {
        C1C7U.LIZ("TextureBufferImpl@d79d.applyTransformMatrix$1L");
        textureBufferImpl.release();
        C1C7U.LIZIZ("TextureBufferImpl@d79d.applyTransformMatrix$1L");
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return C1280210jQ3.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C1280200jQ2.LIZ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TextureBufferImpl lambda$copyData$4() {
        C1C7U.LIZ("TextureBufferImpl@d79d.copyData$1L");
        final int iDequeueTexture = this.yuvConverter.dequeueTexture(this.width, this.height);
        if (iDequeueTexture == 0) {
            C1C7U.LIZIZ("TextureBufferImpl@d79d.copyData$1L");
            return null;
        }
        this.yuvConverter.drawTexture(this.type == VideoFrame.TextureBuffer.Type.OES ? 11 : 10, this.id, iDequeueTexture, this.width, this.height);
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.width, this.height, VideoFrame.TextureBuffer.Type.RGB, iDequeueTexture, this.transformMatrix, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: X.0jQe
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$copyData$3(iDequeueTexture);
            }
        });
        C1C7U.LIZIZ("TextureBufferImpl@d79d.copyData$1L");
        return textureBufferImpl;
    }

    public static /* synthetic */ EGLContext lambda$getEglContext$0() {
        C1C7U.LIZ("TextureBufferImpl@d79d.getEglContext$1L");
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        C1C7U.LIZIZ("TextureBufferImpl@d79d.getEglContext$1L");
        return eGLContextEglGetCurrentContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() {
        C1C7U.LIZ("TextureBufferImpl@d79d.toI420$1L");
        VideoFrame.I420Buffer i420BufferConvert = this.yuvConverter.convert(this);
        C1C7U.LIZIZ("TextureBufferImpl@d79d.toI420$1L");
        return i420BufferConvert;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$2() {
        C1C7U.LIZ("TextureBufferImpl@d79d.toI420$2L");
        VideoFrame.I420Buffer i420BufferConvert = this.yuvConverter.convert(this, this.scaleFilter, this.unscaledWidth, this.unscaledHeight);
        C1C7U.LIZIZ("TextureBufferImpl@d79d.toI420$2L");
        return i420BufferConvert;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return (VideoFrame.Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: X.0jQd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.lambda$copyData$4();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        Handler handler = this.toI420Handler;
        if (handler == null) {
            return null;
        }
        return (EGLContext) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: X.0jQZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureBufferImpl.lambda$getEglContext$0();
            }
        });
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
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        FilterType filterType = this.scaleFilter;
        return (filterType == null || filterType == FilterType.Origin) ? (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: X.0jQa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.lambda$toI420$1();
            }
        }) : (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: X.0jQb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.lambda$toI420$2();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EGLContext eglContext = getEglContext();
        if (eglContext == null) {
            return 0L;
        }
        return eglContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return this.scaleFilter;
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
        return this.unscaledHeight;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copyData$3(int i) {
        C1C7U.LIZ("TextureBufferImpl@d79d.copyData$1L$1L");
        this.yuvConverter.queueTexture(i);
        C1C7U.LIZIZ("TextureBufferImpl@d79d.copyData$1L$1L");
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        matrix.preScale(Math.min(i, (getWidth() * i2) / getHeight()) / getWidth(), Math.min(i2, (getHeight() * i) / getWidth()) / getHeight());
        matrix.preTranslate(i3 / i, (i2 - (i4 + r3)) / i2);
        return applyTransformMatrix(matrix, i, i2);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, i3, i4, this.type, this.id, this.scaleFilter, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: X.0jQc
            @Override // java.lang.Runnable
            public final void run() {
                TextureBufferImpl.lambda$semisugar$release$0(this.LL);
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.width, (r3 - (i2 + i4)) / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.Origin;
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.width, (r3 - (i2 + i4)) / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.fromValue(i7);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public TextureBufferImpl(int i, int i2, int i3, int i4, VideoFrame.TextureBuffer.Type type, int i5, FilterType filterType, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type;
        this.id = i5;
        this.scaleFilter = filterType;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
