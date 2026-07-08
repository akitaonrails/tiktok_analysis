package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicGuestUser_ProtoDecoder implements C0IMD<LinkmicGuestUser> {
    public static LinkmicGuestUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicGuestUser linkmicGuestUser = new LinkmicGuestUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkmicGuestUser.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        linkmicGuestUser.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkmicGuestUser.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkmicGuestUser.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkmicGuestUser.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkmicGuestUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkmicGuestUser.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkmicGuestUser.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicGuestUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkmicGuestUser linkmicGuestUser) {
        ImageModel imageModel = linkmicGuestUser.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final LinkmicGuestUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicGuestUser linkmicGuestUser, List list) {
    }
}
