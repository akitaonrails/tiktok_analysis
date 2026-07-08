package com.ss.android.ugc.aweme.poi.mapdetail;

import X.AnonymousClass0957;
import X.C0PEM;
import X.C1175680ghS;
import X.C1175700ghU;
import X.C1499810p8F;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C262230APl;
import X.InterfaceC1364105Vn;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.mapdetail.api.PoiMapDetailPoiListApi;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailPreload implements InterfaceC727570SgN<PoiMapDetailPoiListApi, AnonymousClass0957<? extends PoiMapDetailResponse>> {
    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        if (((Number) C262230APl.LIZ.getValue()).intValue() >= 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AnonymousClass0957<? extends PoiMapDetailResponse> preload2(Bundle bundle, Function1<? super Class<PoiMapDetailPoiListApi>, ? extends PoiMapDetailPoiListApi> function1) {
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1175700ghU(this, function1, bundle, null), 3);
    }

    public final Object callMapDetailInitial(Function1<? super Class<PoiMapDetailPoiListApi>, ? extends PoiMapDetailPoiListApi> function1, Integer num, C1175680ghS c1175680ghS, InterfaceC1364105Vn<? super PoiMapDetailResponse> interfaceC1364105Vn) {
        String pagePoiId;
        PoiMapDetailPoiListApi poiMapDetailPoiListApiInvoke = function1.invoke(PoiMapDetailPoiListApi.class);
        Integer numLJ = C2286608xc.LJ(1);
        Integer numLJ2 = C2286608xc.LJ(40);
        String selectedTabCode = null;
        if (c1175680ghS != null) {
            pagePoiId = c1175680ghS.getPagePoiId();
            selectedTabCode = c1175680ghS.getSelectedTabCode();
        } else {
            pagePoiId = null;
        }
        return poiMapDetailPoiListApiInvoke.getPoiCategoryList(numLJ, numLJ2, num, null, null, null, null, null, pagePoiId, null, null, selectedTabCode, null, null, interfaceC1364105Vn);
    }
}
