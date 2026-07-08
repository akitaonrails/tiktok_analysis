package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatorFanGroupMeta {

    @C09CT("creation_eligibility")
    public final Boolean creationEligibility;

    @C09CT("creator_name")
    public final String creatorName;

    @C09CT("current_group_num")
    public final long currentGroupNum;

    public CreatorFanGroupMeta() {
        this(0L, "", Boolean.FALSE);
    }

    public CreatorFanGroupMeta(long j, String str, Boolean bool) {
        this.currentGroupNum = j;
        this.creatorName = str;
        this.creationEligibility = bool;
    }
}
