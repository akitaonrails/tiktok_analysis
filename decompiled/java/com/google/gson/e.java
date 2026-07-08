package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public Excluder LIZ;
    public final t LIZIZ;
    public d LIZJ;
    public final Map<Type, g<?>> LIZLLL;
    public final List<v> LJ;
    public final List<v> LJFF;
    public boolean LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public boolean LJIILL;

    public final Gson LIZ() {
        DefaultDateTypeAdapter defaultDateTypeAdapter;
        DefaultDateTypeAdapter defaultDateTypeAdapter2;
        DefaultDateTypeAdapter defaultDateTypeAdapter3;
        ArrayList arrayList = new ArrayList(((ArrayList) this.LJ).size() + ((ArrayList) this.LJFF).size() + 3);
        arrayList.addAll(this.LJ);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.LJFF);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = this.LJII;
        int i = this.LJIIIIZZ;
        int i2 = this.LJIIIZ;
        if (str == null || "".equals(str.trim())) {
            if (i != 2 && i2 != 2) {
                defaultDateTypeAdapter = new DefaultDateTypeAdapter(i, i2, Date.class);
                defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(i, i2, Timestamp.class);
                defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(i, i2, java.sql.Date.class);
            }
            return new Gson(this.LIZ, this.LIZJ, this.LIZLLL, this.LJI, this.LJIIJ, this.LJIILJJIL, this.LJIIL, this.LJIILIIL, this.LJIILL, this.LJIIJJI, this.LIZIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJ, this.LJFF, arrayList);
        }
        defaultDateTypeAdapter = new DefaultDateTypeAdapter(Date.class, str);
        defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(Timestamp.class, str);
        defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, str);
        arrayList.add(TypeAdapters.LIZIZ(Date.class, defaultDateTypeAdapter));
        arrayList.add(TypeAdapters.LIZIZ(Timestamp.class, defaultDateTypeAdapter2));
        arrayList.add(TypeAdapters.LIZIZ(java.sql.Date.class, defaultDateTypeAdapter3));
        return new Gson(this.LIZ, this.LIZJ, this.LIZLLL, this.LJI, this.LJIIJ, this.LJIILJJIL, this.LJIIL, this.LJIILIIL, this.LJIILL, this.LJIIJJI, this.LIZIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJ, this.LJFF, arrayList);
    }

    public e() {
        this.LIZ = Excluder.LLIZ;
        this.LIZIZ = t.DEFAULT;
        this.LIZJ = c.IDENTITY;
        this.LIZLLL = new HashMap();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LJI = false;
        this.LJIIIIZZ = 2;
        this.LJIIIZ = 2;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = true;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
    }

    public e(Gson gson) {
        this.LIZ = Excluder.LLIZ;
        this.LIZIZ = t.DEFAULT;
        this.LIZJ = c.IDENTITY;
        HashMap map = new HashMap();
        this.LIZLLL = map;
        ArrayList arrayList = new ArrayList();
        this.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJFF = arrayList2;
        this.LJI = false;
        this.LJIIIIZZ = 2;
        this.LJIIIZ = 2;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = true;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LIZ = gson.LJFF;
        this.LIZJ = gson.LJI;
        map.putAll(gson.LJII);
        this.LJI = gson.LJIIIIZZ;
        this.LJIIJ = gson.LJIIIZ;
        this.LJIILJJIL = gson.LJIIJ;
        this.LJIIL = gson.LJIIJJI;
        this.LJIILIIL = gson.LJIIL;
        this.LJIILL = gson.LJIILIIL;
        this.LJIIJJI = gson.LJIILJJIL;
        this.LIZIZ = gson.LJIJ;
        this.LJII = gson.LJIILL;
        this.LJIIIIZZ = gson.LJIILLIIL;
        this.LJIIIZ = gson.LJIIZILJ;
        arrayList.addAll(gson.LJIJI);
        arrayList2.addAll(gson.LJIJJ);
    }

    public final void LIZIZ(int... iArr) {
        Excluder excluderLIZ = this.LIZ.clone();
        excluderLIZ.LLILLJJLI = 0;
        for (int i : iArr) {
            excluderLIZ.LLILLJJLI = i | excluderLIZ.LLILLJJLI;
        }
        this.LIZ = excluderLIZ;
    }

    public final void LIZLLL(v vVar) {
        ((ArrayList) this.LJ).add(vVar);
    }

    public final void LJ(a... aVarArr) {
        for (a aVar : aVarArr) {
            this.LIZ = this.LIZ.LJFF(aVar, true, true);
        }
    }

    public final void LIZJ(Object obj, Type type) {
        boolean z;
        boolean z2 = obj instanceof r;
        if (!z2 && !(obj instanceof j) && !(obj instanceof g) && !(obj instanceof TypeAdapter)) {
            z = false;
        } else {
            z = true;
        }
        com.google.gson.internal.a.LIZ(z);
        if (obj instanceof g) {
            ((HashMap) this.LIZLLL).put(type, obj);
        }
        if (z2 || (obj instanceof j)) {
            TypeToken typeToken = TypeToken.get(type);
            ((ArrayList) this.LJ).add(TreeTypeAdapter.LIZ(typeToken, obj));
        }
        if (obj instanceof TypeAdapter) {
            ((ArrayList) this.LJ).add(TypeAdapters.LIZ(TypeToken.get(type), (TypeAdapter) obj));
        }
    }
}
