package com.bytedance.codecx.video;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXMediaCodecTextureBufferHelper {
    public ReleaseOutPutBuffer mReleaseFunc;
    public SurfaceTextureHelper mSurfaceTextureHelper;
    public boolean render;

    public interface ReleaseOutPutBuffer {
        int release(boolean z);
    }

    public float[] getMatrix() {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return null;
        }
        return surfaceTextureHelper.getTexMatrix();
    }

    public boolean isAvaliable() {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return false;
        }
        return surfaceTextureHelper.isAvaliable();
    }

    public boolean updateTextureImage() {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return false;
        }
        surfaceTextureHelper.updateTexImage();
        return true;
    }

    public CodecXMediaCodecTextureBufferHelper(ReleaseOutPutBuffer releaseOutPutBuffer) {
        this.mReleaseFunc = releaseOutPutBuffer;
    }

    public void releaseOutputBuffer(boolean z) {
        runTask(z);
    }

    public int runTask(boolean z) {
        return this.mReleaseFunc.release(z);
    }

    public void setRender(boolean z) {
        this.render = z;
    }

    public void setSurfaceTextureHelper(SurfaceTextureHelper surfaceTextureHelper) {
        this.mSurfaceTextureHelper = surfaceTextureHelper;
    }

    public boolean updateTextureImageAndWait(int i) {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return false;
        }
        return surfaceTextureHelper.updateTexImageAndWait(i);
    }
}
