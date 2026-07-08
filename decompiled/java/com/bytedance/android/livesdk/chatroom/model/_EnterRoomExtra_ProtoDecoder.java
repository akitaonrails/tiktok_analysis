package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes8.dex */
public final class _EnterRoomExtra_ProtoDecoder implements C0IMD<EnterRoomExtra> {
    @Override // X.C0IMD
    public final void LIZ(EnterRoomExtra enterRoomExtra) {
        EnterRoomExtra enterRoomExtra2 = enterRoomExtra;
        RechargeCustomError rechargeCustomError = enterRoomExtra2.customErrorForGiftSetting;
        if (rechargeCustomError != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
        if (enterRoomExtra2.roomDiffFieldsIndex == null) {
            enterRoomExtra2.roomDiffFieldsIndex = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final EnterRoomExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnterRoomExtra enterRoomExtra = new EnterRoomExtra();
        enterRoomExtra.roomDiffFieldsIndex = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 4:
                        enterRoomExtra.isOfficialChannel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        enterRoomExtra.region = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        enterRoomExtra.isSameAppLanguage = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        enterRoomExtra.finishedPerceptionMsg = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        enterRoomExtra.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        enterRoomExtra.now = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        enterRoomExtra.customErrorForGiftSetting = _RechargeCustomError_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        enterRoomExtra.userRestrictedMode = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        enterRoomExtra.useRoomCache = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        enterRoomExtra.cacheVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        enterRoomExtra.enterBoostCacheVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        enterRoomExtra.useEnterBoostCache = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        enterRoomExtra.roomBase64Data = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        enterRoomExtra.roomDiffFieldsIndex.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        enterRoomExtra.roomData = c1516680pZS.LJII();
                        break;
                    case 19:
                        enterRoomExtra.smartDoEnterToken = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enterRoomExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnterRoomExtra enterRoomExtra, List list) {
    }
}
