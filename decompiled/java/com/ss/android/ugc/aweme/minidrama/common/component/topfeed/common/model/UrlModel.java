package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class UrlModel {

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        return Intrinsics.LJFF(this.uri, urlModel.uri) && Intrinsics.LJFF(this.urlList, urlModel.urlList) && Intrinsics.LJFF(this.width, urlModel.width) && Intrinsics.LJFF(this.height, urlModel.height) && Intrinsics.LJFF(this.urlKey, urlModel.urlKey);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.urlKey;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public UrlModel(String str, List<String> list, Integer num, Integer num2, String str2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
    }
}
