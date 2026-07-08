package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VipSubscriptionPurchaseOption implements Serializable {
    public static final int $stable = 0;

    @C09CT("cycle_type")
    public final VipSubscriptionCycleType cycleType;

    @C09CT("desc")
    public final String desc;

    @C09CT("discount_percentage")
    public final int discountPercentage;

    @C09CT("is_auto_renew")
    public final Boolean isAutoRenew;

    @C09CT("is_best")
    public final Boolean isBest;

    @C09CT("price")
    public final VipSubscriptionPrice price;

    @C09CT("title")
    public final String title;

    public VipSubscriptionPurchaseOption() {
        this("", "", null, 0, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipSubscriptionPurchaseOption)) {
            return false;
        }
        VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption = (VipSubscriptionPurchaseOption) obj;
        return Intrinsics.LJFF(this.title, vipSubscriptionPurchaseOption.title) && Intrinsics.LJFF(this.desc, vipSubscriptionPurchaseOption.desc) && Intrinsics.LJFF(this.price, vipSubscriptionPurchaseOption.price) && this.discountPercentage == vipSubscriptionPurchaseOption.discountPercentage && Intrinsics.LJFF(this.isBest, vipSubscriptionPurchaseOption.isBest) && Intrinsics.LJFF(this.isAutoRenew, vipSubscriptionPurchaseOption.isAutoRenew) && this.cycleType == vipSubscriptionPurchaseOption.cycleType;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.desc.hashCode()) * 31;
        VipSubscriptionPrice vipSubscriptionPrice = this.price;
        int iHashCode2 = (((iHashCode + (vipSubscriptionPrice == null ? 0 : vipSubscriptionPrice.hashCode())) * 31) + this.discountPercentage) * 31;
        Boolean bool = this.isBest;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAutoRenew;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VipSubscriptionCycleType vipSubscriptionCycleType = this.cycleType;
        return iHashCode4 + (vipSubscriptionCycleType != null ? vipSubscriptionCycleType.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VipSubscriptionPurchaseOption(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", price=");
        sbLIZ.append(this.price);
        sbLIZ.append(", discountPercentage=");
        sbLIZ.append(this.discountPercentage);
        sbLIZ.append(", isBest=");
        sbLIZ.append(this.isBest);
        sbLIZ.append(", isAutoRenew=");
        sbLIZ.append(this.isAutoRenew);
        sbLIZ.append(", cycleType=");
        sbLIZ.append(this.cycleType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isAutoRenew() {
        return this.isAutoRenew;
    }

    public final Boolean isBest() {
        return this.isBest;
    }

    public VipSubscriptionPurchaseOption(String str, String str2, VipSubscriptionPrice vipSubscriptionPrice, int i, Boolean bool, Boolean bool2, VipSubscriptionCycleType vipSubscriptionCycleType) {
        this.title = str;
        this.desc = str2;
        this.price = vipSubscriptionPrice;
        this.discountPercentage = i;
        this.isBest = bool;
        this.isAutoRenew = bool2;
        this.cycleType = vipSubscriptionCycleType;
    }
}
