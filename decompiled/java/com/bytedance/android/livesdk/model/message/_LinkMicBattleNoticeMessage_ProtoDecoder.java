package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeAnchorGiftGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeAnchorGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeBubbleGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeRuleGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeToast_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleNoticeMessage_ProtoDecoder implements C0IMD<LinkMicBattleNoticeMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleNoticeMessage linkMicBattleNoticeMessage) {
        Text text;
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage2 = linkMicBattleNoticeMessage;
        CommonMessageData commonMessageData = linkMicBattleNoticeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BattleNoticeRuleGuide battleNoticeRuleGuide = linkMicBattleNoticeMessage2.battleRuleGuide;
        if (battleNoticeRuleGuide != null) {
            Text text2 = battleNoticeRuleGuide.contentText;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
            Text text3 = battleNoticeRuleGuide.buttonContentText;
            if (text3 != null) {
                _Text_ProtoDecoder.LJ(text3);
            }
        }
        BattleNoticeCommonGuide battleNoticeCommonGuide = linkMicBattleNoticeMessage2.commonGuide;
        if (battleNoticeCommonGuide != null && (text = battleNoticeCommonGuide.displayText) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        BattleNoticeExtremeHighScoreNotice battleNoticeExtremeHighScoreNotice = linkMicBattleNoticeMessage2.extremeHighScoreNotice;
        if (battleNoticeExtremeHighScoreNotice != null) {
            Text text4 = battleNoticeExtremeHighScoreNotice.displayTextOriginViewers;
            if (text4 != null) {
                _Text_ProtoDecoder.LJ(text4);
            }
            Text text5 = battleNoticeExtremeHighScoreNotice.displayTextUnrelatedViewers;
            if (text5 != null) {
                _Text_ProtoDecoder.LJ(text5);
            }
        }
        BattleNoticeAnchorMatchSettings battleNoticeAnchorMatchSettings = linkMicBattleNoticeMessage2.anchorMatchSettingsNotice;
        if (battleNoticeAnchorMatchSettings != null) {
            if (battleNoticeAnchorMatchSettings.updatedSettings == null) {
                battleNoticeAnchorMatchSettings.updatedSettings = new HashMap();
            }
            Text text6 = battleNoticeAnchorMatchSettings.displayText;
            if (text6 != null) {
                _Text_ProtoDecoder.LJ(text6);
            }
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = new LinkMicBattleNoticeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicBattleNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicBattleNoticeMessage.noticeType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        linkMicBattleNoticeMessage.anchorGuide = _BattleNoticeAnchorGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkMicBattleNoticeMessage.toast = _BattleNoticeToast_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkMicBattleNoticeMessage.bubbleGuide = _BattleNoticeBubbleGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkMicBattleNoticeMessage.anchorGiftGuide = _BattleNoticeAnchorGiftGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkMicBattleNoticeMessage.battleRuleGuide = _BattleNoticeRuleGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkMicBattleNoticeMessage.commonGuide = _BattleNoticeCommonGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicBattleNoticeMessage.extremeHighScoreNotice = _BattleNoticeExtremeHighScoreNotice_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicBattleNoticeMessage.anchorMatchSettingsNotice = _BattleNoticeAnchorMatchSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleNoticeMessage linkMicBattleNoticeMessage, List list) {
    }
}
