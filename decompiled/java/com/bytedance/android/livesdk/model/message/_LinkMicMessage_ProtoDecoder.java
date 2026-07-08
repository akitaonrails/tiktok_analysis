package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _LinkMicMessage_ProtoDecoder implements C0IMD<LinkMicMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicMessage linkMicMessage) {
        CommonMessageData commonMessageData = linkMicMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final LinkMicMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicMessage linkMicMessage = new LinkMicMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicMessage.mType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkMicMessage.accessKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkMicMessage.anchorLinkMicId = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkMicMessage.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkMicMessage.fanTicket = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkMicMessage.totalFanTicket = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        linkMicMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicMessage.layout = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicMessage.vendor = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkMicMessage.dimension = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkMicMessage.theme = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        linkMicMessage.inviteUid = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        linkMicMessage.reply = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    case 22:
                    case 23:
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    case 31:
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 16:
                        linkMicMessage.duration = (int) c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        linkMicMessage.matchType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        linkMicMessage.win = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        linkMicMessage.prompts = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        linkMicMessage.toUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 25:
                        linkMicMessage.tips = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        linkMicMessage.startTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 27:
                        linkMicMessage.confluenceType = c1516680pZS.LJIIJ();
                        break;
                    case 28:
                        linkMicMessage.fromRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 29:
                        linkMicMessage.inviteType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 30:
                        linkMicMessage.subType = c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        linkMicMessage.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        linkMicMessage.appId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 35:
                        linkMicMessage.appSign = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 37:
                        linkMicMessage.anchorLinkMicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 38:
                        linkMicMessage.rivalAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 39:
                        linkMicMessage.rivalLinkmicId = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 40:
                        linkMicMessage.rivalLinkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 41:
                        linkMicMessage.shouldShowPopup = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 51:
                        linkMicMessage.rtcJoinChannel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 52:
                        linkMicMessage.fanTicketType = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicMessage linkMicMessage, List list) {
    }
}
