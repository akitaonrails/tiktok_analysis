package com.google.gson.internal.bind;

import X.C09CU;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.w;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    public final r<T> LIZ;
    public final j<T> LIZIZ;
    public final Gson LIZJ;
    public final TypeToken<T> LIZLLL;
    public final v LJ;
    public final TreeTypeAdapter<T>.a LJFF = new a();
    public TypeAdapter<T> LJI;

    public final class a implements i {
        public a() {
        }

        public final k LIZIZ(Object obj) {
            return TreeTypeAdapter.this.LIZJ.LJIJJLI(obj);
        }

        public final <R> R LIZ(k kVar, Type type) {
            return (R) TreeTypeAdapter.this.LIZJ.LIZLLL(kVar, type);
        }

        public final k LIZJ(Object obj, Type type) {
            return TreeTypeAdapter.this.LIZJ.LJIL(obj, type);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(C09CU c09cu) {
        if (this.LIZIZ == null) {
            TypeAdapter<T> typeAdapterLJIIJJI = this.LJI;
            if (typeAdapterLJIIJJI == null) {
                typeAdapterLJIIJJI = this.LIZJ.LJIIJJI(this.LJ, this.LIZLLL);
                this.LJI = typeAdapterLJIIJJI;
            }
            return typeAdapterLJIIJJI.read(c09cu);
        }
        k kVarLIZ = w.LIZ(c09cu);
        kVarLIZ.getClass();
        if (kVarLIZ instanceof m) {
            return null;
        }
        return this.LIZIZ.deserialize(kVarLIZ, this.LIZLLL.getType(), this.LJFF);
    }

    public static final class SingleTypeFactory implements v {
        public final TypeToken<?> LL;
        public final boolean LLILLJJLI;
        public final Class<?> LLILLL;
        public final r<?> LLILZ;
        public final j<?> LLILZIL;

        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.LL;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.LLILLJJLI || this.LL.getType() != typeToken.getRawType())) {
                    return null;
                }
            } else if (!this.LLILLL.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return new TreeTypeAdapter(this.LLILZ, this.LLILZIL, gson, typeToken, this);
        }

        public SingleTypeFactory(Object obj, TypeToken typeToken, boolean z) {
            r<?> rVar;
            j<?> jVar;
            boolean z2;
            if (obj instanceof r) {
                rVar = (r) obj;
            } else {
                rVar = null;
            }
            this.LLILZ = rVar;
            if (obj instanceof j) {
                jVar = (j) obj;
            } else {
                jVar = null;
            }
            this.LLILZIL = jVar;
            if (rVar == null && jVar == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.google.gson.internal.a.LIZ(z2);
            this.LL = typeToken;
            this.LLILLJJLI = z;
            this.LLILLL = null;
        }
    }

    public static v LIZ(TypeToken<?> typeToken, Object obj) {
        boolean z;
        if (typeToken.getType() == typeToken.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, typeToken, z);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, T t) {
        r<T> rVar = this.LIZ;
        if (rVar == null) {
            TypeAdapter<T> typeAdapterLJIIJJI = this.LJI;
            if (typeAdapterLJIIJJI == null) {
                typeAdapterLJIIJJI = this.LIZJ.LJIIJJI(this.LJ, this.LIZLLL);
                this.LJI = typeAdapterLJIIJJI;
            }
            typeAdapterLJIIJJI.write(c09dl, t);
            return;
        }
        if (t == null) {
            c09dl.LJIJJ();
        } else {
            w.LIZIZ(rVar.LIZ(t, this.LIZLLL.getType(), this.LJFF), c09dl);
        }
    }

    public TreeTypeAdapter(r<T> rVar, j<T> jVar, Gson gson, TypeToken<T> typeToken, v vVar) {
        this.LIZ = rVar;
        this.LIZIZ = jVar;
        this.LIZJ = gson;
        this.LIZLLL = typeToken;
        this.LJ = vVar;
    }
}
