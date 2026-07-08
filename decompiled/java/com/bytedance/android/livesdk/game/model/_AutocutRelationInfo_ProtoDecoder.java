package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AutocutRelationInfo_ProtoDecoder implements C0IMD<AutocutRelationInfo> {
    public static AutocutRelationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AutocutRelationInfo autocutRelationInfo = new AutocutRelationInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        autocutRelationInfo.templateUniqueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        autocutRelationInfo.templateType = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        autocutRelationInfo.autocutType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        autocutRelationInfo.publishPageTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        autocutRelationInfo.originFragmentType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        autocutRelationInfo.originFragmentSubType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return autocutRelationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AutocutRelationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AutocutRelationInfo autocutRelationInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AutocutRelationInfo autocutRelationInfo, List list) {
    }
}
