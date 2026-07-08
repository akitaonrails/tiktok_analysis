package com.ss.android.ugc.aweme.relation.feed.performanceui;

import X.AbstractC323330Clv;
import X.C01GW;
import X.C0BLT;
import X.C1007290cJr;
import X.C10LJ;
import X.C1260910iuv;
import X.C1261860iwS;
import X.C1262570ixb;
import X.C13LP;
import X.C1623606Xi;
import X.C1704410uSF;
import X.C1713290ugZ;
import X.C1910890zpH;
import X.C19229710Kx;
import X.C1954807lC;
import X.C19990113Jj;
import X.C19990313Jl;
import X.C2188811AlT;
import X.C23250099c;
import X.C296550Bjp;
import X.C323310Clt;
import X.C323320Clu;
import X.C323350Clx;
import X.C452501pT;
import X.C492501vv;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC19228810Ko;
import X.EnumC19990213Jk;
import X.InterfaceC0148002o;
import X.InterfaceC1263910izl;
import X.InterfaceC19229810Ky;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS107S0201000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PerformanceUserCardViewModel extends AssemViewModel<C1713290ugZ> implements InterfaceC19229810Ky {
    public Aweme LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(342));
    public final Map<String, Boolean> LLILLJJLI = new LinkedHashMap();
    public final Map<String, Boolean> LLILLL = new LinkedHashMap();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 515));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(341));
    public String LLJIJIL = "";
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 514));
    public final CopyOnWriteArrayList<C1261860iwS> LLJJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C1261860iwS> LLJJI = new CopyOnWriteArrayList<>();
    public final Set<String> LLJJIII = Collections.newSetFromMap(new ConcurrentHashMap());
    public boolean LLJJIJIIJIL = true;
    public final boolean LLJJIJIL = true;
    public final InterfaceC497601wk LLJJJ = ViewModelKt.getViewModelScope(this);

    @Override // X.InterfaceC19229810Ky
    public final void Ql1() {
        this.LLJ = 0;
    }

    @Override // X.InterfaceC19229810Ky
    public final void Xn1(List<C1261860iwS> list) {
    }

    @Override // X.InterfaceC19229810Ky
    public final void k20(PlaceUserInfo placeUserInfo, Function0<Unit> function0) {
    }

    @Override // X.InterfaceC19229810Ky
    public final InterfaceC1263910izl XB1() {
        return (InterfaceC1263910izl) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1713290ugZ(0);
    }

    @Override // X.InterfaceC19229810Ky
    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LLILZIL.getValue();
    }

    public final boolean AQ2() {
        List listLLIIII = C13LP.LLIIII(getState().LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (obj != EnumC19228810Ko.CLICK_CLOSE && obj != EnumC19228810Ko.CLICK_LONG_PRESS_DISLIKE) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final boolean BQ2() {
        return getState().LLILLJJLI.isEmpty();
    }

    public final void FQ2() {
        getLogger().LIZ("BigCardViewModel", "set refresh list event");
    }

    public final boolean yQ2() {
        return getState().LLILLJJLI.contains(EnumC19228810Ko.CLICK_LONG_PRESS_DISLIKE);
    }

    public final boolean zQ2() {
        return getState().LLILLJJLI.contains(EnumC19228810Ko.CLICK_CLOSE);
    }

    public final boolean CQ2() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC19229810Ky
    public final CopyOnWriteArrayList<C1261860iwS> Dz1() {
        return this.LLJJ;
    }

    public final void EQ2() {
        C19229710Kx.LJ(this);
    }

    @Override // X.InterfaceC19229810Ky
    public final boolean Js2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC19229810Ky
    public final long LA() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC19229810Ky
    public final String getEventType() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC19229810Ky
    public final CopyOnWriteArrayList<C1261860iwS> hX0() {
        return this.LLJJI;
    }

    public final InterfaceC497601wk xQ2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC19229810Ky
    public final void Cv2(int i) {
        this.LLJI = i;
    }

    public final void DQ2(String str) {
        if (CQ2()) {
            ab0(false);
            if (Js2()) {
                EQ2();
            }
            FQ2();
        }
    }

    @Override // X.InterfaceC19229810Ky
    public final void P22(int i) {
        this.LLIZ = i;
    }

    @Override // X.InterfaceC19229810Ky
    public final CopyOnWriteArrayList<C1261860iwS> R20(String str) {
        return C19229710Kx.LIZIZ(this, str);
    }

    @Override // X.InterfaceC19229810Ky
    public final void ab0(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC19229810Ky
    public final void dI1(int i) {
        this.LLIZLLLIL = i;
    }

    @Override // X.InterfaceC19229810Ky
    public final boolean pc(String str) {
        Integer numValueOf;
        boolean z;
        if (this.LLJJIJIL) {
            C19229710Kx.LJ(this);
        }
        CopyOnWriteArrayList<C1261860iwS> copyOnWriteArrayListLIZIZ = C19229710Kx.LIZIZ(this, str);
        List<C1261860iwS> listLIZ = getState().LLILLL.LIZ();
        if (listLIZ != null) {
            numValueOf = Integer.valueOf(listLIZ.size());
        } else {
            numValueOf = null;
        }
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real data size is ");
        sbLIZ.append(numValueOf);
        logger.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1910890zpH logger2 = getLogger();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("current list size is ");
        sbLIZ2.append(copyOnWriteArrayListLIZIZ.size());
        logger2.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        C1910890zpH logger3 = getLogger();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getState().listState is ");
        sbLIZ3.append(getState().LLILLL);
        sbLIZ3.append(", SystemClock.elapsedRealtime is ");
        if (System.currentTimeMillis() < this.LLJILJILJ) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ3.append(z);
        logger3.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ3));
        if ((getState().LLILLL instanceof C1623606Xi) && copyOnWriteArrayListLIZIZ.size() > 0 && System.currentTimeMillis() < this.LLJILJILJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19229810Ky
    public final void s21(long j) {
        this.LLJILJILJ = j;
    }

    @Override // X.InterfaceC19229810Ky
    public final void setEventType(String str) {
        this.LLJIJIL = str;
    }

    @Override // X.InterfaceC19229810Ky
    public final void uf0(Aweme aweme) {
        C23250099c.LIZLLL(xQ2(), null, null, new C1007290cJr(aweme, this, null), 3);
    }

    public final void vQ2(EnumC19228810Ko enumC19228810Ko) {
        setState(new AwS605S0100000_26(enumC19228810Ko, 403));
    }

    public final void GQ2(C1261860iwS c1261860iwS, EnumC1260930iux enumC1260930iux) {
        String uid;
        String requestId;
        String uid2;
        Aweme aweme = this.LLILZLL;
        if (aweme != null) {
            aweme.setAuthor(c1261860iwS);
        }
        if (enumC1260930iux == EnumC1260930iux.SHOW && c1261860iwS != null && (uid2 = c1261860iwS.getUid()) != null) {
            C1262570ixb.LIZ("15", uid2);
        }
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(this.LLJIJIL);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJJJZI(c1261860iwS);
        String uid3 = null;
        if (C296550Bjp.LIZ()) {
            if (c1261860iwS != null) {
                requestId = c1261860iwS.getRequestId();
            } else {
                requestId = null;
            }
            c1260910iuv.LJJJJLI(requestId);
        }
        c1260910iuv.LJLJI = true;
        Map<String, Boolean> map = this.LLILLJJLI;
        if (c1261860iwS != null) {
            uid = c1261860iwS.getUid();
        } else {
            uid = null;
        }
        c1260910iuv.LLFII = (Boolean) ((LinkedHashMap) map).get(uid);
        Map<String, Boolean> map2 = this.LLILLL;
        if (c1261860iwS != null) {
            uid3 = c1261860iwS.getUid();
        }
        c1260910iuv.LLFZ = (Boolean) ((LinkedHashMap) map2).get(uid3);
        c1260910iuv.LJIILJJIL();
    }

    @Override // X.InterfaceC19229810Ky
    public final void a22(String str, Function0<Unit> function0) {
        withState(new AwS392S0200000_26(this, (PerformanceUserCardViewModel) function0, (Function0<Unit>) 82));
    }

    @Override // X.InterfaceC19229810Ky
    public final boolean cM0(C1261860iwS c1261860iwS, String str) {
        return C19229710Kx.LIZJ(c1261860iwS, str);
    }

    @Override // X.InterfaceC19229810Ky
    public final void kl2(AbstractC323330Clv<C1261860iwS> abstractC323330Clv, boolean z) {
        if (abstractC323330Clv instanceof C323350Clx) {
            C1910890zpH logger = getLogger();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load success, cursor is ");
            C323350Clx c323350Clx = (C323350Clx) abstractC323330Clv;
            sbLIZ.append(c323350Clx.LIZIZ);
            sbLIZ.append(", data size is ");
            sbLIZ.append(c323350Clx.LIZJ.size());
            logger.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C19229710Kx.LJII(this);
            C19229710Kx.LIZ(this, c323350Clx.LIZJ);
            setState(new AwS605S0100000_26(abstractC323330Clv, (AbstractC323330Clv<C1261860iwS>) 404));
        } else if (abstractC323330Clv instanceof C323320Clu) {
            C1910890zpH logger2 = getLogger();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load complete, cursor is null, data size is ");
            C323320Clu c323320Clu = (C323320Clu) abstractC323330Clv;
            sbLIZ2.append(c323320Clu.LIZIZ.size());
            logger2.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            C19229710Kx.LJII(this);
            C19229710Kx.LIZ(this, c323320Clu.LIZIZ);
            setState(new AwS605S0100000_26(abstractC323330Clv, (AbstractC323330Clv<C1261860iwS>) 405));
            this.LLJJIJI = true;
        } else if (abstractC323330Clv instanceof C323310Clt) {
            setState(new AwS605S0100000_26(abstractC323330Clv, (AbstractC323330Clv<C1261860iwS>) 406));
        } else {
            throw new C1954807lC();
        }
        if (z) {
            getLogger().LIZ("BigCardViewModel", "is refresh");
            C492501vv c492501vv = C492501vv.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) 3) * C19990113Jj.LJIIIZ(C19990313Jl.LJII(((Number) C0BLT.LIZ.getValue()).intValue(), EnumC19990213Jk.HOURS)));
            c492501vv.getClass();
            C492501vv.LIZ(jCurrentTimeMillis);
        }
    }

    public final void wQ2(int i, int i2, List<C1261860iwS> list) {
        boolean z;
        List listLJLIL;
        List listLJLIL2;
        CopyOnWriteArrayList<C1261860iwS> copyOnWriteArrayListLIZIZ = C19229710Kx.LIZIZ(this, this.LLJIJIL);
        int i3 = getState().LLILZIL;
        List listLJJJJIZL = C13LP.LJJJJIZL(copyOnWriteArrayListLIZIZ, i3);
        String str = "homepage_hot";
        if (Intrinsics.LJFF(this.LLJIJIL, "homepage_hot")) {
            str = "no_fyp_feed";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJJJIZL.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (true ^ C19229710Kx.LIZJ((C1261860iwS) next, str)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C10LJ.LIZJ((C1261860iwS) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!this.LLJJIII.contains(((User) obj2).getUid())) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.size() >= i) {
            List listLL = C13LP.LL(arrayList3, i);
            if (list != null) {
                listLJLIL2 = C13LP.LJLIL(listLL, list);
            } else {
                listLJLIL2 = listLL;
            }
            if (arrayList3.size() - listLL.size() <= 0 && (this.LLJJIJI || i2 <= 0)) {
                z = false;
            }
            C1910890zpH logger = getLogger();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event type: ");
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(", display users: ");
            sbLIZ.append(listLJLIL2);
            sbLIZ.append(", consumption cnt: ");
            sbLIZ.append(i3);
            logger.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ));
            setState(new AwS107S0201000_26(listLJLIL2, (List<C1261860iwS>) i3, (int) listLL, (List<C1261860iwS>) 0));
            this.LLJJIJIIJIL = z;
            return;
        }
        if (!this.LLJJIJI && i2 > 0) {
            a22(getEventType(), new C1704410uSF(this, i, i2, list));
            return;
        }
        if (list != null) {
            listLJLIL = C13LP.LJLIL(arrayList3, list);
        } else {
            listLJLIL = arrayList3;
        }
        C1910890zpH logger2 = getLogger();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("event type: ");
        sbLIZ2.append(this.LLJIJIL);
        sbLIZ2.append(", display users (final remain): ");
        sbLIZ2.append(arrayList3);
        sbLIZ2.append(", retryLeft: ");
        sbLIZ2.append(i2);
        logger2.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        setState(new AwS107S0201000_26(listLJLIL, (List<C1261860iwS>) i3, (int) arrayList3, (List<C1261860iwS>) 1));
        this.LLJJIJIIJIL = false;
    }
}
