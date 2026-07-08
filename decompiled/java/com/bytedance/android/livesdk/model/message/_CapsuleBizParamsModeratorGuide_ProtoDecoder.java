package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsModeratorGuide_ProtoDecoder implements C0IMD<CapsuleBizParamsModeratorGuide> {
    public static CapsuleBizParamsModeratorGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide = new CapsuleBizParamsModeratorGuide();
        capsuleBizParamsModeratorGuide.recommendSensitiveWords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        capsuleBizParamsModeratorGuide.isGiftModerator = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        capsuleBizParamsModeratorGuide.isInteractiveModerator = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        capsuleBizParamsModeratorGuide.isToolModerator = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        capsuleBizParamsModeratorGuide.hvUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        capsuleBizParamsModeratorGuide.welcomeMsg = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        capsuleBizParamsModeratorGuide.recommendSensitiveWords.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsModeratorGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide) {
        CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide2 = capsuleBizParamsModeratorGuide;
        User user = capsuleBizParamsModeratorGuide2.hvUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Text text = capsuleBizParamsModeratorGuide2.welcomeMsg;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (capsuleBizParamsModeratorGuide2.recommendSensitiveWords == null) {
            capsuleBizParamsModeratorGuide2.recommendSensitiveWords = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsModeratorGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide, List list) {
    }
}
