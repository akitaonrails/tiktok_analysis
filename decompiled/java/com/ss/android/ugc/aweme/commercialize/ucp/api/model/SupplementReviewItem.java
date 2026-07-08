package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SupplementReviewItem implements Serializable {

    @C09CT("author")
    public final String author;

    @C09CT("content")
    public final String content;

    @C09CT("pics")
    public final SupplementReviewPics pics;

    @C09CT("star")
    public final Double star;

    @C09CT("star_str")
    public final String starStr;

    @C09CT("timestamp")
    public final String timestamp;

    public SupplementReviewItem() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupplementReviewItem)) {
            return false;
        }
        SupplementReviewItem supplementReviewItem = (SupplementReviewItem) obj;
        return Intrinsics.LJFF(this.author, supplementReviewItem.author) && Intrinsics.LJFF(this.content, supplementReviewItem.content) && Intrinsics.LJFF(this.star, supplementReviewItem.star) && Intrinsics.LJFF(this.starStr, supplementReviewItem.starStr) && Intrinsics.LJFF(this.timestamp, supplementReviewItem.timestamp) && Intrinsics.LJFF(this.pics, supplementReviewItem.pics);
    }

    public int hashCode() {
        String str = this.author;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.star;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.starStr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timestamp;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SupplementReviewPics supplementReviewPics = this.pics;
        return iHashCode5 + (supplementReviewPics != null ? supplementReviewPics.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupplementReviewItem(author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", star=");
        sbLIZ.append(this.star);
        sbLIZ.append(", starStr=");
        sbLIZ.append(this.starStr);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", pics=");
        sbLIZ.append(this.pics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getImages() {
        List<String> list;
        SupplementReviewPics supplementReviewPics = this.pics;
        return (supplementReviewPics == null || (list = supplementReviewPics.image) == null) ? C13BV.INSTANCE : list;
    }

    public SupplementReviewItem(String str, String str2, Double d, String str3, String str4, SupplementReviewPics supplementReviewPics) {
        this.author = str;
        this.content = str2;
        this.star = d;
        this.starStr = str3;
        this.timestamp = str4;
        this.pics = supplementReviewPics;
    }
}
