package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api;

import X.C11NZ;
import X.C1508605vQ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes3.dex */
public interface IMSuggestedReplyApi {
    public static final C1508605vQ LIZ = C1508605vQ.LIZ;

    @InterfaceC1501160pAQ("tiktok/v1/im/bot/suggested/reply")
    C11NZ<SuggestReplyResponse> getSuggestedReply(@InterfaceC1501070pAH("con_short_id") long j, @InterfaceC1501070pAH("msg_id") long j2, @InterfaceC1501070pAH("bot_id") long j3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501070pAH("topic_info") String str, @InterfaceC1501070pAH("rewritten_query") String str2);
}
