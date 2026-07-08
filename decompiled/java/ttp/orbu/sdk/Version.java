package ttp.orbu.sdk;

import X.C09AY;
import kotlin.jvm.functions.Function0;
import ttpobfuscated.x3;

/* JADX INFO: loaded from: classes24.dex */
public abstract class Version {
    public final String name;
    public final Function0<String> value;

    public static final class a extends Version {
        public static final a a = new a();

        /* JADX INFO: renamed from: ttp.orbu.sdk.Version$a$a, reason: collision with other inner class name */
        public final class C0039a extends C09AY implements Function0<String> {
            public static final C0039a a = new C0039a();

            public C0039a() {
                super(0);
            }

            public final String a() {
                return x3.b();
            }

            @Override // kotlin.jvm.functions.Function0
            public String invoke() {
                return x3.b();
            }
        }

        public a() {
            super("orbuHash", C0039a.a);
        }
    }

    public static final class b extends Version {
        public static final b a = new b();

        public final class a extends C09AY implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            public final String a() {
                return x3.d();
            }

            @Override // kotlin.jvm.functions.Function0
            public String invoke() {
                return x3.d();
            }
        }

        public b() {
            super("orbuculum", a.a);
        }
    }

    public final String getName() {
        return this.name;
    }

    public final Function0<String> getValue() {
        return this.value;
    }

    public Version(String str, Function0<String> function0) {
        this.name = str;
        this.value = function0;
    }
}
