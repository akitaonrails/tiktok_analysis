package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class BattleArtifactUseVirtualTicketInfo {

    @C09CT("combo_count")
    public long comboCount;

    @C09CT("combo_end")
    public boolean comboEnd;

    @C09CT("combo_score")
    public long comboScore;

    @C09CT("count")
    public long count;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("item_id")
    public long itemId;

    @C09CT("public_message")
    public Text publicMessage;

    @C09CT("score")
    public long score;

    @C09CT("ticket_icon")
    public ImageModel ticketIcon;

    @C09CT("to_room_id")
    public long toRoomId;

    @C09CT("to_user_id")
    public long toUserId;
}
