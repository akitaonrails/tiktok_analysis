package ttpobfuscated;

import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C23250099c;
import X.C23271099x;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.ITTPOrbuGeckoRequestPayload;
import ttp.orbu.sdk.ITTPOrbuInterceptor;
import ttp.orbu.sdk.ITTPOrbuRequest;
import ttp.orbu.sdk.TTPOrbuResponse;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class ff implements ITTPOrbuInterceptor<ITTPOrbuGeckoRequestPayload> {

    @C09DV(c = "ttp.orbu.sdk.service.TTPOrbuGeckoInterceptor$shouldInterceptRequest$2", f = "TTPOrbuGeckoInterceptor.kt", l = {91}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TTPOrbuResponse>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ ITTPOrbuRequest<ITTPOrbuGeckoRequestPayload> d;

        public final class b extends C09AY implements Function0<Unit> {
            public final /* synthetic */ fc a;

            public final void a() {
                this.a.a("Fail to Activate OrbuSdk");
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.LIZ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fc fcVar) {
                super(0);
                this.a = fcVar;
            }
        }

        public final class c extends C09AY implements Function0<Unit> {
            public final /* synthetic */ fc a;

            public final void a() {
                this.a.a("Fail to Activate OrbuSdk on time");
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.LIZ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(fc fcVar) {
                super(0);
                this.a = fcVar;
            }
        }

        /* JADX INFO: renamed from: ttpobfuscated.ff$a$a, reason: collision with other inner class name */
        public final class C0054a extends C09AY implements Function0<Unit> {
            public static final C0054a a = new C0054a();

            public C0054a() {
                super(0);
            }

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                return Unit.LIZ;
            }
        }

        public final class d extends C09AY implements Function0<Unit> {
            public static final d a = new d();

            public d() {
                super(0);
            }

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                return Unit.LIZ;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ff.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ITTPOrbuRequest<? extends ITTPOrbuGeckoRequestPayload> iTTPOrbuRequest, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.d = iTTPOrbuRequest;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TTPOrbuResponse> interfaceC1364105Vn) {
            return new a(this.d, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new a(this.d, interfaceC1364105Vn);
        }
    }

    @Override // ttp.orbu.sdk.ITTPOrbuInterceptor
    public OrbuResult getOrbuResult() {
        return OrbuResult.a.a;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuInterceptor
    public TTPOrbuResponse shouldInterceptRequest(ITTPOrbuRequest<? extends ITTPOrbuGeckoRequestPayload> iTTPOrbuRequest) {
        if (!ua.a.b().f().m().a("gecko")) {
            TTPOrbuResponse.Builder builder = new TTPOrbuResponse.Builder();
            OrbuResult.a aVar = OrbuResult.a.a;
            builder.statusCode(aVar.getCode());
            builder.description(aVar.getReason());
            builder.request(iTTPOrbuRequest);
            TTPOrbuResponse tTPOrbuResponseBuild = builder.build();
            q3.b.d(q3.a, "this feature GECKO is disable", "Interceptor", null, 4, null);
            return tTPOrbuResponseBuild;
        }
        return (TTPOrbuResponse) C23250099c.LJ(C23271099x.INSTANCE, new a(iTTPOrbuRequest, null));
    }
}
