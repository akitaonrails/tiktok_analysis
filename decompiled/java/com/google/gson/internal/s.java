package com.google.gson.internal;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class s<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a LLIZLLLIL = new a();
    public final Comparator<? super K> LL;
    public e<K, V> LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final e<K, V> LLILZIL;
    public s<K, V>.b LLILZLL;
    public s<K, V>.c LLIZ;

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public final class a extends s<K, V>.d<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final Object next() {
                return LIZ();
            }

            public a(b bVar) {
                super();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return s.this.LLILLL;
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && s.this.LIZIZ((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e<K, V> eVarLIZIZ;
            if (!(obj instanceof Map.Entry) || (eVarLIZIZ = s.this.LIZIZ((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.LJ(eVarLIZIZ, true);
            return true;
        }
    }

    public final class c extends AbstractSet<K> {

        public final class a extends s<K, V>.d<K> {
            @Override // java.util.Iterator
            public final K next() {
                return LIZ().LLILZLL;
            }

            public a(c cVar) {
                super();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return s.this.LLILLL;
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return s.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            s sVar = s.this;
            e<K, V> eVarLIZJ = sVar.LIZJ(obj);
            if (eVarLIZJ != null) {
                sVar.LJ(eVarLIZJ, true);
                return true;
            }
            return false;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> LL;
        public e<K, V> LLILLJJLI;
        public int LLILLL;

        public final e<K, V> LIZ() {
            e<K, V> eVar = this.LL;
            s sVar = s.this;
            if (eVar == sVar.LLILZIL) {
                throw new NoSuchElementException();
            }
            if (sVar.LLILZ != this.LLILLL) {
                throw new ConcurrentModificationException();
            }
            this.LL = eVar.LLILZ;
            this.LLILLJJLI = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LL != s.this.LLILZIL;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.LLILLJJLI;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            s.this.LJ(eVar, true);
            this.LLILLJJLI = null;
            this.LLILLL = s.this.LLILZ;
        }

        public d() {
            this.LL = s.this.LLILZIL.LLILZ;
            this.LLILLL = s.this.LLILZ;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> LL;
        public e<K, V> LLILLJJLI;
        public e<K, V> LLILLL;
        public e<K, V> LLILZ;
        public e<K, V> LLILZIL;
        public final K LLILZLL;
        public V LLIZ;
        public int LLIZLLLIL;

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.LLILZLL;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.LLIZ;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public e() {
            this.LLILZIL = this;
            this.LLILZ = this;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append("=");
            sbLIZ.append(this.LLIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.LLILZLL;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.LLIZ;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.LLILZLL;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.LLIZ;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.LLIZ;
            this.LLIZ = v;
            return v2;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.LL = eVar;
            this.LLILZLL = k;
            this.LLIZLLLIL = 1;
            this.LLILZ = eVar2;
            this.LLILZIL = eVar3;
            eVar3.LLILZ = this;
            eVar2.LLILZIL = this;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.LLILLJJLI = null;
        this.LLILLL = 0;
        this.LLILZ++;
        e<K, V> eVar = this.LLILZIL;
        eVar.LLILZIL = eVar;
        eVar.LLILZ = eVar;
    }

    public s() {
        this(LLIZLLLIL);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.LLILZLL;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.LLILZLL = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.c cVar = this.LLIZ;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.LLIZ = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.LLILLL;
    }

    public s(Comparator<? super K> comparator) {
        this.LLILZIL = new e<>();
        this.LL = comparator == null ? LLIZLLLIL : comparator;
    }

    public final e<K, V> LIZIZ(Map.Entry<?, ?> entry) {
        e<K, V> eVarLIZJ = LIZJ(entry.getKey());
        if (eVarLIZJ != null) {
            V v = eVarLIZJ.LLIZ;
            Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                return eVarLIZJ;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<K, V> LIZJ(Object obj) {
        e<K, V> eVarLIZ = null;
        if (obj != 0) {
            try {
                eVarLIZ = LIZ(obj, false);
                return eVarLIZ;
            } catch (ClassCastException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return eVarLIZ;
    }

    public final void LJI(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.LLILLJJLI;
        e<K, V> eVar3 = eVar.LLILLL;
        e<K, V> eVar4 = eVar3.LLILLJJLI;
        e<K, V> eVar5 = eVar3.LLILLL;
        eVar.LLILLL = eVar4;
        if (eVar4 != null) {
            eVar4.LL = eVar;
        }
        LJFF(eVar, eVar3);
        eVar3.LLILLJJLI = eVar;
        eVar.LL = eVar3;
        int i3 = 0;
        if (eVar2 != null) {
            i = eVar2.LLIZLLLIL;
        } else {
            i = 0;
        }
        if (eVar4 != null) {
            i2 = eVar4.LLIZLLLIL;
        } else {
            i2 = 0;
        }
        int iMax = Math.max(i, i2) + 1;
        eVar.LLIZLLLIL = iMax;
        if (eVar5 != null) {
            i3 = eVar5.LLIZLLLIL;
        }
        eVar3.LLIZLLLIL = Math.max(iMax, i3) + 1;
    }

    public final void LJII(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.LLILLJJLI;
        e<K, V> eVar3 = eVar.LLILLL;
        e<K, V> eVar4 = eVar2.LLILLJJLI;
        e<K, V> eVar5 = eVar2.LLILLL;
        eVar.LLILLJJLI = eVar5;
        if (eVar5 != null) {
            eVar5.LL = eVar;
        }
        LJFF(eVar, eVar2);
        eVar2.LLILLL = eVar;
        eVar.LL = eVar2;
        int i3 = 0;
        if (eVar3 != null) {
            i = eVar3.LLIZLLLIL;
        } else {
            i = 0;
        }
        if (eVar5 != null) {
            i2 = eVar5.LLIZLLLIL;
        } else {
            i2 = 0;
        }
        int iMax = Math.max(i, i2) + 1;
        eVar.LLIZLLLIL = iMax;
        if (eVar4 != null) {
            i3 = eVar4.LLIZLLLIL;
        }
        eVar2.LLIZLLLIL = Math.max(iMax, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (LIZJ(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarLIZJ = LIZJ(obj);
        if (eVarLIZJ != null) {
            return eVarLIZJ.LLIZ;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarLIZJ = LIZJ(obj);
        if (eVarLIZJ != null) {
            LJ(eVarLIZJ, true);
            return eVarLIZJ.LLIZ;
        }
        return null;
    }

    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[PHI: r1 r5
      0x0025: PHI (r1v5 java.lang.Comparable) = (r1v4 java.lang.Comparable), (r1v7 java.lang.Comparable) binds: [B:15:0x0024, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r5v2 com.google.gson.internal.s$e<K, V>) = (r5v0 com.google.gson.internal.s$e<K, V>), (r5v5 com.google.gson.internal.s$e<K, V>) binds: [B:15:0x0024, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x001f -> B:6:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.s.e<K, V> LIZ(K r9, boolean r10) {
        /*
            r8 = this;
            java.util.Comparator<? super K> r7 = r8.LL
            com.google.gson.internal.s$e<K, V> r5 = r8.LLILLJJLI
            com.google.gson.internal.s$a r6 = com.google.gson.internal.s.LLIZLLLIL
            r2 = 0
            if (r5 == 0) goto L2c
            if (r7 != r6) goto L24
            r1 = r9
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        Le:
            if (r1 == 0) goto L25
            K r0 = r5.LLILZLL
            int r4 = r1.compareTo(r0)
        L16:
            if (r4 != 0) goto L19
            return r5
        L19:
            if (r4 >= 0) goto L21
            com.google.gson.internal.s$e<K, V> r0 = r5.LLILLJJLI
        L1d:
            if (r0 == 0) goto L2d
            r5 = r0
            goto Le
        L21:
            com.google.gson.internal.s$e<K, V> r0 = r5.LLILLL
            goto L1d
        L24:
            r1 = r2
        L25:
            K r0 = r5.LLILZLL
            int r4 = r7.compare(r9, r0)
            goto L16
        L2c:
            r4 = 0
        L2d:
            if (r10 != 0) goto L30
            return r2
        L30:
            com.google.gson.internal.s$e<K, V> r3 = r8.LLILZIL
            r2 = 1
            if (r5 != 0) goto L63
            if (r7 != r6) goto L59
            boolean r0 = r9 instanceof java.lang.Comparable
            if (r0 != 0) goto L59
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = " is not Comparable"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L59:
            com.google.gson.internal.s$e r1 = new com.google.gson.internal.s$e
            com.google.gson.internal.s$e<K, V> r0 = r3.LLILZIL
            r1.<init>(r5, r9, r3, r0)
            r8.LLILLJJLI = r1
            goto L71
        L63:
            com.google.gson.internal.s$e r1 = new com.google.gson.internal.s$e
            com.google.gson.internal.s$e<K, V> r0 = r3.LLILZIL
            r1.<init>(r5, r9, r3, r0)
            if (r4 >= 0) goto L7e
            r5.LLILLJJLI = r1
        L6e:
            r8.LIZLLL(r5, r2)
        L71:
            int r0 = r8.LLILLL
            int r0 = r0 + 1
            r8.LLILLL = r0
            int r0 = r8.LLILZ
            int r0 = r0 + 1
            r8.LLILZ = r0
            return r1
        L7e:
            r5.LLILLL = r1
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.s.LIZ(java.lang.Object, boolean):com.google.gson.internal.s$e");
    }

    public final void LIZLLL(e<K, V> eVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.LLILLJJLI;
            e<K, V> eVar3 = eVar.LLILLL;
            int i5 = 0;
            if (eVar2 != null) {
                i = eVar2.LLIZLLLIL;
            } else {
                i = 0;
            }
            if (eVar3 != null) {
                i2 = eVar3.LLIZLLLIL;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                e<K, V> eVar4 = eVar3.LLILLJJLI;
                e<K, V> eVar5 = eVar3.LLILLL;
                if (eVar5 != null) {
                    i4 = eVar5.LLIZLLLIL;
                } else {
                    i4 = 0;
                }
                if (eVar4 != null) {
                    i5 = eVar4.LLIZLLLIL;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    LJI(eVar);
                } else {
                    LJII(eVar3);
                    LJI(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                e<K, V> eVar6 = eVar2.LLILLJJLI;
                e<K, V> eVar7 = eVar2.LLILLL;
                if (eVar7 != null) {
                    i3 = eVar7.LLIZLLLIL;
                } else {
                    i3 = 0;
                }
                if (eVar6 != null) {
                    i5 = eVar6.LLIZLLLIL;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    LJII(eVar);
                } else {
                    LJI(eVar2);
                    LJII(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                eVar.LLIZLLLIL = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.LLIZLLLIL = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.LL;
        }
    }

    public final void LJ(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i;
        if (z) {
            e<K, V> eVar3 = eVar.LLILZIL;
            eVar3.LLILZ = eVar.LLILZ;
            eVar.LLILZ.LLILZIL = eVar3;
        }
        e<K, V> eVar4 = eVar.LLILLJJLI;
        e<K, V> eVar5 = eVar.LLILLL;
        e<K, V> eVar6 = eVar.LL;
        int i2 = 0;
        if (eVar4 != null) {
            if (eVar5 != null) {
                if (eVar4.LLIZLLLIL > eVar5.LLIZLLLIL) {
                    e<K, V> eVar7 = eVar4.LLILLL;
                    while (true) {
                        eVar2 = eVar4;
                        eVar4 = eVar7;
                        if (eVar7 == null) {
                            break;
                        } else {
                            eVar7 = eVar7.LLILLL;
                        }
                    }
                } else {
                    e<K, V> eVar8 = eVar5.LLILLJJLI;
                    while (true) {
                        eVar2 = eVar5;
                        eVar5 = eVar8;
                        if (eVar5 == null) {
                            break;
                        } else {
                            eVar8 = eVar5.LLILLJJLI;
                        }
                    }
                }
                LJ(eVar2, false);
                e<K, V> eVar9 = eVar.LLILLJJLI;
                if (eVar9 != null) {
                    i = eVar9.LLIZLLLIL;
                    eVar2.LLILLJJLI = eVar9;
                    eVar9.LL = eVar2;
                    eVar.LLILLJJLI = null;
                } else {
                    i = 0;
                }
                e<K, V> eVar10 = eVar.LLILLL;
                if (eVar10 != null) {
                    i2 = eVar10.LLIZLLLIL;
                    eVar2.LLILLL = eVar10;
                    eVar10.LL = eVar2;
                    eVar.LLILLL = null;
                }
                eVar2.LLIZLLLIL = Math.max(i, i2) + 1;
                LJFF(eVar, eVar2);
                return;
            }
            LJFF(eVar, eVar4);
            eVar.LLILLJJLI = null;
        } else if (eVar5 != null) {
            LJFF(eVar, eVar5);
            eVar.LLILLL = null;
        } else {
            LJFF(eVar, null);
        }
        LIZLLL(eVar6, false);
        this.LLILLL--;
        this.LLILZ++;
    }

    public final void LJFF(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.LL;
        eVar.LL = null;
        if (eVar2 != null) {
            eVar2.LL = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.LLILLJJLI == eVar) {
                eVar3.LLILLJJLI = eVar2;
                return;
            } else {
                eVar3.LLILLL = eVar2;
                return;
            }
        }
        this.LLILLJJLI = eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> eVarLIZ = LIZ(k, true);
            V v2 = eVarLIZ.LLIZ;
            eVarLIZ.LLIZ = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }
}
