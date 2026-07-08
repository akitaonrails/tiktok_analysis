package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubInfo_ProtoDecoder implements C0IMD<SubInfo> {
    public static SubInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubInfo subInfo = new SubInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subInfo.userId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        subInfo.anchorId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        subInfo.subStartTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        subInfo.subEndTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        subInfo.nextRenewTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 6:
                        subInfo.subscribedMonth = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 7:
                        subInfo.isSubscribing = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 8:
                        subInfo.subLevel = _SubLevel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        subInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        subInfo.subInfoNotFound = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        subInfo.skuName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        subInfo.payChannel = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        subInfo.graceInfo = _GraceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                    case 15:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 16:
                        subInfo.priceChangeInfo = _PriceChangeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        subInfo.lastOperation = _SubOperation_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        subInfo.packageId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        subInfo.subCircle = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        subInfo.renewalPeriod = c1516680pZS.LJIIJ();
                        break;
                    case 21:
                        subInfo.isMocked = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubInfo subInfo) {
        SubLevel subLevel = subInfo.subLevel;
        if (subLevel != null) {
            LevelBadge levelBadge = subLevel.badge;
            if (levelBadge != null) {
                ImageModel imageModel = levelBadge.originImg;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
                ImageModel imageModel2 = levelBadge.previewImg;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
            BadgeStruct badgeStruct = subLevel.badgeStruct;
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
        }
    }

    @Override // X.C0IMD
    public final SubInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubInfo subInfo, List list) {
    }
}
