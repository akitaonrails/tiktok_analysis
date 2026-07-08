package com.ss.android.ugc.aweme.chatdetail.redesign.notify;

import X.C06VL;
import X.C1383370m6R;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C2003407t2;
import X.C877500Ybc;
import X.C894180Z6a;
import X.EnumC877490Ybb;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupNotifyViewModel extends AssemViewModel<C2003407t2> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C06VL.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2003407t2(vQ2(C877500Ybc.LIZ(((C06VL) this.LL.getValue()).LL)));
    }

    public static List vQ2(EnumC877490Ybb enumC877490Ybb) {
        boolean z;
        boolean z2;
        boolean z3;
        String strLJIIJ = C1383370m6R.LJIIJ(2131831474);
        String strLJIIJ2 = C1383370m6R.LJIIJ(2131831475);
        EnumC877490Ybb enumC877490Ybb2 = EnumC877490Ybb.ALL;
        if (enumC877490Ybb == enumC877490Ybb2) {
            z = true;
        } else {
            z = false;
        }
        C894180Z6a c894180Z6a = new C894180Z6a(strLJIIJ, strLJIIJ2, z, enumC877490Ybb2);
        String strLJIIJ3 = C1383370m6R.LJIIJ(2131831477);
        String strLJIIJ4 = C1383370m6R.LJIIJ(2131831478);
        EnumC877490Ybb enumC877490Ybb3 = EnumC877490Ybb.HIGHLIGHTS;
        if (enumC877490Ybb == enumC877490Ybb3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C894180Z6a c894180Z6a2 = new C894180Z6a(strLJIIJ3, strLJIIJ4, z2, enumC877490Ybb3);
        String strLJIIJ5 = C1383370m6R.LJIIJ(2131831479);
        String strLJIIJ6 = C1383370m6R.LJIIJ(2131831480);
        EnumC877490Ybb enumC877490Ybb4 = EnumC877490Ybb.MUTE;
        if (enumC877490Ybb == enumC877490Ybb4) {
            z3 = true;
        } else {
            z3 = false;
        }
        return C1697810uHb.LJIIJJI(c894180Z6a, c894180Z6a2, new C894180Z6a(strLJIIJ5, strLJIIJ6, z3, enumC877490Ybb4));
    }
}
