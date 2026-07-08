package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.C19257710Vr;
import X.C19257810Vs;
import X.C19257910Vt;
import X.EnumC19257610Vq;
import androidx.lifecycle.ViewModel;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSAgeGateContainerCleanViewModel extends ViewModel {
    public final Set<EnumC19257610Vq> LL = new LinkedHashSet();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        for (EnumC19257610Vq enumC19257610Vq : this.LL) {
            C19257810Vs.LIZ.remove(enumC19257610Vq);
            C19257710Vr.LIZ.remove(enumC19257610Vq);
            C19257910Vt.LIZ.remove(enumC19257610Vq);
        }
    }
}
