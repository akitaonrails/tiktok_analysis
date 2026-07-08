package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Prop_ProtoDecoder implements C0IMD<Prop> {
    public static Prop LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Prop prop = new Prop();
        prop.gifts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        prop.primaryEffectId = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        prop.nextExpire = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        prop.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        prop.id = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        prop.manual = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        prop.diamond = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        prop.reddotTip = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        prop.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        prop.count = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        prop.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        prop.gift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        prop.labelIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        prop.isFragment = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 14:
                        prop.fragmentsCompoundCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 15:
                        prop.isAwemeFreeGift = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        prop.diamondLabel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        prop.banner = _BannerInRoom_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        prop.propType = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        prop.gifts.add(_HotfixGiftDataForProp_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        prop.schemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return prop;
            }
        }
    }

    public static void LJ(Prop prop) {
        Text text;
        ImageModel imageModel = prop.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Gift gift = prop.gift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
        ImageModel imageModel2 = prop.labelIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = prop.diamondLabel;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        BannerInRoom bannerInRoom = prop.banner;
        if (bannerInRoom != null) {
            _BannerInRoom_ProtoDecoder.LJ(bannerInRoom);
        }
        List<HotfixGiftDataForProp> list = prop.gifts;
        if (list == null) {
            prop.gifts = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HotfixGiftDataForProp hotfixGiftDataForProp : prop.gifts) {
            if (hotfixGiftDataForProp != null && (text = hotfixGiftDataForProp.displayText) != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Prop prop) {
        LJ(prop);
    }

    @Override // X.C0IMD
    public final Prop LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Prop prop, List list) {
    }
}
