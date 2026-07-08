package com.ss.android.ugc.feed.platform.panel.datalayer;

import X.AbstractC606590Nqj;
import X.C098200Yq;
import X.C0CAU;
import X.C13BV;
import X.C13LP;
import X.C189200o6;
import X.C1AF0;
import X.C2188811AlT;
import X.C606500Nqa;
import X.C606540Nqe;
import X.C606550Nqf;
import X.C606560Nqg;
import X.C606580Nqi;
import X.C606600Nqk;
import X.C606870NrB;
import X.C729980SkG;
import X.InterfaceC1146704e9;
import X.InterfaceC606850Nr9;
import X.InterfaceC606860NrA;
import X.InterfaceC606900NrE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class DataLayerAbilityImpl implements DataLayerAbility {
    public final C606870NrB LL;
    public AbstractC606590Nqj LLILLJJLI;
    public final ArrayList<InterfaceC606860NrA> LLILLL = new ArrayList<>();
    public final ArrayList<InterfaceC606850Nr9> LLILZ = new ArrayList<>();

    public static boolean LIZ() {
        boolean zLIZ = C0CAU.LIZ();
        if (!zLIZ) {
            C1AF0.LIZJ("DataLayerPanel");
        }
        return zLIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final int Q0() {
        LIZ();
        return this.LL.LIZ.getItemCount();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final List<Aweme> getItems() {
        LIZ();
        List<Aweme> listLIZ = this.LL.LIZ();
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        return Collections.unmodifiableList(listLIZ);
    }

    public DataLayerAbilityImpl(C606870NrB c606870NrB) {
        this.LL = c606870NrB;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void C3(List<? extends Aweme> list) {
        if (!this.LLILLL.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILLL).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606860NrA) it2.next()).fr(list);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        if (!this.LLILZ.isEmpty()) {
            Iterator it3 = new ArrayList(this.LLILZ).iterator();
            while (it3.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it3.next()).LJIIJ(list);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void GQ0(List<? extends Aweme> list) {
        if (!this.LLILLL.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILLL).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606860NrA) it2.next()).LIZ(list);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        if (!this.LLILZ.isEmpty()) {
            Iterator it3 = new ArrayList(this.LLILZ).iterator();
            while (it3.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it3.next()).LIZ(list);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void Z61(List<? extends Aweme> list) {
        if (!this.LLILLL.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILLL).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606860NrA) it2.next()).LIZLLL();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        if (!this.LLILZ.isEmpty()) {
            Iterator it3 = new ArrayList(this.LLILZ).iterator();
            while (it3.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it3.next()).LJFF();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final int au(Aweme aweme) {
        LIZ();
        List<Aweme> items = getItems();
        int iLJIIJ = -1;
        if (items.isEmpty()) {
            return -1;
        }
        try {
            iLJIIJ = C729980SkG.LJIIJ(aweme, items);
            return iLJIIJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return iLJIIJ;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final Aweme getItem(int i) {
        LIZ();
        int iQ0 = Q0();
        if (i >= 0 && i < iQ0) {
            return this.LL.LIZ.d2(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void jl1(C606580Nqi c606580Nqi) {
        this.LLILLJJLI = c606580Nqi;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void kh0(InterfaceC606860NrA interfaceC606860NrA) {
        this.LLILLL.add(interfaceC606860NrA);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void oQ1(InterfaceC606850Nr9 interfaceC606850Nr9) {
        this.LLILZ.remove(interfaceC606850Nr9);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void pV(InterfaceC606850Nr9 interfaceC606850Nr9) {
        this.LLILZ.add(interfaceC606850Nr9);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void rR1(Map map) {
        if (!this.LLILZ.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILZ).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it2.next()).LJII(map);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe KO1(List<? extends Aweme> list, C606500Nqa c606500Nqa) {
        C606550Nqf c606550NqfLIZ;
        if (!LIZ()) {
            return new C606540Nqe(-1, "not in main thread", -1, 103, C13BV.INSTANCE);
        }
        AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
        if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
            return new C606540Nqe(-1, c606550NqfLIZ.LIZIZ, -1, c606550NqfLIZ.LIZ, C13BV.INSTANCE);
        }
        try {
            Iterator<? extends Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                AwemeBizExtKt.setContentDiffType(it2.next(), c606500Nqa.LIZ);
            }
            this.LL.LIZIZ.Um(list);
            LJFF(-1, -1, c606500Nqa, list);
            return new C606540Nqe(-1, null, -1, 0, list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C606540Nqe(-1, e.getMessage(), -1, 101, C13BV.INSTANCE);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe UM1(int i, C606500Nqa c606500Nqa) {
        int i2;
        C606550Nqf c606550NqfLIZ;
        if (!LIZ()) {
            return new C606540Nqe(i, 103, null, "not in main thread");
        }
        int iQ0 = Q0();
        if (i >= 0 && i < iQ0) {
            Aweme item = getItem(i);
            if (item == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(" not exist");
                return new C606540Nqe(i, 105, item, C2188811AlT.LIZIZ(sbLIZ));
            }
            AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
            if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
                return new C606540Nqe(i, c606550NqfLIZ.LIZ, item, c606550NqfLIZ.LIZIZ);
            }
            try {
                AwemeBizExtKt.setContentDiffType(item, c606500Nqa.LIZ);
                boolean zLLZLLIL = this.LL.LIZIZ.LLZLLIL(item);
                if (zLLZLLIL) {
                    LIZIZ(item, i, c606500Nqa);
                } else {
                    AwemeBizExtKt.setContentDiffType(item, null);
                }
                if (zLLZLLIL) {
                    i2 = 0;
                } else {
                    i2 = 100;
                }
                return new C606540Nqe(i, i2, item, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new C606540Nqe(i, 101, item, e.getMessage());
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("out of bounds ");
        sbLIZ2.append(i);
        sbLIZ2.append(' ');
        sbLIZ2.append(iQ0);
        return new C606540Nqe(i, 104, null, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe qH0(int i, C606500Nqa c606500Nqa) {
        C606550Nqf c606550NqfLIZ;
        if (!LIZ()) {
            return new C606540Nqe(0, "not in main thread", i, 103, C13BV.INSTANCE);
        }
        AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
        if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
            return new C606540Nqe(0, c606550NqfLIZ.LIZIZ, i, c606550NqfLIZ.LIZ, C13BV.INSTANCE);
        }
        int iQ0 = Q0();
        if (i >= 0 && i < iQ0) {
            try {
                List<Aweme> listLLIIII = C13LP.LLIIII(getItems().subList(0, i));
                this.LL.LIZIZ.Um(listLLIIII);
                LJFF(0, i, c606500Nqa, listLLIIII);
                return new C606540Nqe(0, null, i, 0, listLLIIII);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new C606540Nqe(0, e.getMessage(), i, 101, C13BV.INSTANCE);
            }
        }
        C13BV c13bv = C13BV.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("out of range ");
        sbLIZ.append(0);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(iQ0);
        return new C606540Nqe(0, C2188811AlT.LIZIZ(sbLIZ), i, 104, c13bv);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606540Nqe wT(Aweme aweme, C606500Nqa c606500Nqa) {
        int i;
        C606550Nqf c606550NqfLIZ;
        if (!LIZ()) {
            return new C606540Nqe(-1, 103, aweme, "not in main thread");
        }
        AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
        if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
            return new C606540Nqe(-1, c606550NqfLIZ.LIZ, aweme, c606550NqfLIZ.LIZIZ);
        }
        int iAu = au(aweme);
        if (iAu < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(" not exist");
            return new C606540Nqe(-1, 105, aweme, C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            AwemeBizExtKt.setContentDiffType(aweme, c606500Nqa.LIZ);
            boolean zLLZLLIL = this.LL.LIZIZ.LLZLLIL(aweme);
            if (zLLZLLIL) {
                LIZIZ(aweme, iAu, c606500Nqa);
            } else {
                AwemeBizExtKt.setContentDiffType(aweme, null);
            }
            if (zLLZLLIL) {
                i = 0;
            } else {
                i = 100;
            }
            return new C606540Nqe(iAu, i, aweme, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C606540Nqe(-1, 101, aweme, e.getMessage());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void Aq2(int i, String str, List list) {
        if (!this.LLILZ.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILZ).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it2.next()).LIZIZ(i, str, list);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void GF0(int i, Aweme aweme, String str) {
        if (!this.LLILZ.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILZ).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it2.next()).LIZLLL(i, aweme, str);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606600Nqk Gm2(Aweme aweme, int i, C606500Nqa c606500Nqa) {
        C606550Nqf c606550NqfLIZ;
        String str = "";
        if (!LIZ()) {
            return new C606600Nqk(i, 103, "not in main thread");
        }
        int iQ0 = Q0();
        if (i >= 0 && i <= iQ0) {
            AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
            if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
                return new C606600Nqk(i, c606550NqfLIZ.LIZ, c606550NqfLIZ.LIZIZ);
            }
            try {
                this.LL.LIZ.tJ2(i, c606500Nqa.LIZ, Collections.singletonList(aweme));
                LIZLLL(aweme, i, c606500Nqa);
                return new C606600Nqk(i, 0, "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                return new C606600Nqk(i, 101, str);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" out of bounds, current is ");
        sbLIZ.append(iQ0);
        return new C606600Nqk(i, 104, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(Aweme aweme, int i, C606500Nqa c606500Nqa) {
        if (this.LLILLL.isEmpty()) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLILLL).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC606860NrA) it2.next()).fn();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LIZLLL(Aweme aweme, int i, C606500Nqa c606500Nqa) {
        if (this.LLILLL.isEmpty()) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLILLL).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC606860NrA) it2.next()).LIZIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJI(List<? extends Aweme> list, int i, C606500Nqa c606500Nqa) {
        if (this.LLILLL.isEmpty()) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLILLL).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC606860NrA) it2.next()).LIZJ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606600Nqk V32(List<? extends Aweme> list, int i, C606500Nqa c606500Nqa) {
        C606550Nqf c606550NqfLIZ;
        String str = "";
        if (!LIZ()) {
            return new C606600Nqk(i, 103, "not in main thread");
        }
        int iQ0 = Q0();
        if (i >= 0 && i <= iQ0 && !list.isEmpty()) {
            AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
            if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
                return new C606600Nqk(i, c606550NqfLIZ.LIZ, c606550NqfLIZ.LIZIZ);
            }
            try {
                this.LL.LIZ.tJ2(i, c606500Nqa.LIZ, list);
                LJI(list, i, c606500Nqa);
                return new C606600Nqk(i, 0, "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                return new C606600Nqk(i, 101, str);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" out of bounds, current is ");
        sbLIZ.append(iQ0);
        return new C606600Nqk(i, 104, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(int i, int i2, C606500Nqa c606500Nqa, List list) {
        if (this.LLILLL.isEmpty()) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLILLL).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC606860NrA) it2.next()).LJFF();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJII(int i, int i2, C606500Nqa c606500Nqa, List list) {
        if (this.LLILLL.isEmpty()) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLILLL).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC606860NrA) it2.next()).LJ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Nqg] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Nqg] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Nqg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Nqg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Nqg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Nqg] */
    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final C606560Nqg YE0(int i, int i2, C606500Nqa c606500Nqa, List list) {
        C606550Nqf c606550NqfLIZ;
        if (!LIZ()) {
            return new C606550Nqf(103, "not in main thread") { // from class: X.0Nqg
            };
        }
        AbstractC606590Nqj abstractC606590Nqj = this.LLILLJJLI;
        String str = null;
        if (abstractC606590Nqj != null && (c606550NqfLIZ = abstractC606590Nqj.LIZ(c606500Nqa)) != null && !c606550NqfLIZ.LIZ()) {
            return new C606550Nqf(c606550NqfLIZ.LIZ, c606550NqfLIZ.LIZIZ) { // from class: X.0Nqg
            };
        }
        int iQ0 = Q0();
        if (i >= 0 && i <= i2 && i2 <= iQ0 && i < iQ0) {
            int i3 = 100;
            try {
                C606870NrB c606870NrB = this.LL;
                String str2 = c606500Nqa.LIZ;
                InterfaceC1146704e9 interfaceC1146704e9YE = c606870NrB.LIZ.yE();
                if ((interfaceC1146704e9YE instanceof InterfaceC606900NrE) && ((InterfaceC606900NrE) interfaceC1146704e9YE).fF(i, i2, str2, list) != null) {
                    LJII(i, i2, c606500Nqa, list);
                    return new C606550Nqf(0, str) { // from class: X.0Nqg
                    };
                }
                return new C606550Nqf(i3, "") { // from class: X.0Nqg
                };
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new C606550Nqf(i3, e.getMessage()) { // from class: X.0Nqg
                };
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("out of range ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        sbLIZ.append(", ");
        sbLIZ.append(iQ0);
        return new C606550Nqf(104, C2188811AlT.LIZIZ(sbLIZ)) { // from class: X.0Nqg
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility
    public final void gJ1(int i, int i2, String str, List list, List list2) {
        if (!this.LLILZ.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILZ).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC606850Nr9) it2.next()).LJIIJJI(i, i2, str, list, list2);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }
}
