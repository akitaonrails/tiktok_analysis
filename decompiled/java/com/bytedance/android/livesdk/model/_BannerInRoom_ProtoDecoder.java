package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.data.BannerImageBackground;
import webcast.data.ExtendImage;
import webcast.data.ImageInfo;
import webcast.data._BannerImageBackground_ProtoDecoder;
import webcast.data._BannerImageContent_ProtoDecoder;
import webcast.data._ExtendImage_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerInRoom_ProtoDecoder implements C0IMD<BannerInRoom> {
    public static BannerInRoom LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerInRoom bannerInRoom = new BannerInRoom();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bannerInRoom.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        bannerInRoom.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bannerInRoom.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        bannerInRoom.height = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        bannerInRoom.width = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        bannerInRoom.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        bannerInRoom.actionType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        bannerInRoom.bannerType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bannerInRoom.priority = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bannerInRoom.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bannerInRoom.frameType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        bannerInRoom.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        bannerInRoom.status = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 14:
                        bannerInRoom.uid = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 15:
                        bannerInRoom.roomid = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 16:
                        bannerInRoom.appointmentStartTimestamp = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        bannerInRoom.appointmentEndTimestamp = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        bannerInRoom.appointmentId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 19:
                        bannerInRoom.businessType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        bannerInRoom.dynamicBanner = _BannerInRoom_BannerContentDynamic_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        bannerInRoom.bannerLocation = c1516680pZS.LJIIJ();
                        break;
                    case 22:
                        bannerInRoom.openWithNavigationTag = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 23:
                        bannerInRoom.businessSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        bannerInRoom.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 26:
                        bannerInRoom.imageType = c1516680pZS.LJIIJ();
                        break;
                    case 27:
                        bannerInRoom.extendImage = _ExtendImage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        bannerInRoom.background = _BannerImageBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        bannerInRoom.imageContent = _BannerImageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 30:
                        bannerInRoom.displayParam = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 31:
                        bannerInRoom.displayStyle = c1516680pZS.LJIIJ();
                        break;
                    case 32:
                        bannerInRoom.tabTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerInRoom;
            }
        }
    }

    public static void LJ(BannerInRoom bannerInRoom) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        ImageModel imageModel4 = bannerInRoom.image;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        ExtendImage extendImage = bannerInRoom.extendImage;
        if (extendImage != null) {
            ImageInfo imageInfo = extendImage.foldedImage;
            if (imageInfo != null && (imageModel3 = imageInfo.image) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
            ImageInfo imageInfo2 = extendImage.expandedImage;
            if (imageInfo2 != null && (imageModel2 = imageInfo2.image) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        BannerImageBackground bannerImageBackground = bannerInRoom.background;
        if (bannerImageBackground != null && (imageModel = bannerImageBackground.activeIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BannerInRoom bannerInRoom) {
        LJ(bannerInRoom);
    }

    @Override // X.C0IMD
    public final BannerInRoom LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerInRoom bannerInRoom, List list) {
    }
}
