package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09IR;
import X.C0PEM;
import X.C1712500ufI;
import X.C1712510ufJ;
import X.C1712550ufN;
import X.C1712610ufT;
import X.C1776150wJx;
import X.C2185208hG;
import X.C2252331DDr;
import X.C23250099c;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class GiftCardCheckoutVM extends AssemViewModel<C1712550ufN> {
    public final long LL = System.currentTimeMillis();
    public String LLILLJJLI;
    public String LLILLL;
    public C1712610ufT LLILZ;
    public final C1776150wJx LLILZIL;
    public final C1776150wJx LLILZLL;
    public final C1776150wJx LLIZ;
    public final C2252331DDr LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1712550ufN(0);
    }

    public final void vQ2() {
        String str;
        C1712610ufT c1712610ufT = this.LLILZ;
        if (c1712610ufT == null || (str = c1712610ufT.LLILZ) == null) {
            setState(AFwS268S0000000_26.get$arr$(697));
        } else {
            setState(AFwS268S0000000_26.get$arr$(324));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ.plus(this.LLILZIL), null, new C1712510ufJ(str, this, null), 2);
        }
    }

    public final void wQ2() {
        String str;
        C1712610ufT c1712610ufT = this.LLILZ;
        if (c1712610ufT == null || (str = c1712610ufT.LLILZ) == null) {
            return;
        }
        setState(AFwS268S0000000_26.get$arr$(325));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ.plus(this.LLIZ), null, new C1712500ufI(str, this, null), 2);
    }

    public GiftCardCheckoutVM() {
        C2185208hG c2185208hG = CoroutineExceptionHandler.LJJLIL;
        this.LLILZIL = new C1776150wJx(c2185208hG, this, 1);
        this.LLILZLL = new C1776150wJx(c2185208hG, this, 2);
        this.LLIZ = new C1776150wJx(c2185208hG, this, 3);
        this.LLIZLLLIL = C09IR.LIZIZ(0, 0, null, 7);
    }
}
