package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public class ChallengeCreateResponse {

    @C09CT("challenge_id")
    public long challengeId;

    @C09CT("challenge_name")
    public String challengeName;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public long getChallengeId() {
        return this.challengeId;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public void setChallengeId(long j) {
        this.challengeId = j;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
