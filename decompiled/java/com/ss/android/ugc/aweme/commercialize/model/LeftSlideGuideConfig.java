package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class LeftSlideGuideConfig implements Serializable {

    @C09CT("guide_text")
    public final String guideText;

    public LeftSlideGuideConfig() {
        this(null);
    }

    public final String getGuideText() {
        return this.guideText;
    }

    public LeftSlideGuideConfig(String str) {
        this.guideText = str;
    }
}
