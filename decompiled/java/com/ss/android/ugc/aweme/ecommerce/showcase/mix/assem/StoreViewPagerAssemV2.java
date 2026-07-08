package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.AbstractC712240Rwk;
import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C1161850gL9;
import X.C1163360gNa;
import X.C1165500gR2;
import X.C1166240gSE;
import X.C13LE;
import X.C1553800qXK;
import X.C1558520qew;
import X.C1637806bA;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C20632315oP;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2393609Zm;
import X.C452501pT;
import X.C603630Nlx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1161690gKt;
import X.EnumC1166620gSq;
import X.InterfaceC1554640qYg;
import X.InterfaceC1846110y8n;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.MultiTabContentChunkData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.SparkPreloadData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.StoreInterfacePreloadData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.ViewPagerProvideAbility;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.ActiveTabInfoEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreViewPagerAssemV2;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.SwitchTabEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.AwS61S2100000_23;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreViewPagerAssemV2 extends MixUIContentAssem<C1166240gSE> implements ViewPagerProvideAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public boolean LLJJIII;
    public final ArrayList<TabBarItemData> LLJJIJI = new ArrayList<>();
    public final AssemVMLazy LLJJIJIIJIL;
    public final BPEAHandler LLJJIJIL;
    public C20632315oP LLJJJ;
    public WeakReference<C1846060y8i> LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreViewPagerAssemV2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/showcase/mix/viewmodel/StoreMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoreViewPagerAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoreMixViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 205), AFwS256S0000000_18.get$arr$(69), null, true);
        this.LLJJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(101));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -646069758) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem
    public final Map<String, Class<?>> Lo() {
        return (ConcurrentHashMap) this.LLJJJJLIIL.getValue();
    }

    public final StoreMixViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (StoreMixViewModel) assemVMLazy.getValue();
    }

    public final C20632315oP So() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.view_pager) : null;
            this.LLJJJ = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.ViewPagerProvideAbility
    public final void nh1(C1846060y8i c1846060y8i) {
        this.LLJJJIL = new WeakReference<>(c1846060y8i);
        c1846060y8i.LIZ(new InterfaceC1846110y8n() { // from class: X.0gS7
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                C20632315oP c20632315oPSo = this.LIZ.So();
                if (c20632315oPSo != null) {
                    c20632315oPSo.LJ(c1845940y8W.LIZLLL, true);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1161850gL9.LIZJ("viewpager_init", null);
        final Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            ArrayList<TabBarItemData> arrayList = this.LLJJIJI;
            List<TabBarItemData> listSingletonList = Oo().LLILLL;
            if (listSingletonList == null || listSingletonList.isEmpty()) {
                listSingletonList = Collections.singletonList(new TabBarItemData(Long.valueOf(EnumC1166620gSq.PRODUCT.getValue()), "Products", Boolean.TRUE, 1));
            }
            arrayList.addAll(listSingletonList);
            final C20632315oP c20632315oPSo = So();
            if (c20632315oPSo != null) {
                c20632315oPSo.setAdapter(new FragmentStateAdapter(fragmentLJI) { // from class: X.0gS5
                    @Override // X.AbstractC21673619ry
                    public final int getItemCount() {
                        return this.LLJJIJI.size();
                    }

                    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                    public final boolean LLLI(long j) {
                        Iterator<TabBarItemData> it2 = this.LLJJIJI.iterator();
                        while (it2.hasNext()) {
                            Long l = it2.next().tabType;
                            if (l != null && l.longValue() == j) {
                                return true;
                            }
                        }
                        return false;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
                    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final androidx.fragment.app.Fragment LLLII(int r14) {
                        /*
                            Method dump skipped, instruction units count: 208
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1166150gS5.LLLII(int):androidx.fragment.app.Fragment");
                    }

                    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
                    public final long getItemId(int i) {
                        Long l;
                        TabBarItemData tabBarItemData = (TabBarItemData) C13LP.LJJJLZIJ(i, this.LLJJIJI);
                        if (tabBarItemData != null && (l = tabBarItemData.tabType) != null) {
                            return l.longValue();
                        }
                        return -1L;
                    }
                });
                c20632315oPSo.LIZIZ(new AbstractC712240Rwk() { // from class: X.0gSA
                    public final long LL = SystemClock.elapsedRealtime();
                    public boolean LLILLJJLI;

                    @Override // X.AbstractC712240Rwk
                    public final void onPageScrollStateChanged(int i) {
                        StoreViewPagerAssemV2 storeViewPagerAssemV2 = this.LLILLL;
                        storeViewPagerAssemV2.LLJJJJ = storeViewPagerAssemV2.LLJJJJJIL;
                        storeViewPagerAssemV2.LLJJJJJIL = i;
                    }

                    @Override // X.AbstractC712240Rwk
                    public final void onPageSelected(int i) {
                        TabBarItemData tabBarItemData;
                        String str;
                        long jLongValue;
                        C1846060y8i c1846060y8i;
                        boolean z;
                        WeakReference<C1846060y8i> weakReference = this.LLILLL.LLJJJIL;
                        if (weakReference != null && (c1846060y8i = weakReference.get()) != null) {
                            C20632315oP c20632315oP = c20632315oPSo;
                            StoreViewPagerAssemV2 storeViewPagerAssemV2 = this.LLILLL;
                            if (c1846060y8i.getSelectedTabPosition() != i && i < c1846060y8i.getTabCount()) {
                                if (c20632315oP.getScrollState() == 0 || (c20632315oP.getScrollState() == 2 && storeViewPagerAssemV2.LLJJJJ == 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c1846060y8i.LJIILL(c1846060y8i.LJII(i), z);
                            }
                        }
                        StoreViewPagerAssemV2 storeViewPagerAssemV22 = this.LLILLL;
                        if (storeViewPagerAssemV22.LLJJJJJIL != 0 && (tabBarItemData = (TabBarItemData) C13LP.LJJJLZIJ(i, storeViewPagerAssemV22.LLJJIJI)) != null) {
                            StoreViewPagerAssemV2 storeViewPagerAssemV23 = this.LLILLL;
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(storeViewPagerAssemV23.LLJJIJI, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(838), 30);
                            C1166240gSE c1166240gSEHo = storeViewPagerAssemV23.Ho();
                            if (c1166240gSEHo != null) {
                                str = c1166240gSEHo.LIZ;
                            } else {
                                str = null;
                            }
                            ((InterfaceC1165510gR3) storeViewPagerAssemV23.LLJI.getValue()).LIZJ(new ActiveTabInfoEvent(str, tabBarItemData.tabName, String.valueOf(i), strLJJLIIIJ, tabBarItemData.tabType), "set_active_tab_info");
                            if (!this.LLILLJJLI) {
                                this.LLILLJJLI = true;
                                Pair[] pairArr = new Pair[2];
                                Long l = tabBarItemData.tabType;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                pairArr[0] = new Pair("tab_id", Long.valueOf(jLongValue + ((long) 100)));
                                pairArr[1] = new Pair("cost", Long.valueOf(SystemClock.elapsedRealtime() - this.LL));
                                C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr));
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[PHI: r1
                      0x0020: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:17:0x0026, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.AbstractC712240Rwk
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onPageScrolled(int r8, float r9, int r10) {
                        /*
                            r7 = this;
                            com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreViewPagerAssemV2 r0 = r7.LLILLL
                            java.lang.ref.WeakReference<X.0y8i> r0 = r0.LLJJJIL
                            if (r0 == 0) goto L24
                            java.lang.Object r6 = r0.get()
                            X.0y8i r6 = (X.C1846060y8i) r6
                            if (r6 == 0) goto L24
                            com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreViewPagerAssemV2 r5 = r7.LLILLL
                            int r4 = r5.LLJJJJJIL
                            r3 = 0
                            r2 = 2
                            r1 = 1
                            if (r4 != r2) goto L25
                            int r0 = r5.LLJJJJ
                            if (r0 == r1) goto L25
                            r1 = 0
                        L1c:
                            int r0 = r5.LLJJJJ
                            if (r0 == 0) goto L21
                        L20:
                            r3 = 1
                        L21:
                            r6.LJIJ(r8, r9, r1, r3)
                        L24:
                            return
                        L25:
                            r1 = 1
                            if (r4 != r2) goto L20
                            goto L1c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1166200gSA.onPageScrolled(int, float, int):void");
                    }
                });
            }
            C1161850gL9.LIZJ("viewpager_init_end", null);
        }
        Oo().wQ2(2, new AwS597S0100000_18(this, 78));
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0gS9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1166370gSR) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 36), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.bytedance.router.RouteIntent] */
    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem
    public final void No(Object obj, String str) {
        TabBarItemData next;
        long jLongValue;
        String str2;
        Long l;
        List<SparkPreloadData> list;
        int iIntValue;
        int i;
        String str3;
        Object obj2;
        Object obj3;
        String str4;
        int iIntValue2;
        SwitchTabEvent switchTabEvent;
        Long l2;
        C20632315oP c20632315oPSo;
        super.No(obj, str);
        String str5 = null;
        if (Intrinsics.LJFF(str, "ecSwitchShopTab")) {
            if ((obj instanceof SwitchTabEvent) && (switchTabEvent = (SwitchTabEvent) obj) != null && (l2 = switchTabEvent.tabType) != null) {
                long jLongValue2 = l2.longValue();
                Iterator<TabBarItemData> it2 = this.LLJJIJI.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Long l3 = it2.next().tabType;
                    if (l3 != null && l3.longValue() == jLongValue2) {
                        if (i2 > -1 && (c20632315oPSo = So()) != null) {
                            c20632315oPSo.LJ(i2, true);
                            return;
                        }
                        return;
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "meaningful_rendered") || this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        MultiTabContentChunkData multiTabContentChunkData = Oo().getState().LLILZ;
        if (multiTabContentChunkData != null) {
            StoreMixViewModel storeMixViewModelOo = Oo();
            C1166240gSE c1166240gSEHo = Ho();
            C1553800qXK c1553800qXK = storeMixViewModelOo.LLILZLL;
            List<String> list2 = multiTabContentChunkData.geckoPreloadList;
            c1553800qXK.getClass();
            if (list2 != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C603630Nlx(list2, null), 3);
            }
            List<StoreInterfacePreloadData> list3 = multiTabContentChunkData.interfacePreload;
            int i3 = 2;
            if (list3 != null) {
                for (StoreInterfacePreloadData storeInterfacePreloadData : list3) {
                    if (!C1165500gR2.LIZ.preloadSparkEnable) {
                        storeInterfacePreloadData.preloadType = 0;
                    }
                    C1553800qXK c1553800qXK2 = storeMixViewModelOo.LLILZLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (c1166240gSEHo != null) {
                        str3 = c1166240gSEHo.LIZ;
                    } else {
                        str3 = str5;
                    }
                    sbLIZ.append(str3);
                    TabBarItemData tabBarItemData = storeInterfacePreloadData.tab;
                    if (tabBarItemData != null) {
                        obj2 = tabBarItemData.tabType;
                    } else {
                        obj2 = str5;
                    }
                    sbLIZ.append(obj2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (c1166240gSEHo != null) {
                        obj3 = c1166240gSEHo.LJI;
                    } else {
                        obj3 = str5;
                    }
                    Pair[] pairArr = new Pair[i3];
                    if (c1166240gSEHo != null) {
                        str5 = c1166240gSEHo.LJIIIZ;
                    }
                    pairArr[0] = new Pair("page_source_info", str5);
                    if (c1166240gSEHo != null) {
                        str4 = c1166240gSEHo.LJII;
                    } else {
                        str4 = null;
                    }
                    pairArr[1] = new Pair("session_id", str4);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    AwS617S0100000_3 awS617S0100000_3 = new AwS617S0100000_3(storeMixViewModelOo, 31);
                    if (!c1553800qXK2.LIZ.containsKey(strLIZIZ) && obj3 != null && storeInterfacePreloadData.rules != null && storeInterfacePreloadData.path != null) {
                        BPEAHandler bPEAHandler = c1553800qXK2.LIZJ;
                        C2393609Zm c2393609Zm = new C2393609Zm(mapLJIIIIZZ, c1553800qXK2, storeInterfacePreloadData, obj3, strLIZIZ, awS617S0100000_3);
                        Integer num = storeInterfacePreloadData.preloadType;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        C1163360gNa.LIZ(bPEAHandler, c2393609Zm, Long.valueOf(((long) iIntValue2) * 1000));
                    }
                    str5 = null;
                    i3 = 2;
                }
            }
            if (C1165500gR2.LIZ.preloadSparkEnable && (list = multiTabContentChunkData.sparkPreload) != null) {
                for (SparkPreloadData sparkPreloadData : list) {
                    C1553800qXK c1553800qXK3 = storeMixViewModelOo.LLILZLL;
                    String str6 = sparkPreloadData.schema;
                    String str7 = sparkPreloadData.geckoChannel;
                    Integer num2 = sparkPreloadData.preloadPeriod;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int i4 = C1165500gR2.LIZ.preloadExpireTime;
                    Integer num3 = sparkPreloadData.type;
                    if (num3 != null && num3.intValue() == 1) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    Float fValueOf = Float.valueOf(0.9f);
                    c1553800qXK3.getClass();
                    if (str6 != null) {
                        C1163360gNa.LIZ(c1553800qXK3.LIZJ, new AwS61S2100000_23(new ECSparkPreloadConfigItem(i, null, 1, i4, true, fValueOf, Collections.singletonList(new ECSparkPreloadInfo(str6, str7, "mix_store_preload", "sparklite", 0, 2))), "mix_store", "mix_container", 0), Long.valueOf(((long) iIntValue) * 1000));
                    }
                }
            }
        }
        Iterator<TabBarItemData> it3 = this.LLJJIJI.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(next.isMain, Boolean.TRUE)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TabBarItemData tabBarItemData2 = next;
        if (tabBarItemData2 != null && (l = tabBarItemData2.tabType) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("tabType", Long.valueOf(jLongValue)));
        C1166240gSE c1166240gSEHo2 = Ho();
        if (c1166240gSEHo2 != null) {
            str2 = c1166240gSEHo2.LIZ;
        } else {
            str2 = null;
        }
        C1161850gL9.LIZ(str2, EnumC1161690gKt.PAGE_END, null, mapLIZJ);
    }
}
