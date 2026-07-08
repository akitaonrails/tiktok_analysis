package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LikeMessage extends AbstractC1136060ffY {

    @C09CT("color")
    public int color;

    @C09CT("count")
    public int count;

    @C09CT("effect_cnt")
    public long effectCnt;

    @C09CT("icon")
    public String icon;

    @C09CT("icons")
    public List<ImageModel> icons;

    @C09CT("like_effect")
    public List<LikeEffect> likeEffect;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("room_message_heat_level")
    public long roomMessageHeatLevel;

    @C09CT("specified_display_text")
    public List<SpecifiedDisplayText> specifiedDisplayText;

    @C09CT("total")
    public long total;

    @C09CT("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public LikeMessage() {
        this.type = C001A.LIKE;
    }

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final long getMessageId() {
        return super.getMessageId();
    }

    public LikeMessage(Boolean bool, User user) {
        this.user = user;
        this.type = C001A.LIKE;
        this.isLocalInsertMsg = bool.booleanValue();
    }
}
