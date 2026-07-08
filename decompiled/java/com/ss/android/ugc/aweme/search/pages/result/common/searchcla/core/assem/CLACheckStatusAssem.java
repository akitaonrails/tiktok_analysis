package com.ss.android.ugc.aweme.search.pages.result.common.searchcla.core.assem;

import X.AbstractC738140SxQ;
import X.C0PRC;
import X.C0Q3E;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C23250099c;
import X.C2433809gG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724760Sbq;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class CLACheckStatusAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CLACheckStatusAssem.class, "searchEllipsisVM", "getSearchEllipsisVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/ellipsis/core/viewmodel/SearchEllipsisVM;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CLACheckStatusAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchEllipsisVM.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 568), AFwS236S0000000_6.get$arr$(279), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Fragment fragmentLJI;
        super.onResume();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragmentLJI), null, null, new C2433809gG(this, fragmentLJI, c19egLIZ, ((C0PRC) C0Q3E.LIZIZ(fragmentLJI).Ph1().LIZJ()).LL, null), 3);
    }
}
