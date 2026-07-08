package webcast.api.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SuggestedModerator_ProtoDecoder implements C0IMD<SuggestedModerator> {
    public static SuggestedModerator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SuggestedModerator suggestedModerator = new SuggestedModerator();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            suggestedModerator.tagKey = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        suggestedModerator.tag = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    suggestedModerator.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return suggestedModerator;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SuggestedModerator suggestedModerator) {
        User user = suggestedModerator.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final SuggestedModerator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SuggestedModerator suggestedModerator, List list) {
    }
}
