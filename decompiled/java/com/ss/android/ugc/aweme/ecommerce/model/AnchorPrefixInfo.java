package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorPrefixInfo implements Serializable {

    @C09CT("anchor_prefix_da_info")
    public final String anchorPrefixDaInfo;

    @C09CT("anchor_prefix_primary_image_urls")
    public final List<String> anchorPrefixPrimaryImageUrls;

    @C09CT("anchor_prefix_secondary_image_urls")
    public final List<String> anchorPrefixSecondaryImageUrls;

    @C09CT("anchor_prefix_style")
    public final Integer anchorPrefixStyle;

    @C09CT("anchor_prefix_text")
    public final String anchorPrefixText;

    @C09CT("anchor_prefix_type")
    public final Integer anchorPrefixType;

    public AnchorPrefixInfo() {
        this(null, null, null, null, null, null);
    }

    public AnchorPrefixInfo(String str, Integer num, Integer num2, List<String> list, List<String> list2, String str2) {
        this.anchorPrefixText = str;
        this.anchorPrefixType = num;
        this.anchorPrefixStyle = num2;
        this.anchorPrefixPrimaryImageUrls = list;
        this.anchorPrefixSecondaryImageUrls = list2;
        this.anchorPrefixDaInfo = str2;
    }
}
