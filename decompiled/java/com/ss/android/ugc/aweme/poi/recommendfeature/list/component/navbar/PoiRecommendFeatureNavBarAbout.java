package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.navbar;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureNavBarAbout implements Serializable {

    @C09CT("content")
    public final String content;

    @C09CT("link_text")
    public final String linkText;

    @C09CT("link_text_key")
    public final String linkTextKey;

    @C09CT("link_url")
    public final String linkUrl;

    @C09CT("title")
    public final String title;

    public PoiRecommendFeatureNavBarAbout() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureNavBarAbout)) {
            return false;
        }
        PoiRecommendFeatureNavBarAbout poiRecommendFeatureNavBarAbout = (PoiRecommendFeatureNavBarAbout) obj;
        return Intrinsics.LJFF(this.title, poiRecommendFeatureNavBarAbout.title) && Intrinsics.LJFF(this.linkText, poiRecommendFeatureNavBarAbout.linkText) && Intrinsics.LJFF(this.linkTextKey, poiRecommendFeatureNavBarAbout.linkTextKey) && Intrinsics.LJFF(this.linkUrl, poiRecommendFeatureNavBarAbout.linkUrl) && Intrinsics.LJFF(this.content, poiRecommendFeatureNavBarAbout.content);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkTextKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureNavBarAbout(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", linkText=");
        sbLIZ.append(this.linkText);
        sbLIZ.append(", linkTextKey=");
        sbLIZ.append(this.linkTextKey);
        sbLIZ.append(", linkUrl=");
        sbLIZ.append(this.linkUrl);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiRecommendFeatureNavBarAbout(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.linkText = str2;
        this.linkTextKey = str3;
        this.linkUrl = str4;
        this.content = str5;
    }
}
