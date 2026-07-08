package com.ss.ttlivestreamer.core.statics;

import X.C1268940j7s;
import X.C1269000j7y;
import X.C786410Ut5;
import X.InterfaceC1268930j7r;
import android.text.TextUtils;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class StaticsReport extends TEBundle {
    public final String VELIVE_LOG_TAG = "velive_log_tag";
    public C1268940j7s scopeMonitorOptService;

    public String getVideoFrameElapse() {
        return C786410Ut5.j4("[%d, %d, %d, %d, %d]", new Object[]{Integer.valueOf(getFrameCostCaptureToEffect()), Integer.valueOf(getFrameCostEffect()), Integer.valueOf(getFrameCostEffectToEncode()), Integer.valueOf(getFrameCostEncode()), Integer.valueOf(getFrameCostEncodeToSend())});
    }

    public String getVideoFrameElapseV2TTLiveStreamerFixed(String str) {
        return "";
    }

    public double getAudioEncodeRealBps() {
        return getDouble("estream_aenc_real_bps");
    }

    public int getAudioStreamdB() {
        return getInt("estream_audio_stream_db");
    }

    public double getCostTimeProessPerFrame() {
        return getDouble("vtrack_cost_time_ppf");
    }

    public int getFrameAfterEffectGlFinishTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishEffectGLFinish") : c1268940j7s.LIZ(7);
    }

    public int getFrameCameraCaptureTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishCameraCapture") : c1268940j7s.LIZ(2);
    }

    public int getFrameCaptureToProcessorLatency() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("StartProcessor") : c1268940j7s.LIZ(3);
    }

    public int getFrameCostCaptureToEffect() {
        return getInt("cost_capture_to_effect");
    }

    public int getFrameCostEffect() {
        return getInt("cost_capture_pure_effect");
    }

    public int getFrameCostEffectToEncode() {
        return getInt("cost_effect_to_encode");
    }

    public int getFrameCostEncode() {
        return getInt("cost_capture_pure_encode");
    }

    public int getFrameCostEncodeToSend() {
        return getInt("cost_capture_encode_to_send");
    }

    public int getFrameEffectProcessTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishEffectProcess") : c1268940j7s.LIZ(6);
    }

    public int getFrameEncoderDrawSurfaceTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishDrawSurface") : c1268940j7s.LIZ(12);
    }

    public int getFrameOesTo2DTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishOesTo2D") : c1268940j7s.LIZ(5);
    }

    public int getFramePostProcessAlgorithmTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishPostProcessAlgorithm") : c1268940j7s.LIZ(8);
    }

    public int getFrameProcessToEncoderLatency() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("StartEncode") : c1268940j7s.LIZ(11);
    }

    public int getFrameProcessToRenderLatency() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("StartRender") : c1268940j7s.LIZ(9);
    }

    public int getFrameRenderTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishRender") : c1268940j7s.LIZ(10);
    }

    public int getFrameUpdateTexImageTime() {
        C1268940j7s c1268940j7s;
        return (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) ? getInt("FinishUpdateTexImage") : c1268940j7s.LIZ(4);
    }

    public int getRealVideoGopMs() {
        return getInt("estream_real_video_gop");
    }

    public double getTransportDropCount() {
        return getDouble("estream_transport_video_drop_count");
    }

    public double getTransportDuration() {
        return getDouble("estream_transport_duration");
    }

    public double getTransportPackageAverageDelay() {
        return getDouble("estream_transport_package_delay");
    }

    public double getVideoDropCount() {
        return getDouble("estream_video_drop_count");
    }

    public int getVideoEncodePSNRFromKeyFrame() {
        return getInt("estream_video_enc_psnr_key_frame");
    }

    public int getVideoEncodePSNRFromNoKeyFrame() {
        return getInt("estream_video_enc_psnr_no_key_frame");
    }

    public double getVideoEncodeRealBps() {
        return getDouble("estream_venc_real_bps");
    }

    public double getVideoEncodeRealFps() {
        return getDouble("estream_venc_real_fps");
    }

    public String getVideoFrameElapseV2() {
        C1268940j7s c1268940j7s;
        String strLIZLLL;
        if (!C1269000j7y.LIZ || (c1268940j7s = this.scopeMonitorOptService) == null) {
            return C786410Ut5.j4("[%d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d]", new Object[]{Integer.valueOf(getFrameCameraCaptureTime()), Integer.valueOf(getFrameCaptureToProcessorLatency()), Integer.valueOf(getFrameUpdateTexImageTime()), Integer.valueOf(getFrameOesTo2DTime()), Integer.valueOf(getFrameEffectProcessTime()), Integer.valueOf(getFrameAfterEffectGlFinishTime()), Integer.valueOf(getFramePostProcessAlgorithmTime()), Integer.valueOf(getFrameProcessToRenderLatency()), Integer.valueOf(getFrameRenderTime()), Integer.valueOf(getFrameProcessToEncoderLatency()), Integer.valueOf(getFrameEncoderDrawSurfaceTime())});
        }
        if (C1269000j7y.LIZIZ) {
            InterfaceC1268930j7r interfaceC1268930j7r = c1268940j7s.LL;
            return (interfaceC1268930j7r == null || (strLIZLLL = interfaceC1268930j7r.LIZLLL()) == null) ? "" : strLIZLLL;
        }
        return e3.e + getFrameCameraCaptureTime() + "," + getFrameCaptureToProcessorLatency() + "," + getFrameUpdateTexImageTime() + "," + getFrameOesTo2DTime() + "," + getFrameEffectProcessTime() + "," + getFrameAfterEffectGlFinishTime() + "," + getFramePostProcessAlgorithmTime() + "," + getFrameProcessToRenderLatency() + "," + getFrameRenderTime() + "," + getFrameProcessToEncoderLatency() + "," + getFrameEncoderDrawSurfaceTime() + e3.f;
    }

    public double getVideoSourceDeliverFps() {
        return getDouble("vsourc_deliver_fps");
    }

    public double getVideoSourceDropFps() {
        return getDouble("vsourc_drop_fps");
    }

    public double getVideoTransportRealBps() {
        return getDouble("estream_transport_real_bps");
    }

    public double getVideoTransportRealFps() {
        return getDouble("estream_transport_real_fps");
    }

    public double getVideoSourceFps() {
        return getVideoSourceDeliverFps() + getVideoSourceDropFps();
    }

    public String getVideoFrameElapseTTLiveStreamerFixed(String str) {
        if (TextUtils.isEmpty(str)) {
            return getVideoFrameElapse();
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != 5) {
            return getVideoFrameElapse();
        }
        return C786410Ut5.j4("[%d, %d, %s, %s, %s", new Object[]{Integer.valueOf(getFrameCostCaptureToEffect()), Integer.valueOf(getFrameCostEffect()), strArrSplit[2], strArrSplit[3], strArrSplit[4]});
    }

    public void setScopeMonitorOptService(C1268940j7s c1268940j7s) {
        this.scopeMonitorOptService = c1268940j7s;
    }
}
