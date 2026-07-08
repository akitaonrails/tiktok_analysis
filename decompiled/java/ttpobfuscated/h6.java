package ttpobfuscated;

import X.AbstractC23140094w;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C13LE;
import X.C1500770p9n;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.network.model.ConfigurationResponse;
import ttpobfuscated.c6;

/* JADX INFO: loaded from: classes24.dex */
public final class h6 implements c6 {
    public final j1 a;
    public final String b;
    public final w9 c;
    public final String d = C13LE.LIZ(c6.class).LJI();

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.artefact.GetGeneralConfigArtefactRepository", f = "GetGeneralConfigArtefactRepository.kt", l = {27}, m = "get")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws c6.a {
            C1C7U.LIZ("h6@122b.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = h6.this.a(this);
            C1C7U.LIZIZ("h6@122b.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.artefact.GetGeneralConfigArtefactRepository$get$2$result$1", f = "GetGeneralConfigArtefactRepository.kt", l = {28}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<ConfigurationResponse>>, Object> {
        public int a;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1364105Vn<? super C1500770p9n<ConfigurationResponse>> interfaceC1364105Vn) {
            return h6.this.new b(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return h6.this.new b(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h6@122b.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                h6 h6Var = h6.this;
                j1 j1Var = h6Var.a;
                String str = h6Var.b;
                this.a = 1;
                obj = j1Var.a(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("h6@122b.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("h6@122b.a$2");
            return obj;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:19:0x004a, B:20:0x004d, B:22:0x0053, B:24:0x005e, B:26:0x0062, B:27:0x006f, B:28:0x0070, B:29:0x0075), top: B:45:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:19:0x004a, B:20:0x004d, B:22:0x0053, B:24:0x005e, B:26:0x0062, B:27:0x006f, B:28:0x0070, B:29:0x0075), top: B:45:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    @Override // ttpobfuscated.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X.InterfaceC1364105Vn<? super ttpobfuscated.se> r8) throws ttpobfuscated.c6.a {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h6.a(X.05Vn):java.lang.Object");
    }

    public h6(j1 j1Var, String str, w9 w9Var) {
        this.a = j1Var;
        this.b = str;
        this.c = w9Var;
    }
}
