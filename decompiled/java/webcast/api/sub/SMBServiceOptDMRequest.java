package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBChatPrompt;
import com.bytedance.android.livesdk.chatroom.api.SMBDMQuestion;
import com.bytedance.android.livesdk.chatroom.api.SMBKeywordReplyScenario;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBServiceOptDMRequest {

    @C09CT("chat_prompt_enabled")
    public boolean chatPromptEnabled;

    @C09CT("keyword_reply_enabled")
    public boolean keywordReplyEnabled;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("scope")
    public int scope;

    @C09CT("service_id")
    public long serviceId;

    @C09CT("with_default_actionbar")
    public boolean withDefaultActionbar;

    @C09CT("with_form")
    public boolean withForm;

    @C09CT("name")
    public String name = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("quick_question_list")
    public List<SMBDMQuestion> quickQuestionList = new ArrayList();

    @C09CT("greeting_message")
    public String greetingMessage = "";

    @C09CT("pin_notice")
    public String pinNotice = "";

    @C09CT("edited_components")
    public List<Integer> editedComponents = new ArrayList();

    @C09CT("service_id_str")
    public String serviceIdStr = "";

    @C09CT("chat_prompt_list")
    public List<SMBChatPrompt> chatPromptList = new ArrayList();

    @C09CT("keyword_reply_scenario_list")
    public List<SMBKeywordReplyScenario> keywordReplyScenarioList = new ArrayList();
}
