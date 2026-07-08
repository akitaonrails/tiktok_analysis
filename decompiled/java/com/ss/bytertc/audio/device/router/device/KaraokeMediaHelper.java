package com.ss.bytertc.audio.device.router.device;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C810670Vr7;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes31.dex */
public class KaraokeMediaHelper {
    public final int VOLUME_MIN_APP;
    public AudioManager mAudioManager;
    public ContentResolver mContentResolver;
    public Context mContext;
    public int mEnabled;
    public int mEqMode;
    public int mReverbMode;
    public SharedPreferences mSp;
    public int mVolume;
    public final String KARAOKE_ENABLE = "audio_karaoke_enable";
    public final String KARAOKE_VOLUME = "audio_karaoke_volume";
    public final String KARAOKE_EQ = "audio_karaoke_EQ";
    public final String KARAOKE_REVERB = "karaoke_Reverb";
    public final String KARAOKE_SUPPORT = "audio_karaoke_support";
    public final String KARAOKE_APP_SUPPORT = "karaoke_app_support";
    public final String KARAOKE_KTVMODE = "audio_karaoke_ktvmode";
    public final int VOLUME_MAX_APP = 15;
    public boolean mInitialized = false;

    public void closeKTVDevice() {
        this.mAudioManager.setParameters("audio_karaoke_ktvmode=disable");
        this.mInitialized = false;
    }

    public boolean isDeviceSupportKaraoke() {
        return this.mAudioManager.getParameters("audio_karaoke_support").contains("true");
    }

    public boolean isEnable() {
        return this.mEnabled == 1;
    }

    public void openKTVDevice() {
        if (this.mInitialized) {
            return;
        }
        this.mVolume = this.mSp.getInt("audio_karaoke_volume", 50);
        this.mEqMode = this.mSp.getInt("audio_karaoke_EQ", 0);
        this.mReverbMode = this.mSp.getInt("karaoke_Reverb", 0);
        this.mAudioManager.setParameters("audio_karaoke_ktvmode=enable");
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio_karaoke_volume=");
        sbLIZ.append(this.mVolume);
        audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
        AudioManager audioManager2 = this.mAudioManager;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("audio_karaoke_EQ=");
        sbLIZ2.append(this.mEqMode);
        audioManager2.setParameters(C2188811AlT.LIZIZ(sbLIZ2));
        AudioManager audioManager3 = this.mAudioManager;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("karaoke_Reverb=");
        sbLIZ3.append(this.mReverbMode);
        audioManager3.setParameters(C2188811AlT.LIZIZ(sbLIZ3));
        this.mInitialized = true;
    }

    public int getPlayFeedbackParam() {
        return isEnable() ? 1 : 0;
    }

    public int getMicVolParam() {
        return this.mVolume;
    }

    public KaraokeMediaHelper(Context context) {
        this.mContext = context;
        this.mContentResolver = context.getContentResolver();
        this.mAudioManager = (AudioManager) C786410Ut5.H2(this.mContext, "audio");
        this.mSp = C810670Vr7.LIZJ(this.mContext, 0, "loopback_mode");
    }

    public static KaraokeMediaHelper getInstance(Context context) {
        return new KaraokeMediaHelper(context);
    }

    public boolean isAppSupportKaraoke(String str) {
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("karaoke_app_support:");
        sbLIZ.append(str);
        return audioManager.getParameters(C2188811AlT.LIZIZ(sbLIZ)).contains("true");
    }

    public void setFeedbackEffect(int i) {
        if (i > 0 && i <= 3 && this.mReverbMode != i) {
            AudioManager audioManager = this.mAudioManager;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("karaoke_Reverb=");
            sbLIZ.append(i);
            audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
            this.mReverbMode = i;
        }
    }

    public void setMicVolParam(int i) {
        if (i > 15) {
            i = 15;
        } else if (i < 0) {
            i = 0;
        }
        if (this.mVolume != i && isEnable()) {
            AudioManager audioManager = this.mAudioManager;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("audio_karaoke_volume=");
            sbLIZ.append(i);
            audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
            this.mVolume = i;
        }
    }

    public void setPlayFeedbackParam(int i) {
        if (this.mEnabled == i) {
            return;
        }
        this.mEnabled = i;
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio_karaoke_enable=");
        sbLIZ.append(i);
        audioManager.setParameters(C2188811AlT.LIZIZ(sbLIZ));
    }
}
