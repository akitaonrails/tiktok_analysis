package com.ss.android.ugc.aweme.ecommerce.base.coupon;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CouponClaimedEvent {

    @C09CT("activity_user_selection")
    public final ActivityUserSelection activityUserSelection;

    @C09CT("coupon_update_info")
    public final CouponUpdateInfo couponUpdateInfo;

    @C09CT("voucher_info_list")
    public final List<VoucherInfoNew> voucherIds;

    @C09CT("voucher_type")
    public final Integer voucherType;

    public CouponClaimedEvent(List<VoucherInfoNew> list, Integer num, ActivityUserSelection activityUserSelection, CouponUpdateInfo couponUpdateInfo) {
        this.voucherIds = list;
        this.voucherType = num;
        this.activityUserSelection = activityUserSelection;
        this.couponUpdateInfo = couponUpdateInfo;
    }
}
