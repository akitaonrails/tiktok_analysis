package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model;

import X.C09CT;
import X.C0QAH;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class InsiteImageData implements Serializable {
    public static final C0QAH Companion = new Object() { // from class: X.0QAH
    };

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("aweme_data")
    public final Aweme awemeData;

    @C09CT("cut_time")
    public final Double cutTime;

    @C09CT("height")
    public final Integer height;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("index")
    public final Integer index;

    @C09CT("insite_type")
    public final Integer insiteType;

    @C09CT("search_aweme_info")
    public final SearchAwemeInfo searchAwemeInfo;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public final InsiteImageData copy(Integer num, Aweme aweme, SearchAwemeInfo searchAwemeInfo, String str, Double d, Integer num2, Integer num3, Integer num4, String str2, String str3) {
        return new InsiteImageData(num, aweme, searchAwemeInfo, str, d, num2, num3, num4, str2, str3);
    }

    public int hashCode() {
        Integer num = this.insiteType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Aweme aweme = this.awemeData;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        SearchAwemeInfo searchAwemeInfo = this.searchAwemeInfo;
        int iHashCode3 = (iHashCode2 + (searchAwemeInfo == null ? 0 : searchAwemeInfo.hashCode())) * 31;
        String str = this.url;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.cutTime;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.index;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.width;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.aid;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageId;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsiteImageData(insiteType=");
        sbLIZ.append(this.insiteType);
        sbLIZ.append(", awemeData=");
        sbLIZ.append(this.awemeData);
        sbLIZ.append(", searchAwemeInfo=");
        sbLIZ.append(this.searchAwemeInfo);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", cutTime=");
        sbLIZ.append(this.cutTime);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", imageId=");
        sbLIZ.append(this.imageId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsiteImageData(Integer num, Aweme aweme, SearchAwemeInfo searchAwemeInfo, String str, Double d, Integer num2, Integer num3, Integer num4, String str2, String str3) {
        this.insiteType = num;
        this.awemeData = aweme;
        this.searchAwemeInfo = searchAwemeInfo;
        this.url = str;
        this.cutTime = d;
        this.index = num2;
        this.width = num3;
        this.height = num4;
        this.aid = str2;
        this.imageId = str3;
    }
}
