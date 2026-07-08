package com.ss.android.ugc.aweme.poi.detail.amusement.model;

import X.AbstractC1180940gpw;
import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmusementDataModel extends AbstractC1180940gpw implements Serializable {

    @C09CT("amusement_cursor")
    public final Long amusementCursor;

    @C09CT("has_more_aweme")
    public final Integer hasMoreAweme;

    @C09CT("item_list")
    public final List<PoiItemModel> itemList;

    public PoiAmusementDataModel() {
        this(null, null, null);
    }

    public final PoiAmusementDataModel copy(List<PoiItemModel> list, Long l, Integer num) {
        return new PoiAmusementDataModel(list, l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAmusementDataModel)) {
            return false;
        }
        PoiAmusementDataModel poiAmusementDataModel = (PoiAmusementDataModel) obj;
        return Intrinsics.LJFF(this.itemList, poiAmusementDataModel.itemList) && Intrinsics.LJFF(this.amusementCursor, poiAmusementDataModel.amusementCursor) && Intrinsics.LJFF(this.hasMoreAweme, poiAmusementDataModel.hasMoreAweme);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiItemModel> list = this.itemList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.amusementCursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hasMoreAweme;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAmusementDataModel(itemList=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(", amusementCursor=");
        sbLIZ.append(this.amusementCursor);
        sbLIZ.append(", hasMoreAweme=");
        sbLIZ.append(this.hasMoreAweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Long getAmusementCursor() {
        return this.amusementCursor;
    }

    public final Integer getHasMoreAweme() {
        return this.hasMoreAweme;
    }

    public final List<PoiItemModel> getItemList() {
        return this.itemList;
    }

    public PoiAmusementDataModel(List<PoiItemModel> list, Long l, Integer num) {
        this.itemList = list;
        this.amusementCursor = l;
        this.hasMoreAweme = num;
    }
}
