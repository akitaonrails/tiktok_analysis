package com.tiktok.myna.render.action;

import X.C01GW;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09FM;
import X.C1547320qMs;
import X.C1547340qMu;
import X.C452501pT;
import X.InterfaceC1547330qMt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class MynaActionTypeAdapter extends TypeAdapter<InterfaceC1547330qMt> {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    public MynaActionTypeAdapter(Gson gson) {
        this.LIZ = C452501pT.LIZIZ(new AwS567S0100000_23(gson, 104));
        this.LIZIZ = C452501pT.LIZIZ(new AwS567S0100000_23(gson, 105));
        this.LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(gson, 106));
    }

    @Override // com.google.gson.TypeAdapter
    public final InterfaceC1547330qMt read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ != null) {
            int i = C09FM.LIZ[c09d6LJJLIIIJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ArrayList arrayList = (ArrayList) ((TypeAdapter) this.LIZIZ.getValue()).read(c09cu);
                        C1547320qMs.Companion.getClass();
                        return C1547340qMu.LIZ(arrayList);
                    }
                } else {
                    HashMap map = (HashMap) ((TypeAdapter) this.LIZ.getValue()).read(c09cu);
                    C1547320qMs.Companion.getClass();
                    return C1547340qMu.LIZIZ(map);
                }
            } else {
                c09cu.LJJJJJL();
                return null;
            }
        }
        c09cu.LJJZ();
        return new C1547320qMs("__MYNA_UNKNOWN__", (Map<String, ? extends Object>) null, (String) null);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void write(C09DL c09dl, InterfaceC1547330qMt interfaceC1547330qMt) {
        C1547320qMs c1547320qMs;
        if ((interfaceC1547330qMt instanceof C1547320qMs) && (c1547320qMs = (C1547320qMs) interfaceC1547330qMt) != null) {
            if (!c1547320qMs.getData().isEmpty()) {
                ((TypeAdapter) this.LIZJ.getValue()).write(c09dl, c1547320qMs.getData());
                return;
            }
            List<InterfaceC1547330qMt> actions = c1547320qMs.getActions();
            if (actions != null && !actions.isEmpty()) {
                c09dl.LIZIZ();
                List<InterfaceC1547330qMt> actions2 = c1547320qMs.getActions();
                if (actions2 != null) {
                    Iterator<InterfaceC1547330qMt> it2 = actions2.iterator();
                    while (it2.hasNext()) {
                        write(c09dl, it2.next());
                    }
                }
                c09dl.LJI();
                return;
            }
            c09dl.LJIJJ();
            return;
        }
        c09dl.LJIJJ();
    }
}
