package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class MsgNotifyConfigResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("avoid_rule_config")
        public MsgNotifyAvoidConfig avoidRuleConfig;

        @C09CT("notice_avoid_config")
        public NotifyAvoidConfig noticeAvoidConfig;

        @C09CT("notice_fc_config")
        public NotifyFCConfig noticeFcConfig;

        @C09CT("refresh_ms")
        public long refreshMs;

        @C09CT("bubble_configs")
        public Map<String, BubbleConfig> bubbleConfigs = new LinkedHashMap();

        @C09CT("red_dot_configs")
        public Map<String, RedDotConfig> redDotConfigs = new LinkedHashMap();

        @C09CT("filtered_bubble_configs")
        public Map<String, BubbleConfig> filteredBubbleConfigs = new LinkedHashMap();

        @C09CT("filtered_red_dot_configs")
        public Map<String, RedDotConfig> filteredRedDotConfigs = new LinkedHashMap();
    }
}
