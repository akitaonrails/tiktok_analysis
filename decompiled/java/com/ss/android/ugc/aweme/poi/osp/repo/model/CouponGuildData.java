package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CouponGuildData extends BaseComponentData implements Serializable {

    @C09CT("cell_list")
    public final List<CouponGuildCellData> cellList;

    @C09CT("click_url")
    public final String clickUrl;

    @C09CT("title")
    public final String title;

    public CouponGuildData() {
        this(null, null, null);
    }

    public final CouponGuildData copy(String str, String str2, List<CouponGuildCellData> list) {
        return new CouponGuildData(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponGuildData)) {
            return false;
        }
        CouponGuildData couponGuildData = (CouponGuildData) obj;
        return Intrinsics.LJFF(this.title, couponGuildData.title) && Intrinsics.LJFF(this.clickUrl, couponGuildData.clickUrl) && Intrinsics.LJFF(this.cellList, couponGuildData.cellList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CouponGuildCellData> list = this.cellList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponGuildData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", clickUrl=");
        sbLIZ.append(this.clickUrl);
        sbLIZ.append(", cellList=");
        sbLIZ.append(this.cellList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<CouponGuildCellData> getCellList() {
        return this.cellList;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public CouponGuildData(String str, String str2, List<CouponGuildCellData> list) {
        this.title = str;
        this.clickUrl = str2;
        this.cellList = list;
    }
}
