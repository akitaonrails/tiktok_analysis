package com.ss.android.ugc.aweme.hangout.common.contract;

import X.C479650IrT;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LiveHangoutV2SelectableListContentAssem<VM extends AssemListViewModel<?, ?, ?>> extends UIListContentAssem<VM> {
    public final C479650IrT LLIZLLLIL = new C479650IrT(this);

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL.LIZIZ();
    }
}
