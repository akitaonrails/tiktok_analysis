package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveIntroMessage extends AbstractC1136060ffY {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("badges")
    public List<BadgeStruct> badges;

    @C09CT("content")
    public String content;

    @C09CT("content_language")
    public String contentLanguage;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("intro_mode")
    public Integer introMode;

    @C09CT("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public LiveIntroMessage() {
        this.type = C001A.LIVE_INTRO_MESSAGE;
        this.introMode = 0;
        this.contentLanguage = "";
    }
}
