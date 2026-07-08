package com.ss.android.ugc.aweme.series.feed.tab;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0AUF;
import X.C0B0A;
import X.C0BNP;
import X.C0RRR;
import X.C0SR4;
import X.C0SU6;
import X.C0SZ8;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11IR;
import X.C11NZ;
import X.C11S5;
import X.C1209450hZv;
import X.C1361830lXh;
import X.C1386470mBR;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1492500owS;
import X.C1492540owW;
import X.C14LC;
import X.C1514430pVp;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1564710qov;
import X.C1567900qu4;
import X.C1568090quN;
import X.C1568310quj;
import X.C1574290r4N;
import X.C1576960r8g;
import X.C1577250r99;
import X.C1577260r9A;
import X.C1577750r9x;
import X.C1577760r9y;
import X.C1577780rA0;
import X.C1577790rA1;
import X.C1577820rA4;
import X.C1577870rA9;
import X.C1577910rAD;
import X.C1581030rFF;
import X.C1591350rVt;
import X.C1591880rWk;
import X.C1602160rnK;
import X.C1603210rp1;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1834107Gh;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2189821An6;
import X.C2217381BqS;
import X.C23250099c;
import X.C279260Ax2;
import X.C294780Bgy;
import X.C303460Buy;
import X.C338490DOt;
import X.C446900Hfk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C680080Qly;
import X.C682840QqQ;
import X.C718550SGn;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C987103tV;
import X.EnumC1573550r3B;
import X.EnumC1576680r8E;
import X.EnumC1584370rKd;
import X.EnumC995350c0b;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1209460hZw;
import X.InterfaceC1253240iiY;
import X.InterfaceC1577520r9a;
import X.InterfaceC1577600r9i;
import X.InterfaceC1577720r9u;
import X.InterfaceC1581960rGk;
import X.InterfaceC1587520rPi;
import X.InterfaceC1591870rWj;
import X.InterfaceC1603190roz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC606900NrE;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC988100bou;
import X.ViewOnAttachStateChangeListenerC1577770r9z;
import Y.AObserverS210S0100000_6;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedExService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.api.MiniDramaReportRequest;
import com.ss.android.ugc.aweme.series.feed.api.SeriesListApi;
import com.ss.android.ugc.aweme.series.feed.tab.controller.SeriesTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedViewHolder;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS48S0301000_24;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHomeTabFragment extends BaseFeedListFragment implements InterfaceC1055110dYz, InterfaceC988100bou, InterfaceC1577600r9i, InterfaceC1591870rWj, InterfaceC724530SbT, InterfaceC1587520rPi, InterfaceC1253240iiY, InterfaceC606900NrE {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2HELIOSsqLCo3ZjEtK2EALTclLDwbJygpHS4xDjctLiI2JjE=";
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public SeriesFeedViewHolder LLJ;
    public InterfaceC1209460hZw LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesHomeTabFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/SeriesHomeTabVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SeriesHomeTabFragment.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/feed/SeriesFeedVM;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a2270.b96369";
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "SeriesFeedFragment";
    }

    public SeriesHomeTabFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesHomeTabVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 986);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(306);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 987), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 988), aFwS264S0000000_24, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 989), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SeriesFeedVM.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 990);
        AFwS264S0000000_24 aFwS264S0000000_242 = AFwS264S0000000_24.get$arr$(307);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 991), aFwS264S0000000_242, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new AwS568S0100000_24((Fragment) this, 992), aFwS264S0000000_242, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 985), aFwS264S0000000_242, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLIZLLLIL = assemVMLazy2;
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
        if (seriesFeedViewHolder != null) {
            return seriesFeedViewHolder.LLJJ();
        }
        return false;
    }

    @Override // X.InterfaceC1587520rPi
    public final void N8() {
        IXTabScrollProfileStrategy iXTabScrollProfileStrategyWC0;
        C0SR4 c0sr4;
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
        int count = (seriesFeedViewHolder == null || (c0sr4 = seriesFeedViewHolder.LLJL) == null) ? 0 : c0sr4.getCount();
        C19EG activity = getActivity();
        if (activity == null || (iXTabScrollProfileStrategyWC0 = C1591880rWk.LIZIZ.LJIJJ(activity).wC0("Drama")) == null) {
            return;
        }
        iXTabScrollProfileStrategyWC0.S50(count == 0);
    }

    public final SeriesHomeTabVM WR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SeriesHomeTabVM) assemVMLazy.getValue();
    }

    public final void ZR() {
        ISeriesFeedExService.LIZ.getClass();
        C1574290r4N.LIZ().LJI();
    }

    public final void aS() {
        Aweme awemeLJIIIIZZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        C0SR4 c0sr4;
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
        int count = (seriesFeedViewHolder == null || (c0sr4 = seriesFeedViewHolder.LLJL) == null) ? 0 : c0sr4.getCount();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        String aid = null;
        Pair<Boolean, String> pairLIZLLL = (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null) ? null : interfaceC1577520r9aLIZIZ.LIZLLL();
        if (count <= 0 || pairLIZLLL == null) {
            return;
        }
        if (!pairLIZLLL.getFirst().booleanValue()) {
            String second = pairLIZLLL.getSecond();
            if (second == null || second.length() == 0) {
                return;
            }
            String second2 = pairLIZLLL != null ? pairLIZLLL.getSecond() : null;
            SeriesFeedViewHolder seriesFeedViewHolder2 = this.LLJ;
            if (seriesFeedViewHolder2 != null && (awemeLJIIIIZZ = seriesFeedViewHolder2.LJIIIIZZ()) != null) {
                aid = awemeLJIIIIZZ.getAid();
            }
            if (Intrinsics.LJFF(second2, aid)) {
                return;
            }
        }
        WR().EQ2(new C1577790rA1("force_insert_last_watch"));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
        if (seriesFeedViewHolder != null) {
            seriesFeedViewHolder.onDestroyView();
        }
        InterfaceC1209460hZw interfaceC1209460hZw = this.LLJI;
        if (interfaceC1209460hZw != null) {
            ((C1492540owW) interfaceC1209460hZw).LIZ();
        }
        if (C0BNP.LIZ()) {
            return;
        }
        C14LC.LJIJ.removeObservers(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WR().EQ2(C1577820rA4.LIZ);
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILIIL();
        ISeriesFeedExService.LIZ.getClass();
        C1574290r4N.LIZ().LJFF();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.ON_PAGE_HIDE, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AbsFragment absFragment;
        Class cls;
        C19EG activity;
        Window window;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SeriesHomeTabFragment.class.getName());
        }
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(SeriesHomeTabVM.LLJIJIL);
            if (((Boolean) C0AUF.LIZ.getValue()).booleanValue()) {
                ZR();
            }
        }
        WR().EQ2(new C1577780rA0(getUserVisibleHint() && isResumed()));
        if (!C0B0A.LIZ() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        if (!this.LLJIJIL && getUserVisibleHint() && isResumed() && (absFragment = this.LLILZ) != null && !absFragment.isHidden() && ((cls = C1577910rAD.LIZ) == null || cls == C1577910rAD.LIZIZ)) {
            this.LLJIJIL = true;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1577870rA9(this, null), 3);
            C1514430pVp.LJFF(EnumC1584370rKd.SERIES);
        }
        if (getUserVisibleHint() && isResumed()) {
            aS();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        this.LLILLJJLI = "homepage_series";
        int i = C0SU6.LIZJ;
        SeriesFeedViewHolder seriesFeedViewHolder = new SeriesFeedViewHolder();
        this.LLJ = seriesFeedViewHolder;
        sparseArrayRegisterComponents.append(i, seriesFeedViewHolder);
        return sparseArrayRegisterComponents;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
        UR();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        UR();
        WR().EQ2(new C1577760r9y(false, isResumed()));
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
        if (seriesFeedViewHolder != null) {
            C1440005kM.LIZ(new C1568310quj(2, seriesFeedViewHolder.LJIIIIZZ(), seriesFeedViewHolder));
            seriesFeedViewHolder.h(z);
        }
        NoNetDetectHelper.LIZ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        Boolean bool;
        Object objEQ2 = WR().EQ2(new C1577790rA1(null));
        if ((objEQ2 instanceof Boolean) && (bool = (Boolean) objEQ2) != null) {
            return bool.booleanValue();
        }
        return false;
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

    public final void S1(boolean z) {
        C19EG activity;
        Window window;
        C1568090quN c1568090quN;
        SeriesFeedViewHolder seriesFeedViewHolder;
        if (getUserVisibleHint() && (seriesFeedViewHolder = this.LLJ) != null) {
            C1440005kM.LIZ(new C1568310quj(1, seriesFeedViewHolder.LJIIIIZZ(), seriesFeedViewHolder));
        }
        if (getUserVisibleHint() && isViewValid()) {
            WR().EQ2(new C1577760r9y(true, isResumed()));
            NoNetDetectHelper.LIZ(Boolean.TRUE);
            RR();
            SeriesFeedViewHolder seriesFeedViewHolder2 = this.LLJ;
            if (seriesFeedViewHolder2 != null && ((c1568090quN = WR().LLILLJJLI) == null || !c1568090quN.LIZ)) {
                if (z) {
                    seriesFeedViewHolder2.tryResumePlay();
                } else {
                    seriesFeedViewHolder2.g();
                }
            }
            Db(false);
            if (!C0B0A.LIZ() && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(-16777216));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1564710qov.LIZ(this, bundle, "Drama", new AwS603S0100000_24(this, 223));
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZ(this);
        Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Drama");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LJLIIIL(1);
                    }
                    if (aweme != null) {
                        C1361830lXh.LIZ.LIZ(aweme.getAid());
                    }
                }
            } else {
                NR(true);
                C1577260r9A.LIZ = null;
                ISeriesCommonETService.LIZ.getClass();
                ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
                if (iSeriesCommonETServiceLIZ != null) {
                    iSeriesCommonETServiceLIZ.setDramaTabETParam(C2097608Jq.LJ());
                }
            }
        } else {
            SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
            if (seriesFeedViewHolder != null) {
                seriesFeedViewHolder.setUserVisibleHint(false);
            }
            NR(false);
            C1577260r9A.LIZ = null;
            ISeriesCommonETService.LIZ.getClass();
            ISeriesCommonETService iSeriesCommonETServiceLIZ2 = C718550SGn.LIZ();
            if (iSeriesCommonETServiceLIZ2 != null) {
                iSeriesCommonETServiceLIZ2.setDramaTabETParam(C2097608Jq.LJ());
            }
        }
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILIIL();
        ISeriesFeedExService.LIZ.getClass();
        C1574290r4N.LIZ().LJFF();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.ON_PAGE_HIDE, null);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) throws JSONException {
        ZR();
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZ(this);
        C1564710qov.LIZ(this, bundle, "Drama", new AwS603S0100000_24(this, 224));
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Drama");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 984);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    awS568S0100000_24.invoke();
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LLLI(1);
                    }
                    S1(true);
                }
            } else {
                awS568S0100000_24.invoke();
                S1(true);
                String string2 = bundle.getString("previousPage", "");
                String string3 = bundle.getString("enter_method", "");
                C1577250r99.LIZ.getClass();
                C1577250r99.LJFF(string2, string3);
            }
        } else {
            awS568S0100000_24.invoke();
            S1(false);
        }
        aS();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        IMainService iMainService;
        IWatchVideoService iWatchVideoService;
        C19EG activity;
        Activity activity2;
        VerticalViewPager verticalViewPager;
        super.onViewCreated(view, bundle);
        C0BNP.LIZ();
        C0B0A.LIZ();
        NoNetDetectHelper.LIZ(Boolean.TRUE);
        Db(false);
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLJ;
        if (seriesFeedViewHolder != null) {
            HomeFeedComponent homeFeedComponentVR = VR();
            C2189821An6 c2189821An6 = new C2189821An6();
            c2189821An6.setEventType(seriesFeedViewHolder.a0);
            c2189821An6.setPageType(seriesFeedViewHolder.b0);
            seriesFeedViewHolder.LLLLIIIILLL = c2189821An6;
            seriesFeedViewHolder.onViewCreated(view, bundle);
            seriesFeedViewHolder.LLLII = homeFeedComponentVR;
            seriesFeedViewHolder.LLLIIII = homeFeedComponentVR;
            seriesFeedViewHolder.Xl1(homeFeedComponentVR);
        }
        SeriesFeedViewHolder seriesFeedViewHolder2 = this.LLJ;
        if (seriesFeedViewHolder2 != null) {
            seriesFeedViewHolder2.d0 = this;
        }
        if (C0B0A.LIZ()) {
            boolean zLIZ = C1834107Gh.LIZ();
            SeriesFeedViewHolder seriesFeedViewHolder3 = this.LLJ;
            if (seriesFeedViewHolder3 != null && (verticalViewPager = seriesFeedViewHolder3.LLJJIJI) != null && seriesFeedViewHolder3.activity != null) {
                verticalViewPager.LLZLLLL = zLIZ;
            }
            View viewFindViewById = view.findViewById(R.id.nns);
            if (viewFindViewById != null && C1834107Gh.LIZ()) {
                viewFindViewById.setBackground(null);
            }
            if (zLIZ && (viewFindViewById instanceof C1603210rp1)) {
                ((C1603210rp1) viewFindViewById).setEnableOverdarwOpt(true);
            }
            SeriesFeedViewHolder seriesFeedViewHolder4 = this.LLJ;
            if (seriesFeedViewHolder4 != null) {
                VerticalViewPager verticalViewPager2 = seriesFeedViewHolder4.LLJJIJI;
                if (verticalViewPager2 == null) {
                    boolean z = C1602160rnK.LIZ;
                } else if (C1602160rnK.LIZIZ) {
                    verticalViewPager2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1577770r9z());
                    C1602160rnK.LIZJ(verticalViewPager2);
                }
            }
            SeriesFeedViewHolder seriesFeedViewHolder5 = this.LLJ;
            if (seriesFeedViewHolder5 != null) {
                boolean zBooleanValue = ((Boolean) C1591350rVt.LIZJ.getValue()).booleanValue();
                VerticalViewPager verticalViewPager3 = seriesFeedViewHolder5.LLJJIJI;
                if (verticalViewPager3 != null && (activity2 = seriesFeedViewHolder5.activity) != null) {
                    verticalViewPager3.LLLLZIL.LJFF(activity2.getWindow(), zBooleanValue);
                }
            }
            SeriesFeedViewHolder seriesFeedViewHolder6 = this.LLJ;
            if (seriesFeedViewHolder6 != null) {
                seriesFeedViewHolder6.LJL();
            }
        }
        if (this.LLJI == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLJI = C1209450hZv.LIZIZ(activity);
        }
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 684), 3);
        boolean zLIZ2 = C0BNP.LIZ();
        int i2 = R.id.huk;
        if (zLIZ2) {
            i = R.id.huk;
        } else {
            i = R.id.i6c;
        }
        WR().EQ2(new C1577750r9x(i, new AwS550S0100000_6(this, 597)));
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            final SeriesTabScrollProfileStrategy seriesTabScrollProfileStrategy = new SeriesTabScrollProfileStrategy(activity3);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, C1697810uHb.LJIILJJIL(seriesTabScrollProfileStrategy));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.series.feed.tab.utils.HomeViewPagerInterceptHelperKt$registerInterceptHomeViewPager$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, seriesTabScrollProfileStrategy);
                        }
                    }
                });
            }
        }
        if (!C0BNP.LIZ()) {
            i2 = R.id.vbg;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(i2);
        if (viewGroup != null && (iWatchVideoService = (IWatchVideoService) PluggableExtentionKt.pluggableSpi$default(IWatchVideoService.class, false, false, false, 14, null)) != null) {
            iWatchVideoService.LJFF(viewGroup, this);
        }
        if (!C0BNP.LIZ()) {
            C14LC.LJIJ.observe(this, new AObserverS210S0100000_6(view.findViewById(R.id.usc), 30));
        }
        if (C0B0A.LIZ() && (getActivity() instanceof InterfaceC1603190roz) && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null) {
            iMainService.releaseWindowBackgroundTask(getActivity());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        int i;
        ComponentCallbacks2 componentCallbacks2LJFF;
        boolean z;
        InterfaceC214902198i interfaceC214902198i;
        SeriesHomeTabVM seriesHomeTabVMWR = WR();
        getContext();
        seriesHomeTabVMWR.EQ2(new InterfaceC1577720r9u() { // from class: X.0rA3
        });
        boolean zLIZ = C0BNP.LIZ();
        C0B0A.LIZ();
        C19GS c19gs = null;
        if (zLIZ) {
            if (C303460Buy.LIZIZ()) {
                i = R.layout.b6t;
            } else {
                i = R.layout.b6p;
            }
            C19EG activity = getActivity();
            if (activity != null) {
                Context context = getContext();
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (Fragment parentFragment = this; parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
                        if (parentFragment instanceof InterfaceC214902198i) {
                            interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                            break;
                        }
                    }
                    interfaceC214902198i = null;
                    viewLIZJ = SAFExtensionKt.LJJII(activity, layoutInflater.getContext(), i, C682840QqQ.LIZ(interfaceC214902198i, activity));
                } else {
                    interfaceC214902198i = null;
                    viewLIZJ = SAFExtensionKt.LJJII(activity, layoutInflater.getContext(), i, C682840QqQ.LIZ(interfaceC214902198i, activity));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (C279260Ax2.LIZ()) {
            viewLIZJ = C20673215v0.LIZJ(R.layout.f56, getActivity());
        } else {
            viewLIZJ = C20673215v0.LIZJ(R.layout.f57, getActivity());
        }
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC606900NrE
    public final List fF(int i, int i2, String str, List list) {
        Object obj;
        ArrayList arrayList;
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        SeriesFeedVM seriesFeedVM = (SeriesFeedVM) assemVMLazy.getValue();
        Object obj2 = null;
        try {
            ArrayList arrayList2 = new ArrayList();
            List<Aweme> list2 = ((C1567900qu4) seriesFeedVM.getState()).LL.LLILZ;
            if (list2 != null) {
                arrayList = new ArrayList(list2);
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i3 = i; i3 < i2; i3++) {
                    Aweme aweme = (Aweme) C13LP.LJJJLZIJ(i3, arrayList);
                    if (aweme != null) {
                        arrayList.remove(aweme);
                        arrayList2.add(aweme);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((Aweme) it2.next()).getAid());
                }
                arrayList.addAll(i, list);
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((Aweme) it3.next()).getAid());
                }
                arrayList4.toString();
            }
            seriesFeedVM.setStateImmediate(new AwS48S0301000_24(seriesFeedVM, (SeriesFeedVM) arrayList, (List<Aweme>) list, (List<? extends Aweme>) i, 0));
            C189200o6.m2constructorimpl(arrayList2);
            obj = arrayList2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        ArrayList arrayList5 = (ArrayList) obj2;
        if (arrayList5 == null) {
            return C13BV.INSTANCE;
        }
        return arrayList5;
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
