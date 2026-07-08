package ttpobfuscated;

import X.InterfaceC1364105Vn;
import kotlin.Unit;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes24.dex */
public interface id {
    Object a(cd cdVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public a() {
            super(null);
        }

        /* JADX INFO: renamed from: ttpobfuscated.id$a$a, reason: collision with other inner class name */
        public static final class C0058a extends a {
            public final TTPErrorCode a;

            public final TTPErrorCode a() {
                return this.a;
            }

            public C0058a(TTPErrorCode tTPErrorCode) {
                this.a = tTPErrorCode;
            }
        }
    }
}
