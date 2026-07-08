package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C092O;
import X.C0NH6;
import X.C0OCC;
import X.C0PEM;
import X.C0S4J;
import X.C1030680cva;
import X.C1479130oat;
import X.C1561550qjp;
import X.C1561560qjq;
import X.C1561570qjr;
import X.C1561580qjs;
import X.C1561590qjt;
import X.C1564410qoR;
import X.C1564420qoS;
import X.C1564430qoT;
import X.C1566140qrE;
import X.C1566200qrK;
import X.C1566210qrL;
import X.C1601970rn1;
import X.C1AF0;
import X.C1DS1;
import X.C20684815ws;
import X.C2113808Pw;
import X.C2189821An6;
import X.C23250099c;
import X.C299750Boz;
import X.C452501pT;
import X.C607110NrZ;
import X.C630740Ooa;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import X.InterfaceC607270Nrp;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS93S0200000_24;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class LoadMorePerfComponent extends BasePanelComponent implements ILoadMorePerfAbility, InterfaceC1554640qYg {
    public static final C0S4J LLJILLL = new C0S4J("ReachBottom");
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C1564410qoR LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public final ArrayList<InterfaceC607270Nrp> LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1604010572) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final Keva m341do() {
        return (Keva) this.LLILZLL.getValue();
    }

    public LoadMorePerfComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1546), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1561560qjq(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new C1561590qjt(this));
        this.LLILLL = C452501pT.LIZIZ(new C1561580qjs(this));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1547), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1561570qjr(false, this));
        }
        this.LLILZ = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1548), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C1561550qjp(false, this));
        }
        this.LLILZIL = c01gwLIZIZ3;
        this.LLILZLL = C452501pT.LIZIZ(new C1564420qoS());
        this.LLIZ = new C1564410qoR();
        this.LLJ = -1L;
        this.LLJIJIL = new ArrayList<>();
        this.LLJILJILJ = C452501pT.LIZIZ(new C1564430qoT(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJIJIL.clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C0OCC c0occ = new C0OCC() { // from class: X.0qoO
            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onHide() {
                if (this.LL.LLIZ.LIZ) {
                    JSONObject jSONObject = new JSONObject();
                    ReachBottomCacheAbility reachBottomCacheAbility = (ReachBottomCacheAbility) this.LL.LLILZ.getValue();
                    if (reachBottomCacheAbility != null && !reachBottomCacheAbility.iJ(jSONObject)) {
                        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS93S0200000_24(this.LL, jSONObject, 35));
                        return;
                    }
                    this.LL.fo(jSONObject);
                    C1564410qoR c1564410qoR = this.LL.LLIZ;
                    c1564410qoR.LIZ = false;
                    c1564410qoR.LIZIZ = -1L;
                    c1564410qoR.LIZJ = -1;
                }
            }

            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onShow() {
                if (this.LL.LLIZ.LIZ) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                LoadMorePerfComponent loadMorePerfComponent = this.LL;
                long j = loadMorePerfComponent.LLJ;
                loadMorePerfComponent.LLJI = j != -1 ? jCurrentTimeMillis - j : 0L;
                loadMorePerfComponent.LLJ = jCurrentTimeMillis;
                C1564410qoR c1564410qoR = loadMorePerfComponent.LLIZ;
                c1564410qoR.LIZ = true;
                c1564410qoR.LIZIZ = jCurrentTimeMillis;
                DataLayerAbility dataLayerAbility = (DataLayerAbility) loadMorePerfComponent.LLILZIL.getValue();
                c1564410qoR.LIZJ = dataLayerAbility != null ? dataLayerAbility.Q0() : -1;
                LoadMorePerfComponent loadMorePerfComponent2 = this.LL;
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) loadMorePerfComponent2.LLILLL.getValue();
                Aweme awemeLJIIIIZZ = iViewPagerComponentAbility != null ? iViewPagerComponentAbility.LJIIIIZZ() : null;
                IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) loadMorePerfComponent2.LLILLL.getValue();
                int iLJIL = iViewPagerAbility != null ? iViewPagerAbility.LJIL() : 0;
                JSONObject jSONObject = new JSONObject();
                ReachBottomCacheAbility reachBottomCacheAbility = (ReachBottomCacheAbility) loadMorePerfComponent2.LLILZ.getValue();
                if (reachBottomCacheAbility != null) {
                    reachBottomCacheAbility.g10(jSONObject);
                }
                C0NH6.LJIILLIIL.LIZIZ(AFwS213S0000000_24.get$arr$(613));
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(loadMorePerfComponent2);
                C1DFB c1dfb = C0PEM.LIZJ;
                C23250099c.LIZLLL(lifecycleScope, c1dfb, null, new C495001wK(loadMorePerfComponent2, awemeLJIIIIZZ, iLJIL, jSONObject, null), 2);
                if (C1DS1.LIZJ) {
                    loadMorePerfComponent2.LLJILJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(loadMorePerfComponent2), c1dfb, null, new C804870Vhl(loadMorePerfComponent2, null), 2);
                }
                Iterator<InterfaceC607270Nrp> it2 = loadMorePerfComponent2.LLJIJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                C786410Ut5.LJLIIL(3000L, C2113808Pw.LIZIZ.LL, (ARunnableS124S0100000_24) this.LL.LLJILJILJ.getValue());
            }
        };
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLILLJJLI.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.p41(c0occ);
        }
        if (m341do().contains("reach_bottom_duration")) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1566200qrK(this, null), 2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMorePerfAbility
    public final void CS1(C607110NrZ c607110NrZ) {
        this.LLJIJIL.add(c607110NrZ);
    }

    public final void fo(JSONObject jSONObject) {
        AnonymousClass0956 anonymousClass0956;
        C2113808Pw.LIZIZ.LL.removeCallbacks((ARunnableS124S0100000_24) this.LLJILJILJ.getValue());
        m341do().clear();
        C0NH6.LJIILLIIL.LIZIZ(AFwS213S0000000_24.get$arr$(416));
        bo(jSONObject, new C092O() { // from class: X.0qoQ
            @Override // X.C092O
            public final void accept(Object obj) {
                C20684815ws.LJIJ("prf_feed_loading_time", (JSONObject) obj);
            }
        });
        if (C1DS1.LIZJ && (anonymousClass0956 = this.LLJILJIL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void bo(JSONObject jSONObject, C092O<JSONObject> c092o) {
        int iLJIL;
        String eventType;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ.LIZIZ;
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLILLL.getValue();
        if (iViewPagerAbility != null) {
            iLJIL = iViewPagerAbility.LJIL();
        } else {
            iLJIL = 0;
        }
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1566210qrL(jSONObject, eventType, this, c092o, jCurrentTimeMillis, iLJIL, null), 2);
    }

    public final void ho(Aweme aweme, int i, JSONObject jSONObject) throws JSONException {
        String aid;
        Integer numValueOf;
        String eventType;
        String string;
        String str;
        Pair pair;
        String string2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            aid = null;
            numValueOf = null;
        }
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        if (iNetworkStateService == null || (string = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()).toString()) == null) {
            string = "";
        }
        jSONObject.putOpt("enter_from", eventType);
        jSONObject.putOpt("from_group_id", aid);
        if (numValueOf != null) {
            string2 = numValueOf.toString();
        }
        jSONObject.putOpt("from_group_id_type", string2);
        if (C1030680cva.LJIJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.putOpt("has_splash", str);
        jSONObject.putOpt("internet_speed", String.valueOf(C1479130oat.LJII()));
        jSONObject.putOpt("access_type", C786410Ut5.b3(getContext()));
        jSONObject.putOpt("network_status", string);
        jSONObject.putOpt("current_index", Integer.valueOf(i));
        C1601970rn1.LIZ.getClass();
        try {
            pair = new Pair("", "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "loadmore_monitor");
            pair = new Pair("", "");
        }
        jSONObject.putOpt("recent_video_playtime", pair.getFirst());
        jSONObject.putOpt("recent_video_type", pair.getSecond());
        if (Intrinsics.LJFF(eventType, "homepage_hot")) {
            int i2 = this.LLIZLLLIL + 1;
            this.LLIZLLLIL = i2;
            jSONObject.putOpt("prf_cnt", Integer.valueOf(i2));
            jSONObject.putOpt("duration_from_last", Long.valueOf(this.LLJI));
        }
        C1601970rn1.LIZ.getClass();
        C1601970rn1.LIZ(jSONObject);
        C20684815ws.LJIJ("prf_feed_loading", jSONObject);
    }
}
