package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class IncentiveSideBar extends C1893670zNV {

    @C09CT("asset_detail")
    public final AssetDetail assetDetail;

    @C09CT("biz_extra")
    public final String bizExtra;

    @C09CT("gameplay_card_list")
    public final List<GameplayCard> gameplayCardList;

    public IncentiveSideBar() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveSideBar)) {
            return false;
        }
        IncentiveSideBar incentiveSideBar = (IncentiveSideBar) obj;
        return Intrinsics.LJFF(this.assetDetail, incentiveSideBar.assetDetail) && Intrinsics.LJFF(this.gameplayCardList, incentiveSideBar.gameplayCardList) && Intrinsics.LJFF(this.bizExtra, incentiveSideBar.bizExtra);
    }

    public final int hashCode() {
        AssetDetail assetDetail = this.assetDetail;
        int iHashCode = (assetDetail == null ? 0 : assetDetail.hashCode()) * 31;
        List<GameplayCard> list = this.gameplayCardList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.bizExtra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveSideBar(assetDetail=");
        sbLIZ.append(this.assetDetail);
        sbLIZ.append(", gameplayCardList=");
        sbLIZ.append(this.gameplayCardList);
        sbLIZ.append(", bizExtra=");
        sbLIZ.append(this.bizExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveSideBar(AssetDetail assetDetail, List<GameplayCard> list, String str) {
        this.assetDetail = assetDetail;
        this.gameplayCardList = list;
        this.bizExtra = str;
    }
}
