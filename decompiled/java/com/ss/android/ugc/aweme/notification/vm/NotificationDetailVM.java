package com.ss.android.ugc.aweme.notification.vm;

import X.C01GW;
import X.C11NJ;
import X.C452501pT;
import X.C703302op;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationDetailVM extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final C01GW LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(317));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(318));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(316));

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LLILLL.getValue()).LJ();
    }

    public final void UJ(BaseNotice baseNotice, Function0<Unit> function0) {
        String str;
        if (baseNotice != null) {
            str = baseNotice.nid;
        } else {
            str = null;
        }
        if (C703302op.LIZ(str) && !((Set) this.LL.getValue()).contains(baseNotice.nid)) {
            ((Set) this.LL.getValue()).add(baseNotice.nid);
            function0.invoke();
        }
    }
}
