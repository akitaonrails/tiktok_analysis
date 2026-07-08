package com.ss.android.ugc.aweme.creatoredit;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class CreatorCaptionEditData implements Serializable {

    @C09CT("end_time")
    public final int endTime;

    @C09CT("gender")
    public final String gender;

    @C09CT("source_text")
    public final String sourceText;

    @C09CT("start_time")
    public final int startTime;

    @C09CT("text")
    public String text;

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getSourceText() {
        return this.sourceText;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public CreatorCaptionEditData(int i, int i2, String str, String str2, String str3) {
        this.startTime = i;
        this.endTime = i2;
        this.text = str;
        this.gender = str2;
        this.sourceText = str3;
    }
}
