package com.bytedance.pipo.stellar.base.fragment;

import X.AbstractC1623806Xk;
import X.AbstractC2201008jo;
import X.AbstractC2252651DEx;
import X.C013C;
import X.C01GW;
import X.C09IR;
import X.C0PEM;
import X.C15438062q;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1716280ulO;
import X.C1720080urW;
import X.C1720100urY;
import X.C1720120ura;
import X.C1720130urb;
import X.C1720140urc;
import X.C1720170urf;
import X.C1720180urg;
import X.C1720190urh;
import X.C1720210urj;
import X.C1720220urk;
import X.C1720240urm;
import X.C1720250urn;
import X.C1720280urq;
import X.C1720310urt;
import X.C1720760usc;
import X.C1954807lC;
import X.C1DFB;
import X.C2097608Jq;
import X.C2199608ja;
import X.C2199708jb;
import X.C2199808jc;
import X.C2200308jh;
import X.C2200408ji;
import X.C2200508jj;
import X.C2200608jk;
import X.C2200708jl;
import X.C2200808jm;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C491001vg;
import X.C639060P4u;
import X.C747090TSh;
import X.EnumC1720490usB;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1719800ur4;
import X.InterfaceC1720230url;
import X.InterfaceC1720550usH;
import X.InterfaceC1720700usW;
import X.InterfaceC747100TSi;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.model.NavBarDO;
import com.bytedance.pipo.stellar.base.model.NavbarActionDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.pipo.stellar.base.resourceloader.StellarStyle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarViewModel extends AssemViewModel<C1720190urh> implements InterfaceC1720700usW {
    public final Keva LL;
    public final C1716280ulO LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public final C01GW LLILZ;
    public InterfaceC1719800ur4 LLILZIL;
    public final C1720240urm LLILZLL;
    public final Map<String, StellarCardAdapter<?>> LLIZ;
    public StellarChunk LLIZLLLIL;
    public final C2252331DDr LLJ;
    public final C2252331DDr LLJI;
    public final C2252331DDr LLJIJIL;
    public final C2252331DDr LLJILJIL;
    public final C2252331DDr LLJILJILJ;
    public final C2252331DDr LLJILLL;
    public final C2252331DDr LLJJ;
    public long LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public long LLJJIJIIJIL;
    public final Map<String, String> LLJJIJIL;
    public final C1720210urj LLJJJ;
    public boolean LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0urj] */
    public StellarViewModel() {
        Keva repo = KevaImpl.getRepo("stellar_view_model", 1);
        C1716280ulO c1716280ulO = new C1716280ulO();
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LL = repo;
        this.LLILLJJLI = c1716280ulO;
        this.LLILLL = c1dfb;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26(this, 1517));
        this.LLILZLL = new C1720240urm();
        this.LLIZ = new LinkedHashMap();
        this.LLJ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJI = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJIJIL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILJIL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILJILJ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILLL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = new InterfaceC747100TSi() { // from class: X.0urj
            @Override // X.InterfaceC747100TSi
            public final void LIZ(String str, InterfaceC747070TSf interfaceC747070TSf) {
                Object next;
                String str2;
                Iterator it2 = ((LinkedHashMap) this.LIZ.LLJJIJIL).entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((Map.Entry) next).getValue(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null && (str2 = (String) entry.getKey()) != null) {
                    this.LIZ.yQ2(new C1720220urk(str2, interfaceC747070TSf.getCardHeight().intValue()), null);
                }
            }
        };
        new C639060P4u(CoroutineExceptionHandler.LJJLIL, 20);
        this.LLJJJIL = true;
    }

    public final void CQ2() {
        C1716280ulO c1716280ulO = this.LLILLJJLI;
        boolean z = this.LLJJJIL;
        c1716280ulO.getClass();
        c1716280ulO.LJII = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", "show");
        linkedHashMap.put("first_render", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str = c1716280ulO.LIZLLL;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("page_id", str);
        c1716280ulO.LIZJ("pipo_page_enter", C2097608Jq.LJIIL(linkedHashMap, c1716280ulO.LJI));
        this.LLJJJIL = false;
    }

    @Override // X.InterfaceC1720700usW
    public final C1720760usc Ka1() {
        return (C1720760usc) this.LLILZ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1720190urh(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C747090TSh c747090TSh = C747090TSh.LIZ;
        C1720210urj c1720210urj = this.LLJJJ;
        synchronized (c747090TSh) {
            ((ArrayList) C747090TSh.LIZIZ).remove(c1720210urj);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        setState(new AwS605S0100000_26(this, 41));
        C747090TSh c747090TSh = C747090TSh.LIZ;
        C1720210urj c1720210urj = this.LLJJJ;
        synchronized (c747090TSh) {
            ((ArrayList) C747090TSh.LIZIZ).add(c1720210urj);
        }
    }

    public final Boolean xQ2() {
        String str;
        StellarStyle stellarStyle = getState().LLILLJJLI;
        if (stellarStyle == null || (str = stellarStyle.theme) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        if (Intrinsics.LJFF(str.toLowerCase(locale), "normal")) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str.toLowerCase(locale), "dark"));
    }

    @Override // X.InterfaceC1720700usW
    public final String Qw() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1720700usW
    public final Map<String, String> Ye0() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1720700usW
    public final C1716280ulO xK() {
        return this.LLILLJJLI;
    }

    public static void vQ2(StellarViewModel stellarViewModel) {
        InterfaceC1719800ur4 interfaceC1719800ur4 = stellarViewModel.LLILZIL;
        if (interfaceC1719800ur4 != null) {
            if (!Intrinsics.LJFF(null, Boolean.TRUE) && (stellarViewModel.getState().LLILLL || (stellarViewModel.getState().LL instanceof C1623706Xj))) {
                return;
            }
            stellarViewModel.withState(new AwS235S0300000_26(new C013C(), stellarViewModel, interfaceC1719800ur4, 54));
        }
    }

    public final void BQ2(C1720250urn c1720250urn) {
        if (c1720250urn == null) {
            return;
        }
        if (Intrinsics.LJFF(c1720250urn.LIZJ, "button")) {
            C1716280ulO c1716280ulO = this.LLILLJJLI;
            String str = c1720250urn.LIZ;
            Map<String, Object> map = c1720250urn.LIZIZ;
            c1716280ulO.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_type", "click");
            linkedHashMap.put("button_id", str);
            c1716280ulO.LIZJ("pipo_button_click", C2097608Jq.LJIIL(C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap), C1716280ulO.LIZ(map)));
            return;
        }
        C1716280ulO c1716280ulO2 = this.LLILLJJLI;
        String str2 = c1720250urn.LIZ;
        Map<String, Object> map2 = c1720250urn.LIZIZ;
        c1716280ulO2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("event_type", "click");
        linkedHashMap2.put("card_id", str2);
        c1716280ulO2.LIZJ("pipo_card_click", C2097608Jq.LJIIL(C2097608Jq.LJIIL(linkedHashMap2, c1716280ulO2.LJI), C1716280ulO.LIZ(map2)));
    }

    @Override // X.InterfaceC1720700usW
    public final StellarCardAdapter<InterfaceC1720550usH> is2(String str) {
        if (str == null) {
            return null;
        }
        return (StellarCardAdapter) ((LinkedHashMap) this.LLIZ).get(str.toUpperCase(Locale.ROOT));
    }

    public final <T extends InterfaceC1720550usH> void zQ2(StellarCardAdapter<T> stellarCardAdapter) {
        Map<String, InterfaceC1720230url<?>> map = this.LLILZLL.LIZ;
        String strLLFII = stellarCardAdapter.LLFII();
        Locale locale = Locale.ROOT;
        map.put(strLLFII.toUpperCase(locale), stellarCardAdapter);
        this.LLIZ.put(stellarCardAdapter.LLFII().toUpperCase(locale), stellarCardAdapter);
    }

    public static NavBarDO EQ2(NavBarDO navBarDO, boolean z) {
        ArrayList arrayList;
        NavbarActionDO navbarActionDOLIZ;
        List<NavbarActionDO> startActions = navBarDO.getStartActions();
        ArrayList arrayList2 = null;
        if (startActions != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(startActions, 10));
            Iterator<NavbarActionDO> it2 = startActions.iterator();
            while (it2.hasNext()) {
                arrayList.add(NavbarActionDO.LIZ(it2.next(), z));
            }
        } else {
            arrayList = null;
        }
        NavbarActionDO centerAction = navBarDO.getCenterAction();
        if (centerAction != null) {
            navbarActionDOLIZ = NavbarActionDO.LIZ(centerAction, z);
        } else {
            navbarActionDOLIZ = null;
        }
        List<NavbarActionDO> endActions = navBarDO.getEndActions();
        if (endActions != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(endActions, 10));
            Iterator<NavbarActionDO> it3 = endActions.iterator();
            while (it3.hasNext()) {
                arrayList2.add(NavbarActionDO.LIZ(it3.next(), z));
            }
        }
        return navBarDO.copy(navBarDO.spacing, navBarDO.padding, arrayList, arrayList2, navbarActionDOLIZ);
    }

    public final void AQ2(String str, Throwable th) {
        AbstractC1623806Xk c491001vg;
        String message = str;
        C1716280ulO c1716280ulO = this.LLILLJJLI;
        long j = this.LLJJI;
        if (message == null) {
            message = th.getMessage();
        }
        c1716280ulO.LJ(message, null, j, null);
        if (getState().LL instanceof C1623706Xj) {
            c491001vg = new C491001vg(th);
        } else {
            c491001vg = getState().LL;
        }
        setState(new AwS605S0100000_26(c491001vg, (AbstractC1623806Xk<Boolean>) 754));
        if (c491001vg instanceof C1623606Xi) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C2199608ja(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(com.bytedance.pipo.stellar.base.resourceloader.StellarChunk r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.stellar.base.fragment.StellarViewModel.wQ2(com.bytedance.pipo.stellar.base.resourceloader.StellarChunk, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void yQ2(AbstractC2201008jo abstractC2201008jo, C1720250urn c1720250urn) {
        C1623606Xi c1623606Xi;
        C1720310urt c1720310urt;
        List<InterfaceC1720550usH> list;
        C1623606Xi c1623606Xi2;
        C1720310urt c1720310urt2;
        List<InterfaceC1720550usH> list2;
        C1623606Xi c1623606Xi3;
        C1720310urt c1720310urt3;
        List<InterfaceC1720550usH> list3;
        if (abstractC2201008jo instanceof C1720220urk) {
            AbstractC1623806Xk<C1720310urt> abstractC1623806Xk = getState().LL;
            if ((abstractC1623806Xk instanceof C1623606Xi) && (c1623606Xi3 = (C1623606Xi) abstractC1623806Xk) != null && (c1720310urt3 = (C1720310urt) c1623606Xi3.LIZ) != null && (list3 = c1720310urt3.LIZIZ) != null) {
                setState(new AwS392S0200000_26((List) list3, (List<? extends InterfaceC1720550usH>) abstractC2201008jo, (AbstractC2201008jo) 190));
            }
        } else if (abstractC2201008jo instanceof C2200808jm) {
            int i = C1720120ura.LIZ[((C2200808jm) abstractC2201008jo).LIZ.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AbstractC1623806Xk<C1720310urt> abstractC1623806Xk2 = getState().LL;
                        if ((abstractC1623806Xk2 instanceof C1623606Xi) && (c1623606Xi2 = (C1623606Xi) abstractC1623806Xk2) != null && (c1720310urt2 = (C1720310urt) c1623606Xi2.LIZ) != null && (list2 = c1720310urt2.LIZIZ) != null) {
                            setState(new AwS392S0200000_26((List) list2, (List<? extends InterfaceC1720550usH>) abstractC2201008jo, (AbstractC2201008jo) 192));
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    AbstractC1623806Xk<C1720310urt> abstractC1623806Xk3 = getState().LL;
                    if ((abstractC1623806Xk3 instanceof C1623606Xi) && (c1623606Xi = (C1623606Xi) abstractC1623806Xk3) != null && (c1720310urt = (C1720310urt) c1623606Xi.LIZ) != null && (list = c1720310urt.LIZIZ) != null) {
                        setState(new AwS392S0200000_26((List) list, (List<? extends InterfaceC1720550usH>) abstractC2201008jo, (AbstractC2201008jo) 191));
                    }
                }
            } else {
                C23250099c.LIZLLL(getAssemVMScope(), null, null, new C2199808jc(this, abstractC2201008jo, null), 3);
            }
        } else if (abstractC2201008jo instanceof C1720080urW) {
            String str = ((C1720080urW) abstractC2201008jo).LIZ;
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String str2 = ((C1720080urW) abstractC2201008jo).LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.LLJJIJI;
            if (str3 == null) {
                str3 = null;
            }
            String string = UriProtector.parse(str).buildUpon().appendQueryParameter("source_btm_token", btmSDK.createJumpSourceBtmToken(str2, PageFinder.via(str3), null)).appendQueryParameter("trace_id", this.LLILLJJLI.LIZ).appendQueryParameter("previous_page_id", this.LLILLJJLI.LIZLLL).build().toString();
            C1720080urW c1720080urW = (C1720080urW) abstractC2201008jo;
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C2199708jb(this, new C1720080urW(string, c1720080urW.LIZIZ, c1720080urW.LIZJ, c1720080urW.LIZLLL), null), 3);
            Integer num = ((C1720080urW) abstractC2201008jo).LIZJ;
            if (num != null && num.intValue() == 1) {
                C23250099c.LIZLLL(getAssemVMScope(), null, null, new C2200708jl(this, null), 3);
            }
        } else if (abstractC2201008jo instanceof C1720130urb) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1720170urf(this, abstractC2201008jo, null), 3);
        } else if (abstractC2201008jo instanceof C2200608jk) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C2200308jh(this, abstractC2201008jo, null), 3);
        } else if (abstractC2201008jo instanceof C2200508jj) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C2200408ji(this, abstractC2201008jo, null), 3);
        } else if (abstractC2201008jo instanceof C1720140urc) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1720180urg(this, abstractC2201008jo, c1720250urn, null), 3);
        } else {
            throw new C1954807lC();
        }
    }

    public final void DQ2(Boolean bool, String str, Map map) {
        String str2;
        C1716280ulO c1716280ulO = this.LLILLJJLI;
        c1716280ulO.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", "show");
        linkedHashMap.put("button_id", str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_toggle_on", str2);
        }
        c1716280ulO.LIZJ("pipo_button_show", C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap));
    }

    @Override // X.InterfaceC1720700usW
    public final void ZN1(String str, String str2, Map<String, ? extends Object> map) {
        C1720280urq.LIZIZ(this, str, str2, map);
    }

    @Override // X.InterfaceC1720050urT
    public final synchronized void bL(StellarActionDO stellarActionDO, C1720250urn c1720250urn, Fragment fragment) {
        EnumC1720490usB enumC1720490usBLIZJ;
        BQ2(c1720250urn);
        C1720100urY.LIZ(stellarActionDO.eventUrl);
        Integer num = stellarActionDO.type;
        if (num != null) {
            enumC1720490usBLIZJ = C1720100urY.LIZJ(num.intValue());
        } else {
            enumC1720490usBLIZJ = null;
        }
        if (enumC1720490usBLIZJ == EnumC1720490usB.TOGGLE_PRICE) {
            setState(new AwS605S0100000_26(this, 40));
            return;
        }
        AbstractC2201008jo abstractC2201008joLIZIZ = C1720100urY.LIZIZ(stellarActionDO);
        if (abstractC2201008joLIZIZ == null) {
            return;
        }
        yQ2(abstractC2201008joLIZIZ, c1720250urn);
    }

    @Override // X.InterfaceC1720700usW
    public final void Hw0(Long l, String str, Long l2, Long l3) {
        C1720280urq.LIZ(this, str, l, l2, l3);
    }

    @Override // X.InterfaceC1720700usW
    public final void KH2(InterfaceC1720550usH interfaceC1720550usH, long j, long j2, long j3, Long l) {
        C1720280urq.LIZJ(this, interfaceC1720550usH, j, j2, j3, l);
    }

    @Override // X.InterfaceC1720700usW
    public final void We0(String str, Boolean bool, String str2, Long l, Boolean bool2, String str3) {
        C1720280urq.LIZLLL(this, str, str2, l, bool, bool2, str3);
    }
}
