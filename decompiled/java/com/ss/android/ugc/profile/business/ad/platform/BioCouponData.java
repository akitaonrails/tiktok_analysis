package com.ss.android.ugc.profile.business.ad.platform;

import X.C09CT;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class BioCouponData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("coupon_list")
    public List<CouponInfo> couponList;

    public final List<CouponInfo> getCouponList() {
        return this.couponList;
    }

    public final void setCouponList(List<CouponInfo> list) {
        this.couponList = list;
    }
}
