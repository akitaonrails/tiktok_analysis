package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedCardPageInfo {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("descriptions")
    public final List<DescriptionDetail> descriptions;

    @C09CT("lower_button_description")
    public final DescriptionDetail lowerButtonDescription;

    @C09CT("lower_button_text")
    public final String lowerButtonText;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public FeedCardPageInfo() {
        this(null, null, null, null, null, null);
    }

    public FeedCardPageInfo(String str, String str2, List<DescriptionDetail> list, String str3, String str4, DescriptionDetail descriptionDetail) {
        this.title = str;
        this.subtitle = str2;
        this.descriptions = list;
        this.buttonText = str3;
        this.lowerButtonText = str4;
        this.lowerButtonDescription = descriptionDetail;
    }
}
