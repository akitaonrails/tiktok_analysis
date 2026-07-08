package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileGuide implements Serializable {

    @C09CT("guide_text")
    public String guideContext;

    @C09CT("guide_key")
    public String guideContextKeyToReport;

    @C09CT("guide_weight")
    public int guideWeight;

    public final void setGuideContext(String str) {
        this.guideContext = str;
    }

    public final void setGuideContextKeyToReport(String str) {
        this.guideContextKeyToReport = str;
    }

    public final void setGuideWeight(int i) {
        this.guideWeight = i;
    }

    public UserProfileGuide(String str, String str2, int i) {
        this.guideContext = str;
        this.guideContextKeyToReport = str2;
        this.guideWeight = i;
    }
}
