package defpackage;

import X.C09A1;
import X.C2188811AlT;
import X.InterfaceC23272099y;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 implements CoroutineContext.Element {
    public static final a LLILLJJLI = new a();
    public final int LL;

    public static final class a implements InterfaceC23272099y<e3> {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3) && this.LL == ((e3) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisTaskPriority(value=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y<?> getKey() {
        return LLILLJJLI;
    }

    public e3(int i) {
        this.LL = i;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09A1.LIZJ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
