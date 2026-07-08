package com.ss.bytertc.audio.device.router.device;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes31.dex */
public class VivoKTVHelper {
    public static final int[][] EQCustomGain;
    public static final int[][] EchoCustomParams;
    public static final int[][] ReverbCustomParams;
    public static final int effect_size;
    public static VivoKTVHelper mVivoKTVHelper;
    public AudioManager mAudioManager;
    public Context mContext;
    public final Object mParamLock = new Object();

    static {
        int[][] iArr = {new int[]{200, LSPassThroughRecordSizeConfig.DEFAULT, 500, 4500, LSPassThroughRecordSizeConfig.DEFAULT, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{5000, 4500, 1200, 4500, 6500, 1200}, new int[]{4500, 8000, LSPassThroughRecordSizeConfig.DEFAULT, 4000, 6500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{2500, LivePreCreateNextRoomPlayer.ENABLE, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 4000, 5000, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{3500, 5500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 5000, 5500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{4000, LivePreCreateNextRoomPlayer.ENABLE, LSPassThroughRecordSizeConfig.DEFAULT, 2500, 5500, 1200}, new int[]{500, 5000, 800, 4500, LivePreCreateNextRoomPlayer.ENABLE, 1200}, new int[]{20, 500, 60, 4500, 5000, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{0, 0, 0, 4000, 0, 1200}};
        ReverbCustomParams = iArr;
        effect_size = iArr.length;
        EQCustomGain = new int[][]{new int[]{0, 0, 0, 2, 2}, new int[]{0, 0, 0, 0, 0}, new int[]{3, 4, 2, 0, -3}, new int[]{3, 2, 0, 0, 2}, new int[]{3, 2, 0, -1, -3}, new int[]{2, 2, 2, 0, 0}, new int[]{5, 2, -2, 1, 3}, new int[]{-2, 0, 1, 2, 1}, new int[]{0, 0, 0, 0, 0}};
        EchoCustomParams = new int[][]{new int[]{3200, 150, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 2000}};
    }

    public void closeKTVDevice() {
        this.mAudioManager.setParameters("vivo_ktv_mode=0");
    }

    public int getExtSpeakerParam() {
        return getKTVParam("vivo_ktv_ext_speaker");
    }

    public int getMicTypeParam() {
        return getKTVParam("vivo_ktv_mic_type");
    }

    public int getMicVolParam() {
        return getKTVParam("vivo_ktv_volume_mic");
    }

    public int getPlayFeedbackParam() {
        return getKTVParam("vivo_ktv_play_source");
    }

    public int getPreModeParam() {
        return getKTVParam("vivo_ktv_preset_effect");
    }

    public int getVoiceOutParam() {
        return getKTVParam("vivo_ktv_rec_source");
    }

    public boolean isDeviceSupportKaraoke() {
        int i;
        if (Build.MANUFACTURER.trim().contains("vivo")) {
            StringTokenizer stringTokenizer = new StringTokenizer(this.mAudioManager.getParameters("vivo_ktv_mic_type"), "=");
            if (stringTokenizer.countTokens() == 2 && stringTokenizer.nextToken().equals("vivo_ktv_mic_type") && ((i = CastIntegerProtector.parseInt(stringTokenizer.nextToken())) == 1 || i == 0)) {
                return true;
            }
        }
        return false;
    }

    public void openKTVDevice() {
        this.mAudioManager.setParameters("vivo_ktv_mode=1");
    }

    public int getEffectSize() {
        return effect_size;
    }

    public VivoKTVHelper(Context context) {
        this.mContext = context;
        this.mAudioManager = (AudioManager) C786410Ut5.H2(context, "audio");
    }

    public static VivoKTVHelper getInstance(Context context) {
        if (mVivoKTVHelper == null) {
            mVivoKTVHelper = new VivoKTVHelper(context);
        }
        return mVivoKTVHelper;
    }

    private int getKTVParam(String str) {
        if (Build.MANUFACTURER.trim().contains("vivo")) {
            StringTokenizer stringTokenizer = new StringTokenizer(this.mAudioManager.getParameters(str), "=");
            if (stringTokenizer.countTokens() == 2 && str.equals(stringTokenizer.nextToken())) {
                return CastIntegerProtector.parseInt(stringTokenizer.nextToken().trim());
            }
            return 0;
        }
        return 0;
    }

    private void setEQParams(int i) {
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vivo_ktv_miceq_band1=");
        int[][] iArr = EQCustomGain;
        sbLIZ.append(iArr[i][0] + 8);
        audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
        AudioManager audioManager2 = this.mAudioManager;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("vivo_ktv_miceq_band2=");
        sbLIZ2.append(iArr[i][1] + 8);
        audioManager2.setParameters(C2188811AlT.LIZIZ(sbLIZ2));
        AudioManager audioManager3 = this.mAudioManager;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("vivo_ktv_miceq_band3=");
        sbLIZ3.append(iArr[i][2] + 8);
        audioManager3.setParameters(C2188811AlT.LIZIZ(sbLIZ3));
        AudioManager audioManager4 = this.mAudioManager;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("vivo_ktv_miceq_band4=");
        sbLIZ4.append(iArr[i][3] + 8);
        audioManager4.setParameters(C2188811AlT.LIZIZ(sbLIZ4));
        AudioManager audioManager5 = this.mAudioManager;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("vivo_ktv_miceq_band5=");
        sbLIZ5.append(iArr[i][4] + 8);
        audioManager5.setParameters(C2188811AlT.LIZIZ(sbLIZ5));
    }

    private void setEchoParams(int i) {
        if (i == 4) {
            this.mAudioManager.setParameters("vivo_ktv_echo_enable=1");
            AudioManager audioManager = this.mAudioManager;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vivo_ktv_echo_feedback=");
            int[][] iArr = EchoCustomParams;
            sbLIZ.append(iArr[0][0]);
            audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
            AudioManager audioManager2 = this.mAudioManager;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("vivo_ktv_echo_delay=");
            sbLIZ2.append(iArr[0][1]);
            audioManager2.setParameters(C2188811AlT.LIZIZ(sbLIZ2));
            AudioManager audioManager3 = this.mAudioManager;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("vivo_ktv_echo_wet=");
            sbLIZ3.append(iArr[0][2]);
            audioManager3.setParameters(C2188811AlT.LIZIZ(sbLIZ3));
            AudioManager audioManager4 = this.mAudioManager;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("vivo_ktv_echo_dry=");
            sbLIZ4.append(iArr[0][3]);
            audioManager4.setParameters(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    private void setGramophoneParams(int i) {
        if (i == 7) {
            this.mAudioManager.setParameters("vivo_ktv_reverb_preset=4");
        } else {
            this.mAudioManager.setParameters("vivo_ktv_reverb_preset=0");
        }
    }

    private void setReverbParams(int i) {
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vivo_ktv_rb_roomsize=");
        int[][] iArr = ReverbCustomParams;
        sbLIZ.append(iArr[i][0]);
        audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
        AudioManager audioManager2 = this.mAudioManager;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("vivo_ktv_rb_damp=");
        sbLIZ2.append(iArr[i][1]);
        audioManager2.setParameters(C2188811AlT.LIZIZ(sbLIZ2));
        AudioManager audioManager3 = this.mAudioManager;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("vivo_ktv_rb_wet=");
        sbLIZ3.append(iArr[i][2]);
        audioManager3.setParameters(C2188811AlT.LIZIZ(sbLIZ3));
        AudioManager audioManager4 = this.mAudioManager;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("vivo_ktv_rb_dry=");
        sbLIZ4.append(iArr[i][3]);
        audioManager4.setParameters(C2188811AlT.LIZIZ(sbLIZ4));
        AudioManager audioManager5 = this.mAudioManager;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("vivo_ktv_rb_width=");
        sbLIZ5.append(iArr[i][4]);
        audioManager5.setParameters(C2188811AlT.LIZIZ(sbLIZ5));
        AudioManager audioManager6 = this.mAudioManager;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("vivo_ktv_rb_gain=");
        sbLIZ6.append(iArr[i][5]);
        audioManager6.setParameters(C2188811AlT.LIZIZ(sbLIZ6));
        this.mAudioManager.setParameters("vivo_ktv_echo_enable=0");
    }

    public void setCustomMode(int i) {
        synchronized (this.mParamLock) {
            try {
                setExtSpeakerParam(0);
                setGramophoneParams(i);
                setReverbParams(i);
                setEQParams(i);
                setEchoParams(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setExtSpeakerParam(int i) {
        synchronized (this.mParamLock) {
            try {
                if (this.mAudioManager != null) {
                    this.mAudioManager.setParameters("vivo_ktv_ext_speaker=" + i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setMicVolParam(int i) {
        synchronized (this.mParamLock) {
            try {
                if (this.mAudioManager != null) {
                    this.mAudioManager.setParameters("vivo_ktv_volume_mic=" + i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setPlayFeedbackParam(int i) {
        synchronized (this.mParamLock) {
            try {
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("vivo_ktv_play_source=");
                    sbLIZ.append(i);
                    audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setVoiceOutParam(int i) {
        synchronized (this.mParamLock) {
            try {
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("vivo_ktv_rec_source=");
                    sbLIZ.append(i);
                    audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
