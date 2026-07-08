package com.ss.android.ugc.aweme.tako.ccl.model.request;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class ExtraRequestInfo {
    public final transient Map<String, Object> LIZ;
    public final transient Long LIZIZ;
    public final transient Long LIZJ;
    public final transient boolean LIZLLL;

    @C09CT("search_card_summary")
    public final String searchCardSummary;

    @C09CT("smart_search_card_answer")
    public final String smartSearchCardAnswer;

    @C09CT("smart_search_card_query")
    public final String smartSearchCardQuery;

    public ExtraRequestInfo() {
        this(null, null, null, null, null, null, false);
    }

    public final int hashCode() {
        String str = this.searchCardSummary;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.smartSearchCardQuery;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.smartSearchCardAnswer;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Object> map = this.LIZ;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.LIZIZ;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        return ((iHashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraRequestInfo(searchCardSummary=");
        sbLIZ.append(this.searchCardSummary);
        sbLIZ.append(", smartSearchCardQuery=");
        sbLIZ.append(this.smartSearchCardQuery);
        sbLIZ.append(", smartSearchCardAnswer=");
        sbLIZ.append(this.smartSearchCardAnswer);
        sbLIZ.append(", paramsMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoSugMsgId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoSugQueryMsgId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromVideoSug=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static ExtraRequestInfo LIZ(ExtraRequestInfo extraRequestInfo, Map map) {
        return new ExtraRequestInfo(extraRequestInfo.searchCardSummary, extraRequestInfo.smartSearchCardQuery, extraRequestInfo.smartSearchCardAnswer, map, extraRequestInfo.LIZIZ, extraRequestInfo.LIZJ, extraRequestInfo.LIZLLL);
    }

    public ExtraRequestInfo(String str, String str2, String str3, Map<String, Object> map, Long l, Long l2, boolean z) {
        this.searchCardSummary = str;
        this.smartSearchCardQuery = str2;
        this.smartSearchCardAnswer = str3;
        this.LIZ = map;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = z;
    }
}
