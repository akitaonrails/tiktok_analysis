package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EcSearchBatchDiversionRequestParams {

    @C09CT("ecom_user_actions")
    public final String ecomUserActions;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("history_search_word_list")
    public final List<String> historySearchWordList;

    @C09CT("shop_tab_position")
    public final Integer shopTabPosition;

    @C09CT("video_info_list")
    public final List<EcSearchDiversionVideoInfo> videoInfoList;

    public EcSearchBatchDiversionRequestParams() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchBatchDiversionRequestParams)) {
            return false;
        }
        EcSearchBatchDiversionRequestParams ecSearchBatchDiversionRequestParams = (EcSearchBatchDiversionRequestParams) obj;
        return Intrinsics.LJFF(this.videoInfoList, ecSearchBatchDiversionRequestParams.videoInfoList) && Intrinsics.LJFF(this.shopTabPosition, ecSearchBatchDiversionRequestParams.shopTabPosition) && Intrinsics.LJFF(this.ecomUserActions, ecSearchBatchDiversionRequestParams.ecomUserActions) && Intrinsics.LJFF(this.historySearchWordList, ecSearchBatchDiversionRequestParams.historySearchWordList) && Intrinsics.LJFF(this.enterFrom, ecSearchBatchDiversionRequestParams.enterFrom);
    }

    public final int hashCode() {
        List<EcSearchDiversionVideoInfo> list = this.videoInfoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.shopTabPosition;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.ecomUserActions;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.historySearchWordList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.enterFrom;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBatchDiversionRequestParams(videoInfoList=");
        sbLIZ.append(this.videoInfoList);
        sbLIZ.append(", shopTabPosition=");
        sbLIZ.append(this.shopTabPosition);
        sbLIZ.append(", ecomUserActions=");
        sbLIZ.append(this.ecomUserActions);
        sbLIZ.append(", historySearchWordList=");
        sbLIZ.append(this.historySearchWordList);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchBatchDiversionRequestParams(List<EcSearchDiversionVideoInfo> list, Integer num, String str, List<String> list2, String str2) {
        this.videoInfoList = list;
        this.shopTabPosition = num;
        this.ecomUserActions = str;
        this.historySearchWordList = list2;
        this.enterFrom = str2;
    }
}
