package tikcast.api.anchor_tool;

import X.C09CT;
import com.bytedance.android.livesdk.model.ChatSettingPresetConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetChatSettingPresetConfigListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("acu")
        public long acu;

        @C09CT("chat_setting_preset_config_list")
        public List<ChatSettingPresetConfig> chatSettingPresetConfigList = new ArrayList();
    }
}
