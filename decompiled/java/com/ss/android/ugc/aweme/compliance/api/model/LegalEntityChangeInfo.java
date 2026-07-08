package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class LegalEntityChangeInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("body")
    public final String body;

    @C09CT("content_link_list")
    public final List<PolicyBodyLinkList> bodyLinkList;

    @C09CT("title")
    public final String title;

    public LegalEntityChangeInfo() {
        this(null, null, null, 7, null);
    }

    public LegalEntityChangeInfo(String str, String str2, List<PolicyBodyLinkList> list) {
        this.title = str;
        this.body = str2;
        this.bodyLinkList = list;
    }

    public LegalEntityChangeInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
