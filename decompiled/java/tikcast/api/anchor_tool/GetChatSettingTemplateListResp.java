package tikcast.api.anchor_tool;

import X.C09CT;
import com.bytedance.android.livesdk.model.ChatSettingTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GetChatSettingTemplateListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("chat_setting_template_list")
        public List<ChatSettingTemplate> chatSettingTemplateList = new ArrayList();
    }
}
