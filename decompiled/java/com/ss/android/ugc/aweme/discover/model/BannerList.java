package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C0X12;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BannerList extends BaseResponse implements C0X12 {

    @C09CT("banner")
    public final List<Banner> items;

    @C09CT("log_pb")
    public final LogPbBean logPb;
    public String requestId;

    public BannerList() {
        this(null, null, null, 7, null);
    }

    public final BannerList copy(List<? extends Banner> list, LogPbBean logPbBean, String str) {
        return new BannerList(list, logPbBean, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerList)) {
            return false;
        }
        BannerList bannerList = (BannerList) obj;
        return Intrinsics.LJFF(this.items, bannerList.items) && Intrinsics.LJFF(this.logPb, bannerList.logPb) && Intrinsics.LJFF(this.requestId, bannerList.requestId);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        LogPbBean logPbBean = this.logPb;
        return ((iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + this.requestId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerList(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Banner> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerList(List<? extends Banner> list, LogPbBean logPbBean, String str) {
        this.items = list;
        this.logPb = logPbBean;
        this.requestId = str;
    }

    public BannerList(List list, LogPbBean logPbBean, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : logPbBean, (i & 4) != 0 ? "" : str);
    }
}
