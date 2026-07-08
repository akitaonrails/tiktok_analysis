package com.lynx.canvas;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonFeatureFlag {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJFF = true;
    public boolean LJIILIIL = true;
    public boolean LJIILLIIL = true;
    public boolean LJIJJ = true;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KryptonFeatureFlag{mGPUThreadGroup=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mNeedBindingRaf=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mFirstOnScreenCanvasIsTheOnlyOnScreen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mEnablePerformanceStatisticsRelatedInterface=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mEnableFirstFrameCallback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mEnableDrawImageReuse=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mEnableSar=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mNeedProcessGesture=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mEnableAfterFrameCallback=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mEnableWebGLLowMemoryMode=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mNeedUseShaderReplaceBlitFramebuffer=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mDisableOffscreenCanvasBlitToScreen=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", mEnableAndroidSystemTrace=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mUseVsyncMonitorFromService=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", mCanvas2DCommandBufferSize=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", mEnablePath2DRelatedApiSkity=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", mEnableWorkaroundFinishPerFrame=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", mForceTextureBackend=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", mEnableDoFrameRefactor=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", mExportExtraInfoInCanvasTouchEvent=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", mUseAurumAudioEngine=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", mAudioForceUseAdaptiveSampler=");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append(", mEnableContextAttribute=");
        sbLIZ.append(this.LJIL);
        sbLIZ.append(", mUseSkityAs2DBackend=");
        sbLIZ.append(this.LJJ);
        sbLIZ.append(", mEnableSkityTextLayoutShaper=");
        sbLIZ.append(this.LJJI);
        sbLIZ.append(", mForceUseShaderReplaceBlitFramebuffer=");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append(", mEnableEventReport=");
        sbLIZ.append(this.LJJII);
        sbLIZ.append(", mEnableBatched2D=");
        sbLIZ.append(this.LJJIIJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static class Builder {
        public final KryptonFeatureFlag mFlag = new KryptonFeatureFlag();

        public Builder setEnableWebGL2(boolean z) {
            return this;
        }

        public KryptonFeatureFlag build() {
            return this.mFlag;
        }

        public Builder setAudioForceUseAdaptiveSampler(boolean z) {
            this.mFlag.LJIJJLI = z;
            return this;
        }

        public Builder setCanvas2DCommandBufferSize(int i) {
            this.mFlag.LJIILJJIL = i;
            return this;
        }

        public Builder setDisableOffscreenCanvasBlitToScreen(boolean z) {
            this.mFlag.LJIIJJI = z;
            return this;
        }

        public Builder setEnableAfterframeCallback(boolean z) {
            this.mFlag.LJIIIIZZ = z;
            return this;
        }

        public Builder setEnableAndroidSystemTrace(boolean z) {
            this.mFlag.LJIIL = z;
            return this;
        }

        public Builder setEnableBatched2D(boolean z) {
            this.mFlag.LJJIIJ = z;
            return this;
        }

        public Builder setEnableContextAttribute(boolean z) {
            this.mFlag.LJIL = z;
            return this;
        }

        public Builder setEnableDoFrameRefactor(boolean z) {
            this.mFlag.LJIJ = z;
            return this;
        }

        public Builder setEnableDrawImageReuse(boolean z) {
            this.mFlag.LJFF = z;
            return this;
        }

        public Builder setEnableEventReport(boolean z) {
            this.mFlag.LJJII = z;
            return this;
        }

        public Builder setEnableFirstFrameCallback(boolean z) {
            this.mFlag.LJ = z;
            return this;
        }

        public Builder setEnablePath2DRelatedApiSkity(boolean z) {
            this.mFlag.LJIILL = z;
            return this;
        }

        public Builder setEnablePerformanceStatisticsRelatedInterface(boolean z) {
            this.mFlag.LIZLLL = z;
            return this;
        }

        public Builder setEnableSar(boolean z) {
            this.mFlag.LJI = z;
            return this;
        }

        public Builder setEnableSkityTextLayoutShaper(boolean z) {
            this.mFlag.LJJI = z;
            return this;
        }

        public Builder setEnableWebGLLowMemoryMode(boolean z) {
            this.mFlag.LJIIIZ = z;
            return this;
        }

        public Builder setEnableWorkaroundFinishPerFrame(boolean z) {
            this.mFlag.LJIILLIIL = z;
            return this;
        }

        public Builder setExportExtraInfoInCanvasTouchEvent(boolean z) {
            this.mFlag.LJIJI = z;
            return this;
        }

        public Builder setFirstOnScreenCanvasIsTheOnlyOnScreen(boolean z) {
            this.mFlag.LIZJ = z;
            return this;
        }

        public Builder setForceTextureBackend(boolean z) {
            this.mFlag.LJIIZILJ = z;
            return this;
        }

        public Builder setForceUseShaderReplaceBlitFramebuffer(boolean z) {
            this.mFlag.LJJIFFI = z;
            return this;
        }

        public Builder setGPUThreadGroup(int i) {
            this.mFlag.LIZ = i;
            return this;
        }

        public Builder setNeedBindingRaf(boolean z) {
            this.mFlag.LIZIZ = z;
            return this;
        }

        public Builder setNeedProcessGesture(boolean z) {
            this.mFlag.LJII = z;
            return this;
        }

        public Builder setNeedUseShaderReplaceBlitFramebuffer(boolean z) {
            this.mFlag.LJIIJ = z;
            return this;
        }

        public Builder setSetupGLGraphicsBackendWhenSurfaceCreated(boolean z) {
            this.mFlag.LJJIII = z;
            return this;
        }

        public Builder setUseAurumAudioEngine(boolean z) {
            this.mFlag.LJIJJ = z;
            return this;
        }

        public Builder setUseSkityAs2DBackend(boolean z) {
            this.mFlag.LJJ = z;
            return this;
        }

        public Builder setUseVsyncMonitorFromService(boolean z) {
            this.mFlag.LJIILIIL = z;
            return this;
        }
    }

    public boolean disableOffscreenCanvasBlitToScreen() {
        return this.LJIIJJI;
    }

    public boolean enableAfterFrameCallback() {
        return this.LJIIIIZZ;
    }

    public boolean enableAndroidSystemTrace() {
        return this.LJIIL;
    }

    public boolean enableFirstFrameCallback() {
        return this.LJ;
    }

    public boolean enablePerformanceStatisticsRelatedInterface() {
        return this.LIZLLL;
    }

    public boolean enableSar() {
        return this.LJI;
    }

    public boolean enableWebGLLowMemoryMode() {
        return this.LJIIIZ;
    }

    public boolean getAudioForceUseAdaptiveSampler() {
        return this.LJIJJLI;
    }

    public int getCanvas2DCommandBufferSize() {
        return this.LJIILJJIL;
    }

    public boolean getEnableBatched2D() {
        return this.LJJIIJ;
    }

    public boolean getEnableContextAttribute() {
        return this.LJIL;
    }

    public boolean getEnableDoFrameRefactor() {
        return this.LJIJ;
    }

    public boolean getEnableEventReport() {
        return this.LJJII;
    }

    public boolean getEnablePath2DRelatedApiSkity() {
        return this.LJIILL;
    }

    public boolean getEnableSkityTextLayoutShaper() {
        return this.LJJI;
    }

    public boolean getEnableWorkaroundFinishPerFrame() {
        return this.LJIILLIIL;
    }

    public boolean getExportExtraInfoInCanvasTouchEvent() {
        return this.LJIJI;
    }

    public boolean getForceTextureBackend() {
        return this.LJIIZILJ;
    }

    public boolean getForceUseShaderReplaceBlitFramebuffer() {
        return this.LJJIFFI;
    }

    public int getGPUThreadGroup() {
        return this.LIZ;
    }

    public boolean getSetupGLGraphicsBackendWhenSurfaceCreated() {
        return this.LJJIII;
    }

    public boolean getUseAurumAudioEngine() {
        return this.LJIJJ;
    }

    public boolean getUseSkityAs2DBackend() {
        return this.LJJ;
    }

    public boolean getUseVsyncMonitorFromService() {
        return this.LJIILIIL;
    }

    public boolean isFirstOnScreenCanvasIsTheOnlyOnScreen() {
        return this.LIZJ;
    }

    public boolean isNeedBindingRaf() {
        return this.LIZIZ;
    }

    public boolean needUseShaderReplaceBlitFramebuffer() {
        return this.LJIIJ;
    }
}
