package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostSettingsInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostSettingsInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicSessionStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleInfoResponse_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomLinkInfo_ProtoDecoder implements C0IMD<RoomLinkInfo> {
    public static RoomLinkInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomLinkInfo roomLinkInfo = new RoomLinkInfo();
        roomLinkInfo.abInfos = new HashMap();
        roomLinkInfo.linkedUsers = new ArrayList();
        roomLinkInfo.audienceIdList = new ArrayList();
        roomLinkInfo.showUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 13) {
                            if (iLJI != 14) {
                                if (iLJI != 53) {
                                    if (iLJI != 54) {
                                        switch (iLJI) {
                                            case 5:
                                                roomLinkInfo.rivalAnchorId = c1516680pZS.LJIIJJI();
                                                break;
                                            case 6:
                                                roomLinkInfo.audienceIdList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                                                break;
                                            case 7:
                                                roomLinkInfo.showUserList.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                                                break;
                                            case 8:
                                                roomLinkInfo.followedCount = c1516680pZS.LJIIJJI();
                                                break;
                                            case BdTuring.TYPE_ECAF /* 9 */:
                                                roomLinkInfo.linkedUsers.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                roomLinkInfo.battleInfo = _BattleInfoResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                roomLinkInfo.MultiLiveType = c1516680pZS.LJIIJJI();
                                                break;
                                            default:
                                                switch (iLJI) {
                                                    case 60:
                                                        roomLinkInfo.competitionInfo = _CompetitionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                        break;
                                                    case 61:
                                                        roomLinkInfo.cohostSettingsInfo = _CohostSettingsInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                        break;
                                                    case BaseNotice.CREATOR /* 62 */:
                                                        long jLIZJ2 = c1516680pZS.LIZJ();
                                                        Long lValueOf = null;
                                                        CohostABInfo cohostABInfoLIZLLL = null;
                                                        while (true) {
                                                            int iLJI2 = c1516680pZS.LJI();
                                                            if (iLJI2 != -1) {
                                                                if (iLJI2 != 1) {
                                                                    if (iLJI2 == 2) {
                                                                        cohostABInfoLIZLLL = _CohostABInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                    }
                                                                } else {
                                                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                                                }
                                                            } else {
                                                                c1516680pZS.LJ(jLIZJ2);
                                                                if (lValueOf != null) {
                                                                    if (cohostABInfoLIZLLL != null) {
                                                                        roomLinkInfo.abInfos.put(lValueOf, cohostABInfoLIZLLL);
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
                                                    case 63:
                                                        roomLinkInfo.linkMicChannel = c1516680pZS.LJIIJJI();
                                                        break;
                                                    case 64:
                                                        roomLinkInfo.layoutConfig = _RoomLinkInfo_LinkmicLayoutConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                                                        break;
                                                    case 65:
                                                        roomLinkInfo.linkmicUnifyChannelId = c1516680pZS.LJIIJJI();
                                                        break;
                                                    case 66:
                                                        roomLinkInfo.multiGuestEnable = C1516700pZU.LIZ(c1516680pZS);
                                                        break;
                                                    case 67:
                                                        roomLinkInfo.subtitleEnable = c1516680pZS.LJIIJ();
                                                        break;
                                                    default:
                                                        C1516700pZU.LJ(c1516680pZS);
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        roomLinkInfo.topicStatus = _TopicSessionStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    roomLinkInfo.topicInfo = _CohostTopic_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                roomLinkInfo.audienceLinkmicRelation = _RoomLinkInfo_AudienceLinkmicRelation_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            roomLinkInfo.linkerMode = c1516680pZS.LJIIJ();
                        }
                    } else {
                        roomLinkInfo.channelInfo = _ChannelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomLinkInfo.channelId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomLinkInfo;
            }
        }
    }

    public static void LJ(RoomLinkInfo roomLinkInfo) {
        if (roomLinkInfo.audienceIdList == null) {
            roomLinkInfo.audienceIdList = new ArrayList();
        }
        List<User> list = roomLinkInfo.showUserList;
        if (list == null) {
            roomLinkInfo.showUserList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (User user : roomLinkInfo.showUserList) {
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<User> list2 = roomLinkInfo.linkedUsers;
        if (list2 == null) {
            roomLinkInfo.linkedUsers = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (User user2 : roomLinkInfo.linkedUsers) {
                if (user2 != null) {
                    _User_ProtoDecoder.LJ(user2);
                }
            }
        }
        BattleInfoResponse battleInfoResponse = roomLinkInfo.battleInfo;
        if (battleInfoResponse != null) {
            _BattleInfoResponse_ProtoDecoder.LJ(battleInfoResponse);
        }
        RoomLinkInfo.AudienceLinkmicRelation audienceLinkmicRelation = roomLinkInfo.audienceLinkmicRelation;
        if (audienceLinkmicRelation != null && audienceLinkmicRelation.relationMap == null) {
            audienceLinkmicRelation.relationMap = new HashMap();
        }
        CohostTopic cohostTopic = roomLinkInfo.topicInfo;
        if (cohostTopic != null) {
            _CohostTopic_ProtoDecoder.LJ(cohostTopic);
        }
        CompetitionInfo competitionInfo = roomLinkInfo.competitionInfo;
        if (competitionInfo != null) {
            _CompetitionInfo_ProtoDecoder.LJ(competitionInfo);
        }
        CohostSettingsInfo cohostSettingsInfo = roomLinkInfo.cohostSettingsInfo;
        if (cohostSettingsInfo != null && cohostSettingsInfo.anchorSettings == null) {
            cohostSettingsInfo.anchorSettings = new HashMap();
        }
        Map<Long, CohostABInfo> map = roomLinkInfo.abInfos;
        if (map == null) {
            roomLinkInfo.abInfos = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, CohostABInfo>> it2 = roomLinkInfo.abInfos.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomLinkInfo roomLinkInfo) {
        LJ(roomLinkInfo);
    }

    @Override // X.C0IMD
    public final RoomLinkInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomLinkInfo roomLinkInfo, List list) {
    }
}
