package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.data.FansLevelInfo;
import webcast.data._FansLevelInfo_ProtoDecoder;
import webcast.data._FansLevelUpgradeInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventMessage_ProtoDecoder implements C0IMD<FansEventMessage> {
    @Override // X.C0IMD
    public final void LIZ(FansEventMessage fansEventMessage) {
        BadgeStruct badgeStruct;
        FansEventMessage fansEventMessage2 = fansEventMessage;
        CommonMessageData commonMessageData = fansEventMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = fansEventMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        FansLevelInfo fansLevelInfo = fansEventMessage2.fansLevelInfo;
        if (fansLevelInfo != null && (badgeStruct = fansLevelInfo.badge) != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
        FansEventData fansEventData = fansEventMessage2.data;
        if (fansEventData != null) {
            _FansEventData_ProtoDecoder.LJ(fansEventData);
        }
    }

    @Override // X.C0IMD
    public final FansEventMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FansEventMessage fansEventMessage = new FansEventMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 21) {
                            switch (iLJI) {
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    fansEventMessage.eventType = c1516680pZS.LJIIJ();
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    fansEventMessage.fansLevelInfo = _FansLevelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    fansEventMessage.fansLevelUpgradeInfo = _FansLevelUpgradeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            fansEventMessage.data = _FansEventData_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        fansEventMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    fansEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansEventMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventMessage fansEventMessage, List list) {
    }
}
