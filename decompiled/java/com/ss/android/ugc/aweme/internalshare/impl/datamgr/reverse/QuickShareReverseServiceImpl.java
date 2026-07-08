package com.ss.android.ugc.aweme.internalshare.impl.datamgr.reverse;

import X.C13LP;
import X.C1720006oQ;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickShareReverseServiceImpl implements IQuickShareReverseService {
    public final CopyOnWriteArrayList<String> LIZ = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.internalshare.impl.datamgr.reverse.IQuickShareReverseService
    public final void LIZ() {
        this.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.datamgr.reverse.IQuickShareReverseService
    public final List<String> LIZJ() {
        return C13LP.LLIIII(this.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.datamgr.reverse.IQuickShareReverseService
    public final void LIZIZ(List<String> list) {
        C1720006oQ.LIZLLL(new AwS546S0100000_2(list, (List<? extends BaseComponentData>) 638), false);
        this.LIZ.clear();
        this.LIZ.addAll(list);
    }
}
