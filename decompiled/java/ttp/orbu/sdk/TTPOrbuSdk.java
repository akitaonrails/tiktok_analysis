package ttp.orbu.sdk;

import X.AbstractC23140094w;
import X.C01GW;
import X.C08FF;
import X.C09AY;
import X.C09DV;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.Version;
import ttp.orbu.sdk.init.TTPOrbuActiveResult;
import ttp.orbu.sdk.init.TTPOrbuContext;
import ttp.orbu.sdk.init.TTPOrbusActiveCallback;
import ttpobfuscated.Cif;
import ttpobfuscated.bh;
import ttpobfuscated.cf;
import ttpobfuscated.ff;
import ttpobfuscated.hf;
import ttpobfuscated.jf;
import ttpobfuscated.kf;
import ttpobfuscated.nf;
import ttpobfuscated.of;
import ttpobfuscated.pf;
import ttpobfuscated.q3;
import ttpobfuscated.qf;
import ttpobfuscated.rf;
import ttpobfuscated.v3;

/* JADX INFO: loaded from: classes24.dex */
public final class TTPOrbuSdk {
    public static final TTPOrbuSdk INSTANCE = new TTPOrbuSdk();
    public static final C01GW a = C452501pT.LIZIZ(c.a);
    public static final C01GW b = C452501pT.LIZIZ(d.a);

    /* JADX INFO: loaded from: classes14.dex */
    public enum OrbuState {
        PRE_ACTIVE,
        ENABLE,
        DISABLE;

        public static OrbuState valueOf(String str) {
            return (OrbuState) C08FF.LIZ(OrbuState.class, str);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.TTPOrbuSdk", f = "TTPOrbuSdk.kt", l = {95}, m = "activateOrbu")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("TTPOrbuSdk@e8b0.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = TTPOrbuSdk.this.a(null, null, null, this);
            C1C7U.LIZIZ("TTPOrbuSdk@e8b0.a$1");
            return objA;
        }
    }

    public static final class c extends C09AY implements Function0<Map<Channel, ? extends List<? extends ITTPOrbuInterceptor<?>>>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Channel, List<ITTPOrbuInterceptor<?>>> invoke() {
            Channel channel = Channel.NETWORK;
            v3.s.getClass();
            return C2097608Jq.LJIIIIZZ(new Pair(channel, Collections.singletonList(new kf(v3.u))), new Pair(Channel.SDK, Collections.singletonList(new nf(v3.u))), new Pair(Channel.WEB, Collections.singletonList(new qf(v3.u))), new Pair(Channel.WEB_ROUTER, Collections.singletonList(new rf(v3.u))), new Pair(Channel.APP_TO_APP, Collections.singletonList(new cf(v3.u))), new Pair(Channel.SETTINGS, Collections.singletonList(new of(v3.u))), new Pair(Channel.GECKO, Collections.singletonList(new ff())), new Pair(Channel.SYSTEM_API, Collections.singletonList(new pf(v3.u))), new Pair(Channel.LIVE_VIDEO, Collections.singletonList(new jf(v3.u))), new Pair(Channel.LIVE_AUDIO, Collections.singletonList(new hf(v3.u))), new Pair(Channel.LIVE_SEI, Collections.singletonList(new Cif(v3.u))));
        }
    }

    public static final class d extends C09AY implements Function0<Map<String, ? extends String>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, String> invoke() {
            Version.b bVar = Version.b.a;
            return C2097908Jt.LIZJ(new Pair(bVar.getName(), bVar.getValue().invoke()));
        }
    }

    public final Map<Channel, List<ITTPOrbuInterceptor<?>>> a() {
        return (Map) a.getValue();
    }

    public final Map<String, String> b() {
        return (Map) b.getValue();
    }

    public final Map<Channel, List<ITTPOrbuInterceptor<?>>> interceptorsMap() {
        return (Map) a.getValue();
    }

    public final class b extends C09AY implements Function1<TTPOrbuActiveResult, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(TTPOrbuActiveResult tTPOrbuActiveResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(TTPOrbuActiveResult tTPOrbuActiveResult) {
            return Unit.LIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttp.orbu.sdk.TTPOrbuSdk.OrbuState r6, ttp.orbu.sdk.init.TTPOrbuContext r7, kotlin.jvm.functions.Function1<? super ttp.orbu.sdk.init.TTPOrbuActiveResult, kotlin.Unit> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ttp.orbu.sdk.TTPOrbuSdk.a
            if (r0 == 0) goto L40
            r4 = r9
            ttp.orbu.sdk.TTPOrbuSdk$a r4 = (ttp.orbu.sdk.TTPOrbuSdk.a) r4
            int r2 = r4.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.d = r2
        L12:
            java.lang.Object r3 = r4.b
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.d
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L46
            java.lang.Object r8 = r4.a
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            X.C155000ia.LIZIZ(r3)
        L26:
            r8.invoke(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            ttpobfuscated.ua r0 = ttpobfuscated.ua.a
            ttpobfuscated.a1 r0 = r0.b()
            r4.a = r8
            r4.d = r1
            java.lang.Object r3 = r0.a(r7, r6, r4)
            if (r3 != r2) goto L26
            return r2
        L40:
            ttp.orbu.sdk.TTPOrbuSdk$a r4 = new ttp.orbu.sdk.TTPOrbuSdk$a
            r4.<init>(r9)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttp.orbu.sdk.TTPOrbuSdk.a(ttp.orbu.sdk.TTPOrbuSdk$OrbuState, ttp.orbu.sdk.init.TTPOrbuContext, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public final void activateOrbu(OrbuState orbuState, TTPOrbuContext tTPOrbuContext, TTPOrbusActiveCallback tTPOrbusActiveCallback, Function0<String> function0, Function0<String> function02) {
        tTPOrbuContext.setGeneralConfigProvider$ttp_productionRelease(function0);
        tTPOrbuContext.setOrbuCodeConfigProvider$ttp_productionRelease(function02);
        bh.c.getClass();
        bh.d.a(tTPOrbuContext.getExtraInfo());
        q3.a aVar = q3.a;
        StringBuilder sb = new StringBuilder("ActivateOrbu is called for DepGraph instance ");
        v3.s.getClass();
        sb.append(v3.u);
        sb.append(", with state ");
        sb.append(orbuState);
        sb.append(", with context ");
        sb.append(tTPOrbuContext);
        q3.b.a(aVar, sb.toString(), (String) null, (Throwable) null, 6, (Object) null);
        v3.u.a(tTPOrbuContext, orbuState, tTPOrbusActiveCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(TTPOrbuSdk tTPOrbuSdk, OrbuState orbuState, TTPOrbuContext tTPOrbuContext, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = b.a;
        }
        return tTPOrbuSdk.a(orbuState, tTPOrbuContext, function1, interfaceC1364105Vn);
    }
}
