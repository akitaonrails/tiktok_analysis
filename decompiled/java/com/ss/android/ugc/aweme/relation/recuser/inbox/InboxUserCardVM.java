package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.C1720106oR;
import X.C1903760zdm;
import X.C2187451AjH;
import X.C2188811AlT;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxUserCardVM extends ViewModel {
    public C1903760zdm LL = new C1903760zdm(0);

    public final void vQ2(Function1<? super C1903760zdm, C1903760zdm> function1) {
        this.LL = function1.invoke(this.LL);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update shared state: ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("@UserCard_inbox_split", C2188811AlT.LIZIZ(sbLIZ));
    }
}
