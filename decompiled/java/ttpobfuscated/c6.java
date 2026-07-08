package ttpobfuscated;

import X.InterfaceC1364105Vn;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes24.dex */
public interface c6 {
    Object a(InterfaceC1364105Vn<? super se> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final ConfigType a;
        public final TTPErrorCode b;

        public final TTPErrorCode a() {
            return this.b;
        }

        public final ConfigType b() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.c6$a$a, reason: collision with other inner class name */
        public static final class C0047a extends a {
            public C0047a(ConfigType configType, TTPErrorCode tTPErrorCode) {
                super(configType, tTPErrorCode);
            }
        }

        public a(ConfigType configType, TTPErrorCode tTPErrorCode) {
            super(null);
            this.a = configType;
            this.b = tTPErrorCode;
        }
    }
}
