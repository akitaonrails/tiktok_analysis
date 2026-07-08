package webcast.api.anchor_tool;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EffectBeautySuggestionResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("continue_suggest")
        public boolean continueSuggest;

        @C09CT("status_code")
        public int statusCode;

        @C09CT("suggest_result_type")
        public int suggestResultType;

        @C09CT("suggested_beauty_setting")
        public String suggestedBeautySetting = "";

        @C09CT("unique_key")
        public String uniqueKey = "";
    }
}
