package ttpobfuscated;

import X.InterfaceC1364105Vn;
import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;

/* JADX INFO: loaded from: classes24.dex */
public interface t1 {
    Object a(String str, InterfaceC1364105Vn<? super Config> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final k8 a;

        /* JADX INFO: renamed from: ttpobfuscated.t1$a$a, reason: collision with other inner class name */
        public static final class C0073a extends a {
            public final ConfigType b;

            public final ConfigType b() {
                return this.b;
            }

            public C0073a(k8 k8Var, ConfigType configType) {
                super(k8Var);
                this.b = configType;
            }
        }

        public final k8 a() {
            return this.a;
        }

        public a(k8 k8Var) {
            super(k8Var.getMessage());
            this.a = k8Var;
        }
    }
}
