package jkp;

import X.AbstractC19974413Di;
import X.AbstractC19975213Dq;
import X.C1350505Qh;
import X.C13LQ;
import X.C19973913Dd;
import X.C19974813Dm;
import X.InterfaceC1664360tPe;
import X.InterfaceC1665500tRU;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes31.dex */
public final class j<E> extends AbstractC19974413Di<E> implements InterfaceC1665500tRU<E> {
    public static final j LLILLL = new j(new Object[0]);
    public final Object[] LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.length;
    }

    @Override // X.InterfaceC1664360tPe
    public final C19974813Dm builder() {
        return new C19974813Dm(this, null, this.LLILLJJLI, 0);
    }

    public j(Object[] objArr) {
        this.LLILLJJLI = objArr;
    }

    public final InterfaceC1664360tPe<E> LJ(Collection<? extends E> collection) {
        if (this.LLILLJJLI.length + collection.size() <= 32) {
            Object[] objArr = this.LLILLJJLI;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + collection.size());
            int length = this.LLILLJJLI.length;
            Iterator<? extends E> it2 = collection.iterator();
            while (it2.hasNext()) {
                objArrCopyOf[length] = it2.next();
                length++;
            }
            return new j(objArrCopyOf);
        }
        C19974813Dm c19974813DmBuilder = builder();
        c19974813DmBuilder.addAll(collection);
        return c19974813DmBuilder.build();
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        C19973913Dd.LIZ(i, LIZJ());
        return (E) this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int indexOf(Object obj) {
        return C13LQ.LJJIJIIJI(obj, this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int lastIndexOf(Object obj) {
        return C13LQ.LJJJJ(obj, this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<E> listIterator(final int i) {
        C19973913Dd.LIZIZ(i, LIZJ());
        final Object[] objArr = this.LLILLJJLI;
        final int iLIZJ = LIZJ();
        return new AbstractC19975213Dq<T>(i, iLIZJ, objArr) { // from class: X.13Dr
            public final T[] LLILLL;

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T[] tArr = this.LLILLL;
                int i2 = this.LL;
                this.LL = i2 + 1;
                return tArr[i2];
            }

            @Override // java.util.ListIterator
            public final T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                T[] tArr = this.LLILLL;
                int i2 = this.LL - 1;
                this.LL = i2;
                return tArr[i2];
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLILLL = objArr;
            }
        };
    }

    @Override // X.InterfaceC1664360tPe
    public final InterfaceC1664360tPe LJLJJLL(int i, C1350505Qh c1350505Qh) {
        C19973913Dd.LIZ(i, this.LLILLJJLI.length);
        Object[] objArr = this.LLILLJJLI;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c1350505Qh;
        return new j(objArrCopyOf);
    }
}
