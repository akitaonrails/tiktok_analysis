package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedPromptStruct implements Serializable {

    @C09CT("instruction_status")
    public int instructionStatus;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status = -1;

    @C09CT("survey_key")
    public String surveyKey = "";

    public final int getInstructionStatus() {
        return this.instructionStatus;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getSurveyKey() {
        return this.surveyKey;
    }

    public final void setInstructionStatus(int i) {
        this.instructionStatus = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSurveyKey(String str) {
        this.surveyKey = str;
    }
}
