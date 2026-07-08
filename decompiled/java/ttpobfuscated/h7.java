package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.ConfigType;

/* JADX INFO: loaded from: classes24.dex */
public abstract class h7 {

    public static final class a extends h7 {
        public static final a a = new a();
    }

    public static final class b extends h7 {
        public static final b a = new b();
    }

    public static final class c extends h7 {
        public final ConfigType a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "InvalidConfiguration(type=" + this.a + ')';
        }

        public final ConfigType a() {
            return this.a;
        }

        public final ConfigType b() {
            return this.a;
        }

        public c(ConfigType configType) {
            this.a = configType;
        }

        public final c a(ConfigType configType) {
            return new c(configType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && Intrinsics.LJFF(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public static c a(c cVar, ConfigType configType, int i, Object obj) {
            if ((i & 1) != 0) {
                configType = cVar.a;
            }
            cVar.getClass();
            return new c(configType);
        }
    }

    public static final class d extends h7 {
        public static final d a = new d();
    }

    public static final class e extends h7 {
        public static final e a = new e();
    }

    public static final class f extends h7 {
        public static final f a = new f();
    }
}
