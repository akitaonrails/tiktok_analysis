package com.bytedance.realx.video;

import X.C2188811AlT;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes21.dex */
public class GlTextureFrameBuffer {
    public int frameBufferId;
    public int height;
    public final int pixelFormat;
    public int textureId;
    public int width;

    public void release() {
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public GlTextureFrameBuffer(int i) {
        switch (i) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i;
                this.width = 0;
                this.height = 0;
                return;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid pixel format: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void setSize(int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (i == this.width && i2 == this.height) {
                return;
            }
            this.width = i;
            this.height = i2;
            if (this.textureId == 0) {
                this.textureId = GlUtil.generateTexture(3553);
            }
            if (this.frameBufferId == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            int i3 = this.pixelFormat;
            GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, null);
            GLES20.glBindTexture(3553, 0);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
            int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Framebuffer not complete, status: ");
            sbLIZ.append(iGlCheckFramebufferStatus);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Invalid size: ");
        sbLIZ2.append(i);
        sbLIZ2.append("x");
        sbLIZ2.append(i2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
