package defpackage;

import X.AbstractC2252651DEx;
import X.AnonymousClass0957;
import X.C054G;
import X.C099G;
import X.C099V;
import X.C09A1;
import X.C1DEU;
import X.C2252461DEe;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS212S0300000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class c3<K, C> implements Closeable {
    public final AbstractC2252651DEx LL;
    public final int LLILLJJLI;
    public final C054G LLILLL;
    public final ConcurrentHashMap<K, AnonymousClass0957<?>> LLILZ = new ConcurrentHashMap<>();
    public final C1DEU LLILZIL = C2252461DEe.LIZ(3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable;
        C2296808zG.LIZJ(this.LLILLL, null);
        CoroutineContext.Element element = this.LL;
        if (!(element instanceof Closeable) || (closeable = (Closeable) element) == null) {
            return;
        }
        closeable.close();
    }

    public c3(d3 d3Var, int i) {
        this.LL = d3Var;
        this.LLILLJJLI = i;
        this.LLILLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), d3Var));
    }

    public final void LIZ(int i, Object obj, Function2 function2) {
        b3 b3Var = new b3(function2, null);
        if (this.LLILZ.size() < this.LLILLJJLI) {
            C099G c099gLIZ = C23250099c.LIZ(this.LLILLL, new e3(i), C099V.LAZY, new a3(this, b3Var, null));
            if (this.LLILZ.putIfAbsent(obj, c099gLIZ) != null) {
                c099gLIZ.LIZIZ(null);
            } else {
                c099gLIZ.LJII(new AwS212S0300000_3(this, obj, c099gLIZ, 14));
                c099gLIZ.start();
            }
        }
    }
}
