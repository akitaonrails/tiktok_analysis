package com.ss.android.ugc.aweme.tag.viewmodel;

import X.C098200Yq;
import X.C1559260qg8;
import X.C189200o6;
import X.C231000uq;
import X.C737500SwO;
import X.C737520SwQ;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS37S2100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTaggedListViewModel extends AssemViewModel<C231000uq> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C737500SwO.class, (Class<Object>) null, (String) 13), true);
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C231000uq(null, null);
    }

    public final C737500SwO vQ2() {
        return (C737500SwO) this.LL.getValue();
    }

    public final void wQ2(String str, String str2) {
        try {
            C737520SwQ.LIZ("click_tagged_user", new AwS37S2100000_11(str, this, str2, 0));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
