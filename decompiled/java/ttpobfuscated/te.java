package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.ConfigType;

/* JADX INFO: loaded from: classes24.dex */
public abstract class te {

    public static final class a extends te {
        public static final a a = new a();
    }

    public static final class b extends te {
        public static final b a = new b();
    }

    public static final class c extends te {
        public static final c a = new c();
    }

    public static final class d extends te {
        public static final d a = new d();
    }

    public static final class e extends te {
        public static final e a = new e();
    }

    public static final class f extends te {
        public final ConfigType a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "CannotRetrieveCurrentConfig(configType=" + this.a + ')';
        }

        public final ConfigType a() {
            return this.a;
        }

        public final ConfigType b() {
            return this.a;
        }

        public f(ConfigType configType) {
            this.a = configType;
        }

        public final f a(ConfigType configType) {
            return new f(configType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && Intrinsics.LJFF(this.a, ((f) obj).a)) {
                return true;
            }
            return false;
        }

        public static f a(f fVar, ConfigType configType, int i, Object obj) {
            if ((i & 1) != 0) {
                configType = fVar.a;
            }
            fVar.getClass();
            return new f(configType);
        }
    }

    public static final class g extends te {
        public static final g a = new g();
    }

    public static final class h extends te {
        public static final h a = new h();
    }

    public static final class i extends te {
        public static final i a = new i();
    }

    public static final class j extends te {
        public static final j a = new j();
    }

    public static final class k extends te {
        public static final k a = new k();
    }

    public static final class l extends te {
        public static final l a = new l();
    }
}
