package com.ss.android.ugc.aweme.feed.component;

import X.C01GW;
import X.C0NFT;
import X.C0NH6;
import X.C0RD6;
import X.C0S4J;
import X.C1150504el;
import X.C1255920ims;
import X.C1566140qrE;
import X.C1601390rm5;
import X.C299750Boz;
import X.C452501pT;
import X.C459880I1q;
import X.C480920ItW;
import X.C591300NHc;
import X.C606910NrF;
import X.C607100NrY;
import X.C607130Nrb;
import X.C607140Nrc;
import X.C607160Nre;
import X.C607170Nrf;
import X.C607180Nrg;
import X.C607190Nrh;
import X.C607200Nri;
import X.C607240Nrm;
import X.C607250Nrn;
import X.C607300Nrs;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import X.InterfaceC607270Nrp;
import Y.AObserverS213S0100000_9;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.component.ReachBottomCacheComponent;
import com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMorePerfAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS94S1000000_9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ReachBottomCacheComponent extends BasePanelComponent implements ReachBottomCacheAbility, InterfaceC1554640qYg {
    public static final C0S4J LLJJ = LoadMorePerfComponent.LLJILLL;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C630740Ooa LLILZLL;
    public final C01GW LLIZ;
    public C607130Nrb LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public AObserverS213S0100000_9 LLJIJIL;
    public boolean LLJILJIL;
    public final C607100NrY LLJILJILJ;
    public final C607140Nrc LLJILLL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -128955267) {
            return null;
        }
        return this;
    }

    public final IViewPagerComponentAbility Mb() {
        return (IViewPagerComponentAbility) this.LLILZLL.getValue();
    }

    public final void ho() {
        if (this.LLIZLLLIL != null) {
            return;
        }
        LLJJ.LIZIZ(AFwS195S0000000_9.get$arr$(112));
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        int iLJIL = iViewPagerComponentAbilityMb != null ? iViewPagerComponentAbilityMb.LJIL() : -1;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
        if (iViewPagerComponentAbilityMb2 != null) {
            iViewPagerComponentAbilityMb2.LJIIIIZZ();
        }
        this.LLIZLLLIL = new C607130Nrb(iLJIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility
    public final boolean r32() {
        C607130Nrb c607130Nrb = this.LLIZLLLIL;
        if (c607130Nrb != null) {
            return c607130Nrb.LIZLLL;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0NrY] */
    public ReachBottomCacheComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        C01GW c01gwLIZIZ4;
        C01GW c01gwLIZIZ5;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 148), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C607180Nrg(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new C607300Nrs(this));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 149), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C607190Nrh(false, this));
        }
        this.LLILLL = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 150), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C607200Nri(false, this));
        }
        this.LLILZ = c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa4 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 146), null);
            C1566140qrE.LIZJ(this, c630740Ooa4);
            c01gwLIZIZ4 = c630740Ooa4;
        } else {
            c01gwLIZIZ4 = C452501pT.LIZIZ(new C607160Nre(false, this));
        }
        this.LLILZIL = c01gwLIZIZ4;
        this.LLILZLL = C628500Oky.LIZ(new C607240Nrm(this));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa5 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 147), null);
            C1566140qrE.LIZJ(this, c630740Ooa5);
            c01gwLIZIZ5 = c630740Ooa5;
        } else {
            c01gwLIZIZ5 = C452501pT.LIZIZ(new C607170Nrf(false, this));
        }
        this.LLIZ = c01gwLIZIZ5;
        this.LLJI = true;
        this.LLJILJILJ = new InterfaceC1616070s9l() { // from class: X.0NrY
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

            /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPageSelected(int r12) {
                /*
                    Method dump skipped, instruction units count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C607100NrY.onPageSelected(int):void");
            }
        };
        this.LLJILLL = new C607140Nrc(this);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m195do() {
        PagerAdapter pagerAdapterLJJLIIIJL;
        int count;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb == null) {
            return false;
        }
        int iLJIL = iViewPagerComponentAbilityMb.LJIL();
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
        return (iViewPagerComponentAbilityMb2 == null || (pagerAdapterLJJLIIIJL = iViewPagerComponentAbilityMb2.LJJLIIIJL()) == null || (count = pagerAdapterLJJLIIIJL.getCount()) == 0 || iLJIL < count - 1) ? false : true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Xl0(this.LLJILJILJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0NrZ] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C1601390rm5 c1601390rm5;
        C607140Nrc c607140Nrc;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Bv0(this.LLJILJILJ);
        }
        ILoadMorePerfAbility iLoadMorePerfAbility = (ILoadMorePerfAbility) this.LLILZ.getValue();
        if (iLoadMorePerfAbility != 0) {
            iLoadMorePerfAbility.CS1(new InterfaceC607270Nrp() { // from class: X.0NrZ
                @Override // X.InterfaceC607270Nrp
                public final void LIZ() {
                    ReachBottomCacheComponent reachBottomCacheComponent = this.LIZ;
                    if (reachBottomCacheComponent.m195do()) {
                        ReachBottomCacheComponent.LLJJ.LIZIZ(AFwS195S0000000_9.get$arr$(553));
                        reachBottomCacheComponent.ho();
                        C607130Nrb c607130Nrb = reachBottomCacheComponent.LLIZLLLIL;
                        if (c607130Nrb != null && !c607130Nrb.LIZLLL) {
                            c607130Nrb.LIZLLL = true;
                            IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = reachBottomCacheComponent.Mb();
                            if (iViewPagerComponentAbilityMb2 != null) {
                                iViewPagerComponentAbilityMb2.LJIL();
                            }
                            IViewPagerComponentAbility iViewPagerComponentAbilityMb3 = reachBottomCacheComponent.Mb();
                            if (iViewPagerComponentAbilityMb3 != null) {
                                iViewPagerComponentAbilityMb3.LJIIIIZZ();
                            }
                            c607130Nrb.LJ = new C607250Nrn(reachBottomCacheComponent.LLJILLL.LIZIZ);
                        }
                        if (((Number) C269940Ai0.LIZ.getValue()).intValue() <= 0 || reachBottomCacheComponent.LLJ) {
                            return;
                        }
                        reachBottomCacheComponent.LLJ = true;
                        C0NFT.LIZIZ(new C606910NrF(reachBottomCacheComponent, "reach_bottom", true), null);
                    }
                }
            });
        }
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LLIZ.getValue();
        C1255920ims<?> c1255920imsKB1 = iFeedFetchDataAbility != null ? iFeedFetchDataAbility.KB1() : null;
        if (!(c1255920imsKB1 instanceof C1601390rm5) || (c1601390rm5 = (C1601390rm5) c1255920imsKB1) == null || (c607140Nrc = this.LLJILLL) == null || ((ArrayList) c1601390rm5.LLJJI).contains(c607140Nrc)) {
            return;
        }
        ((ArrayList) c1601390rm5.LLJJI).add(c607140Nrc);
    }

    public final void bo(String str) {
        if (!C459880I1q.LIZ(this) || !m195do()) {
            return;
        }
        LLJJ.LIZIZ(new AwS94S1000000_9(str, 1));
        ho();
        if (!this.LLJ) {
            this.LLJ = true;
            C0NFT.LIZIZ(new C606910NrF(this, str, false), null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        AObserverS213S0100000_9 aObserverS213S0100000_9 = new AObserverS213S0100000_9(this, 3);
        c0rd6.LIZ("event_on_render_first_frame", aObserverS213S0100000_9);
        this.LLJIJIL = aObserverS213S0100000_9;
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility
    public final void g10(JSONObject jSONObject) throws JSONException {
        jSONObject.put("start_duration", System.currentTimeMillis() - C1150504el.LIZ().LJJII);
        jSONObject.put("latest_request_status", this.LLJILLL.LIZ);
        jSONObject.put("is_boot", !this.LLJILLL.LIZIZ ? 1 : 0);
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        jSONObject.put("is_golden_house_init", C591300NHc.LIZ().LJIIJ().ordinal());
        C607130Nrb c607130Nrb = this.LLIZLLLIL;
        if (c607130Nrb == null) {
            return;
        }
        if (c607130Nrb.LIZIZ > 0) {
            jSONObject.put("golden_house_video_duration", (System.currentTimeMillis() - c607130Nrb.LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        jSONObject.put("golden_house_insert_count", c607130Nrb.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility
    public final boolean iJ(JSONObject jSONObject) throws JSONException {
        C607250Nrn c607250Nrn;
        C607130Nrb c607130Nrb = this.LLIZLLLIL;
        if (c607130Nrb == null || (c607250Nrn = c607130Nrb.LJ) == null) {
            return false;
        }
        jSONObject.put("is_boot", !c607250Nrn.LIZJ ? 1 : 0);
        if (c607130Nrb.LIZLLL) {
            return false;
        }
        jSONObject.put("exit_method", c607250Nrn.LIZ);
        jSONObject.put("added_video_cnt", c607250Nrn.LIZIZ);
        return true;
    }

    public final void fo(int i, String str) {
        C607130Nrb c607130Nrb = this.LLIZLLLIL;
        if (c607130Nrb == null || !c607130Nrb.LIZLLL) {
            return;
        }
        LLJJ.LIZIZ(new C480920ItW(str, i));
        c607130Nrb.LIZLLL = false;
        C607250Nrn c607250Nrn = c607130Nrb.LJ;
        if (c607250Nrn != null) {
            c607250Nrn.LIZ = str;
            c607250Nrn.LIZIZ = i;
        }
    }
}
