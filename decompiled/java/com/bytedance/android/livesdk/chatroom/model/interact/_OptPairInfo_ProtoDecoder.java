package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OptPairInfo_ProtoDecoder implements C0IMD<OptPairInfo> {
    public static OptPairInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OptPairInfo optPairInfo = new OptPairInfo();
        optPairInfo.teamInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    optPairInfo.teamInfo.add(_OptPairInfo_TeamInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                optPairInfo.optPairType = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            optPairInfo.optPairStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        optPairInfo.expectedTimeSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    optPairInfo.mappingId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return optPairInfo;
            }
        }
    }

    public static void LJ(OptPairInfo optPairInfo) {
        List<OptPairInfo.TeamInfo> list = optPairInfo.teamInfo;
        if (list == null) {
            optPairInfo.teamInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (OptPairInfo.TeamInfo teamInfo : optPairInfo.teamInfo) {
            if (teamInfo != null && teamInfo.userId == null) {
                teamInfo.userId = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OptPairInfo optPairInfo) {
        LJ(optPairInfo);
    }

    @Override // X.C0IMD
    public final OptPairInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OptPairInfo optPairInfo, List list) {
    }
}
