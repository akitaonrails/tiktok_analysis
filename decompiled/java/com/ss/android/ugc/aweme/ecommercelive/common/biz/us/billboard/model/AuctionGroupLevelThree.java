package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionGroupLevelThree {

    @C09CT("chosen")
    public final Boolean chosen;

    @C09CT("desc")
    public final String desc;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public AuctionGroupLevelThree() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionGroupLevelThree)) {
            return false;
        }
        AuctionGroupLevelThree auctionGroupLevelThree = (AuctionGroupLevelThree) obj;
        return Intrinsics.LJFF(this.title, auctionGroupLevelThree.title) && Intrinsics.LJFF(this.desc, auctionGroupLevelThree.desc) && Intrinsics.LJFF(this.type, auctionGroupLevelThree.type) && Intrinsics.LJFF(this.chosen, auctionGroupLevelThree.chosen);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.chosen;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionGroupLevelThree(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", chosen=");
        sbLIZ.append(this.chosen);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AuctionGroupLevelThree(String str, String str2, Integer num, Boolean bool) {
        this.title = str;
        this.desc = str2;
        this.type = num;
        this.chosen = bool;
    }
}
