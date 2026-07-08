package cs.bd.o;

import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.C1515120pWw;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.tts.mobsec.matrix.CSProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class k1 extends h1 {
    public InterfaceC1904907d9 LIZ;
    public long LIZIZ;

    public final void finalize() throws Throwable {
        InterfaceC1904907d9 interfaceC1904907d9 = this.LIZ;
        CopyOnWriteArrayList<InterfaceC1904907d9> copyOnWriteArrayList = C1515120pWw.LIZ;
        synchronized (C1515120pWw.class) {
            C1515120pWw.LIZLLL(interfaceC1904907d9);
        }
        super.finalize();
    }

    public class a implements InterfaceC1904907d9 {
        public a() {
        }

        @Override // X.InterfaceC1904907d9
        public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            C0X52 c0x52LIZ = c1494590ozp.LIZ(c1494590ozp.LIZJ);
            Iterator<C080U> it2 = c0x52LIZ.LIZ.LIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C080U next = it2.next();
                if ("x-t-zhg".equals(next.LIZ) && next.LIZIZ != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("rep_data");
                    arrayList.add(next.LIZIZ);
                    CSProxy.a(117440513, 0, k1.this.LIZIZ, "report", arrayList.toArray(new String[0]));
                    break;
                }
            }
            return c0x52LIZ;
        }
    }

    @Override // cs.bd.o.h1
    public final Object LIZJ(long j) {
        this.LIZIZ = j;
        a aVar = new a();
        this.LIZ = aVar;
        C1515120pWw.LIZIZ(aVar);
        return Boolean.TRUE;
    }
}
