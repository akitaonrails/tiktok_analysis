package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileTabStoreData {

    @C09CT("is_profile_tab_clicked")
    public boolean isProfileTabClicked;

    @C09CT("total_count")
    public int totalCount;

    public ProfileTabStoreData(boolean z, int i) {
        this.isProfileTabClicked = z;
        this.totalCount = i;
    }
}
