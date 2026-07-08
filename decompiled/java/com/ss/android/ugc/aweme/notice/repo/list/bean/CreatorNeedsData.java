package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class CreatorNeedsData {

    @C09CT("edit_quota")
    public final Integer editQuota;

    @C09CT("publish_quota")
    public final String publishQuota;

    public CreatorNeedsData(Integer num, String str) {
        this.editQuota = num;
        this.publishQuota = str;
    }
}
