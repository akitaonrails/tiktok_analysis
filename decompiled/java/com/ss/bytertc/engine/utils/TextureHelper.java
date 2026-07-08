package com.ss.bytertc.engine.utils;

import X.C1280730jQt;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.realx.video.YuvHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.utils.TextureHelper;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class TextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public static float[] YUV_TEX_MATRIX = new float[16];
    public final EglBase mEglBase;
    public int mFrameBufferId;
    public final Handler mHandler;
    public int mHeight;
    public boolean mIsQuitting;
    public boolean mIsRelease;
    public boolean mIsTextureInUse;
    public int mTextureCnt;
    public GlRectDrawer mTextureDrawer;
    public List<Integer> mTextureFreeQueue = new LinkedList();
    public List<Integer> mTextureUsedQueue = new LinkedList();
    public int mWidth;
    public YuvConverter mYuvConverter;
    public YuvUploader mYuvUploader;

    public int dequeueTexture() {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.0jPx
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$dequeueTexture$3(iArr);
            }
        });
        return iArr[0];
    }

    public synchronized void dispose() {
        LogUtil.d("TextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.0jQ0
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$dispose$7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$7() {
        C1C7U.LIZ("TextureHelper@1e94.dispose$1L");
        this.mIsQuitting = true;
        if (!this.mIsTextureInUse) {
            release();
        }
        C1C7U.LIZIZ("TextureHelper@1e94.dispose$1L");
    }

    public EglBase.Context getEglBaseContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public long getNativeEglContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0L;
    }

    public void release() {
        if (this.mHandler.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.mIsTextureInUse || !this.mIsQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        this.mIsRelease = true;
        YuvConverter yuvConverter = this.mYuvConverter;
        if (yuvConverter != null) {
            yuvConverter.release();
        }
        YuvUploader yuvUploader = this.mYuvUploader;
        if (yuvUploader != null) {
            yuvUploader.release();
        }
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it2 = this.mTextureFreeQueue.iterator();
            while (it2.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
            }
        }
        this.mTextureFreeQueue.clear();
        List<Integer> list2 = this.mTextureUsedQueue;
        if (list2 != null && list2.size() > 0) {
            Iterator<Integer> it3 = this.mTextureUsedQueue.iterator();
            while (it3.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it3.next().intValue()}, 0);
            }
        }
        this.mTextureUsedQueue.clear();
        GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
        this.mFrameBufferId = 0;
        this.mEglBase.release();
        this.mHandler.getLooper().quit();
    }

    public static class YuvUploader {
        public ByteBuffer copyBuffer;
        public int[] yuvTextures;

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = 0;
            int i4 = i / 2;
            int[] iArr2 = {i, i4, i4};
            int i5 = i2 / 2;
            int[] iArr3 = {i2, i5, i5};
            int i6 = 0;
            int iMax = 0;
            do {
                int i7 = iArr[i6];
                int i8 = iArr2[i6];
                if (i7 > i8) {
                    iMax = Math.max(iMax, i8 * iArr3[i6]);
                }
                i6++;
            } while (i6 < 3);
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i9 = 0;
                do {
                    this.yuvTextures[i9] = GlUtil.generateTexture(3553);
                    i9++;
                } while (i9 < 3);
            }
            do {
                GLES20.glPixelStorei(3317, 1);
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.yuvTextures[i3]);
                int i10 = iArr[i3];
                int i11 = iArr2[i3];
                if (i10 == i11) {
                    byteBuffer = byteBufferArr[i3];
                } else {
                    YuvHelper.nativeCopyPlane(byteBufferArr[i3], i10, this.copyBuffer, i11, i11, iArr3[i3]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i3], iArr3[i3], 0, 6409, 5121, byteBuffer);
                i3++;
            } while (i3 < 3);
            return this.yuvTextures;
        }
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dequeueTexture$3(int[] iArr) {
        C1C7U.LIZ("TextureHelper@1e94.dequeueTexture$1L");
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null) {
            if (list.size() == 0) {
                int iGenerateTexture = generateTexture(3553, this.mWidth, this.mHeight);
                iArr[0] = iGenerateTexture;
                if (iGenerateTexture > 0) {
                    this.mTextureUsedQueue.add(Integer.valueOf(iGenerateTexture));
                }
            } else {
                iArr[0] = ((Integer) ListProtector.get(this.mTextureFreeQueue, 0)).intValue();
                ListProtector.remove(this.mTextureFreeQueue, 0);
                this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
            }
        }
        C1C7U.LIZIZ("TextureHelper@1e94.dequeueTexture$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueTexture$4(int i) {
        C1C7U.LIZ("TextureHelper@1e94.queueTexture$1L");
        List<Integer> list = this.mTextureUsedQueue;
        if (list != null && list.contains(Integer.valueOf(i))) {
            this.mTextureUsedQueue.remove(new Integer(i));
            List<Integer> list2 = this.mTextureFreeQueue;
            if (list2 != null) {
                list2.add(Integer.valueOf(i));
            }
        }
        C1C7U.LIZIZ("TextureHelper@1e94.queueTexture$1L");
    }

    public static /* synthetic */ void lambda$releaseTextureID$5(int i) {
        C1C7U.LIZ("TextureHelper@1e94.releaseTextureID$1L");
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        C1C7U.LIZIZ("TextureHelper@1e94.releaseTextureID$1L");
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, runnable);
        }
    }

    public void queueTexture(final int i) {
        C786410Ut5.LJJZZIII(this.mHandler, new Runnable() { // from class: X.0jQ1
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$queueTexture$4(i);
            }
        });
    }

    public void releaseTextureID(final int i) {
        if (i > 0 && !this.mIsQuitting && !this.mIsRelease) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.0jPz
                @Override // java.lang.Runnable
                public final void run() {
                    TextureHelper.lambda$releaseTextureID$5(i);
                }
            });
        }
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr;
        i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureHelper@1e94.textureToYuv$1");
                com_ss_bytertc_engine_utils_TextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureHelper@1e94.textureToYuv$1");
            }

            public void com_ss_bytertc_engine_utils_TextureHelper$3__run$___twin___() {
                TextureHelper textureHelper = TextureHelper.this;
                textureHelper.mIsTextureInUse = true;
                if (textureHelper.mYuvConverter == null) {
                    textureHelper.mYuvConverter = new YuvConverter();
                }
                TextureHelper textureHelper2 = TextureHelper.this;
                if (textureHelper2.mTextureDrawer == null) {
                    textureHelper2.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper textureHelper3 = TextureHelper.this;
                textureHelper3.mIsTextureInUse = false;
                if (textureHelper3.mIsQuitting) {
                    textureHelper3.release();
                }
            }

            public static void com_ss_bytertc_engine_utils_TextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                try {
                    anonymousClass3.com_ss_bytertc_engine_utils_TextureHelper$3__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
        return i420BufferArr[0];
    }

    public void yuvToTexture(VideoFrame.I420Buffer i420Buffer, int i) {
        yuvToTexture(i420Buffer, i, YUV_TEX_MATRIX);
    }

    private int generateTexture(final int i, final int i2, final int i3) {
        if (this.mTextureCnt == 45) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Callable() { // from class: X.0jPy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.lambda$generateTexture$6(i, i2, i3);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$generateTexture$6(int i, int i2, int i3) {
        C1C7U.LIZ("TextureHelper@1e94.generateTexture$1L");
        int iGenerateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            C1C7U.LIZIZ("TextureHelper@1e94.generateTexture$1L");
            return 0;
        }
        this.mTextureCnt++;
        Integer numValueOf = Integer.valueOf(iGenerateTexture);
        C1C7U.LIZIZ("TextureHelper@1e94.generateTexture$1L");
        return numValueOf;
    }

    public void drawTexture(int i, int i2, int i3) {
        drawTexture(i, i2, i3, TEX_MATRIX);
    }

    public void yuvToTexture(final VideoFrame.I420Buffer i420Buffer, final int i, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureHelper@1e94.yuvToTexture$1");
                com_ss_bytertc_engine_utils_TextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureHelper@1e94.yuvToTexture$1");
            }

            public void com_ss_bytertc_engine_utils_TextureHelper$2__run$___twin___() {
                TextureHelper textureHelper = TextureHelper.this;
                if (textureHelper.mTextureDrawer == null || textureHelper.mYuvUploader == null) {
                    throw new IllegalStateException("mTextureDrawer and mYuvUploader can not null.");
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                TextureHelper.this.mYuvUploader.uploadFromBuffer(i420Buffer);
                TextureHelper textureHelper2 = TextureHelper.this;
                GlRectDrawer glRectDrawer = textureHelper2.mTextureDrawer;
                int[] yuvTextures = textureHelper2.mYuvUploader.getYuvTextures();
                float[] fArr2 = fArr;
                TextureHelper textureHelper3 = TextureHelper.this;
                int i2 = textureHelper3.mWidth;
                int i3 = textureHelper3.mHeight;
                glRectDrawer.drawYuv(yuvTextures, fArr2, i2, i3, 0, 0, i2, i3);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }

            public static void com_ss_bytertc_engine_utils_TextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_ss_bytertc_engine_utils_TextureHelper$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public TextureHelper(Object obj, Handler handler, int i, int i2) {
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mHandler = handler;
            Matrix.setIdentityM(TEX_MATRIX, 0);
            Matrix.setIdentityM(YUV_TEX_MATRIX, 0);
            Matrix.translateM(YUV_TEX_MATRIX, 0, 0.5f, 0.5f, 0.0f);
            Matrix.scaleM(YUV_TEX_MATRIX, 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(YUV_TEX_MATRIX, 0, -0.5f, -0.5f, 0.0f);
            if (obj instanceof EGLContext) {
                this.mEglBase = C1280730jQt.LIZLLL((EGLContext) obj, C1280730jQt.LJIIJ(2, EglBase.Config.CONFIG_PIXEL_BUFFER));
            } else if (obj instanceof android.opengl.EGLContext) {
                this.mEglBase = C1280730jQt.LJFF((android.opengl.EGLContext) obj, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PIXEL_BUFFER));
            } else if (obj instanceof EglBase.Context) {
                this.mEglBase = C1280730jQt.LIZJ((EglBase.Context) obj, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PIXEL_BUFFER));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown shareContext:");
                sbLIZ.append(obj);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
                this.mEglBase.makeCurrent();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFrameBufferId = iArr[0];
                this.mTextureDrawer = new GlRectDrawer();
                this.mYuvUploader = new YuvUploader();
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                return;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                this.mEglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("TextureHelper must be created on the handler thread");
    }

    public static TextureHelper create(final String str, final android.opengl.EGLContext eGLContext, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Callable() { // from class: X.0jPw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$1(eGLContext, bPEAHandler, i, i2, str);
            }
        });
    }

    public void drawTexture(final int i, final int i2, final int i3, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("TextureHelper@1e94.drawTexture$1");
                com_ss_bytertc_engine_utils_TextureHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TextureHelper@1e94.drawTexture$1");
            }

            public void com_ss_bytertc_engine_utils_TextureHelper$1__run$___twin___() {
                TextureHelper textureHelper = TextureHelper.this;
                if (textureHelper.mTextureDrawer == null) {
                    textureHelper.mTextureDrawer = new GlRectDrawer();
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                int i4 = i;
                if (i4 == 10) {
                    TextureHelper textureHelper2 = TextureHelper.this;
                    GlRectDrawer glRectDrawer = textureHelper2.mTextureDrawer;
                    int i5 = i2;
                    float[] fArr2 = fArr;
                    int i6 = textureHelper2.mWidth;
                    int i7 = textureHelper2.mHeight;
                    glRectDrawer.drawRgb(i5, fArr2, i6, i7, 0, 0, i6, i7);
                } else if (i4 != 11) {
                    LogUtil.e("TextureHelper", "draw texture type error");
                } else {
                    TextureHelper textureHelper3 = TextureHelper.this;
                    GlRectDrawer glRectDrawer2 = textureHelper3.mTextureDrawer;
                    int i8 = i2;
                    float[] fArr3 = fArr;
                    int i9 = textureHelper3.mWidth;
                    int i10 = textureHelper3.mHeight;
                    glRectDrawer2.drawOes(i8, fArr3, i9, i10, 0, 0, i9, i10);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }

            public static void com_ss_bytertc_engine_utils_TextureHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_bytertc_engine_utils_TextureHelper$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public static TextureHelper create(final String str, final EglBase.Context context, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Callable() { // from class: X.0jPu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$2(context, bPEAHandler, i, i2, str);
            }
        });
    }

    public static TextureHelper create(final String str, final EGLContext eGLContext, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Callable() { // from class: X.0jPv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$0(eGLContext, bPEAHandler, i, i2, str);
            }
        });
    }

    public static /* synthetic */ TextureHelper lambda$create$0(EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        C1C7U.LIZ("TextureHelper@1e94.create$1L");
        try {
            TextureHelper textureHelper = new TextureHelper(eGLContext, handler, i, i2);
            C1C7U.LIZIZ("TextureHelper@1e94.create$1L");
            return textureHelper;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" create failure");
            LogUtil.e("TextureHelper", C2188811AlT.LIZIZ(sbLIZ), e);
            C1C7U.LIZIZ("TextureHelper@1e94.create$1L");
            return null;
        }
    }

    public static /* synthetic */ TextureHelper lambda$create$1(android.opengl.EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        C1C7U.LIZ("TextureHelper@1e94.create$2L");
        try {
            TextureHelper textureHelper = new TextureHelper(eGLContext, handler, i, i2);
            C1C7U.LIZIZ("TextureHelper@1e94.create$2L");
            return textureHelper;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" create failure");
            LogUtil.e("TextureHelper", C2188811AlT.LIZIZ(sbLIZ), e);
            C1C7U.LIZIZ("TextureHelper@1e94.create$2L");
            return null;
        }
    }

    public static /* synthetic */ TextureHelper lambda$create$2(EglBase.Context context, Handler handler, int i, int i2, String str) {
        C1C7U.LIZ("TextureHelper@1e94.create$3L");
        try {
            TextureHelper textureHelper = new TextureHelper(context, handler, i, i2);
            C1C7U.LIZIZ("TextureHelper@1e94.create$3L");
            return textureHelper;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" create failure");
            LogUtil.e("TextureHelper", C2188811AlT.LIZIZ(sbLIZ), e);
            C1C7U.LIZIZ("TextureHelper@1e94.create$3L");
            return null;
        }
    }
}
