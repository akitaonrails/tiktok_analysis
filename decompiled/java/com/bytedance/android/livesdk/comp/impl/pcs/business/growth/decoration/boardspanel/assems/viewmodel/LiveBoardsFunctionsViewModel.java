package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel;

import X.AnonymousClass0034;
import X.C1781580wSi;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class LiveBoardsFunctionsViewModel extends AssemViewModel<AnonymousClass0034> {
    public DataChannel LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AnonymousClass0034(0);
    }

    public LiveBoardsFunctionsViewModel() {
        new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1781580wSi.class, (Class<Object>) null, (String) 13);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = null;
    }
}
