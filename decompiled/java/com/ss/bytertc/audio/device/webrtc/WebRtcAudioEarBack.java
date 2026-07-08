package com.ss.bytertc.audio.device.webrtc;

import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.base.ManufacturerChecker;
import com.ss.bytertc.audio.device.hwearback.IHardWareEarback;
import com.ss.bytertc.audio.device.hwearback.VivoEarback;
import com.ss.bytertc.audio.device.hwearback.XMEarback;
import com.ss.bytertc.audio.device.hwearback.ovm.OVMEarback;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes35.dex */
public class WebRtcAudioEarBack {
    public WebRtcAudioManager audioManager;
    public IHardWareEarback hardWareEarback;

    private IHardWareEarback createHWEarback() {
        try {
            Method method = Class.forName("com.bytedance.bae.hwearback.HardwareEarbackPackageChecker").getMethod("isHwEarbackPackageSupported", new Class[0]);
            if (method != null && ((Boolean) method.invoke(null, new Object[0])).booleanValue()) {
                return (IHardWareEarback) Class.forName("com.bytedance.bae.hwearback.HwEarback").getConstructor(WebRtcAudioEarBack.class).newInstance(this);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("WebRtcAudioEarBack", "HW hardware earmonitor is not support", th);
            return null;
        }
    }

    public int ByteAudioEarBackGetLatency() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return iHardWareEarback.getLatency();
        }
        return -1;
    }

    public void ByteAudioEarBackInit() {
        if (this.hardWareEarback == null) {
            ManufacturerChecker.Type manufacturerType = ManufacturerChecker.getManufacturerType(Build.BRAND);
            if (manufacturerType == ManufacturerChecker.Type.HW || manufacturerType == ManufacturerChecker.Type.HR) {
                this.hardWareEarback = createHWEarback();
            }
            if (Build.VERSION.SDK_INT >= 33 && (manufacturerType == ManufacturerChecker.Type.OP || manufacturerType == ManufacturerChecker.Type.XM || manufacturerType == ManufacturerChecker.Type.RM)) {
                this.hardWareEarback = new OVMEarback(ContextUtils.getApplicationContext(), this);
            } else if (manufacturerType == ManufacturerChecker.Type.VO) {
                this.hardWareEarback = new VivoEarback(this);
            } else if (manufacturerType == ManufacturerChecker.Type.XM) {
                this.hardWareEarback = new XMEarback(this);
            }
        }
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.init();
        } else {
            onHardwareEarbackSupported(false);
        }
    }

    public void ByteAudioEarBackRelease() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.release();
            onHardwareEarbackReleased(true);
        }
    }

    public boolean ByteAudioEarBackSupport() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return iHardWareEarback.isSupport();
        }
        return false;
    }

    public WebRtcAudioEarBack(WebRtcAudioManager webRtcAudioManager) {
        this.audioManager = webRtcAudioManager;
    }

    public void ByteAudioEarBackEffect(int i) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.setEffect(i);
        }
    }

    public int ByteAudioEarBackEnable(boolean z) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            if (z) {
                return iHardWareEarback.open();
            }
            return iHardWareEarback.close();
        }
        return -1;
    }

    public void ByteAudioEarBackEqualizer(int i) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.setEqualizer(i);
        }
    }

    public int ByteAudioEarBackSetVolume(int i) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return iHardWareEarback.setVolume(i);
        }
        return -1;
    }

    public void onHardwareEarbackReleased(boolean z) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            webRtcAudioManager.onHardwareEarbackReleased(z);
        }
    }

    public void onHardwareEarbackSupportParamsGet(String str) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            if (str == null) {
                str = "";
            }
            webRtcAudioManager.onHardwareEarbackSupportParamsGet(str);
        }
    }

    public void onHardwareEarbackSupported(boolean z) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            webRtcAudioManager.onHardwareEarbackSupported(z);
        }
    }

    public void onEvent(int i, int i2) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.onEvent(i, i2);
        }
    }
}
