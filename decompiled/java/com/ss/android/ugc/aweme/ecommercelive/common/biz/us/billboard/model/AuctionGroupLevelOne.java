package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionGroupLevelOne {

    @C09CT("group_two_list")
    public final List<AuctionGroupLevelTwo> groupTwoList;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public AuctionGroupLevelOne() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionGroupLevelOne)) {
            return false;
        }
        AuctionGroupLevelOne auctionGroupLevelOne = (AuctionGroupLevelOne) obj;
        return Intrinsics.LJFF(this.title, auctionGroupLevelOne.title) && Intrinsics.LJFF(this.type, auctionGroupLevelOne.type) && Intrinsics.LJFF(this.groupTwoList, auctionGroupLevelOne.groupTwoList);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<AuctionGroupLevelTwo> list = this.groupTwoList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionGroupLevelOne(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", groupTwoList=");
        sbLIZ.append(this.groupTwoList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AuctionGroupLevelOne(String str, Integer num, List<AuctionGroupLevelTwo> list) {
        this.title = str;
        this.type = num;
        this.groupTwoList = list;
    }
}
