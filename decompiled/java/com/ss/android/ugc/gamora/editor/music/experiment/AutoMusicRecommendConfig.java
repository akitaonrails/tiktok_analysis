package com.ss.android.ugc.gamora.editor.music.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoMusicRecommendConfig {

    @C09CT("aed_check_business_type")
    public final String aedCheckBusinessType;

    @C09CT("aed_check_thresh")
    public final double aedCheckThresh;

    @C09CT("long_press_enabled")
    public final boolean longPressEnabled;

    @C09CT("origin_record_enabled")
    public final boolean originRecordEnabled;

    @C09CT("origin_upload_enabled")
    public final boolean originUploadEnabled;

    public AutoMusicRecommendConfig() {
        this("", 1.0d, false, false, false);
    }

    public AutoMusicRecommendConfig(String str, double d, boolean z, boolean z2, boolean z3) {
        this.aedCheckBusinessType = str;
        this.aedCheckThresh = d;
        this.originRecordEnabled = z;
        this.originUploadEnabled = z2;
        this.longPressEnabled = z3;
    }
}
