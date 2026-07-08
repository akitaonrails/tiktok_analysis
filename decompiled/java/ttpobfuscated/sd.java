package ttpobfuscated;

import X.InterfaceC1364105Vn;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public interface sd {

    public static abstract class b extends r4 {

        public static final class a extends b {
        }

        /* JADX INFO: renamed from: ttpobfuscated.sd$b$b, reason: collision with other inner class name */
        public static final class C0071b extends b {
        }

        public b() {
            super(null);
        }
    }

    Object a(int i, InterfaceC1364105Vn<? super List<qd>> interfaceC1364105Vn);

    Object a(qd qdVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object b(qd qdVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public static final class a {
        public static /* synthetic */ Object a(sd sdVar, int i, InterfaceC1364105Vn interfaceC1364105Vn, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = Integer.MAX_VALUE;
                }
                return sdVar.a(i, (InterfaceC1364105Vn<? super List<qd>>) interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }
    }
}
