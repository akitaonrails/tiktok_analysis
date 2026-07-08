package com.ss.android.ugc.aweme.user.repository;

import X.C004I;
import X.C11JF;
import X.C1247730iZf;
import X.C1252380ihA;
import X.C1252530ihP;
import X.C2217381BqS;
import X.C737370SwB;
import X.InterfaceC1247720iZe;
import X.InterfaceC420801kM;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class UserViewModel extends JediViewModel<UserState> implements InterfaceC1247720iZe {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        C1247730iZf.LIZ(this);
        disposeOnClear(JediViewModel.bR2(this, new C2217381BqS() { // from class: X.0iZT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((UserState) obj).getRemoveFollowerError();
            }
        }, null, new AwS582S0100000_3(this, 137), 2, null));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new UserState(new User(), false, C1252530ihP.LIZ, C1252530ihP.LIZ, null, null);
    }

    @Override // X.InterfaceC1247720iZe
    public final void Cn(Function1<? super UserState, Unit> function1) {
        withState(function1);
    }

    @Override // X.InterfaceC1247720iZe
    public final InterfaceC420801kM Dd(C11JF c11jf) {
        disposeOnClear(c11jf);
        return c11jf;
    }

    @Override // X.InterfaceC1247720iZe
    public final void LJJJZ(Function1<? super UserState, UserState> function1) {
        setState(function1);
    }

    public final void hR2(C1252380ihA c1252380ihA) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String str = c1252380ihA.LIZ;
        String str2 = c1252380ihA.LIZIZ;
        execute(iUserService.LJIIJ(c1252380ihA.LIZLLL, C737370SwB.LIZ(c1252380ihA.LJI), c1252380ihA.LJ, c1252380ihA.LJFF, str, str2, c1252380ihA.LJII, c1252380ihA.LJIILLIIL), new AwS633S0100000_19(c1252380ihA, 106));
    }
}
