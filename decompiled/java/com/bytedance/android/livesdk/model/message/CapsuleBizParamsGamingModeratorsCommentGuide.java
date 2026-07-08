package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class CapsuleBizParamsGamingModeratorsCommentGuide {

    @C09CT("action")
    public GameAction action;

    @C09CT("recommend_text")
    public RecommendComment recommendText;

    @C09CT("reply_msg_text")
    public Text replyMsgText;

    @C09CT("rule_id")
    public long ruleId;

    @C09CT("user")
    public User user;
}
