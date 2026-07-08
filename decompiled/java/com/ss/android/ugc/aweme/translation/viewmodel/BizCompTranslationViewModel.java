package com.ss.android.ugc.aweme.translation.viewmodel;

import X.AbstractC903430ZcL;
import X.C09AE;
import X.C162V;
import X.C163D;
import X.C1BNE;
import X.C1E8U;
import X.C207134163o;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C708160RqA;
import X.C708170RqB;
import X.C708180RqC;
import X.C903370ZcF;
import X.C903410ZcJ;
import X.C903440ZcM;
import X.C903450ZcN;
import X.EnumC207101162h;
import X.EnumC715590S5d;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public final class BizCompTranslationViewModel extends IBizCompTranslationViewModel {
    public final C163D LL;
    public C207134163o LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel
    public final void AQ2() {
        C163D c163d = this.LL;
        c163d.getClass();
        c163d.LJIIIIZZ(EnumC715590S5d.CLICK, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C903370ZcF(C903410ZcJ.LIZIZ, null);
    }

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel
    public final void xQ2() {
        C163D c163d = this.LL;
        c163d.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start: id=");
        C207134163o c207134163o = c163d.LJ;
        sbLIZ.append(c207134163o != null ? c207134163o.LIZJ : null);
        C2188811AlT.LIZIZ(sbLIZ);
        c163d.LJIIJ = true;
        c163d.LJIIIIZZ = null;
        c163d.LJIILL.getClass();
        ((ArrayList) c163d.LJIJJLI).add(C23250099c.LIZLLL(c163d.LJIILIIL, null, null, new C708180RqC(c163d, null), 3));
        ((ArrayList) c163d.LJIJJLI).add(C23250099c.LIZLLL(c163d.LJIILIIL, null, null, new C708160RqA(c163d, null), 3));
        ((ArrayList) c163d.LJIJJLI).add(C23250099c.LIZLLL(c163d.LJIILIIL, null, null, new C708170RqB(c163d, null), 3));
        c163d.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel
    public final void yQ2() {
        C163D c163d = this.LL;
        c163d.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop: id=");
        C207134163o c207134163o = c163d.LJ;
        sbLIZ.append(c207134163o != null ? c207134163o.LIZJ : null);
        C2188811AlT.LIZIZ(sbLIZ);
        c163d.LJIIJ = false;
        c163d.LJIIIIZZ = C162V.SWITCH_VIDEO;
        c163d.LJI = null;
        Iterator it2 = ((ArrayList) c163d.LJIJJLI).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ArrayList) c163d.LJIJJLI).clear();
        c163d.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel
    public final void zQ2() {
        C163D c163d = this.LL;
        c163d.getClass();
        c163d.LJIJJLI(EnumC715590S5d.CLICK);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C1E8U.LIZ()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C903440ZcM(this, null), 3);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C903450ZcN(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel
    public final C2252321DDq wQ2() {
        return this.LLILZ;
    }

    public BizCompTranslationViewModel(EnumC207101162h enumC207101162h) {
        this.LL = new C163D(ViewModelKt.getViewModelScope(this), enumC207101162h);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C903410ZcJ.LIZIZ);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = c2252321DDqLIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel
    public final void vQ2(C207134163o c207134163o) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindToBizComp: old id=");
        C207134163o c207134163o2 = this.LLILLJJLI;
        if (c207134163o2 != null) {
            str = c207134163o2.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append("chat page");
        sbLIZ.append(", sourceLanguage=");
        sbLIZ.append(c207134163o.LJ);
        sbLIZ.append(", sourceContent=");
        sbLIZ.append(c207134163o.LIZLLL);
        sbLIZ.append(", bizCompData=");
        sbLIZ.append(c207134163o.LJFF);
        sbLIZ.append(", id=");
        sbLIZ.append(c207134163o.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI = c207134163o;
        C163D c163d = this.LL;
        c163d.LJIIL = 0;
        AbstractC903430ZcL abstractC903430ZcLLJJIII = c163d.LJJIII(c207134163o, "chat page");
        C2252321DDq c2252321DDq = this.LLILLL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), abstractC903430ZcLLJJIII)) {
        }
        C903370ZcF.LIZ(new C903370ZcF(C903410ZcJ.LIZIZ, null), abstractC903430ZcLLJJIII, null, 2);
    }
}
