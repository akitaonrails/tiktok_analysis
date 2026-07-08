package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestUserInfo_ProtoDecoder implements C0IMD<GuestUserInfo> {
    public static GuestUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestUserInfo guestUserInfo = new GuestUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestUserInfo.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        guestUserInfo.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        guestUserInfo.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        guestUserInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        guestUserInfo.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guestUserInfo.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        guestUserInfo.isEnigma = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestUserInfo guestUserInfo) {
        ImageModel imageModel = guestUserInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GuestUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestUserInfo guestUserInfo, List list) {
    }
}
