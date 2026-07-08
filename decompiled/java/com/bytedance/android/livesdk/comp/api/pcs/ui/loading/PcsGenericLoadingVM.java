package com.bytedance.android.livesdk.comp.api.pcs.ui.loading;

import X.AbstractC489590JHx;
import X.C1722300uv6;
import X.C2173691A5f;
import X.C2173701A5g;
import X.InterfaceC0148002o;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS119S0110000_33;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PcsGenericLoadingVM extends AssemViewModel<C2173691A5f> implements IPcsLoadingAbility {
    @Override // com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility
    public final void LJJJJL() {
        setState(AFwS279S0000000_33.get$arr$(15));
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility
    public final void LJLJLJ() {
        setState(AFwS279S0000000_33.get$arr$(14));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2173691A5f(0);
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility
    public final void Ro0(View view) {
        setState(new AwS612S0100000_33(view, 26));
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility
    public final void j3(int i) {
        setState(new C2173701A5g(i));
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility
    public final PcsGenericLoadingVM dj1(AbstractC489590JHx abstractC489590JHx, boolean z) {
        setState(new AwS119S0110000_33(abstractC489590JHx, z, 1));
        return this;
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility
    public final void Ly2(C1722300uv6 c1722300uv6, Function0<Unit> function0, Float f) {
        setState(new AwS242S0300000_33(c1722300uv6, (C1722300uv6) function0, (Function0<Unit>) f, (Float) 3));
    }
}
