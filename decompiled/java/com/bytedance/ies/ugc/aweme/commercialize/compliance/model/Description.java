package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class Description implements Serializable {

    @C09CT("description")
    public final String description;

    @C09CT("hyper_links")
    public final List<String> hyperLink;

    @C09CT("hyper_texts")
    public final List<String> hyperText;

    @C09CT("title")
    public final String title;

    public Description(String str, String str2, List<String> list, List<String> list2) {
        this.title = str;
        this.description = str2;
        this.hyperText = list;
        this.hyperLink = list2;
    }

    public Description(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
