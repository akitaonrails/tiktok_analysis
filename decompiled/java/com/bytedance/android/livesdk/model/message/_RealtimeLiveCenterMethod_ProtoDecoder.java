package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import webcast.data.ColdStartStatData;
import webcast.data.PromoteCoupon;
import webcast.data.RealtimeLiveCenterLopInfo;
import webcast.data.RealtimeLiveCenterTips;
import webcast.data.RealtimeReminderWordInfoMsg;
import webcast.data.WhiteBoxData;
import webcast.data._ColdStartStatData_ProtoDecoder;
import webcast.data._PromoteCoupon_ProtoDecoder;
import webcast.data._RealtimeLiveCenterBaseData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterLopInfo_ProtoDecoder;
import webcast.data._RealtimeLiveCenterShopData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterTips_ProtoDecoder;
import webcast.data._RealtimeReminderWordInfoMsg_ProtoDecoder;
import webcast.data._WhiteBoxData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterMethod_ProtoDecoder implements C0IMD<RealtimeLiveCenterMethod> {
    @Override // X.C0IMD
    public final void LIZ(RealtimeLiveCenterMethod realtimeLiveCenterMethod) {
        Text text;
        RealtimeLiveCenterMethod realtimeLiveCenterMethod2 = realtimeLiveCenterMethod;
        CommonMessageData commonMessageData = realtimeLiveCenterMethod2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        RealtimeLiveCenterTips realtimeLiveCenterTips = realtimeLiveCenterMethod2.tipsInfo;
        if (realtimeLiveCenterTips != null && realtimeLiveCenterTips.eventTrackParams == null) {
            realtimeLiveCenterTips.eventTrackParams = new HashMap();
        }
        ColdStartStatData coldStartStatData = realtimeLiveCenterMethod2.coldStartStatData;
        if (coldStartStatData != null) {
            _ColdStartStatData_ProtoDecoder.LJ(coldStartStatData);
        }
        RealtimeReminderWordInfoMsg realtimeReminderWordInfoMsg = realtimeLiveCenterMethod2.reminderWordInfo;
        if (realtimeReminderWordInfoMsg != null && (text = realtimeReminderWordInfoMsg.title) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo = realtimeLiveCenterMethod2.lopInfo;
        if (realtimeLiveCenterLopInfo != null) {
            _RealtimeLiveCenterLopInfo_ProtoDecoder.LJ(realtimeLiveCenterLopInfo);
        }
        PromoteCoupon promoteCoupon = realtimeLiveCenterMethod2.promoteCoupon;
        if (promoteCoupon != null) {
            _PromoteCoupon_ProtoDecoder.LJ(promoteCoupon);
        }
        WhiteBoxData whiteBoxData = realtimeLiveCenterMethod2.whiteBoxData;
        if (whiteBoxData != null) {
            _WhiteBoxData_ProtoDecoder.LJ(whiteBoxData);
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterMethod LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterMethod realtimeLiveCenterMethod = new RealtimeLiveCenterMethod();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        realtimeLiveCenterMethod.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        realtimeLiveCenterMethod.roomId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        realtimeLiveCenterMethod.baseInfo = _RealtimeLiveCenterBaseData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        realtimeLiveCenterMethod.tipsInfo = _RealtimeLiveCenterTips_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        realtimeLiveCenterMethod.shopInfo = _RealtimeLiveCenterShopData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        realtimeLiveCenterMethod.coldStartStatData = _ColdStartStatData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        realtimeLiveCenterMethod.reminderWordInfo = _RealtimeReminderWordInfoMsg_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        realtimeLiveCenterMethod.lopInfo = _RealtimeLiveCenterLopInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        realtimeLiveCenterMethod.promoteCoupon = _PromoteCoupon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        realtimeLiveCenterMethod.whiteBoxData = _WhiteBoxData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterMethod;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterMethod realtimeLiveCenterMethod, List list) {
    }
}
