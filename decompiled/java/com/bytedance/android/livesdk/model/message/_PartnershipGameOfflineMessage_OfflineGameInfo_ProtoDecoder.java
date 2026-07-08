package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipGameOfflineMessage_OfflineGameInfo_ProtoDecoder implements C0IMD<PartnershipGameOfflineMessage.OfflineGameInfo> {
    public static PartnershipGameOfflineMessage.OfflineGameInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo = new PartnershipGameOfflineMessage.OfflineGameInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 6) {
                                    if (iLJI != 7) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        offlineGameInfo.taskType = c1516680pZS.LJIIJ();
                                    }
                                } else {
                                    offlineGameInfo.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                offlineGameInfo.offlineType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            offlineGameInfo.taskListLen = c1516680pZS.LJIIJ();
                        }
                    } else {
                        offlineGameInfo.toastText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    offlineGameInfo.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return offlineGameInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PartnershipGameOfflineMessage.OfflineGameInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo, List list) {
    }
}
