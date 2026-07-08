package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class SocialMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public long action;

    @C09CT("follow_count")
    public Long followCount;

    @C09CT("follow_type")
    public int followType;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("share_count")
    public int shareCount;

    @C09CT("share_display_style")
    public long shareDisplayStyle;

    @C09CT("share_target")
    public String shareTarget;

    @C09CT("share_type")
    public long shareType;

    @C09CT("show_duration_ms")
    public long showDurationMs;

    @C09CT("target_user_id")
    public long targetUserId;

    @C09CT("user")
    public User user;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("signature_version")
    public String signatureVersion = "";

    @C09CT("signature")
    public String signature = "";

    public final boolean LIZ() {
        long j = this.action;
        return j == 5 || j == 6 || j == 7 || j == 8 || j == 9 || j == 10;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.user != null;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public SocialMessage() {
        this.type = C001A.SOCIAL;
    }
}
