package com.ss.android.ugc.profile.business.profile.menu.viewmodel;

import X.C0PEM;
import X.C2296808zG;
import X.C23250099c;
import X.C596280Na6;
import X.C596300Na8;
import X.C596330NaB;
import X.InterfaceC0148002o;
import X.InterfaceC596290Na7;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileMenuViewModel extends AssemViewModel<C596330NaB> {
    public static final /* synthetic */ int LLILLL = 0;
    public final C596300Na8 LL = new C596300Na8();
    public final List<InterfaceC596290Na7> LLILLJJLI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C596330NaB(0);
    }

    public final void vQ2(List<String> list) {
        if (((ArrayList) this.LLILLJJLI).isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C596280Na6(this, list, null), 3);
    }
}
