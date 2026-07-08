package com.ss.android.ugc.aweme.feed.mingap;

import X.AbstractC1255880imo;
import X.C01GW;
import X.C1255920ims;
import X.C1559810qh1;
import X.C1559820qh2;
import X.C1559830qh3;
import X.C1559840qh4;
import X.C1563610qn9;
import X.C1563620qnA;
import X.C1564450qoV;
import X.C1566140qrE;
import X.C1567320qt8;
import X.C1567330qt9;
import X.C1601380rm4;
import X.C277830Auj;
import X.C284110BBp;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import Y.ARunnableS102S0100000_2;
import com.ss.android.ugc.aweme.feed.mingap.MinGapMonitorComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.utils.ResponseSectionMeta;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS77S0301000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MinGapMonitorComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C1563620qnA LLILZIL;
    public final C1563610qn9 LLILZLL;
    public C1567320qt8 LLIZ;
    public C1564450qoV LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0qn9] */
    public MinGapMonitorComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 418), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559820qh2(false, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 419), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1559810qh1(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 420), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C1559830qh3(false, this));
        }
        this.LLILLL = c01gwLIZIZ3;
        this.LLILZ = C452501pT.LIZIZ(new C1559840qh4(this));
        this.LLILZIL = new C1563620qnA();
        this.LLILZLL = new InterfaceC1616070s9l() { // from class: X.0qn9
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
            public final void onPageSelected(final int i) {
                final Aweme awemeLJIIIIZZ;
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.LLILZ.getValue();
                if (iViewPagerComponentAbility != null) {
                    awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                final MinGapMonitorComponent minGapMonitorComponent = this.LL;
                minGapMonitorComponent.getClass();
                if (awemeLJIIIIZZ != null) {
                    C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new Runnable() { // from class: X.0qnF
                        public final void LIZ() {
                            String aid;
                            AwemeExtKt.putCustomPayload(awemeLJIIIIZZ, "min_gap_aweme_show", Boolean.TRUE);
                            C1564450qoV c1564450qoV = minGapMonitorComponent.LLIZLLLIL;
                            if (c1564450qoV != null) {
                                int i2 = i;
                                Aweme aweme = awemeLJIIIIZZ;
                                if (aweme != null && (aid = aweme.getAid()) != null) {
                                    Iterator<ResponseSectionMeta> it2 = c1564450qoV.LIZIZ.iterator();
                                    while (it2.hasNext()) {
                                        ResponseSectionMeta next = it2.next();
                                        if (next.LIZ > i2 || next.LIZIZ < i2) {
                                            if (next.LIZIZ < i2) {
                                                C20684815ws.LJFF().submit(new ARunnableS102S0100000_2(next, 75));
                                                it2.remove();
                                            }
                                        } else if (!next.items.contains(aid)) {
                                            next.items.add(aid);
                                        }
                                    }
                                }
                            }
                            C1567350qtB c1567350qtB = (C1567350qtB) AwemeExtKt.getCustomPayload(awemeLJIIIIZZ, "min_gap_tag");
                            if (c1567350qtB != null) {
                                MinGapMonitorComponent minGapMonitorComponent2 = minGapMonitorComponent;
                                Aweme aweme2 = awemeLJIIIIZZ;
                                int i3 = i;
                                C1563620qnA c1563620qnA = minGapMonitorComponent2.LLILZIL;
                                String aid2 = aweme2.getAid();
                                AwS77S0301000_24 awS77S0301000_24 = new AwS77S0301000_24(minGapMonitorComponent2, aweme2, i3, c1567350qtB, 0);
                                c1563620qnA.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (!Intrinsics.LJFF(aid2, c1563620qnA.LIZ) || jCurrentTimeMillis - c1563620qnA.LIZIZ >= 500) {
                                    awS77S0301000_24.invoke();
                                    c1563620qnA.LIZ = aid2;
                                    c1563620qnA.LIZIZ = jCurrentTimeMillis;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MinGapMonitorComponent@a4f6.postCheckOnPageSelected$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MinGapMonitorComponent@a4f6.postCheckOnPageSelected$1");
                        }
                    });
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        C1564450qoV c1564450qoV;
        C1567320qt8 c1567320qt8;
        super.onCreate();
        if (((Boolean) C284110BBp.LIZ.getValue()).booleanValue()) {
            this.LLIZ = new C1567320qt8();
            DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LL.getValue();
            if (dataLayerAbility != null && (c1567320qt8 = this.LLIZ) != null) {
                c1567320qt8.LIZ = new WeakReference<>(dataLayerAbility);
                dataLayerAbility.pV(c1567320qt8);
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(c1567320qt8.LJ.LIZLLL);
            }
        }
        if (((Boolean) C277830Auj.LIZ.getValue()).booleanValue()) {
            this.LLIZLLLIL = new C1564450qoV();
            DataLayerAbility dataLayerAbility2 = (DataLayerAbility) this.LL.getValue();
            if (dataLayerAbility2 == null || (c1564450qoV = this.LLIZLLLIL) == null) {
                return;
            }
            c1564450qoV.LIZ = new WeakReference<>(dataLayerAbility2);
            dataLayerAbility2.pV(c1564450qoV);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        DataLayerAbility dataLayerAbility;
        DataLayerAbility dataLayerAbility2;
        super.onDestroy();
        C1567320qt8 c1567320qt8 = this.LLIZ;
        if (c1567320qt8 != null) {
            WeakReference<DataLayerAbility> weakReference = c1567320qt8.LIZ;
            if (weakReference != null && (dataLayerAbility2 = weakReference.get()) != null) {
                dataLayerAbility2.oQ1(c1567320qt8);
            }
            c1567320qt8.LIZ = null;
            Iterator<Future<?>> it2 = c1567320qt8.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().cancel(false);
            }
            c1567320qt8.LJFF.clear();
            C1567330qt9 c1567330qt9 = c1567320qt8.LJ;
            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1567330qt9.LIZLLL);
            TTMStrategyCenterManager.deregisterSceneWithScene(c1567330qt9.LIZ);
            c1567330qt9.LIZ = null;
        }
        C1564450qoV c1564450qoV = this.LLIZLLLIL;
        if (c1564450qoV != null) {
            WeakReference<DataLayerAbility> weakReference2 = c1564450qoV.LIZ;
            if (weakReference2 != null && (dataLayerAbility = weakReference2.get()) != null) {
                dataLayerAbility.oQ1(c1564450qoV);
            }
            c1564450qoV.LIZ = null;
            c1564450qoV.LIZIZ.clear();
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLILZLL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C1601380rm4 c1601380rm4;
        C1564450qoV c1564450qoV;
        C1255920ims<?> c1255920imsKB1;
        C1601380rm4 c1601380rm42;
        C1567320qt8 c1567320qt8;
        C1255920ims<?> c1255920imsKB12;
        super.onParentViewCreated();
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LLILLJJLI.getValue();
        AbstractC1255880imo abstractC1255880imo = null;
        AbstractC1255880imo abstractC1255880imo2 = (iFeedFetchDataAbility == null || (c1255920imsKB12 = iFeedFetchDataAbility.KB1()) == null) ? null : (AbstractC1255880imo) c1255920imsKB12.LL;
        if ((abstractC1255880imo2 instanceof C1601380rm4) && (c1601380rm42 = (C1601380rm4) abstractC1255880imo2) != null && (c1567320qt8 = this.LLIZ) != null) {
            ((ArrayList) c1601380rm42.LLJILLL).add(c1567320qt8);
        }
        IFeedFetchDataAbility iFeedFetchDataAbility2 = (IFeedFetchDataAbility) this.LLILLJJLI.getValue();
        if (iFeedFetchDataAbility2 != null && (c1255920imsKB1 = iFeedFetchDataAbility2.KB1()) != null) {
            abstractC1255880imo = (AbstractC1255880imo) c1255920imsKB1.LL;
        }
        if ((abstractC1255880imo instanceof C1601380rm4) && (c1601380rm4 = (C1601380rm4) abstractC1255880imo) != null && (c1564450qoV = this.LLIZLLLIL) != null) {
            ((ArrayList) c1601380rm4.LLJILLL).add(c1564450qoV);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLILZLL);
        }
    }
}
