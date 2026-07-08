package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomSticker_ProtoDecoder implements C0IMD<RoomSticker> {
    public static RoomSticker LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomSticker roomSticker = new RoomSticker();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomSticker.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        roomSticker.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        roomSticker.type = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        roomSticker.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        roomSticker.textSize = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        roomSticker.textColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomSticker.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        roomSticker.ninePatchImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        roomSticker.xPosition = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        roomSticker.yPosition = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        roomSticker.screenWidth = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        roomSticker.screenHeight = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        roomSticker.topLeftHeight = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        roomSticker.topLeftWidth = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        roomSticker.bottomRightHeight = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        roomSticker.bottomRightWidth = (int) c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        roomSticker.reviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        roomSticker.edited = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        roomSticker.auditInfo = _RoomStickerAuditInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        roomSticker.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        roomSticker.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomSticker;
            }
        }
    }

    public static void LJ(RoomSticker roomSticker) {
        ImageModel imageModel = roomSticker.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = roomSticker.ninePatchImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomSticker roomSticker) {
        LJ(roomSticker);
    }

    @Override // X.C0IMD
    public final RoomSticker LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomSticker roomSticker, List list) {
    }
}
