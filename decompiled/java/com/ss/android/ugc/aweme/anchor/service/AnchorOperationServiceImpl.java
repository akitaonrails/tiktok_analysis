package com.ss.android.ugc.aweme.anchor.service;

import X.C19719512Dh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class AnchorOperationServiceImpl implements AnchorLock$IAnchorOperationService {
    public static final List<Pair<Integer, Function0<Unit>>> LIZ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService
    public final void LIZIZ(List<Integer> list) {
        for (Pair<Integer, Function0<Unit>> pair : LIZ) {
            if (list.contains(pair.getFirst())) {
                pair.getSecond().invoke();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService
    public final void LIZ(int i, Function0<Unit> function0) {
        Object next;
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((Number) ((Pair) it2.next()).getFirst()).intValue() == i) {
                ArrayList arrayList = (ArrayList) LIZ;
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((Number) ((Pair) next).getFirst()).intValue() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C19719512Dh.LIZ(arrayList).remove(next);
            }
        }
        ((ArrayList) LIZ).add(new Pair(Integer.valueOf(i), function0));
    }
}
