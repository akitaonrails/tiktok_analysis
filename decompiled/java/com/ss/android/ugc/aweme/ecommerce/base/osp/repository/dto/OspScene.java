package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OspScene implements Serializable {
    public static final int $stable = 0;

    @C09CT("buy_type")
    public final Integer buyType;

    @C09CT("has_selected_activity")
    public final Integer hasSelectedActivity;

    @C09CT("has_selected_voucher")
    public final Integer hasSelectedVoucher;

    @C09CT("is_auto_claim_voucher")
    public final Integer isAutoClaimVoucher;

    @C09CT("is_fast_payment")
    public final Integer isFastPayment;

    @C09CT("is_flash_sale")
    public final Integer isFlashSale;

    @C09CT("is_from_follow")
    public final Integer isFromFollow;

    @C09CT("is_refresh_osp")
    public final Integer isRefrshOsp;

    @C09CT("is_use_bonus_redeem")
    public final Integer isUseBonusRedeem;

    @C09CT("is_virtual_product")
    public final Integer isVirtualProduct;

    @C09CT("one_step_order_type")
    public final Integer oneStepOrderType;

    @C09CT("use_user_selection_activity")
    public final Integer useSelectedActivity;

    @C09CT("use_user_selection_voucher")
    public final Integer useSelectedVoucher;

    public OspScene() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Integer isAutoClaimVoucher() {
        return this.isAutoClaimVoucher;
    }

    public final Integer isFastPayment() {
        return this.isFastPayment;
    }

    public final Integer isFlashSale() {
        return this.isFlashSale;
    }

    public final Integer isFromFollow() {
        return this.isFromFollow;
    }

    public final Integer isRefrshOsp() {
        return this.isRefrshOsp;
    }

    public final Integer isUseBonusRedeem() {
        return this.isUseBonusRedeem;
    }

    public final Integer isVirtualProduct() {
        return this.isVirtualProduct;
    }

    public OspScene(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this.isVirtualProduct = num;
        this.isRefrshOsp = num2;
        this.useSelectedVoucher = num3;
        this.useSelectedActivity = num4;
        this.isFlashSale = num5;
        this.buyType = num6;
        this.oneStepOrderType = num7;
        this.isFromFollow = num8;
        this.isUseBonusRedeem = num9;
        this.isFastPayment = num10;
        this.hasSelectedVoucher = num11;
        this.hasSelectedActivity = num12;
        this.isAutoClaimVoucher = num13;
    }
}
