package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C09CT;
import X.C1267540j5c;
import com.ss.lyrax.ttlh_adapter.push_param.capture_base.CaptureBaseParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class CaptureBase {

    @C09CT("audioCapture")
    public C1267540j5c audioCapture = new C1267540j5c();

    @C09CT("videoCapture")
    public VideoCaptureParams videoCapture = new VideoCaptureParams(this);

    @C09CT("camera_15_fps_disallow_list")
    public List<String> camera15FpsDisallowList = new ArrayList(Arrays.asList("cph2195", "cph2159", "vivo 1901", "cph2235", "cph2145", "pegm00", "pexm00", "pegt00"));

    public class VideoCaptureParams {
        public int LIZJ;
        public boolean LIZLLL;
        public boolean LJII;
        public boolean LJIIIIZZ;
        public CaptureBaseParams LJIIIZ;

        @C09CT("cameraRotationFix")
        public boolean cameraRotationFix;

        @C09CT("enableMinCapFpsChange")
        public boolean enableMinCapFpsChange;

        @C09CT("frameScheduleOpt")
        public boolean frameScheduleOpt;

        @C09CT("syncParamsFromBuilder")
        public boolean syncParamsFromBuilder;

        @C09CT("syncStopVECapture")
        public boolean syncStopVECapture;
        public int LIZ = 4;

        @C09CT("videoCaptureWidth")
        public int width = 720;

        @C09CT("videoCaptureHeight")
        public int height = 1280;

        @C09CT("videoCaptureFps")
        public int fps = -1;
        public int LIZIZ = -1;

        @C09CT("useCamera2API")
        public boolean useCamera2Api = true;

        @C09CT("enableFallback")
        public boolean enableFallback = true;

        @C09CT("camera_log_level")
        public int cameraLogLevel = -1;

        @C09CT("is_camera_open_close_sync")
        public boolean isCameraOpenCloseSync = true;
        public final boolean LJ = true;
        public final boolean LJFF = true;
        public final boolean LJI = true;

        @C09CT("enableOverrideCaptureResolution")
        public boolean enableOverrideCaptureResolution = true;

        public final boolean LIZ() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getCameraRotationFix() : this.cameraRotationFix;
        }

        public final boolean LIZIZ() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getEnableFallback() : this.enableFallback;
        }

        public final boolean LIZJ() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getEnableMinCapFpsChange() : this.enableMinCapFpsChange;
        }

        public final boolean LIZLLL() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getEnableOverrideCaptureResolution() : this.enableOverrideCaptureResolution;
        }

        public final int LJ() {
            int fps = this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getFps() : this.fps;
            this.fps = fps;
            if (fps == -1) {
                this.fps = 30;
            }
            return this.fps;
        }

        public final boolean LJFF() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getFrameScheduleOpt() : this.frameScheduleOpt;
        }

        public final int LJI() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getHeight() : this.height;
        }

        public final boolean LJII() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getIsCameraOpenCloseSync() : this.isCameraOpenCloseSync;
        }

        public final boolean LJIIIIZZ() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getSyncParamsFromBuilder() : this.syncParamsFromBuilder;
        }

        public final boolean LJIIIZ() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getSyncStopVECapture() : this.syncStopVECapture;
        }

        public final boolean LJIIJ() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getUseCamera2Api() : this.useCamera2Api;
        }

        public final int LJIIJJI() {
            return this.LJIIIIZZ ? this.LJIIIZ.videoCaptureParams.getWidth() : this.width;
        }

        public VideoCaptureParams(CaptureBase captureBase) {
        }

        public final void LJIIL(int i) {
            if (this.LJIIIIZZ) {
                this.LJIIIZ.videoCaptureParams.setFps(i);
            } else {
                if (this.fps != -1 && this.LJII) {
                    return;
                }
                this.fps = i;
            }
        }

        public final void LJIILIIL(int i) {
            this.height = i;
            if (this.LJIIIIZZ) {
                this.LJIIIZ.videoCaptureParams.setHeight(i);
            }
        }

        public final void LJIILJJIL(boolean z) {
            this.useCamera2Api = z;
            if (this.LJIIIIZZ) {
                this.LJIIIZ.videoCaptureParams.setUseCamera2Api(z);
            }
        }

        public final void LJIILL(int i) {
            this.width = i;
            if (this.LJIIIIZZ) {
                this.LJIIIZ.videoCaptureParams.setWidth(i);
            }
        }
    }
}
