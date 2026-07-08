package com.ss.android.ugc.aweme.live.notification;

import X.C004I;
import X.C09JN;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.InterfaceC1252130igl;
import X.InterfaceC420801kM;
import Y.AfS188S0100000_19;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class NotificationLiveViewModel extends JediViewModel<ResponseState> implements InterfaceC1252130igl {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ResponseState(-1, -1, null, null);
    }

    @Override // X.InterfaceC1252130igl
    public final InterfaceC420801kM Dd(C11JF c11jf) {
        disposeOnClear(c11jf);
        return c11jf;
    }

    @Override // X.InterfaceC1252130igl
    public final void LJJJZ(Function1<? super ResponseState, ResponseState> function1) {
        setState(function1);
    }

    public final void hR2(int i, String str) {
        C11NZ c11nzLJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJ(i, str);
        if (c11nzLJ != null) {
            disposeOnClear(c11nzLJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(this, 23), new C09JN() { // from class: X.00OT
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("INotificationLiveViewModel@33cc.changeOptions$2");
                    C1C7U.LIZIZ("INotificationLiveViewModel@33cc.changeOptions$2");
                }
            }));
        }
    }
}
