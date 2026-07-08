package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class ScreenMessage extends AbstractC1136060ffY {

    @C09CT("background_image_v2")
    public ImageModel background;

    @C09CT("background_image")
    public ImageModel backgroundImage;

    @C09CT("effect_v2")
    public CeremonyEffect ceremonyEffect;

    @C09CT("chat_id")
    public long chatId;

    @C09CT("screen_chat_type")
    public int chatType;

    @C09CT("content")
    public String content;

    @C09CT("effect")
    public CeremonyEffect effect;

    @C09CT("priority")
    public int priority;

    @C09CT("public_area_common")
    public PublicAreaCommon publicAreaCommon;

    @C09CT("user")
    public User userInfo;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return (this.userInfo == null || TextUtils.isEmpty(this.content)) ? false : true;
    }

    public ScreenMessage() {
        this.type = C001A.SCREEN;
    }
}
