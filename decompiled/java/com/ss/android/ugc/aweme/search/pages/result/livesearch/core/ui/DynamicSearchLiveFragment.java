package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui;

import X.AbstractC648910Pcn;
import X.C01GW;
import X.C036E;
import X.C0P7X;
import X.C0P91;
import X.C0PCY;
import X.C0PDE;
import X.C0PDF;
import X.C0PEM;
import X.C0PM7;
import X.C0PRC;
import X.C0PRF;
import X.C0PSG;
import X.C0PSX;
import X.C0PYW;
import X.C0PZ5;
import X.C0PZ6;
import X.C0PZ7;
import X.C0PZA;
import X.C0PZE;
import X.C0PZI;
import X.C0PZS;
import X.C0Q00;
import X.C0Q3E;
import X.C0Q3Q;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1227904rF;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1840707Iv;
import X.C19719612Di;
import X.C19719912Dl;
import X.C19EG;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C23250099c;
import X.C301880BsQ;
import X.C301940BsW;
import X.C326370Cqp;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C639820P7s;
import X.C640000P8k;
import X.C640090P8t;
import X.C640110P8v;
import X.C641110PCr;
import X.C644560PPy;
import X.C646200PWg;
import X.C647140PZw;
import X.C647260Pa8;
import X.C648410Pbz;
import X.C648420Pc0;
import X.C648890Pcl;
import X.C648900Pcm;
import X.C649040Pd0;
import X.C649290PdP;
import X.C653960Pkw;
import X.C662670Pyz;
import X.C663070Pzd;
import X.C663990Q2r;
import X.C666750QDh;
import X.C669480QNu;
import X.C724750Sbp;
import X.EnumC1609900rzo;
import X.EnumC642100PGm;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC486120J4o;
import X.InterfaceC644520PPu;
import X.InterfaceC648270Pbl;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.lynx.core.config.FieldSelectorConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.services.IMainService;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchLiveFragment extends DynamicSearchFragment implements InterfaceC644520PPu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiHELIOSJSYlLTYpKD0wIGsvJj02ZjAlZwsqJiQhICwALSQ+KicfITMpDz0yLygpJzs=";
    public final AssemVMLazy LLLIILIL;
    public final Gson LLLIL;
    public int LLLILZ;
    public long LLLILZJ;
    public String LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public final String LLLL;
    public InterfaceC648270Pbl LLLLII;
    public final boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public final C01GW LLLLIILL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DynamicSearchLiveFragment.class, "searchLiveVM", "getSearchLiveVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchlive/core/videmodel/SearchLiveViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final boolean BS() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return "live";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void kS() {
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC644520PPu
    public final boolean sq(String str) {
        return false;
    }

    public final n QS() {
        ISearchContextAbility iSearchContextAbilityLIZLLL;
        C0PCY<C640110P8v> c0pcySL1;
        C640110P8v c640110P8v;
        Map<String, Object> map;
        if (this.LLJIJIL == null) {
            return null;
        }
        n nVar = new n();
        SearchResultParam searchResultParam = this.LLJIJIL;
        if (searchResultParam == null || (iSearchContextAbilityLIZLLL = C0Q3E.LIZLLL(searchResultParam)) == null || (c0pcySL1 = iSearchContextAbilityLIZLLL.SL1()) == null || (c640110P8v = (C640110P8v) c0pcySL1.LIZJ()) == null || (map = c640110P8v.LLILLL) == null) {
            return null;
        }
        C0P7X.LIZ(new C640090P8t(null), this.LLJIJIL);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            nVar.LJJIIJ(entry.getKey(), entry.getValue().toString());
        }
        return nVar;
    }

    public final SearchLiveViewModel RS() {
        AssemVMLazy assemVMLazy = this.LLLIILIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILLL;
        return (SearchLiveViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void iS() {
        HashSet<Integer> hashSet;
        SearchStateViewModel searchStateViewModel = this.LLJZ;
        if (searchStateViewModel == null || (hashSet = searchStateViewModel.queryWordChangeInProcess) == null) {
            return;
        }
        hashSet.add(2);
    }

    public DynamicSearchLiveFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchLiveViewModel.class);
        this.LLLIILIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 557), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 558), AFwS241S0000000_10.get$arr$(268));
        this.LLLIL = new Gson();
        this.LLLILZ = -1;
        this.LLLILZLLLI = "";
        this.LLLJ = true;
        this.LLLL = "a2270.b0371";
        C644560PPy.LIZ.getClass();
        this.LLJILLL = C644560PPy.LJIIL();
        this.LLLLIIIILLL = true;
        this.LLLLIILL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 556));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (C1840707Iv.LIZ()) {
            C0PZ5.LIZ.getClass();
            C0PZ5.LIZIZ = null;
            C647140PZw.LIZ.LIZJ(this.LLLILZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        SearchStateViewModel searchStateViewModel;
        HashSet<Integer> hashSet;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(DynamicSearchLiveFragment.class.getName());
        }
        super.onResume();
        if (this.LLLLIIL || !(((searchStateViewModel = this.LLJZ) == null || (hashSet = searchStateViewModel.queryWordChangeInProcess) == null || !hashSet.contains(2)) && C1840707Iv.LIZ() && this.LLLJ && !this.LLLJIL && !this.LLLJL)) {
            this.LLLLII = null;
        } else if (getUserVisibleHint()) {
            C646200PWg.LIZIZ();
        }
        this.LLLLIIL = false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void yS() {
        SearchBaseSparkView searchBaseSparkView;
        super.yS();
        C19EG activity = getActivity();
        if (activity != null) {
            C0PZI c0pzi = this.LLLFZ;
            if (!(c0pzi instanceof C649290PdP) || (searchBaseSparkView = (SearchBaseSparkView) c0pzi) == null) {
                return;
            }
            searchBaseSparkView.LJI(new C648410Pbz(this, false, activity), new C648420Pc0(this, activity));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean NR() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLL;
    }

    public final void US(SearchLiveList searchLiveList) {
        long j;
        String imprId;
        LogPbBean logPbBean;
        if (C1840707Iv.LIZ()) {
            C647140PZw.LIZ.LIZJ(this.LLLILZ);
            C649040Pd0 c649040Pd0 = new C649040Pd0(new DynamicPatch());
            ArrayList arrayList = new ArrayList();
            if (searchLiveList != null) {
                List<SearchLiveStruct> listLJI = searchLiveList.LJI();
                if (listLJI != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : (ArrayList) listLJI) {
                        if (((SearchLiveStruct) obj).getType() == 1) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
                List<SearchLiveStruct> listLJ = searchLiveList.LJ();
                if (listLJ != null) {
                    arrayList.addAll(listLJ);
                }
            }
            c649040Pd0.LIZJ = arrayList;
            c649040Pd0.LIZLLL = (C640000P8k) this.LLLLIILL.getValue();
            c649040Pd0.LJ = true;
            this.LLLILZ = C647140PZw.LIZ.LIZIZ(c649040Pd0);
            if (searchLiveList != null) {
                j = searchLiveList.cursor;
            } else {
                j = 0;
            }
            this.LLLILZJ = j;
            if (searchLiveList == null || (logPbBean = searchLiveList.logPb) == null || (imprId = logPbBean.getImprId()) == null) {
                imprId = "";
            }
            this.LLLILZLLLI = imprId;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void enterLiveRoom(C0PZ7 c0pz7) {
        C0Q00 c0q00 = C0Q00.LIZ;
        getContext();
        LiveRoomStruct liveRoomStruct = c0pz7.LIZ;
        ArrayList<LiveRoomStruct> arrayList = c0pz7.LIZIZ;
        EnterRoomConfig enterRoomConfig = c0pz7.LIZLLL;
        long j = c0pz7.LIZJ;
        Boolean bool = c0pz7.LJ;
        InterfaceC486120J4o interfaceC486120J4o = new InterfaceC486120J4o() { // from class: X.0J8f
            @Override // X.InterfaceC486120J4o
            public final void LIZ(Aweme aweme, EnterRoomConfig enterRoomConfig2) {
            }

            @Override // X.InterfaceC486120J4o
            public final void LIZJ(Aweme aweme, EnterRoomConfig enterRoomConfig2) {
            }

            @Override // X.InterfaceC486120J4o
            public final void LIZIZ(Object obj, EnterRoomConfig enterRoomConfig2) {
                EnterRoomConfig.RoomsData roomsData;
                if (enterRoomConfig2 != null && enterRoomConfig2.mLogData != null) {
                    EnterRoomConfig.LogData logData = enterRoomConfig2.mLogData;
                    if (logData.search_result_id_v2 == null) {
                        if (obj instanceof LiveRoomStruct) {
                            logData.search_result_id_v2 = String.valueOf(((LiveRoomStruct) obj).id);
                        }
                        if ((obj instanceof Aweme) && (roomsData = enterRoomConfig2.mRoomsData) != null) {
                            enterRoomConfig2.mLogData.search_result_id_v2 = String.valueOf(roomsData.roomId);
                        }
                        enterRoomConfig2.mLogData.search_result_type = 2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("log callback ");
                        String str = enterRoomConfig2.mLogData.search_result_id_v2;
                        if (str == null) {
                            str = "";
                        }
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
        };
        c0q00.getClass();
        C0Q00.LIZLLL(liveRoomStruct, arrayList, enterRoomConfig, j, bool, this, interfaceC486120J4o);
    }

    @Override // X.C0PYZ
    public final void rL(C0PZI c0pzi) {
        String strLJIL;
        n nVar;
        k kVarLJJIIZ;
        C649290PdP c649290PdP = (C649290PdP) c0pzi;
        C19719612Di.LJJII(c649290PdP.LJIIIZ, new AbstractC648910Pcn[]{new C653960Pkw()});
        c649290PdP.LJIIIZ(C0Q3E.LIZIZ(this));
        if (C1840707Iv.LIZ()) {
            C19719612Di.LJJII(c649290PdP.LJIIIZ, new AbstractC648910Pcn[]{new C648900Pcm()});
        }
        try {
            SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
            if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.verticalLive) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-live/template.js&prefix=online/lynx/search-card&use_bdx=1";
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(strLJIL).buildUpon();
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = builderBuildUpon.toString();
            if (dynamicPatch != null) {
                c0pzi.LJFF(dynamicPatch, null, false, false, false, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void searchLiveLoadMore(C648890Pcl c648890Pcl) {
        Integer num;
        String sugGenerateType;
        String strLJLIL;
        if (!this.LLLIZZ) {
            SearchLiveViewModel searchLiveViewModelRS = RS();
            String strDS = dS();
            long j = this.LLLILZJ;
            C0PZS.LIZ.getClass();
            int i = ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalLive;
            String str = this.LLLILZLLLI;
            String str2 = this.LLJJ;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.LLJJIJI;
            String strLIZ = C0Q3Q.LIZ(lR().get(), this, this.LLJI);
            if (ComplianceServiceProvider.LJI().LJJII()) {
                num = 1;
            } else {
                num = null;
            }
            SearchResultParam searchResultParam = this.LLJI;
            if (searchResultParam != null) {
                sugGenerateType = searchResultParam.getSugGenerateType();
            } else {
                sugGenerateType = null;
            }
            C662670Pyz.LIZ.getClass();
            String strLIZ2 = C662670Pyz.LIZ();
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService != null) {
                strLJLIL = iEcomSearchService.LJLIL(null, "");
            } else {
                strLJLIL = null;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(searchLiveViewModelRS), C0PEM.LIZJ, null, new C647260Pa8(searchLiveViewModelRS, new SearchRequestParam(strDS, 0, str3, "live", 0, 0, str, "", j, i, str2, null, null, null, null, null, "", null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, null, null, strLIZ2, null, null, strLJLIL, null, null, 0, 0, 0, false, null, null, C2097608Jq.LJ()), null), 2);
            this.LLLIZZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        InterfaceC648270Pbl interfaceC648270Pbl;
        HashSet<Integer> hashSet;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/livesearch/core/ui/DynamicSearchLiveFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOQb4a/+RNYNYR7BRSAG1LbXZkZpXqdxClmkLf5tuiox6l2Pt9KjBXbhEAKCk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (C1840707Iv.LIZ()) {
            if (!z) {
                if ((C646200PWg.LIZJ() instanceof C663070Pzd) && this.LLLLII == null) {
                    this.LLLLII = C646200PWg.LIZJ();
                    if (C0PZE.LIZIZ() == 2) {
                        Iterator it2 = ((ArrayList) C646200PWg.LIZLLL().LIZ()).iterator();
                        while (it2.hasNext()) {
                            InterfaceC648270Pbl interfaceC648270Pbl2 = (InterfaceC648270Pbl) ((Reference) it2.next()).get();
                            if (interfaceC648270Pbl2 instanceof C663070Pzd) {
                                ((C663070Pzd) interfaceC648270Pbl2).LIZLLL();
                            }
                        }
                    } else {
                        C646200PWg.LIZ();
                    }
                }
            } else {
                SearchStateViewModel searchStateViewModel = this.LLJZ;
                if ((searchStateViewModel == null || (hashSet = searchStateViewModel.queryWordChangeInProcess) == null || !hashSet.contains(2)) && (interfaceC648270Pbl = this.LLLLII) != null) {
                    interfaceC648270Pbl.LLLLLIL();
                }
                this.LLLLII = null;
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(DynamicSearchLiveFragment.class);
        }
    }

    @Override // X.InterfaceC644520PPu
    public final void x(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", str);
        this.LLLLIIL = true;
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            c0pzi.sendEvent("verticalLiveBack", jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void GS(int i, C0PSG c0psg) throws Throwable {
        boolean zLIZIZ;
        Integer num;
        String sugGenerateType;
        Map<String, String> mapLJ;
        super.GS(i, c0psg);
        zS();
        this.LLLILZ = -1;
        this.LLLILZJ = 0L;
        this.LLLILZLLLI = "";
        getActivity();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        Object objLJLIL = null;
        if (!zLIZIZ) {
            SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLLIIL;
            if (searchNetworkStandardStatusVM != null) {
                objLJLIL = searchNetworkStandardStatusVM.LL;
            }
            EnumC642100PGm enumC642100PGm = EnumC642100PGm.REFRESH_NO_NETWORK_LOADING;
            if (objLJLIL == enumC642100PGm) {
                return;
            }
            if (searchNetworkStandardStatusVM != null) {
                searchNetworkStandardStatusVM.LL = enumC642100PGm;
            }
            View view = getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, this.LLLIIIL, 2500L);
                return;
            }
            return;
        }
        if (!this.LLLIZZ) {
            SearchLiveViewModel searchLiveViewModelRS = RS();
            String strDS = dS();
            C0PZS.LIZ.getClass();
            int i2 = ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalLive;
            String str = this.LLJJ;
            if (str == null) {
                str = "";
            }
            String str2 = this.LLJJIJI;
            String str3 = this.LLILZIL.searchId;
            C01GW<C669480QNu> c01gw = C669480QNu.LJ;
            String strLIZJ = C326370Cqp.LIZ().LIZJ();
            String strLIZ = C0Q3Q.LIZ(lR().get(), this, this.LLJI);
            if (ComplianceServiceProvider.LJI().LJJII()) {
                num = 1;
            } else {
                num = null;
            }
            SearchResultParam searchResultParam = this.LLJI;
            if (searchResultParam != null) {
                sugGenerateType = searchResultParam.getSugGenerateType();
            } else {
                sugGenerateType = null;
            }
            long j = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
            C662670Pyz.LIZ.getClass();
            String strLIZ2 = C662670Pyz.LIZ();
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService != null) {
                objLJLIL = iEcomSearchService.LJLIL(null, "");
            }
            Context context = getContext();
            if (context == null || (mapLJ = C0P91.LIZ(C641110PCr.LIZ(context, this))) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            searchLiveViewModelRS.vQ2(new SearchRequestParam(strDS, 0, str2, "live", 0, 0, "", str3, 0L, i2, str, null, null, null, null, null, strLIZJ, null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, Long.valueOf(j), null, strLIZ2, null, null, objLJLIL, null, null, 0, 0, 0, false, null, null, mapLJ));
            this.LLLIZZ = true;
        }
    }

    public final String NS(SearchLiveList searchLiveList, Exception exc) {
        List<String> list;
        long j;
        String str;
        int i;
        C0PCY<C0PRF> c0pcyWg1;
        C0PRF c0prf;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        C0PCY<C639820P7s> c0pcyWa0;
        C639820P7s c639820P7s;
        String str2;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        C0PCY<C0PM7> c0pcyAk0;
        C0PM7 c0pm7;
        C0PCY<C0PM7> c0pcyAk02;
        C0PM7 c0pm72;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC214902198i interfaceC214902198iF0 = F0();
        C19EG activity = getActivity();
        sAFHelper.getClass();
        ISearchContextAbility iSearchContextAbilityLJJIZ = SAFHelper.LJJIZ(activity, interfaceC214902198iF0);
        FieldSelectorConfig fieldSelectorConfig = (FieldSelectorConfig) C301940BsW.LIZJ.getValue();
        String str3 = null;
        if (fieldSelectorConfig != null && (list = fieldSelectorConfig.verticalLive) != null) {
            int i2 = -1;
            if (searchLiveList == null) {
                searchLiveList = new SearchLiveList();
                searchLiveList.status_code = -1;
            }
            n nVar = new n();
            C0PZ6.LIZ(searchLiveList, nVar, list);
            C1227904rF.LIZ.getClass();
            nVar.LJJIFFI("stageTimings", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), WX0()));
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            boolean z = C0PYW.LIZ;
            nVar.LJJIFFI("requestInfo", GsonProtectorUtils.toJsonTree(gsonLIZLLL, new RequestInfo(C0PYW.LIZLLL(this.LLJILLL))));
            nVar.LJJIII(Integer.valueOf(this.LLLILZ), fe.e);
            long j2 = 0;
            if (iSearchContextAbilityLJJIZ != null && (c0pcyAk02 = iSearchContextAbilityLJJIZ.ak0()) != null && (c0pm72 = (C0PM7) c0pcyAk02.LIZJ()) != null) {
                j = c0pm72.LL;
            } else {
                j = 0;
            }
            nVar.LJJIII(Long.valueOf(j), "searchSessionId");
            if (iSearchContextAbilityLJJIZ != null && (c0pcyAk0 = iSearchContextAbilityLJJIZ.ak0()) != null && (c0pm7 = (C0PM7) c0pcyAk0.LIZJ()) != null) {
                j2 = c0pm7.LLILLJJLI;
            }
            nVar.LJJIIJ("endToEndSearchSessionId", String.valueOf(j2));
            C0PRC c0prc3 = (C0PRC) C0Q3E.LIZIZ(this).Ph1().LIZJ();
            C0PZA c0pza = C0PZA.LIZ;
            String str4 = c0prc3.LLJLL;
            C0PSX c0psx = c0prc3.LLJLIL;
            c0pza.getClass();
            nVar.LJJIIJ("switchTabType", C0PZA.LIZ(str4, c0psx));
            String str5 = "";
            if (iSearchContextAbilityLJJIZ == null || (c0pcyWw1 = iSearchContextAbilityLJJIZ.Ww1()) == null || (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) == null || (str = c663990Q2r.LLILLJJLI) == null) {
                str = "";
            }
            nVar.LJJIIJ("enterFromSub", str);
            nVar.LJJIII(Integer.valueOf(ComplianceServiceProvider.LJI().LJJII() ? 1 : 0), "is_non_personalized_search");
            nVar.LJJIII(Integer.valueOf(C666750QDh.LIZ() ? 1 : 0), "is_hide_engagement_data");
            nVar.LJJIII(Integer.valueOf(((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).getStatusViewNeedShowForSearch(EnumC1609900rzo.SEARCH, exc)), "network_error_code");
            if (iSearchContextAbilityLJJIZ != null && (c0pcyWa0 = iSearchContextAbilityLJJIZ.Wa0()) != null && (c639820P7s = (C639820P7s) c0pcyWa0.LIZJ()) != null && (str2 = c639820P7s.LL) != null) {
                str5 = str2;
            }
            nVar.LJJIIJ("dynamicTabImprId", str5);
            if (iSearchContextAbilityLJJIZ != null && (c0pcyPh12 = iSearchContextAbilityLJJIZ.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
                i = c0prc2.LL;
            } else {
                i = -1;
            }
            nVar.LJJIII(Integer.valueOf(i), "searchTypePosition");
            if (iSearchContextAbilityLJJIZ != null && (c0pcyPh1 = iSearchContextAbilityLJJIZ.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                str3 = c0prc.LLJLL;
            }
            if (Intrinsics.LJFF(str3, "switch_tab") && iSearchContextAbilityLJJIZ != null && (c0pcyWg1 = iSearchContextAbilityLJJIZ.Wg1()) != null && (c0prf = (C0PRF) c0pcyWg1.LIZJ()) != null) {
                i2 = c0prf.LL;
            }
            nVar.LJJIII(Integer.valueOf(i2), "fromSearchSubtabPosition");
            nVar.LJJIFFI("extraNativeLogParams", QS());
            return GsonProtectorUtils.toJson(this.LLLIL, (k) nVar);
        }
        return PS(searchLiveList, exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[PHI: r22
      0x0121: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v3 java.lang.String), (r22v3 java.lang.String) binds: [B:61:0x011e, B:36:0x00c9, B:38:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String PS(com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList r28, java.lang.Exception r29) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.DynamicSearchLiveFragment.PS(com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList, java.lang.Exception):java.lang.String");
    }

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
    public final void VS(SearchLiveList searchLiveList, Exception exc) {
        long j;
        String str;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        C0PCY<C0PM7> c0pcyAk0;
        C0PM7 c0pm7;
        int statusViewNeedShowForSearch = ((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).getStatusViewNeedShowForSearch(EnumC1609900rzo.SEARCH, exc);
        if (searchLiveList == null) {
            searchLiveList = new SearchLiveList();
            searchLiveList.status_code = -1;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC214902198i interfaceC214902198iF0 = F0();
        C19EG activity = getActivity();
        sAFHelper.getClass();
        ISearchContextAbility iSearchContextAbilityLJJIZ = SAFHelper.LJJIZ(activity, interfaceC214902198iF0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchLiveData", GsonProtectorUtils.toJson(this.LLLIL, searchLiveList));
        Gson gson = this.LLLIL;
        boolean z = C0PYW.LIZ;
        jSONObject.put("requestInfo", GsonProtectorUtils.toJson(gson, new RequestInfo(C0PYW.LIZLLL(this.LLJILLL))));
        jSONObject.put(fe.e, this.LLLILZ);
        if (iSearchContextAbilityLJJIZ != null && (c0pcyAk0 = iSearchContextAbilityLJJIZ.ak0()) != null && (c0pm7 = (C0PM7) c0pcyAk0.LIZJ()) != null) {
            j = c0pm7.LL;
        } else {
            j = 0;
        }
        jSONObject.put("searchSessionId", j);
        if (iSearchContextAbilityLJJIZ == null || (c0pcyWw1 = iSearchContextAbilityLJJIZ.Ww1()) == null || (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) == null || (str = c663990Q2r.LLILLJJLI) == null) {
            str = "";
        }
        jSONObject.put("enterFromSub", str);
        jSONObject.put("is_non_personalized_search", ComplianceServiceProvider.LJI().LJJII() ? 1 : 0);
        jSONObject.put("is_hide_engagement_data", C666750QDh.LIZ() ? 1 : 0);
        jSONObject.put("network_error_code", statusViewNeedShowForSearch);
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            c0pzi.sendEvent("verticalLiveLoadMore", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        super.onViewCreated(view, bundle);
        AssemViewModel.asyncSubscribe$default(RS(), new C2217381BqS() { // from class: X.0PZR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 546), null, new AwS589S0100000_10(this, 547), 10, null);
        if (C1840707Iv.LIZ()) {
            AssemViewModel.asyncSubscribe$default(RS(), new C2217381BqS() { // from class: X.0PZV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C647210Pa3) obj).LLILLJJLI;
                }
            }, null, new AwS589S0100000_10(this, 548), null, new AwS589S0100000_10(this, 549), 10, null);
        }
        SearchStateViewModel searchStateViewModel = this.LLJZ;
        if (searchStateViewModel != null && (mutableLiveData3 = searchStateViewModel.isShowingFilters) != null) {
            mutableLiveData3.observe(this, new AObserverS214S0100000_10(this, 49));
        }
        SearchStateViewModel searchStateViewModel2 = this.LLJZ;
        if (searchStateViewModel2 != null && (mutableLiveData2 = searchStateViewModel2.shouldBlockMediaPlay) != null) {
            mutableLiveData2.observe(this, new AObserverS214S0100000_10(this, 50));
        }
        SearchStateViewModel searchStateViewModel3 = this.LLJZ;
        if (searchStateViewModel3 != null && (mutableLiveData = searchStateViewModel3.searchState) != null) {
            C0PDE c0pde = new C0PDE();
            c0pde.LL = new C0PDF() { // from class: X.0PZ8
                @Override // X.C0PDF
                public final void LIZ() {
                }

                @Override // X.C0PDF
                public final void LLFF() {
                }

                @Override // X.C0PDF
                public final void LIZIZ(boolean z) {
                    SearchStartViewModel searchStartViewModel;
                    NextLiveData<Integer> nextLiveDataYQ2;
                    if (z && (searchStartViewModel = this.LIZ.LLJLL) != null && (nextLiveDataYQ2 = searchStartViewModel.yQ2()) != null) {
                        Integer value = nextLiveDataYQ2.getValue();
                        C644560PPy.LIZ.getClass();
                        int iLJIIL = C644560PPy.LJIIL();
                        if (value != null && value.intValue() == iLJIIL) {
                            this.LIZ.LLLJ = true;
                            if (C1840707Iv.LIZ()) {
                                C646200PWg.LIZIZ();
                                return;
                            }
                            return;
                        }
                    }
                    this.LIZ.LLLJ = false;
                    C646200PWg.LIZ();
                }
            };
            mutableLiveData.observe(this, c0pde);
        }
        this.LLLLIIL = true;
        this.LLLJIL = false;
    }

    @Override // X.InterfaceC644520PPu
    public final void rq(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        List<SearchLiveStruct> list2;
        C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(this.LLLILZ);
        if (c649040Pd0LIZ != null && (list2 = c649040Pd0LIZ.LIZJ) != null) {
            ((ArrayList) list2).addAll(searchLiveList.LJI());
        }
        this.LLLILZJ = searchLiveList.cursor;
        VS(searchLiveList, null);
    }
}
