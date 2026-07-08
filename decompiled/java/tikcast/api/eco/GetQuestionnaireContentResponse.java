package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetQuestionnaireContentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("questions")
        public List<Question> questions = new ArrayList();

        public static final class Question {

            @C09CT("question_id")
            public long questionId;

            @C09CT("question_type")
            public int questionType;

            @C09CT("required")
            public boolean required;

            @C09CT("question_content")
            public String questionContent = "";

            @C09CT("answers")
            public List<String> answers = new ArrayList();

            @C09CT("cascade_answers")
            public List<CascadeValue> cascadeAnswers = new ArrayList();

            @C09CT("display_value")
            public String displayValue = "";
        }
    }
}
