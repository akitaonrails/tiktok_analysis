package defpackage;

import X.AnonymousClass0958;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "PoiPublishCacheResponseHandler$handelResponse$timeoutTask$1", f = "PoiPublishCacheResponseHandler.kt", l = {39}, m = "invokeSuspend")
public final class b6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(Long l, InterfaceC1364105Vn<? super b6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new b6(this.LLILLJJLI, interfaceC1364105Vn);
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
            long jLongValue = this.LLILLJJLI.longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                return objLJFF;
            }
        }
        return new PoiSearchApi.PoiSearchResultWrapper(Integer.MAX_VALUE, null, null, null, 0, 0, null, null, null, null, true);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
