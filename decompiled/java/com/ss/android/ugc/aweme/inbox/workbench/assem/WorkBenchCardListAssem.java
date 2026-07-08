package com.ss.android.ugc.aweme.inbox.workbench.assem;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0Q4Y;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C623990Odh;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchCardCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchTitleCell;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchCardListAssem extends UIListContentAssem<WorkBenchCardListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C623990Odh.class, "WorkBenchCardListHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchCardListAssem.class, "mainVm", "getMainVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(WorkBenchCardListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchCardListViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public WorkBenchCardListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 841), AFwS240S0000000_9.get$arr$(386), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(WorkBenchCardListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 842), AFwS240S0000000_9.get$arr$(387), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 840));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        WorkBenchCardListViewModel workBenchCardListViewModelIp = ip();
        C623990Odh c623990Odh = (C623990Odh) this.LLIZLLLIL.getValue();
        workBenchCardListViewModelIp.LL = c623990Odh.LL;
        workBenchCardListViewModelIp.LLILLJJLI = c623990Odh.LLILLJJLI;
        workBenchCardListViewModelIp.LLILLL = c623990Odh.LLILLL;
        workBenchCardListViewModelIp.LLJ.clear();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Od0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C623610Od5) obj).LLILLL);
            }
        }, null, new AwS623S0100000_9(this, 80), 6);
        C736680Sv4.LJIIIZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0Od6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C623610Od5) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0Od7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C623610Od5) obj).LLILZ;
            }
        }, null, new AwS658S0100000_9(this, 10), 12);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final WorkBenchCardListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (WorkBenchCardListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(WorkBenchCardCell.class, WorkBenchTitleCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.getState().LIZLLL = C0Q4Y.BUFFER;
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0Odp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C623910OdZ c623910OdZ = (C623910OdZ) obj;
                c623910OdZ.getClass();
                return C627260Oiy.LIZLLL(c623910OdZ);
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 237), 28, null);
    }
}
