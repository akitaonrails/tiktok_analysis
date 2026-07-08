package com.ss.android.ugc.tiktok.addyours.service;

import X.C098200Yq;
import X.C0DRK;
import X.C1388190mED;
import X.C1720106oR;
import X.C189200o6;
import X.C1935007i0;
import X.C19EG;
import X.C2187451AjH;
import X.C343930De3;
import X.C344450Det;
import X.InterfaceC330080Cwo;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS248S0300000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class InviteFriendsServiceImpl implements IInviteFriendsService {
    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC330080Cwo> LIZ() {
        return AddYoursInviteBehavior.class;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC330080Cwo> LIZIZ() {
        return C344450Det.class;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final void LIZJ(Context context, Class<? extends InterfaceC330080Cwo> cls, Function1<? super C343930De3, Unit> function1) {
        C19EG c19egLIZIZ;
        InterfaceC330080Cwo c098200Yq;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C343930De3 c343930De3 = new C343930De3(null, 0, null, null, 15, null);
            function1.invoke(c343930De3);
            try {
                c098200Yq = cls.newInstance();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZLLL(thM5exceptionOrNullimpl);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C0DRK.LIZ(c19egLIZIZ, new AwS248S0300000_4(c19egLIZIZ, (InterfaceC330080Cwo) c098200Yq, c343930De3, 0));
            return;
        }
        if (!((Boolean) C1935007i0.LIZ.getValue()).booleanValue()) {
        } else {
            throw new IllegalArgumentException("the [context] needs to be an instance of FragmentActivity");
        }
    }
}
