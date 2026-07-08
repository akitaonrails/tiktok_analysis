package com.ss.android.ugc.aweme.video.simplayer;

import X.AbstractC1284860jXY;
import X.C1126604au;
import X.C1471680oOs;
import X.C1476530oWh;
import X.C1476570oWl;
import X.C1478040oZ8;
import X.C1479300obA;
import X.C1480100ocS;
import X.C2188811AlT;
import X.C607330Nrv;
import X.InterfaceC1294060jmO;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1294060jmO
public interface ISimPlayerService {
    public static final Companion LIZ = Companion.LIZ;

    public static final class Companion {
        public static final /* synthetic */ Companion LIZ = new Companion();

        public final ISimPlayerService get() {
            ISimPlayerService iSimPlayerService;
            C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
            int playerType = c1478040oZ8.LIZ().getPlayerType();
            if (playerType == 0) {
                iSimPlayerService = c1478040oZ8.LIZ().getTTPlayerPlan() == 1 ? (ISimPlayerService) C1126604au.LIZ("com.ss.android.ugc.aweme.playerkit.engineexo.TTSimPlayerServiceImpl") : (ISimPlayerService) C1126604au.LIZ("com.ss.android.ugc.aweme.video.simplayer.tt.TTSimPlayerServiceImpl");
                if (iSimPlayerService == null) {
                    iSimPlayerService = (ISimPlayerService) C1126604au.LIZ("com.ss.android.ugc.aweme.video.simplayer.ttcrop.TTCropSimPlayerServiceImpl");
                }
                return iSimPlayerService;
            }
            iSimPlayerService = playerType != 1 ? (ISimPlayerService) C1126604au.LIZ("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl") : (ISimPlayerService) C1126604au.LIZ("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
            if (iSimPlayerService == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cannot find match player service, please check config: getPlayerType. need:");
                sbLIZ.append(playerType);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return iSimPlayerService;
        }
    }

    C1476530oWh LIZ();

    @InterfaceC1294060jmO
    C1479300obA LIZIZ();

    C1480100ocS LIZJ();

    void LIZLLL(C1471680oOs c1471680oOs);

    void LJ(ExecutorService executorService);

    @InterfaceC1294060jmO
    C1479300obA LJFF();

    AbstractC1284860jXY LJI();

    @InterfaceC1294060jmO
    C1479300obA LJII();

    @InterfaceC1294060jmO
    C1479300obA LJIIIIZZ(C1476570oWl c1476570oWl);

    void LJIIIZ();

    void setLogLevel(int i);
}
