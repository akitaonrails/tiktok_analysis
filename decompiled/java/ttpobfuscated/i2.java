package ttpobfuscated;

import X.InterfaceC1364105Vn;
import java.util.List;
import kotlin.Unit;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes24.dex */
public interface i2 {
    Object a(k2 k2Var, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final List<g5> a;
        public final TTPErrorCode b;

        public final List<g5> a() {
            return this.a;
        }

        public final TTPErrorCode b() {
            return this.b;
        }

        /* JADX INFO: renamed from: ttpobfuscated.i2$a$a, reason: collision with other inner class name */
        public static final class C0056a extends a {
            public C0056a(List<g5> list, TTPErrorCode tTPErrorCode) {
                super(list, tTPErrorCode);
            }
        }

        public a(List<g5> list, TTPErrorCode tTPErrorCode) {
            super(null);
            this.a = list;
            this.b = tTPErrorCode;
        }
    }
}
