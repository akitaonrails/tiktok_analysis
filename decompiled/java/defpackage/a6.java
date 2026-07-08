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
@C09DV(c = "PoiPublishCacheResponseHandler$handelResponse$result$1$2", f = "PoiPublishCacheResponseHandler.kt", l = {}, m = "invokeSuspend")
public final class a6 extends C09AX implements Function2<PoiSearchApi.PoiSearchResultWrapper, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public /* synthetic */ Object LL;

    public a6(InterfaceC1364105Vn<? super a6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        a6 a6Var = new a6(interfaceC1364105Vn);
        a6Var.LL = obj;
        return a6Var;
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
