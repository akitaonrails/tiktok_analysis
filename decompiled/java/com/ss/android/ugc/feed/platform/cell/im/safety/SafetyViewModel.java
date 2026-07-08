package com.ss.android.ugc.feed.platform.cell.im.safety;

import X.C0R6I;
import X.C912070ZqH;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes15.dex */
public final class SafetyViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ = "";

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (!this.LLILLJJLI && this.LL && !this.LLILLL) {
            C912070ZqH.LIZIZ.LJIJJ().LIZLLL(this.LLILZ);
        }
        super.onCleared();
    }

    public final void vQ2(C0R6I c0r6i) {
        int i;
        if (!this.LLILLJJLI && !this.LL) {
            if (c0r6i.isNudityMask() && c0r6i.isSafetyMask()) {
                i = 2;
            } else if (c0r6i.isNudityMask()) {
                i = 1;
            } else {
                i = 0;
            }
            C912070ZqH.LIZIZ.LJIJJ().LIZ(i, this.LLILZ);
        }
    }
}
