package e0;

import X.C19993513Kr;
import X.C19994013Kw;
import X.C19994113Kx;
import X.InterfaceC835440Wpy;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes31.dex */
public final class s0<E> extends C19993513Kr<E> implements InterfaceC835440Wpy {
    public final C19994113Kx<E> LLILLJJLI;

    @Override // X.C19993513Kr, java.util.Set, java.util.Collection
    public final void clear() {
        this.LLILLJJLI.LJ();
    }

    @Override // X.C19993513Kr, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C19994013Kw(this);
    }

    public s0(C19994113Kx<E> c19994113Kx) {
        super(c19994113Kx);
        this.LLILLJJLI = c19994113Kx;
    }

    @Override // X.C19993513Kr, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.LLILLJJLI.LIZLLL(e);
    }

    @Override // X.C19993513Kr, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        C19994113Kx<E> c19994113Kx = this.LLILLJJLI;
        int i = c19994113Kx.LIZLLL;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            c19994113Kx.LJIIJ((E) it2.next());
        }
        if (i != c19994113Kx.LIZLLL) {
            return true;
        }
        return false;
    }

    @Override // X.C19993513Kr, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LLILLJJLI.LJIIJJI(obj);
    }

    @Override // X.C19993513Kr, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C19994113Kx<E> c19994113Kx = this.LLILLJJLI;
        int i = c19994113Kx.LIZLLL;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            c19994113Kx.LJIIIIZZ((E) it2.next());
        }
        if (i != c19994113Kx.LIZLLL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // X.C19993513Kr, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r18) {
        /*
            r17 = this;
            r0 = r17
            X.13Kx<E> r11 = r0.LLILLJJLI
            java.lang.Object[] r10 = r11.LIZIZ
            int r9 = r11.LIZLLL
            long[] r8 = r11.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L50
            r6 = 0
        L10:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L4b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r5 = 8 - r0
            r2 = 0
        L2a:
            if (r2 >= r5) goto L49
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r3
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L45
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r10[r1]
            r13 = r18
            boolean r0 = X.C13LP.LJJJJ(r0, r13)
            if (r0 != 0) goto L45
            r11.LJIIL(r1)
        L45:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L2a
        L49:
            if (r5 != r12) goto L50
        L4b:
            if (r6 == r7) goto L50
            int r6 = r6 + 1
            goto L10
        L50:
            int r0 = r11.LIZLLL
            if (r9 == r0) goto L56
            r0 = 1
            return r0
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.s0.retainAll(java.util.Collection):boolean");
    }
}
