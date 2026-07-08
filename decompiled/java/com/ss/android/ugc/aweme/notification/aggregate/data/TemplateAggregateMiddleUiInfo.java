package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateAggregateMiddleUiInfo {

    @C09CT("content")
    public final String content;

    @C09CT("scheme_url")
    public final String schemeUrl;

    @C09CT("title")
    public final String title;

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schemeUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateAggregateMiddleUiInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", schemeUrl=");
        sbLIZ.append(this.schemeUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateAggregateMiddleUiInfo(String str, String str2, String str3) {
        this.title = str;
        this.content = str2;
        this.schemeUrl = str3;
    }
}
