package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMixLemon8Pic {
    public transient Aweme LIZ;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("base_info")
    public final BaseImage image;

    @C09CT("landing_page_url")
    public final String pageUrl;

    @C09CT("index")
    public final int position;

    public TakoMixLemon8Pic() {
        this(null, null, 0, "", null);
    }

    public TakoMixLemon8Pic(BaseImage baseImage, String str, int i, String str2, Aweme aweme) {
        this.image = baseImage;
        this.awemeId = str;
        this.position = i;
        this.pageUrl = str2;
        this.LIZ = aweme;
    }
}
