package com.ss.android.ugc.aweme.ad.feed.candidate;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CandidateResponse extends BaseResponse implements Serializable {

    @C09CT("aweme_list")
    public final List<Aweme> candidateList;

    @C09CT("sati_param_for_pitaya")
    public final String satiParamForPitaya;

    public CandidateResponse() {
        this(null, "");
    }

    public final List<Aweme> getCandidateList() {
        return this.candidateList;
    }

    public final String getSatiParamForPitaya() {
        return this.satiParamForPitaya;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CandidateResponse(List<? extends Aweme> list, String str) {
        this.candidateList = list;
        this.satiParamForPitaya = str;
    }
}
