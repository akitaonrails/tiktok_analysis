package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C09IC;
import X.C09IR;
import X.C1411360mpa;
import X.C1781540wSe;
import X.C1784510wXR;
import X.C1784650wXf;
import X.C1784660wXg;
import X.C1785290wYh;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C501470JlZ;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC1784740wXo;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsIndustrySelectVM extends AssemViewModel<C1784660wXg> {
    public final InterfaceC1784740wXo LL;
    public final C2252331DDr LLILLJJLI;
    public final AnonymousClass0950 LLILLL;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    public final void wQ2() {
        C1781540wSe next;
        C1784660wXg state = getState();
        long j = state.LLILLL;
        if (j == 0) {
            return;
        }
        Iterator<C1781540wSe> it2 = state.LLILLJJLI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.LIZ == j) {
                    break;
                }
            }
        }
        boolean z = this.LLIZ;
        setState(new C1784650wXf());
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1784510wXR(this, j, z ? 1 : 0, next, null), 3);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1784660wXg(0);
    }

    public PcsIndustrySelectVM(C1785290wYh c1785290wYh) {
        this.LL = c1785290wYh;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 16, EnumC2252401DDy.DROP_OLDEST, 1);
        this.LLILLJJLI = c2252331DDrLIZIZ;
        this.LLILLL = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1411360mpa.LIZ);
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZLL = "";
    }

    public static String xQ2(Throwable th) {
        C501470JlZ c501470JlZ;
        String prompt;
        if (!(th instanceof C501470JlZ) || (c501470JlZ = (C501470JlZ) th) == null || (prompt = c501470JlZ.getPrompt()) == null) {
            return "";
        }
        return prompt;
    }

    public final boolean vQ2(long j) {
        C1781540wSe c1781540wSe;
        C1781540wSe next;
        C1784660wXg state = getState();
        if (state.LLIZLLLIL == 0) {
            return false;
        }
        Iterator<C1781540wSe> it2 = state.LLILLJJLI.iterator();
        while (true) {
            c1781540wSe = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == state.LLIZLLLIL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1781540wSe c1781540wSe2 = next;
        Iterator<C1781540wSe> it3 = state.LLILLJJLI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1781540wSe next2 = it3.next();
            if (next2.LIZ == j) {
                c1781540wSe = next2;
                break;
            }
        }
        C1781540wSe c1781540wSe3 = c1781540wSe;
        if (c1781540wSe2 == null || !c1781540wSe2.LJ || c1781540wSe3 == null || c1781540wSe3.LJ) {
            return false;
        }
        return true;
    }
}
