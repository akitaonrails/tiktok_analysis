package com.ss.ttlivestreamer.core.mixer;

import X.C1269320j8U;
import X.C1269330j8V;
import X.C1271780jCS;
import X.C1271790jCT;
import X.C1273010jER;
import X.C1273520jFG;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1273550jFJ;
import X.InterfaceC1268620j7M;
import X.InterfaceC1271560jC6;
import X.InterfaceC1272820jE8;
import Y.ARunnableS120S0100000_20;
import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class VideoMixer extends NativeMixer implements InterfaceC1268620j7M {
    public static int TEXTURE_TYPE_2D = 1;
    public static int TEXTURE_TYPE_OES = 2;
    public static int TEXTURE_TYPE_UNKNOWN = 0;
    public static int TEXTURE_TYPE_YUV = 3;
    public final long mWeakNativeThis;
    public YuvConverter mYuvConverter;
    public C1271780jCS textureBufferPoolService;
    public C1271790jCT videoFrameCachePoolService;
    public final C1269320j8U texBufferMatrixCache = new C1269320j8U();
    public boolean mHaveNativeObj = true;

    public static class VideoMixerDescription {
        public float alpha;
        public float bottom;
        public long flags;
        public float left;
        public float right;
        public float top;
        public int zOrder;

        public static VideoMixerDescription CENTER() {
            return new VideoMixerDescription(0.25f, 0.25f, 0.75f, 0.75f, 0, 1L);
        }

        public static VideoMixerDescription FILL() {
            return new VideoMixerDescription(0.0f, 0.0f, 1.0f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription INVISIABLE() {
            return new VideoMixerDescription(1.0f, 1.0f, 1.1f, 1.1f, 0, 1L);
        }

        public static VideoMixerDescription LEFT_DOWN() {
            return new VideoMixerDescription(0.0f, 0.5f, 0.5f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription LEFT_HALF() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription LEFT_UP() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 0.5f, 0, 1L);
        }

        public static VideoMixerDescription RIGHT_DOWN() {
            return new VideoMixerDescription(0.5f, 0.5f, 1.0f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription RIGHT_HALF() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription RIGHT_UP() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 0.5f, 0, 1L);
        }

        public static VideoMixerDescription builder() {
            return new VideoMixerDescription();
        }

        public int getMode() {
            return (this.flags & 1) != 0 ? 1 : 2;
        }

        public boolean isEnableAlphaMode() {
            return (this.flags & 16) > 0;
        }

        public boolean isVisible() {
            return (this.flags & 8) == 0;
        }

        public VideoMixerDescription() {
            this.alpha = -1.0f;
            this.flags = 1L;
            this.right = 1.0f;
            this.bottom = 1.0f;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoDescription(this:");
            sbLIZ.append(super.toString());
            sbLIZ.append(",l:");
            sbLIZ.append(this.left);
            sbLIZ.append(",r:");
            sbLIZ.append(this.right);
            sbLIZ.append(",t:");
            sbLIZ.append(this.top);
            sbLIZ.append(",b:");
            sbLIZ.append(this.bottom);
            sbLIZ.append(",z:");
            sbLIZ.append(this.zOrder);
            sbLIZ.append(",f:");
            sbLIZ.append(this.flags);
            sbLIZ.append(")");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public float getAlpha() {
            return this.alpha;
        }

        public float getBottom() {
            return this.bottom;
        }

        public long getFlags() {
            return this.flags;
        }

        public float getLeft() {
            return this.left;
        }

        public float getRight() {
            return this.right;
        }

        public float getTop() {
            return this.top;
        }

        public int getzOrder() {
            return this.zOrder;
        }

        public void copy(VideoMixerDescription videoMixerDescription) {
            this.left = videoMixerDescription.left;
            this.right = videoMixerDescription.right;
            this.top = videoMixerDescription.top;
            this.bottom = videoMixerDescription.bottom;
            this.zOrder = videoMixerDescription.zOrder;
            this.flags = videoMixerDescription.flags;
        }

        public boolean isMirror(boolean z) {
            long j = this.flags;
            if (z) {
                if ((j & 2) != 0) {
                    return true;
                }
                return false;
            }
            if ((j & 4) != 0) {
                return true;
            }
            return false;
        }

        public VideoMixerDescription setAlpha(float f) {
            this.alpha = f;
            return this;
        }

        public void setAutoFillOnFit(boolean z) {
            if (z) {
                this.flags |= 32;
            } else {
                this.flags &= -33;
            }
        }

        public VideoMixerDescription setBottom(float f) {
            this.bottom = f;
            return this;
        }

        public VideoMixerDescription setEnableAlphaMode(boolean z) {
            if (!z) {
                this.flags &= -17;
                return this;
            }
            this.flags |= 16;
            return this;
        }

        public VideoMixerDescription setLeft(float f) {
            this.left = f;
            return this;
        }

        public VideoMixerDescription setMode(int i) {
            if (i != 1) {
                if (i == 2) {
                    this.flags &= -2;
                }
                return this;
            }
            this.flags |= 1;
            return this;
        }

        public VideoMixerDescription setRight(float f) {
            this.right = f;
            return this;
        }

        public VideoMixerDescription setTop(float f) {
            this.top = f;
            return this;
        }

        public VideoMixerDescription setVisibility(boolean z) {
            if (z) {
                this.flags &= -9;
                return this;
            }
            this.flags |= 8;
            return this;
        }

        public VideoMixerDescription setzOrder(int i) {
            this.zOrder = i;
            return this;
        }

        public VideoMixerDescription setMirror(boolean z, boolean z2) {
            if (z) {
                if (z2) {
                    this.flags |= 2;
                    return this;
                }
                this.flags &= -3;
                return this;
            }
            if (z2) {
                this.flags |= 4;
                return this;
            }
            this.flags &= -5;
            return this;
        }

        public VideoMixerDescription(float f, float f2, float f3, float f4, int i, long j) {
            this.alpha = -1.0f;
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
            this.zOrder = i;
            this.flags = j;
        }
    }

    public static /* synthetic */ void lambda$semisugar$nativeReleaseTexture$0(VideoMixer videoMixer) {
        C1C7U.LIZ("VideoMixer@11ab.wrapperTextureBuffer$1L");
        videoMixer.nativeReleaseTexture();
        C1C7U.LIZIZ("VideoMixer@11ab.wrapperTextureBuffer$1L");
    }

    private native void nativeAddVideoSink(VideoSink videoSink);

    private native void nativeCreate();

    private native void nativeReleaseTexture();

    private native void nativeRemoveVideoSink(VideoSink videoSink);

    private native void nativeReportLayersInfo();

    private native void nativeSetIsGameMixer(boolean z);

    private native void nativeSetLayerName(int i, String str);

    private native void nativeSetWPublishMode(boolean z);

    private native VideoMixerTexture nativeUploadI420ImageToTexture(long j, int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5);

    private native void nativeVideoMixerRelease(long j);

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isAudioMixer() {
        return false;
    }

    public native int nativeMixFrame(boolean z, int i, VideoFrame videoFrame);

    public native int nativeMixFrameTex(boolean z, int i, int i2, int i3, int i4, int i5, int[] iArr, float[] fArr);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mHaveNativeObj) {
            super.release();
        } else if (this.mNativeObj != 0) {
            nativeVideoMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapperTextureBuffer$0() {
        C1C7U.LIZ("VideoMixer@11ab.wrapperTextureBuffer$2L");
        nativeReleaseTexture();
        C1C7U.LIZIZ("VideoMixer@11ab.wrapperTextureBuffer$2L");
    }

    public VideoMixer() {
        nativeCreate();
        this.mWeakNativeThis = this.mNativeObj;
    }

    public int createTrack() {
        return super.nativeCreateTrack(VideoMixerDescription.builder());
    }

    public static class VideoMixerTexture {
        public static final ThreadLocal<C1269330j8V> matrixCacheThreadLocal = new ThreadLocal<>();
        public int height;
        public int rotation;
        public float[] texMatrix;
        public int[] textures;
        public int type;
        public int width;

        public VideoMixerTexture() {
        }

        public int getHeight() {
            return this.height;
        }

        public int getRotation() {
            return this.rotation;
        }

        public float[] getTexMatrix() {
            return this.texMatrix;
        }

        public int[] getTextures() {
            return this.textures;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public VideoMixerTexture(int i, int i2, int i3, int i4, int[] iArr, float[] fArr) {
            float[] fArrCopyOf;
            if (iArr.length != 3) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Texture array error!");
                C1274080jGA.LIZ.LIZ("VideoMixer#VideoMixerTexture.VideoMixerTexture", androidRuntimeException);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException;
                }
            }
            this.textures = iArr;
            this.rotation = i3;
            this.type = i4;
            if (C1273520jFG.LIZJ) {
                if (i3 % 180 != 0) {
                    this.width = i2;
                    this.height = i;
                } else {
                    this.width = i;
                    this.height = i2;
                }
                ThreadLocal<C1269330j8V> threadLocal = matrixCacheThreadLocal;
                C1269330j8V c1269330j8V = threadLocal.get();
                if (c1269330j8V == null) {
                    c1269330j8V = new C1269330j8V();
                    threadLocal.set(c1269330j8V);
                }
                if (c1269330j8V.LIZ == null || i3 != c1269330j8V.LIZIZ || !Arrays.equals(fArr, c1269330j8V.LIZJ)) {
                    if (fArr != null) {
                        fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                    } else {
                        fArrCopyOf = null;
                    }
                    c1269330j8V.LIZJ = fArrCopyOf;
                    c1269330j8V.LIZIZ = i3;
                    if (i3 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.preTranslate(0.5f, 0.5f);
                        matrix.preRotate(-i3);
                        matrix.preTranslate(-0.5f, -0.5f);
                        if (fArr != null) {
                            matrix.preConcat(C1273010jER.LIZJ(0, fArr));
                        }
                        fArr = C1273010jER.LIZIZ(matrix);
                    } else if (fArr == null) {
                        fArr = C1273010jER.LJ();
                    }
                    c1269330j8V.LIZ = fArr;
                }
                this.texMatrix = c1269330j8V.LIZ;
                return;
            }
            this.width = i;
            this.height = i2;
            if (i3 != 0) {
                Matrix matrixLIZJ = C1273520jFG.LIZJ(false);
                matrixLIZJ.reset();
                if (i3 % 180 != 0) {
                    this.width = i2;
                    this.height = i;
                }
                matrixLIZJ.preTranslate(0.5f, 0.5f);
                matrixLIZJ.preRotate(-i3);
                matrixLIZJ.preTranslate(-0.5f, -0.5f);
                if (fArr != null) {
                    matrixLIZJ.preConcat(C1273010jER.LIZJ(0, fArr));
                }
                this.texMatrix = C1273010jER.LIZIZ(matrixLIZJ);
                return;
            }
            this.texMatrix = fArr == null ? C1273010jER.LJ() : fArr;
        }
    }

    private boolean isHaveNativeObj() {
        return this.mHaveNativeObj;
    }

    public void reportLayersInfo() {
        nativeReportLayersInfo();
    }

    public VideoMixer(long j) {
        setNativeObj(j);
        this.mWeakNativeThis = j;
    }

    public void AddVideoSink(VideoSink videoSink) {
        addVideoSink(videoSink);
    }

    public void RemoveVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
    }

    public void addVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
    }

    public int createTrack(VideoMixerDescription videoMixerDescription) {
        return super.nativeCreateTrack(videoMixerDescription);
    }

    public VideoMixerDescription getDescription(int i) {
        return (VideoMixerDescription) super.nativeGetDescription(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.ttlivestreamer.core.mixer.VideoMixer.VideoMixerTexture getVideoMixerTexture(com.ss.ttlivestreamer.core.buffer.VideoFrame r15) {
        /*
            r14 = this;
            com.ss.ttlivestreamer.core.buffer.VideoFrame$Buffer r2 = r15.getBuffer()
            com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture r4 = new com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture
            r4.<init>()
            boolean r0 = r2 instanceof X.InterfaceC1271560jC6
            if (r0 == 0) goto L48
            r3 = r2
            X.0jC6 r3 = (X.InterfaceC1271560jC6) r3
            X.0jFJ r1 = r3.getType()
            X.0jFJ r0 = X.EnumC1273550jFJ.OES
            if (r1 != r0) goto L45
            int r0 = com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_OES
        L1a:
            r4.type = r0
            int r0 = r2.getWidth()
            r4.width = r0
            int r0 = r2.getHeight()
            r4.height = r0
            int r0 = r15.getRotation()
            r4.rotation = r0
            android.graphics.Matrix r0 = r3.getTransformMatrix()
            float[] r0 = X.C1273010jER.LIZIZ(r0)
            r4.texMatrix = r0
            r0 = 1
            int[] r2 = new int[r0]
            r4.textures = r2
            r1 = 0
            int r0 = r3.getTextureId()
            r2[r1] = r0
            return r4
        L45:
            int r0 = com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_2D
            goto L1a
        L48:
            boolean r0 = r2 instanceof X.C1271900jCe
            if (r0 == 0) goto Lbb
            X.0jCe r2 = (X.C1271900jCe) r2
            r3 = r14
            long r4 = r3.mWeakNativeThis
            int r6 = r2.LIZ
            int r7 = r2.LIZIZ
            java.nio.ByteBuffer r8 = r2.getDataY()
            int r9 = r2.LJFF
            java.nio.ByteBuffer r10 = r2.getDataU()
            int r11 = r2.LJI
            java.nio.ByteBuffer r12 = r2.getDataV()
            int r13 = r2.LJII
            com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture r3 = r3.nativeUploadI420ImageToTexture(r4, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r3 == 0) goto L85
            float[] r6 = r3.texMatrix
            float[] r8 = X.C1273010jER.LJFF()
            r0 = 16
            float[] r4 = new float[r0]
            r5 = 0
            r7 = r5
            r9 = r5
            android.opengl.Matrix.multiplyMM(r4, r5, r6, r7, r8, r9)
            r3.texMatrix = r4
            int r1 = r3.type
            int r0 = com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_YUV
            if (r1 == r0) goto Lba
        L85:
            android.util.AndroidRuntimeException r2 = new android.util.AndroidRuntimeException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Loading Y/U/V texture exception("
            r1.append(r0)
            if (r3 == 0) goto Lb7
            int r0 = r3.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L9a:
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            X.0jG9 r1 = X.C1274080jGA.LIZ
            java.lang.String r0 = "VideoMixer.getVideoMixerTexture"
            r1.LIZ(r0, r2)
            boolean r0 = X.C1274040jG6.LIZ()
            if (r0 == 0) goto Lba
            throw r2
        Lb7:
            java.lang.String r0 = "return is null."
            goto L9a
        Lba:
            return r3
        Lbb:
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "No implement."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.mixer.VideoMixer.getVideoMixerTexture(com.ss.ttlivestreamer.core.buffer.VideoFrame):com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture");
    }

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isEnable(int i) {
        VideoMixerDescription description = getDescription(i);
        if (description == null || (description.flags & 8) != 0) {
            return false;
        }
        return true;
    }

    public void removeVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
    }

    public void setIsGameMixer(boolean z) {
        nativeSetIsGameMixer(z);
    }

    public void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8) {
        if (interfaceC1272820jE8 != null) {
            this.videoFrameCachePoolService = (C1271790jCT) interfaceC1272820jE8.getService(C1271790jCT.class);
            this.textureBufferPoolService = (C1271780jCS) interfaceC1272820jE8.getService(C1271780jCS.class);
        }
    }

    public void setWPublishMode(boolean z) {
        nativeSetWPublishMode(z);
    }

    @Override // X.InterfaceC1268620j7M
    public VideoFrame.I420Buffer toI420(InterfaceC1271560jC6 interfaceC1271560jC6) {
        if (!GlUtil.nativeIsOpenGlThread()) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Must be gl thread.");
            C1274080jGA.LIZ.LIZ("VideoMixer.toI420", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        if (this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        return this.mYuvConverter.convert(interfaceC1271560jC6);
    }

    public VideoFrame.Buffer wrapperTextureBuffer(VideoMixerTexture videoMixerTexture) {
        Matrix matrix;
        if (C1273520jFG.LIZJ) {
            this.texBufferMatrixCache.LIZ(videoMixerTexture.texMatrix);
            matrix = this.texBufferMatrixCache.LIZ;
        } else {
            float[] fArr = videoMixerTexture.texMatrix;
            if (fArr != null) {
                matrix = C1273010jER.LIZJ(0, fArr);
            } else {
                matrix = new Matrix();
                matrix.reset();
            }
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 108);
        C1271780jCS c1271780jCS = this.textureBufferPoolService;
        if (c1271780jCS != null) {
            k kVarLJ = c1271780jCS.LJ(videoMixerTexture.width, videoMixerTexture.height, EnumC1273550jFJ.RGB, videoMixerTexture.getTextures()[0], matrix, this, aRunnableS120S0100000_20);
            if (kVarLJ == null) {
                aRunnableS120S0100000_20.run();
            }
            return kVarLJ;
        }
        return new k(videoMixerTexture.width, videoMixerTexture.height, EnumC1273550jFJ.RGB, videoMixerTexture.getTextures()[0], matrix, this, aRunnableS120S0100000_20);
    }

    public int mixFrame(int i, VideoMixerTexture videoMixerTexture) {
        if (videoMixerTexture.rotation != 0) {
            videoMixerTexture = new VideoMixerTexture(videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
        }
        return nativeMixFrameTex(this.mHaveNativeObj, i, videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
    }

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public void setEnable(int i, boolean z) {
        VideoMixerDescription description = getDescription(i);
        if (description != null) {
            if (z) {
                description.flags &= -9;
            } else {
                description.flags |= 8;
            }
            updateDescription(i, description);
        }
    }

    public void setLayerName(int i, String str) {
        nativeSetLayerName(i, str);
    }

    public void updateDescription(int i, VideoMixerDescription videoMixerDescription) {
        super.nativeUpdateDescription(i, videoMixerDescription);
    }

    public int mixFrame(int i, VideoFrame videoFrame) {
        return nativeMixFrame(this.mHaveNativeObj, i, videoFrame);
    }

    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, long j) {
        return wrapperTextureBuffer(i, i2, i3, i4, i5, null, j);
    }

    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, float[] fArr, long j) {
        Matrix matrix;
        k kVar;
        if (C1273520jFG.LIZJ) {
            this.texBufferMatrixCache.LIZ(fArr);
            matrix = this.texBufferMatrixCache.LIZ;
        } else if (fArr != null) {
            matrix = C1273010jER.LIZJ(0, fArr);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 109);
        C1271780jCS c1271780jCS = this.textureBufferPoolService;
        if (c1271780jCS != null) {
            kVar = c1271780jCS.LJ(i, i2, EnumC1273550jFJ.RGB, i5, matrix, this, aRunnableS120S0100000_20);
        } else {
            kVar = new k(i, i2, EnumC1273550jFJ.RGB, i5, matrix, this, aRunnableS120S0100000_20);
        }
        if (kVar == null) {
            aRunnableS120S0100000_20.run();
            return null;
        }
        C1271790jCT c1271790jCT = this.videoFrameCachePoolService;
        if (c1271790jCT != null) {
            VideoFrame videoFrameLIZLLL = c1271790jCT.LIZLLL(kVar, i3, j);
            if (videoFrameLIZLLL == null) {
                kVar.release();
                return null;
            }
            return videoFrameLIZLLL;
        }
        return new VideoFrame(kVar, i3, j);
    }
}
