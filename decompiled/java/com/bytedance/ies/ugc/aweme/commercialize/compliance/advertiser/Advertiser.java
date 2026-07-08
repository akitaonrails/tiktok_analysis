package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.AdvertiserModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Advertiser extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("hidden_adv_list")
    public final List<AdvertiserModel> hiddenAdvList;

    @C09CT("shown_adv_list")
    public final List<AdvertiserModel> shownAdvList;

    public Advertiser() {
        this(null, null);
    }

    public final Advertiser copy(List<AdvertiserModel> list, List<AdvertiserModel> list2) {
        return new Advertiser(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Advertiser)) {
            return false;
        }
        Advertiser advertiser = (Advertiser) obj;
        return Intrinsics.LJFF(this.shownAdvList, advertiser.shownAdvList) && Intrinsics.LJFF(this.hiddenAdvList, advertiser.hiddenAdvList);
    }

    public int hashCode() {
        List<AdvertiserModel> list = this.shownAdvList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdvertiserModel> list2 = this.hiddenAdvList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Advertiser(shownAdvList=");
        sbLIZ.append(this.shownAdvList);
        sbLIZ.append(", hiddenAdvList=");
        sbLIZ.append(this.hiddenAdvList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AdvertiserModel> getHiddenAdvList() {
        return this.hiddenAdvList;
    }

    public final List<AdvertiserModel> getShownAdvList() {
        return this.shownAdvList;
    }

    public Advertiser(List<AdvertiserModel> list, List<AdvertiserModel> list2) {
        this.shownAdvList = list;
        this.hiddenAdvList = list2;
    }
}
