package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel;

import X.AbstractC894380Z6u;
import X.C06WA;
import X.C995890c1T;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS45S0010000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class ActionGroupViewModel extends AssemViewModel<C995890c1T> {
    public final Map<C06WA, Boolean> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995890c1T(true);
    }

    public final void xQ2() {
        Collection collectionValues = ((LinkedHashMap) this.LL).values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((Boolean) it2.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        setState(new AwS45S0010000_33(z, 0));
    }

    public final void vQ2(List<? extends AbstractC894380Z6u<?>> list) {
        ((LinkedHashMap) this.LL).clear();
        for (AbstractC894380Z6u abstractC894380Z6u : (ArrayList) list) {
            this.LL.put(abstractC894380Z6u.LJ().getType(), abstractC894380Z6u.LIZ().invoke());
        }
        xQ2();
    }

    public final void wQ2(AbstractC894380Z6u<?> abstractC894380Z6u, boolean z) {
        C06WA type = abstractC894380Z6u.LJ().getType();
        if (Intrinsics.LJFF(((LinkedHashMap) this.LL).get(type), Boolean.valueOf(z))) {
            return;
        }
        this.LL.put(type, Boolean.valueOf(z));
        xQ2();
    }
}
