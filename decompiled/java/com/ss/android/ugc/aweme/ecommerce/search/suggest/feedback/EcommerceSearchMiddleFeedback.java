package com.ss.android.ugc.aweme.ecommerce.search.suggest.feedback;

import X.C09CT;
import X.C0C64;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcommerceSearchMiddleFeedback {
    public static final FeedbackQuestion[] LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final FeedbackModel LIZLLL;

    static {
        FeedbackQuestion[] feedbackQuestionArr = {new FeedbackQuestion(2, "text", "Inappropriate word content"), new FeedbackQuestion(3, "image", "Inappropriate image content"), new FeedbackQuestion(4, "image", "Image is cluttered or unclear"), new FeedbackQuestion(5, "text", "Word has spelling or grammar errors"), new FeedbackQuestion(1, "text", "Not interested in this word")};
        LIZ = feedbackQuestionArr;
        LIZIZ = "Feedback";
        LIZJ = "Thanks for your feedback";
        LIZLLL = new FeedbackModel(feedbackQuestionArr, "Feedback", "Thanks for your feedback");
    }

    public static FeedbackModel LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FeedbackModel feedbackModel = LIZLLL;
        FeedbackModel feedbackModel2 = (FeedbackModel) c0c64LJIILLIIL.LJJII(FeedbackModel.class, feedbackModel, "ec_search_middle_feedback", true);
        return feedbackModel2 != null ? feedbackModel2 : feedbackModel;
    }

    public static final class FeedbackModel implements Serializable {

        @C09CT("questions")
        public final FeedbackQuestion[] questions;

        @C09CT("title")
        public final String title;

        @C09CT("toast")
        public final String toast;

        public FeedbackModel() {
            this(null, null, null);
        }

        public final FeedbackQuestion[] LIZ() {
            return this.questions;
        }

        public final String LIZIZ() {
            return this.title;
        }

        public final String LIZJ() {
            return this.toast;
        }

        public FeedbackModel(FeedbackQuestion[] feedbackQuestionArr, String str, String str2) {
            this.questions = feedbackQuestionArr;
            this.title = str;
            this.toast = str2;
        }
    }

    public static final class FeedbackQuestion implements Serializable {
        public static final int $stable = 0;

        @C09CT("index")
        public final Integer index;

        @C09CT("type")
        public final String type;

        @C09CT("value")
        public final String value;

        public FeedbackQuestion() {
            this(null, null, null);
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public FeedbackQuestion(Integer num, String str, String str2) {
            this.index = num;
            this.type = str;
            this.value = str2;
        }
    }
}
