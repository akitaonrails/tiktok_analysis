package com.ss.android.ugc.aweme.performance.preload;

import X.C01GW;
import X.C1150504el;
import X.C1602200rnO;
import X.C1BCA;
import X.C452501pT;
import X.C505101xx;
import X.C786410Ut5;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC586170Myt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeTaskPreloadComponent extends BaseMainContainerAssem implements InterfaceC586170Myt {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(129));

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"PostModeTaskPreloadComponent", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        IAccountService iAccountService = (IAccountService) this.LL.getValue();
        if (iAccountService != null) {
            iAccountService.LJIILL(this);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0Slu
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                if (c1602200rnO2.LIZJ()) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C383201eI(this.LL, null), 3);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C720420SNs(this.LL, null), 3);
                    C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                }
            }
        });
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IAccountService iAccountService = (IAccountService) this.LL.getValue();
        if (iAccountService != null) {
            iAccountService.LJI(this);
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2 && i != 3) {
            return;
        }
        C505101xx.LIZ.set(false);
    }
}
