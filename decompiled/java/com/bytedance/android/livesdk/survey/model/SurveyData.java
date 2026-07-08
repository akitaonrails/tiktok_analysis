package com.bytedance.android.livesdk.survey.model;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SurveyData {

    @C09CT("background_audio")
    public String backgroundAudio;

    @C09CT("background_audio_length")
    public long backgroundAudioLength;

    @C09CT("background_video")
    public String backgroundVideo;

    @C09CT("background_video_length")
    public long backgroundVideoLength;

    @C09CT("empty_reason_enum")
    public int emptyReasonEnum;

    @C09CT("feed_back")
    public String feedBack;

    @C09CT("is_reverse")
    public boolean isReverse;

    @C09CT("question_list")
    public List<SurveyQuestion> questionList;

    @C09CT("show_mode")
    public SurveyShowMode showMode;

    @C09CT("survey_id")
    public String surveyId;

    @C09CT("survey_tag")
    public String surveyTag;

    @C09CT("survey_version")
    public long surveyVersion;

    @C09CT("toast_text")
    public String toastText;

    public final SurveyQuestion LIZ() {
        List<SurveyQuestion> list = this.questionList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (SurveyQuestion) ListProtector.get(this.questionList, 0);
    }
}
