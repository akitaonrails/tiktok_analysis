package com.ss.android.ugc.aweme.relation.mutual;

import X.AbstractC1387200mCc;
import X.C1075800e6M;
import X.C1222980hvk;
import X.C13BV;
import X.C1623606Xi;
import X.C2187451AjH;
import X.C491001vg;
import X.C520040KaQ;
import X.EnumC1223000hvm;
import X.EnumC1223020hvo;
import X.InterfaceC0148002o;
import Y.AObserverS223S0100000_19;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MutualRelationViewModel extends AssemViewModel<C1222980hvk> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC1223020hvo enumC1223020hvo = EnumC1223020hvo.UNINITIALIZED;
        return new C1222980hvk(EnumC1223000hvm.UNINITIALIZED, C13BV.INSTANCE, new C1075800e6M(null, 7), enumC1223020hvo, new ArrayList(), new ArrayList(), null);
    }

    public final boolean AQ2() {
        return getState().LL == EnumC1223000hvm.NOT_EMPTY;
    }

    public final void wQ2() {
        if (getState().LLILZ == EnumC1223020hvo.LOADING || getState().LLILZ == EnumC1223020hvo.UP_LOADING) {
            if (zQ2() && xQ2()) {
                setState(AFwS257S0000000_19.get$arr$(294));
                return;
            }
            if (zQ2() && yQ2()) {
                setState(AFwS257S0000000_19.get$arr$(295));
                return;
            }
            if (AQ2() && xQ2()) {
                setState(AFwS257S0000000_19.get$arr$(296));
            } else if (AQ2() && yQ2()) {
                int i = C2187451AjH.LIZ;
                setState(AFwS257S0000000_19.get$arr$(297));
            }
        }
    }

    public final boolean xQ2() {
        C1075800e6M c1075800e6M = getState().LLILLL;
        return ((c1075800e6M.LIZJ instanceof C1623606Xi) && c1075800e6M.LIZLLL()) || (getState().LLILLL.LIZ instanceof C491001vg);
    }

    public final boolean yQ2() {
        C1075800e6M c1075800e6M = getState().LLILLL;
        return (c1075800e6M.LIZJ instanceof C1623606Xi) && !c1075800e6M.LIZLLL();
    }

    public final boolean zQ2() {
        return getState().LL == EnumC1223000hvm.EMPTY || getState().LL == EnumC1223000hvm.FAIL;
    }

    public final void vQ2(Fragment fragment) {
        LifecycleOwner lifecycleOwnerLJFF;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragment);
        if (abstractC1387200mCcLIZIZ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF()) != null) {
            ((IUserService) ServiceManager.get().getService(IUserService.class)).LJI().observe(lifecycleOwnerLJFF, new AObserverS223S0100000_19(this, 34));
        }
    }
}
