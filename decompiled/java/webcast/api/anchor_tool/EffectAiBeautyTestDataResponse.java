package webcast.api.anchor_tool;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class EffectAiBeautyTestDataResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_finished")
        public boolean isFinished;

        @C09CT("task_id")
        public long taskId;

        @C09CT("unique_key")
        public String uniqueKey = "";

        @C09CT("suggested_beauty_setting")
        public String suggestedBeautySetting = "";

        @C09CT("img_url")
        public String imgUrl = "";
    }
}
