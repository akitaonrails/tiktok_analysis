package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C01GW;
import X.C0MW8;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C317390CcL;
import X.C317400CcM;
import X.C452501pT;
import X.C549720LhC;
import X.C563290M7j;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EditProfileAITheaterViewModel extends AssemViewModel<C317400CcM> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 320));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C317400CcM(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            aITheaterProfileServiceLIZ.X8();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C0MW8 c0mw8LJ;
        super.onPrepared();
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C317390CcL(this, null), 2);
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
            c0mw8LJ.LIZIZ();
        }
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            aITheaterProfileServiceLIZ.e9("profile");
        }
    }
}
