package com.ss.android.ugc.aweme.share.dislike;

import X.InterfaceC20623415my;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes32.dex */
public final class ChooseItemViewModel extends ViewModel {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ = true;
    public InterfaceC20623415my LLILZIL;

    public final void reset() {
        this.LL = 0;
        this.LLILLJJLI = 0;
        vQ2(0);
        this.LLILZ = true;
        this.LLILZIL = null;
    }

    public final void vQ2(int i) {
        InterfaceC20623415my interfaceC20623415my;
        InterfaceC20623415my interfaceC20623415my2;
        if (this.LLILLL <= 0) {
            if (i > 0 && (interfaceC20623415my2 = this.LLILZIL) != null) {
                interfaceC20623415my2.LIZIZ();
            }
        } else if (i <= 0 && (interfaceC20623415my = this.LLILZIL) != null) {
            interfaceC20623415my.LIZ();
        }
        this.LLILLL = i;
    }
}
