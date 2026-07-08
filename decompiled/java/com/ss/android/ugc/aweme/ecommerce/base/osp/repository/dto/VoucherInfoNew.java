package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherInfoNew {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("claim_user_type")
    public Integer claimUserType;

    @C09CT("cost_role")
    public Integer costRole;

    @C09CT("cost_type")
    public Integer costType;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("discount_level")
    public Integer discountLevel;

    @C09CT("discount_text")
    public String discountText;

    @C09CT("instance_info_list")
    public List<InstanceInfo> instanceInfoList;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("promotion_reduction_type")
    public Integer promotionReductionType;

    @C09CT("selected")
    public Boolean selected;

    @C09CT("threshold_text")
    public String thresholdText;

    @C09CT("valid_time_text")
    public String validTimeText;

    @C09CT("voucher_business_type")
    public String voucherBusinessType;

    @C09CT("voucher_id")
    public String voucherId;

    @C09CT("voucher_type_id")
    public String voucherTypeId;

    public VoucherInfoNew() {
    }

    public VoucherInfoNew(String str, String str2, String str3, List<InstanceInfo> list, Boolean bool, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, Integer num3, String str9, Integer num4, Integer num5) {
        this.voucherId = str;
        this.promotionId = str2;
        this.voucherTypeId = str3;
        this.instanceInfoList = list;
        this.selected = bool;
        this.voucherBusinessType = str4;
        this.discountText = str5;
        this.costRole = num;
        this.costType = num2;
        this.thresholdText = str6;
        this.validTimeText = str7;
        this.buttonText = str8;
        this.promotionReductionType = num3;
        this.daInfo = str9;
        this.claimUserType = num4;
        this.discountLevel = num5;
    }
}
