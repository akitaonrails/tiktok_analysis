package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxUrlModel {

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public ExploreLynxUrlModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxUrlModel)) {
            return false;
        }
        ExploreLynxUrlModel exploreLynxUrlModel = (ExploreLynxUrlModel) obj;
        return Intrinsics.LJFF(this.uri, exploreLynxUrlModel.uri) && Intrinsics.LJFF(this.urlList, exploreLynxUrlModel.urlList) && Intrinsics.LJFF(this.width, exploreLynxUrlModel.width) && Intrinsics.LJFF(this.height, exploreLynxUrlModel.height);
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

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxUrlModel(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxUrlModel(String str, List<String> list, Integer num, Integer num2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
