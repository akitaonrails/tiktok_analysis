package ttpobfuscated;

import X.InterfaceC1364105Vn;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes24.dex */
public interface b6 {
    Object a(uf ufVar, InterfaceC1364105Vn<? super h0> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final TTPErrorCode a;

        public final TTPErrorCode a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.b6$a$a, reason: collision with other inner class name */
        public static final class C0044a extends a {
            public C0044a(TTPErrorCode tTPErrorCode) {
                super(tTPErrorCode);
            }
        }

        public a(TTPErrorCode tTPErrorCode) {
            super(null);
            this.a = tTPErrorCode;
        }
    }
}
