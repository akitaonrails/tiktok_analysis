package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.DirectMessageScopeV2Settings;
import com.bytedance.android.livesdk.chatroom.api.UpsellActionBarTemplate;
import com.bytedance.android.livesdk.chatroom.api.UpsellConsultationContent;
import com.bytedance.android.livesdk.chatroom.api.UpsellDMTemplate;
import com.bytedance.android.livesdk.chatroom.api.WelcomeMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DMStatusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("consultation_content")
        public UpsellConsultationContent consultationContent;

        @C09CT("has_action_bar")
        public boolean hasActionBar;

        @C09CT("scope")
        public int scope;

        @C09CT("scope_v2")
        public DirectMessageScopeV2Settings scopeV2;

        @C09CT("suggested_question_limit")
        public int suggestedQuestionLimit;

        @C09CT("welcome_message")
        public WelcomeMessage welcomeMessage;

        @C09CT("suggested_question_list")
        public List<UpsellConsultationContent> suggestedQuestionList = new ArrayList();

        @C09CT("question_template_list")
        public List<UpsellDMTemplate> questionTemplateList = new ArrayList();

        @C09CT("welcome_message_template_list")
        public List<UpsellDMTemplate> welcomeMessageTemplateList = new ArrayList();

        @C09CT("action_bar_template_list")
        public List<UpsellActionBarTemplate> actionBarTemplateList = new ArrayList();
    }
}
