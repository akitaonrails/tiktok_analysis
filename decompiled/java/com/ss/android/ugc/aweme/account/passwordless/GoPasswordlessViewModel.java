package com.ss.android.ugc.aweme.account.passwordless;

import X.C0PEM;
import X.C1678370tmF;
import X.C1678380tmG;
import X.C1678420tmK;
import X.C23250099c;
import X.InterfaceC0148002o;
import android.app.Activity;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes26.dex */
public final class GoPasswordlessViewModel extends AssemViewModel<C1678380tmG> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1678380tmG(0);
    }

    public final void vQ2(Activity activity) {
        C1678420tmK.LIZ.getClass();
        C1678420tmK.LIZJ("remove_password", "", true);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1678370tmF(this, activity, null), 2);
    }
}
