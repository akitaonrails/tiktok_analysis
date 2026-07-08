package com.bytedance.ies.smartmovie.jni;

import X.C1419980n3U;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class UnorderedMapStrStr extends AbstractMap<String, String> {
    public transient long LL;
    public transient boolean LLILLJJLI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LL;
            if (j != 0) {
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    SmartMovieJniJNI.delete_UnorderedMapStrStr(j);
                }
                this.LL = 0L;
            }
        }
    }

    public final Iterator LIZ() {
        return new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_end(this.LL, this));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        SmartMovieJniJNI.UnorderedMapStrStr_clear(this.LL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorLIZ = LIZ();
        for (Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_begin(this.LL, this)); iterator.LIZ(iteratorLIZ); iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getNextUnchecked(iterator.LIZ, iterator))) {
            C1419980n3U c1419980n3U = new C1419980n3U(this);
            c1419980n3U.LL = iterator;
            hashSet.add(c1419980n3U);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return SmartMovieJniJNI.UnorderedMapStrStr_isEmpty(this.LL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return SmartMovieJniJNI.UnorderedMapStrStr_sizeImpl(this.LL, this);
    }

    public UnorderedMapStrStr() {
        this(SmartMovieJniJNI.new_UnorderedMapStrStr__SWIG_0());
    }

    public static class Iterator {
        public transient long LIZ;
        public transient boolean LIZIZ = true;

        public final void finalize() {
            synchronized (this) {
                long j = this.LIZ;
                if (j != 0) {
                    if (this.LIZIZ) {
                        this.LIZIZ = false;
                        SmartMovieJniJNI.delete_UnorderedMapStrStr_Iterator(j);
                    }
                    this.LIZ = 0L;
                }
            }
        }

        public Iterator(long j) {
            this.LIZ = j;
        }

        public final boolean LIZ(Iterator iterator) {
            return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_isNot(this.LIZ, this, iterator.LIZ, iterator);
        }
    }

    public UnorderedMapStrStr(long j) {
        this.LLILLJJLI = true;
        this.LL = j;
    }

    public static long LIZIZ(UnorderedMapStrStr unorderedMapStrStr) {
        if (unorderedMapStrStr == null) {
            return 0L;
        }
        return unorderedMapStrStr.LL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return SmartMovieJniJNI.UnorderedMapStrStr_containsImpl(this.LL, this, (String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_find(this.LL, this, (String) obj));
            if (iterator.LIZ(LIZ())) {
                return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
            }
            return null;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_find(this.LL, this, (String) obj));
            if (iterator.LIZ(LIZ())) {
                String strUnorderedMapStrStr_Iterator_getValue = SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
                SmartMovieJniJNI.UnorderedMapStrStr_removeUnchecked(this.LL, this, iterator.LIZ, iterator);
                return strUnorderedMapStrStr_Iterator_getValue;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_find(this.LL, this, str));
        if (iterator.LIZ(LIZ())) {
            String strUnorderedMapStrStr_Iterator_getValue = SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
            SmartMovieJniJNI.UnorderedMapStrStr_Iterator_setValue(iterator.LIZ, iterator, str2);
            return strUnorderedMapStrStr_Iterator_getValue;
        }
        SmartMovieJniJNI.UnorderedMapStrStr_putUnchecked(this.LL, this, str, str2);
        return null;
    }
}
