package com.ss.android.ugc.aweme.tools.beauty.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class LocalBeautyConfig {

    @C09CT("beauty_tag")
    public final String beautyTag;

    @C09CT("default_beauty_value")
    public final int defaultBeautyValue;

    public LocalBeautyConfig() {
        this("", 0);
    }

    public LocalBeautyConfig(String str, int i) {
        this.beautyTag = str;
        this.defaultBeautyValue = i;
    }
}
