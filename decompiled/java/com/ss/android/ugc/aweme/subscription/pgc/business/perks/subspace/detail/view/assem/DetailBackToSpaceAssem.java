package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem;

import X.C0K3S;
import X.C1554960qZC;
import X.C1558520qew;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailBackToSpaceAssem extends UISlotAssem {
    public C0K3S LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh4;
    }

    public final C0K3S hp() {
        if (this.LLJJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0K3S.class, null);
            this.LLJJI = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        C0K3S c0k3sHp = hp();
        if (c0k3sHp != null && (str = c0k3sHp.LLJIJIL) != null && str.length() != 0) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 8), view.findViewById(R.id.m1b));
        } else {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }
}
