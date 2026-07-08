package com.ss.android.ugc.aweme.poi.thirdparty.exp;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PoiThirdPartyRecordingViewRule {

    @C09CT("page_name")
    public final String pageName;

    @C09CT("url_regex")
    public final List<String> urlRegex;

    public PoiThirdPartyRecordingViewRule() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiThirdPartyRecordingViewRule)) {
            return false;
        }
        PoiThirdPartyRecordingViewRule poiThirdPartyRecordingViewRule = (PoiThirdPartyRecordingViewRule) obj;
        return Intrinsics.LJFF(this.pageName, poiThirdPartyRecordingViewRule.pageName) && Intrinsics.LJFF(this.urlRegex, poiThirdPartyRecordingViewRule.urlRegex);
    }

    public final int hashCode() {
        String str = this.pageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlRegex;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiThirdPartyRecordingViewRule(pageName=");
        sbLIZ.append(this.pageName);
        sbLIZ.append(", urlRegex=");
        sbLIZ.append(this.urlRegex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiThirdPartyRecordingViewRule(String str, List<String> list) {
        this.pageName = str;
        this.urlRegex = list;
    }
}
