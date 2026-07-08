package ttpobfuscated;

import X.C09AX;
import X.C09DV;
import X.C2296808zG;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.ITTPOrbuGeckoRequestPayload;
import ttp.orbu.sdk.ITTPOrbuRequest;
import ttp.orbu.sdk.TTPOrbuResponse;
import ttp.orbu.sdk.configuration.model.GeckoValidation;

/* JADX INFO: loaded from: classes24.dex */
public final class gf {
    public static final GeckoValidation b() {
        ua.a.b().e().getClass();
        new y5();
        return y5.b.getGeckoValidation();
    }

    @C09DV(c = "ttp.orbu.sdk.service.TTPOrbuGeckoInterceptorKt$validateGecko$2", f = "TTPOrbuGeckoInterceptor.kt", l = {139}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TTPOrbuResponse>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public /* synthetic */ Object g;
        public final /* synthetic */ ITTPOrbuRequest<ITTPOrbuGeckoRequestPayload> h;
        public final /* synthetic */ fc i;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:22:0x00c7, B:23:0x00ca, B:25:0x00d0, B:26:0x0106, B:39:0x0172, B:41:0x0182, B:42:0x0191, B:43:0x0195, B:27:0x010b, B:29:0x010f, B:31:0x014d, B:32:0x0160, B:33:0x0163, B:34:0x0168), top: B:59:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x010b A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:22:0x00c7, B:23:0x00ca, B:25:0x00d0, B:26:0x0106, B:39:0x0172, B:41:0x0182, B:42:0x0191, B:43:0x0195, B:27:0x010b, B:29:0x010f, B:31:0x014d, B:32:0x0160, B:33:0x0163, B:34:0x0168), top: B:59:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0172 A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #1 {all -> 0x019d, blocks: (B:22:0x00c7, B:23:0x00ca, B:25:0x00d0, B:26:0x0106, B:39:0x0172, B:41:0x0182, B:42:0x0191, B:43:0x0195, B:27:0x010b, B:29:0x010f, B:31:0x014d, B:32:0x0160, B:33:0x0163, B:34:0x0168), top: B:59:0x00c7 }] */
        /* JADX WARN: Type inference failed for: r0v19, types: [T, ttp.orbu.sdk.requestvalidator.OrbuResult$d] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, ttp.orbu.sdk.requestvalidator.OrbuResult] */
        /* JADX WARN: Type inference failed for: r6v12, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v31, types: [T, java.lang.String] */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 514
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.gf.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TTPOrbuResponse> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            a aVar = new a(this.h, this.i, interfaceC1364105Vn);
            aVar.g = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TTPOrbuResponse> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ITTPOrbuRequest<? extends ITTPOrbuGeckoRequestPayload> iTTPOrbuRequest, fc fcVar, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.h = iTTPOrbuRequest;
            this.i = fcVar;
        }
    }

    public static final Object a(ITTPOrbuRequest<? extends ITTPOrbuGeckoRequestPayload> iTTPOrbuRequest, fc fcVar, InterfaceC1364105Vn<? super TTPOrbuResponse> interfaceC1364105Vn) {
        return C2296808zG.LJ(new a(iTTPOrbuRequest, fcVar, null), interfaceC1364105Vn);
    }

    public static Object a(ITTPOrbuRequest iTTPOrbuRequest, fc fcVar, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
        if ((i & 2) != 0) {
            fcVar = null;
        }
        return C2296808zG.LJ(new a(iTTPOrbuRequest, fcVar, null), interfaceC1364105Vn);
    }
}
