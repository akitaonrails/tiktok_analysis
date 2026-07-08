package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUserFeedbackSettings {
    public static final /* synthetic */ int LIZ = 0;

    public static final class Feedback implements Serializable {
        public static final int $stable = 8;

        @C09CT("search_type")
        public String searchType = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("schemaParams")
        public final Map<String, String> schemaParams = new LinkedHashMap();

        public final String getSchema() {
            return this.schema;
        }

        public final Map<String, String> getSchemaParams() {
            return this.schemaParams;
        }

        public final String getSearchType() {
            return this.searchType;
        }

        public final void setSchema(String str) {
            this.schema = str;
        }

        public final void setSearchType(String str) {
            this.searchType = str;
        }
    }

    public static final class FeedbackList implements Serializable {
        public static final int $stable = 8;

        @C09CT("feedback_list")
        public List<Feedback> feedbackList = new ArrayList();

        @C09CT("satisfaction_survey_schema")
        public String satisfactionSurveySchema;

        public final List<Feedback> getFeedbackList() {
            return this.feedbackList;
        }

        public final String getSatisfactionSurveySchema() {
            return this.satisfactionSurveySchema;
        }

        public final void setFeedbackList(List<Feedback> list) {
            this.feedbackList = list;
        }

        public final void setSatisfactionSurveySchema(String str) {
            this.satisfactionSurveySchema = str;
        }
    }

    public static final Feedback LIZ(String str) {
        List<Feedback> feedbackList;
        FeedbackList feedbackList2 = (FeedbackList) SettingsManager.LIZLLL().LJIIIIZZ("search_user_feedback", FeedbackList.class, null);
        if (feedbackList2 != null && (feedbackList = feedbackList2.getFeedbackList()) != null) {
            for (Feedback feedback : feedbackList) {
                if (Intrinsics.LJFF(feedback.getSearchType(), str)) {
                    return feedback;
                }
            }
        }
        return null;
    }
}
