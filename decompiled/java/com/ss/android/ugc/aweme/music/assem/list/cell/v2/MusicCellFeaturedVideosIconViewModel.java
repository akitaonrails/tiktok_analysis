package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C1165540gR6;
import X.C14EU;
import X.C1556780qc8;
import X.C1576570r83;
import X.C632090Oql;
import X.EnumC1563010qmB;
import X.InterfaceC0148002o;
import X.InterfaceC738070SxJ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class MusicCellFeaturedVideosIconViewModel extends AssemViewModel<C1556780qc8> implements InterfaceC738070SxJ<C1556780qc8, C632090Oql> {
    public String LL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556780qc8(0);
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
        if (c1165540gR6.LIZIZ && this.LL.length() > 0 && Intrinsics.LJFF(this.LL, c1165540gR6.LIZ)) {
            setState(new AwS603S0100000_24(c1165540gR6, 156));
        }
    }

    @Override // X.InterfaceC738070SxJ
    public final C632090Oql state2ItemAccept(InterfaceC0148002o interfaceC0148002o, C632090Oql c632090Oql) {
        C632090Oql c632090Oql2 = c632090Oql;
        c632090Oql2.getMusicModel().setPinnedVideoStatus(((C1556780qc8) interfaceC0148002o).LL.getValue());
        return c632090Oql2;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, C632090Oql c632090Oql, List list) {
        EnumC1563010qmB enumC1563010qmBLIZ = C1576570r83.LIZ(c632090Oql.getMusicModel().getPinnedVideoStatus());
        interfaceC0148002o.getClass();
        return new C1556780qc8(enumC1563010qmBLIZ);
    }
}
