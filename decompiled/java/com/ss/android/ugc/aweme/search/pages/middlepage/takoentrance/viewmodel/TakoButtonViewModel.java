package com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.viewmodel;

import X.C0QS8;
import X.C301360Bra;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS6S0000001_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoButtonViewModel extends AssemViewModel<C0QS8> {
    public static final /* synthetic */ int LLJILJIL = 0;
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public float LLILZLL = -1.0f;
    public int LLIZLLLIL = -2;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0QS8(0);
    }

    public final void wQ2(int i) {
        boolean z;
        if (this.LLIZLLLIL != i) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = i;
        if (z) {
            if (i == 1 || i == 2) {
                xQ2(false);
            }
        }
    }

    public final void xQ2(boolean z) {
        if (!this.LLJ) {
            return;
        }
        int i = this.LLIZLLLIL;
        if (i != 1 && i != 2) {
            return;
        }
        setStateImmediate(new AwS25S0010000_10(z, 2));
    }

    public final void yQ2(boolean z) {
        boolean z2;
        if (this.LLJ != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJ = z;
        if (z) {
            setStateImmediate(AFwS241S0000000_10.get$arr$(199));
        } else {
            setStateImmediate(AFwS241S0000000_10.get$arr$(200));
        }
        if (z2 && z) {
            xQ2(false);
        }
    }

    public final void vQ2(int i, int i2, int i3, int i4) {
        if (!C301360Bra.LIZ()) {
            yQ2(true);
        }
        setStateImmediate(new AwS6S0000001_10(i, 1));
        setStateImmediate(new AwS6S0000001_10(i3, 0));
        this.LLILLL = i4;
        this.LLILLJJLI = i2;
        this.LL = i;
    }
}
