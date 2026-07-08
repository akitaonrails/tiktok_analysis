package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class UrlModel extends BaseResponse implements Serializable {

    @C09CT("height")
    public final int height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final int width;

    public final UrlModel copy(String str, List<String> list, int i, int i2, String str2) {
        return new UrlModel(str, list, i, i2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        return Intrinsics.LJFF(this.uri, urlModel.uri) && Intrinsics.LJFF(this.urlList, urlModel.urlList) && this.width == urlModel.width && this.height == urlModel.height && Intrinsics.LJFF(this.urlKey, urlModel.urlKey);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.width) * 31) + this.height) * 31;
        String str2 = this.urlKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlModel(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", urlKey=");
        sbLIZ.append(this.urlKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrlKey() {
        return this.urlKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public UrlModel(String str, List<String> list, int i, int i2, String str2) {
        this.uri = str;
        this.urlList = list;
        this.width = i;
        this.height = i2;
        this.urlKey = str2;
    }
}
