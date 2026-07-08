package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class HighlightData {

    @C09CT("activity")
    public final ActivityDisplay activity;

    @C09CT("icon_bubble_str")
    public String bubbleStr;

    @C09CT("icon_bubble_type")
    public String bubbleType;

    @C09CT("expansion_voucher")
    public final ExpansionVoucher expansionVoucher;

    @C09CT("new_user_popup")
    public NewUserPopUp newUserPopup;

    @C09CT("promotion_bubble")
    public final PromotionBubble promotionBubble;

    @C09CT("promotion_type")
    public final Integer promotionType;

    @C09CT("resource_type")
    public final Integer resourceType;

    @C09CT("voucher")
    public final VoucherInfo voucher;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightData(newUserPopup=");
        sbLIZ.append(this.newUserPopup);
        sbLIZ.append(", bubbleStr=");
        sbLIZ.append(this.bubbleStr);
        sbLIZ.append(", bubbleType=");
        sbLIZ.append(this.bubbleType);
        sbLIZ.append(", resourceType=");
        sbLIZ.append(this.resourceType);
        sbLIZ.append(", promotionType=");
        sbLIZ.append(this.promotionType);
        sbLIZ.append(", voucher=");
        sbLIZ.append(this.voucher);
        sbLIZ.append(", expansionVoucher=");
        sbLIZ.append(this.expansionVoucher);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.activity);
        sbLIZ.append(", promotionBubble=");
        sbLIZ.append(this.promotionBubble);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HighlightData(NewUserPopUp newUserPopUp, String str, String str2, Integer num, Integer num2, VoucherInfo voucherInfo, ExpansionVoucher expansionVoucher, ActivityDisplay activityDisplay, PromotionBubble promotionBubble) {
        this.newUserPopup = newUserPopUp;
        this.bubbleStr = str;
        this.bubbleType = str2;
        this.resourceType = num;
        this.promotionType = num2;
        this.voucher = voucherInfo;
        this.expansionVoucher = expansionVoucher;
        this.activity = activityDisplay;
        this.promotionBubble = promotionBubble;
    }
}
