package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KickOutBizContent_ProtoDecoder implements C0IMD<KickOutBizContent> {
    public static KickOutBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        KickOutBizContent kickOutBizContent = new KickOutBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            kickOutBizContent.kickPlayerUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        kickOutBizContent.operatorLinkAdminType = c1516680pZS.LJIIJ();
                    }
                } else {
                    kickOutBizContent.operatorUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return kickOutBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(KickOutBizContent kickOutBizContent) {
        KickOutBizContent kickOutBizContent2 = kickOutBizContent;
        User user = kickOutBizContent2.operatorUserInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = kickOutBizContent2.kickPlayerUserInfo;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final KickOutBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KickOutBizContent kickOutBizContent, List list) {
    }
}
