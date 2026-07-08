package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskUpdate;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicBattleTaskMessage extends AbstractC1136060ffY {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("task_message_type")
    public int battleTaskMessageType;

    @C09CT("reward")
    public BattleRewardSettle rewardSettle;

    @C09CT("task_settle")
    public BattleTaskSettle taskSettle;

    @C09CT("start")
    public BattleTaskStart taskStart;

    @C09CT("task_update")
    public BattleTaskUpdate taskUpdate;

    public LinkMicBattleTaskMessage() {
        this.type = C001A.LINK_MIC_BATTLE_TASK;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMIcBattleTaskMessage{battleTaskMessageType=");
        sbLIZ.append(this.battleTaskMessageType);
        sbLIZ.append(", taskStart=");
        sbLIZ.append(this.taskStart);
        sbLIZ.append(", taskUpdate=");
        sbLIZ.append(this.taskUpdate);
        sbLIZ.append(", taskSettle=");
        sbLIZ.append(this.taskSettle);
        sbLIZ.append(", rewardSettle=");
        sbLIZ.append(this.rewardSettle);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
