package com.bytedance.android.livesdk.survey.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SurveyOption {
    public int LIZ = -1;

    @C09CT("content")
    public String content;

    @C09CT("emoji_id")
    public String emojiId;

    @C09CT("main_title")
    public String mainTitle;

    @C09CT("option_id")
    public long optionId;

    @C09CT("second_list")
    public List<SurveySecondQuestion> secondList;

    @C09CT("sub_title")
    public String subTitle;
}
