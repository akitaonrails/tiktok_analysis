package com.ss.android.ugc.aweme.music.assem.list.cell.compose;

import X.C14EU;
import X.C233800vI;
import X.C608360Nta;
import X.C634020Ots;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS283S0000000_35;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes36.dex */
public final class MusicCellAdd2DspViewModelCompose extends AssemViewModel<C233800vI> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C233800vI(null);
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
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        setState(AFwS283S0000000_35.get$arr$(75));
    }

    @C14EU
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        setState(AFwS283S0000000_35.get$arr$(76));
    }
}
