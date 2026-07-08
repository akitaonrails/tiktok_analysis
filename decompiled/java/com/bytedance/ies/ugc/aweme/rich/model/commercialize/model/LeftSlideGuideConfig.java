package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
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
