package ttpobfuscated;

import X.InterfaceC1364105Vn;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public interface h5 {
    Object a(String str, boolean z, InterfaceC1364105Vn<? super g5> interfaceC1364105Vn);

    Object a(List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);

    Object b(String str, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object b(List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);

    public static abstract class a extends r4 {

        public static final class b extends a {
        }

        public static final class c extends a {
        }

        public a() {
            super(null);
        }

        /* JADX INFO: renamed from: ttpobfuscated.h5$a$a, reason: collision with other inner class name */
        public static final class C0055a extends a {
            public final String a;
            public final boolean b;

            public final String a() {
                return this.a;
            }

            public final boolean b() {
                return this.b;
            }

            public C0055a(String str, boolean z) {
                this.a = str;
                this.b = z;
            }
        }

        public static final class d extends a {
            public final String a;
            public final boolean b;

            public final String a() {
                return this.a;
            }

            public final boolean b() {
                return this.b;
            }

            public d(String str, boolean z) {
                this.a = str;
                this.b = z;
            }
        }
    }
}
