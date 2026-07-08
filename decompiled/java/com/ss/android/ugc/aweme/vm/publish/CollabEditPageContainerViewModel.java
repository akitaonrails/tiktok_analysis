package com.ss.android.ugc.aweme.vm.publish;

import X.C1572540r1Y;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabEditPageContainerViewModel extends AssemViewModel<C1572540r1Y> {
    public Map<String, String> LL = C2097608Jq.LJ();
    public final List<User> LLILLJJLI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1572540r1Y(0);
    }

    public final boolean vQ2(User user) {
        Iterator<User> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(user.getUid(), it2.next().getUid())) {
                return true;
            }
        }
        return false;
    }
}
