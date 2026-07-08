package com.ss.android.ugc.aweme.gsonopt;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2334009Co;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAdapter<T> extends TypeAdapter<T> {
    public final C2334009Co LIZ;

    public abstract T LIZIZ();

    public abstract boolean LIZJ(String str, Object obj, C09CU c09cu);

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, T t) {
    }

    public BaseAdapter(C2334009Co c2334009Co) {
        this.LIZ = c2334009Co;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            c09cu.LJJJJJL();
            return null;
        }
        T tLIZIZ = LIZIZ();
        try {
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (!LIZJ(c09cu.LJJJJ(), tLIZIZ, c09cu)) {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
            return tLIZIZ;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new s(e);
        }
    }

    public final TypeAdapter LIZ(Class cls, Object obj) {
        r rVar;
        TypeToken<T> typeToken = TypeToken.get(cls);
        if (obj instanceof TypeAdapter) {
            return (TypeAdapter) obj;
        }
        if (obj instanceof v) {
            return ((v) obj).create(this.LIZ.LIZ, typeToken);
        }
        boolean z = obj instanceof r;
        if (!z && !(obj instanceof j)) {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer reference.");
        }
        j jVar = null;
        if (z) {
            rVar = (r) obj;
        } else {
            rVar = null;
        }
        if (obj instanceof j) {
            jVar = (j) obj;
        }
        return new TreeTypeAdapter(rVar, jVar, this.LIZ.LIZ, typeToken, null);
    }
}
