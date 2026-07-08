package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_Tag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestList;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABTestList_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABTestSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message._InviteTopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkmicUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerInviteContent_ProtoDecoder implements C0IMD<LinkerInviteContent> {
    public static LinkerInviteContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerInviteContent linkerInviteContent = new LinkerInviteContent();
        linkerInviteContent.linkedUsers = new ArrayList();
        linkerInviteContent.abTestSetting = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    switch (iLJI) {
                        case 1:
                            linkerInviteContent.fromUserId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            linkerInviteContent.fromRoomId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            linkerInviteContent.toRtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            linkerInviteContent.rtcJoinChannel = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 5:
                            linkerInviteContent.vendor = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            linkerInviteContent.secFromUserId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            linkerInviteContent.toLinkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            linkerInviteContent.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            linkerInviteContent.requiredMicIdx = Long.valueOf(c1516680pZS.LJIIJJI());
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Long lValueOf = null;
                            String strLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 != -1) {
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (strLIZLLL != null) {
                                            linkerInviteContent.rtcExtInfoMap.put(lValueOf, strLIZLLL);
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
                            linkerInviteContent.multiLiveLayoutEnable = c1516680pZS.LJIIJ();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            linkerInviteContent.multiLiveSetting = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            linkerInviteContent.fromLinkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        default:
                            switch (iLJI) {
                                case 16:
                                    linkerInviteContent.fromTopHostInfo = _InviteTopHostInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    linkerInviteContent.actionId = Long.valueOf(c1516680pZS.LJIIJJI());
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    linkerInviteContent.linkedUsers.add(_LinkmicUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 19:
                                    linkerInviteContent.dialogInfo = _PerceptionDialogInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    linkerInviteContent.punishEventInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 21:
                                    linkerInviteContent.fromRoomAgeRestricted = c1516680pZS.LJIIJ();
                                    break;
                                case 22:
                                    linkerInviteContent.tag = _RivalExtraInfo_Tag_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 23:
                                    linkerInviteContent.abTestSetting.add(_CohostABTestSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                            break;
                    }
                } else {
                    linkerInviteContent.linkerInviteMsgExtra = _LinkerInviteMessageExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerInviteContent;
            }
        }
    }

    public static void LJ(LinkerInviteContent linkerInviteContent) {
        CohostABTestList cohostABTestList;
        User user = linkerInviteContent.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        List<LinkmicUserInfo> list = linkerInviteContent.linkedUsers;
        if (list == null) {
            linkerInviteContent.linkedUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LinkmicUserInfo> it2 = linkerInviteContent.linkedUsers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PerceptionDialogInfo perceptionDialogInfo = linkerInviteContent.dialogInfo;
        if (perceptionDialogInfo != null) {
            _PerceptionDialogInfo_ProtoDecoder.LJ(perceptionDialogInfo);
        }
        List<CohostABTestSetting> list2 = linkerInviteContent.abTestSetting;
        if (list2 == null) {
            linkerInviteContent.abTestSetting = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (CohostABTestSetting cohostABTestSetting : linkerInviteContent.abTestSetting) {
                if (cohostABTestSetting != null && (cohostABTestList = cohostABTestSetting.value) != null) {
                    _CohostABTestList_ProtoDecoder.LJ(cohostABTestList);
                }
            }
        }
        LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra;
        if (linkerInviteMessageExtra != null) {
            _LinkerInviteMessageExtra_ProtoDecoder.LJ(linkerInviteMessageExtra);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerInviteContent linkerInviteContent) {
        LJ(linkerInviteContent);
    }

    @Override // X.C0IMD
    public final LinkerInviteContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerInviteContent linkerInviteContent, List list) {
    }
}
