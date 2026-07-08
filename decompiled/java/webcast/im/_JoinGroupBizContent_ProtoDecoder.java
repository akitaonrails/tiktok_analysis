package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_Tag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._RivalsGameTag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_SecondDegreeRelationContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupBizContent_ProtoDecoder implements C0IMD<JoinGroupBizContent> {
    public static JoinGroupBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupBizContent joinGroupBizContent = new JoinGroupBizContent();
        joinGroupBizContent.abInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    switch (iLJI) {
                        case 1:
                            joinGroupBizContent.fromRoomAgeRestricted = c1516680pZS.LJIIJ();
                            break;
                        case 2:
                            joinGroupBizContent.fromTag = _RivalExtraInfo_Tag_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            joinGroupBizContent.dialog = _PerceptionDialogInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            joinGroupBizContent.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            joinGroupBizContent.topicInfo = _CohostTopic_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            joinGroupBizContent.algoRequestId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            joinGroupBizContent.cohostLayoutMode = c1516680pZS.LJIIJ();
                            break;
                        case 8:
                            joinGroupBizContent.tag = _TagV2_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            joinGroupBizContent.gameTag = _RivalsGameTag_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            switch (iLJI) {
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    joinGroupBizContent.newUserEducation = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
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
                                                    joinGroupBizContent.abInfos.put(lValueOf, cohostABInfoLIZLLL);
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
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    joinGroupBizContent.matchedPreferenceTag = c1516680pZS.LJIIJ();
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                            break;
                    }
                } else {
                    joinGroupBizContent.joinGroupMsgExtra = _JoinGroupMessageExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupBizContent;
            }
        }
    }

    public static void LJ(JoinGroupBizContent joinGroupBizContent) {
        TagV2.SecondDegreeRelationContent secondDegreeRelationContent;
        PerceptionDialogInfo perceptionDialogInfo = joinGroupBizContent.dialog;
        if (perceptionDialogInfo != null) {
            _PerceptionDialogInfo_ProtoDecoder.LJ(perceptionDialogInfo);
        }
        CohostTopic cohostTopic = joinGroupBizContent.topicInfo;
        if (cohostTopic != null) {
            _CohostTopic_ProtoDecoder.LJ(cohostTopic);
        }
        TagV2 tagV2 = joinGroupBizContent.tag;
        if (tagV2 != null && (secondDegreeRelationContent = tagV2.secondDegreeRelationContent) != null) {
            _TagV2_SecondDegreeRelationContent_ProtoDecoder.LJ(secondDegreeRelationContent);
        }
        Map<Long, CohostABInfo> map = joinGroupBizContent.abInfos;
        if (map == null) {
            joinGroupBizContent.abInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CohostABInfo>> it2 = joinGroupBizContent.abInfos.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        JoinGroupMessageExtra joinGroupMessageExtra = joinGroupBizContent.joinGroupMsgExtra;
        if (joinGroupMessageExtra != null) {
            _JoinGroupMessageExtra_ProtoDecoder.LJ(joinGroupMessageExtra);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupBizContent joinGroupBizContent) {
        LJ(joinGroupBizContent);
    }

    @Override // X.C0IMD
    public final JoinGroupBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupBizContent joinGroupBizContent, List list) {
    }
}
