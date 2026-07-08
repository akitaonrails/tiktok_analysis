package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleStatsMeta {

    @C09CT("anchors")
    public List<User> anchors;

    @C09CT("battle_armies")
    public List<BattleArmy> battleArmies;

    @C09CT("battle_id")
    public Long battleId;

    @C09CT("battle_mode")
    public BattleMode battleMode;

    @C09CT("battle_scores")
    public List<BattleScore> battleScores;

    @C09CT("battle_settings")
    public BattleSetting battleSettings;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("channel_info")
    public ChannelInfo channelInfo;

    @C09CT("loser_id")
    public Long loserId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.battleId != null) {
            sb.append(", battle_id=");
            sb.append(this.battleId);
        }
        if (this.battleMode != null) {
            sb.append(", battle_mode=");
            sb.append(this.battleMode);
        }
        if (this.battleSettings != null) {
            sb.append(", battle_settings=");
            sb.append(this.battleSettings);
        }
        List<BattleArmy> list = this.battleArmies;
        if (list != null && !list.isEmpty()) {
            sb.append(", battle_armies=");
            sb.append(this.battleArmies);
        }
        if (this.channelInfo != null) {
            sb.append(", channel_info=");
            sb.append(this.channelInfo);
        }
        List<BattleScore> list2 = this.battleScores;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", battle_scores=");
            sb.append(this.battleScores);
        }
        List<User> list3 = this.anchors;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", anchors=");
            sb.append(this.anchors);
        }
        if (this.loserId != null) {
            sb.append(", loser_id=");
            sb.append(this.loserId);
        }
        sb.replace(0, 2, "BattleStatsMeta{");
        sb.append('}');
        return sb.toString();
    }
}
