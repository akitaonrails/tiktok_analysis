package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.AbstractC1581540rG4;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09JN;
import X.C09R3;
import X.C0DMM;
import X.C0QSJ;
import X.C0RRR;
import X.C0S4T;
import X.C0S4U;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11IR;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1264160j0A;
import X.C1386470mBR;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14LC;
import X.C1564710qov;
import X.C1576960r8g;
import X.C1577250r99;
import X.C1577260r9A;
import X.C1577540r9c;
import X.C1577550r9d;
import X.C1577610r9j;
import X.C1578630rBN;
import X.C1578690rBT;
import X.C1578940rBs;
import X.C1581940rGi;
import X.C1606650ruZ;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2421209eE;
import X.C296910BkP;
import X.C418440Gaw;
import X.C446900Hfk;
import X.C452501pT;
import X.C497820Jfg;
import X.C616540OGe;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C718550SGn;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC1573550r3B;
import X.EnumC1576680r8E;
import X.EnumC1609900rzo;
import X.EnumC995350c0b;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1158780gGC;
import X.InterfaceC1572860r24;
import X.InterfaceC1577520r9a;
import X.InterfaceC1577580r9g;
import X.InterfaceC1577600r9i;
import X.InterfaceC1577740r9w;
import X.InterfaceC1577950rAH;
import X.InterfaceC1578680rBS;
import X.InterfaceC1583870rJp;
import X.InterfaceC1591870rWj;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import Y.AObserverS226S0100000_24;
import Y.ARunnableS124S0100000_24;
import Y.AfS188S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope;
import com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.api.MiniDramaReportRequest;
import com.ss.android.ugc.aweme.series.feed.api.SeriesListApi;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaTopTabMainFragment extends FeedFragment implements InterfaceC1055110dYz, InterfaceC1591870rWj, InterfaceC1577600r9i, InterfaceC724530SbT, InterfaceC1577950rAH, InterfaceC469360Ias, InterfaceC1578680rBS, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2sqLCHELIOSo3ZjEtK2ElemsIOy4+KREjORsyKggtICEVOiQrJCo9PA==";
    public String LLJI;
    public C11JF LLJILJILJ;
    public volatile HomeViewPagerAbility LLJILLL;
    public volatile InterfaceC1577580r9g LLJJ;
    public InterfaceC1577950rAH LLJJI;
    public InterfaceC1577740r9w LLJJIII;
    public InterfaceC1577580r9g LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;
    public C0QSJ LLJJJ;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1004));
    public final C1578690rBT LLIZ = VR();
    public final DramaTopTabMainFragment LLIZLLLIL = this;
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1005));
    public final BPEAHandler LLJIJIL = new BPEAHandler(Looper.getMainLooper());
    public final C1577540r9c LLJILJIL = new C1577540r9c();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DramaTopTabMainFragment.class, "homeViewPagerAbilityByDI", "getHomeViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DramaTopTabMainFragment.class, "picksAbility", "getPicksAbility()Lcom/ss/android/ugc/aweme/series/feed/tab/v2/IDramaPicksAbility;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1577950rAH.class) {
            this.LLJJI = (InterfaceC1577950rAH) obj;
        } else if (cls == InterfaceC1577740r9w.class) {
            this.LLJJIII = (InterfaceC1577740r9w) obj;
        } else if (cls == InterfaceC1577580r9g.class) {
            this.LLJJIJI = (InterfaceC1577580r9g) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class, DramaTopTabMainFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1577950rAH.class) {
            return this.LLJJI;
        }
        if (cls == InterfaceC1577740r9w.class) {
            return this.LLJJIII;
        }
        if (cls == InterfaceC1577580r9g.class) {
            return this.LLJJIJI;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1578680rBS
    public final InterfaceC1577950rAH n9() {
        return this;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1577950rAH.class) {
            this.LLJJI = null;
        } else if (cls == InterfaceC1577740r9w.class) {
            this.LLJJIII = null;
        } else if (cls == InterfaceC1577580r9g.class) {
            this.LLJJIJI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "SeriesFeedFragment";
    }

    @Override // X.InterfaceC1577950rAH
    public final boolean xf() {
        return false;
    }

    @Override // X.InterfaceC1577950rAH
    public final void JB() {
        C1440005kM.LIZ(new C1581940rGi("HOME"));
    }

    @Override // X.InterfaceC1578680rBS
    public final float JO() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)) + (getContext() != null ? C497820Jfg.LIZJ(r0) : 0);
    }

    @Override // X.InterfaceC1578680rBS
    public final DramaPicksFragment Li() {
        C1577610r9j c1577610r9j = DramaPicksFragment.LLJJIJI;
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 45);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_series", bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Series");
        c1577610r9j.getClass();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        DramaPicksFragment dramaPicksFragment = new DramaPicksFragment();
        dramaPicksFragment.setArguments(bundle2);
        dramaPicksFragment.LLILZ = this;
        return dramaPicksFragment;
    }

    @Override // X.InterfaceC1577950rAH
    public final void Uw() {
        C1577540r9c c1577540r9c = this.LLJILJIL;
        InterfaceC1577580r9g interfaceC1577580r9g = this.LLJJ;
        if (interfaceC1577580r9g == null) {
            synchronized (this) {
                interfaceC1577580r9g = this.LLJJ;
                if (interfaceC1577580r9g == null) {
                    C0QSJ c0qsjLIZLLL = this.LLJJJ;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                            this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{DramaTopTabMainFragmentScope.class});
                        this.LLJJJ = c0qsjLIZLLL;
                        if (c0qsjLIZLLL == null) {
                            interfaceC1577580r9g = null;
                        }
                        this.LLJJ = interfaceC1577580r9g;
                    }
                    interfaceC1577580r9g = (InterfaceC1577580r9g) c0qsjLIZLLL.getAbility(InterfaceC1577580r9g.class);
                    this.LLJJ = interfaceC1577580r9g;
                }
            }
        }
        c1577540r9c.LL = interfaceC1577580r9g;
        C1577550r9d c1577550r9d = c1577540r9c.LLILLJJLI;
        if (c1577550r9d.LIZIZ) {
            return;
        }
        c1577550r9d.LIZIZ = true;
        List listLLIIII = C13LP.LLIIII(c1577550r9d.LIZ);
        ((ArrayList) c1577550r9d.LIZ).clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }

    public final C1578690rBT VR() {
        return (C1578690rBT) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1578680rBS
    public final InterfaceC1158780gGC m4() {
        return new InterfaceC1158780gGC() { // from class: X.0r8C
            /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x001e, B:7:0x0024, B:10:0x002c, B:12:0x0032, B:16:0x003b, B:17:0x003e, B:19:0x0049, B:21:0x004d, B:23:0x0051, B:28:0x005c, B:31:0x0073, B:33:0x008b, B:32:0x007e), top: B:84:0x001e }] */
            @Override // X.InterfaceC1158780gGC
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ() throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 367
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1576660r8C.LIZ():java.lang.Object");
            }
        };
    }

    @Override // X.InterfaceC1577950rAH
    public final String mr() {
        String str = this.LLJI;
        this.LLJI = null;
        return str;
    }

    @Override // X.InterfaceC1577950rAH
    public final void KH() {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null) {
            return;
        }
        interfaceC1577520r9aLIZIZ.LJIIL(false);
    }

    @Override // X.InterfaceC1577950rAH
    public final String d9() {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        Pair<String, String> pairLJIIJJI;
        String first;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null && (pairLJIIJJI = interfaceC1577520r9aLIZIZ.LJIIJJI()) != null && (first = pairLJIIJJI.getFirst()) != null && first.length() != 0) {
            return first;
        }
        C1577250r99.LIZ.getClass();
        return C1577250r99.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VR().LJIJI();
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJ.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.b3(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VR().getClass();
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILIIL();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.ON_PAGE_HIDE, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(DramaTopTabMainFragment.class.getName());
        }
        super.onResume();
        VR().LJIJJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        VR().getClass();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        VR().getClass();
    }

    @Override // X.InterfaceC1577950rAH
    public final void q9() {
        C19EG activity = getActivity();
        if (activity != null) {
            Hox.LLJILJIL.LIZ(activity).TQ2(new Bundle(), "For You", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1577950rAH
    public final void yw() {
        if (C296910BkP.LIZ()) {
            C1606650ruZ c1606650ruZ = C1606650ruZ.LIZIZ;
            final String str = "short_drama_library_categories";
            final String str2 = "aweme://roma_redirect/?spark_page=short_drama_library_categories";
            final String str3 = "short_drama_library_ranking";
            final String str4 = "aweme://roma_redirect/?spark_page=short_drama_library_ranking";
            final String str5 = "short_drama_library_latest";
            final String str6 = "aweme://roma_redirect/?spark_page=short_drama_library_latest";
            final String str7 = "short_drama_library_home";
            final String str8 = "aweme://roma_redirect/?spark_page=short_drama_library_home";
            c1606650ruZ.LIZLLL(C1697810uHb.LJIIJJI(new AbstractC1581540rG4(str, str2) { // from class: X.0rG5
                public final String LJFF;
                public final String LJI;

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ(this.LJFF);
                }

                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return this.LJI;
                }

                {
                    this.LJFF = str;
                    this.LJI = str2;
                }
            }, new AbstractC1581540rG4(str3, str4) { // from class: X.0rG5
                public final String LJFF;
                public final String LJI;

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ(this.LJFF);
                }

                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return this.LJI;
                }

                {
                    this.LJFF = str3;
                    this.LJI = str4;
                }
            }, new AbstractC1581540rG4(str5, str6) { // from class: X.0rG5
                public final String LJFF;
                public final String LJI;

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ(this.LJFF);
                }

                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return this.LJI;
                }

                {
                    this.LJFF = str5;
                    this.LJI = str6;
                }
            }, new AbstractC1581540rG4(str7, str8) { // from class: X.0rG5
                public final String LJFF;
                public final String LJI;

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ(this.LJFF);
                }

                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return this.LJI;
                }

                {
                    this.LJFF = str7;
                    this.LJI = str8;
                }
            }));
            c1606650ruZ.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    @Override // X.InterfaceC1577950rAH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zA() {
        /*
            r4 = this;
            int r0 = X.C789370Uxr.LIZ()
            r3 = 2
            r0 = r0 & 2
            r2 = 1
            if (r0 == 0) goto L8b
            X.0r9f r0 = X.C1577570r9f.LIZ
            r0.getClass()
            X.01GW r1 = X.C1577570r9f.LIZJ
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.minidrama.ab.DramaNewTabLandingConfigModel r0 = (com.ss.android.ugc.aweme.minidrama.ab.DramaNewTabLandingConfigModel) r0
            if (r0 == 0) goto L75
            int r0 = r0.landingPageType
            if (r0 != r2) goto L75
        L1d:
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.minidrama.ab.DramaNewTabLandingConfigModel r0 = (com.ss.android.ugc.aweme.minidrama.ab.DramaNewTabLandingConfigModel) r0
            if (r0 == 0) goto L6c
            int r0 = r0.landingPageType
            if (r0 != r2) goto L6a
            r0 = 1
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L6c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L69
        L36:
            java.lang.String r1 = r4.d9()
            java.lang.String r0 = "task_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L69
            X.0r99 r0 = X.C1577250r99.LIZ
            r0.getClass()
            java.lang.String r1 = X.C1577250r99.LIZJ
            java.lang.String r0 = "fyf_special_shape_card"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L69
            com.ss.android.ugc.aweme.series.feed.ISeriesFeedService r0 = X.C0RRR.LIZIZ()
            if (r0 == 0) goto L94
            X.0r9a r0 = r0.LIZIZ()
            if (r0 == 0) goto L94
            java.lang.Boolean r1 = r0.LJIIIIZZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L94
        L69:
            return r2
        L6a:
            r0 = 0
            goto L2a
        L6c:
            int r0 = X.C789370Uxr.LIZ()
            r0 = r0 & 1
            if (r0 == 0) goto L69
            goto L36
        L75:
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.minidrama.ab.DramaNewTabLandingConfigModel r0 = (com.ss.android.ugc.aweme.minidrama.ab.DramaNewTabLandingConfigModel) r0
            if (r0 == 0) goto L82
            int r0 = r0.landingPageType
            if (r0 != r3) goto L82
            goto L1d
        L82:
            int r0 = X.C789370Uxr.LIZ()
            r0 = r0 & 1
            if (r0 == 0) goto L69
            goto L36
        L8b:
            int r0 = X.C789370Uxr.LIZ()
            r0 = r0 & 1
            if (r0 == 0) goto L69
            goto L36
        L94:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.v2.DramaTopTabMainFragment.zA():boolean");
    }

    @Override // X.InterfaceC1577950rAH
    public final InterfaceC1572860r24 Iu() {
        return C1577250r99.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
        UR();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        C786410Ut5.LJJZZIII(this.LLJIJIL, new ARunnableS124S0100000_24(this, 67));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void PR(long j) throws JSONException {
        C11NZ<BaseResponse> c11nzReport;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        String strLJIILJJIL;
        String strLJIILJJIL2;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ2;
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJLIIIJ = String.valueOf(j);
        c1386470mBR.LJJIJL(this.LLILLJJLI);
        Map<String, Object> map = c1386470mBR.LJIILJJIL;
        String str = "";
        if (map != null) {
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ2 = iSeriesFeedServiceLIZIZ.LIZIZ()) == null || (strLJIILJJIL2 = interfaceC1577520r9aLIZIZ2.LJIILJJIL()) == null) {
                strLJIILJJIL2 = "";
            }
            ((HashMap) map).put("series_tab_location", strLJIILJJIL2);
        }
        Map<String, Object> map2 = c1386470mBR.LJIILJJIL;
        if (map2 != null) {
            C1577250r99.LIZ.getClass();
            ((HashMap) map2).put("previous_page", C1577250r99.LIZIZ);
        }
        c1386470mBR.LJIILJJIL();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", this.LLILLJJLI);
        jSONObject.put("duration", j);
        C1577250r99.LIZ.getClass();
        jSONObject.put("previous_page", C1577250r99.LIZIZ);
        ISeriesFeedService iSeriesFeedServiceLIZIZ2 = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ2 != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ2.LIZIZ()) != null && (strLJIILJJIL = interfaceC1577520r9aLIZIZ.LJIILJJIL()) != null) {
            str = strLJIILJJIL;
        }
        jSONObject.put("series_tab_location", str);
        jSONObject.put("series_session_id", C1577260r9A.LIZIZ);
        jSONObject.put("current_page", this.LLILLJJLI);
        jSONObject.put("previous_position", C1577250r99.LIZJ);
        jSONObject.put("source_series_card_id", C1577250r99.LIZLLL);
        C20684815ws.LJIJ("homepage_series_stay_time", jSONObject);
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j2 >= 6) {
            MiniDramaReportRequest miniDramaReportRequest = new MiniDramaReportRequest(Integer.valueOf(EnumC995350c0b.MINI_DRAMA_REPORT_EVENT_TYPE_DRAMA_TAB_VALID_STAY.getValue()), null, Integer.valueOf((int) j2));
            SeriesListApi.GetSeriesCenterListApi getSeriesCenterListApiLIZIZ = C1576960r8g.LIZIZ();
            if (getSeriesCenterListApiLIZIZ == null || (c11nzReport = getSeriesCenterListApiLIZIZ.report(miniDramaReportRequest)) == null) {
                c11nzReport = C11IR.LL;
            }
            c11nzReport.LJL(C11S5.LIZ()).LJJLJ();
        }
    }

    @Override // X.InterfaceC1578680rBS
    public final void SE(boolean z) {
        boolean z2;
        EnumC1571190qzN enumC1571190qzN;
        MainActivityScope mainActivityScopeLIZJ;
        TopTabAbility topTabAbilityLIZ;
        ITabTransformer iTabTransformerAy2;
        MainActivityScope mainActivityScopeLIZJ2;
        TopTabAbility topTabAbilityLIZ2;
        Context context = getContext();
        if (context != null && !C960203pA.LIZIZ(context)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && z2) {
            enumC1571190qzN = EnumC1571190qzN.LIGHT;
        } else {
            enumC1571190qzN = EnumC1571190qzN.DARK;
        }
        C19EG activity = getActivity();
        if (activity != null && (mainActivityScopeLIZJ2 = C0S4U.LIZJ(activity)) != null && (topTabAbilityLIZ2 = C0S4T.LIZ(mainActivityScopeLIZJ2)) != null) {
            topTabAbilityLIZ2.Tr0("Drama", enumC1571190qzN, enumC1571190qzN);
        }
        C19EG activity2 = getActivity();
        if (activity2 != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity2)) != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZJ)) != null && (iTabTransformerAy2 = topTabAbilityLIZ.ay2()) != null) {
            iTabTransformerAy2.bA2();
        }
    }

    @Override // X.InterfaceC1577950rAH
    public final void T6(AwS603S0100000_24 awS603S0100000_24) {
        C11JF c11jf;
        C11JF c11jf2 = this.LLJILJILJ;
        if ((c11jf2 == null || !c11jf2.isDisposed()) && (c11jf = this.LLJILJILJ) != null) {
            c11jf.dispose();
        }
        this.LLJILJILJ = (C11JF) C11NZ.LJJJJI(new Callable() { // from class: X.0r9b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("DramaTopTabMainFragment@108d.updateSkylight$1");
                SkylightBlocks skylightBlocksLIZIZ = SeriesFeedRepository.LIZ.LIZIZ(true, C296910BkP.LIZ());
                if (skylightBlocksLIZIZ == null) {
                    skylightBlocksLIZIZ = new SkylightBlocks(null);
                }
                C1C7U.LIZIZ("DramaTopTabMainFragment@108d.updateSkylight$1");
                return skylightBlocksLIZIZ;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(awS603S0100000_24, 51), new C09JN() { // from class: X.00Op
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("DramaTopTabMainFragment@108d.updateSkylight$3");
                C1C7U.LIZIZ("DramaTopTabMainFragment@108d.updateSkylight$3");
            }
        });
    }

    @Override // X.InterfaceC1577950rAH
    public final void Xm(String str) {
        this.LLJI = str;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DramaTopTabMainFragmentScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL, InterfaceC1577950rAH.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZ, InterfaceC1577740r9w.class);
    }

    @Override // X.InterfaceC1578680rBS
    public final boolean dH(Context context) {
        if (context == null || C960203pA.LIZIZ(context)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) throws org.json.JSONException {
        /*
            r11 = this;
            X.C687700QyG.LJI(r11)
            super.onCreate(r12)
            r11.VR()
            X.C1578690rBT.LJIJ(r12)
            X.0r3B r0 = X.EnumC1573550r3B.TOP_TAB
            com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor.LIZIZ(r0)
            com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor$PagePerformanceEvent r3 = com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor.LIZJ(r0)
            long r4 = r3.onClickEnter
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto Lab
            com.ss.android.ugc.aweme.series.feed.ISeriesFeedService r0 = X.C0RRR.LIZIZ()
            r6 = 0
            if (r0 == 0) goto Lb4
            X.0r9a r0 = r0.LIZIZ()
            if (r0 == 0) goto Lb4
            kotlin.Pair r5 = r0.LJIIJJI()
        L2e:
            com.ss.android.ugc.aweme.series.feed.ISeriesFeedService r0 = X.C0RRR.LIZIZ()
            if (r0 == 0) goto L3e
            X.0r9a r0 = r0.LIZIZ()
            if (r0 == 0) goto L3e
            kotlin.Pair r6 = r0.LIZLLL()
        L3e:
            java.lang.String r2 = ""
            if (r5 == 0) goto L4a
            java.lang.Object r1 = r5.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L4b
        L4a:
            r1 = r2
        L4b:
            com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor$PagePerformanceEvent r4 = com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 != 0) goto L55
            r3.enterFrom = r1
        L55:
            if (r5 == 0) goto L5f
            java.lang.Object r1 = r5.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L60
        L5f:
            r1 = r2
        L60:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 != 0) goto L68
            r3.enterMethod = r1
        L68:
            if (r6 == 0) goto Lb2
            java.lang.Object r0 = r6.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto Lb2
        L77:
            r3.LJIILJJIL(r0)
            if (r6 == 0) goto L84
            java.lang.Object r1 = r6.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L85
        L84:
            r1 = r2
        L85:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 != 0) goto L8d
            r3.forceInsertId = r1
        L8d:
            java.lang.Class<com.ss.android.ugc.aweme.api.IDramaLandingTabApi> r5 = com.ss.android.ugc.aweme.api.IDramaLandingTabApi.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.api.IDramaLandingTabApi r0 = (com.ss.android.ugc.aweme.api.IDramaLandingTabApi) r0
            if (r0 == 0) goto La0
            r0.LIZIZ()
        La0:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 != 0) goto La8
            r3.landingTab = r2
        La8:
            com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(r3)
        Lab:
            r3.LJIIL()
            X.C622680Oba.LIZJ(r11)
            return
        Lb2:
            r0 = 0
            goto L77
        Lb4:
            r5 = r6
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.v2.DramaTopTabMainFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFeedRefreshEvent(X.C1564680qos r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L2a
            int r0 = r4.LIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L2a
            int r0 = r2.intValue()
            if (r0 != 0) goto L15
            java.lang.String r0 = "slide_down"
        L12:
            r3.LLJI = r0
            return
        L15:
            int r1 = r2.intValue()
            r0 = 15
            if (r1 != r0) goto L20
            java.lang.String r0 = "click_top_icon"
            goto L12
        L20:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L2a
            java.lang.String r0 = "click_bottom_icon"
            goto L12
        L2a:
            java.lang.String r0 = ""
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.v2.DramaTopTabMainFragment.onFeedRefreshEvent(X.0qos):void");
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        this.LLJILJIL.onNodeHide(bundle);
        C1564710qov.LIZ(this, bundle, "Drama", new AwS603S0100000_24(this, 230));
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Drama");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (Intrinsics.LJFF(string, "MainPage") || bundle.getBoolean(strHQ22)) {
                C1577260r9A.LIZ = null;
                ISeriesCommonETService.LIZ.getClass();
                ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
                if (iSeriesCommonETServiceLIZ != null) {
                    iSeriesCommonETServiceLIZ.setDramaTabETParam(C2097608Jq.LJ());
                }
                UR();
            }
        } else {
            C1577260r9A.LIZ = null;
            ISeriesCommonETService.LIZ.getClass();
            ISeriesCommonETService iSeriesCommonETServiceLIZ2 = C718550SGn.LIZ();
            if (iSeriesCommonETServiceLIZ2 != null) {
                iSeriesCommonETServiceLIZ2.setDramaTabETParam(C2097608Jq.LJ());
            }
            UR();
        }
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILIIL();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.ON_PAGE_HIDE, null);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        C1578940rBs c1578940rBs;
        this.LLJILJIL.onNodeShow(bundle);
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Drama");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                RR();
            } else {
                IDramaSkylightAbility iDramaSkylightAbilityLJIIJ = VR().LJIIJ();
                if (iDramaSkylightAbilityLJIIJ != null) {
                    iDramaSkylightAbilityLJIIJ.gl1();
                }
                String string2 = bundle.getString("previousPage", "");
                String string3 = bundle.getString("enter_method", "");
                C1577250r99.LIZ.getClass();
                C1577250r99.LJFF(string2, string3);
                RR();
            }
        } else {
            IDramaSkylightAbility iDramaSkylightAbilityLJIIJ2 = VR().LJIIJ();
            if (iDramaSkylightAbilityLJIIJ2 != null) {
                iDramaSkylightAbilityLJIIJ2.gl1();
            }
            RR();
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null && Intrinsics.LJFF(interfaceC1577520r9aLIZIZ.LJIIIIZZ(), Boolean.TRUE)) {
            C1578690rBT c1578690rBTVR = VR();
            Iterator<SeriesCenterCenterScene> it2 = c1578690rBTVR.LLLFF.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SeriesCenterSceneEnum seriesCenterSceneEnum = it2.next().scene;
                if (seriesCenterSceneEnum != null && seriesCenterSceneEnum.getValue() == SeriesCenterSceneEnum.PICKS.getValue()) {
                    if (i > -1 && (c1578940rBs = c1578690rBTVR.LLILZLL) != null) {
                        C1578940rBs.LIZ(c1578940rBs, i);
                    }
                } else {
                    i++;
                }
            }
            c1578690rBTVR.LLILLJJLI.n9().KH();
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        int i2;
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        List listL32;
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (listL32 = homeTabAbilityLIZ.l32()) != null) {
            Iterator it2 = listL32.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((InterfaceC1583870rJp) it2.next()).tag(), "Drama")) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            SE(Intrinsics.LJFF(VR().LLJL, Boolean.TRUE));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DramaTopTabMainFragmentScope.class});
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL, InterfaceC1577950rAH.class);
        c0qsjLIZIZ.bindAbility(this.LLIZ, InterfaceC1577740r9w.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VR().LJIL(view, bundle);
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJ.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLJJI(this);
        }
        C14LC.LJIJ.observe(this, new AObserverS226S0100000_24(this, 17));
    }

    @Override // X.InterfaceC1578680rBS
    public final C1749280vcc hG(Throwable th, boolean z, AwS568S0100000_24 awS568S0100000_24) {
        int i;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (z) {
            i = R.style.z4;
        } else {
            i = R.style.zd;
        }
        C1749280vcc c1749280vcc = new C1749280vcc(new ContextThemeWrapper(context, i), null, 6);
        C1264160j0A.LIZ(c1749280vcc, EnumC1609900rzo.DEFAULT, th, new AwS568S0100000_24(awS568S0100000_24, 1637));
        return c1749280vcc;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity;
        View viewLIZLLL;
        Context context = VR().getContext();
        C19GS c19gs = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            viewLIZLLL = null;
        } else {
            viewLIZLLL = C20673215v0.LIZLLL(R.layout.bo3, activity, viewGroup, false);
        }
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
