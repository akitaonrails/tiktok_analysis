package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MsgNotifyControlResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("notify_fc_config")
        public NotifyFCConfig notifyFcConfig;

        @C09CT("quota_config")
        public Map<Long, MsgNotifyQuota> quotaConfig = new LinkedHashMap();

        @C09CT("refresh_ms")
        public long refreshMs;
    }
}
