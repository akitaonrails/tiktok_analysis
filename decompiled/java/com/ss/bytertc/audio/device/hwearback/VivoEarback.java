package com.ss.bytertc.audio.device.hwearback;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.ss.bytertc.audio.device.router.device.VivoKTVHelper;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes31.dex */
public class VivoEarback implements IHardWareEarback {
    public static final String TAG = VivoEarback.class.getName();
    public boolean isKtvDeviceOpened;
    public SlientPlayer slientPlayer;
    public VivoKTVHelper vivoKtvHelper;
    public WebRtcAudioEarBack webRtcAudioEarBack;

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return -1;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i, int i2) {
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i) {
        return -1;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int close() {
        if (this.vivoKtvHelper == null || this.slientPlayer == null) {
            return -1;
        }
        printLog("close");
        this.slientPlayer.stop();
        this.vivoKtvHelper.setPlayFeedbackParam(0);
        this.vivoKtvHelper.setCustomMode(0);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int init() {
        this.vivoKtvHelper = new VivoKTVHelper(ContextUtils.getApplicationContext());
        SlientPlayer slientPlayer = new SlientPlayer();
        this.slientPlayer = slientPlayer;
        slientPlayer.setRequireDeepBuffer(false);
        boolean zIsSupport = isSupport();
        WebRtcAudioEarBack webRtcAudioEarBack = this.webRtcAudioEarBack;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onHardwareEarbackSupported(zIsSupport);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inited, isSupportHardwareEarback=");
        sbLIZ.append(zIsSupport);
        printLog(C2188811AlT.LIZIZ(sbLIZ));
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        VivoKTVHelper vivoKTVHelper = this.vivoKtvHelper;
        if (vivoKTVHelper != null) {
            return vivoKTVHelper.isDeviceSupportKaraoke();
        }
        return false;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int open() {
        VivoKTVHelper vivoKTVHelper = this.vivoKtvHelper;
        if (vivoKTVHelper == null || this.slientPlayer == null) {
            return -1;
        }
        if (!this.isKtvDeviceOpened && vivoKTVHelper.isDeviceSupportKaraoke()) {
            this.vivoKtvHelper.openKTVDevice();
            this.isKtvDeviceOpened = true;
        }
        printLog("open");
        this.slientPlayer.play();
        this.vivoKtvHelper.setPlayFeedbackParam(1);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int release() {
        printLog("release");
        if (this.vivoKtvHelper != null) {
            close();
            this.vivoKtvHelper.closeKTVDevice();
            this.isKtvDeviceOpened = false;
        }
        return 0;
    }

    public VivoEarback(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.webRtcAudioEarBack = webRtcAudioEarBack;
    }

    private void printLog(String str) {
        String str2 = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(":");
        sbLIZ.append(str);
        Logging.i(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i) {
        if (this.vivoKtvHelper != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setEffect value=");
            sbLIZ.append(i);
            printLog(C2188811AlT.LIZIZ(sbLIZ));
            if (i >= 0 && i <= this.vivoKtvHelper.getEffectSize()) {
                this.vivoKtvHelper.setCustomMode(i);
                return 0;
            }
            Logging.w(TAG, C786410Ut5.j4("ByteAudioEarBackEffect vivo valid is [%d,%d], value is %d, ignore it", new Object[]{0, Integer.valueOf(this.vivoKtvHelper.getEffectSize()), Integer.valueOf(i)}));
        }
        return -1;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i) {
        if (this.vivoKtvHelper != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVolume volume=");
            sbLIZ.append(i);
            printLog(C2188811AlT.LIZIZ(sbLIZ));
            this.vivoKtvHelper.setMicVolParam((int) ((((double) i) * 15.0d) / 100.0d));
            return 0;
        }
        return -1;
    }
}
