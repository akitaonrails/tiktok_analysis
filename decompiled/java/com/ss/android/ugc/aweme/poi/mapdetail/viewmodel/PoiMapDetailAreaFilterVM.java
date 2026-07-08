package com.ss.android.ugc.aweme.poi.mapdetail.viewmodel;

import X.C1179830go9;
import X.C1179840goA;
import X.C15438062q;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedCenterRecallArea;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailAreaFilterVM extends AssemViewModel<C1179840goA> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1179840goA(0);
    }

    public final PoiFeedCenterRecallArea vQ2() {
        Collection<List<C1179830go9>> collectionValues;
        Object next;
        Map<String, List<C1179830go9>> map = getState().LLILLL;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        Iterator it2 = C15438062q.LJIJJLI(collectionValues).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C1179830go9) next).LLILLL) {
                break;
            }
        }
        C1179830go9 c1179830go9 = (C1179830go9) next;
        if (c1179830go9 != null) {
            return c1179830go9.LLILLJJLI;
        }
        return null;
    }
}
