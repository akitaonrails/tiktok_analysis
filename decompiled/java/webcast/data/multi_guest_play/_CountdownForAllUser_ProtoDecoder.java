package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_EnigmaInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllUser_ProtoDecoder implements C0IMD<CountdownForAllUser> {
    public static CountdownForAllUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllUser countdownForAllUser = new CountdownForAllUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        countdownForAllUser.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        countdownForAllUser.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        countdownForAllUser.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        countdownForAllUser.rank = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        countdownForAllUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        countdownForAllUser.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        countdownForAllUser.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        countdownForAllUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        countdownForAllUser.completionProgressPercent = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        countdownForAllUser.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownForAllUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownForAllUser countdownForAllUser) {
        CountdownForAllUser countdownForAllUser2 = countdownForAllUser;
        User user = countdownForAllUser2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ImageModel imageModel = countdownForAllUser2.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CountdownForAllUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllUser countdownForAllUser, List list) {
    }
}
