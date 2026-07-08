package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_EnigmaInfo_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShowListUser_ProtoDecoder implements C0IMD<ShowListUser> {
    public static ShowListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShowListUser showListUser = new ShowListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        showListUser.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        showListUser.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        showListUser.order = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        showListUser.showStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        showListUser.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        showListUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        showListUser.score = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        showListUser.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        showListUser.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showListUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShowListUser showListUser) {
        ImageModel imageModel = showListUser.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ShowListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShowListUser showListUser, List list) {
    }
}
