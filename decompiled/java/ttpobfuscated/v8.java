package ttpobfuscated;

import X.C01GW;
import X.C09AY;
import X.C452501pT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public final class v8 {
    public static final v8 a = new v8();
    public static final C01GW b = C452501pT.LIZIZ(a.a);

    public static final class a extends C09AY implements Function0<n4> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n4 invoke() {
            n4 n4Var = new n4();
            n4Var.a("activation", ttpobfuscated.a.p);
            n4Var.a("invalidSignature", w7.p);
            n4Var.a("configuration", l1.p);
            n4Var.a("nativeNetworkValidation", s9.p);
            n4Var.a("compromisedDb", i3.p);
            n4Var.a("sample", dd.p);
            n4Var.a("orbuCodeLog", b9.p);
            n4Var.a("heartbeat", g7.p);
            n4Var.a("bundleValidation", v5.p);
            n4Var.a("pki", ya.p);
            n4Var.a("cleanup", m0.p);
            n4Var.a("crashLog", l2.p);
            return n4Var;
        }
    }

    public final m4 a() {
        return (m4) b.getValue();
    }
}
