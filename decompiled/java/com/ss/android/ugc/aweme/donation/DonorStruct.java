package com.ss.android.ugc.aweme.donation;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes26.dex */
public final class DonorStruct {

    @C09CT("user_amount")
    public final String amount;

    @C09CT("anonymous")
    public final Boolean anonymous;

    @C09CT("is_top_donor")
    public final boolean isTopDonor;

    @C09CT("tiktok_amount")
    public final String tiktokAmount;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("user")
    public final User user;

    public DonorStruct(User user, Long l, String str, String str2, Boolean bool, boolean z) {
        this.user = user;
        this.timestamp = l;
        this.amount = str;
        this.tiktokAmount = str2;
        this.anonymous = bool;
        this.isTopDonor = z;
    }
}
