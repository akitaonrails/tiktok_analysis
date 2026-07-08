package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareOptOutNotice;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTips;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicBattleVictoryLapMessage extends AbstractC1136060ffY {

    @C09CT("anchor_region")
    public String anchorRegion;

    @C09CT("battle_id")
    public long battleId;

    @C09CT("trigger_guide")
    public BattleTruthOrDareTriggerGuide battleTruthOrDareTriggerGuide;

    @C09CT("play_tips")
    public BattleTruthOrDareTips playTips;

    @C09CT("play_type")
    public int playType;

    @C09CT("trigger_guide_v2")
    public BattleTruthOrDareTriggerGuideV2 triggerGuideV2;

    @C09CT("truth_or_dare_close_notice")
    public BattleTruthOrDareOptOutNotice truthOrDareCloseNotice;

    public LinkMicBattleVictoryLapMessage() {
        this.type = C001A.LINK_MIC_BATTLE_VICTORY_LAP_MESSAGE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicBattleVictoryLapMessage(battleTruthOrDareTriggerGuide=");
        sbLIZ.append(this.battleTruthOrDareTriggerGuide);
        sbLIZ.append(", playTips=");
        sbLIZ.append(this.playTips);
        sbLIZ.append(", truthOrDareCloseNotice=");
        sbLIZ.append(this.truthOrDareCloseNotice);
        sbLIZ.append(", playType=");
        sbLIZ.append(this.playType);
        sbLIZ.append(",anchorRegion=");
        sbLIZ.append(this.anchorRegion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
