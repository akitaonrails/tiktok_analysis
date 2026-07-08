package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.k;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TabChangeInfluencingFactors {

    @C09CT("ab_exp_info")
    public final k abExpInfo;

    @C09CT("ab_exp_vid_info")
    public k abExpVidInfo;

    @C09CT("common_log_id")
    public String commonLogId;

    @C09CT("tab_personalize_tab_change")
    public final k tabPersonalizeTabChange;

    @C09CT("tab_req_info")
    public final k tabReqInfo;

    @C09CT("tab_server_filter_res")
    public final Map<String, Map<String, Boolean>> tabServerFilterResult;

    @C09CT("user_id")
    public final String userId;

    public TabChangeInfluencingFactors() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabChangeInfluencingFactors)) {
            return false;
        }
        TabChangeInfluencingFactors tabChangeInfluencingFactors = (TabChangeInfluencingFactors) obj;
        return Intrinsics.LJFF(this.abExpInfo, tabChangeInfluencingFactors.abExpInfo) && Intrinsics.LJFF(this.abExpVidInfo, tabChangeInfluencingFactors.abExpVidInfo) && Intrinsics.LJFF(this.commonLogId, tabChangeInfluencingFactors.commonLogId) && Intrinsics.LJFF(this.tabReqInfo, tabChangeInfluencingFactors.tabReqInfo) && Intrinsics.LJFF(this.tabServerFilterResult, tabChangeInfluencingFactors.tabServerFilterResult) && Intrinsics.LJFF(this.tabPersonalizeTabChange, tabChangeInfluencingFactors.tabPersonalizeTabChange) && Intrinsics.LJFF(this.userId, tabChangeInfluencingFactors.userId);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabChangeInfluencingFactors(abExpInfo=");
        sbLIZ.append(this.abExpInfo);
        sbLIZ.append(", abExpVidInfo=");
        sbLIZ.append(this.abExpVidInfo);
        sbLIZ.append(", commonLogId=");
        sbLIZ.append(this.commonLogId);
        sbLIZ.append(", tabReqInfo=");
        sbLIZ.append(this.tabReqInfo);
        sbLIZ.append(", tabServerFilterResult=");
        sbLIZ.append(this.tabServerFilterResult);
        sbLIZ.append(", tabPersonalizeTabChange=");
        sbLIZ.append(this.tabPersonalizeTabChange);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabChangeInfluencingFactors(k kVar, k kVar2, String str, k kVar3, Map<String, ? extends Map<String, Boolean>> map, k kVar4, String str2) {
        this.abExpInfo = kVar;
        this.abExpVidInfo = kVar2;
        this.commonLogId = str;
        this.tabReqInfo = kVar3;
        this.tabServerFilterResult = map;
        this.tabPersonalizeTabChange = kVar4;
        this.userId = str2;
    }
}
