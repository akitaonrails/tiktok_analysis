package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class DescriptionDetail {

    @C09CT("description")
    public final String description;

    @C09CT("hyper_links")
    public final List<String> hyperLinks;

    @C09CT("hyper_texts")
    public final List<String> hyperText;

    public DescriptionDetail() {
        this(null, null, null);
    }

    public DescriptionDetail(String str, List<String> list, List<String> list2) {
        this.description = str;
        this.hyperText = list;
        this.hyperLinks = list2;
    }
}
