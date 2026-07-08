package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.Config;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ve {

    public static final class a extends ve {
        public final Config a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ConfigLoaded(config=" + this.a + ')';
        }

        public final Config a() {
            return this.a;
        }

        public final Config b() {
            return this.a;
        }

        public a(Config config) {
            this.a = config;
        }

        public final a a(Config config) {
            return new a(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Intrinsics.LJFF(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public static a a(a aVar, Config config, int i, Object obj) {
            if ((i & 1) != 0) {
                config = aVar.a;
            }
            aVar.getClass();
            return new a(config);
        }
    }
}
