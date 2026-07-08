package com.ss.android.ugc.aweme.minidrama.common.component.impl;

import X.C1613340s5M;
import X.C2252321DDq;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaDetailOperatorImpl implements MiniDramaDetailOperator {
    public final Map<Long, C1613340s5M> LIZIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.service.MiniDramaDetailOperator
    public final void Vm(CollectionDetailModel collectionDetailModel) {
        C1613340s5M c1613340s5M = (C1613340s5M) ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(collectionDetailModel.collectionId));
        if (c1613340s5M == null) {
            this.LIZIZ.put(Long.valueOf(collectionDetailModel.collectionId), new C1613340s5M());
        } else {
            c1613340s5M.LIZ.setValue(collectionDetailModel);
            c1613340s5M.LIZIZ.setValue(Boolean.valueOf(collectionDetailModel.isFavorite()));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaDetailOperator
    public final C2252321DDq Wm(long j) {
        C1613340s5M c1613340s5M = (C1613340s5M) ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(j));
        if (c1613340s5M == null) {
            c1613340s5M = new C1613340s5M();
            this.LIZIZ.put(Long.valueOf(j), c1613340s5M);
        }
        return c1613340s5M.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaDetailOperator
    public final CollectionDetailModel Xm(long j) {
        C2252321DDq c2252321DDq;
        C1613340s5M c1613340s5M = (C1613340s5M) ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(j));
        if (c1613340s5M != null && (c2252321DDq = c1613340s5M.LIZ) != null) {
            return (CollectionDetailModel) c2252321DDq.getValue();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaDetailOperator
    public final void Ym(long j) {
        C1613340s5M c1613340s5M = (C1613340s5M) ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(j));
        if (c1613340s5M != null) {
            c1613340s5M.LIZ.setValue(null);
            c1613340s5M.LIZIZ.setValue(null);
            this.LIZIZ.remove(Long.valueOf(j));
        }
    }
}
