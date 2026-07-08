package com.ss.android.ugc.biz;

import X.C01GW;
import X.C265540Aau;
import X.C707950Rpp;
import X.C786410Ut5;
import X.InterfaceC699620RcO;
import X.RunnableC707970Rpr;
import Y.ARunnableS111S0100000_11;
import android.os.Handler;
import com.ss.android.ugc.IFcpTraceRecorderService;
import com.tiktok.kmp.fcp.service.IFcpTraceStoreService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpTraceRecorderService implements IFcpTraceRecorderService {
    @Override // com.ss.android.ugc.IFcpTraceRecorderService
    public final InterfaceC699620RcO LIZIZ() {
        IFcpTraceStoreService iFcpTraceStoreService;
        C01GW c01gw = C707950Rpp.LIZ;
        if (!((Boolean) C265540Aau.LIZ.getValue()).booleanValue() || (iFcpTraceStoreService = (IFcpTraceStoreService) C707950Rpp.LIZJ.getValue()) == null) {
            return null;
        }
        return iFcpTraceStoreService.LIZ();
    }

    @Override // com.ss.android.ugc.IFcpTraceRecorderService
    public final void LIZJ() {
        C01GW c01gw = C707950Rpp.LIZ;
    }

    @Override // com.ss.android.ugc.IFcpTraceRecorderService
    public final void LIZ(InterfaceC699620RcO interfaceC699620RcO) {
        C01GW c01gw = C707950Rpp.LIZ;
        if (interfaceC699620RcO != null) {
            C786410Ut5.LJJZZIII((Handler) C707950Rpp.LIZIZ.getValue(), new ARunnableS111S0100000_11(interfaceC699620RcO, 151));
        }
    }

    @Override // com.ss.android.ugc.IFcpTraceRecorderService
    public final void LIZLLL(InterfaceC699620RcO interfaceC699620RcO, Function1<? super InterfaceC699620RcO, Unit> function1) {
        C01GW c01gw = C707950Rpp.LIZ;
        if (interfaceC699620RcO != null) {
            RunnableC707970Rpr runnableC707970RprPoll = C707950Rpp.LIZLLL.poll();
            if (runnableC707970RprPoll == null) {
                runnableC707970RprPoll = new RunnableC707970Rpr();
            }
            runnableC707970RprPoll.LL = interfaceC699620RcO;
            runnableC707970RprPoll.LLILLJJLI = function1;
            C786410Ut5.LJJZZIII((Handler) C707950Rpp.LIZIZ.getValue(), runnableC707970RprPoll);
        }
    }
}
