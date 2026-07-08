package com.bytedance.incentive.taskevent.watchvideo;

import X.AbstractC1899090zWF;
import X.AbstractC1899280zWY;
import X.C01GW;
import X.C01U6;
import X.C1893450zN9;
import X.C1896810zSZ;
import X.C1899070zWD;
import X.C1899170zWN;
import X.EnumC586670Mzh;
import X.InterfaceC1898130zUh;
import X.InterfaceC1898470zVF;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.touchpoint.core.shortdrama.ShortDramaTimerPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class WatchVideoServiceImpl implements IWatchVideoService {
    public C1896810zSZ LIZIZ;
    public EnumC586670Mzh LIZJ = EnumC586670Mzh.PAUSED;
    public final List<AbstractC1899280zWY> LIZLLL = new ArrayList();

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final boolean LIZJ() {
        try {
            C01GW<ShortDramaTimerPendantManager> c01gw = ShortDramaTimerPendantManager.LLJJJJ;
            return C1893450zN9.LIZ().LJJJJJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final void clear() {
        C01U6.LIZIZ(new AwS572S0100000_28(this, 30));
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final void pausePlay() {
        C01U6.LIZIZ(new C1899170zWN(this));
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final String LIZ(String str) {
        Object next;
        String strLJIILL;
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1899280zWY abstractC1899280zWY = (AbstractC1899280zWY) next;
        if (abstractC1899280zWY == null || (strLJIILL = abstractC1899280zWY.LJIILL()) == null) {
            return "";
        }
        return strLJIILL;
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final void LIZLLL(C1896810zSZ c1896810zSZ) {
        C01U6.LIZIZ(new C1899070zWD(c1896810zSZ, this));
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final void LJ(String str) {
        C01U6.LIZIZ(new AwS177S1100000_28(this, str, 0));
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final void LJFF(ViewGroup viewGroup, Fragment fragment) {
        try {
            C01GW<ShortDramaTimerPendantManager> c01gw = ShortDramaTimerPendantManager.LLJJJJ;
            C1893450zN9.LIZ().LJIIJ(viewGroup, fragment);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IWatchVideoService
    public final void LIZIZ(List<InterfaceC1898130zUh> list, List<TaskEvent> list2, Map<Integer, InterfaceC1898470zVF<TaskEvent>> map) {
        C01U6.LIZIZ(new AwS156S0400000_28(this, (WatchVideoServiceImpl) list, (List<InterfaceC1898130zUh>) list2, (List<TaskEvent>) map, (Map<Integer, InterfaceC1898470zVF<TaskEvent>>) 1));
    }
}
