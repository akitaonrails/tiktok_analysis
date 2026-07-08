package com.ss.android.ugc.aweme.sidebar.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SideBarListItemIconUrl {

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public SideBarListItemIconUrl() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideBarListItemIconUrl)) {
            return false;
        }
        SideBarListItemIconUrl sideBarListItemIconUrl = (SideBarListItemIconUrl) obj;
        return Intrinsics.LJFF(this.uri, sideBarListItemIconUrl.uri) && Intrinsics.LJFF(this.urlList, sideBarListItemIconUrl.urlList) && Intrinsics.LJFF(this.width, sideBarListItemIconUrl.width) && Intrinsics.LJFF(this.height, sideBarListItemIconUrl.height);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public SideBarListItemIconUrl(String str, List<String> list, Integer num, Integer num2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
