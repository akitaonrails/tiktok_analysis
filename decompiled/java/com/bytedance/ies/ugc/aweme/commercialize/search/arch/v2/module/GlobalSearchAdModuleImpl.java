package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module;

import X.C098200Yq;
import X.C0P6L;
import X.C189200o6;
import X.C2188811AlT;
import X.C2510609se;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import X.InterfaceC988260bpA;
import Y.ARunnableS43S0300000_10;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ams.SearchAppMeasurementModule;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class GlobalSearchAdModuleImpl implements IGlobalSearchAdModule {
    public final Stack<InterfaceC657510Pqf> LIZ = new Stack<>();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC657510Pqf LIZLLL() {
        InterfaceC657510Pqf c098200Yq;
        try {
            c098200Yq = this.LIZ.peek();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (InterfaceC657510Pqf) c098200Yq;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZ(Context context) {
        Object c098200Yq;
        int iHashCode;
        try {
            Stack<InterfaceC657510Pqf> stack = this.LIZ;
            InterfaceC657510Pqf interfaceC657510PqfPop = stack.pop();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Stack pop : element hashcode = ");
            if (interfaceC657510PqfPop == null) {
                iHashCode = 0;
            } else {
                iHashCode = interfaceC657510PqfPop.hashCode();
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(", size = ");
            sbLIZ.append(stack.size());
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2510609se.LIZ;
            InterfaceC657510Pqf interfaceC657510Pqf = interfaceC657510PqfPop;
            if (interfaceC657510Pqf != null) {
                interfaceC657510Pqf.LIZ(context);
            }
            ((ISearchAdPreloadModule) ServiceManager.get().getService(ISearchAdPreloadModule.class)).LIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC988260bpA LIZIZ(Aweme aweme) {
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = LIZLLL();
        if (interfaceC657510PqfLIZLLL != null) {
            return interfaceC657510PqfLIZLLL.LIZLLL(aweme);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC660150Puv LJ(Aweme aweme) {
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = LIZLLL();
        if (interfaceC657510PqfLIZLLL != null) {
            return interfaceC657510PqfLIZLLL.LJIJ(aweme);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZJ(final View view, final Fragment fragment, final C0P6L c0p6l) {
        Stack<InterfaceC657510Pqf> stack = this.LIZ;
        InterfaceC657510Pqf interfaceC657510Pqf = new InterfaceC657510Pqf(view, fragment, c0p6l) { // from class: X.0Q16
            public final View LIZ;
            public final Fragment LIZIZ;
            public final C603820NmG<String, InterfaceC660150Puv> LIZJ = new C603820NmG<>(100);
            public final C603820NmG<String, InterfaceC988260bpA> LIZLLL = new C603820NmG<>(100);
            public final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(701));
            public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
            public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(699));
            public C0PL3 LJII;
            public final C01GW LJIIIIZZ;
            public final C1007860cKm LJIIIZ;

            @Override // X.InterfaceC657510Pqf
            public final void LJIILJJIL() {
                this.LJII = null;
            }

            @Override // X.InterfaceC657510Pqf
            public final C0Q17 LJIIJ() {
                return (C0Q17) this.LJIIIIZZ.getValue();
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIIL() {
                C603820NmG<String, InterfaceC988260bpA> c603820NmG;
                C01GW c01gw = C256480A3i.LIZ;
                if (!C256480A3i.LIZIZ || (c603820NmG = this.LIZLLL) == null) {
                    return;
                }
                Iterator it2 = ((LinkedHashMap) c603820NmG.LJIIIIZZ()).entrySet().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC988260bpA) ((Map.Entry) it2.next()).getValue()).onDestroy();
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJJI() {
                Iterator it2 = ((LinkedHashMap) ((C603820NmG) this.LJI.getValue()).LJIIIIZZ()).entrySet().iterator();
                while (it2.hasNext()) {
                    ((C0PPF) ((Map.Entry) it2.next()).getValue()).onDestroy();
                }
                Iterator it3 = ((LinkedHashMap) this.LIZJ.LJIIIIZZ()).entrySet().iterator();
                while (it3.hasNext()) {
                    ((C0PPF) ((Map.Entry) it3.next()).getValue()).onDestroy();
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final boolean LJJIII() {
                View view2;
                Context context;
                C19EG c19egLIZIZ;
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                Activity activityLIZIZ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null;
                IFeedAdService iFeedAdService = (IFeedAdService) PluggableExtentionKt.pluggableSpi$default(IFeedAdService.class, false, false, false, 14, null);
                if ((iFeedAdService == null || !iFeedAdService.LIZ(activityLIZIZ)) && (view2 = this.LIZ) != null && (context = view2.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    SAFHelper sAFHelper = SAFHelper.LIZ;
                    Fragment fragment2 = this.LIZIZ;
                    sAFHelper.getClass();
                    if (!SAFHelper.LJJJJJ(fragment2, c19egLIZIZ) && !SAFHelper.LJJJJI(this.LIZIZ, c19egLIZIZ)) {
                        return SAFHelper.LJJJJLI(c19egLIZIZ, this.LIZ);
                    }
                }
                return false;
            }

            @Override // X.InterfaceC657510Pqf
            public final C1007860cKm LJIILIIL() {
                return this.LJIIIZ;
            }

            @Override // X.InterfaceC657510Pqf
            public final void LIZ(Context context) {
                IFeedService iFeedServiceLIZIZ;
                if (((Boolean) C1051710dTV.LJ.getValue()).booleanValue()) {
                    int i = C2510609se.LIZ;
                    ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
                    if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null) {
                        iFeedServiceLIZIZ.LIZ(context, "general_search");
                    }
                }
                C0Q17 c0q17 = (C0Q17) this.LJIIIIZZ.getValue();
                c0q17.getClass();
                if (((Boolean) C075W.LIZ.getValue()).booleanValue() && (!c0q17.LJI.isEmpty())) {
                    String str = c0q17.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clearVisibleCallbacks, size = ");
                    sbLIZ.append(c0q17.LJI.size());
                    C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    c0q17.LJI.clear();
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final void LIZJ(boolean z) {
                Context context;
                C19EG c19egLIZIZ;
                Fragment fragment2;
                View view2 = this.LIZ;
                if (view2 != null && (context = view2.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    SAFHelper sAFHelper = SAFHelper.LIZ;
                    View view3 = this.LIZ;
                    sAFHelper.getClass();
                    if (SAFHelper.LJJJJLI(c19egLIZIZ, view3) && !SAFHelper.LJJJJJ(this.LIZIZ, c19egLIZIZ) && !SAFHelper.LJJJJI(this.LIZIZ, c19egLIZIZ) && (fragment2 = this.LIZIZ) != null && fragment2.isAdded()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLandPageFragmentVisibilityChange: visible = ");
                        sbLIZ.append(z);
                        C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2510609se.LIZ;
                        if (z) {
                            C1009940cO8.LJFF(this.LIZIZ, this.LIZ, Lifecycle.State.STARTED);
                        } else {
                            C1009940cO8.LJFF(this.LIZIZ, this.LIZ, Lifecycle.State.RESUMED);
                        }
                    }
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final InterfaceC988260bpA LIZLLL(Aweme aweme) {
                InterfaceC988260bpA c098200Yq;
                Object obj = null;
                if (aweme == null) {
                    return null;
                }
                try {
                    c098200Yq = this.LIZLLL.LIZJ(aweme.getAid());
                    if (c098200Yq == null) {
                        int i = C2510609se.LIZ;
                        c098200Yq = LJJIIJZLJL(new C0Q19(aweme));
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                return (InterfaceC988260bpA) obj;
            }

            @Override // X.InterfaceC657510Pqf
            public final C1011010cPr LJ(C659420Ptk c659420Ptk) {
                return new C1011010cPr(c659420Ptk);
            }

            @Override // X.InterfaceC657510Pqf
            public final C643530PLz LJI(C0PL5 c0pl5) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null) {
                    return c0pl3.LIZ(c0pl5);
                }
                return null;
            }

            @Override // X.InterfaceC657510Pqf
            public final C643530PLz LJII(String str) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 == null || !Intrinsics.LJFF(str, c0pl3.LJFF)) {
                    return null;
                }
                return c0pl3.LIZ(C0PL5.INFLOW);
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIIIZ(Function0<Unit> function0) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 == null) {
                    function0.invoke();
                    return;
                }
                ReentrantLock reentrantLock = c0pl3.LJIIJJI;
                reentrantLock.lock();
                try {
                    function0.invoke();
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final C1010610cPD LJIIJJI(InterfaceC657490Pqd interfaceC657490Pqd) {
                Aweme aweme = interfaceC657490Pqd.getAweme();
                if (aweme == null) {
                    return null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(aweme.getRequestId());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1037910d7F interfaceC1037910d7F = (C0Q18) ((C603820NmG) this.LJFF.getValue()).LIZJ(strLIZIZ);
                if (interfaceC1037910d7F == null) {
                    C1010610cPD c1010610cPD = new C1010610cPD(interfaceC657490Pqd);
                    this.LIZJ.LIZLLL(strLIZIZ, c1010610cPD);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("create searchItemModule: module = ");
                    sbLIZ2.append(c1010610cPD.hashCode());
                    sbLIZ2.append(" key = ");
                    sbLIZ2.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    int i = C2510609se.LIZ;
                    return c1010610cPD;
                }
                if (!(interfaceC1037910d7F instanceof C1010610cPD)) {
                    return null;
                }
                return (C1010610cPD) interfaceC1037910d7F;
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIIZILJ(String str) {
                InterfaceC692440REc interfaceC692440REc;
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null && Intrinsics.LJFF(str, c0pl3.LJFF)) {
                    ((ArrayList) c0pl3.LIZLLL).clear();
                    WeakReference<InterfaceC692440REc> weakReference = c0pl3.LJ;
                    if (weakReference != null && (interfaceC692440REc = weakReference.get()) != null) {
                        ((ArrayList) c0pl3.LIZLLL).addAll(interfaceC692440REc.Fg());
                        c0pl3.LJ = null;
                    }
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final InterfaceC660150Puv LJIJ(Aweme aweme) {
                String str;
                Map<String, String> searchAdExtraParams;
                InterfaceC660150Puv interfaceC660150PuvLIZJ;
                AwemeSearchAdModel searchAdInfo = null;
                if (aweme == null) {
                    return null;
                }
                AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ != null) {
                    searchAdInfo = awemeRawAdLJJIJLIJ.getSearchAdInfo();
                }
                int iHashCode = 0;
                if (searchAdInfo != null) {
                    Integer num = searchAdInfo.feedType;
                    String str2 = searchAdInfo.searchAdCacheKey;
                    if (str2 != null && str2.length() != 0 && num != null && 116 == num.intValue() && (interfaceC660150PuvLIZJ = this.LIZJ.LIZJ(str2)) != null) {
                        return interfaceC660150PuvLIZJ;
                    }
                }
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null || (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) == null || (str = searchAdExtraParams.get("search_item_id")) == null) {
                    str = "";
                }
                InterfaceC660150Puv interfaceC660150PuvLIZJ2 = this.LIZJ.LIZJ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getItemModule: module = ");
                if (interfaceC660150PuvLIZJ2 != null) {
                    iHashCode = interfaceC660150PuvLIZJ2.hashCode();
                }
                sbLIZ.append(iHashCode);
                sbLIZ.append(" key = ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2510609se.LIZ;
                return interfaceC660150PuvLIZJ2;
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIJJ(InterfaceC660150Puv interfaceC660150Puv) {
                String strLIZIZ;
                String str;
                String aid;
                Integer numValueOf;
                Aweme aweme = interfaceC660150Puv.Mh().getAweme();
                String requestId = null;
                if (aweme != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aweme.getAid());
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        numValueOf = Integer.valueOf(awemeRawAd.getRit());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(interfaceC660150Puv.hashCode());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        awemeRawAd2.appendExtraParamInCommercializeSearch("search_item_id", strLIZIZ);
                    }
                } else {
                    strLIZIZ = null;
                }
                C603820NmG<String, InterfaceC660150Puv> c603820NmG = this.LIZJ;
                if (strLIZIZ == null) {
                    str = "default";
                } else {
                    str = strLIZIZ;
                }
                c603820NmG.LIZLLL(str, interfaceC660150Puv);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("addItemModule: module = ");
                sbLIZ2.append(interfaceC660150Puv.hashCode());
                sbLIZ2.append(" aid = ");
                Aweme aweme2 = interfaceC660150Puv.Mh().getAweme();
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                sbLIZ2.append(aid);
                sbLIZ2.append(" requestId = ");
                Aweme aweme3 = interfaceC660150Puv.Mh().getAweme();
                if (aweme3 != null) {
                    requestId = aweme3.getRequestId();
                }
                sbLIZ2.append(requestId);
                sbLIZ2.append(", key = ");
                sbLIZ2.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                int i = C2510609se.LIZ;
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIL(Aweme aweme) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null) {
                    c0pl3.LIZJ(aweme);
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final InterfaceC660150Puv LJJII(String str) {
                if (str != null && str.length() != 0 && this.LIZJ.LJI() >= 1) {
                    return this.LIZJ.LIZJ(str);
                }
                return null;
            }

            public final C1002850cCh LJJIIJZLJL(C0Q19 c0q19) {
                String aid;
                String aid2;
                C1002850cCh c1002850cCh = new C1002850cCh(c0q19);
                Aweme aweme = c0q19.LIZ;
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "default";
                }
                this.LIZLLL.LIZLLL(aid, c1002850cCh);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createSearchDetailModule: module = ");
                sbLIZ.append(c1002850cCh.hashCode());
                sbLIZ.append(" aid = ");
                Aweme aweme2 = c0q19.LIZ;
                String requestId = null;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                } else {
                    aid2 = null;
                }
                sbLIZ.append(aid2);
                sbLIZ.append(" requestId = ");
                Aweme aweme3 = c0q19.LIZ;
                if (aweme3 != null) {
                    requestId = aweme3.getRequestId();
                }
                sbLIZ.append(requestId);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2510609se.LIZ;
                return c1002850cCh;
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJFF(List list, AbstractC683590Qrd abstractC683590Qrd) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null) {
                    RunnableC823120WQs.LIZIZ(new ARunnableS43S0300000_10(abstractC683590Qrd, c0pl3, list, 24));
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIIIIZZ(String str, InterfaceC660150Puv interfaceC660150Puv) {
                String aid;
                this.LIZJ.LIZLLL(str, interfaceC660150Puv);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addItemModuleWithKey: key = ");
                sbLIZ.append(str);
                sbLIZ.append(", module = ");
                sbLIZ.append(interfaceC660150Puv.hashCode());
                sbLIZ.append(" aid = ");
                Aweme aweme = interfaceC660150Puv.Mh().getAweme();
                String requestId = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                sbLIZ.append(" requestId = ");
                Aweme aweme2 = interfaceC660150Puv.Mh().getAweme();
                if (aweme2 != null) {
                    requestId = aweme2.getRequestId();
                }
                sbLIZ.append(requestId);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2510609se.LIZ;
            }

            @Override // X.InterfaceC657510Pqf
            public final C0PP8 LJIILL(String str, boolean z) {
                if (str.length() == 0) {
                    return null;
                }
                C0PP8 c0pp8 = (C0PP8) ((C603820NmG) this.LJI.getValue()).LIZJ(str);
                if (!z && c0pp8 != null) {
                    return c0pp8;
                }
                C686670Qwb c686670Qwb = new C686670Qwb();
                ((C603820NmG) this.LJI.getValue()).LIZLLL(str, c686670Qwb);
                return c686670Qwb;
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJIILLIIL(SearchMixFeed searchMixFeed, AbstractC21673619ry abstractC21673619ry) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null) {
                    RunnableC823120WQs.LIZIZ(new ARunnableS43S0300000_10(abstractC21673619ry, searchMixFeed, c0pl3, 23));
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final SearchAppMeasurementModule LJIJJLI(Aweme aweme, AwS411S0200000_10 awS411S0200000_10) {
                if (SearchAppMeasurementModule.LLIZ.LIZ(aweme) == null) {
                    return null;
                }
                return new SearchAppMeasurementModule((InterfaceC589010N8h) awS411S0200000_10.invoke());
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJJ(Integer num, List list) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null) {
                    c0pl3.LJI = num;
                    c0pl3.LJ = null;
                    ((ArrayList) c0pl3.LIZLLL).clear();
                    ((ArrayList) c0pl3.LIZLLL).addAll(list);
                    Aweme aweme = (Aweme) C13LP.LJJJLL(list);
                    if (aweme != null) {
                        c0pl3.LIZJ(aweme);
                    }
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJJIFFI(int i, Integer num) {
                Integer num2;
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null && (num2 = c0pl3.LJI) != null && num2.intValue() == i) {
                    c0pl3.LJI = num;
                    if (num != null) {
                        c0pl3.LJII.add(num);
                    }
                }
            }

            @Override // X.InterfaceC657510Pqf
            public final void LJJIIJ(String str, C0SR4 c0sr4) {
                C0PL3 c0pl3 = this.LJII;
                if (c0pl3 != null && str != null && str.length() != 0 && Intrinsics.LJFF(str, c0pl3.LJFF)) {
                    c0pl3.LJ = new WeakReference<>(c0sr4);
                }
            }

            {
                C0PL3 c0pl3;
                this.LIZ = view;
                this.LIZIZ = fragment;
                if (C293510Bev.LIZ() && c0p6l != null) {
                    c0pl3 = new C0PL3(c0p6l);
                } else {
                    c0pl3 = null;
                }
                this.LJII = c0pl3;
                this.LJIIIIZZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(698));
                this.LJIIIZ = new C1007860cKm();
            }

            @Override // X.InterfaceC657510Pqf
            public final InterfaceC662780PzA LJIJI(String str, boolean z, final InterfaceC662940PzQ interfaceC662940PzQ) {
                InterfaceC662780PzA interfaceC662780PzA = (InterfaceC662780PzA) ((C603820NmG) this.LJ.getValue()).LIZJ(str);
                if (!z && interfaceC662780PzA != null) {
                    return interfaceC662780PzA;
                }
                if (interfaceC662940PzQ == null) {
                    return null;
                }
                InterfaceC662780PzA interfaceC662780PzA2 = new InterfaceC662780PzA(interfaceC662940PzQ) { // from class: X.0Qwd
                    public final InterfaceC662940PzQ LL;
                    public final SearchAdEventLogger LLILLJJLI = new SearchAdEventLogger();

                    @Override // X.C0PPF
                    public final void bind() {
                        this.LLILLJJLI.withContext(this.LL.getRawAd());
                    }

                    @Override // X.C0PPF
                    public final void onViewAttachedToWindow() {
                        int i = C2510609se.LIZ;
                        SearchAdEventLogger searchAdEventLogger = this.LLILLJJLI;
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger.logAd(C1009980cOC.LIZIZ);
                    }

                    @Override // X.C0PPF
                    public final void onViewDetachedFromWindow() {
                        int i = C2510609se.LIZ;
                        SearchAdEventLogger searchAdEventLogger = this.LLILLJJLI;
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
                    }

                    {
                        this.LL = interfaceC662940PzQ;
                    }

                    @Override // X.InterfaceC662780PzA
                    public final void LJIL(C0Q1G c0q1g) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[onShopCardClick], ResultPageClickType=");
                        sbLIZ.append(c0q1g);
                        C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2510609se.LIZ;
                        int i2 = C0Q1F.LIZ[c0q1g.ordinal()];
                        if (i2 != 1 && i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        SearchAdEventLogger searchAdEventLogger = this.LLILLJJLI;
                                        C1009980cOC.LIZ.getClass();
                                        searchAdEventLogger.logAd(C1009980cOC.LJJJJJ);
                                        return;
                                    }
                                    return;
                                }
                                SearchAdEventLogger searchAdEventLogger2 = this.LLILLJJLI;
                                C1009980cOC.LIZ.getClass();
                                searchAdEventLogger2.logAd(C1009980cOC.LJJJJJL);
                                return;
                            }
                            SearchAdEventLogger searchAdEventLogger3 = this.LLILLJJLI;
                            C1009980cOC.LIZ.getClass();
                            searchAdEventLogger3.logAd(C1009980cOC.LJJJJIZL);
                            return;
                        }
                        SearchAdEventLogger searchAdEventLogger4 = this.LLILLJJLI;
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger4.logAd(C1009980cOC.LJJJJI);
                    }
                };
                ((C603820NmG) this.LJ.getValue()).LIZLLL(str, interfaceC662780PzA2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create ShopCardModule: module = ");
                sbLIZ.append(interfaceC662780PzA2.hashCode());
                sbLIZ.append(" key = ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2510609se.LIZ;
                return interfaceC662780PzA2;
            }

            @Override // X.InterfaceC657510Pqf
            public final C0Q18 LIZIZ(Aweme aweme, String str, boolean z, boolean z2) {
                AwemeSearchAdModel searchAdInfo;
                Integer numValueOf = null;
                if (aweme == null) {
                    return null;
                }
                int iHashCode = 0;
                if (str == null || str.length() == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aweme.getAid());
                    sbLIZ.append(aweme.getRequestId());
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
                C0Q18 c0q18 = (C0Q18) ((C603820NmG) this.LJFF.getValue()).LIZJ(str);
                if (z2) {
                    return c0q18;
                }
                if (!z && c0q18 != null) {
                    return c0q18;
                }
                C1010440cOw c1010440cOw = new C1010440cOw();
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(aweme.getAid());
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        numValueOf = Integer.valueOf(awemeRawAd2.getRit());
                    }
                    sbLIZ2.append(numValueOf);
                    if (c0q18 != null) {
                        iHashCode = c0q18.hashCode();
                    }
                    sbLIZ2.append(iHashCode);
                    searchAdInfo.setSearchItemId(C2188811AlT.LIZIZ(sbLIZ2));
                }
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    awemeRawAd3.getSearchAdInfo();
                }
                ((C603820NmG) this.LJFF.getValue()).LIZLLL(str, c1010440cOw);
                return c1010440cOw;
            }
        };
        stack.push(interfaceC657510Pqf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stack push : element hashcode = ");
        sbLIZ.append(interfaceC657510Pqf.hashCode());
        sbLIZ.append(", size = ");
        sbLIZ.append(stack.size());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
    }
}
