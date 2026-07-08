package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CapsuleBizParamsModeratorGuide {

    @C09CT("hv_user")
    public User hvUser;

    @C09CT("is_gift_moderator")
    public boolean isGiftModerator;

    @C09CT("is_interactive_moderator")
    public boolean isInteractiveModerator;

    @C09CT("is_tool_moderator")
    public boolean isToolModerator;

    @C09CT("recommend_sensitive_words")
    public List<String> recommendSensitiveWords = new ArrayList();

    @C09CT("welcome_msg")
    public Text welcomeMsg;
}
