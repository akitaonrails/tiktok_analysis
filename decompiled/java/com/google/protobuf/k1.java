package com.google.protobuf;

import X.AbstractC19928912yF;
import X.C19914812vy;
import X.C19915712w7;
import X.C19931412ye;
import X.EnumC19915812w8;
import X.InterfaceC19883612qw;
import X.InterfaceC19930412yU;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class k1 implements InterfaceC19930412yU {
    @Override // X.InterfaceC19930412yU
    public final Object LIZIZ(Object obj) {
        final C19931412ye c19931412ye = (C19931412ye) obj;
        return new C19915712w7(new InterfaceC19883612qw<K, V>(c19931412ye) { // from class: X.12w9
        }, new LinkedHashMap());
    }

    @Override // X.InterfaceC19930412yU
    public final boolean LIZLLL(Object obj) {
        return !((C19915712w7) obj).LIZ;
    }

    @Override // X.InterfaceC19930412yU
    public final void LJ(Object obj) {
        obj.getClass();
    }

    @Override // X.InterfaceC19930412yU
    public final Object LJFF(Object obj) {
        ((C19915712w7) obj).LIZ = false;
        return obj;
    }

    @Override // X.InterfaceC19930412yU
    public final Map<?, ?> LJI(Object obj) {
        C19915712w7 c19915712w7 = (C19915712w7) obj;
        EnumC19915812w8 enumC19915812w8 = c19915712w7.LIZIZ;
        EnumC19915812w8 enumC19915812w82 = EnumC19915812w8.MAP;
        if (enumC19915812w8 != enumC19915812w82) {
            if (c19915712w7.LIZIZ == EnumC19915812w8.LIST) {
                c19915712w7.LIZJ = c19915712w7.LIZ(c19915712w7.LIZLLL);
            }
            c19915712w7.LIZLLL = null;
            c19915712w7.LIZIZ = enumC19915812w82;
        }
        return c19915712w7.LIZJ;
    }

    @Override // X.InterfaceC19930412yU
    public final Map<?, ?> LJII(Object obj) {
        return ((C19915712w7) obj).LIZJ();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC19930412yU
    public final Object LIZ(Object obj, Object obj2) {
        C19915712w7 c19915712w7 = (C19915712w7) obj;
        C19915712w7 c19915712w72 = (C19915712w7) obj2;
        if (!c19915712w7.LIZ) {
            new C19915712w7(c19915712w7.LJ, C19914812vy.LIZJ(c19915712w7.LIZJ()));
        }
        EnumC19915812w8 enumC19915812w8 = c19915712w7.LIZIZ;
        EnumC19915812w8 enumC19915812w82 = EnumC19915812w8.MAP;
        if (enumC19915812w8 != enumC19915812w82) {
            if (c19915712w7.LIZIZ == EnumC19915812w8.LIST) {
                c19915712w7.LIZJ = c19915712w7.LIZ(c19915712w7.LIZLLL);
            }
            c19915712w7.LIZLLL = null;
            c19915712w7.LIZIZ = enumC19915812w82;
        }
        c19915712w7.LIZJ.putAll((Map<? extends K, ? extends V>) C19914812vy.LIZJ(c19915712w72.LIZJ()));
        return c19915712w7;
    }

    @Override // X.InterfaceC19930412yU
    public final void LIZJ(int i, Object obj, Object obj2) {
        if (obj != null) {
            Map mapLIZJ = ((C19915712w7) obj).LIZJ();
            if (!mapLIZJ.isEmpty()) {
                Iterator it2 = mapLIZJ.entrySet().iterator();
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    AbstractC19928912yF.LJIIL(i);
                    obj2.getClass();
                    entry.getKey();
                    entry.getValue();
                    throw null;
                }
            }
        }
    }
}
