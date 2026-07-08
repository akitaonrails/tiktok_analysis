package defpackage;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "PoiPublishCacheResponseHandler$handelResponse$result$1$1", f = "PoiPublishCacheResponseHandler.kt", l = {}, m = "invokeSuspend")
public final class z5 extends C09AX implements Function2<PoiSearchApi.PoiSearchResultWrapper, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public /* synthetic */ Object LL;

    public z5(InterfaceC1364105Vn<? super z5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        z5 z5Var = new z5(interfaceC1364105Vn);
        z5Var.LL = obj;
        return z5Var;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return this.LL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(poiSearchResultWrapper, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
