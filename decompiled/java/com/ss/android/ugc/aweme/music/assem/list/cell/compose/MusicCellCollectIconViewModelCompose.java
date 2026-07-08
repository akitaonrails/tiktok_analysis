package com.ss.android.ugc.aweme.music.assem.list.cell.compose;

import X.C0OGJ;
import X.C14EU;
import X.C2344809Gs;
import X.C616430OFt;
import X.C622680Oba;
import X.C631640Oq2;
import X.C631690Oq7;
import X.InterfaceC0148002o;
import X.InterfaceC616440OFu;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS60S1000000_9;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellCollectIconViewModelCompose extends AssemViewModel<C631690Oq7> implements InterfaceC616440OFu {
    public C631640Oq2 LLILLJJLI;
    public final HashMap<String, Boolean> LL = new HashMap<>();
    public final C616430OFt LLILLL = new C616430OFt();

    @Override // X.InterfaceC616440OFu
    public final void ZX() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C631690Oq7(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        this.LLILLL.LLILLJJLI = this;
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC616440OFu
    public final void Me1(String str) {
        if (str == null) {
            return;
        }
        setState(new AwS60S1000000_9(str, 6));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C0OGJ c0ogj) {
        boolean z = true;
        if (c0ogj.LIZIZ != 1) {
            z = false;
        }
        if (!Intrinsics.LJFF(this.LL.get(c0ogj.LIZ), Boolean.valueOf(z))) {
            this.LL.put(c0ogj.LIZ, Boolean.valueOf(z));
            setState(new AwS97S0110000_9(c0ogj, z, 3));
        }
    }

    @Override // X.InterfaceC616440OFu
    public final void p30(Exception exc) {
        C2344809Gs.LJI(exc);
    }
}
