package com.ss.android.ugc.aweme.innerpush.refactor.vm;

import X.C1559260qg8;
import X.C1591806Lc;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseInnerPushVM<S extends InterfaceC0148002o> extends AssemViewModel<S> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1591806Lc.class, (Class<Object>) null, (String) 13), true);

    public final InnerPushUITemplate vQ2() {
        return ((C1591806Lc) this.LL.getValue()).LL.getValue().getUiTemplate();
    }
}
