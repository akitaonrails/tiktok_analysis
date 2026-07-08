package com.ss.android.ugc.aweme.account.model;

/* JADX INFO: loaded from: classes14.dex */
public final class OrgUserInfo {
    public final String accountType;
    public final String isOrgPeriod;
    public final String orgName;

    public final String isOrgPeriod() {
        return this.isOrgPeriod;
    }

    public OrgUserInfo(String str, String str2, String str3) {
        this.orgName = str;
        this.accountType = str2;
        this.isOrgPeriod = str3;
    }
}
