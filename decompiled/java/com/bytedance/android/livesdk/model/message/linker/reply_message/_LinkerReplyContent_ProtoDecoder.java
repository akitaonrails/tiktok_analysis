package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message._LinkmicUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mic_update._LinkerMicIdxUpdateInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerReplyContent_ProtoDecoder implements C0IMD<LinkerReplyContent> {
    public static LinkerReplyContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerReplyContent linkerReplyContent = new LinkerReplyContent();
        linkerReplyContent.linkedUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                switch (iLJI) {
                    case 1:
                        linkerReplyContent.inviterUid = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        linkerReplyContent.inviterRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkerReplyContent.inviterLinkmicInfo = _LinkmicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkerReplyContent.inviteeUid = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkerReplyContent.inviteeLinkmicInfo = _LinkmicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkerReplyContent.linkType = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkerReplyContent.replyStatus = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        linkerReplyContent.linkerSetting = _LinkerSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkerReplyContent.inviterUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkerReplyContent.inviteeUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
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
                                        linkerReplyContent.rtcExtInfoMap.put(lValueOf, strLIZLLL);
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
                        linkerReplyContent.inviteeMicIdxUpdateInfo = _LinkerMicIdxUpdateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (lValueOf2 != null) {
                                        linkerReplyContent.applierMicIdxInfoMap.put(lValueOf, lValueOf2);
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
                        linkerReplyContent.multiLiveLayoutEnable = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        linkerReplyContent.multiLiveSetting = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        linkerReplyContent.actionId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        linkerReplyContent.linkedUsers.add(_LinkmicUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        linkerReplyContent.sourceType = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerReplyContent;
            }
        }
    }

    public static void LJ(LinkerReplyContent linkerReplyContent) {
        User user = linkerReplyContent.inviterUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = linkerReplyContent.inviteeUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        List<LinkmicUserInfo> list = linkerReplyContent.linkedUsers;
        if (list == null) {
            linkerReplyContent.linkedUsers = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LinkmicUserInfo> it2 = linkerReplyContent.linkedUsers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerReplyContent linkerReplyContent) {
        LJ(linkerReplyContent);
    }

    @Override // X.C0IMD
    public final LinkerReplyContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerReplyContent linkerReplyContent, List list) {
    }
}
