package ttpobfuscated;

import X.InterfaceC1364105Vn;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;

/* JADX INFO: loaded from: classes24.dex */
public interface r5 {
    Object a(String str, InterfaceC1364105Vn<? super q5> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final GeckoValidationError a;

        public final GeckoValidationError a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.r5$a$a, reason: collision with other inner class name */
        public static final class C0069a extends a {
            public C0069a(GeckoValidationError geckoValidationError) {
                super(geckoValidationError);
            }
        }

        public a(GeckoValidationError geckoValidationError) {
            super(null);
            this.a = geckoValidationError;
        }
    }
}
