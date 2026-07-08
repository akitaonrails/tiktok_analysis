package com.ss.bytertc.audio.device.hwearback;

import com.bytedance.realx.base.ContextUtils;
import com.ss.bytertc.audio.device.router.device.KaraokeMediaHelper;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes31.dex */
public class XMEarback implements IHardWareEarback {
    public boolean isKtvDeviceOpened;
    public SlientPlayer slientPlayer;
    public WebRtcAudioEarBack webRtcAudioEarBack;
    public KaraokeMediaHelper xmKtvHelper;

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
        SlientPlayer slientPlayer;
        if (this.xmKtvHelper == null || (slientPlayer = this.slientPlayer) == null) {
            return -1;
        }
        slientPlayer.stop();
        this.xmKtvHelper.setPlayFeedbackParam(0);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int init() {
        this.xmKtvHelper = new KaraokeMediaHelper(ContextUtils.getApplicationContext());
        this.slientPlayer = new SlientPlayer();
        WebRtcAudioEarBack webRtcAudioEarBack = this.webRtcAudioEarBack;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.onHardwareEarbackSupported(isSupport());
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int open() {
        if (this.xmKtvHelper == null || this.slientPlayer == null) {
            return -1;
        }
        if (!this.isKtvDeviceOpened && isSupport()) {
            this.xmKtvHelper.openKTVDevice();
            this.isKtvDeviceOpened = true;
        }
        this.slientPlayer.play();
        this.xmKtvHelper.setPlayFeedbackParam(1);
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int release() {
        if (this.xmKtvHelper != null) {
            close();
            this.xmKtvHelper.closeKTVDevice();
            this.isKtvDeviceOpened = false;
        }
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        KaraokeMediaHelper karaokeMediaHelper;
        return ContextUtils.getApplicationContext() != null && (karaokeMediaHelper = this.xmKtvHelper) != null && karaokeMediaHelper.isDeviceSupportKaraoke() && this.xmKtvHelper.isAppSupportKaraoke(ContextUtils.getApplicationContext().getPackageName());
    }

    public XMEarback(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.webRtcAudioEarBack = webRtcAudioEarBack;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i) {
        KaraokeMediaHelper karaokeMediaHelper = this.xmKtvHelper;
        if (karaokeMediaHelper != null) {
            karaokeMediaHelper.setFeedbackEffect(i);
            return 0;
        }
        return -1;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i) {
        KaraokeMediaHelper karaokeMediaHelper = this.xmKtvHelper;
        if (karaokeMediaHelper != null) {
            karaokeMediaHelper.setMicVolParam((int) ((((double) i) * 15.0d) / 100.0d));
            return 0;
        }
        return -1;
    }
}
