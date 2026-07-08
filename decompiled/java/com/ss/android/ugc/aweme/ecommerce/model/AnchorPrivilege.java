package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorPrivilege implements Serializable {

    @C09CT("anchor_privilege_items")
    public final List<AnchorPrivilegeItem> anchorPrivilegeItems;

    @C09CT("discount_text")
    public final String discountText;

    @C09CT("privilege_style")
    public final List<Integer> privilegeStyle;

    @C09CT("privilege_text")
    public final List<String> privilegeText;

    @C09CT("reviews_amount")
    public final Integer reviewsAmount;

    @C09CT("sold_amount")
    public final Integer soldAmount;

    public AnchorPrivilege() {
        this(null, null, null, null, null, null);
    }

    public final List<AnchorPrivilegeItem> getAnchorPrivilegeItems() {
        return this.anchorPrivilegeItems;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final List<Integer> getPrivilegeStyle() {
        return this.privilegeStyle;
    }

    public final List<String> getPrivilegeText() {
        return this.privilegeText;
    }

    public final Integer getReviewsAmount() {
        return this.reviewsAmount;
    }

    public final Integer getSoldAmount() {
        return this.soldAmount;
    }

    public AnchorPrivilege(List<Integer> list, String str, Integer num, Integer num2, List<String> list2, List<AnchorPrivilegeItem> list3) {
        this.privilegeStyle = list;
        this.discountText = str;
        this.soldAmount = num;
        this.reviewsAmount = num2;
        this.privilegeText = list2;
        this.anchorPrivilegeItems = list3;
    }
}
