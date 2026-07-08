package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyBodyLinkList implements Serializable {
    public static final int $stable = 0;

    @C09CT("approve")
    public final Boolean approve;

    @C09CT("dismiss")
    public final Boolean dismiss;

    @C09CT("extra")
    public final String extra;

    @C09CT("link")
    public final String link;

    @C09CT("name")
    public final String name;

    @C09CT("operation")
    public final Integer operation;

    public PolicyBodyLinkList() {
        this("", "", Boolean.FALSE, null, Boolean.FALSE, "");
    }

    public PolicyBodyLinkList(String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3) {
        this.name = str;
        this.link = str2;
        this.approve = bool;
        this.operation = num;
        this.dismiss = bool2;
        this.extra = str3;
    }
}
