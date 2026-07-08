package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C05I4;
import X.C05I5;
import X.C08Q1;
import X.C0PEM;
import X.C0S78;
import X.C0XQ7;
import X.C100W;
import X.C100X;
import X.C13LP;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C444701oD;
import X.C817503Hh;
import X.EnumC1153650g7v;
import X.EnumC590010NCd;
import X.InterfaceC427710Gpt;
import X.InterfaceC586170Myt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSUserStateManager implements IPNSUserStateService, InterfaceC586170Myt, InterfaceC427710Gpt {
    public User LL;
    public EnumC590010NCd LLILLJJLI;
    public EnumC1153650g7v LLILLL;
    public HashSet<String> LLILZ;
    public final HashSet<UserStateHandler> LLILZIL = new HashSet<>();

    public static IPNSUserStateService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPNSUserStateService.class, false);
        if (objLIZ != null) {
            return (IPNSUserStateService) objLIZ;
        }
        if (C04TD.LLLLJ == null) {
            synchronized (IPNSUserStateService.class) {
                if (C04TD.LLLLJ == null) {
                    C04TD.LLLLJ = new PNSUserStateManager();
                }
            }
        }
        return C04TD.LLLLJ;
    }

    public final List<UserStateHandler> LIZJ() {
        return C13LP.LJLLLL(new Comparator() { // from class: X.100Y
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(((UserStateHandler) t).priority(), ((UserStateHandler) t2).priority());
            }
        }, this.LLILZIL);
    }

    public final EnumC590010NCd LIZLLL() {
        EnumC1153650g7v enumC1153650g7v = this.LLILLL;
        if (enumC1153650g7v == null) {
            enumC1153650g7v = null;
        }
        if (enumC1153650g7v != EnumC1153650g7v.USER_REMOVED) {
            return C0XQ7.LJFF().LIZ() ? EnumC590010NCd.PNS_USER_TYPE_KIDS : EnumC590010NCd.PNS_USER_TYPE_NORMAL;
        }
        EnumC590010NCd enumC590010NCd = this.LLILLJJLI;
        if (enumC590010NCd != null) {
            return enumC590010NCd;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService
    public final void initService() {
        if (this.LL == null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C100W(this, null), 3);
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(this);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(this);
        if (C08Q1.LIZJ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C444701oD(null), 3);
        } else {
            C0S78.LIZJ(new C100X(this), true);
        }
    }

    public final void LJIIIZ() {
        this.LL = C0XQ7.LJFF().getCurUser();
        this.LLILLJJLI = LIZLLL();
        this.LLILZ = C13LP.LLIFFJFJJ(C0XQ7.LJFF().LJJI());
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService
    public final void LIZ(UserStateHandler userStateHandler) {
        synchronized (PNSUserStateManager.class) {
            try {
                this.LLILZIL.add(userStateHandler);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(User user) {
        int size = ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size();
        HashSet<String> hashSet = this.LLILZ;
        HashSet<String> hashSet2 = null;
        User user2 = null;
        if (hashSet == null) {
            hashSet = null;
        }
        if (hashSet.size() < size) {
            this.LLILLL = EnumC1153650g7v.USER_ADDED;
            EnumC590010NCd enumC590010NCdLIZLLL = LIZLLL();
            LJIIIIZZ("state_machine_user_add");
            for (UserStateHandler userStateHandler : LIZJ()) {
                if (userStateHandler.LIZ() == enumC590010NCdLIZLLL) {
                    userStateHandler.LJFF(user);
                }
            }
            LJIIIZ();
            return;
        }
        HashSet<String> hashSet3 = this.LLILZ;
        if (hashSet3 == null) {
            hashSet3 = null;
        }
        if (hashSet3.size() > size) {
            User user3 = this.LL;
            if (user3 != null) {
                user2 = user3;
            }
            LJFF(user2);
            LJIIIZ();
            return;
        }
        if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            LJI(user);
            return;
        }
        String uid = user.getUid();
        User user4 = this.LL;
        if (user4 == null) {
            user4 = null;
        }
        if (Intrinsics.LJFF(uid, user4.getUid())) {
            LJI(user);
            return;
        }
        HashSet<String> hashSet4 = this.LLILZ;
        if (hashSet4 != null) {
            hashSet2 = hashSet4;
        }
        if (hashSet2.contains(user.getUid())) {
            this.LLILLL = EnumC1153650g7v.USER_SWITCHED;
            EnumC590010NCd enumC590010NCdLIZLLL2 = LIZLLL();
            LJIIIIZZ("state_machine_user_deactivate");
            for (UserStateHandler userStateHandler2 : LIZJ()) {
                if (userStateHandler2.LIZ() == enumC590010NCdLIZLLL2) {
                    userStateHandler2.LJI();
                }
            }
            EnumC590010NCd enumC590010NCdLIZLLL3 = LIZLLL();
            LJIIIIZZ("state_machine_user_activate");
            for (UserStateHandler userStateHandler3 : LIZJ()) {
                if (userStateHandler3.LIZ() == enumC590010NCdLIZLLL3) {
                    userStateHandler3.LIZLLL(user);
                }
            }
            LJIIIZ();
        }
    }

    public final void LJFF(User user) {
        this.LLILLL = EnumC1153650g7v.USER_REMOVED;
        EnumC590010NCd enumC590010NCdLIZLLL = LIZLLL();
        LJIIIIZZ("state_machine_user_remove");
        for (UserStateHandler userStateHandler : LIZJ()) {
            if (userStateHandler.LIZ() == enumC590010NCdLIZLLL) {
                userStateHandler.LIZIZ(user);
            }
        }
    }

    public final void LJI(User user) {
        this.LLILLL = EnumC1153650g7v.USER_UPDATED;
        EnumC590010NCd enumC590010NCdLIZLLL = LIZLLL();
        LJIIIIZZ("state_machine_user_update");
        for (UserStateHandler userStateHandler : LIZJ()) {
            if (userStateHandler.LIZ() == enumC590010NCdLIZLLL) {
                userStateHandler.LIZJ(user);
            }
        }
    }

    public final void LJII(User user) {
        if (this.LL != null && this.LLILLJJLI != null && this.LLILZ != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C05I4(this, user, null), 3);
        }
    }

    public final void LJIIIIZZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(LIZLLL().ordinal(), "user_type");
        c2344009Gk.LJIIIIZZ("description", LIZLLL().name());
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        if (i == 5 && user2 != null) {
            LJII(user2);
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1) {
            if (z && ((AccountUserService) C0XQ7.LJFF()).LIZ() && user != null) {
                LJII(user);
                return;
            }
            return;
        }
        if (i != 3 || !z) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C05I5(this, null), 3);
    }
}
