package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleEffectInfos_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._EnigmaBattleExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._HighScoreControlCfg_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleArmiesMessage_ProtoDecoder implements C0IMD<LinkMicBattleArmiesMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage) {
        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage2 = linkMicBattleArmiesMessage;
        CommonMessageData commonMessageData = linkMicBattleArmiesMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Map<Long, BattleUserArmies> map = linkMicBattleArmiesMessage2.armies;
        if (map == null) {
            linkMicBattleArmiesMessage2.armies = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleUserArmies>> it2 = linkMicBattleArmiesMessage2.armies.entrySet().iterator();
            while (it2.hasNext()) {
                BattleUserArmies value = it2.next().getValue();
                if (value != null) {
                    _BattleUserArmies_ProtoDecoder.LJ(value);
                }
            }
        }
        ImageModel imageModel = linkMicBattleArmiesMessage2.gifIconImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<BattleTeamUserArmies> list = linkMicBattleArmiesMessage2.teamArmies;
        if (list == null) {
            linkMicBattleArmiesMessage2.teamArmies = new ArrayList();
        } else if (!list.isEmpty()) {
            for (BattleTeamUserArmies battleTeamUserArmies : linkMicBattleArmiesMessage2.teamArmies) {
                if (battleTeamUserArmies != null) {
                    _BattleTeamUserArmies_ProtoDecoder.LJ(battleTeamUserArmies);
                }
            }
        }
        BattleSetting battleSetting = linkMicBattleArmiesMessage2.battleSettings;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
        HighScoreControlCfg highScoreControlCfg = linkMicBattleArmiesMessage2.fuzzyDisplayConfigV2;
        if (highScoreControlCfg != null && highScoreControlCfg.originDisplayToUserList == null) {
            highScoreControlCfg.originDisplayToUserList = new ArrayList();
        }
        BattleEffectInfos battleEffectInfos = linkMicBattleArmiesMessage2.effectInfos;
        if (battleEffectInfos != null) {
            _BattleEffectInfos_ProtoDecoder.LJ(battleEffectInfos);
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleArmiesMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = new LinkMicBattleArmiesMessage();
        linkMicBattleArmiesMessage.armies = new HashMap();
        linkMicBattleArmiesMessage.teamArmies = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicBattleArmiesMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicBattleArmiesMessage.battleId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        BattleUserArmies battleUserArmiesLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        battleUserArmiesLIZLLL = _BattleUserArmies_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (battleUserArmiesLIZLLL != null) {
                                        linkMicBattleArmiesMessage.armies.put(lValueOf, battleUserArmiesLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        linkMicBattleArmiesMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkMicBattleArmiesMessage.giftSentTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkMicBattleArmiesMessage.scoreUpdateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkMicBattleArmiesMessage.triggerReason = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        linkMicBattleArmiesMessage.fromUserId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicBattleArmiesMessage.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicBattleArmiesMessage.giftCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkMicBattleArmiesMessage.gifIconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkMicBattleArmiesMessage.totalDiamondCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        linkMicBattleArmiesMessage.repeatCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        linkMicBattleArmiesMessage.teamArmies.add(_BattleTeamUserArmies_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 15:
                        linkMicBattleArmiesMessage.triggerCriticalStrike = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 16:
                        linkMicBattleArmiesMessage.hasTeamMatchMvpSfx = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        linkMicBattleArmiesMessage.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        linkMicBattleArmiesMessage.battleSettings = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        linkMicBattleArmiesMessage.fuzzyDisplayConfigV2 = _HighScoreControlCfg_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        linkMicBattleArmiesMessage.effectInfos = _BattleEffectInfos_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        linkMicBattleArmiesMessage.enigmaBattleExtraInfo = _EnigmaBattleExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleArmiesMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleArmiesMessage linkMicBattleArmiesMessage, List list) {
    }
}
