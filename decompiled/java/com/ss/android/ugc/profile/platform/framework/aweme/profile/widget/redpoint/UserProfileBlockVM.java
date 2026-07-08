package com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint;

import X.C09YA;
import X.C09Z8;
import X.C09ZA;
import X.C23250099c;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class UserProfileBlockVM extends AssemViewModel<C09Z8> {
    public final C09YA LL = new C09YA(this, AFwS189S0000000_3.get$arr$(601));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C09Z8(0);
    }

    public final void vQ2(Context context, int i, String str, int i2, String str2) {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C09ZA(this, str, str2, i, i2, context, null), 3);
    }
}
