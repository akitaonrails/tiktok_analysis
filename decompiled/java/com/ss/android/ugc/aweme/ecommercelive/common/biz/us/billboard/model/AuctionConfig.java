package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionConfig {

    @C09CT("group_one_list")
    public final List<AuctionGroupLevelOne> groupOneList;

    public AuctionConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuctionConfig) && Intrinsics.LJFF(this.groupOneList, ((AuctionConfig) obj).groupOneList);
    }

    public final int hashCode() {
        List<AuctionGroupLevelOne> list = this.groupOneList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionConfig(groupOneList=");
        sbLIZ.append(this.groupOneList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AuctionConfig(List<AuctionGroupLevelOne> list) {
        this.groupOneList = list;
    }
}
