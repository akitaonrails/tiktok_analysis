package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.LastLayoutSetting;
import com.bytedance.android.livesdk.chatroom.model.interact._LastLayoutSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkmicShareRevenueSettingStruct_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common._AnchorLayoutSetting_ProtoDecoder;
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BizCreateChannelResponseData_ProtoDecoder implements C0IMD<BizCreateChannelResponseData> {
    public static BizCreateChannelResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizCreateChannelResponseData bizCreateChannelResponseData = new BizCreateChannelResponseData();
        bizCreateChannelResponseData.lastLayoutSettings = new ArrayList();
        bizCreateChannelResponseData.socialGameAvailable = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    switch (iLJI) {
                        case 5:
                            bizCreateChannelResponseData.lastLayoutSettings.add(_LastLayoutSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 6:
                            bizCreateChannelResponseData.backgroundStickerId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            bizCreateChannelResponseData.shareRevenueSetting = c1516680pZS.LJIIJ();
                            break;
                        case 8:
                            bizCreateChannelResponseData.displayEmptySeat = c1516680pZS.LJIIJ();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            bizCreateChannelResponseData.anchorLayoutSetting = _AnchorLayoutSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            bizCreateChannelResponseData.shareRevenueSettingVersion = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            bizCreateChannelResponseData.resetPointAfterLeave = c1516680pZS.LJIIJ();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            bizCreateChannelResponseData.customError = _RechargeCustomError_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            bizCreateChannelResponseData.socialGameAvailable.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                            break;
                        case 14:
                            bizCreateChannelResponseData.shareRevenueSettingNew = _LinkmicShareRevenueSettingStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 15:
                            bizCreateChannelResponseData.memoryFlag = c1516680pZS.LJIIJ();
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    bizCreateChannelResponseData.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizCreateChannelResponseData;
            }
        }
    }

    public static void LJ(BizCreateChannelResponseData bizCreateChannelResponseData) {
        List<LastLayoutSetting> list = bizCreateChannelResponseData.lastLayoutSettings;
        if (list == null) {
            bizCreateChannelResponseData.lastLayoutSettings = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LastLayoutSetting> it2 = bizCreateChannelResponseData.lastLayoutSettings.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        AnchorLayoutSetting anchorLayoutSetting = bizCreateChannelResponseData.anchorLayoutSetting;
        if (anchorLayoutSetting != null) {
            _AnchorLayoutSetting_ProtoDecoder.LJ(anchorLayoutSetting);
        }
        RechargeCustomError rechargeCustomError = bizCreateChannelResponseData.customError;
        if (rechargeCustomError != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
        if (bizCreateChannelResponseData.socialGameAvailable == null) {
            bizCreateChannelResponseData.socialGameAvailable = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizCreateChannelResponseData bizCreateChannelResponseData) {
        LJ(bizCreateChannelResponseData);
    }

    @Override // X.C0IMD
    public final BizCreateChannelResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizCreateChannelResponseData bizCreateChannelResponseData, List list) {
    }
}
