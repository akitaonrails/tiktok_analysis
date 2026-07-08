package defpackage;

import X.AbstractC2238408pq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1AF0;
import X.C1DFB;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutTokenResponse;
import com.ss.android.ugc.aweme.checkout.service.IShopifyCheckoutTokenService;
import com.ss.android.ugc.aweme.checkout.service.ShopifyCheckoutTokenService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "ShopifyCheckoutTokenManager$requestShopifyToken$1", f = "ShopifyCheckoutTokenManager.kt", l = {146, 156}, m = "invokeSuspend")
public final class l8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ h8 LLILLJJLI;
    public final /* synthetic */ Function1<ShopifyCheckoutTokenResponse, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l8(h8 h8Var, Function1<? super ShopifyCheckoutTokenResponse, Unit> function1, InterfaceC1364105Vn<? super l8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = h8Var;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new l8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @C09DV(c = "ShopifyCheckoutTokenManager$requestShopifyToken$1$1", f = "ShopifyCheckoutTokenManager.kt", l = {}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ ShopifyCheckoutTokenResponse LL;
        public final /* synthetic */ Function1<ShopifyCheckoutTokenResponse, Unit> LLILLJJLI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ShopifyCheckoutTokenResponse shopifyCheckoutTokenResponse, Function1<? super ShopifyCheckoutTokenResponse, Unit> function1, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.LL = shopifyCheckoutTokenResponse;
            this.LLILLJJLI = function1;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new a(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C099R.LJFF();
            C155000ia.LIZIZ(obj);
            ShopifyCheckoutTokenResponse shopifyCheckoutTokenResponse = this.LL;
            if (shopifyCheckoutTokenResponse != null && shopifyCheckoutTokenResponse.statusCode == 0) {
                this.LLILLJJLI.invoke(shopifyCheckoutTokenResponse);
            } else {
                this.LLILLJJLI.invoke(null);
            }
            return Unit.LIZ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ShopifyCheckoutTokenManager$requestShopifyToken$1$response$1", f = "ShopifyCheckoutTokenManager.kt", l = {150}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ShopifyCheckoutTokenResponse>, Object> {
        public int LL;
        public final /* synthetic */ h8 LLILLJJLI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h8 h8Var, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.LLILLJJLI = h8Var;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new b(this.LLILLJJLI, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objLJFF = C099R.LJFF();
            int i = this.LL;
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    IShopifyCheckoutTokenService iShopifyCheckoutTokenServiceLIZ = ShopifyCheckoutTokenService.LIZ();
                    String str = this.LLILLJJLI.LL;
                    this.LL = 1;
                    obj = iShopifyCheckoutTokenServiceLIZ.getShopifyCheckoutToken(str, this);
                    if (obj == objLJFF) {
                        return objLJFF;
                    }
                }
                return (ShopifyCheckoutTokenResponse) obj;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ShopifyCheckoutTokenResponse> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            b bVar = new b(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, bVar);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        a aVar = new a((ShopifyCheckoutTokenResponse) obj, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, aVar) == objLJFF) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
