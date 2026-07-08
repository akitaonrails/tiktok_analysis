package com.ss.android.ugc.aweme.inbox.workbench.assem;

import X.C01D1;
import X.C1203130hPj;
import X.C1308910kAL;
import X.C13LE;
import X.C1582480rHa;
import X.C1582580rHk;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1166860gTE;
import X.InterfaceC1203170hPn;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.workbench.data.WorkBenchCardListFragmentData;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchVPFragmentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLIZLLLIL;
    public C1203130hPj LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchVPFragmentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchVPFragmentAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 847), AFwS240S0000000_9.get$arr$(391), null, true);
    }

    public final WorkBenchViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (WorkBenchViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20631115oD Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.workbench_view_pager) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDHo = Ho();
        if (viewOnAttachStateChangeListenerC20631115oDHo != null) {
            viewOnAttachStateChangeListenerC20631115oDHo.setUserInputEnabled(false);
            viewOnAttachStateChangeListenerC20631115oDHo.setSmoothScrollEnabled(false);
        }
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.workbench_main_chips);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (C1203130hPj) viewFindViewById;
        }
        C1203130hPj c1203130hPj = (C1203130hPj) viewFindViewById;
        if (c1203130hPj != null) {
            c1203130hPj.setVariant(EnumC1166860gTE.RECTANGLE);
            c1203130hPj.setWidthRule(new C1582580rHk(0, 0, 7));
            c1203130hPj.setSelectionStyle(new C1582480rHa(C1308910kAL.LIZJ(R.attr.j0, c1203130hPj.getContext()), C1308910kAL.LIZJ(R.attr.j1, c1203130hPj.getContext()), C1308910kAL.LIZJ(R.attr.a03, c1203130hPj.getContext()), C1308910kAL.LIZJ(R.attr.a1h, c1203130hPj.getContext())));
            c1203130hPj.setFont(62);
            c1203130hPj.setHorizontalMargin(16);
            c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0Odm
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    WorkBenchCardListFragmentData workBenchCardListFragmentData;
                    int value;
                    if (z) {
                        this.LIZ.Ho().setCurrentItem(i);
                        List<InterfaceC1891350zJl> listLJII = this.LIZ.Ho().getFragmentItemOperator().getState().LJII();
                        if (i < ((ArrayList) listLJII).size()) {
                            Object obj = ListProtector.get(listLJII, i);
                            if (obj instanceof WorkBenchCardListFragmentData) {
                                workBenchCardListFragmentData = (WorkBenchCardListFragmentData) obj;
                            } else {
                                workBenchCardListFragmentData = null;
                            }
                            WorkBenchViewModel workBenchViewModelGo = this.LIZ.Go();
                            if (workBenchCardListFragmentData != null) {
                                value = workBenchCardListFragmentData.tabId;
                            } else {
                                value = EnumC623890OdX.TAB_UNKNOWN.getValue();
                            }
                            workBenchViewModelGo.LLILZ = value;
                        }
                    }
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OdU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C623610Od5) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 232), 6);
        Go().init();
    }
}
