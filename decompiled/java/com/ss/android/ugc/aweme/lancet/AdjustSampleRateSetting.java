package com.ss.android.ugc.aweme.lancet;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
public class AdjustSampleRateSetting {
    public static final float DEFAULT_GROUP = 0.005f;

    public static float getSampleRate() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZJ("adjust_sample_rate", 0.005f);
    }
}
