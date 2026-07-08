package com.ss.android.ugc.aweme.account.org.create;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class OrgInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("biz_subject_id")
    public final String bizSubjectId;

    @C09CT("organization_name")
    public final String organizationName;

    @C09CT("region")
    public final String region;

    public OrgInfo() {
        this("", "", "");
    }

    public OrgInfo(String str, String str2, String str3) {
        this.organizationName = str;
        this.region = str2;
        this.bizSubjectId = str3;
    }
}
