package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.navbar;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureNavBarModule extends BaseComponentData implements Serializable {

    @C09CT("about")
    public final PoiRecommendFeatureNavBarAbout about;

    @C09CT("title")
    public final String title;

    public PoiRecommendFeatureNavBarModule() {
        this(null, null);
    }

    public final PoiRecommendFeatureNavBarModule copy(String str, PoiRecommendFeatureNavBarAbout poiRecommendFeatureNavBarAbout) {
        return new PoiRecommendFeatureNavBarModule(str, poiRecommendFeatureNavBarAbout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureNavBarModule)) {
            return false;
        }
        PoiRecommendFeatureNavBarModule poiRecommendFeatureNavBarModule = (PoiRecommendFeatureNavBarModule) obj;
        return Intrinsics.LJFF(this.title, poiRecommendFeatureNavBarModule.title) && Intrinsics.LJFF(this.about, poiRecommendFeatureNavBarModule.about);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiRecommendFeatureNavBarAbout poiRecommendFeatureNavBarAbout = this.about;
        return iHashCode + (poiRecommendFeatureNavBarAbout != null ? poiRecommendFeatureNavBarAbout.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureNavBarModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", about=");
        sbLIZ.append(this.about);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiRecommendFeatureNavBarAbout getAbout() {
        return this.about;
    }

    public final String getTitle() {
        return this.title;
    }

    public PoiRecommendFeatureNavBarModule(String str, PoiRecommendFeatureNavBarAbout poiRecommendFeatureNavBarAbout) {
        this.title = str;
        this.about = poiRecommendFeatureNavBarAbout;
    }
}
