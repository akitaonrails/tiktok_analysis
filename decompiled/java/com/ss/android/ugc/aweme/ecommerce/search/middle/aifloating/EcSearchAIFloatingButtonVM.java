package com.ss.android.ugc.aweme.ecommerce.search.middle.aifloating;

import X.C0QUT;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C674530Qd1;
import X.C814420VxA;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS6S0000001_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchAIFloatingButtonVM extends AssemViewModel<C674530Qd1> {
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    public final List<C0QUT> LL = C1697810uHb.LJIIJJI(C0QUT.SUGGEST, C0QUT.SUG);
    public C0QUT LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C674530Qd1(null, null);
    }

    public final void vQ2(int i) {
        int i2 = (LLILZ - LLILLL) - i;
        if (i2 > 0) {
            i2 = 0;
        }
        setStateImmediate(new AwS6S0000001_10(i2, 2));
    }
}
