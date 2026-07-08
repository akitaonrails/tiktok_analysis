package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicBattlePunishFinishMessage extends AbstractC1136060ffY {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("battle_settings")
    public BattleSetting battleSettings;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("match_punish_extra_info")
    public MatchPunishExtraInfo matchPunishExtraInfo;

    @C09CT("op_uid")
    public long opUid;

    @C09CT("reason")
    public int reason;

    public LinkMicBattlePunishFinishMessage() {
        this.type = C001A.LINK_MIC_BATTLE_PUNISH_FINISH;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicBattlePunishFinishMessage{channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", opUid=");
        sbLIZ.append(this.opUid);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
