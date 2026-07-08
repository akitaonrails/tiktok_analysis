package com.ss.android.ugc.aweme.search.middle;

import X.AbstractC669180QMq;
import X.C01GW;
import X.C01V1;
import X.C05QG;
import X.C07CA;
import X.C07H0;
import X.C07IV;
import X.C098200Yq;
import X.C0BR9;
import X.C0BRD;
import X.C0DXR;
import X.C0P7X;
import X.C0P9S;
import X.C0POX;
import X.C0PSI;
import X.C0PYE;
import X.C0Q2M;
import X.C0Q3J;
import X.C0Q45;
import X.C0Q54;
import X.C0Q6U;
import X.C0QDA;
import X.C0QEE;
import X.C0QER;
import X.C0QF6;
import X.C0QGT;
import X.C0QGZ;
import X.C0QJ4;
import X.C0QJ5;
import X.C0QJ6;
import X.C0QJ8;
import X.C0QJA;
import X.C0QJB;
import X.C0QJC;
import X.C0QJD;
import X.C0QJN;
import X.C0QJO;
import X.C0QJX;
import X.C0QKL;
import X.C0QNF;
import X.C0QPJ;
import X.C0QQF;
import X.C0VWN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C123100dR;
import X.C1233040iBy;
import X.C1388190mED;
import X.C13LE;
import X.C1516330pYt;
import X.C1558360qeg;
import X.C1608210rx5;
import X.C1685300txQ;
import X.C1823207Cc;
import X.C1828607Ee;
import X.C1828707Ef;
import X.C1837507Hp;
import X.C1839207Ig;
import X.C189200o6;
import X.C1935507i5;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21146717pB;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2452309jF;
import X.C271620Aki;
import X.C276310AsH;
import X.C284470BCz;
import X.C286110BJh;
import X.C286190BJp;
import X.C287990BQn;
import X.C288030BQr;
import X.C288080BQw;
import X.C294780Bgy;
import X.C302700Btk;
import X.C452501pT;
import X.C488600JEc;
import X.C496570Jdf;
import X.C584470Mw9;
import X.C584850Mwl;
import X.C616540OGe;
import X.C640270P9l;
import X.C641960PFy;
import X.C644060POa;
import X.C644210POp;
import X.C646000PVm;
import X.C650270Pez;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664030Q2v;
import X.C664410Q4h;
import X.C666820QDo;
import X.C667590QGn;
import X.C667620QGq;
import X.C667700QGy;
import X.C667750QHd;
import X.C668300QJg;
import X.C668470QJx;
import X.C668540QKe;
import X.C669070QMf;
import X.C669200QMs;
import X.C673070Qaf;
import X.C673090Qah;
import X.C679340Qkm;
import X.C680370QmR;
import X.C786410Ut5;
import X.C800330VaR;
import X.C823050WQl;
import X.EnumC669620QOi;
import X.EnumC671220QUm;
import X.InterfaceC1602960roc;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC313740CRo;
import X.InterfaceC650190Per;
import X.InterfaceC664090Q3b;
import X.InterfaceC668290QJf;
import X.InterfaceC668720QKw;
import X.InterfaceC669220QMu;
import X.InterfaceC669910QPl;
import X.InterfaceC722730SWp;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.AsS7S0000000_10;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.config.SearchSAFPlaceholderBitmapPreloadExp;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.keyword.SugKeywordViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.model.SearchIncentiveTaskScene;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.RichSugInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.viewmodel.SearchHistoryIconManagerVM;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.ui.SugLayoutManager;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS28S1201000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractSearchIntermediateFragmentNew extends AmeBaseFragment implements InterfaceC669220QMu, InterfaceC668290QJf, InterfaceC650190Per, InterfaceC313740CRo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public View LLILLJJLI;
    public View LLILLL;
    public RecyclerView LLILZ;
    public ViewGroup LLILZIL;
    public C496570Jdf LLILZLL;
    public RecyclerView LLIZ;
    public boolean LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public Fragment LLJIJIL;
    public C669070QMf LLJILJIL;
    public C668300QJg LLJILJILJ;
    public C0QJX LLJILLL;
    public SearchIntermediateViewModelNew LLJJ;
    public SearchStateViewModel LLJJI;
    public SearchKeywordPresenter LLJJIII;
    public SugKeywordPresenter LLJJIJI;
    public int LLJJIJIIJIL;
    public SearchSugMobHelper LLJJJ;
    public int LLJJJJ;
    public Integer LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public InterfaceC668720QKw LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public String LLJLIL;
    public boolean LLJLL;
    public volatile C0QJB LLJLLIL;
    public final C1608210rx5 LL = new C1608210rx5(this, C13LE.LJII(C0QJD.class));
    public String LLJJIJIL = "";
    public final C01GW LLJJJIL = C1935507i5.LIZ(new AwS554S0100000_10(this, 343));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 342));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractSearchIntermediateFragmentNew.class, "resultFragmentAbility", "getResultFragmentAbility()Lcom/ss/android/ugc/aweme/search/middle/communicate/ResultPageAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public void kS() {
        C0QJ5 c0qj5LIZJ;
        wS(1);
        InterfaceC668720QKw interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC668720QKw != null && (c0qj5LIZJ = interfaceC668720QKw.LIZJ()) != null) {
            c0qj5LIZJ.LIZLLL();
        }
        this.LLJJIJIL = "";
        C669070QMf c669070QMfBS = bS();
        c669070QMfBS.LLJJIII = true;
        List<SearchSugEntity> list = c669070QMfBS.LL;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR = VR();
            C786410Ut5.LJLLLLLL((iSearchBlankPageCoinTaskServiceVR == null || !iSearchBlankPageCoinTaskServiceVR.LJIILLIIL()) ? 8 : 4, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            ISearchIncentiveTaskBridgeService.LIZ.getClass();
            ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ();
            C786410Ut5.LJLLLLLL((iSearchIncentiveTaskBridgeServiceLIZ == null || !iSearchIncentiveTaskBridgeServiceLIZ.canShowBanner()) ? 8 : 4, view2);
        }
        C0Q2M.LIZ.getClass();
        C0Q2M.LJ();
        C584470Mw9.LJI();
    }

    private final String Js1() {
        SugKeywordPresenter sugKeywordPresenter = this.LLJJIJI;
        return sugKeywordPresenter != null ? sugKeywordPresenter.LIZ() : "";
    }

    public static ISearchBlankPageCoinTaskService VR() {
        ISearchBlankPageCoinTaskService.LIZ.getClass();
        return C650270Pez.LIZ();
    }

    public final C0QF6 NR() {
        return (C0QF6) this.LLJJJIL.getValue();
    }

    public final SearchIntermediateViewModelNew OR() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LLJJ;
        if (searchIntermediateViewModelNew != null) {
            return searchIntermediateViewModelNew;
        }
        return null;
    }

    public final RecyclerView PR() {
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    @Override // X.InterfaceC669220QMu
    public final void Pm() {
        if (this.LLJILJIL == null) {
            return;
        }
        C669070QMf c669070QMfBS = bS();
        String strJs1 = Js1();
        if (c669070QMfBS.LL == null || !strJs1.equals(c669070QMfBS.LLJILJIL)) {
            return;
        }
        for (SearchSugEntity searchSugEntity : (ArrayList) c669070QMfBS.LL) {
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo != null && sugExtraInfo.matchQuery()) {
                SearchSugMobHelper searchSugMobHelper = this.LLJJJ;
                if (searchSugMobHelper != null) {
                    String strLIZLLL = C1ER1.LIZIZ.LJLLL(getActivity(), this) ? C0PSI.LIZLLL(SR()) : "discovery";
                    C0QDA<C0QJA> c0qda = new C0QDA<C0QJA>() { // from class: X.0QJA
                    };
                    Word word = searchSugEntity.mWord;
                    c0qda.LJJJJL(word != null ? Integer.valueOf(word.getWordPosition()) : null);
                    c0qda.LJIIZILJ("words_source", "sug");
                    c0qda.LJIIZILJ("raw_query", searchSugMobHelper.LLILLJJLI);
                    c0qda.LJIIZILJ("words_content", searchSugEntity.content);
                    LogPbBean logPbBean = searchSugMobHelper.LL;
                    c0qda.LJIIZILJ("impr_id", logPbBean != null ? logPbBean.getImprId() : null);
                    RecommendWordMob recommendWordMob = searchSugMobHelper.LLILLL;
                    c0qda.LJIIZILJ("query_id", recommendWordMob != null ? recommendWordMob.getQueryId() : null);
                    Word word2 = searchSugEntity.mWord;
                    c0qda.LJIIZILJ("group_id", word2 != null ? word2.getId() : null);
                    c0qda.LJIIZILJ("search_position", strLIZLLL);
                    c0qda.LJIILJJIL();
                    return;
                }
                return;
            }
        }
    }

    public final ViewGroup RR() {
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final int SR() {
        InterfaceC669910QPl tabIndex;
        InterfaceC668720QKw interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC668720QKw == null || (tabIndex = interfaceC668720QKw.getTabIndex()) == null) {
            return -1;
        }
        return tabIndex.getTabIndex();
    }

    public final C0QJB UR() {
        C0QJB c0qjb = this.LLJLLIL;
        if (c0qjb == null) {
            synchronized (this) {
                c0qjb = this.LLJLLIL;
                if (c0qjb == null) {
                    SearchResultFragmentNew searchResultFragmentNewKQ = ((C0QJD) this.LL.getValue()).KQ();
                    this.LLJLLIL = searchResultFragmentNewKQ;
                    return searchResultFragmentNewKQ;
                }
            }
        }
        return c0qjb;
    }

    public final String ZR() {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context = getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        ComponentCallbacks2 componentCallbacks2LJFF = context != null ? SAFExtensionKt.LJFF(context) : null;
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            Fragment parentFragment = this;
            while (true) {
                if (!(parentFragment instanceof InterfaceC214902198i)) {
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == null) {
                        break;
                    }
                } else {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
            }
        }
        C19EG activity = getActivity();
        sAFHelper.getClass();
        return SAFHelper.LJJJJLL(interfaceC214902198i, activity) ? C0PSI.LJ(SR()) : "discovery";
    }

    public final C669070QMf bS() {
        C669070QMf c669070QMf = this.LLJILJIL;
        if (c669070QMf != null) {
            return c669070QMf;
        }
        return null;
    }

    public final void gS() {
        Context context;
        C641960PFy c641960PFy = ISearchIncentiveTaskBridgeService.LIZ;
        c641960PFy.getClass();
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ();
        if (iSearchIncentiveTaskBridgeServiceLIZ == null || !iSearchIncentiveTaskBridgeServiceLIZ.LJFF(null, null, SearchIncentiveTaskScene.MIDDLE_PAGE) || this.LLJI != null || (context = getContext()) == null) {
            return;
        }
        c641960PFy.getClass();
        ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ2 = C641960PFy.LIZ();
        this.LLJI = iSearchIncentiveTaskBridgeServiceLIZ2 != null ? iSearchIncentiveTaskBridgeServiceLIZ2.LJIILJJIL(context, this) : null;
    }

    public final void qS() {
        String strLIZIZ = C584850Mwl.LIZ.LIZIZ(bS().LLILLJJLI);
        C0QJ8 c0qj8 = new C0QJ8();
        c0qj8.LJIIZILJ("action_type", "show");
        c0qj8.LJIIZILJ("sug_keyword", Js1());
        c0qj8.LJIIZILJ("log_pb", strLIZIZ);
        c0qj8.LJIIZILJ("search_type", C0PSI.LIZ(SR()));
        c0qj8.LJIILJJIL();
    }

    @Override // X.InterfaceC669220QMu
    public final int WC() {
        return C0QPJ.LJIJJLI();
    }

    public final String WR() {
        String enterSearchFrom;
        C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
        return (c0qer == null || TextUtils.isEmpty(c0qer.getEnterSearchFrom()) || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) ? "" : enterSearchFrom;
    }

    @Override // X.InterfaceC668290QJf
    public final void Zj() {
        if (getActivity() != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG activity = getActivity();
            sAFHelper.getClass();
            if (SAFHelper.LJJJJJ(this, activity)) {
                return;
            }
            if (C20684815ws.LJI("ttk_sug_success_rate")) {
                C0QJ4 c0qj4 = new C0QJ4();
                c0qj4.LJIIZILJ("type", "no_data");
                c0qj4.LJIJJ(WR());
                c0qj4.LJJIJL(this.LLJJJJ);
                String strZR = ZR();
                if (strZR == null) {
                    strZR = WR();
                }
                c0qj4.LJIIZILJ("search_position", strZR);
                c0qj4.LJIILJJIL();
            }
            C1233040iBy c1233040iBy = new C1233040iBy(getContext());
            c1233040iBy.LIZIZ(R.string.m25);
            c1233040iBy.LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6 A[PHI: r5
      0x00d6: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:31:0x00a4, B:29:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.search.model.SearchHistory> cS() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew.cS():java.util.List");
    }

    public final void dS() {
        Context context;
        ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR = VR();
        if (iSearchBlankPageCoinTaskServiceVR == null || !iSearchBlankPageCoinTaskServiceVR.LJIILL() || this.LLJ != null || (context = getContext()) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ISearchCoinHintService.LIZ.getClass();
        ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
        ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR2 = VR();
        this.LLJ = iSearchBlankPageCoinTaskServiceVR2 != null ? iSearchBlankPageCoinTaskServiceVR2.LJII(context, this) : null;
        if (iSearchCoinHintServiceLIZ == null || !iSearchCoinHintServiceLIZ.LIZIZ()) {
            return;
        }
        iSearchCoinHintServiceLIZ.LJII(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    public final boolean hS() {
        return C650500PfM.LIZJ(C640270P9l.LIZ(this, getActivity()).LL);
    }

    public final boolean iS() {
        ECSearchEntranceData ecSearchEntranceData;
        C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
        if (!C650500PfM.LIZJ(c0qer)) {
            return false;
        }
        EnumC671220QUm disableSugStrategy = null;
        if (c0qer == null || c0qer.getEcSearchEntranceData() == null) {
            return false;
        }
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null) {
            disableSugStrategy = ecSearchEntranceData.getDisableSugStrategy();
        }
        return disableSugStrategy == EnumC671220QUm.DISABLE_REQUEST;
    }

    public void mS() {
        if (!C287990BQn.LIZ()) {
            this.LLJJL = false;
            OR().LLILZ = false;
            this.LLJJIJIL = Js1();
        }
        List<SearchHistory> listLJIIL = NR().LJIIL(C0QPJ.LJIJJLI());
        C0QEE c0qee = C0QEE.LIZ;
        c0qee.getClass();
        C0QEE.LJI(listLJIIL);
        if (C2452309jF.LIZ()) {
            List<SearchHistory> listLJ = NR().LJ(C0QPJ.LJIJJLI(), true);
            c0qee.getClass();
            C0QEE.LJII(listLJ);
        }
        C584470Mw9.LJIIIIZZ();
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("search_sug");
        if (interfaceC1602960rocLIZIZ != null) {
            C667590QGn.LIZ.getClass();
            String str = C667590QGn.LIZIZ;
            if (str == null) {
                str = "";
            }
            interfaceC1602960rocLIZIZ.LIZ("blankpage_id", str);
        }
        if (C20684815ws.LJI("ttk_sug_success_rate")) {
            if (C1839207Ig.LIZ()) {
                C01V1.LIZIZ(new AwS554S0100000_10(this, 346));
            } else {
                C0QJ4 c0qj4 = new C0QJ4();
                c0qj4.LJIIZILJ("type", "sug_begin");
                c0qj4.LJIJJ(WR());
                String strZR = ZR();
                if (strZR == null) {
                    strZR = WR();
                }
                c0qj4.LJIIZILJ("search_position", strZR);
                c0qj4.LJJIJL(this.LLJJJJ);
                c0qj4.LJIILJJIL();
            }
        }
        if (C302700Btk.LIZIZ() && !hS() && !C287990BQn.LIZ()) {
            wS(2);
        }
        if (!iS()) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZIZ().disableSug && !C287990BQn.LIZ()) {
                rS();
            }
        }
        if (!(PR().getAdapter() instanceof C669070QMf)) {
            PR().setAdapter(bS());
        }
        if (!C07CA.LIZ()) {
            bS().LLJJ.LIZJ.LIZJ(1);
        }
        wS(2);
    }

    public boolean nS() {
        InterfaceC668720QKw interfaceC668720QKw;
        C0QJ6 c0qj6LIZ;
        C0QJ6 c0qj6LIZ2;
        Integer numValueOf;
        C0PYE c0pye;
        C0QJ6 c0qj6LIZ3;
        C0QJ6 c0qj6LIZ4;
        C0QJ6 c0qj6LIZ5;
        C0QJ6 c0qj6LIZ6;
        C0QJ6 c0qj6LIZ7;
        C0QJ6 c0qj6LIZ8;
        if (!isViewValid() || !getUserVisibleHint()) {
            C0Q45 c0q45 = C0Q45.COMMON;
            C0Q54 c0q54 = C0Q54.COMMON;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search_intermediate_error isViewValid");
            sbLIZ.append(isViewValid());
            sbLIZ.append(" userVisibleHint");
            sbLIZ.append(getUserVisibleHint());
            C664410Q4h.LIZIZ(c0q45, c0q54, null, C2188811AlT.LIZIZ(sbLIZ), C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
            return false;
        }
        InterfaceC668720QKw interfaceC668720QKw2 = this.LLJJLIIIJLLLLLLLZ;
        Integer numValueOf2 = (interfaceC668720QKw2 == null || (c0qj6LIZ8 = interfaceC668720QKw2.LIZ()) == null) ? null : Integer.valueOf(c0qj6LIZ8.LIZ());
        if (C07IV.LIZ) {
            SearchHistoryIconManagerVM searchHistoryIconManagerVM = (SearchHistoryIconManagerVM) this.LLJLILLLLZIIL.getValue();
            if (searchHistoryIconManagerVM != null) {
                InterfaceC668720QKw interfaceC668720QKw3 = this.LLJJLIIIJLLLLLLLZ;
                C0QJ6 c0qj6LIZ9 = interfaceC668720QKw3 != null ? interfaceC668720QKw3.LIZ() : null;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getLastState() = ");
                sbLIZ2.append(c0qj6LIZ9 != null ? Integer.valueOf(c0qj6LIZ9.LJI()) : null);
                sbLIZ2.append(" getMiddleState() = ");
                sbLIZ2.append(c0qj6LIZ9 != null ? Integer.valueOf(c0qj6LIZ9.LIZ()) : null);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (c0qj6LIZ9 != null && c0qj6LIZ9.LJI() == 0 && (c0qj6LIZ9.LIZ() == 1 || c0qj6LIZ9.LIZ() == 2)) {
                    searchHistoryIconManagerVM.LLILLL = true;
                }
            }
            SearchHistoryIconManagerVM searchHistoryIconManagerVM2 = (SearchHistoryIconManagerVM) this.LLJLILLLLZIIL.getValue();
            if (searchHistoryIconManagerVM2 != null) {
                searchHistoryIconManagerVM2.LLILZLL = numValueOf2 != null && numValueOf2.intValue() == 1;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("refreshIntermediate getNewFixLastState = ");
        InterfaceC668720QKw interfaceC668720QKw4 = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ3.append((interfaceC668720QKw4 == null || (c0qj6LIZ7 = interfaceC668720QKw4.LIZ()) == null) ? null : Integer.valueOf(c0qj6LIZ7.LJI()));
        C2188811AlT.LIZIZ(sbLIZ3);
        InterfaceC668720QKw interfaceC668720QKw5 = this.LLJJLIIIJLLLLLLLZ;
        if ((interfaceC668720QKw5 == null || (c0qj6LIZ6 = interfaceC668720QKw5.LIZ()) == null || c0qj6LIZ6.LIZ() != this.LLJJIJIIJIL) && (interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ) != null && (c0qj6LIZ = interfaceC668720QKw.LIZ()) != null) {
            c0qj6LIZ.LIZLLL(this.LLJJIJIIJIL);
        }
        InterfaceC668720QKw interfaceC668720QKw6 = this.LLJJLIIIJLLLLLLLZ;
        if (!Intrinsics.LJFF(numValueOf2, (interfaceC668720QKw6 == null || (c0qj6LIZ5 = interfaceC668720QKw6.LIZ()) == null) ? null : Integer.valueOf(c0qj6LIZ5.LJI()))) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateNewFixLastState(mCurrentState) ");
            InterfaceC668720QKw interfaceC668720QKw7 = this.LLJJLIIIJLLLLLLLZ;
            sbLIZ4.append((interfaceC668720QKw7 == null || (c0qj6LIZ4 = interfaceC668720QKw7.LIZ()) == null) ? null : Integer.valueOf(c0qj6LIZ4.LIZ()));
            C2188811AlT.LIZIZ(sbLIZ4);
            InterfaceC668720QKw interfaceC668720QKw8 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC668720QKw8 != null && (c0qj6LIZ3 = interfaceC668720QKw8.LIZ()) != null) {
                c0qj6LIZ3.LIZIZ(numValueOf2);
            }
        }
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Context context = getContext();
        C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, c19egLIZIZ);
        Long l = (c650960Pg6LJII == null || (c0pye = c650960Pg6LJII.searchSessionModel) == null) ? null : c0pye.searchSessionId;
        InterfaceC668720QKw interfaceC668720QKw9 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC668720QKw9 == null || (c0qj6LIZ2 = interfaceC668720QKw9.LIZ()) == null || (numValueOf = Integer.valueOf(c0qj6LIZ2.LIZ())) == null) {
            return false;
        }
        if (numValueOf.intValue() == 1) {
            C0Q6U c0q6u = C0Q6U.LIZ;
            Context context2 = getContext();
            c0q6u.getClass();
            C0Q6U.LIZ(context2, 1, null, l, this);
            kS();
            BtmSDK.INSTANCE.onPageShow(this, null);
        } else {
            if (numValueOf.intValue() == 2) {
                C0Q6U c0q6u2 = C0Q6U.LIZ;
                Context context3 = getContext();
                c0q6u2.getClass();
                C0Q6U.LIZ(context3, 2, null, l, this);
                mS();
                BtmSDK.INSTANCE.onPageShow(this, null);
                return true;
            }
            if (numValueOf.intValue() == 0) {
                wS(0);
                C0QGT.LIZ();
                BtmSDK.INSTANCE.onPageHide(this, null);
                return true;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJ()) {
            ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR = VR();
            if (iSearchBlankPageCoinTaskServiceVR != null) {
                iSearchBlankPageCoinTaskServiceVR.LJIILJJIL(this.LLJ);
            }
            ISearchIncentiveTaskBridgeService.LIZ.getClass();
            ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ();
            if (iSearchIncentiveTaskBridgeServiceLIZ != null) {
                iSearchIncentiveTaskBridgeServiceLIZ.LJIIL(this.LLJI);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C669200QMs c669200QMs = bS().LLJJ;
        ((LinkedList) c669200QMs.LIZJ.LIZ).clear();
        ((LinkedList) ((AbstractC669180QMq) c669200QMs.LIZLLL.getValue()).LIZ).clear();
        C668300QJg c668300QJg = this.LLJILJILJ;
        if (c668300QJg != null) {
            C0QJO c0qjo = c668300QJg.LLILZLL;
            c0qjo.LIZJ.LIZ.clear();
            c0qjo.LIZLLL.LIZ.clear();
            c0qjo.LJ.LIZ.clear();
            c0qjo.LJFF.LIZ.clear();
            c0qjo.LJI.LIZ.clear();
        }
        if (((Boolean) C286190BJp.LIZIZ.getValue()).booleanValue()) {
            this.LLJIJIL = null;
        }
        if (((Boolean) C271620Aki.LIZ.getValue()).booleanValue()) {
            C0QJX c0qjx = this.LLJILLL;
            if (c0qjx == null) {
                c0qjx = null;
            }
            c0qjx.LLJI = null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() throws Throwable {
        View view;
        String string;
        CharSequence hint;
        Window window;
        super.onPause();
        C584470Mw9.LJI();
        C0QKL c0qkl = C0QKL.LIZ;
        if (C0QKL.LJFF == 1) {
            c0qkl.getClass();
            C0QKL.LJIIJ();
        } else {
            c0qkl.getClass();
        }
        if (((Boolean) C276310AsH.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (((Boolean) C286110BJh.LIZ.getValue()).booleanValue() || SearchSAFPlaceholderBitmapPreloadExp.LIZ()) {
            C19EG activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null || (view = window.getDecorView()) == null) {
                view = getView();
            }
            EditText editTextYr = UR().Yr();
            if (editTextYr == null || (hint = editTextYr.getHint()) == null || (string = hint.toString()) == null) {
                string = "";
            }
            if (view != null) {
                C680370QmR.LIZIZ(view, C680370QmR.LJFF(view.getContext()), string);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        if (this.LLJJIJIIJIL != 0) {
            if ((PR().getAdapter() instanceof C669070QMf) && PR().getAdapter().getItemCount() > 0) {
                if (C1839207Ig.LIZ()) {
                    C01V1.LIZIZ(new AwS554S0100000_10(this, 1327));
                } else {
                    qS();
                }
            }
            if (C07CA.LIZ()) {
                C669200QMs c669200QMs = bS().LLJJ;
                ((AbstractC669180QMq) c669200QMs.LIZLLL.getValue()).LIZJ(10);
                c669200QMs.LIZJ.LIZJ(1);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (isRegisterEventBus()) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (eventBusLIZLLL.LJIIJ(this)) {
                return;
            }
            eventBusLIZLLL.LJIJJ(this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (isRegisterEventBus()) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJJI(this);
            }
        }
        C0Q2M.LIZ.getClass();
        C0Q2M.LJ();
        new C667750QHd(this, this).LIZ(new C0Q3J("others"));
        SearchStateViewModel searchStateViewModel = this.LLJJI;
        if (searchStateViewModel == null) {
            searchStateViewModel = null;
        }
        searchStateViewModel.setSearchPageVisible(false);
        SearchStateViewModel searchStateViewModel2 = this.LLJJI;
        (searchStateViewModel2 != null ? searchStateViewModel2 : null).setIsLeavingSearch(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rS() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew.rS():void");
    }

    public final void sS() {
        boolean zLJI = MethodIDManager.LJI(137707);
        if (!iS()) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZIZ().disableSug) {
                this.LLJJL = false;
                OR().LLILZ = false;
                this.LLJJIJIL = Js1();
                wS(2);
                rS();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final boolean yS() {
        Map<?, ?> map;
        C0QJ5 c0qj5LIZJ;
        String strWR = WR();
        C667700QGy c667700QGy = (C667700QGy) new C667750QHd(this, this).LIZJ().LIZIZ();
        boolean z = c667700QGy.LIZ != 0 && System.currentTimeMillis() - c667700QGy.LIZ <= 15000;
        boolean z2 = Intrinsics.LJFF(strWR, "homepage_hot") || Intrinsics.LJFF(strWR, "homepage_follow") || Intrinsics.LJFF(strWR, "homepage_friends") || Intrinsics.LJFF(strWR, "homepage_now");
        C667700QGy c667700QGy2 = (C667700QGy) new C667750QHd(this, this).LIZJ().LIZIZ();
        c667700QGy2.getClass();
        boolean z3 = !C1837507Hp.LIZ() ? !((map = c667700QGy2.LIZIZ) == null || map.isEmpty()) : c667700QGy2.LIZJ != null;
        if (!z2) {
            return false;
        }
        InterfaceC668720QKw interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ;
        return (interfaceC668720QKw == null || (c0qj5LIZJ = interfaceC668720QKw.LIZJ()) == null || !c0qj5LIZJ.LIZIZ()) && z && !z3 && !hS();
    }

    private final void wS(int i) {
        C0QJX c0qjx = this.LLJILLL;
        Integer numValueOf = null;
        if (c0qjx == null) {
            c0qjx = null;
        }
        int i2 = this.LLJJIJIIJIL;
        c0qjx.getClass();
        if (i2 != i) {
            if (i2 == 0) {
                C823050WQl.LIZJ().submit(new ARunnableS110S0100000_10(c0qjx, 120));
            } else if (i == 0) {
                c0qjx.LLJJJIL = null;
                c0qjx.LLJJJJ = null;
            }
        }
        C0QKL c0qkl = C0QKL.LIZ;
        int i3 = this.LLJJIJIIJIL;
        c0qkl.getClass();
        C0QKL.LJFF = i;
        if (i3 != i && i3 == 1) {
            C0QKL.LJIIJ();
        }
        int i4 = this.LLJJIJIIJIL;
        boolean z = this.LLIZLLLIL;
        C496570Jdf c496570Jdf = this.LLILZLL;
        if (c496570Jdf != null) {
            numValueOf = Integer.valueOf(c496570Jdf.getScrollY());
        }
        if (C1823207Cc.LIZ() && numValueOf != null) {
            numValueOf.intValue();
            if (i4 == 1 && i != 1) {
                C667620QGq c667620QGq = C0QGZ.LIZ;
                int iIntValue = numValueOf.intValue();
                c667620QGq.getClass();
                C0QGZ.LIZ = new C667620QGq(z, iIntValue);
            }
        }
        this.LLJJIJIIJIL = i;
        if (Build.VERSION.SDK_INT < 30) {
            if (i == 1) {
                if (!this.LLJLL) {
                    this.LLJLL = true;
                    C19EG activity = getActivity();
                    if (activity != null) {
                        KeyboardUtils.LJ(16, activity, 240);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1 || !this.LLJLL) {
                return;
            }
            this.LLJLL = false;
            C19EG activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            KeyboardUtils.LJ(48, activity2, 240);
        }
    }

    public final SearchResultParam aS(SearchSugEntity searchSugEntity) throws Throwable {
        SearchStartViewModel searchStartViewModel;
        String sugHint;
        String str;
        String str2;
        boolean z;
        String penetrateInfo;
        String userId;
        String str3;
        String penetrateInfo2;
        String penetrateInfo3;
        String sugShopId;
        String strIsRichSugValue;
        String resultTab;
        C19EG activity = getActivity();
        String wordsType = null;
        if (activity != null) {
            searchStartViewModel = (SearchStartViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStartViewModel.class);
        } else {
            searchStartViewModel = null;
        }
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(searchSugEntity.content);
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        String str4 = "";
        if (sugExtraInfo == null || (sugHint = sugExtraInfo.getSugHint()) == null) {
            sugHint = "";
        }
        searchResultParam.setSugHint(sugHint);
        if (searchStartViewModel != null) {
            str = searchStartViewModel.LLJLL;
        } else {
            str = null;
        }
        searchResultParam.setBlankPageID(str);
        searchResultParam.setIsFromGeneralSug(true);
        searchResultParam.setSearchFrom("search_sug");
        if (C0QNF.LIZJ(searchSugEntity)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        searchResultParam.setSugType(str2);
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo2 != null && sugExtraInfo2.isGenerativeSug()) {
            z = true;
        } else {
            z = false;
        }
        searchResultParam.setSugGenerateType(Boolean.valueOf(z));
        String str5 = searchSugEntity.language;
        if (str5 == null) {
            str5 = "";
        }
        searchResultParam.setQueryLanguage(str5);
        searchResultParam.setOpenNewSearchContainer(false);
        SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo3 != null) {
            penetrateInfo = sugExtraInfo3.getPenetrateInfo();
        } else {
            penetrateInfo = null;
        }
        C0P7X.LIZ(new C0P9S("search_penetrate_info", penetrateInfo), searchResultParam);
        SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo4 != null && (resultTab = sugExtraInfo4.getResultTab()) != null) {
            if (Intrinsics.LJFF(resultTab, "general")) {
                searchResultParam.getSearchEnterParam().setTargetTab(EnumC669620QOi.TOP);
                searchResultParam.setLandTap("general");
            } else if (Intrinsics.LJFF(resultTab, "ecom")) {
                searchResultParam.getSearchEnterParam().setTargetTab(EnumC669620QOi.SHOP);
                searchResultParam.setLandTap("shop");
            }
        }
        PromotionInfo promotionInfo = searchSugEntity.promoteInfo;
        if (promotionInfo != null) {
            if (C123100dR.LIZ(promotionInfo.getPromotionText())) {
                searchResultParam.setFromPromotionText(promotionInfo.getPromotionText());
            }
            searchResultParam.setFromPromotionType(promotionInfo.getPromotionType());
        }
        SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo5 == null || (userId = sugExtraInfo5.getUserId()) == null) {
            userId = "";
        }
        searchResultParam.setSugUserId(userId);
        SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo6 != null && (strIsRichSugValue = sugExtraInfo6.isRichSugValue()) != null) {
            str4 = strIsRichSugValue;
        }
        searchResultParam.setIsRichSug(str4);
        SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo7 != null && (sugShopId = sugExtraInfo7.getSugShopId()) != null) {
            searchResultParam.setSugShopId(sugShopId);
        }
        SugExtraInfo sugExtraInfo8 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo8 != null && sugExtraInfo8.isLiveQuery() && C1828607Ee.LIZ()) {
            searchResultParam.setSugIsLiveSug(true);
        }
        searchResultParam.setWordsLabel(C668470QJx.LIZIZ(C668470QJx.LIZ(searchSugEntity)));
        RichSugInfo richSugInfo = searchSugEntity.richSugInfo;
        if (richSugInfo != null) {
            str3 = richSugInfo.sugReason;
        } else {
            str3 = null;
        }
        searchResultParam.setQueryRecommend(str3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C284470BCz.LIZ() && searchSugEntity.LJ()) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            SugExtraInfo sugExtraInfo9 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo9 != null) {
                penetrateInfo3 = sugExtraInfo9.getPenetrateInfo();
            } else {
                penetrateInfo3 = null;
            }
            Map<String, String> mapLLLLLZ = c1er1.LLLLLZ(penetrateInfo3);
            if (mapLLLLLZ != null) {
                linkedHashMap.putAll(mapLLLLLZ);
            }
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null) {
            SugExtraInfo sugExtraInfo10 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo10 != null) {
                penetrateInfo2 = sugExtraInfo10.getPenetrateInfo();
            } else {
                penetrateInfo2 = null;
            }
            Map<String, String> mapLJLJL = iEcomSearchService.LJLJL(penetrateInfo2);
            if (mapLJLJL != null) {
                linkedHashMap.putAll(mapLJLJL);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            searchResultParam.setSuggestWordsExtraMobMap(linkedHashMap);
        }
        SugExtraInfo sugExtraInfo11 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo11 != null) {
            wordsType = sugExtraInfo11.getWordsType();
        }
        if (C123100dR.LIZ(wordsType) && wordsType != null) {
            searchResultParam.setWordsExtraType(wordsType);
            if (searchSugEntity.LIZIZ()) {
                searchResultParam.setSetIconByWordsExtraType(true);
            }
        }
        return searchResultParam;
    }

    @Override // X.InterfaceC669220QMu
    public final void cI(SearchSugEntity searchSugEntity) throws Throwable {
        C666820QDo.LIZ.getClass();
        if (!C666820QDo.LIZ().enableSug) {
            return;
        }
        SearchResultParam searchResultParamAS = aS(searchSugEntity);
        if (TextUtils.isEmpty(searchResultParamAS.getKeyword())) {
            return;
        }
        C0POX.LIZ.getClass();
        searchResultParamAS.setPrefetchId(C0POX.LIZJ());
        searchResultParamAS.setPrefetchType("press");
        C1ER1.LIZIZ.u(getContext(), this, searchResultParamAS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0Qah] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewStub] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewStub] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void initView(View view) {
        boolean zLJIIJJI;
        ?? r2;
        ?? LJLLLL;
        int iLIZJ;
        Object c098200Yq;
        ViewStub viewStub;
        Object c098200Yq2;
        ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR;
        this.LLILZ = (RecyclerView) view.findViewById(R.id.t0q);
        PR().setTransitionGroup(true);
        RecyclerView recyclerViewPR = PR();
        SugLayoutManager sugLayoutManager = new SugLayoutManager(getContext());
        sugLayoutManager.LLILLJJLI = new InterfaceC722730SWp() { // from class: X.0QJ2
            @Override // X.InterfaceC722730SWp
            public final void LIZ() {
                String str;
                AbstractC21673619ry adapter = this.LIZ.PR().getAdapter();
                AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LIZ;
                abstractSearchIntermediateFragmentNew.getClass();
                try {
                    if ((adapter instanceof C669070QMf) && (str = ((C669070QMf) adapter).LLJILJIL) != null) {
                        C668170QIt c668170QItLIZ = C668200QIw.LIZ(str);
                        c668170QItLIZ.LJII = abstractSearchIntermediateFragmentNew.WR();
                        String strZR = abstractSearchIntermediateFragmentNew.ZR();
                        if (strZR == null) {
                            strZR = abstractSearchIntermediateFragmentNew.WR();
                        }
                        c668170QItLIZ.LJIIJJI = strZR;
                        c668170QItLIZ.LJIIJ = C644560PPy.LJIILIIL(abstractSearchIntermediateFragmentNew.LLJJJJ);
                        c668170QItLIZ.LIZIZ();
                        if (Intrinsics.LJFF(str, abstractSearchIntermediateFragmentNew.LLJJIJIL)) {
                            C584470Mw9.LJI();
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        };
        recyclerViewPR.setLayoutManager(sugLayoutManager);
        RecyclerView recyclerViewPR2 = PR();
        final Drawable drawableLIZIZ = C800330VaR.LIZIZ(PR().getContext(), R.drawable.d45);
        if (drawableLIZIZ == null) {
            drawableLIZIZ = new ColorDrawable();
        }
        recyclerViewPR2.addItemDecoration(new C0DXR(drawableLIZIZ) { // from class: X.0QJ3
            public final Drawable LL;

            {
                this.LL = drawableLIZIZ;
            }

            @Override // X.C0DXR
            public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildCount() < 2) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if ((linearLayoutManager.findLastVisibleItemPosition() - linearLayoutManager.findFirstVisibleItemPosition()) - 1 < 0) {
                    return;
                }
                this.LL.draw(canvas);
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                rect.set(0, 0, 0, this.LL.getIntrinsicHeight());
            }
        });
        PR().addOnScrollListener(new AsS7S0000000_10(1));
        ISearchCoinHintService.LIZ.getClass();
        ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
        int iLJIJ = 0;
        if (iSearchCoinHintServiceLIZ != null) {
            zLJIIJJI = iSearchCoinHintServiceLIZ.LJIIJJI();
        } else {
            zLJIIJJI = false;
        }
        ?? r3 = 0;
        ?? LJLLLL2 = 0;
        r3 = 0;
        if ((zLJIIJJI || ((iSearchCoinHintServiceLIZ != null && iSearchCoinHintServiceLIZ.LJFF()) || ((iSearchBlankPageCoinTaskServiceVR = VR()) != null && iSearchBlankPageCoinTaskServiceVR.LJIL()))) && this.LLILLJJLI == null) {
            View viewFindViewById = view.findViewById(R.id.e3u);
            if ((viewFindViewById instanceof ViewStub) && (LJLLLL = (ViewStub) viewFindViewById) != 0) {
                ISearchBlankPageCoinTaskService iSearchBlankPageCoinTaskServiceVR2 = VR();
                if (iSearchBlankPageCoinTaskServiceVR2 != null) {
                    iLIZJ = iSearchBlankPageCoinTaskServiceVR2.LIZJ();
                } else {
                    iLIZJ = 0;
                }
                LJLLLL.setLayoutResource(iLIZJ);
                try {
                    LJLLLL = C786410Ut5.LJLLLL(LJLLLL);
                    r2 = LJLLLL;
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C673070Qaf c673070Qaf = C673070Qaf.LIZ;
                    Context context = view.getContext();
                    c673070Qaf.getClass();
                    C673070Qaf.LIZJ(context);
                    try {
                        c098200Yq = C786410Ut5.LJLLLL(LJLLLL);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        C673090Qah.LIZIZ.LIZJ(null, "coin", "fail");
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    r2 = (View) c098200Yq;
                }
            } else {
                r2 = 0;
            }
            this.LLILLJJLI = r2;
        }
        if (this.LLILLL == null) {
            ISearchIncentiveTaskBridgeService.LIZ.getClass();
            ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ = C641960PFy.LIZ();
            if (iSearchIncentiveTaskBridgeServiceLIZ != null && iSearchIncentiveTaskBridgeServiceLIZ.LJIIJ()) {
                View viewFindViewById2 = view.findViewById(R.id.kko);
                if ((viewFindViewById2 instanceof ViewStub) && (viewStub = (ViewStub) viewFindViewById2) != null) {
                    ISearchIncentiveTaskBridgeService iSearchIncentiveTaskBridgeServiceLIZ2 = C641960PFy.LIZ();
                    if (iSearchIncentiveTaskBridgeServiceLIZ2 != null) {
                        iLJIJ = iSearchIncentiveTaskBridgeServiceLIZ2.LJIJ();
                    }
                    viewStub.setLayoutResource(iLJIJ);
                    try {
                        LJLLLL2 = C786410Ut5.LJLLLL(viewStub);
                        r3 = LJLLLL2;
                    } catch (Resources.NotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C673070Qaf c673070Qaf2 = C673070Qaf.LIZ;
                        Context context2 = view.getContext();
                        c673070Qaf2.getClass();
                        C673070Qaf.LIZJ(context2);
                        try {
                            c098200Yq2 = C786410Ut5.LJLLLL(viewStub);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                            C673090Qah.LIZIZ.LIZJ(LJLLLL2, "incentive", "fail");
                        }
                        ?? r32 = LJLLLL2;
                        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                            r32 = c098200Yq2;
                        }
                        r3 = (View) r32;
                    }
                }
                this.LLILLL = r3;
            }
        }
    }

    @Override // X.InterfaceC313740CRo
    public final void mO(String str) {
        C0QJX c0qjx = this.LLJILLL;
        C0QJX c0qjx2 = null;
        if (c0qjx == null) {
            c0qjx = null;
        }
        if (c0qjx.LLJILJIL.get(str) == null) {
            C668540QKe c668540QKeMR = MR(str, true);
            C0QJX c0qjx3 = this.LLJILLL;
            if (c0qjx3 != null) {
                c0qjx2 = c0qjx3;
            }
            c0qjx2.LJIIZILJ(c668540QKeMR, getActivity());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String editText;
        super.onCreate(bundle);
        this.LLJJ = (SearchIntermediateViewModelNew) C679340Qkm.LIZIZ(this, requireActivity()).get(SearchIntermediateViewModelNew.class);
        this.LLJJI = (SearchStateViewModel) C679340Qkm.LIZIZ(this, requireActivity()).get(SearchStateViewModel.class);
        this.LLJJIII = new SearchKeywordPresenter(requireActivity(), this);
        SugKeywordPresenter sugKeywordPresenter = new SugKeywordPresenter(requireActivity(), this);
        this.LLJJIJI = sugKeywordPresenter;
        SearchKeywordPresenter searchKeywordPresenter = this.LLJJIII;
        if (searchKeywordPresenter != null) {
            editText = searchKeywordPresenter.getEditText();
        } else {
            editText = "";
        }
        sugKeywordPresenter.LIZIZ(editText);
        SugKeywordPresenter sugKeywordPresenter2 = this.LLJJIJI;
        if (sugKeywordPresenter2 != null) {
            AObserverS214S0100000_10 aObserverS214S0100000_10 = new AObserverS214S0100000_10(this, 23);
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragment = sugKeywordPresenter2.LLILLJJLI;
            C19EG c19eg = sugKeywordPresenter2.LL;
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
            if (lifecycleOwnerLJIJJ != null) {
                ((LiveData) ((SugKeywordViewModel) sugKeywordPresenter2.LLILLL.getValue()).LL.getValue()).observe(lifecycleOwnerLJIJJ, aObserverS214S0100000_10);
            }
            sugKeywordPresenter2.getClass();
        }
        OR().vQ2().observe(this, new AObserverS214S0100000_10(this, 24));
        ((NextLiveData) OR().LLILLL.getValue()).observe(this, new AObserverS214S0100000_10(this, 25), true);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJJJ = (SearchSugMobHelper) C679340Qkm.LIZIZ(this, activity).get(SearchSugMobHelper.class);
        }
        SearchSugMobHelper searchSugMobHelper = this.LLJJJ;
        if (searchSugMobHelper != null) {
            searchSugMobHelper.LLILLJJLI = Js1();
            C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
            if (c0qer != null) {
                c0qer.getEnterSearchFrom();
            }
        }
        List<SearchHistory> listLJIIL = NR().LJIIL(C0QPJ.LJIJJLI());
        C0QEE c0qee = C0QEE.LIZ;
        c0qee.getClass();
        C0QEE.LJI(listLJIIL);
        if (C2452309jF.LIZ()) {
            List<SearchHistory> listLJ = NR().LJ(C0QPJ.LJIJJLI(), true);
            c0qee.getClass();
            C0QEE.LJII(listLJ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/middle/AbstractSearchIntermediateFragmentNew", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRmdKZ+yBTqM/C2Eipez+yLY5A58jVFj5fM6FI8xxVHCcp7yk5Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            nS();
        }
    }

    @Override // X.InterfaceC669220QMu
    public final void uy(SearchSugEntity searchSugEntity) {
        List<SearchSugEntity> list;
        List<SearchSugEntity> list2;
        C0QJX c0qjx = this.LLJILLL;
        if (c0qjx == null) {
            c0qjx = null;
        }
        c0qjx.LLJJI.remove(searchSugEntity.content);
        C0QEE c0qee = C0QEE.LIZ;
        String str = searchSugEntity.content;
        c0qee.getClass();
        List<? extends SearchHistory> list3 = C0QEE.LIZIZ;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList();
            for (SearchHistory searchHistory : list3) {
                if (!Intrinsics.LJFF(searchHistory.keyword, str)) {
                    arrayList.add(searchHistory);
                }
            }
            C0QEE.LJI(arrayList);
        }
        List<? extends SearchHistory> list4 = C0QEE.LIZLLL;
        if (list4 != null) {
            C0QEE c0qee2 = C0QEE.LIZ;
            ArrayList arrayList2 = new ArrayList();
            for (SearchHistory searchHistory2 : list4) {
                if (!Intrinsics.LJFF(searchHistory2.keyword, str)) {
                    arrayList2.add(searchHistory2);
                }
            }
            c0qee2.getClass();
            C0QEE.LJII(arrayList2);
        }
        SearchSugResponse searchSugResponse = c0qjx.LLJILLL;
        if (searchSugResponse != null && (list2 = searchSugResponse.sugList) != null) {
            for (SearchSugEntity searchSugEntity2 : list2) {
                if (searchSugEntity2.LIZJ() && searchSugEntity2.content.equals(searchSugEntity.content)) {
                    searchSugEntity2.sugType = "cache";
                }
            }
        }
        C823050WQl.LIZJ().submit(new ARunnableS110S0100000_10(c0qjx, 120));
        for (Map.Entry<String, SearchSugResponse> entry : c0qjx.LLJILJIL.entrySet()) {
            SearchSugResponse value = entry.getValue();
            if (value != null && (list = value.sugList) != null) {
                Iterator<SearchSugEntity> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        SearchSugEntity next = it2.next();
                        if (next.LIZJ() && next.content.equals(searchSugEntity.content)) {
                            c0qjx.LLJILJIL.remove(entry.getKey());
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:373:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0771  */
    @Override // X.InterfaceC668290QJf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HT(com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew.HT(com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse, int):void");
    }

    public final C668540QKe MR(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        Integer num;
        C664030Q2v c664030Q2v;
        C0QJN c0qjn;
        C0QJN c0qjn2;
        String strJs1 = str;
        String strLJFF = C0PSI.LJFF(SR());
        if (strLJFF == null) {
            strLJFF = "general";
        }
        C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity = getActivity();
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, activity);
        String strWR = "";
        if (c650960Pg6LJII == null || (c0qjn2 = c650960Pg6LJII.singleSearchEcommerceModel) == null || (str2 = c0qjn2.srcMaterialId) == null) {
            str2 = "";
        }
        C19EG activity2 = getActivity();
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII2 = C646000PVm.LJII(this, activity2);
        if (c650960Pg6LJII2 == null || (c0qjn = c650960Pg6LJII2.singleSearchEcommerceModel) == null || (str3 = c0qjn.srcAnchorProductId) == null) {
            str3 = "";
        }
        boolean zLIZJ = C650500PfM.LIZJ(c0qer);
        if (strJs1 == null) {
            strJs1 = Js1();
        }
        C19EG activity3 = getActivity();
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII3 = C646000PVm.LJII(this, activity3);
        if (c650960Pg6LJII3 == null || (c664030Q2v = c650960Pg6LJII3.searchVideoModel) == null || (str4 = c664030Q2v.groupId) == null) {
            str4 = "";
        }
        if (!zLIZJ) {
            str2 = "";
            str3 = "";
        } else if (SR() == -1) {
            strWR = WR();
        } else {
            String strLIZ = C0PSI.LIZ(SR());
            if (strLIZ != null) {
                strWR = strLIZ;
            }
        }
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        return new C668540QKe(strJs1, strLJFF, str4, null, null, null, null, null, null, null, null, "", 0, "", str2, str3, strWR, num, null, null, 1, null, z ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C668300QJg c668300QJg;
        super.onViewCreated(view, bundle);
        initView(view);
        C0QJX c0qjx = null;
        if (C0BRD.LIZ()) {
            RecyclerView recyclerView = this.LLIZ;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                this.LLJILJILJ = new C668300QJg(recyclerView, UR().vA());
            }
            RecyclerView recyclerView2 = this.LLIZ;
            if (recyclerView2 != null) {
                recyclerView2.setItemAnimator(null);
            }
            if (!C0BR9.LIZ() && (c668300QJg = this.LLJILJILJ) != null) {
                c668300QJg.LLILZLL.LIZIZ();
            }
            RecyclerView recyclerView3 = this.LLIZ;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.LLJILJILJ);
            }
        }
        this.LLJILJIL = new C669070QMf(getActivity(), PR());
        bS().LLILZ = this;
        bS().LLIZLLLIL = this.LLJJLIIIJLLLLLLLZ;
        bS().LLILLL = WR();
        C669070QMf c669070QMfBS = bS();
        String strZR = ZR();
        if (strZR == null) {
            strZR = WR();
        }
        c669070QMfBS.LLILZIL = strZR;
        OR().vQ2().observe(getViewLifecycleOwner(), new AObserverS214S0100000_10(this, 163));
        C0QJX c0qjx2 = new C0QJX(this, getActivity(), C1558360qeg.LJFF(this, null));
        this.LLJILLL = c0qjx2;
        c0qjx2.LLJIJIL = hS();
        C0QJX c0qjx3 = this.LLJILLL;
        if (c0qjx3 == null) {
            c0qjx3 = null;
        }
        c0qjx3.LLILZLL = MR(null, false);
        C0QJX c0qjx4 = this.LLJILLL;
        if (c0qjx4 != null) {
            c0qjx = c0qjx4;
        }
        c0qjx.LLILLJJLI = this;
        nS();
        if (C1828707Ef.LIZ() && !C05QG.LIZIZ) {
            C05QG.LIZIZ = true;
            ((ExecutorService) C1516330pYt.LIZ.getValue()).execute(new Runnable() { // from class: X.0Bti
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ABPreloadHelper@4d04.preloadForSug$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ABPreloadHelper@4d04.preloadForSug$1");
                }

                public static void LIZ() {
                    C1828907Eh.LIZ();
                    C1829007Ei.LIZ();
                    C302700Btk.LIZ();
                    C294590Bgf.LIZ();
                    C286100BJg.LIZ();
                    ((Number) C271880Al8.LIZ.getValue()).intValue();
                    ((Number) C0BQR.LIZ.getValue()).intValue();
                    C326640CrG.LIZIZ();
                    ((Number) C284240BCc.LIZ.getValue()).intValue();
                    C326640CrG.LIZIZ();
                    ((Number) C284230BCb.LIZ.getValue()).intValue();
                    C1828607Ee.LIZ();
                    C0BQS.LIZ();
                    C07CA.LIZ();
                    C1839207Ig.LIZ();
                }
            });
        }
        if (C287990BQn.LIZ()) {
            if (Intrinsics.LJFF(((LiveData) OR().LLILZLL.getValue()).getValue(), Boolean.TRUE)) {
                sS();
                ((LiveData) OR().LLILZLL.getValue()).setValue(Boolean.FALSE);
            }
            ((LiveData) OR().LLILZLL.getValue()).observe(this, new AObserverS214S0100000_10(this, 26));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS(com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse r50, java.util.Map<java.lang.String, java.lang.String> r51) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew.uS(com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        boolean z;
        Object obj;
        Fragment fragment;
        View viewTd;
        RecyclerView recyclerView;
        SearchMiddleMonitor.INSTANCE.fragmentCreateView();
        Context context = getContext();
        C19GS c19gs = null;
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
                    obj = (InterfaceC214902198i) parentFragment;
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        if (obj != null) {
            fragment = (Fragment) obj;
        } else {
            fragment = null;
        }
        this.LLJIJIL = fragment;
        C488600JEc c488600JEcLJIILIIL = SAFExtensionKt.LJIILIIL(fragment);
        if (C288030BQr.LIZ()) {
            if (!C07H0.LIZ()) {
                if (C288080BQw.LIZ() && getActivity() != null) {
                    viewTd = C21146717pB.LIZIZ(requireActivity(), R.layout.ex7, viewGroup, false);
                } else {
                    viewTd = C20673215v0.LIZLLL(R.layout.ex7, getActivity(), viewGroup, false);
                }
            } else if (C288080BQw.LIZ() && c488600JEcLJIILIIL != null) {
                viewTd = C21146717pB.LIZIZ(c488600JEcLJIILIIL, R.layout.ex7, viewGroup, false);
            } else {
                viewTd = SAFExtensionKt.LJJII(requireActivity(), layoutInflater.getContext(), R.layout.ex7, SAFExtensionKt.LJIILIIL(this.LLJIJIL));
            }
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex7, viewGroup, false);
        }
        this.LLILZIL = (ViewGroup) viewTd.findViewById(R.id.tq1);
        this.LLILZLL = (C496570Jdf) viewTd.findViewById(R.id.kwv);
        RecyclerView recyclerView2 = (RecyclerView) viewTd.findViewById(R.id.jpm);
        this.LLIZ = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setNestedScrollingEnabled(false);
        }
        if (C0BRD.LIZ() && (recyclerView = this.LLIZ) != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
        SearchMiddleMonitor.INSTANCE.fragmentCreateViewEnd();
        dS();
        gS();
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC669220QMu
    public final void Y9(int i, SearchSugEntity searchSugEntity, String str, String str2) throws Throwable {
        boolean z;
        InterfaceC668720QKw interfaceC668720QKw;
        C0QJ5 c0qj5LIZJ;
        C0QJ6 c0qj6LIZ;
        InterfaceC664090Q3b interfaceC664090Q3bLJII;
        C0QJ6 c0qj6LIZ2;
        String penetrateInfo;
        C0QJ5 c0qj5LIZJ2;
        HashMap<String, Long> mapLIZJ;
        boolean zLJI = MethodIDManager.LJI(71934);
        this.LLJJJJLIIL = true;
        if (C123100dR.LIZ(str2)) {
            this.LLJJL = true;
            C01V1.LIZJ(new C0QJC(this, searchSugEntity, str, i, str2));
            String string = UUID.randomUUID().toString();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//music/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str2);
            smartRouteBuildRoute.withParam("extra_music_from", "search_keyword_page");
            smartRouteBuildRoute.withParam("enter_method", "click_search_history_sug");
            smartRouteBuildRoute.withParam("process_id", string);
            smartRouteBuildRoute.withParam("send_enter_mob", true);
            String str3 = searchSugEntity.content;
            if (str3 == null) {
                str3 = "";
            }
            smartRouteBuildRoute.withParam("previous_search_query", str3);
            smartRouteBuildRoute.open(0, new OnActivityResultCallback() { // from class: X.0QJ7
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i2, int i3, Intent intent) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.0QJ9
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                }
            });
        } else {
            InterfaceC668720QKw interfaceC668720QKw2 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC668720QKw2 != null && (c0qj5LIZJ2 = interfaceC668720QKw2.LIZJ()) != null && (mapLIZJ = c0qj5LIZJ2.LIZJ()) != null) {
                mapLIZJ.put("search_sug", Long.valueOf(System.currentTimeMillis()));
            }
            SearchResultParam searchResultParamAS = aS(searchSugEntity);
            C644060POa.LIZ.getClass();
            C644060POa.LJIIIZ(1, searchResultParamAS);
            C01V1.LIZJ(AFwS196S0000000_10.get$arr$(744));
            this.LLJJL = true;
            C644210POp.LIZ.onEventStart(searchResultParamAS);
            if (C284470BCz.LIZ() && searchSugEntity.LJ()) {
                z = true;
            } else {
                z = false;
            }
            SearchStateViewModel searchStateViewModel = null;
            if (z) {
                C1ER1 c1er1 = C1ER1.LIZIZ;
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo != null) {
                    penetrateInfo = sugExtraInfo.getPenetrateInfo();
                } else {
                    penetrateInfo = null;
                }
                String strF = c1er1.f(null, penetrateInfo);
                if (C123100dR.LIZ(strF)) {
                    C0P7X.LIZ(new C0P9S("poi_card_id_list", strF), searchResultParamAS);
                }
            }
            Context context = getContext();
            C0QJX.LLJJL = 0L;
            C0QJX.LLJJLIIIJLLLLLLLZ = 0L;
            SearchStateViewModel searchStateViewModel2 = this.LLJJI;
            if (searchStateViewModel2 != null) {
                searchStateViewModel = searchStateViewModel2;
            }
            searchStateViewModel.setIsRefreshingData(true);
            if (!TextUtils.isEmpty(searchResultParamAS.getKeyword())) {
                C1ER1.LIZIZ.u(context, this, searchResultParamAS);
                InterfaceC668720QKw interfaceC668720QKw3 = this.LLJJLIIIJLLLLLLLZ;
                if (interfaceC668720QKw3 != null && (c0qj6LIZ2 = interfaceC668720QKw3.LIZ()) != null) {
                    c0qj6LIZ2.LJFF(0);
                }
                InterfaceC668720QKw interfaceC668720QKw4 = this.LLJJLIIIJLLLLLLLZ;
                if (interfaceC668720QKw4 != null && (interfaceC664090Q3bLJII = interfaceC668720QKw4.LJII()) != null) {
                    interfaceC664090Q3bLJII.LIZ(0);
                }
                Integer value = OR().vQ2().getValue();
                if ((value == null || value.intValue() != 0) && (interfaceC668720QKw = this.LLJJLIIIJLLLLLLLZ) != null && (c0qj5LIZJ = interfaceC668720QKw.LIZJ()) != null) {
                    c0qj5LIZJ.LIZ(searchResultParamAS);
                }
                InterfaceC668720QKw interfaceC668720QKw5 = this.LLJJLIIIJLLLLLLLZ;
                if (interfaceC668720QKw5 != null && (c0qj6LIZ = interfaceC668720QKw5.LIZ()) != null) {
                    c0qj6LIZ.LIZJ();
                }
            }
            C01V1.LIZJ(new AwS28S1201000_10(this, searchSugEntity, str, i, 2));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void oS(int i, SearchSugEntity searchSugEntity, String str, String str2) {
        String str3;
        String strLIZIZ = C584850Mwl.LIZ.LIZIZ(str);
        if (C0QNF.LIZJ(searchSugEntity)) {
            str3 = "enrich_sug";
        } else {
            str3 = "normal_sug";
        }
        C0QJ8 c0qj8 = new C0QJ8();
        c0qj8.LJIIZILJ("action_type", "click");
        c0qj8.LJIIZILJ("order", String.valueOf(Integer.valueOf(i)));
        c0qj8.LJIIZILJ("sug_keyword", Js1());
        c0qj8.LJIIZILJ("log_pb", strLIZIZ);
        c0qj8.LJIIZILJ("search_type", C0PSI.LIZ(SR()));
        c0qj8.LJIIZILJ("search_keyword", searchSugEntity.content);
        c0qj8.LJIIZILJ("sug_type", str3);
        if (C123100dR.LIZ(str2)) {
            c0qj8.LJ("words_label", "Sound");
        }
        c0qj8.LJIILJJIL();
    }
}
