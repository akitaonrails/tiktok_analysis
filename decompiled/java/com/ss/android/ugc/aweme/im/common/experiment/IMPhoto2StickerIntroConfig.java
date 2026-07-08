package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class IMPhoto2StickerIntroConfig {

    @C09CT("enabled")
    public final boolean isEnabled;

    @C09CT("is_show_learn_more")
    public final boolean isShowLearnMore;

    @C09CT("learn_more_url")
    public final String learnMoreUrl;

    public IMPhoto2StickerIntroConfig() {
        this(false, false, "");
    }

    public IMPhoto2StickerIntroConfig(boolean z, boolean z2, String str) {
        this.isEnabled = z;
        this.isShowLearnMore = z2;
        this.learnMoreUrl = str;
    }
}
