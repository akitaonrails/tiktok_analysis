package defpackage;

import X.AnonymousClass0958;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutTokenResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "ShopifyCheckoutTokenManager$initTokenUpdateTimer$1", f = "ShopifyCheckoutTokenManager.kt", l = {131}, m = "invokeSuspend")
public final class j8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ h8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(h8 h8Var, InterfaceC1364105Vn<? super j8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = h8Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new j8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Long l;
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
            h8 h8Var = this.LLILLJJLI;
            ShopifyCheckoutTokenResponse shopifyCheckoutTokenResponse = h8Var.LLILLL;
            if (shopifyCheckoutTokenResponse != null && (l = shopifyCheckoutTokenResponse.expireTime) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = h8Var.LLIZ;
            }
            long j = jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
