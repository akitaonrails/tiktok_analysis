package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C01GW;
import X.C23250099c;
import X.C338300DOa;
import X.C338310DOb;
import X.C452501pT;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EditProfileSchoolViewModel extends AssemViewModel<C338310DOb> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2193));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2194));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C338310DOb(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C338300DOa(this, null), 3);
    }
}
