package com.ss.lyrax.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.LyraxVideoDirectBufferFrame;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoDirectBufferFrame extends LyraxVideoFrame {
    public ByteBuffer[] dataOfPlanes;
    public EGLContext eglContext;
    public LyraxVideoExtraData[] extraDataArray;
    public ByteBuffer extraDataInfo;
    public LyraxVideoFrameType frameType;
    public long glSync;
    public int height;
    public final boolean isBlackFrame;
    public LyraxVideoFrame.OnFrameDestroyedListener onDestroyedListener;
    public long originalCaptureTimestampMs;
    public long originalEffectTimestampMs;
    public LyraxVideoPixelFormat pixelFormat;
    public int[] strideOfPlanes;
    public ByteBuffer supplementaryInfo;
    public int textureID;
    public float[] textureMatrix;
    public long timestampUs;
    public int width;
    public LyraxVideoColorSpace colorSpace = LyraxVideoColorSpace.BT601_LIMITED_RANGE;
    public LyraxVideoRotation rotation = LyraxVideoRotation.VIDEO_ROTATION_0;

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getEnterDecoderTimestampMs() {
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getLeaveDecoderTimestampMs() {
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean isBlackFrame() {
        return false;
    }

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoDirectBufferFrame$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat;

        static {
            int[] iArr = new int[LyraxVideoPixelFormat.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat = iArr;
            try {
                iArr[LyraxVideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.TEXTURE_2D.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[LyraxVideoPixelFormat.TEXTURE_OES.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
        }
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void freeVideoFrame() {
        LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener = this.onDestroyedListener;
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(this.eglContext, this.textureID, this.glSync);
        }
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getNumberOfPlanes() {
        return this.dataOfPlanes.length;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoExtraData[] getExtraDataArray() {
        return this.extraDataArray;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getExtraDataInfo() {
        return this.extraDataInfo;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoFrameType getFrameType() {
        return this.frameType;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getGLSync() {
        return this.glSync;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalCaptureTimestampMs() {
        return this.originalCaptureTimestampMs;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalEffectTimestampMs() {
        return this.originalEffectTimestampMs;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoRotation getRotation() {
        return this.rotation;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getSupplementaryInfo() {
        return this.supplementaryInfo;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getTextureID() {
        return this.textureID;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public float[] getTextureMatrix() {
        return this.textureMatrix;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getTimeStampUs() {
        return this.timestampUs;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getWidth() {
        return this.width;
    }

    public LyraxVideoDirectBufferFrame(LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        this.pixelFormat = lyraxVideoPixelFormat;
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoPixelFormat[lyraxVideoPixelFormat.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    this.frameType = LyraxVideoFrameType.GL_TEXTURE;
                    i2 = 0;
                } else {
                    this.frameType = LyraxVideoFrameType.RAW_MEMORY;
                    i2 = 1;
                }
            } else {
                this.frameType = LyraxVideoFrameType.RAW_MEMORY;
                i2 = 2;
            }
        } else {
            this.frameType = LyraxVideoFrameType.RAW_MEMORY;
        }
        this.dataOfPlanes = new ByteBuffer[i2];
        this.strideOfPlanes = new int[i2];
    }

    private ByteBuffer convert2DirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getPlaneData(int i) {
        return this.dataOfPlanes[i];
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getPlaneStride(int i) {
        return this.strideOfPlanes[i];
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace) {
        this.colorSpace = lyraxVideoColorSpace;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        this.eglContext = eGLContext;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr) {
        this.extraDataArray = lyraxVideoExtraDataArr;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataInfo(ByteBuffer byteBuffer) {
        this.extraDataInfo = convert2DirectBuffer(byteBuffer);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void setFrameDestroyedListener(LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        this.onDestroyedListener = onFrameDestroyedListener;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setGLSync(long j) {
        if (this.frameType == LyraxVideoFrameType.RAW_MEMORY) {
            return false;
        }
        this.glSync = j;
        return true;
    }

    public boolean setHeight(int i) {
        this.height = i;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        this.originalCaptureTimestampMs = j;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        this.originalEffectTimestampMs = j;
        return true;
    }

    public void setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            setFrameDestroyedListener(null);
        } else {
            setFrameDestroyedListener(new LyraxVideoFrame.OnFrameDestroyedListener() { // from class: X.0jN3
                @Override // com.ss.lyrax.video.LyraxVideoFrame.OnFrameDestroyedListener
                public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                    LyraxVideoDirectBufferFrame.lambda$setReleaseCallback$0(runnable, eGLContext, i, j);
                }
            });
        }
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setRotation(LyraxVideoRotation lyraxVideoRotation) {
        this.rotation = lyraxVideoRotation;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.supplementaryInfo = convert2DirectBuffer(byteBuffer);
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureID(int i) {
        if (this.frameType == LyraxVideoFrameType.RAW_MEMORY) {
            return false;
        }
        this.textureID = i;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        this.textureMatrix = fArr;
        return true;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTimeStampUs(long j) {
        this.timestampUs = j;
        return true;
    }

    public boolean setWidth(int i) {
        this.width = i;
        return true;
    }

    public void setPlaneData(int i, ByteBuffer byteBuffer) {
        if (this.frameType == LyraxVideoFrameType.GL_TEXTURE || i >= this.dataOfPlanes.length) {
            return;
        }
        this.dataOfPlanes[i] = convert2DirectBuffer(byteBuffer);
    }

    public void setPlaneStride(int i, int i2) {
        if (this.frameType == LyraxVideoFrameType.GL_TEXTURE || i >= this.dataOfPlanes.length) {
            return;
        }
        this.strideOfPlanes[i] = i2;
    }

    public static /* synthetic */ void lambda$setReleaseCallback$0(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("LyraxVideoDirectBufferFrame@54fb.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("LyraxVideoDirectBufferFrame@54fb.setReleaseCallback$1L");
    }
}
