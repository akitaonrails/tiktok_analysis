package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class CouponInfo {

    @C09CT("coupon_background_image")
    public final String couponBackgroundImage;

    @C09CT("coupon_tier")
    public final List<CouponTier> couponTier;

    @C09CT("invite_desc")
    public final String inviteDesc;

    @C09CT("num_invitee")
    public final Integer numValidInvitee;

    public CouponInfo(List<CouponTier> list, String str, Integer num, String str2) {
        this.couponTier = list;
        this.inviteDesc = str;
        this.numValidInvitee = num;
        this.couponBackgroundImage = str2;
    }
}
