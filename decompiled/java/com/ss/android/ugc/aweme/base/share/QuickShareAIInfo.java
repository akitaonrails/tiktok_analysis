package com.ss.android.ugc.aweme.base.share;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickShareAIInfo implements Serializable {

    @C09CT("candidate_list")
    public List<QuickShareCandidate> candidateList;

    @C09CT("enable_show")
    public Boolean enableShow;

    @C09CT("recall_type")
    public Integer recallType;

    @C09CT("share_rate")
    public Float shareRate;

    @C09CT("share_rec_extra")
    public String shareRecExtra;

    @C09CT("show_by_candidate_score")
    public String showByCandidateScore;

    public QuickShareAIInfo() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareAIInfo(shareRate=");
        sbLIZ.append(this.shareRate);
        sbLIZ.append(", recallType=");
        sbLIZ.append(this.recallType);
        sbLIZ.append(", shareRecExtra=");
        sbLIZ.append(this.shareRecExtra);
        sbLIZ.append(", enableShow=");
        sbLIZ.append(this.enableShow);
        sbLIZ.append(", candidateList=");
        sbLIZ.append(this.candidateList);
        sbLIZ.append(", showByCandidateScore=");
        sbLIZ.append(this.showByCandidateScore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickShareAIInfo(Float f, Integer num, String str, Boolean bool, List<QuickShareCandidate> list, String str2) {
        this.shareRate = f;
        this.recallType = num;
        this.shareRecExtra = str;
        this.enableShow = bool;
        this.candidateList = list;
        this.showByCandidateScore = str2;
    }
}
