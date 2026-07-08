package com.ss.android.ugc.aweme.comment.photocomment;

import X.C1344550l5p;
import X.C1351950lHl;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1875607Wg;
import X.C294410BgN;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC494301wD;
import X.InterfaceC712990Rxx;
import Y.AfS156S0200000_21;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerInteractMaskAssem extends ReusedUIContentAssem<CommentInnerInteractMaskAssem> implements InterfaceC712990Rxx<C1875607Wg>, MaskHeightChangeAbility, InterfaceC1554640qYg {
    public View LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2048697543) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.MaskHeightChangeAbility
    public final void da1(boolean z) {
        if (z) {
            View view = this.LLJJJJ;
            if (view != null) {
                C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(158)), view);
                return;
            }
            return;
        }
        View view2 = this.LLJJJJ;
        if (view2 == null) {
            return;
        }
        C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), view2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        this.LLJJJJ = view;
        if (C294410BgN.LIZIZ() && (view2 = this.LLJJJJ) != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS156S0200000_21(view, this, 1));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1875607Wg c1875607Wg) {
        View view = this.LLJJJJ;
        if (view != null) {
            C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1875607Wg c1875607Wg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1875607Wg c1875607Wg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
