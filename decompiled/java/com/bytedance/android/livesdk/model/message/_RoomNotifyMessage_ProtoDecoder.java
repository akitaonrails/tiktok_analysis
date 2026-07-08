package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomNotifyMessage_ProtoDecoder implements C0IMD<RoomNotifyMessage> {
    public static RoomNotifyMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomNotifyMessage roomNotifyMessage = new RoomNotifyMessage();
        roomNotifyMessage.flexSetting = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomNotifyMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        roomNotifyMessage.notifyType = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        roomNotifyMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        roomNotifyMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        roomNotifyMessage.extra = _RoomNotifyMessageExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomNotifyMessage.notifyClass = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        roomNotifyMessage.flexSetting.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        roomNotifyMessage.source = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        roomNotifyMessage.from_user_id = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        roomNotifyMessage.logExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        roomNotifyMessage.to_anchor_id = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        roomNotifyMessage.eventTracking = _EventTracking_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomNotifyMessage;
            }
        }
    }

    public static void LJ(RoomNotifyMessage roomNotifyMessage) {
        CommonMessageData commonMessageData = roomNotifyMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = roomNotifyMessage.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        RoomNotifyMessageExtra roomNotifyMessageExtra = roomNotifyMessage.extra;
        if (roomNotifyMessageExtra != null) {
            RoomNotifyMessageExtra.Background background = roomNotifyMessageExtra.background;
            if (background != null && background.mUrls == null) {
                background.mUrls = new ArrayList();
            }
            NotifyHighlightInfo notifyHighlightInfo = roomNotifyMessageExtra.highlightInfo;
            if (notifyHighlightInfo != null) {
                _NotifyHighlightInfo_ProtoDecoder.LJ(notifyHighlightInfo);
            }
        }
        if (roomNotifyMessage.flexSetting == null) {
            roomNotifyMessage.flexSetting = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomNotifyMessage roomNotifyMessage) {
        LJ(roomNotifyMessage);
    }

    @Override // X.C0IMD
    public final RoomNotifyMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomNotifyMessage roomNotifyMessage, List list) {
    }
}
