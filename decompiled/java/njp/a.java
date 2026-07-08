package njp;

import X.C098200Yq;
import X.C099Q;
import X.C099R;
import X.C09DU;
import X.C189200o6;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC23256099i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements InterfaceC1364105Vn<Object>, InterfaceC23256099i, Serializable {
    public final InterfaceC1364105Vn<Object> completion;

    @Override // X.InterfaceC1364105Vn
    public abstract /* synthetic */ CoroutineContext getContext();

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<Object> interfaceC1364105Vn = this.completion;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    public StackTraceElement getStackTraceElement() {
        return C09DU.LIZLLL(this);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sbLIZ.append(stackTraceElement);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InterfaceC1364105Vn<Object> getCompletion() {
        return this.completion;
    }

    public a(InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        this.completion = interfaceC1364105Vn;
    }

    public InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        InterfaceC1364105Vn<Object> interfaceC1364105Vn = this;
        while (true) {
            C099Q.LIZIZ(interfaceC1364105Vn);
            a aVar = (a) interfaceC1364105Vn;
            InterfaceC1364105Vn<Object> interfaceC1364105Vn2 = aVar.completion;
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                obj = new C098200Yq(th);
                C189200o6.m2constructorimpl(obj);
            }
            if (obj != C099R.LJFF()) {
                C189200o6.m2constructorimpl(obj);
                aVar.releaseIntercepted();
                if (interfaceC1364105Vn2 instanceof a) {
                    interfaceC1364105Vn = interfaceC1364105Vn2;
                } else {
                    interfaceC1364105Vn2.resumeWith(obj);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
