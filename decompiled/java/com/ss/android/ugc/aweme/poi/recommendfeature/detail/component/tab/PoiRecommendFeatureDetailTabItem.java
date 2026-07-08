package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailTabItem implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    public PoiRecommendFeatureDetailTabItem() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureDetailTabItem)) {
            return false;
        }
        PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem = (PoiRecommendFeatureDetailTabItem) obj;
        return Intrinsics.LJFF(this.id, poiRecommendFeatureDetailTabItem.id) && Intrinsics.LJFF(this.name, poiRecommendFeatureDetailTabItem.name) && Intrinsics.LJFF(this.cover, poiRecommendFeatureDetailTabItem.cover) && Intrinsics.LJFF(this.collectInfo, poiRecommendFeatureDetailTabItem.collectInfo);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.collectInfo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailTabItem(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.collectInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiRecommendFeatureDetailTabItem(String str, String str2, UrlModel urlModel, String str3) {
        this.id = str;
        this.name = str2;
        this.cover = urlModel;
        this.collectInfo = str3;
    }
}
