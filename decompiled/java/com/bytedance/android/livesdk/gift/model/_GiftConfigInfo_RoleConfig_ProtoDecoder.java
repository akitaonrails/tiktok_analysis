package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftConfigInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftConfigInfo_RoleConfig_ProtoDecoder implements C0IMD<GiftConfigInfo.RoleConfig> {
    public static GiftConfigInfo.RoleConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftConfigInfo.RoleConfig roleConfig = new GiftConfigInfo.RoleConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            roleConfig.gifter = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roleConfig.anchor = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    roleConfig.viewer = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roleConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftConfigInfo.RoleConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftConfigInfo.RoleConfig roleConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftConfigInfo.RoleConfig roleConfig, List list) {
    }
}
