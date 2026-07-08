package com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class RefWebDoc implements Serializable {

    @C09CT("icon_uri")
    public final String webIcon;

    @C09CT("link_url")
    public final String webLink;

    @C09CT("name")
    public final String webName;

    @C09CT("summary")
    public final String webSummary;

    @C09CT("title")
    public final String webTitle;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefWebDoc)) {
            return false;
        }
        RefWebDoc refWebDoc = (RefWebDoc) obj;
        return Intrinsics.LJFF(this.webName, refWebDoc.webName) && Intrinsics.LJFF(this.webTitle, refWebDoc.webTitle) && Intrinsics.LJFF(this.webSummary, refWebDoc.webSummary) && Intrinsics.LJFF(this.webLink, refWebDoc.webLink) && Intrinsics.LJFF(this.webIcon, refWebDoc.webIcon);
    }

    public int hashCode() {
        String str = this.webName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.webTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webSummary;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webLink;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webIcon;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefWebDoc(webName=");
        sbLIZ.append(this.webName);
        sbLIZ.append(", webTitle=");
        sbLIZ.append(this.webTitle);
        sbLIZ.append(", webSummary=");
        sbLIZ.append(this.webSummary);
        sbLIZ.append(", webLink=");
        sbLIZ.append(this.webLink);
        sbLIZ.append(", webIcon=");
        sbLIZ.append(this.webIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RefWebDoc(String str, String str2, String str3, String str4, String str5) {
        this.webName = str;
        this.webTitle = str2;
        this.webSummary = str3;
        this.webLink = str4;
        this.webIcon = str5;
    }
}
