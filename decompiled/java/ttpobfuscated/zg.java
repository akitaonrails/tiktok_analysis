package ttpobfuscated;

import X.InterfaceC1364105Vn;
import java.util.List;
import kotlin.Unit;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;
import ttp.orbu.sdk.configuration.model.GeneralConfig;

/* JADX INFO: loaded from: classes24.dex */
public interface zg {
    Object a(String str, q5 q5Var, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    List<Integer> a(int i, GeneralConfig generalConfig);

    public static abstract class a extends r4 {
        public final GeckoValidationError a;

        public final GeckoValidationError a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.zg$a$a, reason: collision with other inner class name */
        public static final class C0080a extends a {
            public C0080a(GeckoValidationError geckoValidationError) {
                super(geckoValidationError);
            }
        }

        public a(GeckoValidationError geckoValidationError) {
            super(null);
            this.a = geckoValidationError;
        }
    }
}
