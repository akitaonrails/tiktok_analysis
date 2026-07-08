package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC1623806Xk;
import X.C0XQ7;
import X.C1075800e6M;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1720106oR;
import X.C1903740zdk;
import X.C1954807lC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C491001vg;
import X.C491101vh;
import X.C626160OhC;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxUserCardSharedVM extends ViewModel {
    public C1903740zdk LL = new C1903740zdk(0);

    public final boolean vQ2(boolean z) {
        boolean z2;
        User curUser;
        Integer numValueOf;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is force refresh: ");
        sbLIZ.append(z);
        sbLIZ.append(", shared: ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("@UserCard_inbox", C2188811AlT.LIZIZ(sbLIZ));
        boolean z3 = true;
        if (z) {
            return true;
        }
        C1903740zdk c1903740zdk = this.LL;
        if (c1903740zdk.LIZLLL instanceof C491001vg) {
            C1720106oR.LJI("@UserCard_inbox", "refresh, cause by last fail!");
            return true;
        }
        long j = c1903740zdk.LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j != -1 && jCurrentTimeMillis - j <= 60000) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.LL.LJ || (curUser = C0XQ7.LJFF().getCurUser()) == null || (numValueOf = Integer.valueOf(curUser.getFriendCount())) == null || numValueOf.intValue() > 5) {
            z3 = z2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("shouldReq: ");
        sbLIZ2.append(z3);
        sbLIZ2.append(", isExpired: ");
        sbLIZ2.append(z2);
        sbLIZ2.append(" isEmpty: ");
        sbLIZ2.append(this.LL.LJ);
        C1720106oR.LJI("@UserCard_inbox", C2188811AlT.LIZIZ(sbLIZ2));
        return z3;
    }

    public final void wQ2(Function1<? super C1903740zdk, C1903740zdk> function1) {
        this.LL = function1.invoke(this.LL);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update shared state: ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("@UserCard_inbox", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void xQ2(C1075800e6M c1075800e6M) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
        if (!(abstractC1623806Xk instanceof C491101vh)) {
            if (abstractC1623806Xk instanceof C491001vg) {
                wQ2(new AwS607S0100000_28(abstractC1623806Xk, (AbstractC1623806Xk<C626160OhC>) 124));
            } else if (abstractC1623806Xk instanceof C1623706Xj) {
                wQ2(new AwS607S0100000_28(abstractC1623806Xk, (AbstractC1623806Xk<C626160OhC>) 125));
            } else {
                if (abstractC1623806Xk instanceof C1623606Xi) {
                    wQ2(new AwS394S0200000_28(abstractC1623806Xk, c1075800e6M, 40));
                    return;
                }
                throw new C1954807lC();
            }
        }
    }
}
