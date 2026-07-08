package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC738140SxQ;
import X.C0JHC;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C16F5;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C489110JGb;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import wh6.AbS499S0200000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCoursePinnedNoticeAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(135), new AwS551S0100000_7((AbstractC738140SxQ) this, 377), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;
    public C16F5 LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public LiveIconView LLJJJ;
    public C16F5 LLJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlh;
    }

    public final C0JHC hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.qgy);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.gp8);
        this.LLJJJ = (LiveIconView) view.findViewById(R.id.qgv);
        this.LLJJJIL = (C16F5) view.findViewById(R.id.qgx);
        this.LLJJIJIL = (ViewGroup) view.findViewById(R.id.qgw);
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C786410Ut5.I7(new AbS499S0200000_7(view, this, 11), viewGroup);
        }
        C489110JGb.LJ(hp(), "show");
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0JDT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 67), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0JDN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLJI;
            }
        }, null, new AwS621S0100000_7(this, 69), 6);
    }
}
