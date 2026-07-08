package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class CommentsMessage extends AbstractC1136060ffY {

    @C09CT("action_content")
    public String actionContent;

    @C09CT("action_type")
    public long actionType;

    @C09CT("back_ground")
    public ImageModel background;

    @C09CT("color")
    public String color;

    @C09CT("content")
    public String content;

    @C09CT("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public CommentsMessage() {
        this.type = C001A.COMMENT_IMAGE;
    }
}
