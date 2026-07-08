package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPrefix implements Serializable {

    @C09CT("prefix_style")
    public final Integer prefixStyle;

    @C09CT("prefix_tag")
    public final String prefixTag;

    @C09CT("prefix_tag_tracking")
    public final String prefixTagTracking;

    @C09CT("primary_prefix_image_urls")
    public final List<String> primaryPrefixImageUrls;

    @C09CT("secondary_prefix_image_urls")
    public final List<String> secondaryPrefixImageUrls;

    public AdPrefix() {
        this(null, null, null, null, null);
    }

    public AdPrefix(Integer num, String str, String str2, List<String> list, List<String> list2) {
        this.prefixStyle = num;
        this.prefixTag = str;
        this.prefixTagTracking = str2;
        this.primaryPrefixImageUrls = list;
        this.secondaryPrefixImageUrls = list2;
    }
}
