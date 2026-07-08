package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class Policy implements Serializable {

    @C09CT("content")
    public final List<PolicyContent> content;

    @C09CT("policy_name")
    public final String policyName;

    public Policy() {
        this(null, null);
    }

    public Policy(String str, List<PolicyContent> list) {
        this.policyName = str;
        this.content = list;
    }
}
