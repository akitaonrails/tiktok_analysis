package com.ss.android.ugc.aweme.series.seriesdetail.preload;

import X.C0CQT;
import X.C11NZ;
import X.C1499810p8F;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class SeriesCollectionDetailPreload implements InterfaceC727570SgN<SeriesDetailApi.GetPaidCollectionDetailApi, C11NZ<PaidCollectionDetailResponse>> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, C0CQT.LIZJ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<PaidCollectionDetailResponse> preload2(Bundle bundle, Function1<? super Class<SeriesDetailApi.GetPaidCollectionDetailApi>, ? extends SeriesDetailApi.GetPaidCollectionDetailApi> function1) {
        long j = 0;
        if (bundle != null) {
            j = bundle.getLong("collection_id", 0L);
        }
        return function1.invoke(SeriesDetailApi.GetPaidCollectionDetailApi.class).getPaidCollectionDetail(j, 1, true, null);
    }
}
