package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPictureAuthorModel implements Serializable {

    @C09CT("link")
    public final UrlModel authorLink;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("keyword")
    public final String keyword;

    public PoiPictureAuthorModel() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiPictureAuthorModel)) {
            return false;
        }
        PoiPictureAuthorModel poiPictureAuthorModel = (PoiPictureAuthorModel) obj;
        return Intrinsics.LJFF(this.keyword, poiPictureAuthorModel.keyword) && Intrinsics.LJFF(this.icon, poiPictureAuthorModel.icon) && Intrinsics.LJFF(this.authorLink, poiPictureAuthorModel.authorLink);
    }

    public int hashCode() {
        String str = this.keyword;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.icon;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.authorLink;
        return iHashCode2 + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPictureAuthorModel(keyword=");
        sbLIZ.append(this.keyword);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", authorLink=");
        sbLIZ.append(this.authorLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiPictureAuthorModel(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.keyword = str;
        this.icon = urlModel;
        this.authorLink = urlModel2;
    }
}
