package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleDisplayConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleInfoResponse_ProtoDecoder implements C0IMD<BattleInfoResponse> {
    public static BattleInfoResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleInfoResponse battleInfoResponse = new BattleInfoResponse();
        battleInfoResponse.leagueScoreInfoMap = new HashMap();
        battleInfoResponse.armies = new HashMap();
        battleInfoResponse.teamArmies = new HashMap();
        battleInfoResponse.teamVirtualTicketEnvelopes = new HashMap();
        battleInfoResponse.teamBattleResult = new HashMap();
        battleInfoResponse.anchorMatchSettings = new HashMap();
        battleInfoResponse.resultMap = new HashMap();
        battleInfoResponse.teamBattleItemCards = new HashMap();
        battleInfoResponse.leagueInfoMap = new HashMap();
        battleInfoResponse.battleItemCards = new HashMap();
        battleInfoResponse.userInfoMap = new HashMap();
        battleInfoResponse.battleCombos = new HashMap();
        battleInfoResponse.supportedActions = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                switch (iLJI) {
                    case 1:
                        battleInfoResponse.channelId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        battleInfoResponse.battleId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 3:
                        battleInfoResponse.setting = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        long jLIZJ2 = c1516680pZS.LIZJ();
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
                                        battleInfoResponse.armies.put(lValueOf, battleUserArmiesLIZLLL);
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
                    case 5:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        BattleResult battleResultLIZLLL = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        battleResultLIZLLL = _BattleResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (battleResultLIZLLL != null) {
                                        battleInfoResponse.resultMap.put(lValueOf, battleResultLIZLLL);
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
                    case 6:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        BattleUserInfo battleUserInfoLIZLLL = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        battleUserInfoLIZLLL = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (lValueOf != null) {
                                    if (battleUserInfoLIZLLL != null) {
                                        battleInfoResponse.userInfoMap.put(lValueOf, battleUserInfoLIZLLL);
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
                    case 7:
                        battleInfoResponse.bubbleText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        Boolean boolValueOf = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        boolValueOf = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (lValueOf != null) {
                                    if (boolValueOf != null) {
                                        battleInfoResponse.supportedActions.put(lValueOf, boolValueOf);
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
                    case BdTuring.TYPE_ECAF /* 9 */:
                        battleInfoResponse.mBattleDisplayConfig = _BattleDisplayConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        long jLIZJ6 = c1516680pZS.LIZJ();
                        BattleComboInfo battleComboInfoLIZLLL = null;
                        while (true) {
                            int iLJI6 = c1516680pZS.LJI();
                            if (iLJI6 != -1) {
                                if (iLJI6 != 1) {
                                    if (iLJI6 == 2) {
                                        battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ6);
                                if (lValueOf != null) {
                                    if (battleComboInfoLIZLLL != null) {
                                        battleInfoResponse.battleCombos.put(lValueOf, battleComboInfoLIZLLL);
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
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        battleInfoResponse.battleTask = _BattleTask_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        long jLIZJ7 = c1516680pZS.LIZJ();
                        BattleTeamUserArmies battleTeamUserArmiesLIZLLL = null;
                        while (true) {
                            int iLJI7 = c1516680pZS.LJI();
                            if (iLJI7 != -1) {
                                if (iLJI7 != 1) {
                                    if (iLJI7 == 2) {
                                        battleTeamUserArmiesLIZLLL = _BattleTeamUserArmies_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ7);
                                if (lValueOf != null) {
                                    if (battleTeamUserArmiesLIZLLL != null) {
                                        battleInfoResponse.teamArmies.put(lValueOf, battleTeamUserArmiesLIZLLL);
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
                    case 14:
                        long jLIZJ8 = c1516680pZS.LIZJ();
                        BattleTeamResult battleTeamResultLIZLLL = null;
                        while (true) {
                            int iLJI8 = c1516680pZS.LJI();
                            if (iLJI8 != -1) {
                                if (iLJI8 != 1) {
                                    if (iLJI8 == 2) {
                                        battleTeamResultLIZLLL = _BattleTeamResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ8);
                                if (lValueOf != null) {
                                    if (battleTeamResultLIZLLL != null) {
                                        battleInfoResponse.teamBattleResult.put(lValueOf, battleTeamResultLIZLLL);
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
                    case 15:
                        battleInfoResponse.battleTruthOrDare = _BattleTruthOrDare_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        battleInfoResponse.teamMatchCampaign = _TeamMatchCampaign_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        long jLIZJ9 = c1516680pZS.LIZJ();
                        EffectingCard effectingCardLIZLLL = null;
                        while (true) {
                            int iLJI9 = c1516680pZS.LJI();
                            if (iLJI9 != -1) {
                                if (iLJI9 != 1) {
                                    if (iLJI9 == 2) {
                                        effectingCardLIZLLL = _EffectingCard_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ9);
                                if (lValueOf != null) {
                                    if (effectingCardLIZLLL != null) {
                                        battleInfoResponse.battleItemCards.put(lValueOf, effectingCardLIZLLL);
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
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        long jLIZJ10 = c1516680pZS.LIZJ();
                        EffectingCard effectingCardLIZLLL2 = null;
                        while (true) {
                            int iLJI10 = c1516680pZS.LJI();
                            if (iLJI10 != -1) {
                                if (iLJI10 != 1) {
                                    if (iLJI10 == 2) {
                                        effectingCardLIZLLL2 = _EffectingCard_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ10);
                                if (lValueOf != null) {
                                    if (effectingCardLIZLLL2 != null) {
                                        battleInfoResponse.teamBattleItemCards.put(lValueOf, effectingCardLIZLLL2);
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
                    case 19:
                        battleInfoResponse.channelIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        battleInfoResponse.battleIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        battleInfoResponse.fuzzyDisplayConfigV2 = _HighScoreControlCfg_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        long jLIZJ11 = c1516680pZS.LIZJ();
                        GiftGalleryBadgeInfo giftGalleryBadgeInfoLIZLLL = null;
                        while (true) {
                            int iLJI11 = c1516680pZS.LJI();
                            if (iLJI11 != -1) {
                                if (iLJI11 != 1) {
                                    if (iLJI11 == 2) {
                                        giftGalleryBadgeInfoLIZLLL = _GiftGalleryBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ11);
                                if (lValueOf != null) {
                                    if (giftGalleryBadgeInfoLIZLLL != null) {
                                        battleInfoResponse.leagueInfoMap.put(lValueOf, giftGalleryBadgeInfoLIZLLL);
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
                    case 23:
                        long jLIZJ12 = c1516680pZS.LIZJ();
                        LeagueScoreInfo leagueScoreInfoLIZLLL = null;
                        while (true) {
                            int iLJI12 = c1516680pZS.LJI();
                            if (iLJI12 != -1) {
                                if (iLJI12 != 1) {
                                    if (iLJI12 == 2) {
                                        leagueScoreInfoLIZLLL = _LeagueScoreInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ12);
                                if (lValueOf != null) {
                                    if (leagueScoreInfoLIZLLL != null) {
                                        battleInfoResponse.leagueScoreInfoMap.put(lValueOf, leagueScoreInfoLIZLLL);
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
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        battleInfoResponse.iceShowdownInfo = _IceShowdownInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                        battleInfoResponse.effectInfos = _BattleEffectInfos_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        battleInfoResponse.enigmaBattleSetting = _EnigmaBattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 27:
                        battleInfoResponse.enigmaBattleExtraInfo = _EnigmaBattleExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        long jLIZJ13 = c1516680pZS.LIZJ();
                        AnchorMatchSettings anchorMatchSettingsLIZLLL = null;
                        while (true) {
                            int iLJI13 = c1516680pZS.LJI();
                            if (iLJI13 != -1) {
                                if (iLJI13 != 1) {
                                    if (iLJI13 == 2) {
                                        anchorMatchSettingsLIZLLL = _AnchorMatchSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ13);
                                if (lValueOf != null) {
                                    if (anchorMatchSettingsLIZLLL != null) {
                                        battleInfoResponse.anchorMatchSettings.put(lValueOf, anchorMatchSettingsLIZLLL);
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
                    case 29:
                        battleInfoResponse.battleFeatureFlags = _BattleFeatureFlags_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 30:
                        battleInfoResponse.matchThemeDisplayResource = _MatchThemeDisplayResource_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 31:
                        long jLIZJ14 = c1516680pZS.LIZJ();
                        VirtualTicketEnvelopeInfoList virtualTicketEnvelopeInfoListLIZLLL = null;
                        while (true) {
                            int iLJI14 = c1516680pZS.LJI();
                            if (iLJI14 != -1) {
                                if (iLJI14 != 1) {
                                    if (iLJI14 == 2) {
                                        virtualTicketEnvelopeInfoListLIZLLL = _VirtualTicketEnvelopeInfoList_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ14);
                                if (lValueOf != null) {
                                    if (virtualTicketEnvelopeInfoListLIZLLL != null) {
                                        battleInfoResponse.teamVirtualTicketEnvelopes.put(lValueOf, virtualTicketEnvelopeInfoListLIZLLL);
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
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleInfoResponse;
            }
        }
    }

    public static void LJ(BattleInfoResponse battleInfoResponse) {
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
        Map<Long, BattleUserArmies> map = battleInfoResponse.armies;
        if (map == null) {
            battleInfoResponse.armies = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleUserArmies>> it2 = battleInfoResponse.armies.entrySet().iterator();
            while (it2.hasNext()) {
                BattleUserArmies value = it2.next().getValue();
                if (value != null) {
                    _BattleUserArmies_ProtoDecoder.LJ(value);
                }
            }
        }
        Map<Long, BattleResult> map2 = battleInfoResponse.resultMap;
        if (map2 == null) {
            battleInfoResponse.resultMap = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, BattleResult>> it3 = battleInfoResponse.resultMap.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        Map<Long, BattleUserInfo> map3 = battleInfoResponse.userInfoMap;
        if (map3 == null) {
            battleInfoResponse.userInfoMap = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, BattleUserInfo>> it4 = battleInfoResponse.userInfoMap.entrySet().iterator();
            while (it4.hasNext()) {
                BattleUserInfo value2 = it4.next().getValue();
                if (value2 != null) {
                    _BattleUserInfo_ProtoDecoder.LJ(value2);
                }
            }
        }
        if (battleInfoResponse.supportedActions == null) {
            battleInfoResponse.supportedActions = new HashMap();
        }
        Map<Long, BattleComboInfo> map4 = battleInfoResponse.battleCombos;
        if (map4 == null) {
            battleInfoResponse.battleCombos = new HashMap();
        } else if (!map4.isEmpty()) {
            Iterator<Map.Entry<Long, BattleComboInfo>> it5 = battleInfoResponse.battleCombos.entrySet().iterator();
            while (it5.hasNext()) {
                it5.next().getValue();
            }
        }
        BattleTask battleTask = battleInfoResponse.battleTask;
        if (battleTask != null) {
            BattleBonusConfig battleBonusConfig = battleTask.battleBonusConfig;
            if (battleBonusConfig != null) {
                _BattleBonusConfig_ProtoDecoder.LJ(battleBonusConfig);
            }
            BattleBonusStatus battleBonusStatus = battleTask.battleBonusStatus;
            if (battleBonusStatus != null) {
                BattlePrompt battlePrompt = battleBonusStatus.enterRoomPrompt;
                if (battlePrompt != null) {
                    _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
                }
                BattlePrompt battlePrompt2 = battleBonusStatus.rewardSettlePrompt;
                if (battlePrompt2 != null) {
                    _BattlePrompt_ProtoDecoder.LJ(battlePrompt2);
                }
            }
        }
        Map<Long, BattleTeamUserArmies> map5 = battleInfoResponse.teamArmies;
        if (map5 == null) {
            battleInfoResponse.teamArmies = new HashMap();
        } else if (!map5.isEmpty()) {
            Iterator<Map.Entry<Long, BattleTeamUserArmies>> it6 = battleInfoResponse.teamArmies.entrySet().iterator();
            while (it6.hasNext()) {
                BattleTeamUserArmies value3 = it6.next().getValue();
                if (value3 != null) {
                    _BattleTeamUserArmies_ProtoDecoder.LJ(value3);
                }
            }
        }
        Map<Long, BattleTeamResult> map6 = battleInfoResponse.teamBattleResult;
        if (map6 == null) {
            battleInfoResponse.teamBattleResult = new HashMap();
        } else if (!map6.isEmpty()) {
            Iterator<Map.Entry<Long, BattleTeamResult>> it7 = battleInfoResponse.teamBattleResult.entrySet().iterator();
            while (it7.hasNext()) {
                BattleTeamResult value4 = it7.next().getValue();
                if (value4 != null) {
                    _BattleTeamResult_ProtoDecoder.LJ(value4);
                }
            }
        }
        TeamMatchCampaign teamMatchCampaign = battleInfoResponse.teamMatchCampaign;
        if (teamMatchCampaign != null) {
            _TeamMatchCampaign_ProtoDecoder.LJ(teamMatchCampaign);
        }
        Map<Long, EffectingCard> map7 = battleInfoResponse.battleItemCards;
        if (map7 == null) {
            battleInfoResponse.battleItemCards = new HashMap();
        } else if (!map7.isEmpty()) {
            Iterator<Map.Entry<Long, EffectingCard>> it8 = battleInfoResponse.battleItemCards.entrySet().iterator();
            while (it8.hasNext()) {
                EffectingCard value5 = it8.next().getValue();
                if (value5 != null) {
                    _EffectingCard_ProtoDecoder.LJ(value5);
                }
            }
        }
        Map<Long, EffectingCard> map8 = battleInfoResponse.teamBattleItemCards;
        if (map8 == null) {
            battleInfoResponse.teamBattleItemCards = new HashMap();
        } else if (!map8.isEmpty()) {
            Iterator<Map.Entry<Long, EffectingCard>> it9 = battleInfoResponse.teamBattleItemCards.entrySet().iterator();
            while (it9.hasNext()) {
                EffectingCard value6 = it9.next().getValue();
                if (value6 != null) {
                    _EffectingCard_ProtoDecoder.LJ(value6);
                }
            }
        }
        HighScoreControlCfg highScoreControlCfg = battleInfoResponse.fuzzyDisplayConfigV2;
        if (highScoreControlCfg != null && highScoreControlCfg.originDisplayToUserList == null) {
            highScoreControlCfg.originDisplayToUserList = new ArrayList();
        }
        Map<Long, GiftGalleryBadgeInfo> map9 = battleInfoResponse.leagueInfoMap;
        if (map9 == null) {
            battleInfoResponse.leagueInfoMap = new HashMap();
        } else if (!map9.isEmpty()) {
            Iterator<Map.Entry<Long, GiftGalleryBadgeInfo>> it10 = battleInfoResponse.leagueInfoMap.entrySet().iterator();
            while (it10.hasNext()) {
                GiftGalleryBadgeInfo value7 = it10.next().getValue();
                if (value7 != null) {
                    _GiftGalleryBadgeInfo_ProtoDecoder.LJ(value7);
                }
            }
        }
        Map<Long, LeagueScoreInfo> map10 = battleInfoResponse.leagueScoreInfoMap;
        if (map10 == null) {
            battleInfoResponse.leagueScoreInfoMap = new HashMap();
        } else if (!map10.isEmpty()) {
            Iterator<Map.Entry<Long, LeagueScoreInfo>> it11 = battleInfoResponse.leagueScoreInfoMap.entrySet().iterator();
            while (it11.hasNext()) {
                LeagueScoreInfo value8 = it11.next().getValue();
                if (value8 != null) {
                    _LeagueScoreInfo_ProtoDecoder.LJ(value8);
                }
            }
        }
        BattleEffectInfos battleEffectInfos = battleInfoResponse.effectInfos;
        if (battleEffectInfos != null) {
            _BattleEffectInfos_ProtoDecoder.LJ(battleEffectInfos);
        }
        EnigmaBattleSetting enigmaBattleSetting = battleInfoResponse.enigmaBattleSetting;
        if (enigmaBattleSetting != null && enigmaBattleSetting.enigmaScoreRevealCountdownSec == null) {
            enigmaBattleSetting.enigmaScoreRevealCountdownSec = new ArrayList();
        }
        Map<Long, AnchorMatchSettings> map11 = battleInfoResponse.anchorMatchSettings;
        if (map11 == null) {
            battleInfoResponse.anchorMatchSettings = new HashMap();
        } else if (!map11.isEmpty()) {
            Iterator<Map.Entry<Long, AnchorMatchSettings>> it12 = battleInfoResponse.anchorMatchSettings.entrySet().iterator();
            while (it12.hasNext()) {
                it12.next().getValue();
            }
        }
        MatchThemeDisplayResource matchThemeDisplayResource = battleInfoResponse.matchThemeDisplayResource;
        if (matchThemeDisplayResource != null) {
            _MatchThemeDisplayResource_ProtoDecoder.LJ(matchThemeDisplayResource);
        }
        Map<Long, VirtualTicketEnvelopeInfoList> map12 = battleInfoResponse.teamVirtualTicketEnvelopes;
        if (map12 == null) {
            battleInfoResponse.teamVirtualTicketEnvelopes = new HashMap();
            return;
        }
        if (map12.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, VirtualTicketEnvelopeInfoList>> it13 = battleInfoResponse.teamVirtualTicketEnvelopes.entrySet().iterator();
        while (it13.hasNext()) {
            VirtualTicketEnvelopeInfoList value9 = it13.next().getValue();
            if (value9 != null) {
                _VirtualTicketEnvelopeInfoList_ProtoDecoder.LJ(value9);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleInfoResponse battleInfoResponse) {
        LJ(battleInfoResponse);
    }

    @Override // X.C0IMD
    public final BattleInfoResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleInfoResponse battleInfoResponse, List list) {
    }
}
