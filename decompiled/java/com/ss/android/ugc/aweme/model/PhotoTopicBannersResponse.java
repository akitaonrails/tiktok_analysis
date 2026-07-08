package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PhotoTopicBannersResponse extends BaseResponse {

    @C09CT("multi_banner_display_info")
    public final List<BannerDisplayInfo> multiBannerDisplayInfo;

    public PhotoTopicBannersResponse() {
        this(null);
    }

    public final PhotoTopicBannersResponse copy(List<BannerDisplayInfo> list) {
        return new PhotoTopicBannersResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotoTopicBannersResponse) && Intrinsics.LJFF(this.multiBannerDisplayInfo, ((PhotoTopicBannersResponse) obj).multiBannerDisplayInfo);
    }

    public int hashCode() {
        List<BannerDisplayInfo> list = this.multiBannerDisplayInfo;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTopicBannersResponse(multiBannerDisplayInfo=");
        sbLIZ.append(this.multiBannerDisplayInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<BannerDisplayInfo> getMultiBannerDisplayInfo() {
        return this.multiBannerDisplayInfo;
    }

    public PhotoTopicBannersResponse(List<BannerDisplayInfo> list) {
        this.multiBannerDisplayInfo = list;
    }
}
