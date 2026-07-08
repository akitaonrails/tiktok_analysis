package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class CsiBotData implements Serializable {
    public static final int $stable = 8;

    @C09CT("about_schema")
    public String aboutSchema;

    @C09CT("feedback_schema")
    public String feedbackSchema;

    @C09CT("inspiration_session_id")
    public String inspirationSessionId;

    @C09CT("tagId")
    public String tagId;

    public CsiBotData() {
        this(null, null, null, null);
    }

    public final void setAboutSchema(String str) {
        this.aboutSchema = str;
    }

    public final void setFeedbackSchema(String str) {
        this.feedbackSchema = str;
    }

    public final void setInspirationSessionId(String str) {
        this.inspirationSessionId = str;
    }

    public final void setTagId(String str) {
        this.tagId = str;
    }

    public CsiBotData(String str, String str2, String str3, String str4) {
        this.feedbackSchema = str;
        this.aboutSchema = str2;
        this.inspirationSessionId = str3;
        this.tagId = str4;
    }
}
