package com.ss.android.ugc.aweme.social.thought.ui.like;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0PEM;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C319510Cfl;
import X.C319530Cfn;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtInteractionVM extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;

    public SocialThoughtInteractionVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C319530Cfn(null, false, 63));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final void vQ2(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LL.setValue(new C319530Cfn(str, true, 46));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C319510Cfl(str, this, null), 2);
    }
}
