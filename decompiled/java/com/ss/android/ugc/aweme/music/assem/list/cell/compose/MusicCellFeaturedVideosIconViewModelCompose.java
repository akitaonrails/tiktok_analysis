package com.ss.android.ugc.aweme.music.assem.list.cell.compose;

import X.C1165540gR6;
import X.C14EU;
import X.C1556770qc7;
import X.EnumC1563010qmB;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class MusicCellFeaturedVideosIconViewModelCompose extends AssemViewModel<C1556770qc7> {
    public final HashMap<String, EnumC1563010qmB> LL = new HashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556770qc7(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onUpdateFeaturedAwemeEvent(C1165540gR6 c1165540gR6) {
        if (c1165540gR6.LIZIZ) {
            setState(new AwS603S0100000_24(c1165540gR6, 155));
        }
    }
}
