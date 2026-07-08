package com.google.protobuf;

import X.AbstractC19922812xG;
import X.AbstractC19929412yK;
import X.C19888812rm;
import X.C19889012ro;
import X.C19918612wa;
import X.C19927512y1;
import X.C19927612y2;
import X.C19927912y5;
import X.EnumC19361010oq;
import X.InterfaceC19361110or;
import X.InterfaceC19929112yH;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class g3 extends AbstractC19929412yK<C19927612y2, C19927512y1> {
    @Override // X.AbstractC19929412yK
    public final void LJIIIZ(Object obj) {
    }

    @Override // X.AbstractC19929412yK
    public final C19927512y1 LJIIL() {
        C19927612y2 c19927612y2 = C19927612y2.LLILLJJLI;
        return new C19927512y1();
    }

    @Override // X.AbstractC19929412yK
    public final C19927512y1 LJFF(Object obj) {
        C19927612y2 c19927612y2 = ((k0) obj).unknownFields;
        c19927612y2.getClass();
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(c19927612y2);
        return c19927512y1;
    }

    @Override // X.AbstractC19929412yK
    public final C19927612y2 LJI(Object obj) {
        return ((k0) obj).unknownFields;
    }

    @Override // X.AbstractC19929412yK
    public final int LJII(C19927612y2 c19927612y2) {
        return c19927612y2.getSerializedSize();
    }

    @Override // X.AbstractC19929412yK
    public final int LJIIIIZZ(C19927612y2 c19927612y2) {
        return c19927612y2.LIZ();
    }

    @Override // X.AbstractC19929412yK
    public final boolean LJIILL(InterfaceC19929112yH interfaceC19929112yH) {
        interfaceC19929112yH.LJFF();
        return false;
    }

    @Override // X.AbstractC19929412yK
    public final C19927612y2 LJIILLIIL(C19927512y1 c19927512y1) {
        return c19927512y1.build();
    }

    @Override // X.AbstractC19929412yK
    public final C19927612y2 LJIIJ(C19927612y2 c19927612y2, C19927612y2 c19927612y22) {
        C19927612y2 c19927612y23 = c19927612y2;
        c19927612y23.getClass();
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(c19927612y23);
        c19927512y1.LJFF(c19927612y22);
        return c19927512y1.build();
    }

    @Override // X.AbstractC19929412yK
    public final void LJIILIIL(Object obj, C19927512y1 c19927512y1) {
        ((k0) obj).unknownFields = c19927512y1.build();
    }

    @Override // X.AbstractC19929412yK
    public final void LJIILJJIL(Object obj, C19927612y2 c19927612y2) {
        ((k0) obj).unknownFields = c19927612y2;
    }

    @Override // X.AbstractC19929412yK
    public final void LJIIZILJ(C19927612y2 c19927612y2, InterfaceC19361110or interfaceC19361110or) {
        C19927612y2 c19927612y22 = c19927612y2;
        if (!c19927612y22.LL.isEmpty()) {
            interfaceC19361110or.getClass();
            if (EnumC19361010oq.ASCENDING == EnumC19361010oq.DESCENDING) {
                for (Map.Entry<Integer, C19927912y5> entry : c19927612y22.LL.descendingMap().entrySet()) {
                    entry.getValue().LIZ(entry.getKey().intValue(), interfaceC19361110or);
                }
                return;
            }
            for (Map.Entry<Integer, C19927912y5> entry2 : c19927612y22.LL.entrySet()) {
                entry2.getValue().LIZ(entry2.getKey().intValue(), interfaceC19361110or);
            }
        }
    }

    @Override // X.AbstractC19929412yK
    public final void LJIJ(C19927612y2 c19927612y2, InterfaceC19361110or interfaceC19361110or) {
        c19927612y2.LIZJ(interfaceC19361110or);
    }

    @Override // X.AbstractC19929412yK
    public final void LIZ(int i, int i2, Object obj) {
        C19927512y1 c19927512y1 = (C19927512y1) obj;
        int i3 = C19927912y5.LJFF;
        C19918612wa c19918612wa = new C19918612wa();
        C19927912y5 c19927912y5 = c19918612wa.LIZ;
        if (c19927912y5.LIZIZ == null) {
            c19927912y5.LIZIZ = new C19889012ro();
        }
        c19918612wa.LIZ.LIZIZ.LJJLL(i2);
        c19927512y1.LIZJ(i, c19918612wa.LIZJ());
    }

    @Override // X.AbstractC19929412yK
    public final void LIZIZ(int i, long j, Object obj) {
        C19927512y1 c19927512y1 = (C19927512y1) obj;
        int i2 = C19927912y5.LJFF;
        C19918612wa c19918612wa = new C19918612wa();
        C19927912y5 c19927912y5 = c19918612wa.LIZ;
        if (c19927912y5.LIZJ == null) {
            c19927912y5.LIZJ = new C19888812rm();
        }
        c19918612wa.LIZ.LIZJ.LJ(j);
        c19927512y1.LIZJ(i, c19918612wa.LIZJ());
    }

    @Override // X.AbstractC19929412yK
    public final void LIZJ(int i, Object obj, Object obj2) {
        C19927512y1 c19927512y1 = (C19927512y1) obj;
        int i2 = C19927912y5.LJFF;
        C19918612wa c19918612wa = new C19918612wa();
        C19927912y5 c19927912y5 = c19918612wa.LIZ;
        if (c19927912y5.LJ == null) {
            c19927912y5.LJ = new ArrayList();
        }
        c19918612wa.LIZ.LJ.add(obj2);
        c19927512y1.LIZJ(i, c19918612wa.LIZJ());
    }

    @Override // X.AbstractC19929412yK
    public final void LIZLLL(C19927512y1 c19927512y1, int i, AbstractC19922812xG abstractC19922812xG) {
        int i2 = C19927912y5.LJFF;
        C19918612wa c19918612wa = new C19918612wa();
        c19918612wa.LIZ(abstractC19922812xG);
        c19927512y1.LIZJ(i, c19918612wa.LIZJ());
    }

    @Override // X.AbstractC19929412yK
    public final void LJ(int i, long j, Object obj) {
        int i2 = C19927912y5.LJFF;
        C19918612wa c19918612wa = new C19918612wa();
        c19918612wa.LIZIZ(j);
        ((C19927512y1) obj).LIZJ(i, c19918612wa.LIZJ());
    }
}
