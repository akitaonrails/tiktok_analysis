package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C1559260qg8;
import X.C1571980r0e;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes25.dex */
public final class EffectDoneVM extends AssemViewModel<C1571980r0e> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) EffectDoneInitState.class, (Class<Object>) "mobile_effect_done_state", (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1571980r0e(((EffectDoneInitState) this.LL.getValue()).effectName, ((EffectDoneInitState) this.LL.getValue()).author, ((EffectDoneInitState) this.LL.getValue()).originalEffectImage, ((EffectDoneInitState) this.LL.getValue()).editedImage, null);
    }
}
