package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ECAnchorInfo implements Serializable {

    @C09CT("ads_anchor_tag")
    public final String adsAnchorTag;

    @C09CT("anchor_tag")
    public final String anchorTag;

    @C09CT("da_ads_anchor_tag")
    public final String daAdsAnchorTag;

    @C09CT("da_anchor_tag")
    public final String daAnchorTag;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("prefix_primary_image_urls")
    public final List<String> prefixPrimaryImageUrls;

    @C09CT("prefix_secondary_image_urls")
    public final List<String> prefixSecondaryImageUrls;

    @C09CT("prefix_style")
    public final Integer prefixStyle;

    public ECAnchorInfo() {
        this(null, null, null, null, null, null, null, null);
    }

    public ECAnchorInfo(String str, String str2, String str3, String str4, String str5, Integer num, List<String> list, List<String> list2) {
        this.anchorTag = str;
        this.daAnchorTag = str2;
        this.adsAnchorTag = str3;
        this.daAdsAnchorTag = str4;
        this.daInfo = str5;
        this.prefixStyle = num;
        this.prefixPrimaryImageUrls = list;
        this.prefixSecondaryImageUrls = list2;
    }
}
