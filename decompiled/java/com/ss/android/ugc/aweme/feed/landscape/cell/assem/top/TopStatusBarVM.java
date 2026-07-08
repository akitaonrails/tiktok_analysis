package com.ss.android.ugc.aweme.feed.landscape.cell.assem.top;

import X.C036E;
import X.C0XF2;
import X.C0XF5;
import X.C14EU;
import X.C1554320qYA;
import X.C19419910yL;
import X.C2411409ce;
import X.C738650SyF;
import X.EnumC19371710qZ;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TopStatusBarVM extends FeedBaseViewModel<C19419910yL> {
    public final C738650SyF LL = new C738650SyF(this, 0);
    public final C1554320qYA LLILLJJLI = new C1554320qYA(this, 0);

    public static EnumC19371710qZ vQ2() {
        if (!C0XF5.LIZIZ()) {
            return EnumC19371710qZ.NONE;
        }
        if (C036E.LIZ.LIZJ()) {
            return EnumC19371710qZ.WIFI;
        }
        C0XF2 c0xf2LIZ = C0XF5.LIZ();
        return (c0xf2LIZ == C0XF2.MOBILE || c0xf2LIZ == C0XF2.MOBILE_2G || c0xf2LIZ == C0XF2.MOBILE_3G || c0xf2LIZ == C0XF2.MOBILE_4G) ? EnumC19371710qZ.MOBILE : EnumC19371710qZ.NONE;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C19419910yL(vQ2(), System.currentTimeMillis(), false, 0);
    }

    @C14EU
    public final void onNetworkChangeEvent(C2411409ce c2411409ce) {
        setState(new AwS608S0100000_29(vQ2(), 826));
    }
}
