package com.google.protobuf;

import X.C19926312xp;
import X.C19930612yW;
import X.C19930812yY;
import X.C19933612z0;
import X.C19934412z8;
import X.C19939112zt;
import X.C2188811AlT;
import X.EnumC19934512z9;
import X.EnumC19937712zf;
import X.EnumC19937812zg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class y extends C19926312xp {
    public static final y LJII = new y(0);
    public final Map<String, C19930612yW> LIZLLL;
    public final Map<String, C19930612yW> LJ;
    public final Map<C19930812yY, C19930612yW> LJFF;
    public final Map<C19930812yY, C19930612yW> LJI;

    public y() {
        this.LIZLLL = new HashMap();
        this.LJ = new HashMap();
        this.LJFF = new HashMap();
        this.LJI = new HashMap();
    }

    public y(int i) {
        super(C19926312xp.LIZJ);
        this.LIZLLL = Collections.emptyMap();
        this.LJ = Collections.emptyMap();
        this.LJFF = Collections.emptyMap();
        this.LJI = Collections.emptyMap();
    }

    public final void LIZIZ(C19933612z0<?, ?> c19933612z0) {
        C19930612yW c19930612yW;
        Map<String, C19930612yW> map;
        Map<C19930812yY, C19930612yW> map2;
        EnumC19934512z9 enumC19934512z9 = c19933612z0.LJFF;
        if (enumC19934512z9 != EnumC19934512z9.IMMUTABLE && enumC19934512z9 != EnumC19934512z9.MUTABLE) {
            return;
        }
        if (c19933612z0.LIZJ().LJIJJ() == EnumC19937812zg.MESSAGE) {
            if (c19933612z0.LIZJ != null) {
                c19930612yW = new C19930612yW(c19933612z0.LIZJ(), c19933612z0.LIZJ);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Registered message-type extension had null default instance: ");
                sbLIZ.append(c19933612z0.LIZJ().LLILZIL);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            c19930612yW = new C19930612yW(c19933612z0.LIZJ(), null);
        }
        EnumC19934512z9 enumC19934512z92 = c19933612z0.LJFF;
        if (c19930612yW.LIZ.LJJIII()) {
            int i = C19934412z8.LIZ[enumC19934512z92.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                map = this.LJ;
                map2 = this.LJI;
            } else {
                map = this.LIZLLL;
                map2 = this.LJFF;
            }
            map.put(c19930612yW.LIZ.LLILZIL, c19930612yW);
            C19939112zt c19939112zt = c19930612yW.LIZ;
            map2.put(new C19930812yY(c19939112zt.LLJIJIL, c19939112zt.getNumber()), c19930612yW);
            C19939112zt c19939112zt2 = c19930612yW.LIZ;
            if (!c19939112zt2.LLJIJIL.LJIJJLI().getMessageSetWireFormat() || c19939112zt2.LJJI() != EnumC19937712zf.MESSAGE || !c19939112zt2.LJJIIZ() || c19939112zt2.LJIJI() != c19939112zt2.LJIJJLI()) {
                return;
            }
            map.put(c19939112zt2.LJIJJLI().LLILZ, c19930612yW);
            return;
        }
        throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
    }
}
