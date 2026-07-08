package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemAsset {

    @C09CT("height")
    public Float height;

    @C09CT("img_url_list")
    public List<String> imgUrlList;

    @C09CT("svg_string")
    public String svgString;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Float width;

    public FixedItemAsset() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemAsset)) {
            return false;
        }
        FixedItemAsset fixedItemAsset = (FixedItemAsset) obj;
        return Intrinsics.LJFF(this.imgUrlList, fixedItemAsset.imgUrlList) && Intrinsics.LJFF(this.urlList, fixedItemAsset.urlList) && Intrinsics.LJFF(this.svgString, fixedItemAsset.svgString) && Intrinsics.LJFF(this.width, fixedItemAsset.width) && Intrinsics.LJFF(this.height, fixedItemAsset.height);
    }

    public final int hashCode() {
        List<String> list = this.imgUrlList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.urlList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.svgString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.width;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        return iHashCode4 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemAsset(imgUrlList=");
        sbLIZ.append(this.imgUrlList);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", svgString=");
        sbLIZ.append(this.svgString);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        String next;
        List<String> list = this.imgUrlList;
        String str = null;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String str2 = next;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    break;
                }
            }
            String str3 = next;
            if (str3 != null) {
                return str3;
            }
        }
        List<String> list2 = this.urlList;
        if (list2 == null) {
            return null;
        }
        Iterator<String> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            String next2 = it3.next();
            String str4 = next2;
            if (str4 != null && !a0.LJJJIL(str4)) {
                str = next2;
                break;
            }
        }
        return str;
    }

    public final boolean LIZ() {
        String strLIZIZ = LIZIZ();
        return !(strLIZIZ == null || a0.LJJJIL(strLIZIZ));
    }

    public FixedItemAsset(List<String> list, List<String> list2, String str, Float f, Float f2) {
        this.imgUrlList = list;
        this.urlList = list2;
        this.svgString = str;
        this.width = f;
        this.height = f2;
    }
}
