package com.ss.android.ugc.aweme.user.repository;

import X.C11JF;
import X.C11S5;
import X.C1247730iZf;
import X.C1252530ihP;
import X.C2217381BqS;
import X.InterfaceC0148002o;
import X.InterfaceC1247720iZe;
import X.InterfaceC420801kM;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes20.dex */
public final class UserAssemViewModel extends AssemViewModel<UserState> implements InterfaceC1247720iZe {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1247730iZf.LIZ(this);
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0iZS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((UserState) obj).getRemoveFollowerError();
            }
        }, null, null, null, new AwS582S0100000_3(this, 136), 14, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new UserState(new User(), false, C1252530ihP.LIZ, C1252530ihP.LIZ, null, null);
    }

    public final void wQ2() {
        LJJJZ(AFwS257S0000000_19.get$arr$(337));
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

    public final InterfaceC420801kM vQ2(String str, String str2) {
        return execute(((IUserService) ServiceManager.get().getService(IUserService.class)).LIZLLL(str, str2).LJL(C11S5.LIZ()), AFwS303S0000000_19.get$arr$(22));
    }
}
