package com.ss.android.ugc.aweme.series.serieslist.preload;

import X.C0CQT;
import X.C11NZ;
import X.C1499810p8F;
import X.C1573560r3C;
import X.EnumC1578460rB6;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.series.serieslist.api.SeriesListApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesListPreload implements InterfaceC727570SgN<SeriesListApi.GetPaidCollectionListApi, C11NZ<PaidCollectionListResponse>> {
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
    public C11NZ<PaidCollectionListResponse> preload2(Bundle bundle, Function1<? super Class<SeriesListApi.GetPaidCollectionListApi>, ? extends SeriesListApi.GetPaidCollectionListApi> function1) {
        long j;
        int i;
        String string;
        String string2;
        if (bundle != null && (string2 = bundle.getString("creator_uid")) != null) {
            j = CastLongProtector.parseLong(string2);
        } else {
            j = 0;
        }
        if (bundle != null && (string = bundle.getString("list_source")) != null) {
            i = CastIntegerProtector.parseInt(string);
        } else {
            i = 1;
        }
        SeriesListApi.GetPaidCollectionListApi getPaidCollectionListApiInvoke = function1.invoke(SeriesListApi.GetPaidCollectionListApi.class);
        Boolean bool = Boolean.TRUE;
        IDramaSharedApiPathService.LIZ.getClass();
        return getPaidCollectionListApiInvoke.getPaidCollectionList(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.COLLECTION_LIST), j, i, 0L, 8, null, bool);
    }
}
