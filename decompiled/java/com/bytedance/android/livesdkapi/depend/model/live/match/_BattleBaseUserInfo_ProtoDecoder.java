package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleBaseUserInfo_ProtoDecoder implements C0IMD<BattleBaseUserInfo> {
    public static BattleBaseUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleBaseUserInfo battleBaseUserInfo = new BattleBaseUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleBaseUserInfo.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        battleBaseUserInfo.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        battleBaseUserInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        battleBaseUserInfo.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        battleBaseUserInfo.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        battleBaseUserInfo.invitationRole = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleBaseUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleBaseUserInfo battleBaseUserInfo) {
        ImageModel imageModel = battleBaseUserInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final BattleBaseUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleBaseUserInfo battleBaseUserInfo, List list) {
    }
}
