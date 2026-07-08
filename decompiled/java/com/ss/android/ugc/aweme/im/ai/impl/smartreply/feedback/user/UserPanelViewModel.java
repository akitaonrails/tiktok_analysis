package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user;

import X.AnonymousClass0609;
import X.C060B;
import X.C08CX;
import X.C1559260qg8;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes3.dex */
public final class UserPanelViewModel extends AssemViewModel<C060B> {
    public final C1559260qg8<AnonymousClass0609> LL = new C1559260qg8<>(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) AnonymousClass0609.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C060B(this.LL.getValue().LL.feedBackReasons, C08CX.INSTANCE, 1);
    }
}
