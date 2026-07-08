package ms.bd.o;

import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class b3 {
    public final int LIZ;
    public final AtomicLong LIZIZ = new AtomicLong(0);
    public final AtomicLong LIZJ = new AtomicLong(((long) (-600)) * 1000000000);

    public b3() {
        this.LIZ = 600;
        this.LIZ = 600;
    }

    public class a implements InterfaceC1904907d9 {
        public a() {
        }

        @Override // X.InterfaceC1904907d9
        public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
            Date date;
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            C0X52<?> c0x52LIZ = c1494590ozp.LIZ(c1494590ozp.LIZJ);
            long jNanoTime = System.nanoTime();
            long j = b3.this.LIZJ.get();
            long j2 = (jNanoTime - j) / 1000000000;
            b3 b3Var = b3.this;
            if (j2 < b3Var.LIZ || !b3Var.LIZJ.compareAndSet(j, jNanoTime)) {
                return c0x52LIZ;
            }
            List<C080U> list = c0x52LIZ.LIZ.LIZLLL;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<C080U> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C080U next = it2.next();
                if (next.LIZ.toLowerCase().equals(k.a(16777217, 0, 0L, "444181", new byte[]{33, 55, 83, 64}))) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) k.a(16777217, 0, 0L, "d83ec9", new byte[]{80, 31, 101, 93, 28, 42, 99, 89, 79, 24, 88, 122, 89, 8, 69, 55, 39, 49, 74, 111, 120, 55, 26, 2, 79, 110, 125, 3, 120}), Locale.ENGLISH);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String) k.a(16777217, 0, 0L, "00cf54", new byte[]{6, 31, 36})));
                    String str = next.LIZIZ;
                    if (str != null && (date = simpleDateFormat.parse(str)) != null) {
                        b3.this.LIZIZ.set((date.getTime() / 1000) - jCurrentTimeMillis);
                        break;
                    }
                }
            }
            return c0x52LIZ;
        }
    }
}
