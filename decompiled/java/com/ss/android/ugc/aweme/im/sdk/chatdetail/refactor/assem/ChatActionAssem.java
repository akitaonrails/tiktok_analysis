package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.AbstractC894380Z6u;
import X.C01GW;
import X.C1559260qg8;
import X.C452501pT;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC2172761A1q;
import X.InterfaceC893080Z1u;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public abstract class ChatActionAssem<T extends AbstractC894380Z6u<?>> extends UISlotAssem {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33((ChatActionAssem) this, 2411));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723590SZx(this, InterfaceC893080Z1u.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33((ChatActionAssem) this, 2410));

    public abstract View ip();

    public abstract BaseActionViewModel<?> kp();

    public abstract void mp();

    public abstract void op();

    public final T hp() {
        return (T) this.LLJJIJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Function1 function1LIZJ;
        super.onDestroy();
        AbstractC894380Z6u abstractC894380Z6uHp = hp();
        if (!(abstractC894380Z6uHp instanceof AbstractC894380Z6u) || abstractC894380Z6uHp == null || (function1LIZJ = abstractC894380Z6uHp.LIZJ()) == null) {
            return;
        }
        function1LIZJ.invoke(kp());
    }

    public final void lp(boolean z) {
        int i;
        ip().setClickable(z);
        View viewIp = ip();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewIp);
        ((InterfaceC2172761A1q) this.LLJJI.getValue()).LIZ(hp(), z);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        int i;
        Function1 function1LIZLLL;
        super.onViewCreated(view);
        op();
        boolean zBooleanValue = hp().LIZ().invoke().booleanValue();
        View viewIp = ip();
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewIp);
        ip().setClickable(zBooleanValue);
        mp();
        C786410Ut5.I7(new AbS712S0100000_33(this, 7), ip());
        AbstractC894380Z6u abstractC894380Z6uHp = hp();
        if ((abstractC894380Z6uHp instanceof AbstractC894380Z6u) && abstractC894380Z6uHp != null && (function1LIZLLL = abstractC894380Z6uHp.LIZLLL()) != null) {
            function1LIZLLL.invoke(kp());
        }
    }
}
