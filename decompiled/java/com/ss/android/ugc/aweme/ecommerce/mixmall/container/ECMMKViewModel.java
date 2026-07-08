package com.ss.android.ugc.aweme.ecommerce.mixmall.container;

import X.AbstractC1772170wDX;
import X.AbstractC1772230wDd;
import X.AbstractC1772290wDj;
import X.AbstractC1772340wDo;
import X.AbstractC1773210wFD;
import X.AbstractC1774400wH8;
import X.C01GW;
import X.C05YD;
import X.C1326580kcq;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1771590wCb;
import X.C1771980wDE;
import X.C1772030wDJ;
import X.C1772140wDU;
import X.C1772380wDs;
import X.C1772620wEG;
import X.C1772630wEH;
import X.C1772640wEI;
import X.C1772690wEN;
import X.C1772730wER;
import X.C1772740wES;
import X.C1772750wET;
import X.C1772980wEq;
import X.C1773020wEu;
import X.C1773710wG1;
import X.C1773780wG8;
import X.C1774000wGU;
import X.C1BNE;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C599820Nfo;
import X.C786410Ut5;
import X.C862990XtJ;
import X.C863000XtK;
import X.C863030XtN;
import X.EnumC1326570kcp;
import X.EnumC1772960wEo;
import X.EnumC599720Nfe;
import X.EnumC993130bx1;
import X.InterfaceC1772360wDq;
import X.InterfaceC1772680wEM;
import X.InterfaceC1773310wFN;
import X.InterfaceC1774020wGW;
import X.InterfaceC599750Nfh;
import Y.ARunnableS95S0200000_26;
import android.view.Choreographer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMMKViewModel extends ViewModel implements InterfaceC1772680wEM, InterfaceC1772360wDq {
    public C1772030wDJ LL;
    public C1772620wEG LLILLJJLI;
    public ECMMKContainerController LLILLL;
    public InterfaceC599750Nfh LLILZ;
    public boolean LLJ;
    public boolean LLJIJIL;
    public volatile C1772140wDU LLJILLL;
    public final C2252321DDq LLJJIII;
    public final C2252321DDq LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final Map<String, List<Function2<C1772690wEN, C1771590wCb, Unit>>> LLILZIL = new LinkedHashMap();
    public final List<Function2<C1773780wG8, C1771590wCb, Unit>> LLILZLL = new ArrayList();
    public final List<Function1<C1772630wEH, Unit>> LLIZ = new ArrayList();
    public final Map<String, C1772740wES> LLIZLLLIL = new LinkedHashMap();
    public final boolean LLJI = true;
    public final List<Function1<Unit, Unit>> LLJILJIL = new ArrayList();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(172));
    public final C1772640wEI LLJJ = new C1772640wEI(this);
    public final C2252321DDq LLJJI = C1BNE.LIZ(new AbstractC1772340wDo() { // from class: X.0wE0
    });

    @Override // X.InterfaceC1772360wDq
    public final void Sm0() {
        this.LLJ = true;
        if (this.LLJIJIL && this.LLJI) {
            ee0(true);
        }
    }

    @Override // X.InterfaceC1772680wEM
    public final boolean Ba2() {
        C1772030wDJ c1772030wDJ = this.LL;
        if (c1772030wDJ == null || c1772030wDJ.LJI.size() <= 0) {
            return false;
        }
        for (C1771590wCb c1771590wCb : c1772030wDJ.LJI) {
            if (c1771590wCb == null || (!c1771590wCb.LIZLLL && !c1771590wCb.LJ)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1772680wEM
    public final C1772630wEH GJ() {
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        if (c1772620wEG != null) {
            return c1772620wEG.LJI;
        }
        return null;
    }

    @Override // X.InterfaceC1772680wEM
    public final boolean NM2() {
        C1772030wDJ c1772030wDJ = this.LL;
        if (c1772030wDJ == null || !c1772030wDJ.LJIIJJI) {
            return false;
        }
        c1772030wDJ.LJIIJJI = false;
        return true;
    }

    @Override // X.InterfaceC1772680wEM
    public final void bK0() {
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        if (c1772620wEG != null) {
            c1772620wEG.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1772680wEM
    public final C1772630wEH c82() {
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        if (c1772620wEG != null) {
            return c1772620wEG.LJFF;
        }
        return null;
    }

    @Override // X.InterfaceC1772680wEM
    public final void r10() {
        C1772030wDJ c1772030wDJ = this.LL;
        if (c1772030wDJ != null) {
            C1326580kcq.LIZIZ(EnumC1326570kcp.IDLE);
            for (C1771590wCb c1771590wCb : c1772030wDJ.LJI) {
                if (c1771590wCb != null) {
                    c1771590wCb.LIZLLL = true;
                }
            }
            c1772030wDJ.LJI.clear();
        }
    }

    public ECMMKViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1772380wDs.LIZIZ);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C863000XtK(c2252321DDqLIZ, this, null), 3);
        this.LLJJIII = c2252321DDqLIZ;
        this.LLJJIJI = C1BNE.LIZ(new AbstractC1774400wH8() { // from class: X.0wH9
        });
    }

    @Override // X.InterfaceC1772360wDq
    public final boolean K4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1772360wDq
    public final /* bridge */ /* synthetic */ C05YD LJJIJ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1772680wEM
    public final void Qb2(AbstractC1772230wDd abstractC1772230wDd) {
        C599820Nfo.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePage， tag=");
        sbLIZ.append(abstractC1772230wDd.LIZ.LJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        C599820Nfo.LIZLLL();
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        if (c1772620wEG != null) {
            c1772620wEG.LJIILL(abstractC1772230wDd);
        }
    }

    @Override // X.InterfaceC1772680wEM
    public final void bm1(C1772140wDU c1772140wDU) {
        Integer numLJIJ = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIJ();
        C599820Nfo.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECMMKViewModel, saveOnlineDataForMergeRender, strategy=>");
        sbLIZ.append(numLJIJ);
        sbLIZ.append(',');
        C2188811AlT.LIZIZ(sbLIZ);
        C599820Nfo.LIZLLL();
        if (numLJIJ != null && numLJIJ.intValue() > 0) {
            this.LLJILLL = c1772140wDU;
        }
    }

    @Override // X.InterfaceC1772360wDq
    public final void ee0(boolean z) {
        InterfaceC599750Nfh interfaceC599750Nfh;
        this.LLJIJIL = z;
        if (!z || (this.LLJI && this.LLJ)) {
            this.LLJJIJIIJIL = z;
            ECMMKContainerController eCMMKContainerController = this.LLILLL;
            if (eCMMKContainerController != null) {
                eCMMKContainerController.LJIILJJIL(z);
            }
            ECMMKContainerController eCMMKContainerController2 = this.LLILLL;
            if (eCMMKContainerController2 != null && (interfaceC599750Nfh = eCMMKContainerController2.LLILZLL) != null) {
                interfaceC599750Nfh.LJ("page_visible", Boolean.valueOf(z), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
        }
    }

    @Override // X.InterfaceC1772680wEM
    public final void jy1(C1772630wEH c1772630wEH) {
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        if (c1772620wEG != null && c1772620wEG.LJI == null && c1772630wEH != null) {
            c1772620wEG.LJIIIIZZ = c1772620wEG.LIZIZ(c1772630wEH);
            c1772620wEG.LJI = c1772630wEH;
        }
    }

    @Override // X.InterfaceC1772680wEM
    public final void tW(AbstractC1772170wDX abstractC1772170wDX) {
        C1772030wDJ c1772030wDJ = this.LL;
        if (c1772030wDJ != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c1772030wDJ.LIZIZ), null, null, new C863030XtN(c1772030wDJ, abstractC1772170wDX, null), 3);
        }
    }

    public final void vQ2(AbstractC1772290wDj abstractC1772290wDj) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C862990XtJ(this, abstractC1772290wDj, null), 3);
    }

    @Override // X.InterfaceC1772680wEM
    public final void wA1(AwS605S0100000_26 awS605S0100000_26) {
        ((ArrayList) this.LLJILJIL).add(awS605S0100000_26);
    }

    public final void wQ2(C1772730wER c1772730wER) {
        this.LLIZLLLIL.remove(c1772730wER.LIZ.name());
    }

    public final void xQ2(AwS640S0100000_26 awS640S0100000_26) {
        ((ArrayList) this.LLILZLL).add(awS640S0100000_26);
    }

    public final void yQ2(AwS605S0100000_26 awS605S0100000_26) {
        ((ArrayList) this.LLIZ).add(awS605S0100000_26);
    }

    @Override // X.InterfaceC1772680wEM
    public final Pair<Integer, List<AbstractC1773210wFD>> Jq0(String str, String str2) {
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        int i = -1;
        if (c1772620wEG != null) {
            C1772630wEH c1772630wEH = c1772620wEG.LJFF;
            if (str == null) {
                c1772690wEN = c1772630wEH.LIZLLL;
            } else {
                C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
                C1772690wEN c1772690wEN2 = null;
                if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
                    Iterator<C1772690wEN> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1772690wEN next = it2.next();
                        if (Intrinsics.LJFF(next.LIZLLL, str)) {
                            c1772690wEN2 = next;
                            break;
                        }
                    }
                    c1772690wEN = c1772690wEN2;
                } else {
                    C1771980wDE.LJIIIZ(EnumC993130bx1.WITHOUT_MULTI_TAB, str);
                    C1771980wDE.LJIIIZ(EnumC993130bx1.INVALID_TAB_ID, str);
                    return new Pair<>(-1, C13BV.INSTANCE);
                }
            }
            if (c1772690wEN != null) {
                ArrayList arrayList = new ArrayList(c1772690wEN.LIZJ);
                Iterator it3 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((AbstractC1773210wFD) it3.next()).LJIIIZ(), str2)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                return new Pair<>(Integer.valueOf(i), arrayList);
            }
            C1771980wDE.LJIIIZ(EnumC993130bx1.INVALID_TAB_ID, str);
            return new Pair<>(-1, C13BV.INSTANCE);
        }
        return new Pair<>(-1, C13BV.INSTANCE);
    }

    @Override // X.InterfaceC1772680wEM
    public final void LM0(String str, Function2<? super C1772690wEN, ? super C1771590wCb, Unit> function2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZIL;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(function2);
    }

    @Override // X.InterfaceC1772680wEM
    public final C1774000wGU Ml0(String str, String str2) {
        C1772690wEN c1772690wEN;
        List<C1772690wEN> list;
        C1772690wEN next;
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        if (c1772620wEG != null) {
            C1772630wEH c1772630wEH = c1772620wEG.LJFF;
            if (str == null) {
                c1772690wEN = c1772630wEH.LIZLLL;
            } else {
                C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
                if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
                    Iterator<C1772690wEN> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.LIZLLL, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    c1772690wEN = next;
                } else {
                    C1771980wDE.LJIIIZ(EnumC993130bx1.WITHOUT_MULTI_TAB, str);
                    c1772690wEN = null;
                    C1771980wDE.LJIIIZ(EnumC993130bx1.INVALID_TAB_ID, str);
                    return new C1774000wGU(-1, -1, c1772690wEN, null);
                }
            }
            if (c1772690wEN != null) {
                ArrayList arrayList = new ArrayList(c1772690wEN.LIZJ);
                Iterator<? extends C1773780wG8> it3 = c1772690wEN.LIZIZ.iterator();
                int i = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().LIZ, str2)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                Iterator it4 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        if (Intrinsics.LJFF(((AbstractC1773210wFD) it4.next()).LJIIJ(), str2)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                Iterator it5 = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        if (Intrinsics.LJFF(((AbstractC1773210wFD) it5.next()).LJIIJ(), str2)) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i2 != -1 && i3 != -1) {
                    Iterator it6 = arrayList.iterator();
                    int i4 = 0;
                    while (it6.hasNext()) {
                        it6.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            Iterator<? extends C1773780wG8> it7 = c1772690wEN.LIZIZ.iterator();
                            int i6 = 0;
                            while (true) {
                                if (it7.hasNext()) {
                                    if (Intrinsics.LJFF(it7.next().LIZ, ((AbstractC1773210wFD) ListProtector.get(arrayList, i4)).LJIIJ())) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    i6 = -1;
                                    break;
                                }
                            }
                            if (i6 > i) {
                                return new C1774000wGU(i4, i4 - 1, c1772690wEN, (C1773780wG8) ListProtector.get(c1772690wEN.LIZIZ, i));
                            }
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                return new C1774000wGU(i2, i3, c1772690wEN, (C1773780wG8) ListProtector.get(c1772690wEN.LIZIZ, i));
            }
            C1771980wDE.LJIIIZ(EnumC993130bx1.INVALID_TAB_ID, str);
            return new C1774000wGU(-1, -1, c1772690wEN, null);
        }
        return new C1774000wGU(-1, -1, null, null);
    }

    @Override // X.InterfaceC1772680wEM
    public final Pair<Integer, List<AbstractC1773210wFD>> g80(String str, String str2) {
        List<C1772690wEN> list;
        C1772690wEN next;
        C1772690wEN c1772690wEN;
        String strLJIIIZ;
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        int i = -1;
        if (c1772620wEG != null) {
            C1772630wEH c1772630wEH = c1772620wEG.LJFF;
            if (str == null) {
                c1772690wEN = c1772630wEH.LIZLLL;
            } else {
                C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
                if (c1773710wG1LIZIZ != null && (list = c1773710wG1LIZIZ.LJJIII) != null) {
                    Iterator<C1772690wEN> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.LIZLLL, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    c1772690wEN = next;
                } else {
                    C1771980wDE.LJIIIZ(EnumC993130bx1.WITHOUT_MULTI_TAB, str);
                    C1771980wDE.LJIIIZ(EnumC993130bx1.INVALID_TAB_ID, str);
                    return new Pair<>(-1, C13BV.INSTANCE);
                }
            }
            if (c1772690wEN != null) {
                ArrayList arrayList = new ArrayList(c1772690wEN.LIZJ);
                Iterator it3 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AbstractC1773210wFD abstractC1773210wFD = ((AbstractC1773210wFD) it3.next()).LJIJJLI;
                    if (abstractC1773210wFD != null) {
                        strLJIIIZ = abstractC1773210wFD.LJIIIZ();
                    } else {
                        strLJIIIZ = null;
                    }
                    if (Intrinsics.LJFF(strLJIIIZ, str2)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                return new Pair<>(Integer.valueOf(i), arrayList);
            }
            C1771980wDE.LJIIIZ(EnumC993130bx1.INVALID_TAB_ID, str);
            return new Pair<>(-1, C13BV.INSTANCE);
        }
        return new Pair<>(-1, C13BV.INSTANCE);
    }

    @Override // X.InterfaceC1772680wEM
    public final AbstractC1773210wFD uZ0(int i, AbstractC1773210wFD abstractC1773210wFD) {
        C1772630wEH c1772630wEH;
        List<? extends AbstractC1773210wFD> list;
        List<? extends AbstractC1773210wFD> list2;
        AbstractC1773210wFD next;
        String str;
        List<C1772690wEN> list3;
        C1772690wEN next2;
        List<? extends AbstractC1773210wFD> list4;
        AbstractC1773210wFD abstractC1773210wFD2;
        C1772620wEG c1772620wEG = this.LLILLJJLI;
        AbstractC1773210wFD abstractC1773210wFD3 = null;
        if (c1772620wEG != null && (c1772630wEH = c1772620wEG.LJI) != null) {
            C1772690wEN c1772690wEN = abstractC1773210wFD.LJII.LIZIZ.LIZ;
            if (c1772690wEN != null && (str = c1772690wEN.LIZLLL) != null && !Intrinsics.LJFF(str, "default_tab_id")) {
                C1773710wG1 c1773710wG1LIZIZ = c1772630wEH.LIZIZ();
                if (c1773710wG1LIZIZ != null && (list3 = c1773710wG1LIZIZ.LJJIII) != null) {
                    Iterator<C1772690wEN> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.LJFF(next2.LIZLLL, str)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    C1772690wEN c1772690wEN2 = next2;
                    if (c1772690wEN2 != null && (list4 = c1772690wEN2.LIZJ) != null && (abstractC1773210wFD2 = (AbstractC1773210wFD) C13LP.LJJJLZIJ(i, list4)) != null && abstractC1773210wFD.getClass() == abstractC1773210wFD2.getClass()) {
                        return abstractC1773210wFD2;
                    }
                }
            } else {
                C1773780wG8 c1773780wG8 = c1772630wEH.LIZJ;
                if (c1773780wG8 != null && (list2 = c1773780wG8.LIZLLL) != null) {
                    Iterator<? extends AbstractC1773210wFD> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            AbstractC1773210wFD abstractC1773210wFD4 = next;
                            if (Intrinsics.LJFF(abstractC1773210wFD.LJIIJJI(), abstractC1773210wFD4.LJIIJJI()) && abstractC1773210wFD.getClass() == abstractC1773210wFD4.getClass()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AbstractC1773210wFD abstractC1773210wFD5 = next;
                    if (abstractC1773210wFD5 != null) {
                        C1773020wEu.LIZ.getClass();
                        if (C1773020wEu.LIZ()) {
                            c1772620wEG.LJFF = c1772630wEH;
                        }
                        return abstractC1773210wFD5;
                    }
                }
                C1772690wEN c1772690wEN3 = c1772630wEH.LIZLLL;
                if (c1772690wEN3 != null && (list = c1772690wEN3.LIZJ) != null) {
                    Iterator<? extends AbstractC1773210wFD> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        AbstractC1773210wFD next3 = it4.next();
                        AbstractC1773210wFD abstractC1773210wFD6 = next3;
                        if (Intrinsics.LJFF(abstractC1773210wFD.LJIIJJI(), abstractC1773210wFD6.LJIIJJI()) && abstractC1773210wFD.getClass() == abstractC1773210wFD6.getClass()) {
                            abstractC1773210wFD3 = next3;
                            break;
                        }
                    }
                    return abstractC1773210wFD3;
                }
            }
        }
        return null;
    }

    public final void zQ2(final C1772730wER c1772730wER, C1772750wET c1772750wET) {
        List<InterfaceC1774020wGW> listLJI;
        Map<String, C1772740wES> map = this.LLIZLLLIL;
        String strName = c1772730wER.LIZ.name();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c1772740wES = linkedHashMap.get(strName);
        if (c1772740wES == null) {
            c1772740wES = new C1772740wES(this.LLILLL, c1772750wET);
            linkedHashMap.put(strName, c1772740wES);
        }
        final C1772740wES c1772740wES2 = (C1772740wES) c1772740wES;
        C1772640wEI c1772640wEI = this.LLJJ;
        c1772640wEI.LJFF(c1772730wER);
        c1772740wES2.LJ.clear();
        c1772740wES2.LJ.add(c1772740wES2.LJII);
        c1772740wES2.LJFF.clear();
        c1772740wES2.LJFF.add(c1772740wES2.LJII);
        c1772740wES2.LJI.clear();
        c1772740wES2.LJI.addAll(c1772730wER.LIZIZ);
        c1772740wES2.LJI.addAll(c1772730wER.LIZJ);
        c1772740wES2.LIZLLL = c1772730wER;
        c1772740wES2.LIZJ = c1772640wEI;
        C1772750wET c1772750wET2 = c1772740wES2.LIZIZ;
        EnumC1772960wEo enumC1772960wEo = c1772730wER.LIZ;
        c1772750wET2.getClass();
        int i = C1772980wEq.LIZ[enumC1772960wEo.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1772750wET2.LJIILJJIL = System.currentTimeMillis();
            }
        } else {
            c1772750wET2.LJIIJ = System.currentTimeMillis();
        }
        InterfaceC1773310wFN interfaceC1773310wFN = c1772740wES2.LIZ;
        if (interfaceC1773310wFN != null && (listLJI = interfaceC1773310wFN.LJI()) != null) {
            listLJI.add(c1772740wES2);
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        String strValueOf = String.valueOf(c1772730wER.LIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("ECMMKPageTrace", strValueOf);
        C786410Ut5.LJLIIL(6000L, c1772740wES2.LJIIJJI, c1772740wES2.LJIILIIL);
        EnumC1772960wEo enumC1772960wEo2 = c1772730wER.LIZ;
        if (enumC1772960wEo2 == EnumC1772960wEo.FETCH || enumC1772960wEo2 == EnumC1772960wEo.CACHE) {
            C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0wEe
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    C1772740wES c1772740wES3 = c1772740wES2;
                    EnumC1772960wEo enumC1772960wEo3 = c1772730wER.LIZ;
                    c1772740wES3.getClass();
                    int i2 = C1772970wEp.LIZ[enumC1772960wEo3.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            c1772740wES3.LIZIZ.LJIILL = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                    c1772740wES3.LIZIZ.LJIIJJI = System.currentTimeMillis();
                }
            });
            C786410Ut5.LJJZZIII(c1772740wES2.LJIIJJI, new ARunnableS95S0200000_26(c1772740wES2, c1772730wER, 27));
        }
    }
}
