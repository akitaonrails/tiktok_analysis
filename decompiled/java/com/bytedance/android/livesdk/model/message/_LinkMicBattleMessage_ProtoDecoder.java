package com.bytedance.android.livesdk.model.message;

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
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.model.message.battle.SupportedActionsWrapper;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdk.model.message.battle._BattleDisplayConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserInfoWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._SupportedActionsWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._UserArmiesWrapper_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamMatchCampaign;
import com.bytedance.android.livesdkapi.depend.model.live.match._AnchorMatchSettings_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestList_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleFeatureFlags_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._EnigmaBattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._HighScoreControlCfg_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._LeagueScoreInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MatchPunishExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MatchThemeDisplayResource_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._TeamMatchCampaign_ProtoDecoder;
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
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleMessage_ProtoDecoder implements C0IMD<LinkMicBattleMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleMessage linkMicBattleMessage) {
        BattleUserArmies battleUserArmies;
        BattleUserInfo battleUserInfo;
        BattleABTestList battleABTestList;
        LinkMicBattleMessage linkMicBattleMessage2 = linkMicBattleMessage;
        CommonMessageData commonMessageData = linkMicBattleMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BattleSetting battleSetting = linkMicBattleMessage2.battleSetting;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
        Map<Long, BattleResult> map = linkMicBattleMessage2.battleResult;
        if (map == null) {
            linkMicBattleMessage2.battleResult = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleResult>> it2 = linkMicBattleMessage2.battleResult.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        List<UserArmiesWrapper> list = linkMicBattleMessage2.armies;
        if (list == null) {
            linkMicBattleMessage2.armies = new ArrayList();
        } else if (!list.isEmpty()) {
            for (UserArmiesWrapper userArmiesWrapper : linkMicBattleMessage2.armies) {
                if (userArmiesWrapper != null && (battleUserArmies = userArmiesWrapper.userArmies) != null) {
                    _BattleUserArmies_ProtoDecoder.LJ(battleUserArmies);
                }
            }
        }
        List<BattleUserInfoWrapper> list2 = linkMicBattleMessage2.anchorInfo;
        if (list2 == null) {
            linkMicBattleMessage2.anchorInfo = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (BattleUserInfoWrapper battleUserInfoWrapper : linkMicBattleMessage2.anchorInfo) {
                if (battleUserInfoWrapper != null && (battleUserInfo = battleUserInfoWrapper.userInfo) != null) {
                    _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
                }
            }
        }
        List<SupportedActionsWrapper> list3 = linkMicBattleMessage2.supportedActions;
        if (list3 == null) {
            linkMicBattleMessage2.supportedActions = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<SupportedActionsWrapper> it3 = linkMicBattleMessage2.supportedActions.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        Map<Long, BattleComboInfo> map2 = linkMicBattleMessage2.battleCombos;
        if (map2 == null) {
            linkMicBattleMessage2.battleCombos = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, BattleComboInfo>> it4 = linkMicBattleMessage2.battleCombos.entrySet().iterator();
            while (it4.hasNext()) {
                it4.next().getValue();
            }
        }
        List<TeamUsersInfo> list4 = linkMicBattleMessage2.teamUsers;
        if (list4 == null) {
            linkMicBattleMessage2.teamUsers = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (TeamUsersInfo teamUsersInfo : linkMicBattleMessage2.teamUsers) {
                if (teamUsersInfo != null && teamUsersInfo.userIds == null) {
                    teamUsersInfo.userIds = new ArrayList();
                }
            }
        }
        List<BattleInviteeGiftPermission> list5 = linkMicBattleMessage2.inviteeGiftPermissionTypes;
        if (list5 == null) {
            linkMicBattleMessage2.inviteeGiftPermissionTypes = new ArrayList();
        } else if (!list5.isEmpty()) {
            Iterator<BattleInviteeGiftPermission> it5 = linkMicBattleMessage2.inviteeGiftPermissionTypes.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
        List<BattleTeamResult> list6 = linkMicBattleMessage2.teamBattleResult;
        if (list6 == null) {
            linkMicBattleMessage2.teamBattleResult = new ArrayList();
        } else if (!list6.isEmpty()) {
            for (BattleTeamResult battleTeamResult : linkMicBattleMessage2.teamBattleResult) {
                if (battleTeamResult != null) {
                    _BattleTeamResult_ProtoDecoder.LJ(battleTeamResult);
                }
            }
        }
        List<BattleTeamUserArmies> list7 = linkMicBattleMessage2.teamArmies;
        if (list7 == null) {
            linkMicBattleMessage2.teamArmies = new ArrayList();
        } else if (!list7.isEmpty()) {
            for (BattleTeamUserArmies battleTeamUserArmies : linkMicBattleMessage2.teamArmies) {
                if (battleTeamUserArmies != null) {
                    _BattleTeamUserArmies_ProtoDecoder.LJ(battleTeamUserArmies);
                }
            }
        }
        List<BattleABTestSetting> list8 = linkMicBattleMessage2.abtestSettings;
        if (list8 == null) {
            linkMicBattleMessage2.abtestSettings = new ArrayList();
        } else if (!list8.isEmpty()) {
            for (BattleABTestSetting battleABTestSetting : linkMicBattleMessage2.abtestSettings) {
                if (battleABTestSetting != null && (battleABTestList = battleABTestSetting.abTestList) != null) {
                    _BattleABTestList_ProtoDecoder.LJ(battleABTestList);
                }
            }
        }
        TeamMatchCampaign teamMatchCampaign = linkMicBattleMessage2.teamMatchCampaign;
        if (teamMatchCampaign != null) {
            _TeamMatchCampaign_ProtoDecoder.LJ(teamMatchCampaign);
        }
        HighScoreControlCfg highScoreControlCfg = linkMicBattleMessage2.fuzzyDisplayConfigV2;
        if (highScoreControlCfg != null && highScoreControlCfg.originDisplayToUserList == null) {
            highScoreControlCfg.originDisplayToUserList = new ArrayList();
        }
        Map<Long, GiftGalleryBadgeInfo> map3 = linkMicBattleMessage2.leagueInfoMap;
        if (map3 == null) {
            linkMicBattleMessage2.leagueInfoMap = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, GiftGalleryBadgeInfo>> it6 = linkMicBattleMessage2.leagueInfoMap.entrySet().iterator();
            while (it6.hasNext()) {
                GiftGalleryBadgeInfo value = it6.next().getValue();
                if (value != null) {
                    _GiftGalleryBadgeInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        Map<Long, LeagueScoreInfo> map4 = linkMicBattleMessage2.leagueScoreInfoMap;
        if (map4 == null) {
            linkMicBattleMessage2.leagueScoreInfoMap = new HashMap();
        } else if (!map4.isEmpty()) {
            Iterator<Map.Entry<Long, LeagueScoreInfo>> it7 = linkMicBattleMessage2.leagueScoreInfoMap.entrySet().iterator();
            while (it7.hasNext()) {
                LeagueScoreInfo value2 = it7.next().getValue();
                if (value2 != null) {
                    _LeagueScoreInfo_ProtoDecoder.LJ(value2);
                }
            }
        }
        MatchPunishExtraInfo matchPunishExtraInfo = linkMicBattleMessage2.matchPunishExtraInfo;
        if (matchPunishExtraInfo != null) {
            _MatchPunishExtraInfo_ProtoDecoder.LJ(matchPunishExtraInfo);
        }
        EnigmaBattleSetting enigmaBattleSetting = linkMicBattleMessage2.enigmaBattleSetting;
        if (enigmaBattleSetting != null && enigmaBattleSetting.enigmaScoreRevealCountdownSec == null) {
            enigmaBattleSetting.enigmaScoreRevealCountdownSec = new ArrayList();
        }
        Map<Long, AnchorMatchSettings> map5 = linkMicBattleMessage2.anchorMatchSettings;
        if (map5 == null) {
            linkMicBattleMessage2.anchorMatchSettings = new HashMap();
        } else if (!map5.isEmpty()) {
            Iterator<Map.Entry<Long, AnchorMatchSettings>> it8 = linkMicBattleMessage2.anchorMatchSettings.entrySet().iterator();
            while (it8.hasNext()) {
                it8.next().getValue();
            }
        }
        LayoutData layoutData = linkMicBattleMessage2.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
        if (linkMicBattleMessage2.trackingExtra == null) {
            linkMicBattleMessage2.trackingExtra = new HashMap();
        }
        MatchThemeDisplayResource matchThemeDisplayResource = linkMicBattleMessage2.matchThemeDisplayResource;
        if (matchThemeDisplayResource != null) {
            _MatchThemeDisplayResource_ProtoDecoder.LJ(matchThemeDisplayResource);
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleMessage linkMicBattleMessage = new LinkMicBattleMessage();
        linkMicBattleMessage.leagueScoreInfoMap = new HashMap();
        linkMicBattleMessage.armies = new ArrayList();
        linkMicBattleMessage.teamArmies = new ArrayList();
        linkMicBattleMessage.teamBattleResult = new ArrayList();
        linkMicBattleMessage.abtestSettings = new ArrayList();
        linkMicBattleMessage.anchorMatchSettings = new HashMap();
        linkMicBattleMessage.battleResult = new HashMap();
        linkMicBattleMessage.teamUsers = new ArrayList();
        linkMicBattleMessage.trackingExtra = new HashMap();
        linkMicBattleMessage.leagueInfoMap = new HashMap();
        linkMicBattleMessage.inviteeGiftPermissionTypes = new ArrayList();
        linkMicBattleMessage.battleCombos = new HashMap();
        linkMicBattleMessage.anchorInfo = new ArrayList();
        linkMicBattleMessage.supportedActions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Object objLIZLLL = null;
                switch (iLJI) {
                    case 1:
                        linkMicBattleMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicBattleMessage.battleId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkMicBattleMessage.battleSetting = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkMicBattleMessage.action = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        BattleResult battleResultLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        battleResultLIZLLL = _BattleResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (objLIZLLL != null) {
                                    if (battleResultLIZLLL != null) {
                                        linkMicBattleMessage.battleResult.put((Long) objLIZLLL, battleResultLIZLLL);
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
                        linkMicBattleMessage.mBattleDisplayConfig = _BattleDisplayConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 8:
                        linkMicBattleMessage.inviteeGiftPermissionType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicBattleMessage.armies.add(_UserArmiesWrapper_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicBattleMessage.anchorInfo.add(_BattleUserInfoWrapper_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkMicBattleMessage.bubbleText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkMicBattleMessage.supportedActions.add(_SupportedActionsWrapper_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        BattleComboInfo battleComboInfoLIZLLL = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (objLIZLLL != null) {
                                    if (battleComboInfoLIZLLL != null) {
                                        linkMicBattleMessage.battleCombos.put((Long) objLIZLLL, battleComboInfoLIZLLL);
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
                        linkMicBattleMessage.teamUsers.add(_TeamUsersInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 15:
                        linkMicBattleMessage.inviteeGiftPermissionTypes.add(_BattleInviteeGiftPermission_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 16:
                        linkMicBattleMessage.actionByUserId = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        linkMicBattleMessage.teamBattleResult.add(_BattleTeamResult_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        linkMicBattleMessage.teamArmies.add(_BattleTeamUserArmies_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 19:
                        linkMicBattleMessage.abtestSettings.add(_BattleABTestSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        linkMicBattleMessage.teamMatchCampaign = _TeamMatchCampaign_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        linkMicBattleMessage.fuzzyDisplayConfigV2 = _HighScoreControlCfg_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        GiftGalleryBadgeInfo giftGalleryBadgeInfoLIZLLL = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        giftGalleryBadgeInfoLIZLLL = _GiftGalleryBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (objLIZLLL != null) {
                                    if (giftGalleryBadgeInfoLIZLLL != null) {
                                        linkMicBattleMessage.leagueInfoMap.put((Long) objLIZLLL, giftGalleryBadgeInfoLIZLLL);
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
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        LeagueScoreInfo leagueScoreInfoLIZLLL = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        leagueScoreInfoLIZLLL = _LeagueScoreInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (objLIZLLL != null) {
                                    if (leagueScoreInfoLIZLLL != null) {
                                        linkMicBattleMessage.leagueScoreInfoMap.put((Long) objLIZLLL, leagueScoreInfoLIZLLL);
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
                        linkMicBattleMessage.matchPunishExtraInfo = _MatchPunishExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                        linkMicBattleMessage.enigmaBattleSetting = _EnigmaBattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        long jLIZJ6 = c1516680pZS.LIZJ();
                        AnchorMatchSettings anchorMatchSettingsLIZLLL = null;
                        while (true) {
                            int iLJI6 = c1516680pZS.LJI();
                            if (iLJI6 != -1) {
                                if (iLJI6 != 1) {
                                    if (iLJI6 == 2) {
                                        anchorMatchSettingsLIZLLL = _AnchorMatchSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ6);
                                if (objLIZLLL != null) {
                                    if (anchorMatchSettingsLIZLLL != null) {
                                        linkMicBattleMessage.anchorMatchSettings.put((Long) objLIZLLL, anchorMatchSettingsLIZLLL);
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
                    case 27:
                        linkMicBattleMessage.battleFeatureFlags = _BattleFeatureFlags_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        linkMicBattleMessage.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        long jLIZJ7 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        while (true) {
                            int iLJI7 = c1516680pZS.LJI();
                            if (iLJI7 != -1) {
                                if (iLJI7 != 1) {
                                    if (iLJI7 == 2) {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ7);
                                if (objLIZLLL != null) {
                                    if (strLIZLLL != null) {
                                        linkMicBattleMessage.trackingExtra.put((String) objLIZLLL, strLIZLLL);
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
                    case 30:
                        linkMicBattleMessage.matchThemeDisplayResource = _MatchThemeDisplayResource_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleMessage linkMicBattleMessage, List list) {
    }
}
