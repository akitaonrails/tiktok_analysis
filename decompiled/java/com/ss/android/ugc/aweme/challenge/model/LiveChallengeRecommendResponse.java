package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LiveChallengeRecommendResponse {

    @C09CT("challenge_list")
    public List<LiveChallenge> liveChallenges;

    @C09CT("status_code")
    public int statusCode;

    public List<LiveChallenge> getLiveChallenges() {
        return this.liveChallenges;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setLiveChallenges(List<LiveChallenge> list) {
        this.liveChallenges = list;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
