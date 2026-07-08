package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CohostPlatformMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostPlatformMessage_CohostWithdrawInfo_ProtoDecoder implements C0IMD<CohostPlatformMessage.CohostWithdrawInfo> {
    public static CohostPlatformMessage.CohostWithdrawInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostPlatformMessage.CohostWithdrawInfo cohostWithdrawInfo = new CohostPlatformMessage.CohostWithdrawInfo();
        cohostWithdrawInfo.anchorList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostWithdrawInfo.anchorList.add(_GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostWithdrawInfo;
            }
        }
    }

    public static void LJ(CohostPlatformMessage.CohostWithdrawInfo cohostWithdrawInfo) {
        List<GroupPlayer> list = cohostWithdrawInfo.anchorList;
        if (list == null) {
            cohostWithdrawInfo.anchorList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GroupPlayer> it2 = cohostWithdrawInfo.anchorList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostPlatformMessage.CohostWithdrawInfo cohostWithdrawInfo) {
        LJ(cohostWithdrawInfo);
    }

    @Override // X.C0IMD
    public final CohostPlatformMessage.CohostWithdrawInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostPlatformMessage.CohostWithdrawInfo cohostWithdrawInfo, List list) {
    }
}
