package com.bytedance.ies.foundation;

import X.C13LP;
import X.C19D2;
import X.C19DP;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class FoundationActivityViewModel extends BaseActivityViewModel {
    @Override // com.bytedance.ies.foundation.activity.BaseActivityViewModel, com.bytedance.ies.foundation.base.BaseViewModel
    public final List<C19D2> xQ2() {
        return C13LP.LJLIL(C19DP.LIZ.invoke(), Collections.singletonList(new C19D2() { // from class: X.19DN
            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
                super.LJJIIZI(baseActivity, bundle);
                baseActivity.setActivityRef(new WeakReference<>(baseActivity));
            }
        }));
    }
}
