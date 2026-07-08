package ttpobfuscated;

import X.InterfaceC1364105Vn;
import kotlin.Unit;
import ttp.orbu.sdk.app.domain.usecase.TTPError;
import ttp.orbu.sdk.logging.LogParams;

/* JADX INFO: loaded from: classes24.dex */
public interface i9 {
    Object a(LogParams logParams, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public static abstract class a extends r4 {

        /* JADX INFO: renamed from: ttpobfuscated.i9$a$a, reason: collision with other inner class name */
        public static final class C0057a extends a {
            public final TTPError a;

            public final TTPError a() {
                return this.a;
            }

            public C0057a(TTPError tTPError, Throwable th) {
                super(th);
                this.a = tTPError;
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
        }
    }
}
