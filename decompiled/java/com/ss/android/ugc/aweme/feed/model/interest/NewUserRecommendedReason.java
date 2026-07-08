package com.ss.android.ugc.aweme.feed.model.interest;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class NewUserRecommendedReason implements Serializable {

    @C09CT("new_user_recommended_reason_entry_list")
    public List<NewUserRecommendReasonEntry> newUserRecommendedReasonEntryList;

    public NewUserRecommendedReason() {
    }

    public NewUserRecommendedReason(List<NewUserRecommendReasonEntry> list) {
        this.newUserRecommendedReasonEntryList = list;
    }
}
