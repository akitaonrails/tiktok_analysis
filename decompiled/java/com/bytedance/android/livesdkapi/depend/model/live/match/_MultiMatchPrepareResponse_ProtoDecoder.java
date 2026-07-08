package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiMatchPrepareResponse_ProtoDecoder implements C0IMD<MultiMatchPrepareResponse> {
    @Override // X.C0IMD
    public final void LIZ(MultiMatchPrepareResponse multiMatchPrepareResponse) {
        MultiMatchPrepareResponse multiMatchPrepareResponse2 = multiMatchPrepareResponse;
        if (multiMatchPrepareResponse2.anchorsPermission == null) {
            multiMatchPrepareResponse2.anchorsPermission = new HashMap();
        }
        Map<Long, BattleABTestList> map = multiMatchPrepareResponse2.abTestSettings;
        if (map == null) {
            multiMatchPrepareResponse2.abTestSettings = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleABTestList>> it2 = multiMatchPrepareResponse2.abTestSettings.entrySet().iterator();
            while (it2.hasNext()) {
                BattleABTestList value = it2.next().getValue();
                if (value != null) {
                    _BattleABTestList_ProtoDecoder.LJ(value);
                }
            }
        }
        List<GiftMode> list = multiMatchPrepareResponse2.giftMode;
        if (list == null) {
            multiMatchPrepareResponse2.giftMode = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftMode giftMode : multiMatchPrepareResponse2.giftMode) {
                if (giftMode != null) {
                    _GiftMode_ProtoDecoder.LJ(giftMode);
                }
            }
        }
        Text text = multiMatchPrepareResponse2.giftEventDesc;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Map<Long, GiftGalleryBadgeInfo> map2 = multiMatchPrepareResponse2.leagueInfoMap;
        if (map2 == null) {
            multiMatchPrepareResponse2.leagueInfoMap = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, GiftGalleryBadgeInfo>> it3 = multiMatchPrepareResponse2.leagueInfoMap.entrySet().iterator();
            while (it3.hasNext()) {
                GiftGalleryBadgeInfo value2 = it3.next().getValue();
                if (value2 != null) {
                    _GiftGalleryBadgeInfo_ProtoDecoder.LJ(value2);
                }
            }
        }
        Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> map3 = multiMatchPrepareResponse2.availableMatchOptions;
        if (map3 == null) {
            multiMatchPrepareResponse2.availableMatchOptions = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, MultiMatchPrepareResponse.MatchGameplayPermission>> it4 = multiMatchPrepareResponse2.availableMatchOptions.entrySet().iterator();
            while (it4.hasNext()) {
                it4.next().getValue();
            }
        }
        Map<Integer, AnchorGiftModeMap> map4 = multiMatchPrepareResponse2.anchorGiftModeMapByType;
        if (map4 == null) {
            multiMatchPrepareResponse2.anchorGiftModeMapByType = new HashMap();
        } else if (!map4.isEmpty()) {
            Iterator<Map.Entry<Integer, AnchorGiftModeMap>> it5 = multiMatchPrepareResponse2.anchorGiftModeMapByType.entrySet().iterator();
            while (it5.hasNext()) {
                AnchorGiftModeMap value3 = it5.next().getValue();
                if (value3 != null) {
                    _AnchorGiftModeMap_ProtoDecoder.LJ(value3);
                }
            }
        }
        List<Playbook> list2 = multiMatchPrepareResponse2.matchPlaybooks;
        if (list2 == null) {
            multiMatchPrepareResponse2.matchPlaybooks = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (Playbook playbook : multiMatchPrepareResponse2.matchPlaybooks) {
            if (playbook != null) {
                _Playbook_ProtoDecoder.LJ(playbook);
            }
        }
    }

    @Override // X.C0IMD
    public final MultiMatchPrepareResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiMatchPrepareResponse multiMatchPrepareResponse = new MultiMatchPrepareResponse();
        multiMatchPrepareResponse.anchorGiftModeMapByType = new HashMap();
        multiMatchPrepareResponse.matchPlaybooks = new ArrayList();
        multiMatchPrepareResponse.giftMode = new ArrayList();
        multiMatchPrepareResponse.leagueInfoMap = new HashMap();
        multiMatchPrepareResponse.availableMatchOptions = new HashMap();
        multiMatchPrepareResponse.anchorsPermission = new HashMap();
        multiMatchPrepareResponse.abTestSettings = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 50) {
                    Object objValueOf = null;
                    switch (iLJI) {
                        case 1:
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Integer numValueOf = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 != -1) {
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                        }
                                    } else {
                                        objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (objValueOf != null) {
                                        if (numValueOf != null) {
                                            multiMatchPrepareResponse.anchorsPermission.put((Long) objValueOf, numValueOf);
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
                        case 2:
                            multiMatchPrepareResponse.recommendTeamMate = Long.valueOf(c1516680pZS.LJIIJJI());
                            break;
                        case 3:
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            BattleABTestList battleABTestListLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 != -1) {
                                    if (iLJI3 != 1) {
                                        if (iLJI3 == 2) {
                                            battleABTestListLIZLLL = _BattleABTestList_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ3);
                                    if (objValueOf != null) {
                                        if (battleABTestListLIZLLL != null) {
                                            multiMatchPrepareResponse.abTestSettings.put((Long) objValueOf, battleABTestListLIZLLL);
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
                            multiMatchPrepareResponse.giftMode.add(_GiftMode_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 5:
                            multiMatchPrepareResponse.ruleGuideUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            multiMatchPrepareResponse.bestTeammateId = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            multiMatchPrepareResponse.giftEventDesc = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            multiMatchPrepareResponse.punishedAnchor = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            multiMatchPrepareResponse.punishEndTimestamp = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
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
                                        objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ4);
                                    if (objValueOf != null) {
                                        if (giftGalleryBadgeInfoLIZLLL != null) {
                                            multiMatchPrepareResponse.leagueInfoMap.put((Long) objValueOf, giftGalleryBadgeInfoLIZLLL);
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
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            long jLIZJ5 = c1516680pZS.LIZJ();
                            MultiMatchPrepareResponse.MatchGameplayPermission matchGameplayPermissionLIZLLL = null;
                            while (true) {
                                int iLJI5 = c1516680pZS.LJI();
                                if (iLJI5 != -1) {
                                    if (iLJI5 != 1) {
                                        if (iLJI5 == 2) {
                                            matchGameplayPermissionLIZLLL = _MultiMatchPrepareResponse_MatchGameplayPermission_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ5);
                                    if (objValueOf != null) {
                                        if (matchGameplayPermissionLIZLLL != null) {
                                            multiMatchPrepareResponse.availableMatchOptions.put((Long) objValueOf, matchGameplayPermissionLIZLLL);
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
                            multiMatchPrepareResponse.matchSettingsInfo = _MatchSettingsInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            long jLIZJ6 = c1516680pZS.LIZJ();
                            AnchorGiftModeMap anchorGiftModeMapLIZLLL = null;
                            while (true) {
                                int iLJI6 = c1516680pZS.LJI();
                                if (iLJI6 != -1) {
                                    if (iLJI6 != 1) {
                                        if (iLJI6 == 2) {
                                            anchorGiftModeMapLIZLLL = _AnchorGiftModeMap_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        objValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ6);
                                    if (objValueOf != null) {
                                        if (anchorGiftModeMapLIZLLL != null) {
                                            multiMatchPrepareResponse.anchorGiftModeMapByType.put((Integer) objValueOf, anchorGiftModeMapLIZLLL);
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
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    multiMatchPrepareResponse.matchPlaybooks.add(_Playbook_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiMatchPrepareResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiMatchPrepareResponse multiMatchPrepareResponse, List list) {
    }
}
