package ttpobfuscated;

import X.InterfaceC1364105Vn;
import kotlin.Unit;
import ttp.orbu.sdk.configuration.model.ConfigType;

/* JADX INFO: loaded from: classes24.dex */
public interface d1 {
    Object a(ConfigType configType, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object a(se seVar, ConfigType configType, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object b(ConfigType configType, InterfaceC1364105Vn<? super se> interfaceC1364105Vn);

    Object c(ConfigType configType, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final Throwable a;
        public final ConfigType b;

        public final ConfigType a() {
            return this.b;
        }

        public final Throwable b() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.d1$a$a, reason: collision with other inner class name */
        public static final class C0050a extends a {
            public C0050a(Throwable th, ConfigType configType) {
                super(th, configType);
            }
        }

        public static final class b extends a {
            public b(Throwable th, ConfigType configType) {
                super(th, configType);
            }
        }

        public static final class c extends a {
            public c(Throwable th, ConfigType configType) {
                super(th, configType);
            }
        }

        public static final class d extends a {
            public d(Throwable th, ConfigType configType) {
                super(th, configType);
            }
        }

        public a(Throwable th, ConfigType configType) {
            super(th.getMessage());
            this.a = th;
            this.b = configType;
        }
    }
}
