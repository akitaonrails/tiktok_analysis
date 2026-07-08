package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._EOYBanner_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._EOYBanner_StreakInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsListsData_ProtoDecoder implements C0IMD<RivalsListsData> {
    @Override // X.C0IMD
    public final void LIZ(RivalsListsData rivalsListsData) {
        RivalsListsData.OffliveInvitationBanner offliveInvitationBanner;
        EOYBanner.StreakInfo streakInfo;
        QuickCohostContentInfo quickCohostContentInfo;
        ImageModel imageModel;
        RivalsListsData rivalsListsData2 = rivalsListsData;
        List<Room> list = rivalsListsData2.followedList;
        if (list == null) {
            rivalsListsData2.followedList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Room room : rivalsListsData2.followedList) {
                if (room != null) {
                    _Room_ProtoDecoder.LJ(room);
                }
            }
        }
        List<Room> list2 = rivalsListsData2.recentList;
        if (list2 == null) {
            rivalsListsData2.recentList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (Room room2 : rivalsListsData2.recentList) {
                if (room2 != null) {
                    _Room_ProtoDecoder.LJ(room2);
                }
            }
        }
        List<Room> list3 = rivalsListsData2.recommendList;
        if (list3 == null) {
            rivalsListsData2.recommendList = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (Room room3 : rivalsListsData2.recommendList) {
                if (room3 != null) {
                    _Room_ProtoDecoder.LJ(room3);
                }
            }
        }
        Map<Long, RivalExtraInfo> map = rivalsListsData2.rivalExtraInfos;
        if (map == null) {
            rivalsListsData2.rivalExtraInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, RivalExtraInfo>> it2 = rivalsListsData2.rivalExtraInfos.entrySet().iterator();
            while (it2.hasNext()) {
                RivalExtraInfo value = it2.next().getValue();
                if (value != null) {
                    _RivalExtraInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        AutoMatchBanner autoMatchBanner = rivalsListsData2.autoMatchBanner;
        if (autoMatchBanner != null) {
            Text text = autoMatchBanner.mainGuideText;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            Text text2 = autoMatchBanner.subGuideText;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
            Text text3 = autoMatchBanner.buttonText;
            if (text3 != null) {
                _Text_ProtoDecoder.LJ(text3);
            }
        }
        SearchBar searchBar = rivalsListsData2.searchBar;
        if (searchBar != null && (imageModel = searchBar.bgImage) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        RivalsListsData.BannerText bannerText = rivalsListsData2.bannerText;
        if (bannerText != null && (quickCohostContentInfo = bannerText.quickCohostContentInfo) != null) {
            _QuickCohostContentInfo_ProtoDecoder.LJ(quickCohostContentInfo);
        }
        Map<Long, RivalsListsData.TopHostInfo> map2 = rivalsListsData2.roomTopHostInfo;
        if (map2 == null) {
            rivalsListsData2.roomTopHostInfo = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, RivalsListsData.TopHostInfo>> it3 = rivalsListsData2.roomTopHostInfo.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        List<Room> list4 = rivalsListsData2.bestTeammateList;
        if (list4 == null) {
            rivalsListsData2.bestTeammateList = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (Room room4 : rivalsListsData2.bestTeammateList) {
                if (room4 != null) {
                    _Room_ProtoDecoder.LJ(room4);
                }
            }
        }
        List<Room> list5 = rivalsListsData2.reservedList;
        if (list5 == null) {
            rivalsListsData2.reservedList = new ArrayList();
        } else if (!list5.isEmpty()) {
            for (Room room5 : rivalsListsData2.reservedList) {
                if (room5 != null) {
                    _Room_ProtoDecoder.LJ(room5);
                }
            }
        }
        List<Room> list6 = rivalsListsData2.mayKnowList;
        if (list6 == null) {
            rivalsListsData2.mayKnowList = new ArrayList();
        } else if (!list6.isEmpty()) {
            for (Room room6 : rivalsListsData2.mayKnowList) {
                if (room6 != null) {
                    _Room_ProtoDecoder.LJ(room6);
                }
            }
        }
        List<Room> list7 = rivalsListsData2.mixedList;
        if (list7 == null) {
            rivalsListsData2.mixedList = new ArrayList();
        } else if (!list7.isEmpty()) {
            for (Room room7 : rivalsListsData2.mixedList) {
                if (room7 != null) {
                    _Room_ProtoDecoder.LJ(room7);
                }
            }
        }
        List<Room> list8 = rivalsListsData2.eoyRankList;
        if (list8 == null) {
            rivalsListsData2.eoyRankList = new ArrayList();
        } else if (!list8.isEmpty()) {
            for (Room room8 : rivalsListsData2.eoyRankList) {
                if (room8 != null) {
                    _Room_ProtoDecoder.LJ(room8);
                }
            }
        }
        List<Room> list9 = rivalsListsData2.gameList;
        if (list9 == null) {
            rivalsListsData2.gameList = new ArrayList();
        } else if (!list9.isEmpty()) {
            for (Room room9 : rivalsListsData2.gameList) {
                if (room9 != null) {
                    _Room_ProtoDecoder.LJ(room9);
                }
            }
        }
        CohostTopic cohostTopic = rivalsListsData2.topicBanner;
        if (cohostTopic != null) {
            _CohostTopic_ProtoDecoder.LJ(cohostTopic);
        }
        TopicExtraInfo topicExtraInfo = rivalsListsData2.topicExtraInfo;
        if (topicExtraInfo != null) {
            _TopicExtraInfo_ProtoDecoder.LJ(topicExtraInfo);
        }
        GuidePopupBanner guidePopupBanner = rivalsListsData2.guidePopupBanner;
        if (guidePopupBanner != null) {
            _GuidePopupBanner_ProtoDecoder.LJ(guidePopupBanner);
        }
        EOYBanner eOYBanner = rivalsListsData2.eoyBanner;
        if (eOYBanner != null && (streakInfo = eOYBanner.streakInfo) != null) {
            _EOYBanner_StreakInfo_ProtoDecoder.LJ(streakInfo);
        }
        List<BattleOptPair> list10 = rivalsListsData2.battleOptPairList;
        if (list10 == null) {
            rivalsListsData2.battleOptPairList = new ArrayList();
        } else if (!list10.isEmpty()) {
            for (BattleOptPair battleOptPair : rivalsListsData2.battleOptPairList) {
                if (battleOptPair != null) {
                    _BattleOptPair_ProtoDecoder.LJ(battleOptPair);
                }
            }
        }
        List<Room> list11 = rivalsListsData2.leagueRecommendList;
        if (list11 == null) {
            rivalsListsData2.leagueRecommendList = new ArrayList();
        } else if (!list11.isEmpty()) {
            for (Room room10 : rivalsListsData2.leagueRecommendList) {
                if (room10 != null) {
                    _Room_ProtoDecoder.LJ(room10);
                }
            }
        }
        CohostPanelBanner cohostPanelBanner = rivalsListsData2.cohostPanelBanner;
        if (cohostPanelBanner != null) {
            _CohostPanelBanner_ProtoDecoder.LJ(cohostPanelBanner);
        }
        List<Room> list12 = rivalsListsData2.friendSearchList;
        if (list12 == null) {
            rivalsListsData2.friendSearchList = new ArrayList();
        } else if (!list12.isEmpty()) {
            for (Room room11 : rivalsListsData2.friendSearchList) {
                if (room11 != null) {
                    _Room_ProtoDecoder.LJ(room11);
                }
            }
        }
        RivalsListsData.OffliveInvitationInfo offliveInvitationInfo = rivalsListsData2.offliveInvitationInfo;
        if (offliveInvitationInfo != null && (offliveInvitationBanner = offliveInvitationInfo.offliveInvitationBanner) != null) {
            _RivalsListsData_OffliveInvitationBanner_ProtoDecoder.LJ(offliveInvitationBanner);
        }
        List<Room> list13 = rivalsListsData2.viewerSuggestionList;
        if (list13 == null) {
            rivalsListsData2.viewerSuggestionList = new ArrayList();
        } else if (!list13.isEmpty()) {
            for (Room room12 : rivalsListsData2.viewerSuggestionList) {
                if (room12 != null) {
                    _Room_ProtoDecoder.LJ(room12);
                }
            }
        }
        DynamicListConfig dynamicListConfig = rivalsListsData2.dynamicListConfig;
        if (dynamicListConfig != null) {
            _DynamicListConfig_ProtoDecoder.LJ(dynamicListConfig);
        }
    }

    @Override // X.C0IMD
    public final RivalsListsData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RivalsListsData rivalsListsData = new RivalsListsData();
        rivalsListsData.reservedList = new ArrayList();
        rivalsListsData.bestTeammateList = new ArrayList();
        rivalsListsData.recommendList = new ArrayList();
        rivalsListsData.roomTopHostInfo = new HashMap();
        rivalsListsData.mayKnowList = new ArrayList();
        rivalsListsData.followedList = new ArrayList();
        rivalsListsData.friendSearchList = new ArrayList();
        rivalsListsData.battleOptPairList = new ArrayList();
        rivalsListsData.leagueRecommendList = new ArrayList();
        rivalsListsData.viewerSuggestionList = new ArrayList();
        rivalsListsData.gameList = new ArrayList();
        rivalsListsData.mixedList = new ArrayList();
        rivalsListsData.recentList = new ArrayList();
        rivalsListsData.eoyRankList = new ArrayList();
        rivalsListsData.rivalExtraInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 51) {
                    Long lValueOf = null;
                    switch (iLJI) {
                        case 1:
                            rivalsListsData.followedList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 2:
                            rivalsListsData.recentList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 3:
                            rivalsListsData.recommendList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 4:
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            RivalExtraInfo rivalExtraInfoLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 != -1) {
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            rivalExtraInfoLIZLLL = _RivalExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (rivalExtraInfoLIZLLL != null) {
                                            rivalsListsData.rivalExtraInfos.put(lValueOf, rivalExtraInfoLIZLLL);
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
                            rivalsListsData.autoMatchBanner = _AutoMatchBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            rivalsListsData.tips = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            rivalsListsData.searchBar = _SearchBar_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            rivalsListsData.bannerText = _RivalsListsData_BannerText_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            RivalsListsData.TopHostInfo topHostInfoLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 != -1) {
                                    if (iLJI3 != 1) {
                                        if (iLJI3 == 2) {
                                            topHostInfoLIZLLL = _RivalsListsData_TopHostInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ3);
                                    if (lValueOf != null) {
                                        if (topHostInfoLIZLLL != null) {
                                            rivalsListsData.roomTopHostInfo.put(lValueOf, topHostInfoLIZLLL);
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
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            rivalsListsData.bestTeammateList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            rivalsListsData.reservedList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            rivalsListsData.mayKnowList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            rivalsListsData.mixedList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 14:
                            rivalsListsData.eoyRankList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 15:
                            rivalsListsData.gameList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            switch (iLJI) {
                                case 21:
                                    rivalsListsData.topicBanner = _CohostTopic_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 22:
                                    rivalsListsData.topicExtraInfo = _TopicExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 23:
                                    rivalsListsData.guidePopupBanner = _GuidePopupBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    rivalsListsData.eoyBanner = _EOYBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 25:
                                    rivalsListsData.battleOptPairList.add(_BattleOptPair_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 26:
                                    rivalsListsData.leagueRecommendList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 27:
                                    rivalsListsData.cohostPanelBanner = _CohostPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 28:
                                    rivalsListsData.friendSearchList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                default:
                                    switch (iLJI) {
                                        case 31:
                                            rivalsListsData.statusText = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 32:
                                            rivalsListsData.statusTextType = c1516680pZS.LJIIJ();
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                            rivalsListsData.offliveInvitationInfo = _RivalsListsData_OffliveInvitationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                            rivalsListsData.viewerSuggestionList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                                            break;
                                        case 35:
                                            rivalsListsData.refreshSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    rivalsListsData.dynamicListConfig = _DynamicListConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalsListsData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsListsData rivalsListsData, List list) {
    }
}
