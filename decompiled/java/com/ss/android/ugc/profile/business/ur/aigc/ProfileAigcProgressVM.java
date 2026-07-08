package com.ss.android.ugc.profile.business.ur.aigc;

import X.C1221790htp;
import X.C1221830htt;
import X.EnumC1221770htn;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcProgressVM extends AssemViewModel<C1221790htp> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1221790htp(EnumC1221770htn.IDLE);
    }

    public static void vQ2(ProfileAigcProgressVM profileAigcProgressVM, EnumC1221770htn enumC1221770htn, int i, int i2, String str) {
        profileAigcProgressVM.setState(new C1221830htt(enumC1221770htn, i, i2, str, null));
    }
}
