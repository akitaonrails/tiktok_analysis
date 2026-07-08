package com.ss.android.ugc.aweme;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveScenario {

    @C09CT("enable_live_screenshot")
    public boolean enableLiveScreenshot;

    @C09CT("enable_live_studio")
    public boolean enableLiveStudio;

    @C09CT("enable_live_third_party")
    public boolean enableLiveThirdParty;

    @C09CT("enable_live_video")
    public boolean enableLiveVideo;

    @C09CT("enable_live_voice")
    public boolean enableLiveVoice;

    public LiveScenario() {
        this(false, false, false, false, false);
    }

    public LiveScenario(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableLiveVideo = z;
        this.enableLiveThirdParty = z2;
        this.enableLiveScreenshot = z3;
        this.enableLiveStudio = z4;
        this.enableLiveVoice = z5;
    }
}
