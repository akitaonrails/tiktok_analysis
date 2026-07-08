package com.ss.bytertc.engine.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.mediaio.RefObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VideoFrame {
    public RefObject refCount;
    public Runnable userReleaseCallback;

    public interface OnFrameDestroyedListener {
        void OnFrameDestroyed(EGLContext eGLContext, int i, long j);
    }

    public abstract void freeVideoFrame();

    public abstract ColorSpace getColorSpace();

    public abstract VideoContentType getContentType();

    public abstract EGLContext getEGLContext();

    public abstract VideoExternalData[] getExternalDataArray();

    public abstract ByteBuffer getExternalDataInfo();

    public abstract VideoFrameType getFrameType();

    public abstract long getGLSync();

    public abstract int getHeight();

    public abstract int getNumberOfPlanes();

    public abstract long getOriginalCaptureTimestampMs();

    public abstract long getOriginalEffectTimestampMs();

    public abstract VideoPixelFormat getPixelFormat();

    public abstract ByteBuffer getPlaneData(int i);

    public abstract int getPlaneStride(int i);

    public abstract VideoRotation getRotation();

    public abstract ByteBuffer getSupplementaryInfo();

    public abstract int getTextureID();

    public abstract float[] getTextureMatrix();

    public abstract long getTimeStampUs();

    public abstract int getWidth();

    public boolean hasReleaseCallback() {
        return true;
    }

    public synchronized void release() {
        RefObject refObject = this.refCount;
        if (refObject != null) {
            refObject.release();
        }
    }

    public synchronized void retain() {
        RefObject refObject = this.refCount;
        if (refObject != null) {
            refObject.retain();
        }
    }

    public abstract boolean setColorSpace(ColorSpace colorSpace);

    public abstract boolean setEGLContext(EGLContext eGLContext);

    public abstract boolean setExternalDataArray(VideoExternalData[] videoExternalDataArr);

    public abstract boolean setExternalDataInfo(ByteBuffer byteBuffer);

    public abstract void setFrameDestroyedListener(OnFrameDestroyedListener onFrameDestroyedListener);

    public abstract boolean setGLSync(long j);

    public abstract boolean setOriginalCaptureTimestampMs(long j);

    public abstract boolean setOriginalEffectTimestampMs(long j);

    public abstract boolean setRotation(VideoRotation videoRotation);

    public abstract boolean setSupplementaryInfo(ByteBuffer byteBuffer);

    public abstract boolean setTextureID(int i);

    public abstract boolean setTextureMatrix(float[] fArr);

    public abstract boolean setTimeStampUs(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetRefCount$0() {
        C1C7U.LIZ("VideoFrame@5bdf.resetRefCount$1L");
        freeVideoFrame();
        C1C7U.LIZIZ("VideoFrame@5bdf.resetRefCount$1L");
    }

    public void resetRefCount() {
        this.refCount = new RefObject(new Runnable() { // from class: X.0jJK
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$resetRefCount$0();
            }
        });
    }

    public VideoFrame() {
        resetRefCount();
    }
}
