package com.ss.android.ugc.aweme.feed.component;

import X.C01GW;
import X.C0NGJ;
import X.C0NH6;
import X.C0NHK;
import X.C0RD6;
import X.C0S4J;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C591300NHc;
import X.C591410NHn;
import X.C591460NHs;
import X.C606630Nqn;
import X.C606640Nqo;
import X.C606650Nqp;
import X.C606660Nqq;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.component.GoldenHouseComponent;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class GoldenHouseComponent extends BasePanelComponent {
    public static final C0S4J LLIZLLLIL = new C0S4J("Feed-ReachBottom");
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C591410NHn LLILLL;
    public final C630740Ooa LLILZ;
    public boolean LLILZIL;
    public final C591460NHs LLILZLL;
    public final C606630Nqn LLIZ;

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        C0NH6 c0nh6LIZ = C591300NHc.LIZ();
        C591460NHs c591460NHs = this.LLILZLL;
        if (c0nh6LIZ.LJIIJ() != C0NHK.INIT_DONE) {
            c0nh6LIZ.LJIILIIL.add(c591460NHs);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLILLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0NHn] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0NHs] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Nqn] */
    public GoldenHouseComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 139), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C606640Nqo(false, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 140), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C606650Nqp(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLILLL = new InterfaceC1616070s9l() { // from class: X.0NHn
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
                Aweme awemeLJIIIIZZ;
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.LLILZ.getValue();
                if (iViewPagerComponentAbility != null && (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) != null) {
                    C0S4J c0s4j = C0NH6.LJIILLIIL;
                    C0NH6 c0nh6LIZ = C591300NHc.LIZ();
                    if (c0nh6LIZ.LJIIJ() != C0NHK.DISABLED) {
                        C23250099c.LIZLLL(c0nh6LIZ.LJII, null, null, new C0NGE(c0nh6LIZ, awemeLJIIIIZZ, null, null), 3);
                    }
                }
            }
        };
        this.LLILZ = C628500Oky.LIZ(new C606660Nqq(this));
        this.LLILZLL = new C0NGJ() { // from class: X.0NHs
            @Override // X.C0NGJ
            public final void LIZ(List<? extends CacheEntry> list) {
                List<Aweme> items;
                String aid;
                C0S4J c0s4j = GoldenHouseComponent.LLIZLLLIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cache invalid ");
                sbLIZ.append(list);
                c0s4j.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (CacheEntry cacheEntry : list) {
                    arrayList.add(new Pair(cacheEntry.key, cacheEntry));
                }
                C2097608Jq.LJIILJJIL(arrayList, linkedHashMap);
                DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LIZ.LLILLJJLI.getValue();
                if (dataLayerAbility != null && (items = dataLayerAbility.getItems()) != null) {
                    ArrayList<Aweme> arrayList2 = new ArrayList();
                    for (Aweme aweme : items) {
                        if (C591470NHt.LIZ(aweme)) {
                            arrayList2.add(aweme);
                        }
                    }
                    GoldenHouseComponent goldenHouseComponent = this.LIZ;
                    for (Aweme aweme2 : arrayList2) {
                        CacheEntry cacheEntry2 = (CacheEntry) linkedHashMap.get(aweme2.getAid());
                        if (cacheEntry2 != null) {
                            C0S4J c0s4j2 = GoldenHouseComponent.LLIZLLLIL;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("cache invalid delete ");
                            sbLIZ2.append(aweme2.getAid());
                            c0s4j2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
                            DataLayerAbility dataLayerAbility2 = (DataLayerAbility) goldenHouseComponent.LLILLJJLI.getValue();
                            if (dataLayerAbility2 != null) {
                                C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
                                dataLayerAbility2.wT(aweme2, C606130Npz.LIZ("golden_cache_withdraw"));
                            }
                            C0NH1.LIZ.getClass();
                            Pair[] pairArr = new Pair[3];
                            Aweme aweme3 = cacheEntry2.value;
                            if (aweme3 != null) {
                                aid = aweme3.getAid();
                            } else {
                                aid = null;
                            }
                            pairArr[0] = new Pair("group_id", aid);
                            pairArr[1] = new Pair("cache_shelf_life", Long.valueOf(C0NH4.LIZIZ(cacheEntry2) / 3600000));
                            pairArr[2] = new Pair("cache_keep_time", Long.valueOf((System.currentTimeMillis() - cacheEntry2.creationDate) / 3600000));
                            C0NH1.LIZ("golden_house_video_withdraw", C591500NHw.LIZ(pairArr));
                        }
                    }
                }
            }
        };
        this.LLIZ = new Observer() { // from class: X.0Nqn
            /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.feed.component.GoldenHouseComponent r2 = r5.LL
                    boolean r0 = r2.LLILZIL
                    if (r0 != 0) goto L52
                    X.01GW r4 = X.C270760AjK.LIZ
                    java.lang.Object r0 = r4.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    r3 = 1
                    if (r0 <= 0) goto L3c
                    X.0Ooa r0 = r2.LLILZ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility r0 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility) r0
                    if (r0 == 0) goto L53
                    int r1 = r0.LJIL()
                    X.0Ooa r0 = r2.LLILZ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility r0 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility) r0
                    if (r0 == 0) goto L53
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LJJLIIIJL()
                    if (r0 == 0) goto L53
                    int r0 = r0.getCount()
                    if (r0 == 0) goto L53
                    int r0 = r0 - r3
                    if (r1 < r0) goto L53
                L3c:
                    r2.LLILZIL = r3
                    X.0S4J r0 = X.C0NH6.LJIILLIIL
                    X.0NH6 r0 = X.C591300NHc.LIZ()
                    r0.LJIIL()
                    com.ss.android.ugc.feed.platform.panel.base.EventCenter r1 = r2.getEventCenter()
                    if (r1 == 0) goto L52
                    X.0Nqn r0 = r2.LLIZ
                    r1.AQ2(r0)
                L52:
                    return
                L53:
                    X.0Ooa r0 = r2.LLILZ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility r0 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility) r0
                    if (r0 == 0) goto L52
                    int r1 = r0.LJIL()
                    java.lang.Object r0 = r4.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    if (r1 >= r0) goto L3c
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C606630Nqn.onChanged(java.lang.Object):void");
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        C591300NHc.LIZ().LJIILL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZ("event_on_render_first_frame", this.LLIZ);
    }
}
