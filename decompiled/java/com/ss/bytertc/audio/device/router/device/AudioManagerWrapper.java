package com.ss.bytertc.audio.device.router.device;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public class AudioManagerWrapper {
    public AudioManager audioManager;

    public int getMode() {
        int mode = -2;
        try {
            AudioManager audioManager = this.audioManager;
            if (audioManager == null) {
                return -2;
            }
            mode = audioManager.getMode();
            return mode;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMode failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return mode;
        }
    }

    public boolean startBluetoothSco() {
        try {
            this.audioManager.startBluetoothSco();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startBluetoothSco failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public boolean stopBluetoothSco() {
        try {
            this.audioManager.stopBluetoothSco();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopBluetoothSco failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public AudioManager getAudioManager() {
        return this.audioManager;
    }

    public AudioManagerWrapper(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public static AudioManagerWrapper create(Context context) {
        if (context == null) {
            Logging.e("AudioManagerWrapper", "create AudioManagerWrapper failed, context is null");
            return null;
        }
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        if (audioManager == null) {
            Logging.e("AudioManagerWrapper", "create AudioManagerWrapper failed, audioManager is null");
            return null;
        }
        return new AudioManagerWrapper(audioManager);
    }

    public AudioDeviceInfo[] getDevices(int i) {
        try {
            return this.audioManager.getDevices(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDevices failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public boolean isBluetoothScoOn(boolean z) {
        try {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                if (audioManager.isBluetoothScoOn()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isBluetoothScoOn failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
    }

    public boolean isMicrophoneMute(boolean z) {
        try {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                if (audioManager.isMicrophoneMute()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isMicrophoneMute failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
    }

    public boolean isSpeakerphoneOn(boolean z) {
        try {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                if (audioManager.isSpeakerphoneOn()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSpeakerphoneOn failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
    }

    public boolean isWiredHeadsetOn(boolean z) {
        try {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                if (audioManager.isWiredHeadsetOn()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isWiredHeadsetOn failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
    }

    public boolean setBluetoothScoOn(boolean z) {
        try {
            this.audioManager.setBluetoothScoOn(z);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBluetoothScoOn failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public boolean setSpeakerphoneOn(boolean z) {
        try {
            this.audioManager.setSpeakerphoneOn(z);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSpeakerphoneOn failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public boolean unregisterAudioDeviceCallback(AudioDeviceCallback audioDeviceCallback) {
        try {
            this.audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterAudioDeviceCallback failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public boolean registerAudioDeviceCallback(AudioDeviceCallback audioDeviceCallback, Handler handler) {
        try {
            this.audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerAudioDeviceCallback failed, Exception: ");
            sbLIZ.append(e.toString());
            Logging.e("AudioManagerWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }
}
