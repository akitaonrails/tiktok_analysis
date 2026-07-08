package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGEnterActionInfo_ProtoDecoder implements C0IMD<MGEnterActionInfo> {
    public static MGEnterActionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGEnterActionInfo mGEnterActionInfo = new MGEnterActionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        mGEnterActionInfo.enterAction = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        mGEnterActionInfo.enterActionReason = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        mGEnterActionInfo.enterActionOriginLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        mGEnterActionInfo.enterActionSourceRole = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        mGEnterActionInfo.enterActionSourceUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        mGEnterActionInfo.enterActionSourceTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGEnterActionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MGEnterActionInfo mGEnterActionInfo) {
        User user = mGEnterActionInfo.enterActionSourceUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final MGEnterActionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGEnterActionInfo mGEnterActionInfo, List list) {
    }
}
