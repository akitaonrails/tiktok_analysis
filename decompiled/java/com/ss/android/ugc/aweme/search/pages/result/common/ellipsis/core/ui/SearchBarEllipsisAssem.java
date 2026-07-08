package com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui;

import X.C01GW;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2217381BqS;
import X.C288510BSn;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBarEllipsisAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public View LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final AssemVMLazy LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchBarEllipsisAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/result/common/ellipsis/core/viewmodel/SearchEllipsisVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchBarEllipsisAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchEllipsisVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 445), AFwS241S0000000_10.get$arr$(211), null, true);
        this.LLJILJIL = C288510BSn.LIZ();
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 444));
    }

    public final SearchEllipsisVM Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (SearchEllipsisVM) assemVMLazy.getValue();
    }

    public final void Ho(Lifecycle.State state) {
        Fragment fragmentLJI;
        FragmentManager fragmentManager;
        Fragment fragmentLJJJJZI;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        sAFHelper.getClass();
        if (!SAFHelper.LJJJJJ(fragmentLJI2, c19egLIZ) && !SAFHelper.LJJJJI(C724240Sb0.LJI(this), c19egLIZ) && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.isAdded() && (fragmentManager = (FragmentManager) this.LLJILJILJ.getValue()) != null && (fragmentLJJJJZI = fragmentManager.LJJJJZI("container")) != null) {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIL(fragmentLJJJJZI, state);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 4), view);
    }
}
