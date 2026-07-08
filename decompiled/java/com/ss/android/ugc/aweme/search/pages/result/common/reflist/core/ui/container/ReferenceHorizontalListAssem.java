package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.container;

import X.C0H2Z;
import X.C1558520qew;
import X.C434600H2k;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceHorizontalListAssem extends ReusedUISlotAssem<ReferenceHorizontalListAssem> implements InterfaceC712990Rxx<C0H2Z> {
    public C434600H2k LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eze;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C434600H2k c434600H2k = (C434600H2k) view.findViewById(R.id.jrl);
        this.LLJJLIIIJLLLLLLLZ = c434600H2k;
        if (c434600H2k != null) {
            c434600H2k.LIZ(m128do(), C1558520qew.LJIIL(this));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0H2Z c0h2z) {
        C0H2Z c0h2z2 = c0h2z;
        C434600H2k c434600H2k = this.LLJJLIIIJLLLLLLLZ;
        if (c434600H2k != null) {
            C434600H2k.LIZIZ(c434600H2k, c0h2z2.LL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0H2Z c0h2z) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0H2Z c0h2z) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
