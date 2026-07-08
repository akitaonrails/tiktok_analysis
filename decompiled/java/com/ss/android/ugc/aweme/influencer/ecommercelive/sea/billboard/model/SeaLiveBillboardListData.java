package com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SeaLiveBillboardListData {

    @C09CT("billboard_image_list")
    public final List<ImageItem> imageList;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("latest_billboard_id")
    public final String latestBillboardId;

    public SeaLiveBillboardListData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaLiveBillboardListData)) {
            return false;
        }
        SeaLiveBillboardListData seaLiveBillboardListData = (SeaLiveBillboardListData) obj;
        return Intrinsics.LJFF(this.imageList, seaLiveBillboardListData.imageList) && Intrinsics.LJFF(this.isNewUser, seaLiveBillboardListData.isNewUser) && Intrinsics.LJFF(this.latestBillboardId, seaLiveBillboardListData.latestBillboardId);
    }

    public final int hashCode() {
        List<ImageItem> list = this.imageList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isNewUser;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.latestBillboardId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveBillboardListData(imageList=");
        sbLIZ.append(this.imageList);
        sbLIZ.append(", isNewUser=");
        sbLIZ.append(this.isNewUser);
        sbLIZ.append(", latestBillboardId=");
        sbLIZ.append(this.latestBillboardId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaLiveBillboardListData(List<ImageItem> list, Boolean bool, String str) {
        this.imageList = list;
        this.isNewUser = bool;
        this.latestBillboardId = str;
    }
}
