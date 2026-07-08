package com.ss.android.ugc.aweme.ecommerce.search.sug.ui;

import X.AnonymousClass0351;
import X.C01GW;
import X.C03IJ;
import X.C07E5;
import X.C0QF6;
import X.C0QOY;
import X.C0QP6;
import X.C0QP7;
import X.C0QPE;
import X.C0QT7;
import X.C0QT9;
import X.C0QTB;
import X.C0QTE;
import X.C0QTG;
import X.C0QTJ;
import X.C0QTN;
import X.C0QU1;
import X.C0QUT;
import X.C1233040iBy;
import X.C124000da;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C1935207i2;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C293720BfG;
import X.C650500PfM;
import X.C651580Ph6;
import X.C668260QJc;
import X.C670150QQj;
import X.C670800QSw;
import X.C670810QSx;
import X.C670830QSz;
import X.C671020QTs;
import X.C686950Qx3;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC530790Krl;
import X.InterfaceC665370Q7z;
import X.InterfaceC670870QTd;
import X.InterfaceC736910SvR;
import Y.ACallableS242S0200000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcSearchSugRequestCancelQueueConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSugAssem extends UISlotAssem implements ISearchSugSubPageAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public ConstraintLayout LLJJI;
    public final AssemVMLazy LLJJIII;
    public RecyclerView LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public C0QF6 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchSugAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/sug/vm/EcSearchSugAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EcSearchSugAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 157);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcSearchSugAssemVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 184), AFwS241S0000000_10.get$arr$(77), awS554S0100000_10, true);
        this.LLJJIJIIJIL = C1935207i2.LIZ(new AwS554S0100000_10(this, 156));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bs7;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void j72(SearchResultParam searchResultParam) {
    }

    public final C671020QTs hp() {
        return (C671020QTs) this.LLJJIJIIJIL.getValue();
    }

    public final ConstraintLayout ip() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uet) : null;
            this.LLJJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final EcSearchSugAssemVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (EcSearchSugAssemVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility
    public final void Pm() {
        String strJs1;
        C670830QSz c670830QSzPD2;
        C671020QTs c671020QTsHp = hp();
        ISearchSugContextAbility iSearchSugContextAbility = kp().LLILLL;
        if (iSearchSugContextAbility == null || (strJs1 = iSearchSugContextAbility.Js1()) == null) {
            strJs1 = "";
        }
        if (Intrinsics.LJFF(strJs1, c671020QTsHp.LLILZLL)) {
            for (SearchSugEntity searchSugEntity : (ArrayList) c671020QTsHp.LLIZ) {
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo != null && sugExtraInfo.matchQuery()) {
                    EcSearchSugAssemVM ecSearchSugAssemVMKp = kp();
                    ISearchSugContextAbility iSearchSugContextAbility2 = ecSearchSugAssemVMKp.LLILLL;
                    String str = (iSearchSugContextAbility2 == null || (c670830QSzPD2 = iSearchSugContextAbility2.pD2()) == null) ? null : c670830QSzPD2.LIZIZ;
                    ISearchSugContextAbility iSearchSugContextAbility3 = ecSearchSugAssemVMKp.LLILLL;
                    String strJs12 = iSearchSugContextAbility3 != null ? iSearchSugContextAbility3.Js1() : null;
                    LogPbBean logPbBean = ecSearchSugAssemVMKp.LLJI;
                    RecommendWordMob recommendWordMob = ecSearchSugAssemVMKp.LLJIJIL;
                    C670150QQj<C0QTG> c670150QQj = new C670150QQj<C0QTG>() { // from class: X.0QTG
                    };
                    Word word = searchSugEntity.mWord;
                    c670150QQj.LJIJ(word != null ? Integer.valueOf(word.getWordPosition()) : null);
                    c670150QQj.LJIILLIIL("words_source", "sug");
                    c670150QQj.LJIILLIIL("raw_query", strJs12);
                    c670150QQj.LJIILLIIL("words_content", searchSugEntity.content);
                    c670150QQj.LJIILLIIL("impr_id", logPbBean != null ? logPbBean.getImprId() : null);
                    c670150QQj.LJIILLIIL("query_id", recommendWordMob != null ? recommendWordMob.getQueryId() : null);
                    Word word2 = searchSugEntity.mWord;
                    c670150QQj.LJIILLIIL("group_id", word2 != null ? word2.getId() : null);
                    c670150QQj.LJIILLIIL("search_position", str);
                    c670150QQj.LJIILJJIL();
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJIIJ();
        if (C0QP7.LIZ != 0) {
            C0QP7.LIZIZ = System.currentTimeMillis();
        }
        C786410Ut5.LL(8, ip());
        ISearchSugContextAbility iSearchSugContextAbility = kp().LLILLL;
        if (iSearchSugContextAbility != null) {
            iSearchSugContextAbility.F61();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJIJIL = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        C0QTB c0qtb;
        super.onDestroy();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "leave");
        jSONObject.put("page_name", "search_sug");
        jSONObject.put("duration", this.LLJJJ - this.LLJJIJIL);
        jSONObject.put("root_enter_from_type", C650500PfM.LIZIZ(kp().LLILZ));
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_trace", jSONObject);
        C0QU1 c0qu1 = hp().LLJ;
        if (c0qu1 != null) {
            ((ConcurrentLinkedQueue) c0qu1.LIZJ.LIZ).clear();
            ((ConcurrentLinkedQueue) c0qu1.LIZLLL.LIZ).clear();
            ((ConcurrentLinkedQueue) c0qu1.LJ.LIZ).clear();
        }
        EventBus.LIZLLL().LJJI(this);
        if (C293720BfG.LIZ()) {
            EcSearchSugAssemVM ecSearchSugAssemVMKp = kp();
            ecSearchSugAssemVMKp.LLJILLL.clear();
            InterfaceC736910SvR<C0QTB> interfaceC736910SvR = ecSearchSugAssemVMKp.LLJILJIL;
            if (interfaceC736910SvR == null || (c0qtb = (C0QTB) interfaceC736910SvR.getOperator()) == null) {
                return;
            }
            c0qtb.onDestroy();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws Throwable {
        super.onParentSet();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(fragmentLJI, c19egLIZ);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, this, ISearchSugSubPageAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        this.LLJJJ = System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0QT4] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0QT3] */
    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        if (C124000da.LIZ()) {
            EcSearchSugAssemVM ecSearchSugAssemVMKp = kp();
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZIZ = AFwS293S0000000_10.get$arr$(42);
            subscribe(ecSearchSugAssemVMKp, c1770850wBP, null, new AwS624S0100000_10(this, 105));
        } else {
            EcSearchSugAssemVM ecSearchSugAssemVMKp2 = kp();
            subscribe(ecSearchSugAssemVMKp2, C736820SvI.LIZIZ(ecSearchSugAssemVMKp2.usedInReusedScene), null, new AwS624S0100000_10(this, 106));
        }
        C670800QSw.LIZ.getClass();
        if (((EcSearchSugRequestCancelQueueConfig) C670800QSw.LIZJ.getValue()).enable) {
            final EcSearchSugAssemVM ecSearchSugAssemVMKp3 = kp();
            final C19EG c19eg = ecSearchSugAssemVMKp3.LL;
            if (c19eg != null) {
                final View view = ecSearchSugAssemVMKp3.LLILLJJLI;
                final InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(ecSearchSugAssemVMKp3);
                final ?? r0 = new InterfaceC670870QTd() { // from class: X.0QT4
                    @Override // X.InterfaceC670870QTd
                    public final void LIZIZ(String str) {
                        C670810QSx c670810QSxS61;
                        ISearchSugContextAbility iSearchSugContextAbility = ecSearchSugAssemVMKp3.LLILLL;
                        if (iSearchSugContextAbility != null && (c670810QSxS61 = iSearchSugContextAbility.S61()) != null && c670810QSxS61.LIZJ) {
                            ((ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class)).LIZIZ(str);
                        } else {
                            C0QPE.LIZ.getClass();
                            ((ArrayList) C0QPE.LJ).add(str);
                        }
                    }

                    @Override // X.InterfaceC670870QTd
                    public final void LIZJ(long j, C670780QSu c670780QSu) throws JSONException {
                        ecSearchSugAssemVMKp3.yQ2(j, c670780QSu, "fail", null);
                        ecSearchSugAssemVMKp3.xQ2(j, "fail", null, 0, 0);
                        ecSearchSugAssemVMKp3.zQ2(Long.valueOf(j), "no_data");
                        ecSearchSugAssemVMKp3.setState(AFwS241S0000000_10.get$arr$(490));
                    }

                    @Override // X.InterfaceC670870QTd
                    public final void LIZ(final EcSearchSugResponse ecSearchSugResponse, boolean z, final String str, final long j) throws JSONException {
                        C0QUT c0qutLJJIJ;
                        int i;
                        ISearchSugContextAbility iSearchSugContextAbility = ecSearchSugAssemVMKp3.LLILLL;
                        String strJs1 = null;
                        if (iSearchSugContextAbility != null) {
                            c0qutLJJIJ = iSearchSugContextAbility.LJJIJ();
                        } else {
                            c0qutLJJIJ = null;
                        }
                        if (c0qutLJJIJ != C0QUT.SUG) {
                            ecSearchSugAssemVMKp3.LLJILLL.remove(Long.valueOf(j));
                            ecSearchSugAssemVMKp3.zQ2(Long.valueOf(j), "has_left");
                            return;
                        }
                        if (!z && ecSearchSugResponse.requestOrder.longValue() < C0QT6.LIZ.LIZ(true)) {
                            C670780QSu c670780QSu = ecSearchSugResponse.LLILZ;
                            if (c670780QSu != null) {
                                c670780QSu.LJI = true;
                            }
                            ISearchSugContextAbility iSearchSugContextAbility2 = ecSearchSugAssemVMKp3.LLILLL;
                            if (iSearchSugContextAbility2 != null) {
                                strJs1 = iSearchSugContextAbility2.Js1();
                            }
                            String str2 = ecSearchSugAssemVMKp3.LLJJ;
                            if (str2 != null && str2.length() != 0 && !Intrinsics.LJFF(ecSearchSugAssemVMKp3.LLJJ, strJs1)) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            ecSearchSugAssemVMKp3.yQ2(j, ecSearchSugResponse.LLILZ, "stale", null);
                            ecSearchSugAssemVMKp3.xQ2(j, "stale", null, i, 0);
                            ecSearchSugAssemVMKp3.zQ2(Long.valueOf(j), "sug_order_failed");
                            return;
                        }
                        C0QT6 c0qt6 = C0QT6.LIZ;
                        long jLongValue = ecSearchSugResponse.requestOrder.longValue();
                        synchronized (c0qt6) {
                            try {
                                C0QT6.LIZJ = jLongValue;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        EcSearchSugAssemVM ecSearchSugAssemVM = ecSearchSugAssemVMKp3;
                        ecSearchSugAssemVM.LLJI = ecSearchSugResponse.logPb;
                        ecSearchSugAssemVM.LLJIJIL = ecSearchSugResponse.recommendWordMob;
                        C15O7 c15o7LIZJ = C15O7.LIZJ(new ACallableS242S0200000_10(ecSearchSugAssemVM, c19eg, ecSearchSugResponse, 7));
                        final EcSearchSugAssemVM ecSearchSugAssemVM2 = ecSearchSugAssemVMKp3;
                        c15o7LIZJ.LJ(new InterfaceC2385309Wh() { // from class: X.0QT5
                            @Override // X.InterfaceC2385309Wh
                            public final Object then(C15O7 c15o7) throws JSONException {
                                String str3;
                                C1C7U.LIZ("EcSearchSugAssemVM@477d.initOpt$1$1$onSuccess$2");
                                if (Intrinsics.LJFF(ecSearchSugAssemVM2.LLILZIL, ecSearchSugResponse.LLILLJJLI)) {
                                    ecSearchSugAssemVM2.LLILLL.Mp(true);
                                }
                                String str4 = "no_data";
                                if (((List) c15o7.LJIIL()).isEmpty()) {
                                    str3 = "no_data";
                                } else {
                                    str3 = str;
                                    str4 = "success";
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                EcSearchSugAssemVM ecSearchSugAssemVM3 = ecSearchSugAssemVM2;
                                EcSearchSugResponse ecSearchSugResponse2 = ecSearchSugResponse;
                                ecSearchSugAssemVM3.LLJJ = ecSearchSugResponse2.LLILLJJLI;
                                long j2 = j;
                                ecSearchSugAssemVM3.yQ2(j2, ecSearchSugResponse2.LLILZ, str4, Long.valueOf(jCurrentTimeMillis - j2));
                                EcSearchSugAssemVM ecSearchSugAssemVM4 = ecSearchSugAssemVM2;
                                long j3 = j;
                                ecSearchSugAssemVM4.xQ2(j3, str4, Long.valueOf(jCurrentTimeMillis - j3), 0, 1);
                                ecSearchSugAssemVM2.zQ2(Long.valueOf(j), str3);
                                ecSearchSugAssemVM2.setState(new AwS376S0200000_10(ecSearchSugResponse, (EcSearchSugResponse) c15o7, (C15O7<List<SearchSugEntity>>) 107));
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("EcSearchSugAssemVM@477d.initOpt$1$1$onSuccess$2");
                                return unit;
                            }
                        }, C15O7.LJIIIIZZ, null);
                    }
                };
                ecSearchSugAssemVMKp3.LLJILJIL = new InterfaceC736910SvR<C0QTB>(view, c19eg, viewModelScope, r0) { // from class: X.0QTC
                    public final C0QTU LL;

                    @Override // X.InterfaceC736910SvR
                    public final void release() {
                    }

                    @Override // X.InterfaceC736910SvR
                    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                        return this.LL;
                    }

                    {
                        this.LL = new C0QTU(view, c19eg, viewModelScope, r0);
                    }
                };
            }
        } else {
            final EcSearchSugAssemVM ecSearchSugAssemVMKp4 = kp();
            final C19EG c19eg2 = ecSearchSugAssemVMKp4.LL;
            if (c19eg2 != null) {
                final View view2 = ecSearchSugAssemVMKp4.LLILLJJLI;
                final InterfaceC497601wk viewModelScope2 = ViewModelKt.getViewModelScope(ecSearchSugAssemVMKp4);
                final ?? r02 = new InterfaceC670870QTd() { // from class: X.0QT3
                    @Override // X.InterfaceC670870QTd
                    public final void LIZIZ(String str) {
                        C670810QSx c670810QSxS61;
                        ISearchSugContextAbility iSearchSugContextAbility = ecSearchSugAssemVMKp4.LLILLL;
                        if (iSearchSugContextAbility != null && (c670810QSxS61 = iSearchSugContextAbility.S61()) != null && c670810QSxS61.LIZJ) {
                            ((ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class)).LIZIZ(str);
                        } else {
                            C0QPE.LIZ.getClass();
                            ((ArrayList) C0QPE.LJ).add(str);
                        }
                    }

                    @Override // X.InterfaceC670870QTd
                    public final void LIZJ(long j, C670780QSu c670780QSu) {
                        ecSearchSugAssemVMKp4.zQ2(Long.valueOf(j), "no_data");
                        ecSearchSugAssemVMKp4.setState(AFwS241S0000000_10.get$arr$(489));
                    }

                    @Override // X.InterfaceC670870QTd
                    public final void LIZ(final EcSearchSugResponse ecSearchSugResponse, boolean z, final String str, final long j) {
                        C0QUT c0qutLJJIJ;
                        ISearchSugContextAbility iSearchSugContextAbility = ecSearchSugAssemVMKp4.LLILLL;
                        if (iSearchSugContextAbility != null) {
                            c0qutLJJIJ = iSearchSugContextAbility.LJJIJ();
                        } else {
                            c0qutLJJIJ = null;
                        }
                        if (c0qutLJJIJ != C0QUT.SUG) {
                            ecSearchSugAssemVMKp4.zQ2(Long.valueOf(j), "has_left");
                            return;
                        }
                        if (!z && ecSearchSugResponse.requestOrder.longValue() < C0QT6.LIZ.LIZ(false)) {
                            ecSearchSugAssemVMKp4.zQ2(Long.valueOf(j), "sug_order_failed");
                            return;
                        }
                        long jLongValue = ecSearchSugResponse.requestOrder.longValue();
                        C0QTB.LJJLIIIJJIZ.getClass();
                        C0QTH.LIZJ = jLongValue;
                        EcSearchSugAssemVM ecSearchSugAssemVM = ecSearchSugAssemVMKp4;
                        ecSearchSugAssemVM.LLJI = ecSearchSugResponse.logPb;
                        ecSearchSugAssemVM.LLJIJIL = ecSearchSugResponse.recommendWordMob;
                        C15O7 c15o7LIZJ = C15O7.LIZJ(new ACallableS242S0200000_10(ecSearchSugAssemVM, c19eg2, ecSearchSugResponse, 6));
                        final EcSearchSugAssemVM ecSearchSugAssemVM2 = ecSearchSugAssemVMKp4;
                        c15o7LIZJ.LJ(new InterfaceC2385309Wh() { // from class: X.0QT2
                            @Override // X.InterfaceC2385309Wh
                            public final Object then(C15O7 c15o7) {
                                String str2;
                                C1C7U.LIZ("EcSearchSugAssemVM@477d.init$1$1$onSuccess$2");
                                if (Intrinsics.LJFF(ecSearchSugAssemVM2.LLILZIL, ecSearchSugResponse.LLILLJJLI)) {
                                    ecSearchSugAssemVM2.LLILLL.Mp(true);
                                }
                                if (((List) c15o7.LJIIL()).isEmpty()) {
                                    str2 = "no_data";
                                } else {
                                    str2 = str;
                                }
                                ecSearchSugAssemVM2.zQ2(Long.valueOf(j), str2);
                                ecSearchSugAssemVM2.setState(new AwS376S0200000_10(ecSearchSugResponse, (EcSearchSugResponse) c15o7, (C15O7<List<SearchSugEntity>>) 106));
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("EcSearchSugAssemVM@477d.init$1$1$onSuccess$2");
                                return unit;
                            }
                        }, C15O7.LJIIIIZZ, null);
                    }
                };
                ecSearchSugAssemVMKp4.LLJILJIL = new InterfaceC736910SvR<C0QTB>(view2, c19eg2, viewModelScope2, r02) { // from class: X.0QTD
                    public final C0QTV LL;

                    @Override // X.InterfaceC736910SvR
                    public final void release() {
                    }

                    @Override // X.InterfaceC736910SvR
                    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                        return this.LL;
                    }

                    {
                        this.LL = new C0QTV(view2, c19eg2, viewModelScope2, r02);
                    }
                };
            }
        }
        hp().LLILLL = new C0QT7(this);
        hp().LLILZ = kp().AQ2();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final C0QUT Zs2() {
        return C0QUT.SUG;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        super.Eo(context);
        return context;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e2  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XE1(X.C0QWA r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem.XE1(X.0QWA):void");
    }

    public final void lp(C0QT9 c0qt9) {
        List<? extends SearchSugEntity> list;
        C0QUT c0qutLJJIJ;
        Boolean bool = c0qt9.LLILLL;
        boolean z = true;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            EcSearchSugResponse ecSearchSugResponse = c0qt9.LL;
            if (ecSearchSugResponse != null && (list = c0qt9.LLILLJJLI) != null && this.LLILZ) {
                ISearchSugContextAbility iSearchSugContextAbility = kp().LLILLL;
                if (iSearchSugContextAbility != null) {
                    c0qutLJJIJ = iSearchSugContextAbility.LJJIJ();
                } else {
                    c0qutLJJIJ = null;
                }
                if (c0qutLJJIJ == C0QUT.SUG) {
                    C671020QTs c671020QTsHp = hp();
                    c671020QTsHp.getClass();
                    c671020QTsHp.LLILZIL = ecSearchSugResponse.requestId;
                    c671020QTsHp.LLILZLL = ecSearchSugResponse.LLILLJJLI;
                    if (Intrinsics.LJFF("1", ecSearchSugResponse.sugVirtualEnable)) {
                        ((ArrayList) hp().LLIZ).clear();
                    } else {
                        C671020QTs c671020QTsHp2 = hp();
                        ((ArrayList) c671020QTsHp2.LLIZ).clear();
                        ((ArrayList) c671020QTsHp2.LLIZ).addAll(list);
                    }
                    C671020QTs c671020QTsHp3 = hp();
                    c671020QTsHp3.getClass();
                    C0QTJ.LIZ.getClass();
                    List arrayList = ecSearchSugResponse.sugList;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((SearchSugEntity) obj).LIZJ()) {
                            arrayList2.add(obj);
                        }
                    }
                    if (arrayList2.size() < 5 || Intrinsics.LJFF("1", ecSearchSugResponse.sugVirtualEnable)) {
                        z = false;
                    }
                    SearchSugEntity searchSugEntity = c671020QTsHp3.LLIZLLLIL;
                    if (searchSugEntity == null) {
                        searchSugEntity = new SearchSugEntity();
                        searchSugEntity.LIZ = 3;
                        c671020QTsHp3.LLIZLLLIL = searchSugEntity;
                    }
                    if (z) {
                        ((ArrayList) c671020QTsHp3.LLIZ).add(searchSugEntity);
                    } else {
                        ((ArrayList) c671020QTsHp3.LLIZ).remove(searchSugEntity);
                    }
                    hp().notifyDataSetChanged();
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            if (C724240Sb0.LIZ(this) != null) {
                SAFHelper sAFHelper = SAFHelper.LIZ;
                Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(getContentView());
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                sAFHelper.getClass();
                if (!SAFHelper.LJJJJJ(fragmentLIZLLL, c19egLIZ)) {
                    C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                    c1233040iBy.LIZIZ(R.string.m25);
                    c1233040iBy.LIZLLL();
                    return;
                }
                return;
            }
            return;
        }
        if (bool != null) {
            throw new C1954807lC();
        }
    }

    @C14EU
    public final void onSugSessionEndEvent(AnonymousClass0351 anonymousClass0351) {
        C0QTB c0qtb;
        InterfaceC736910SvR<C0QTB> interfaceC736910SvR = kp().LLJILJIL;
        if (interfaceC736910SvR != null && (c0qtb = (C0QTB) interfaceC736910SvR.getOperator()) != null) {
            c0qtb.LJJLIIIJLJLI();
        }
        if (anonymousClass0351.LIZ == 3 && C0QP7.LIZ != 0) {
            C0QP7.LIZIZ = System.currentTimeMillis();
            ISearchSugContextAbility iSearchSugContextAbility = kp().LLILLL;
            if (iSearchSugContextAbility != null) {
                iSearchSugContextAbility.i50();
            }
        }
    }

    @Override // X.C0QPH
    public final void pc(C0QUT c0qut, C0QUT c0qut2) {
        boolean z;
        InterfaceC530790Krl interfaceC530790Krl;
        C0QTN inflater;
        C670810QSx c670810QSxS61;
        ISearchSugContextAbility iSearchSugContextAbility = kp().LLILLL;
        if (iSearchSugContextAbility != null && (c670810QSxS61 = iSearchSugContextAbility.S61()) != null && c670810QSxS61.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C0QUT c0qut3 = C0QUT.RESULT;
            if (c0qut == c0qut3 && c0qut2 == C0QUT.SUG) {
                C668260QJc.LIZJ = true;
            }
            if (c0qut == c0qut3) {
                C668260QJc.LIZLLL = "";
                C668260QJc.LIZ = "";
                C668260QJc.LIZIZ = 0L;
                C668260QJc.LIZJ = false;
            }
        }
        if (c0qut2 != C0QUT.SUG) {
            kp().LLIZ = "";
            if (C124000da.LIZ()) {
                kp().LLILZLL = true;
            }
            C0QTE.LIZ = 0L;
            C0QTE.LIZIZ = 0L;
        }
        if (c0qut2 == C0QUT.SUGGEST) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            View viewLJJIJL = LJJIJL();
            Context context = getContext();
            C19EG c19egLIZIZ = null;
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            }
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(viewLJJIJL, c19egLIZIZ);
            if ((lifecycleOwnerLJIJI instanceof InterfaceC530790Krl) && (interfaceC530790Krl = (InterfaceC530790Krl) lifecycleOwnerLJIJI) != null && (inflater = interfaceC530790Krl.getInflater()) != null && (!inflater.LIZ(R.layout.br_) || !inflater.LIZ(R.layout.br9) || !inflater.LIZ(R.layout.bra))) {
                C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS110S0100000_10(interfaceC530790Krl, 210));
            }
            C668260QJc.LIZJ = false;
            C0QPE c0qpe = C0QPE.LIZ;
            ISearchMiddleForECService iSearchMiddleForECService = (ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            c0qpe.getClass();
            C0QP6.LIZ.getClass();
            if (C0QP6.LIZ(c19egLIZ)) {
                if (iSearchMiddleForECService != null) {
                    iSearchMiddleForECService.LJFF();
                }
            } else {
                try {
                    ((ArrayList) C0QPE.LIZJ).clear();
                    ((ArrayList) C0QPE.LIZLLL).clear();
                    ((ArrayList) C0QPE.LJ).clear();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            kp().LLILZIL = "";
            if (C124000da.LIZ()) {
                if (this.LLJJIJI != null && (!((ArrayList) hp().LLIZ).isEmpty())) {
                    ((ArrayList) hp().LLIZ).clear();
                    hp().notifyDataSetChanged();
                }
            } else {
                ((ArrayList) hp().LLIZ).clear();
            }
            C0QOY.LIZ(3);
        }
    }

    @Override // X.C0QPH
    public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
        if (c0qut == C0QUT.RESULT && c0qut2 == C0QUT.SUG) {
            C0QOY.LIZ(2);
        }
    }
}
