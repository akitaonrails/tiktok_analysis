package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorPreFinishData {

    @C09CT("confirm_box")
    public ConfirmBox confirmBox;

    @C09CT("finish_type")
    public int finishType;

    @C09CT("metrics_map")
    public Map<String, String> metricsMap = new LinkedHashMap();

    @C09CT("suggestion_template_id")
    public long suggestionTemplateId;

    /* JADX INFO: loaded from: classes13.dex */
    public static final class ConfirmBox {

        @C09CT("value")
        public long value;

        @C09CT("title")
        public String title = "";

        @C09CT("schema_title")
        public String schemaTitle = "";

        @C09CT("unique_id")
        public String uniqueId = "";

        @C09CT("content")
        public String content = "";

        @C09CT("confirm_text")
        public String confirmText = "";

        @C09CT("cancel_text")
        public String cancelText = "";

        @C09CT("schema_jump_link")
        public String schemaJumpLink = "";
    }
}
