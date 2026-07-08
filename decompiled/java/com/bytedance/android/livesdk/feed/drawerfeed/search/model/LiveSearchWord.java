package com.bytedance.android.livesdk.feed.drawerfeed.search.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchWord {

    @C09CT(alternate = {"group_id"}, value = FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT(alternate = {"words_content"}, value = "word")
    public String word;
}
