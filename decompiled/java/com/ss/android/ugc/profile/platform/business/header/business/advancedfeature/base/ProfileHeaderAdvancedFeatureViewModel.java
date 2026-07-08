package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base;

import X.C1251350ifV;
import X.C2217381BqS;
import X.C233500vF;
import X.C291001Au;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.platform.standard.vm.IAdvancedFeatureVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderAdvancedFeatureViewModel extends IAdvancedFeatureVm {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C233500vF(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final void vQ2(Function1<? super C291001Au<String>, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0ib2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C233500vF) obj).LL;
            }
        }, null, null, null, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 478), 14, null);
    }
}
