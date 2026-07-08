package com.ss.ttm.player;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes34.dex */
public class DeviceCapability {
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public static int LJ = -1;
    public AudioManager LIZ;
    public Method LIZIZ;

    public static int queryAudioLowLatency(TTPlayer tTPlayer) {
        if (LJ == -1) {
            LJ = tTPlayer.LIZLLL.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency") ? 1 : 0;
        }
        return LJ;
    }

    public int getOutputLatency(int i) {
        AudioManager audioManager;
        Method method = this.LIZIZ;
        int iMax = -1;
        if (method != null && (audioManager = this.LIZ) != null) {
            try {
                iMax = Math.max(((Integer) C2204961BRm.a0(method, audioManager, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEd7IWBkxSROdY+z0IQVp3sn0+VOKf/ZTv5kd7A==", null))).intValue(), 0);
                if (iMax > 5000) {
                    return 0;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ = null;
            }
        }
        return iMax;
    }

    public int init(TTPlayer tTPlayer) {
        this.LIZ = (AudioManager) C786410Ut5.H2(tTPlayer.LIZLLL, "audio");
        try {
            this.LIZIZ = AudioManager.class.getMethod("getOutputLatency", Integer.TYPE);
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static void LIZ(int i, TTPlayer tTPlayer) {
        int nativeOutputSampleRate;
        int i2;
        if (queryAudioLowLatency(tTPlayer) == 1) {
            AudioManager audioManager = (AudioManager) C786410Ut5.H2(tTPlayer.LIZLLL, "audio");
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property == null) {
                nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(i);
            } else {
                nativeOutputSampleRate = CastIntegerProtector.parseInt(property);
            }
            LIZJ = nativeOutputSampleRate;
            String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            if (property2 == null) {
                i2 = 256;
            } else {
                i2 = CastIntegerProtector.parseInt(property2);
            }
            LIZLLL = i2;
        }
    }

    public static int getAudioFramesPerBuffer(int i, TTPlayer tTPlayer) {
        if (LIZLLL == -1) {
            LIZ(i, tTPlayer);
        }
        return LIZLLL;
    }

    public static int getAudioSampleRate(int i, TTPlayer tTPlayer) {
        if (LIZJ == -1) {
            LIZ(i, tTPlayer);
        }
        return LIZJ;
    }

    public static int getMinBufferSize(int i, int i2, int i3) {
        int i4;
        int iLIZ = AJVoice.LIZ(i2);
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                i4 = 4;
                if (i3 == 4) {
                }
            }
            return -1;
        }
        i4 = 3;
        if (iLIZ > 0) {
            return AudioTrack.getMinBufferSize(i, iLIZ, i4);
        }
        return -1;
    }
}
