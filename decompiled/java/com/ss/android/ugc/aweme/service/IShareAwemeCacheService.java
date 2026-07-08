package com.ss.android.ugc.aweme.service;

import X.AbstractC1556090qb1;
import X.AbstractC1574450r4d;
import X.AbstractC1574500r4i;
import X.C1556020qau;
import X.C1556040qaw;
import X.C1574370r4V;
import X.C1574380r4W;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public interface IShareAwemeCacheService {
    void LIZ(List list, C1556020qau c1556020qau, Function1 function1);

    void LIZIZ(long j, C1574370r4V c1574370r4V, Aweme aweme, C1556040qaw c1556040qaw);

    void LIZJ(long j);

    void LIZLLL(C1574380r4W c1574380r4W, List list);

    Aweme LJ(long j, AbstractC1574450r4d abstractC1574450r4d, AbstractC1556090qb1 abstractC1556090qb1);

    void LJFF(AbstractC1574500r4i abstractC1574500r4i);

    void LJI(List<Long> list, AbstractC1574450r4d abstractC1574450r4d, AbstractC1574500r4i abstractC1574500r4i, Function1<? super Integer, Unit> function1);
}
