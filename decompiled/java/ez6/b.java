package ez6;

import X.AbstractC19503411Se;
import X.C19503511Sf;
import X.C1C7U;
import X.InterfaceC626120Oh8;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes30.dex */
public final class b<T> extends AbstractC19503411Se<T> {
    public static final C19503511Sf[] LLILLJJLI = new C19503511Sf[0];
    public final AtomicReference<C19503511Sf<T>[]> LL = new AtomicReference<>(LLILLJJLI);

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C19503511Sf<T> c19503511Sf = new C19503511Sf<>(interfaceC626120Oh8, this);
        interfaceC626120Oh8.onSubscribe(c19503511Sf);
        loop0: while (true) {
            C19503511Sf<T>[] c19503511SfArr = this.LL.get();
            int length = c19503511SfArr.length;
            C19503511Sf<T>[] c19503511SfArr2 = new C19503511Sf[length + 1];
            System.arraycopy(c19503511SfArr, 0, c19503511SfArr2, 0, length);
            c19503511SfArr2[length] = c19503511Sf;
            AtomicReference<C19503511Sf<T>[]> atomicReference = this.LL;
            while (!atomicReference.compareAndSet(c19503511SfArr, c19503511SfArr2)) {
                if (atomicReference.get() != c19503511SfArr) {
                    break;
                }
            }
        }
        if (c19503511Sf.get()) {
            LJLLLL(c19503511Sf);
        }
    }

    public final void LJLLLL(C19503511Sf<T> c19503511Sf) {
        while (true) {
            C19503511Sf<T>[] c19503511SfArr = this.LL.get();
            C19503511Sf<T>[] c19503511SfArr2 = LLILLJJLI;
            if (c19503511SfArr == c19503511SfArr2) {
                return;
            }
            int length = c19503511SfArr.length;
            for (int i = 0; i < length; i++) {
                if (c19503511SfArr[i] == c19503511Sf) {
                    if (i >= 0) {
                        if (length != 1) {
                            c19503511SfArr2 = new C19503511Sf[length - 1];
                            System.arraycopy(c19503511SfArr, 0, c19503511SfArr2, 0, i);
                            System.arraycopy(c19503511SfArr, i + 1, c19503511SfArr2, i, (length - i) - 1);
                        }
                        AtomicReference<C19503511Sf<T>[]> atomicReference = this.LL;
                        while (!atomicReference.compareAndSet(c19503511SfArr, c19503511SfArr2)) {
                            if (atomicReference.get() != c19503511SfArr) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
    }

    @Override // X.AbstractC19503411Se, X.C09JN
    public final void accept(T t) {
        C1C7U.LIZ("PublishRelay@973f.accept");
        if (t != null) {
            for (C19503511Sf<T> c19503511Sf : this.LL.get()) {
                if (!c19503511Sf.get()) {
                    c19503511Sf.LL.onNext(t);
                }
            }
            C1C7U.LIZIZ("PublishRelay@973f.accept");
            return;
        }
        throw new NullPointerException("value == null");
    }
}
