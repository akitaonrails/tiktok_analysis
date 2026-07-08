package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.message.proto.ToolBarManagement;
import com.bytedance.android.livesdk.message.proto._ToolBarManagement_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._AnchorLevelPermission_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes36.dex */
public final class _RoomAuthStatus_ProtoDecoder implements C0IMD<RoomAuthStatus> {
    public static RoomAuthStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomAuthStatus roomAuthStatus = new RoomAuthStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    switch (iLJI) {
                                        case 7:
                                            roomAuthStatus.enableRoomContributor = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 8:
                                            roomAuthStatus.enableProps = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case BdTuring.TYPE_ECAF /* 9 */:
                                            roomAuthStatus.usercard = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                            roomAuthStatus.deprecated1 = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                            break;
                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                            roomAuthStatus.deprecated2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            roomAuthStatus.bannerState = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                            roomAuthStatus.deprecated3 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case 14:
                                            roomAuthStatus.deprecated4 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case 15:
                                            roomAuthStatus.landscape = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case 16:
                                            roomAuthStatus.landscapechat = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            roomAuthStatus.messageType = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            roomAuthStatus.anchorGiftType = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case 19:
                                            roomAuthStatus.deprecated5 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                            roomAuthStatus.donationSticker = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case 21:
                                            roomAuthStatus.deprecated6 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case 22:
                                            roomAuthStatus.deprecated7 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case 23:
                                            roomAuthStatus.deprecated8 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                            roomAuthStatus.deprecated9 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case 25:
                                            roomAuthStatus.enableQuestion = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 26:
                                            roomAuthStatus.enableChatL2 = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 27:
                                            roomAuthStatus.enableViewers = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 28:
                                            roomAuthStatus.enableShare = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 29:
                                            roomAuthStatus.giftRankSwitchStatus = c1516680pZS.LJIIJ();
                                            break;
                                        case 30:
                                            roomAuthStatus.enablePromote = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 31:
                                            roomAuthStatus.userCountDisplayState = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case 32:
                                            roomAuthStatus.rankState = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                            roomAuthStatus.broadcastmessage = Long.valueOf(c1516680pZS.LJIIJJI());
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                            roomAuthStatus.chatSubOnly = C1516700pZU.LIZ(c1516680pZS);
                                            break;
                                        case 35:
                                            roomAuthStatus.anchorRedEnvelopeType = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                            roomAuthStatus.quickCommentState = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case 37:
                                            roomAuthStatus.enablePoll = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        case 38:
                                            roomAuthStatus.enableGiftPoll = (int) c1516680pZS.LJIIJJI();
                                            break;
                                        default:
                                            switch (iLJI) {
                                                case 40:
                                                    roomAuthStatus.enableDrawGuess = c1516680pZS.LJIIJJI();
                                                    break;
                                                case 41:
                                                    roomAuthStatus.enableActivityTreasureBox = (int) c1516680pZS.LJIIJJI();
                                                    break;
                                                case 42:
                                                    roomAuthStatus.customizablepoll = Long.valueOf(c1516680pZS.LJIIJJI());
                                                    break;
                                                default:
                                                    switch (iLJI) {
                                                        case 100:
                                                            roomAuthStatus.roomAuthOffReasons = _RoomAuthOffReasons_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            break;
                                                        case 101:
                                                            roomAuthStatus.useUserPV = C1516700pZU.LIZ(c1516680pZS);
                                                            break;
                                                        case 102:
                                                            roomAuthStatus.promoteOther = (int) c1516680pZS.LJIIJJI();
                                                            break;
                                                        case 103:
                                                            roomAuthStatus.ecRankSwitchStatus = c1516680pZS.LJIIJ();
                                                            break;
                                                        default:
                                                            switch (iLJI) {
                                                                case 105:
                                                                    roomAuthStatus.eventpromotion = c1516680pZS.LJIIJ();
                                                                    break;
                                                                case 106:
                                                                    roomAuthStatus.commentFlaggedSwitch = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                case 107:
                                                                    roomAuthStatus.commentFlaggedReviewSwitch = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                case 108:
                                                                    roomAuthStatus.exploreEnabled = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                case 109:
                                                                    roomAuthStatus.pictionarypermission = c1516680pZS.LJIIJJI();
                                                                    break;
                                                                case 110:
                                                                    roomAuthStatus.pictionarybubble = c1516680pZS.LJIIJJI();
                                                                    break;
                                                                case 111:
                                                                    roomAuthStatus.anchorLevelPermission = _AnchorLevelPermission_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                    break;
                                                                case 112:
                                                                    roomAuthStatus.gamerankingswitch = c1516680pZS.LJIIJ();
                                                                    break;
                                                                case 113:
                                                                    roomAuthStatus.toolbarmanagement = _ToolBarManagement_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                    break;
                                                                case 114:
                                                                    roomAuthStatus.multienablereserve = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                case 115:
                                                                    roomAuthStatus.enablefanslevel = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                case 116:
                                                                    roomAuthStatus.secretroom = c1516680pZS.LJIIJJI();
                                                                    break;
                                                                case 117:
                                                                    roomAuthStatus.spamcomments = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                default:
                                                                    switch (iLJI) {
                                                                        case 120:
                                                                            roomAuthStatus.customErrorForGiftSetting = _RechargeCustomError_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                            break;
                                                                        case 121:
                                                                            roomAuthStatus.guessEntranceForHost = C1516700pZU.LIZ(c1516680pZS);
                                                                            break;
                                                                        case 122:
                                                                            roomAuthStatus.creditEntranceForAudience = C1516700pZU.LIZ(c1516680pZS);
                                                                            break;
                                                                        case 123:
                                                                            roomAuthStatus.gameGuessPermission = C1516700pZU.LIZ(c1516680pZS);
                                                                            break;
                                                                        case 124:
                                                                            roomAuthStatus.customizablegiftpoll = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case 125:
                                                                            roomAuthStatus.commentTrayStatus = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case 126:
                                                                            roomAuthStatus.rankingchangealterswitch = c1516680pZS.LJIIJ();
                                                                            break;
                                                                        case 127:
                                                                            roomAuthStatus.showCreditWidget = C1516700pZU.LIZ(c1516680pZS);
                                                                            break;
                                                                        case 128:
                                                                            roomAuthStatus.starCommentPermissionSwitch = _RoomAuthStatus_StarCommentPermissionSwitch_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                            break;
                                                                        case 129:
                                                                            roomAuthStatus.emotepoll = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case 130:
                                                                            roomAuthStatus.enableshowuseruv = C1516700pZU.LIZ(c1516680pZS);
                                                                            break;
                                                                        case 131:
                                                                            roomAuthStatus.viewerwishes = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case 132:
                                                                            roomAuthStatus.commentmention = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case 133:
                                                                            roomAuthStatus.enigmawhisper = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case 134:
                                                                            roomAuthStatus.friendrankswitch = c1516680pZS.LJIIJ();
                                                                            break;
                                                                        case 135:
                                                                            roomAuthStatus.musicgiftentrance = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        default:
                                                                            C1516700pZU.LJ(c1516680pZS);
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    roomAuthStatus.enableDigg = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                roomAuthStatus.enableLuckMoney = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            roomAuthStatus.enableGift = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        roomAuthStatus.enableDanmaku = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    roomAuthStatus.enableChat = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomAuthStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomAuthStatus roomAuthStatus) {
        RoomAuthStatus roomAuthStatus2 = roomAuthStatus;
        ToolBarManagement toolBarManagement = roomAuthStatus2.toolbarmanagement;
        if (toolBarManagement != null && toolBarManagement.mergingmorepriority == null) {
            toolBarManagement.mergingmorepriority = new ArrayList();
        }
        RechargeCustomError rechargeCustomError = roomAuthStatus2.customErrorForGiftSetting;
        if (rechargeCustomError != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
    }

    @Override // X.C0IMD
    public final RoomAuthStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomAuthStatus roomAuthStatus, List list) {
    }
}
