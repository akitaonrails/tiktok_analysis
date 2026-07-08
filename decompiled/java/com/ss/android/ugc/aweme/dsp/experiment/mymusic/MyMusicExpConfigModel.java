package com.ss.android.ugc.aweme.dsp.experiment.mymusic;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class MyMusicExpConfigModel {

    @C09CT("profile_schema")
    public final String profileSchema;

    @C09CT("my_music_tt2dsp_show_auth_panel_times")
    public final int showAuthPanelTimes;

    @C09CT("tt2dsp_schema")
    public final String tt2dspSchema;

    public MyMusicExpConfigModel() {
        this("aweme://music/library/external?music_tag=1", "aweme://music/library/external?music_tag=1", 2);
    }

    public MyMusicExpConfigModel(String str, String str2, int i) {
        this.profileSchema = str;
        this.tt2dspSchema = str2;
        this.showAuthPanelTimes = i;
    }
}
