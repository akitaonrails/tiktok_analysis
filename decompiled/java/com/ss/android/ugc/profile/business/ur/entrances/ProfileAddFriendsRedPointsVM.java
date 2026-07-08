package com.ss.android.ugc.profile.business.ur.entrances;

import X.C11NJ;
import X.C11NZ;
import X.C1220000hqw;
import X.C1249210ic3;
import X.C13LE;
import X.C19475711Hn;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import Y.AfS188S0100000_19;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.ss.android.ugc.profile.platform.standard.vm.IProfileAddFriendsRedPoints;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAddFriendsRedPointsVM extends IProfileAddFriendsRedPoints {
    public final C736950SvV LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final C11NJ LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1249210ic3(1, 0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileAddFriendsRedPointsVM() {
        AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(438);
        this.LL = new C736950SvV(C13LE.LIZ(ProfileMafRedPointsVM.class), aFwS207S0000000_19, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS257S0000000_19.get$arr$(409), null, null, null);
        this.LLILZ = new C11NJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.LJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C11NZ c11nz = (C11NZ) ((ProfileMafRedPointsVM) this.LL.getValue()).LLILLL.getValue();
        c11nz.getClass();
        this.LLILZ.LIZ(new C19475711Hn(c11nz).LJJLJLI(new AfS188S0100000_19(this, 43)));
    }
}
