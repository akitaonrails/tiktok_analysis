package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_EnigmaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownUser_ProtoDecoder implements C0IMD<GuestShowdownUser> {
    public static GuestShowdownUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownUser guestShowdownUser = new GuestShowdownUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestShowdownUser.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        guestShowdownUser.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        guestShowdownUser.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guestShowdownUser.rank = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        guestShowdownUser.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        guestShowdownUser.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        guestShowdownUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        guestShowdownUser.userTag = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        guestShowdownUser.iconName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        guestShowdownUser.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestShowdownUser guestShowdownUser) {
        ImageModel imageModel = guestShowdownUser.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GuestShowdownUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownUser guestShowdownUser, List list) {
    }
}
