package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.proto.RankUserEnigmaInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class RankTextMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public Text content;

    @C09CT("cur_user_id")
    public long curUserId;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("other_get_badge_msg")
    public Text otherGetBadgeMsg;

    @C09CT("owner_idx_after_update")
    public Long ownerIdxAfterUpdate;

    @C09CT("owner_idx_before_update")
    public Long ownerIdxBeforeUpdate;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("public_area_msg_common")
    public PublicAreaMessageCommon publicAreaMsgCommon;

    @C09CT("rank_type")
    public int rankType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("self_get_badge_msg")
    public Text selfGetBadgeMsg;

    @C09CT("user_enigma_info")
    public RankUserEnigmaInfo userEnigmaInfo;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.baseMessage != null;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        if (this.ownerIdxBeforeUpdate != null) {
            sb.append(", owner_idx_before_update=");
            sb.append(this.ownerIdxBeforeUpdate);
        }
        if (this.ownerIdxAfterUpdate != null) {
            sb.append(", owner_idx_after_update=");
            sb.append(this.ownerIdxAfterUpdate);
        }
        sb.replace(0, 2, "RankTextMessage{");
        sb.append('}');
        return sb.toString();
    }

    public RankTextMessage() {
        this.type = C001A.RANK_TEXT_MESSAGE;
    }
}
