package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CollabGiftFullInfo {

    @C09CT("stages")
    public Map<Long, CollabGiftStage> stages = new LinkedHashMap();

    @C09CT("user_info")
    public Map<String, CollabGiftContributor> userInfo = new LinkedHashMap();
}
