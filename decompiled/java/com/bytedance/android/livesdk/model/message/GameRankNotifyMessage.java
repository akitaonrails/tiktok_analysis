package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GameRankNotifyMessage extends AbstractC1136060ffY {

    @C09CT("msg_type")
    public int msgType;

    @C09CT("notify_text")
    public Text notifyText;

    public GameRankNotifyMessage() {
        this.type = C001A.GAME_RANK_NOTIFY_MESSAGE;
    }
}
