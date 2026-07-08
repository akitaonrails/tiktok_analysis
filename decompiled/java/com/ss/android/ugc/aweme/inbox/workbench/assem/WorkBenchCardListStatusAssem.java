package com.ss.android.ugc.aweme.inbox.workbench.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C622590ObR;
import X.C622600ObS;
import X.C623900OdY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchCardListStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public C1749280vcc LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchCardListStatusAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchCardListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchCardListStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchCardListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 843), AFwS240S0000000_9.get$arr$(388), null, true);
    }

    public final WorkBenchCardListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (WorkBenchCardListViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.workbench_card_list_status) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void Jo(String str) {
        if (Go().LLIZ) {
            C622590ObR.LJI.LJIIIZ(str);
            return;
        }
        C622600ObS c622600ObS = C622600ObS.LJI;
        String strLIZ = C623900OdY.LIZ(Go().LL);
        c622600ObS.getClass();
        if (!TextUtils.equals(strLIZ, C622600ObS.LJIIIZ) || !c622600ObS.LJ()) {
            return;
        }
        C622600ObS.LJII = str;
        c622600ObS.LIZLLL = C622600ObS.LJIIIZ;
        C622600ObS.LJIIIIZZ.LIZIZ();
        c622600ObS.LJII();
        c622600ObS.LJIIIIZZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OdV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C623910OdZ) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 81), 6);
    }
}
