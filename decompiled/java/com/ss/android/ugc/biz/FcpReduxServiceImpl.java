package com.ss.android.ugc.biz;

import X.C01GW;
import X.C2217481Bqc;
import X.C452501pT;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.IFcpReduxService;
import com.tiktok.kmp.fcp.service.IFcpKMPReduxService;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class FcpReduxServiceImpl implements IFcpReduxService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(715));

    @Override // com.ss.android.ugc.IFcpReduxService
    public final <STATE> Function1<InterfaceC1631620sYq<? super Function2<? super STATE, ? super InterfaceC1445905lJ, ? extends STATE>, ? super STATE, Object, ? extends InterfaceC1449905lx<STATE>>, InterfaceC1631620sYq<Function2<? super STATE, ? super InterfaceC1445905lJ, ? extends STATE>, STATE, Object, InterfaceC1449905lx<STATE>>> LIZ(Function1<? super InterfaceC1449905lx<STATE>, ? extends Function1<? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? extends Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>>>... function1Arr) {
        IFcpKMPReduxService iFcpKMPReduxService = (IFcpKMPReduxService) this.LIZ.getValue();
        if (iFcpKMPReduxService != null) {
            return iFcpKMPReduxService.LIZ((Function1[]) Arrays.copyOf(function1Arr, function1Arr.length));
        }
        return null;
    }

    @Override // com.ss.android.ugc.IFcpReduxService
    public final <STATE> Function1<InterfaceC1449905lx<STATE>, Function1<Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, Function1<InterfaceC1445905lJ, InterfaceC1445905lJ>>> LIZJ(InterfaceC1631620sYq<? super InterfaceC1449905lx<STATE>, ? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> interfaceC1631620sYq) {
        IFcpKMPReduxService iFcpKMPReduxService = (IFcpKMPReduxService) this.LIZ.getValue();
        if (iFcpKMPReduxService != null) {
            return iFcpKMPReduxService.LIZJ(interfaceC1631620sYq);
        }
        return null;
    }

    @Override // com.ss.android.ugc.IFcpReduxService
    public final AwS616S0100000_2 LJ(Map map) {
        return new AwS616S0100000_2(map, (Map<String, String>) 133);
    }

    @Override // com.ss.android.ugc.IFcpReduxService
    public final InterfaceC1449905lx LIZIZ(Object obj, Function1 function1, Function2 function2) {
        IFcpKMPReduxService iFcpKMPReduxService = (IFcpKMPReduxService) this.LIZ.getValue();
        if (iFcpKMPReduxService != null) {
            return iFcpKMPReduxService.LIZIZ(obj, function1, function2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.IFcpReduxService
    public final Function0 LIZLLL(InterfaceC1449905lx interfaceC1449905lx, C2217481Bqc c2217481Bqc, Function1 function1) {
        IFcpKMPReduxService iFcpKMPReduxService = (IFcpKMPReduxService) this.LIZ.getValue();
        if (iFcpKMPReduxService != null) {
            return iFcpKMPReduxService.LIZLLL(interfaceC1449905lx, c2217481Bqc, function1);
        }
        return null;
    }
}
