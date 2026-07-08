package com.bytedance.tiktok.homepage.mainpagefragment;

import X.C01GW;
import X.C0HYT;
import X.C0HYU;
import X.C0HYV;
import X.C0HYW;
import X.C0HYX;
import X.C0HYY;
import X.C0HYZ;
import X.C0HZE;
import X.C11NJ;
import X.C11NZ;
import X.C1910890zpH;
import X.C19475711Hn;
import X.C2003307t1;
import X.C2188811AlT;
import X.C291210BbD;
import X.C452501pT;
import X.InterfaceC0148002o;
import Y.AfS175S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarIconFlipPrerequisiteViewModel extends AssemViewModel<C2003307t1> {
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(new C0HYX());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C0HYV());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C0HYY());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0HYW());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C0HYZ());
    public final C11NJ LLILZLL = new C11NJ();
    public boolean LLJ = true;
    public final C01GW LLJI = C452501pT.LIZIZ(new C0HYU());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2003307t1(0);
    }

    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZLL.LJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (!C291210BbD.LIZ()) {
            this.LLIZ = C0HZE.LIZIZ.LJIIIIZZ();
            return;
        }
        SocialAvatarEntranceDynamicDataSource.LL.getClass();
        C11NZ c11nz = (C11NZ) SocialAvatarEntranceDynamicDataSource.LLJILLL.getValue();
        c11nz.getClass();
        this.LLILZLL.LIZ(new C19475711Hn(c11nz).LJJLJLI(new AfS175S0100000_6(this, 3)));
    }

    public final void vQ2() {
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarIconFlipPrerequisiteViewModel updateStatus, iconFlipEntranceControlEnabled is ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", iconFlipSocialAvatarStatusCanShow is ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", checkWillPrivacyPopupShow is ");
        sbLIZ.append(this.LLJ);
        logger.LIZ("iconFlipVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C0HYT(this));
    }
}
