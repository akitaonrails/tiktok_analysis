package com.ss.android.ugc.aweme.feed.survey.frequency;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.prompt.LocalPromptOption;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public final class FeedbackSurveyLocalData {

    @C09CT("adjust_entrance")
    public final String adjustEntrance;

    @C09CT("adjust_type")
    public final String adjustType;

    @C09CT("content")
    public final String content;

    @C09CT("date")
    public final int date;

    @C09CT("end")
    public final int end;

    @C09CT("from_awemeId")
    public final String fromAwemeId;

    @C09CT("instruction_ids")
    public final String instructions;

    @C09CT("local_prompt_option_list")
    public final ArrayList<LocalPromptOption> localPromptOptionList;

    @C09CT("count")
    public final int position;

    @C09CT("start")
    public final int start;

    @C09CT("survey_key")
    public final String surveyKey;

    public FeedbackSurveyLocalData() {
        this("", "", "", "", null, -1, -1, -1, -1, "", "");
    }

    public FeedbackSurveyLocalData(String str, String str2, String str3, String str4, ArrayList<LocalPromptOption> arrayList, int i, int i2, int i3, int i4, String str5, String str6) {
        this.instructions = str;
        this.surveyKey = str2;
        this.content = str3;
        this.fromAwemeId = str4;
        this.localPromptOptionList = arrayList;
        this.position = i;
        this.date = i2;
        this.start = i3;
        this.end = i4;
        this.adjustType = str5;
        this.adjustEntrance = str6;
    }
}
