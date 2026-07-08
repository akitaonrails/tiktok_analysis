package ttpobfuscated;

import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;

/* JADX INFO: loaded from: classes24.dex */
public interface u1 {
    void a();

    void a(Config config);

    Config get();

    String getVersion();

    public static abstract class a extends r4 {

        /* JADX INFO: renamed from: ttpobfuscated.u1$a$a, reason: collision with other inner class name */
        public static final class C0077a extends a {
            public final ConfigType a;

            public final ConfigType a() {
                return this.a;
            }

            public C0077a(Throwable th, ConfigType configType) {
                super(th);
                this.a = configType;
            }
        }

        public static final class b extends a {
            public final ConfigType a;

            public final ConfigType a() {
                return this.a;
            }

            public b(Throwable th, ConfigType configType) {
                super(th);
                this.a = configType;
            }
        }

        public static final class c extends a {
            public final ConfigType a;

            public final ConfigType a() {
                return this.a;
            }

            public c(Throwable th, ConfigType configType) {
                super(th);
                this.a = configType;
            }
        }

        public static final class d extends a {
            public final ConfigType a;

            public final ConfigType a() {
                return this.a;
            }

            public d(Throwable th, ConfigType configType) {
                super(th);
                this.a = configType;
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
        }
    }
}
