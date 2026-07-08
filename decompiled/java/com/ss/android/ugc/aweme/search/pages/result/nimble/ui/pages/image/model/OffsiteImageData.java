package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model;

import X.C09CT;
import X.C0QCI;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class OffsiteImageData implements Serializable {
    public static final C0QCI Companion = new Object() { // from class: X.0QCI
    };

    @C09CT("declaimer")
    public final String declaimer;

    @C09CT("favicon")
    public final String favicon;

    @C09CT("height")
    public final Integer height;

    @C09CT("offsite_type")
    public final int offsiteType;

    @C09CT("root_url")
    public final String rootUrl;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    @C09CT("web_url")
    public final String webUrl;

    @C09CT("width")
    public final Integer width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsiteImageData)) {
            return false;
        }
        OffsiteImageData offsiteImageData = (OffsiteImageData) obj;
        return Intrinsics.LJFF(this.url, offsiteImageData.url) && Intrinsics.LJFF(this.title, offsiteImageData.title) && Intrinsics.LJFF(this.favicon, offsiteImageData.favicon) && Intrinsics.LJFF(this.webUrl, offsiteImageData.webUrl) && Intrinsics.LJFF(this.rootUrl, offsiteImageData.rootUrl) && Intrinsics.LJFF(this.width, offsiteImageData.width) && Intrinsics.LJFF(this.height, offsiteImageData.height) && this.offsiteType == offsiteImageData.offsiteType && Intrinsics.LJFF(this.declaimer, offsiteImageData.declaimer);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.favicon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rootUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode7 = (((iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.offsiteType) * 31;
        String str6 = this.declaimer;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OffsiteImageData(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", favicon=");
        sbLIZ.append(this.favicon);
        sbLIZ.append(", webUrl=");
        sbLIZ.append(this.webUrl);
        sbLIZ.append(", rootUrl=");
        sbLIZ.append(this.rootUrl);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", offsiteType=");
        sbLIZ.append(this.offsiteType);
        sbLIZ.append(", declaimer=");
        sbLIZ.append(this.declaimer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OffsiteImageData(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i, String str6) {
        this.url = str;
        this.title = str2;
        this.favicon = str3;
        this.webUrl = str4;
        this.rootUrl = str5;
        this.width = num;
        this.height = num2;
        this.offsiteType = i;
        this.declaimer = str6;
    }
}
