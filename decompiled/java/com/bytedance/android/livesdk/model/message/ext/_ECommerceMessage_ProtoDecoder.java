package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.bytedance.android.livesdk.model.message.CampaignBannerDisplay;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.FlashSaleAtmosphere;
import com.bytedance.android.livesdk.model.message.FlashSaleAtmosphereInfo;
import com.bytedance.android.livesdk.model.message.FlashSaleEnhancementInfo;
import com.bytedance.android.livesdk.model.message.PromotionInfo;
import com.bytedance.android.livesdk.model.message.RefreshLiveBagInfo;
import com.bytedance.android.livesdk.model.message._AtmosphereTagInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BillboardDisplayResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BillboardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CampaignBannerDisplayResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CampaignBannerDisplay_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DispersionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FlashSaleAtmosphereInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FlashSaleEnhancementInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LivePermissionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ProductSnapShot_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PromotionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RefreshLiveBagInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._Voucher_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;
import webcast.data.oec_msg._OecLiveShoppingMessageV2_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ECommerceMessage_ProtoDecoder implements C0IMD<ECommerceMessage> {
    @Override // X.C0IMD
    public final void LIZ(ECommerceMessage eCommerceMessage) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        ECommerceMessage eCommerceMessage2 = eCommerceMessage;
        CommonMessageData commonMessageData = eCommerceMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<HotTag> list = eCommerceMessage2.hotTags;
        if (list == null) {
            eCommerceMessage2.hotTags = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<HotTag> it2 = eCommerceMessage2.hotTags.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        AtmosphereTagInfo atmosphereTagInfo = eCommerceMessage2.atmosphereTagInfo;
        if (atmosphereTagInfo != null) {
            _AtmosphereTagInfo_ProtoDecoder.LJ(atmosphereTagInfo);
        }
        List<FlashSaleAtmosphereInfo> list2 = eCommerceMessage2.flashSaleAtmosphereInfo;
        if (list2 == null) {
            eCommerceMessage2.flashSaleAtmosphereInfo = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (FlashSaleAtmosphereInfo flashSaleAtmosphereInfo : eCommerceMessage2.flashSaleAtmosphereInfo) {
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null) {
                    _FlashSaleEnhancementInfo_ProtoDecoder.LJ(flashSaleEnhancementInfo);
                }
            }
        }
        BillboardInfo billboardInfo = eCommerceMessage2.billboardInfo;
        if (billboardInfo != null) {
            if (billboardInfo.billboardIds == null) {
                billboardInfo.billboardIds = new ArrayList();
            }
            if (billboardInfo.daInfo == null) {
                billboardInfo.daInfo = new HashMap();
            }
        }
        List<DispersionInfo> list3 = eCommerceMessage2.dispersionInfo;
        if (list3 == null) {
            eCommerceMessage2.dispersionInfo = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<DispersionInfo> it3 = eCommerceMessage2.dispersionInfo.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        PromotionInfo promotionInfo = eCommerceMessage2.promotionInfo;
        if (promotionInfo != null && promotionInfo.productIds == null) {
            promotionInfo.productIds = new ArrayList();
        }
        CampaignBannerDisplay campaignBannerDisplay = eCommerceMessage2.campaignBannerDisplay;
        if (campaignBannerDisplay != null && campaignBannerDisplay.daInfo == null) {
            campaignBannerDisplay.daInfo = new HashMap();
        }
        RefreshLiveBagInfo refreshLiveBagInfo = eCommerceMessage2.refreshLiveBagInfo;
        if (refreshLiveBagInfo != null && refreshLiveBagInfo.refreshLiveBagTypes == null) {
            refreshLiveBagInfo.refreshLiveBagTypes = new ArrayList();
        }
        OecLiveShoppingMessageV2 oecLiveShoppingMessageV2 = eCommerceMessage2.oecLiveShoppingMessageV2;
        if (oecLiveShoppingMessageV2 != null) {
            _OecLiveShoppingMessageV2_ProtoDecoder.LJ(oecLiveShoppingMessageV2);
        }
    }

    @Override // X.C0IMD
    public final ECommerceMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ECommerceMessage eCommerceMessage = new ECommerceMessage();
        eCommerceMessage.flashSaleAtmosphereInfo = new ArrayList();
        eCommerceMessage.dispersionInfo = new ArrayList();
        eCommerceMessage.hotTags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            eCommerceMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            eCommerceMessage.actionType = c1516680pZS.LJIIJ();
                            break;
                        case 3:
                            eCommerceMessage.liveProductNumber = c1516680pZS.LJIIJ();
                            break;
                        case 4:
                            eCommerceMessage.popProduct = _PopProduct_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            eCommerceMessage.traceInfo = _TraceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            eCommerceMessage.hotTags.add(_HotTag_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 7:
                            eCommerceMessage.atmosphereTagInfo = _AtmosphereTagInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            eCommerceMessage.livePermissionInfo = _LivePermissionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            eCommerceMessage.productSnapShot = _ProductSnapShot_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            eCommerceMessage.pinCardDelayTime = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            eCommerceMessage.flashSaleAtmosphereInfo.add(_FlashSaleAtmosphereInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            eCommerceMessage.cardType = c1516680pZS.LJIIJ();
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            eCommerceMessage.billboardInfo = _BillboardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            eCommerceMessage.billboardDisplayResult = _BillboardDisplayResult_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 15:
                            eCommerceMessage.dispersionInfo.add(_DispersionInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 16:
                            eCommerceMessage.promotionInfo = _PromotionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            eCommerceMessage.campaignBannerDisplayResult = _CampaignBannerDisplayResult_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            eCommerceMessage.campaignBannerDisplay = _CampaignBannerDisplay_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 19:
                            eCommerceMessage.refreshLiveBagInfo = _RefreshLiveBagInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            eCommerceMessage.anchorPinCardResetType = c1516680pZS.LJIIJ();
                            break;
                        case 21:
                            eCommerceMessage.voucher = _Voucher_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    eCommerceMessage.oecLiveShoppingMessageV2 = _OecLiveShoppingMessageV2_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eCommerceMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ECommerceMessage eCommerceMessage, List list) {
    }
}
