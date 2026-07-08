package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionGroupLevelTwo {

    @C09CT("chosen")
    public final Boolean chosen;

    @C09CT("desc")
    public final String desc;

    @C09CT("group_three_list")
    public final List<AuctionGroupLevelThree> groupThreeList;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public AuctionGroupLevelTwo() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionGroupLevelTwo)) {
            return false;
        }
        AuctionGroupLevelTwo auctionGroupLevelTwo = (AuctionGroupLevelTwo) obj;
        return Intrinsics.LJFF(this.title, auctionGroupLevelTwo.title) && Intrinsics.LJFF(this.desc, auctionGroupLevelTwo.desc) && Intrinsics.LJFF(this.type, auctionGroupLevelTwo.type) && Intrinsics.LJFF(this.chosen, auctionGroupLevelTwo.chosen) && Intrinsics.LJFF(this.groupThreeList, auctionGroupLevelTwo.groupThreeList);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.chosen;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AuctionGroupLevelThree> list = this.groupThreeList;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionGroupLevelTwo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", chosen=");
        sbLIZ.append(this.chosen);
        sbLIZ.append(", groupThreeList=");
        sbLIZ.append(this.groupThreeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AuctionGroupLevelTwo(String str, String str2, Integer num, Boolean bool, List<AuctionGroupLevelThree> list) {
        this.title = str;
        this.desc = str2;
        this.type = num;
        this.chosen = bool;
        this.groupThreeList = list;
    }
}
