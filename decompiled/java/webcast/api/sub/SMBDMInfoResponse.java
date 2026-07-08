package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.DirectMessageScopeV2Settings;
import com.bytedance.android.livesdk.chatroom.api.SMBChatPromptTemplate;
import com.bytedance.android.livesdk.chatroom.api.SMBKeywordReplyTemplate;
import com.bytedance.android.livesdk.chatroom.api.UpsellDMTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBDMInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("business_inbox_enabled")
        public boolean businessInboxEnabled;

        @C09CT("dm_intent_switch_enabled")
        public boolean dmIntentSwitchEnabled;

        @C09CT("dm_intent_switch_status")
        public int dmIntentSwitchStatus;

        @C09CT("scope")
        public int scope;

        @C09CT("scope_v2")
        public DirectMessageScopeV2Settings scopeV2;

        @C09CT("question_template_list")
        public List<UpsellDMTemplate> questionTemplateList = new ArrayList();

        @C09CT("welcome_message_template_list")
        public List<UpsellDMTemplate> welcomeMessageTemplateList = new ArrayList();

        @C09CT("suggested_question_template_list")
        public List<UpsellDMTemplate> suggestedQuestionTemplateList = new ArrayList();

        @C09CT("dm_schema")
        public String dmSchema = "";

        @C09CT("chat_prompt_template_list")
        public List<SMBChatPromptTemplate> chatPromptTemplateList = new ArrayList();

        @C09CT("keyword_reply_template_list")
        public List<SMBKeywordReplyTemplate> keywordReplyTemplateList = new ArrayList();
    }
}
