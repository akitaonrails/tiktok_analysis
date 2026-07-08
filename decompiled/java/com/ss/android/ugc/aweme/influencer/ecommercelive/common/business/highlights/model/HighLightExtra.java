package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class HighLightExtra implements Serializable {
    public static final int $stable = 0;

    @C09CT("anchor_info")
    public final AnchorInfo anchorInfo;

    @C09CT("fragment_type")
    public final Integer fragmentType;

    @C09CT("suggest_video_title")
    public final String suggestVideoTitle;

    @C09CT("suggest_video_toast")
    public final String suggestVideoToast;

    public HighLightExtra(AnchorInfo anchorInfo, String str, String str2, Integer num) {
        this.anchorInfo = anchorInfo;
        this.suggestVideoTitle = str;
        this.suggestVideoToast = str2;
        this.fragmentType = num;
    }
}
