package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model._GiftTrayInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftsBoxInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftResultData_ProtoDecoder implements C0IMD<GiftResultData> {
    public static GiftResultData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftResultData giftResultData = new GiftResultData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftResultData.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftResultData.describe = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftResultData.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        giftResultData.groupCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftResultData.repeatCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        giftResultData.comboCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        giftResultData.msgId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        giftResultData.trayDisplayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftResultData.mTrayInfo = _GiftTrayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftResultData.mGift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        giftResultData.displayTextForAnchor = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        giftResultData.displayTextForAudience = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        giftResultData.giftsInBox = _GiftsBoxInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        giftResultData.giftAsset = _AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        giftResultData.displayDurationMs = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        giftResultData.displayTextForSender = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        giftResultData.isAssetBundleGift = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        giftResultData.assetBundle = _AssetBundle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        giftResultData.giftEffect = _GiftEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftResultData;
            }
        }
    }

    public static void LJ(GiftResultData giftResultData) {
        Text text = giftResultData.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = giftResultData.trayDisplayText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        GiftTrayInfo giftTrayInfo = giftResultData.mTrayInfo;
        if (giftTrayInfo != null) {
            _GiftTrayInfo_ProtoDecoder.LJ(giftTrayInfo);
        }
        Gift gift = giftResultData.mGift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
        Text text3 = giftResultData.displayTextForAnchor;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        Text text4 = giftResultData.displayTextForAudience;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
        GiftsBoxInfo giftsBoxInfo = giftResultData.giftsInBox;
        if (giftsBoxInfo != null) {
            _GiftsBoxInfo_ProtoDecoder.LJ(giftsBoxInfo);
        }
        AssetsModel assetsModel = giftResultData.giftAsset;
        if (assetsModel != null) {
            _AssetsModel_ProtoDecoder.LJ(assetsModel);
        }
        Text text5 = giftResultData.displayTextForSender;
        if (text5 != null) {
            _Text_ProtoDecoder.LJ(text5);
        }
        AssetBundle assetBundle = giftResultData.assetBundle;
        if (assetBundle != null) {
            _AssetBundle_ProtoDecoder.LJ(assetBundle);
        }
        GiftEffect giftEffect = giftResultData.giftEffect;
        if (giftEffect != null) {
            _GiftEffect_ProtoDecoder.LJ(giftEffect);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftResultData giftResultData) {
        LJ(giftResultData);
    }

    @Override // X.C0IMD
    public final GiftResultData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftResultData giftResultData, List list) {
    }
}
