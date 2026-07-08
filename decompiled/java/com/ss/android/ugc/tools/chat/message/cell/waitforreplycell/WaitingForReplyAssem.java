package com.ss.android.ugc.tools.chat.message.cell.waitforreplycell;

import X.AnonymousClass0956;
import X.AnonymousClass1887;
import X.C01GW;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C21162917rn;
import X.C21163117rp;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.C902860ZbQ;
import X.EnumC452301pR;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class WaitingForReplyAssem extends ReusedUISlotAssem<WaitingForReplyAssem> implements InterfaceC712990Rxx<C902860ZbQ> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 982));
    public final C01GW LLJL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS576S0100000_32(this, 424));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.aek;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass1887 anonymousClass1887 = (AnonymousClass1887) this.LLJL.getValue();
        if (anonymousClass1887 != null) {
            AnonymousClass0956 anonymousClass0956 = anonymousClass1887.LJIIIIZZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            anonymousClass1887.LJIIIIZZ = null;
            View view = (View) anonymousClass1887.LIZLLL.getValue();
            view.animate().cancel();
            C786410Ut5.ed(view, 0.0f);
            View view2 = (View) anonymousClass1887.LJ.getValue();
            view2.animate().cancel();
            C786410Ut5.ed(view2, 0.0f);
            View view3 = (View) anonymousClass1887.LJFF.getValue();
            view3.animate().cancel();
            C786410Ut5.ed(view3, 0.0f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C902860ZbQ c902860ZbQ) {
        AnonymousClass1887 anonymousClass1887 = (AnonymousClass1887) this.LLJL.getValue();
        if (anonymousClass1887 != null) {
            if (C21163117rp.LIZIZ().LJFF()) {
                C786410Ut5.LJLLLLLL(0, (View) anonymousClass1887.LJI.getValue());
                C786410Ut5.LJLLLLLL(8, (View) anonymousClass1887.LJII.getValue());
            } else {
                C786410Ut5.LJLLLLLL(8, (View) anonymousClass1887.LJI.getValue());
                C786410Ut5.LJLLLLLL(0, (View) anonymousClass1887.LJII.getValue());
            }
            if (anonymousClass1887.LJIIIIZZ == null) {
                LifecycleCoroutineScope lifecycleCoroutineScope = anonymousClass1887.LIZIZ;
                C1DFH c1dfh = C0PEM.LIZ;
                anonymousClass1887.LJIIIIZZ = C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C21162917rn(anonymousClass1887, null), 2);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C902860ZbQ c902860ZbQ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C902860ZbQ c902860ZbQ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
