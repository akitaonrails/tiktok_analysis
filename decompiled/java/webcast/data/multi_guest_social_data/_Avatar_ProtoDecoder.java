package webcast.data.multi_guest_social_data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Avatar_ProtoDecoder implements C0IMD<Avatar> {
    public static Avatar LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Avatar avatar = new Avatar();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        avatar.avatarId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        avatar.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        avatar.videoStatic = _Video_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        avatar.videoDynamic = _Video_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        avatar.styleId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        avatar.createdAt = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        avatar.updatedAt = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        avatar.status = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        avatar.failedTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        avatar.failedReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        avatar.isSystem = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatar;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Avatar avatar) {
        ImageModel imageModel = avatar.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final Avatar LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Avatar avatar, List list) {
    }
}
