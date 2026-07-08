package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BorderInfo_ProtoDecoder implements C0IMD<BorderInfo> {
    public static BorderInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BorderInfo borderInfo = new BorderInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        borderInfo.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        borderInfo.level = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        borderInfo.source = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        borderInfo.profileDecorationRibbon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        borderInfo.borderLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        borderInfo.ribbonLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        borderInfo.avatarBackgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        borderInfo.avatarBackgroundBorderColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        borderInfo.nameStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        borderInfo.descStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        borderInfo.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        borderInfo.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        borderInfo.isTallerAvatarBackground = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return borderInfo;
            }
        }
    }

    public static void LJ(BorderInfo borderInfo) {
        ImageModel imageModel = borderInfo.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = borderInfo.profileDecorationRibbon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BorderInfo borderInfo) {
        LJ(borderInfo);
    }

    @Override // X.C0IMD
    public final BorderInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BorderInfo borderInfo, List list) {
    }
}
