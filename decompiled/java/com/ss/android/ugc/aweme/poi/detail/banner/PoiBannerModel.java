package com.ss.android.ugc.aweme.poi.detail.banner;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBannerModel extends BaseComponentData implements Serializable {

    @C09CT("banners")
    public final List<PoiActivityApi.PoiBannerInfo> bannerListInfo;

    public PoiBannerModel() {
        this(null);
    }

    public final PoiBannerModel copy(List<PoiActivityApi.PoiBannerInfo> list) {
        return new PoiBannerModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiBannerModel) && Intrinsics.LJFF(this.bannerListInfo, ((PoiBannerModel) obj).bannerListInfo);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiActivityApi.PoiBannerInfo> list = this.bannerListInfo;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiBannerModel(bannerListInfo=");
        sbLIZ.append(this.bannerListInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<PoiActivityApi.PoiBannerInfo> getBannerListInfo() {
        return this.bannerListInfo;
    }

    public PoiBannerModel(List<PoiActivityApi.PoiBannerInfo> list) {
        this.bannerListInfo = list;
    }
}
