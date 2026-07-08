package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SurveyListV2Response {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public SurveyListExtra extra;

    public static final class ResponseData {

        @C09CT("background_audio_length")
        public long backgroundAudioLength;

        @C09CT("background_video_length")
        public long backgroundVideoLength;

        @C09CT("empty_reason_enum")
        public long emptyReasonEnum;

        @C09CT("is_reverse")
        public boolean isReverse;

        @C09CT("show_mode")
        public ShowMode showMode;

        @C09CT("survey_version")
        public int surveyVersion;

        @C09CT("survey_id")
        public String surveyId = "";

        @C09CT("question_list")
        public List<Question> questionList = new ArrayList();

        @C09CT("feed_back")
        public String feedBack = "";

        @C09CT("background_video")
        public String backgroundVideo = "";

        @C09CT("background_audio")
        public String backgroundAudio = "";

        @C09CT("survey_tag")
        public String surveyTag = "";

        @C09CT("toast_text")
        public String toastText = "";

        public static final class Option {

            @C09CT("is_other")
            public boolean isOther;

            @C09CT("option_id")
            public long optionId;

            @C09CT("content")
            public String content = "";

            @C09CT("second_list")
            public List<Option> secondList = new ArrayList();

            @C09CT("main_title")
            public String mainTitle = "";

            @C09CT("sub_title")
            public String subTitle = "";

            @C09CT("emoji_id")
            public String emojiId = "";
        }

        public static final class Question {

            @C09CT("type")
            public int type;

            @C09CT("question_id")
            public String questionId = "";

            @C09CT("title")
            public String title = "";

            @C09CT("option_list")
            public List<Option> optionList = new ArrayList();
        }

        public static final class ShowMode {

            @C09CT("cep_backup_trigger_type")
            public long cepBackupTriggerType;

            @C09CT("delay")
            public long delay;

            @C09CT("light_survey_emoji_style")
            public long lightSurveyEmojiStyle;

            @C09CT("light_survey_style")
            public long lightSurveyStyle;

            @C09CT("show_duration_ms")
            public long showDurationMs;

            @C09CT("stay_time")
            public long stayTime;

            @C09CT("style")
            public int style;

            @C09CT("trigger_by_cep")
            public boolean triggerByCep;

            @C09CT("trigger_type")
            public int triggerType;

            @C09CT("filter_expression")
            public String filterExpression = "";

            @C09CT("cep_expression")
            public String cepExpression = "";

            @C09CT("trigger_need_feature_keys")
            public List<String> triggerNeedFeatureKeys = new ArrayList();

            @C09CT("filter_need_feature_keys")
            public List<String> filterNeedFeatureKeys = new ArrayList();
        }
    }

    public static final class SurveyListExtra {

        @C09CT("now")
        public long now;
    }
}
