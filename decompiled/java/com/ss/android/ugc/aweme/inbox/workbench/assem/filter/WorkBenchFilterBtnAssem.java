package com.ss.android.ugc.aweme.inbox.workbench.assem.filter;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS106S0200000_2;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkBenchFilterBtnAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public C197039127h LLIZLLLIL;
    public C197039127h LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchFilterBtnAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchFilterBtnAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 630), AFwS229S0000000_2.get$arr$(374), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.workbench_filter_cancel_btn);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        C197039127h c197039127h = (C197039127h) viewFindViewById;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS106S0200000_2(fragmentLJI, this, 5));
        }
        View view2 = this.LLJ;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.workbench_filter_done_btn);
            }
            this.LLJ = (C197039127h) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C197039127h c197039127h2 = (C197039127h) view2;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS106S0200000_2(fragmentLJI, this, 6));
        }
    }
}
