package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.silentpush;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class TopviewSafeguardManager {
    public static final TopviewSafeguardManager LIZ = new TopviewSafeguardManager();

    public static final class SilentPushMessage {

        @C09CT("creative_ids")
        public final List<String> creativeIds;

        @C09CT("send_log_id")
        public final String sendLogId;

        public SilentPushMessage() {
            this(null, null);
        }

        public SilentPushMessage(String str, List<String> list) {
            this.sendLogId = str;
            this.creativeIds = list;
        }
    }
}
