package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class CopyWritingInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("check")
    public final String checkSettings;

    @C09CT("confirm")
    public final String confirm;

    @C09CT("policy_link_list")
    public final List<String> policyLinkList;

    @C09CT("policy_list")
    public final List<String> policyList;

    @C09CT("subtext")
    public final String subtext;

    @C09CT("title")
    public final String title;

    public CopyWritingInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public CopyWritingInfo(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.title = str;
        this.subtext = str2;
        this.policyList = list;
        this.policyLinkList = list2;
        this.confirm = str3;
        this.checkSettings = str4;
    }

    public CopyWritingInfo(String str, String str2, List list, List list2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
