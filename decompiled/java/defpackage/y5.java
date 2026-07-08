package defpackage;

import X.AbstractC1199530hJv;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "PoiPublishCacheResponseHandler$handelResponse$request$1", f = "PoiPublishCacheResponseHandler.kt", l = {45}, m = "invokeSuspend")
public final class y5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> LLILLJJLI;
    public final /* synthetic */ w5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y5(Function1<? super InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, ? extends Object> function1, w5 w5Var, InterfaceC1364105Vn<? super y5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = w5Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new y5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLL.getClass();
        return AbstractC1199530hJv.LIZ((PoiSearchApi.PoiSearchResultWrapper) obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
