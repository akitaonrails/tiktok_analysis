package tikcast.api.anchor_tool;

import X.C09CT;
import com.bytedance.android.livesdk.model.ChatSettingConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetChatSettingConfigListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("chat_setting_config_list")
        public List<ChatSettingConfig> chatSettingConfigList = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("max_limit_count")
        public int maxLimitCount;

        @C09CT("next_offset")
        public int nextOffset;

        @C09CT("total_count")
        public int totalCount;
    }
}
