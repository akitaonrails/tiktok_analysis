package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.C231300ut;
import X.C658410Ps7;
import X.InterfaceC0148002o;
import X.InterfaceC738070SxJ;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class UserPhotoViewModel extends AssemViewModelWithItem<C231300ut, C658410Ps7> implements InterfaceC738070SxJ<C231300ut, C658410Ps7> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C231300ut(null);
    }

    @Override // X.InterfaceC738070SxJ
    public final C658410Ps7 state2ItemAccept(InterfaceC0148002o interfaceC0148002o, C658410Ps7 c658410Ps7) {
        return c658410Ps7;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, C658410Ps7 c658410Ps7, List list) {
        return new C231300ut(null);
    }
}
