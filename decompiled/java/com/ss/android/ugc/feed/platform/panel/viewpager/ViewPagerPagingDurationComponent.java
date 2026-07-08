package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.AbstractC1511510pR7;
import X.C01GW;
import X.C0N33;
import X.C0RUJ;
import X.C1564720qow;
import X.C1564730qox;
import X.C1566140qrE;
import X.C1620830sHR;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1511740pRU;
import X.InterfaceC1565950qqv;
import X.RunnableC1564760qp0;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class ViewPagerPagingDurationComponent extends BasePanelUIComponent implements C0RUJ {
    public static final C01GW<AbstractC1511510pR7> LLJJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(420));
    public final BPEAHandler LLJIJIL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public VerticalViewPager LLJILLL;
    public C1620830sHR LLJJ;
    public final C630740Ooa LLJJI;
    public final C01GW LLJJIII;
    public RunnableC1564760qp0 LLJJIJI;
    public volatile int LLJJIJIIJIL;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "viewpager_paging_duration_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0qp0, java.lang.Runnable] */
    public final void Go() {
        final Aweme awemeLJIIIIZZ;
        final FeedPagingDurationConfig feedPagingDurationConfig = (FeedPagingDurationConfig) C1564730qox.LIZIZ.getValue();
        if (feedPagingDurationConfig.enable) {
            VerticalViewPager verticalViewPager = this.LLJILLL;
            if (verticalViewPager != null) {
                verticalViewPager.setPagingDownDurationOffset(0);
            }
            this.LLJJIJIIJIL = 0;
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJI.getValue();
            if (iViewPagerComponentAbility == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null) {
                return;
            }
            RunnableC1564760qp0 runnableC1564760qp0 = this.LLJJIJI;
            if (runnableC1564760qp0 != null) {
                this.LLJIJIL.removeCallbacks(runnableC1564760qp0);
                this.LLJJIJI = null;
            }
            int i = feedPagingDurationConfig.modelType;
            if (i == 1) {
                final C0N33 c0n33 = new C0N33();
                c0n33.LJIIJ = awemeLJIIIIZZ;
                AbstractC1511510pR7 value = LLJJIJIL.getValue();
                if (value != null) {
                    value.runAsyncDelay(0L, c0n33, new InterfaceC1511740pRU() { // from class: X.0qoz
                        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
                        @Override // X.InterfaceC1511740pRU
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ(X.C1512100pS4 r10) {
                            /*
                                r9 = this;
                                r2 = 0
                                if (r10 == 0) goto L89
                                boolean r1 = r10.LIZIZ()
                                r0 = 1
                                if (r1 != r0) goto L89
                                X.0N33 r0 = r1
                                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.LJIIJ
                                com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPagingDurationComponent r0 = r2
                                X.0Ooa r0 = r0.LLJJI
                                java.lang.Object r0 = r0.getValue()
                                com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility) r0
                                if (r0 == 0) goto L74
                                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIIIIZZ()
                            L1e:
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                                if (r0 == 0) goto L89
                                kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
                                r0 = 4
                                r1.<init>(r2, r0)
                                java.util.ArrayList r5 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r1, r0)
                                r5.<init>(r0)
                                X.0Kt9 r4 = r1.iterator()
                            L39:
                                boolean r0 = r4.LLILLL
                                if (r0 == 0) goto L76
                                int r3 = r4.nextInt()
                                java.util.Map<java.lang.String, java.lang.Float> r2 = r10.LIZJ
                                if (r2 == 0) goto L72
                                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                java.lang.String r0 = "task"
                                r1.append(r0)
                                r1.append(r3)
                                java.lang.String r0 = "_reg"
                                r1.append(r0)
                                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                java.lang.Object r0 = r2.get(r0)
                                java.lang.Float r0 = (java.lang.Float) r0
                                if (r0 == 0) goto L72
                                float r1 = r0.floatValue()
                            L66:
                                r0 = 1000(0x3e8, float:1.401E-42)
                                float r0 = (float) r0
                                float r1 = r1 * r0
                                java.lang.Float r0 = java.lang.Float.valueOf(r1)
                                r5.add(r0)
                                goto L39
                            L72:
                                r1 = 0
                                goto L66
                            L74:
                                r0 = 0
                                goto L1e
                            L76:
                                com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPagingDurationComponent r4 = r2
                                com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r4.LLJILLL
                                if (r0 == 0) goto L89
                                Y.ARunnableS32S0400000_24 r3 = new Y.ARunnableS32S0400000_24
                                com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig r6 = r3
                                X.0N33 r7 = r1
                                r8 = 4
                                r3.<init>(r4, r5, r6, r7, r8)
                                com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r0, r3)
                            L89:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1564750qoz.LIZ(X.0pS4):void");
                        }
                    });
                    return;
                }
                return;
            }
            if (i == 2) {
                final JSONObject jSONObjectPut = new JSONObject().put("aid", awemeLJIIIIZZ.getAid());
                if (AwemeSaaSExtKt.isLive(awemeLJIIIIZZ)) {
                    return;
                }
                ?? r3 = new Runnable() { // from class: X.0qp0
                    public int LL;

                    public final void LIZ() {
                        List<Float> list;
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
                        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "play_time_weibull", jSONObjectPut, "paging_duration", (ReturnCode) null, 8, (Object) null) : null;
                        if ((feature$default instanceof List) && (list = (List) feature$default) != null) {
                            this.Ho(list, feedPagingDurationConfig, awemeLJIIIIZZ);
                            this.LLJJIJI = null;
                            return;
                        }
                        int i2 = this.LL;
                        if (i2 < 4) {
                            int i3 = i2 + 1;
                            this.LL = i3;
                            C786410Ut5.LJLIIL((((long) i3) * 200) + 500, this.LLJIJIL, this);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ViewPagerPagingDurationComponent@f7ab.determineScrollAnimDurationOffset$3");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ViewPagerPagingDurationComponent@f7ab.determineScrollAnimDurationOffset$3");
                    }
                };
                this.LLJJIJI = r3;
                C786410Ut5.LJLIIL(500L, this.LLJIJIL, r3);
            }
        }
    }

    public ViewPagerPagingDurationComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1572), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 33));
        }
        this.LLJILJILJ = c01gwLIZIZ;
        this.LLJJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 1574));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1573));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        RunnableC1564760qp0 runnableC1564760qp0 = this.LLJJIJI;
        if (runnableC1564760qp0 != null) {
            this.LLJIJIL.removeCallbacks(runnableC1564760qp0);
            this.LLJJIJI = null;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLJJ);
        }
        VerticalViewPager verticalViewPager = this.LLJILLL;
        if (verticalViewPager != null) {
            verticalViewPager.LLJIJIL.LIZLLL((C1564720qow) this.LLJJIII.getValue());
        }
        this.LLJIJIL.removeCallbacksAndMessages(null);
        this.LLJJ = null;
        this.LLJILLL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        VerticalViewPager verticalViewPager = (VerticalViewPager) view.findViewById(R.id.viewpager);
        this.LLJILLL = verticalViewPager;
        if (verticalViewPager != null) {
            verticalViewPager.LLJIJIL.LIZIZ = true;
            verticalViewPager.LLJIJIL.LIZIZ((C1564720qow) this.LLJJIII.getValue());
        }
        this.LLJJ = new C1620830sHR(this, 11);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLJJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[PHI: r5
      0x0092: PHI (r5v4 int) = (r5v1 int), (r5v8 int) binds: [B:43:0x008f, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc A[PHI: r3 r5
      0x00bc: PHI (r3v5 int) = (r3v2 int), (r3v7 int) binds: [B:56:0x00b9, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r5v5 int) = (r5v4 int), (r5v7 int) binds: [B:56:0x00b9, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(java.util.List<java.lang.Float> r13, com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig r14, com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPagingDurationComponent.Ho(java.util.List, com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
