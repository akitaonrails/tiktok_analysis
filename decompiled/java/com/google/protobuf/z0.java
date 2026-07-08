package com.google.protobuf;

import X.C19917512wP;
import X.C19920612wu;
import X.C19920712wv;
import X.InterfaceC19888312rh;
import X.InterfaceC19921012wy;
import X.InterfaceC19921312x1;
import X.InterfaceC19931012ya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class z0 implements InterfaceC19931012ya {
    public static final Class<?> LIZ = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // X.InterfaceC19931012ya
    public final List LIZ(long j, Object obj) {
        return LIZLLL(10, j, obj);
    }

    @Override // X.InterfaceC19931012ya
    public final void LIZIZ(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) C19917512wP.LJIILL(j, obj);
        if (list instanceof InterfaceC19921312x1) {
            objUnmodifiableList = ((InterfaceC19921312x1) list).LJJJ();
        } else {
            if (LIZ.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC19888312rh) && (list instanceof InterfaceC19921012wy)) {
                InterfaceC19921012wy interfaceC19921012wy = (InterfaceC19921012wy) list;
                if (interfaceC19921012wy.LJJLIL()) {
                    interfaceC19921012wy.LJJLIIIJL();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C19917512wP.LJJI(j, obj, objUnmodifiableList);
    }

    public static List LIZLLL(int i, long j, Object obj) {
        List arrayList = (List) C19917512wP.LJIILL(j, obj);
        if (arrayList.isEmpty()) {
            if (arrayList instanceof InterfaceC19921312x1) {
                arrayList = new C19920612wu(i);
            } else if ((arrayList instanceof InterfaceC19888312rh) && (arrayList instanceof InterfaceC19921012wy)) {
                arrayList = ((InterfaceC19921012wy) arrayList).LJIILL2(i);
            } else {
                arrayList = new ArrayList(i);
            }
            C19917512wP.LJJI(j, obj, arrayList);
        } else {
            if (LIZ.isAssignableFrom(arrayList.getClass())) {
                ArrayList arrayList2 = new ArrayList(arrayList.size() + i);
                arrayList2.addAll(arrayList);
                C19917512wP.LJJI(j, obj, arrayList2);
                return arrayList2;
            }
            if (arrayList instanceof C19920712wv) {
                C19920612wu c19920612wu = new C19920612wu(arrayList.size() + i);
                c19920612wu.addAll(arrayList);
                C19917512wP.LJJI(j, obj, c19920612wu);
                return c19920612wu;
            }
            if ((arrayList instanceof InterfaceC19888312rh) && (arrayList instanceof InterfaceC19921012wy)) {
                InterfaceC19921012wy interfaceC19921012wy = (InterfaceC19921012wy) arrayList;
                if (!interfaceC19921012wy.LJJLIL()) {
                    InterfaceC19921012wy interfaceC19921012wyLJIILL2 = interfaceC19921012wy.LJIILL2(arrayList.size() + i);
                    C19917512wP.LJJI(j, obj, interfaceC19921012wyLJIILL2);
                    return interfaceC19921012wyLJIILL2;
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC19931012ya
    public final void LIZJ(long j, Object obj, Object obj2) {
        List list = (List) C19917512wP.LJIILL(j, obj2);
        List listLIZLLL = LIZLLL(list.size(), j, obj);
        int size = listLIZLLL.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                listLIZLLL.addAll(list);
            }
            list = listLIZLLL;
        }
        C19917512wP.LJJI(j, obj, list);
    }
}
