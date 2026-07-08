package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AnchorPrivilegeItem implements Serializable {

    @C09CT("bolded_text")
    public final List<String> boldedText;

    @C09CT("claim_incentive_info")
    public final ClaimIncentiveInfo claimIncentiveInfo;

    @C09CT("da_info")
    public final DaInfo daInfo;

    @C09CT("item_type")
    public final Integer itemType;

    @C09CT("opt_show_text")
    public final String optShowText;

    @C09CT("selling_item_type")
    public final Integer sellingItemType;

    public AnchorPrivilegeItem() {
        this(null, null, null, null, null, null);
    }

    public final List<String> getBoldedText() {
        return this.boldedText;
    }

    public final ClaimIncentiveInfo getClaimIncentiveInfo() {
        return this.claimIncentiveInfo;
    }

    public final DaInfo getDaInfo() {
        return this.daInfo;
    }

    public final Integer getItemType() {
        return this.itemType;
    }

    public final String getOptShowText() {
        return this.optShowText;
    }

    public final Integer getSellingItemType() {
        return this.sellingItemType;
    }

    public AnchorPrivilegeItem(Integer num, Integer num2, String str, List<String> list, ClaimIncentiveInfo claimIncentiveInfo, DaInfo daInfo) {
        this.itemType = num;
        this.sellingItemType = num2;
        this.optShowText = str;
        this.boldedText = list;
        this.claimIncentiveInfo = claimIncentiveInfo;
        this.daInfo = daInfo;
    }
}
