package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakCompareParams {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_type")
    public final Integer conversationType;

    @C09CT("current_streak")
    public final StreakValueParams oldStreakValueStr;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public StreakCompareParams(Integer num, String str, StreakValueParams streakValueParams, String str2) {
        this.conversationType = num;
        this.conversationId = str;
        this.oldStreakValueStr = streakValueParams;
        this.scene = str2;
    }
}
