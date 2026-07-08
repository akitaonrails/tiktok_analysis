package com.ss.android.ugc.aweme.feed.component;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C07JR;
import X.C07JT;
import X.C0ND6;
import X.C13LP;
import X.C1478160oZK;
import X.C1566140qrE;
import X.C1EPP;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2113808Pw;
import X.C2188811AlT;
import X.C299750Boz;
import X.C452501pT;
import X.C593360NPa;
import X.C606140Nq0;
import X.C606720Nqw;
import X.C606730Nqx;
import X.C606740Nqy;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.C797930VRv;
import X.C799570VYd;
import X.EnumC452301pR;
import X.InterfaceC1475300oUi;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC606860NrA;
import X.InterfaceC739770T0d;
import Y.ARunnableS109S0100000_9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.ColdCacheRevertInsertComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ColdCacheRevertInsertComponent extends BasePanelComponent {
    public static boolean LLILZLL;
    public static boolean LLIZ;
    public static boolean LLIZLLLIL;
    public static Aweme LLJ;
    public static boolean LLJI;
    public static boolean LLJIJIL;
    public static Aweme LLJILJIL;
    public static boolean LLJILJILJ;
    public static boolean LLJILLL;
    public static boolean LLJJ;
    public static boolean LLJJI;
    public static boolean LLJJIII;
    public final List<Aweme> LL = new ArrayList();
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C630740Ooa LLILZ;
    public C606140Nq0 LLILZIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public ColdCacheRevertInsertComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 137), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C606720Nqw(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 138), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C606730Nqx(false, this));
        }
        this.LLILLL = c01gwLIZIZ2;
        this.LLILZ = C628500Oky.LIZ(new C606740Nqy(this));
    }

    public final void bo() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        InterfaceC739770T0d interfaceC739770T0dP2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColdCacheRevertInsertComponent hadRevert ");
        sbLIZ.append(LLIZ);
        sbLIZ.append(" pendingDelete: ");
        Aweme aweme = LLJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(" firstBrush: ");
        sbLIZ.append(LLJILLL);
        sbLIZ.append(" netDownloaded: ");
        sbLIZ.append(LLJJ);
        sbLIZ.append(" netListJudge: ");
        sbLIZ.append(LLJIJIL);
        sbLIZ.append(" hadSlid ");
        sbLIZ.append(LLJJIII);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LLIZ || !LLJILLL || !LLJJ || LLJ == null || !LLJIJIL || LLJJIII) {
            return;
        }
        C01GW c01gw = C07JR.LIZ;
        boolean z = ((Boolean) c01gw.getValue()).booleanValue() && !LLJILJILJ && C593360NPa.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ColdCacheRevertInsertComponent isSearchState: ");
        sbLIZ2.append(z);
        sbLIZ2.append("; ");
        sbLIZ2.append(((Boolean) c01gw.getValue()).booleanValue());
        sbLIZ2.append(", ");
        sbLIZ2.append(!LLJILJILJ);
        sbLIZ2.append(", ");
        sbLIZ2.append(C593360NPa.LIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (z) {
            return;
        }
        LLIZ = true;
        C797930VRv.LIZIZ("ColdCacheRevertInsertComponent revert aid execute");
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new Runnable() { // from class: X.0Npy
            public final void LIZ() {
                Aweme aweme2 = ColdCacheRevertInsertComponent.LLJ;
                if (aweme2 != null) {
                    ColdCacheRevertInsertComponent coldCacheRevertInsertComponent = this.LL;
                    C584470Mw9.LJIJ = 1;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("ColdCacheRevertInsertComponent revert aid: ");
                    sbLIZ3.append(aweme2.getAid());
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    DataLayerAbility dataLayerAbility = (DataLayerAbility) coldCacheRevertInsertComponent.LLILLJJLI.getValue();
                    if (dataLayerAbility != null) {
                        dataLayerAbility.wT(aweme2, new C606500Nqa("cold_cache_revert_item", "feed"));
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ColdCacheRevertInsertComponent@a2a2.checkAndRevertColdCacheImpl$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ColdCacheRevertInsertComponent@a2a2.checkAndRevertColdCacheImpl$1");
            }
        });
        if (((Boolean) C1EPP.LJIIZILJ.getValue()).booleanValue() && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLL.getValue()) != null && (interfaceC739770T0dP2 = iFeedPanelPlatformAbility.P2()) != null) {
            interfaceC739770T0dP2.LJJIL(LLJILJIL);
        }
        if (((Boolean) C1EPP.LJIJ.getValue()).booleanValue()) {
            C20684815ws.LJIILLIIL("cold_cache_revert_result", C2097908Jt.LIZJ(new Pair("is_success", "1")));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLILZIL == null || !C1478160oZK.LIZ().LJJLIIIJILLIZJL()) {
            return;
        }
        C1478160oZK.LIZ().LIZIZ(this.LLILZIL);
        this.LLILZIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        List<Aweme> items;
        int iLJLLJ;
        List<Aweme> items2;
        super.onParentViewCreated();
        if (LLILZLL) {
            return;
        }
        LLILZLL = true;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0Nqz
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    this.LL.ho(i);
                }
            });
        }
        DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LLILLJJLI.getValue();
        if (dataLayerAbility != null) {
            dataLayerAbility.kh0(new InterfaceC606860NrA() { // from class: X.0Nqv
                @Override // X.InterfaceC606860NrA
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJFF() {
                }

                @Override // X.InterfaceC606860NrA
                public final void fn() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZ(List<? extends Aweme> list) {
                    int iLJIL;
                    ColdCacheRevertInsertComponent coldCacheRevertInsertComponent = this.LIZ;
                    coldCacheRevertInsertComponent.getClass();
                    if (!ColdCacheRevertInsertComponent.LLIZLLLIL) {
                        ColdCacheRevertInsertComponent.LLIZLLLIL = true;
                        ArrayList arrayList = new ArrayList(list);
                        int iLJIL2 = -1;
                        if (C797930VRv.LIZ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ColdCacheRevertInsertComponent onRefreshed curIndex ");
                            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) coldCacheRevertInsertComponent.LLILZ.getValue();
                            if (iViewPagerAbility != null) {
                                iLJIL = iViewPagerAbility.LJIL();
                            } else {
                                iLJIL = -1;
                            }
                            sbLIZ.append(iLJIL);
                            sbLIZ.append(", ");
                            sbLIZ.append(arrayList.size());
                            sbLIZ.append(" aidList: ");
                            sbLIZ.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(919), 30));
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        IViewPagerAbility iViewPagerAbility2 = (IViewPagerAbility) coldCacheRevertInsertComponent.LLILZ.getValue();
                        if (iViewPagerAbility2 != null) {
                            iLJIL2 = iViewPagerAbility2.LJIL();
                        }
                        ColdCacheRevertInsertComponent.m191do(iLJIL2, arrayList);
                    }
                }

                @Override // X.InterfaceC606860NrA
                public final void fr(List<? extends Aweme> list) {
                    ColdCacheRevertInsertComponent coldCacheRevertInsertComponent = this.LIZ;
                    coldCacheRevertInsertComponent.getClass();
                    if (!ColdCacheRevertInsertComponent.LLJI) {
                        ColdCacheRevertInsertComponent.LLJI = true;
                        try {
                            ArrayList arrayList = new ArrayList(list);
                            if (C797930VRv.LIZ()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ColdCacheRevertInsertComponent onLoadMoreResult ");
                                sbLIZ.append(arrayList.size());
                                sbLIZ.append(" aidList: ");
                                sbLIZ.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(918), 30));
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                            coldCacheRevertInsertComponent.fo(arrayList);
                        } catch (ConcurrentModificationException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            });
        }
        if (((Boolean) C07JT.LIZ.getValue()).booleanValue()) {
            if (C797930VRv.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ColdCacheRevertInsertComponent preProcessing items: ");
                DataLayerAbility dataLayerAbility2 = (DataLayerAbility) this.LLILLJJLI.getValue();
                sbLIZ.append((dataLayerAbility2 == null || (items2 = dataLayerAbility2.getItems()) == null) ? null : C13LP.LJJLIIIJ(items2, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(920), 30));
                sbLIZ.append(": ");
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLL.getValue();
                sbLIZ.append(iFeedPanelPlatformAbility != null ? Integer.valueOf(iFeedPanelPlatformAbility.LJLLJ()) : null);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLILLL.getValue();
            if (iFeedPanelPlatformAbility2 == null || (iLJLLJ = iFeedPanelPlatformAbility2.LJLLJ()) == 0) {
                ho(0);
                DataLayerAbility dataLayerAbility3 = (DataLayerAbility) this.LLILLJJLI.getValue();
                ArrayList arrayList = (dataLayerAbility3 == null || (items = dataLayerAbility3.getItems()) == null) ? new ArrayList() : new ArrayList(items);
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        if (AwemeBizOptExtKt.getAwemeCacheType((Aweme) ListProtector.get(arrayList, i)) == 1) {
                            arrayList2.add(ListProtector.get(arrayList, i));
                        } else if (!(!arrayList2.isEmpty())) {
                            break;
                        } else {
                            arrayList3.add(ListProtector.get(arrayList, i));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        m191do(0, arrayList2);
                        if (!arrayList3.isEmpty()) {
                            fo(arrayList3);
                        }
                    }
                }
            } else {
                ho(iLJLLJ);
            }
        }
        if (((Number) C1EPP.LJIILLIIL.getValue()).floatValue() <= 0.0f) {
            LLJJ = true;
        }
        if (((Number) C1EPP.LJIILL.getValue()).intValue() <= 0) {
            LLJILLL = true;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
    }

    public static boolean ko(List list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (((Boolean) C1EPP.LJ.getValue()).booleanValue()) {
            boolean zBooleanValue = ((Boolean) C1EPP.LJI.getValue()).booleanValue();
            ListIterator listIterator = ((ArrayList) list).listIterator(0);
            for (int i = 0; listIterator.hasNext() && i <= ((Number) C1EPP.LJFF.getValue()).intValue(); i++) {
                Aweme aweme = (Aweme) listIterator.next();
                if ((((Boolean) C1EPP.LJII.getValue()).booleanValue() || ((Number) C1EPP.LJIIL.getValue()).floatValue() >= 0.0f) && AwemeSaaSExtKt.isLive(aweme)) {
                    z = true;
                    break;
                }
                if ((((Boolean) C1EPP.LJIIIZ.getValue()).booleanValue() || ((Number) C1EPP.LJIILJJIL.getValue()).floatValue() >= 0.0f) && aweme.isAd()) {
                    LLJILJILJ = true;
                    z2 = true;
                    z = false;
                    z3 = false;
                    break;
                }
                if ((((Boolean) C1EPP.LJIIIIZZ.getValue()).booleanValue() || ((Number) C1EPP.LJIILIIL.getValue()).floatValue() >= 0.0f) && ((IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class)).LJIIJJI(aweme)) {
                    z3 = true;
                    z = false;
                    z2 = false;
                    break;
                }
            }
            z = false;
            z2 = false;
            z3 = false;
            if (!zBooleanValue && !z && !z2 && !z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            float fNextInt = AbstractC19994813Le.Default.nextInt(100) / 100.0f;
            if (z4) {
                if (z) {
                    C01GW c01gw = C1EPP.LJIIL;
                    if (((Number) c01gw.getValue()).floatValue() >= 0.0f) {
                        if (((Number) c01gw.getValue()).floatValue() < fNextInt) {
                            return false;
                        }
                    }
                }
                if (z2) {
                    C01GW c01gw2 = C1EPP.LJIILJJIL;
                    if (((Number) c01gw2.getValue()).floatValue() >= 0.0f) {
                        if (((Number) c01gw2.getValue()).floatValue() >= fNextInt) {
                            return true;
                        }
                        return false;
                    }
                }
                if (z3) {
                    C01GW c01gw3 = C1EPP.LJIILIIL;
                    if (((Number) c01gw3.getValue()).floatValue() >= 0.0f) {
                        if (((Number) c01gw3.getValue()).floatValue() >= fNextInt) {
                            return true;
                        }
                        return false;
                    }
                }
                C01GW c01gw4 = C1EPP.LJIIJ;
                if (((Number) c01gw4.getValue()).floatValue() >= 0.0f) {
                    if (((Boolean) C1EPP.LJIIJJI.getValue()).booleanValue()) {
                        if (((Number) c01gw4.getValue()).floatValue() >= fNextInt) {
                            return true;
                        }
                        return false;
                    }
                    if (fNextInt >= ((Number) c01gw4.getValue()).floatValue()) {
                        return true;
                    }
                    return false;
                }
            }
            return z4;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Nq0] */
    public final void fo(List<Aweme> list) {
        String aid;
        Video video;
        Video video2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColdCacheRevertInsertComponent netAwemeList ");
        sbLIZ.append(Integer.valueOf(((ArrayList) list).size()));
        C2188811AlT.LIZIZ(sbLIZ);
        if (LLJ == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        try {
            LLJI = true;
            LLJIJIL = ko(list);
            LLJILJIL = (Aweme) C13LP.LJJJJZI(list);
            if (LLJIJIL) {
                bo();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ColdCacheRevertInsertComponent netAwemeList judge: ");
            sbLIZ2.append(LLJIJIL);
            sbLIZ2.append(", ");
            Aweme aweme = LLJILJIL;
            Integer numValueOf = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ2.append(aid);
            sbLIZ2.append(", ");
            Aweme aweme2 = LLJILJIL;
            if (aweme2 != null && (video2 = aweme2.getVideo()) != null) {
                numValueOf = Integer.valueOf(video2.getDuration());
            }
            sbLIZ2.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (((Number) C1EPP.LJIILLIIL.getValue()).floatValue() > 0.0f && C1478160oZK.LIZ().LJJLIIIJILLIZJL()) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    int iMin = Math.min(arrayList.size(), 3);
                    boolean z = false;
                    for (int i = 0; i < iMin; i++) {
                        Aweme aweme3 = (Aweme) ListProtector.get(list, i);
                        if (aweme3 != null && (video = aweme3.getVideo()) != null && video.getDuration() > 10000 && (aweme3 == null || !AwemeSaaSExtKt.isLive(aweme3))) {
                            ((ArrayList) this.LL).add(aweme3);
                            z = true;
                        }
                    }
                    if (z) {
                        ?? r2 = new InterfaceC1475300oUi() { // from class: X.0Nq0
                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void Dd(int i2, String str, String str2, String str3) {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void LLLLZLLIL(String str) {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void Sm() {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void T8(List list2) {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void Xi(String str, String str2, long j, long j2) {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void Z9() {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void ck() {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void t8(String str, long j, long j2, String str2) {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final /* synthetic */ void tf(long j, long j2, String str, String str2) {
                            }

                            @Override // X.InterfaceC1475300oUi
                            public final void qc(long j, long j2, String str) {
                                Video video3;
                                List<BitRate> bitRate;
                                String urlKey;
                                List<Aweme> list2 = this.LL.LL;
                                if (list2 != null && !((ArrayList) list2).isEmpty()) {
                                    List<Aweme> list3 = this.LL.LL;
                                    if ((list3 instanceof Collection) && ((ArrayList) list3).isEmpty()) {
                                        return;
                                    }
                                    for (Aweme aweme4 : (ArrayList) list3) {
                                        if (aweme4 != null && (video3 = aweme4.getVideo()) != null && (bitRate = video3.getBitRate()) != null && !bitRate.isEmpty()) {
                                            for (BitRate bitRate2 : bitRate) {
                                                if (bitRate2 != null) {
                                                    urlKey = bitRate2.getUrlKey();
                                                } else {
                                                    urlKey = null;
                                                }
                                                if (Intrinsics.LJFF(urlKey, str)) {
                                                    if (j2 <= 0) {
                                                        return;
                                                    }
                                                    ColdCacheRevertInsertComponent.LLJJ = true;
                                                    this.LL.bo();
                                                    ColdCacheRevertInsertComponent coldCacheRevertInsertComponent = this.LL;
                                                    if (coldCacheRevertInsertComponent.LLILZIL == null || !C1478160oZK.LIZ().LJJLIIIJILLIZJL()) {
                                                        return;
                                                    }
                                                    C1478160oZK.LIZ().LIZIZ(coldCacheRevertInsertComponent.LLILZIL);
                                                    coldCacheRevertInsertComponent.LLILZIL = null;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        };
                        this.LLILZIL = r2;
                        C593360NPa.LIZ(new AwS553S0100000_9((C606140Nq0) r2, 136));
                        return;
                    }
                }
            }
            LLJJ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void ho(int i) {
        if (!LLJJI && i == 0) {
            if (((Number) C1EPP.LJIILL.getValue()).intValue() > 0) {
                LLJJI = true;
                C786410Ut5.LJLIIL(((Number) r1.getValue()).intValue(), C799570VYd.LIZIZ(), new ARunnableS109S0100000_9(this, 50));
                return;
            }
            return;
        }
        if (i <= 0 || LLJJIII) {
            return;
        }
        LLJJIII = true;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static void m191do(int i, List list) {
        Aweme aweme;
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColdCacheRevertInsertComponent pendingDelete listSize ");
        sbLIZ.append(Integer.valueOf(((ArrayList) list).size()));
        sbLIZ.append(" curIndex ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        int i2 = i + 1;
        ArrayList arrayList = (ArrayList) list;
        if (i2 >= arrayList.size() || (aweme = (Aweme) C13LP.LJJJJZI(list)) == null || AwemeBizOptExtKt.getAwemeCacheType(aweme) != 1 || LLJ != null) {
            return;
        }
        try {
            ListIterator listIterator = arrayList.listIterator(i2);
            while (listIterator.hasNext()) {
                Aweme aweme2 = (Aweme) listIterator.next();
                if (AwemeBizOptExtKt.getAwemeCacheType(aweme2) == 1 && !Intrinsics.LJFF(aweme2.getAid(), C0ND6.LIZJ)) {
                    LLJ = aweme2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ColdCacheRevertInsertComponent pendingDelete ");
                    Aweme aweme3 = LLJ;
                    if (aweme3 != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ2.append(aid);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (((Boolean) C1EPP.LJIJ.getValue()).booleanValue()) {
                        C20684815ws.LJIILLIIL("cold_cache_revert_result", C2097908Jt.LIZJ(new Pair("is_support_to_revert", "1")));
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
