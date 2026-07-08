package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeBubbleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeToast;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicBattleNoticeMessage extends AbstractC1136060ffY {
    public boolean LL;

    @C09CT("anchor_gift_guide")
    public BattleNoticeAnchorGiftGuide anchorGiftGuide;

    @C09CT("anchor_guide")
    public BattleNoticeAnchorGuide anchorGuide;

    @C09CT("anchor_match_settings_notice")
    public BattleNoticeAnchorMatchSettings anchorMatchSettingsNotice;

    @C09CT("rule_guide")
    public BattleNoticeRuleGuide battleRuleGuide;

    @C09CT("bubble_guide")
    public BattleNoticeBubbleGuide bubbleGuide;

    @C09CT("common_guide")
    public BattleNoticeCommonGuide commonGuide;

    @C09CT("extreme_high_score_notice")
    public BattleNoticeExtremeHighScoreNotice extremeHighScoreNotice;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT("toast")
    public BattleNoticeToast toast;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LinkMicBattleNoticeMessage() {
        this.type = C001A.LINK_MIC_BATTLE_NOTICE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicBattleNoticeMessage{noticeType=");
        sbLIZ.append(this.noticeType);
        sbLIZ.append(", anchorGuide=");
        sbLIZ.append(this.anchorGuide);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.toast);
        sbLIZ.append(", bubbleGuide=");
        sbLIZ.append(this.bubbleGuide);
        sbLIZ.append(", anchorGiftGuide=");
        sbLIZ.append(this.anchorGiftGuide);
        sbLIZ.append(", battleRuleGuide=");
        sbLIZ.append(this.battleRuleGuide);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
