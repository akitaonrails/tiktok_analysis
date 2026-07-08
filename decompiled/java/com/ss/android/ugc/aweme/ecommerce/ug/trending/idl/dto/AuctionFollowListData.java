package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionFollowListData implements Serializable {

    @C09CT("follow_shop_list")
    public final List<FollowShopItem> followShopList;

    public AuctionFollowListData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuctionFollowListData) && Intrinsics.LJFF(this.followShopList, ((AuctionFollowListData) obj).followShopList);
    }

    public int hashCode() {
        List<FollowShopItem> list = this.followShopList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionFollowListData(followShopList=");
        sbLIZ.append(this.followShopList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AuctionFollowListData(List<FollowShopItem> list) {
        this.followShopList = list;
    }
}
