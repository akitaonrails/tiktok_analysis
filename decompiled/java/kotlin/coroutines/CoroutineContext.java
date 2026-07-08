package kotlin.coroutines;

import X.InterfaceC23272099y;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public interface CoroutineContext {

    public interface Element extends CoroutineContext {
        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

        @Override // kotlin.coroutines.CoroutineContext
        <E extends Element> E get(InterfaceC23272099y<E> interfaceC23272099y);

        InterfaceC23272099y<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y);
    }

    <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(InterfaceC23272099y<E> interfaceC23272099y);

    CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
