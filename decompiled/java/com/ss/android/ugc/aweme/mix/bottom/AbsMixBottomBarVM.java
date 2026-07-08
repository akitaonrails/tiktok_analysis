package com.ss.android.ugc.aweme.mix.bottom;

import X.C723070SXx;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsMixBottomBarVM extends AssemViewModel<C723070SXx> {
    public abstract boolean vQ2(String str, String str2);

    public abstract void wQ2(Context context, Aweme aweme, String str, boolean z);

    public abstract void xQ2(Aweme aweme);

    public abstract void yQ2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C723070SXx(0);
    }
}
