package com.ss.android.ugc.aweme.ecommerce.search.suggest.ui;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C00ZY;
import X.C01GW;
import X.C098200Yq;
import X.C0BIY;
import X.C0PEM;
import X.C0QCO;
import X.C0QER;
import X.C0QR7;
import X.C0QUT;
import X.C0QUV;
import X.C0QUX;
import X.C0QWI;
import X.C0QWJ;
import X.C0QXN;
import X.C107500av;
import X.C1223304qV;
import X.C124100db;
import X.C139000g0;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1878350yyn;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C23250099c;
import X.C293710BfF;
import X.C293970Bff;
import X.C339190DRl;
import X.C452070Ho5;
import X.C467860IWi;
import X.C669740QOu;
import X.C671780QWq;
import X.C671990QXl;
import X.C672020QXo;
import X.C672820QaG;
import X.C672840QaI;
import X.C673030Qab;
import X.C673320Qb4;
import X.C673370Qb9;
import X.C673390QbB;
import X.C673430QbF;
import X.C673510QbN;
import X.C673520QbO;
import X.C673660Qbc;
import X.C673760Qbm;
import X.C673860Qbw;
import X.C673940Qc4;
import X.C683900Qs8;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC669620QOi;
import X.InterfaceC1760590vur;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC673060Qae;
import X.InterfaceC674600Qd8;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS110S0100000_10;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ab.MiddleSnapShotConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchKeyboardMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.EcomPersonalizedToastAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSuggestAssemNew extends UISlotAssem implements ISearchSuggestSubPageAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final AssemVMLazy LLJJI;
    public C673430QbF LLJJIII;
    public ISearchSuggestContextAbilityNew LLJJIJI;
    public C0QWI LLJJIJIIJIL;
    public C0QWJ LLJJIJIL;
    public ViewGroup LLJJJ;
    public TuxTextView LLJJJIL;
    public FrameLayout LLJJJJ;
    public C0QCO LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public long LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public C673760Qbm LLJZIJLIL;
    public RecyclerView LLL;
    public C0QUT LLLF;
    public final C673390QbB LLLFF;
    public final AwS589S0100000_10 LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchSuggestAssemNew.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/search/suggest/vm/EcSearchSuggestViewModelNew;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bs8;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void j72(SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void BP1() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJJIII) == null) {
            return;
        }
        c673430QbF.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void Dx() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJJIII) == null) {
            return;
        }
        c673430QbF.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void K80() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJJIII) == null) {
            return;
        }
        c673430QbF.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final boolean KF2() {
        ViewGroup viewGroup = this.LLJJJ;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void Pa1() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJJIII) == null) {
            return;
        }
        c673430QbF.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void Rz1() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJJIII) == null) {
            return;
        }
        c673430QbF.LJI = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        ViewGroup viewGroup = this.LLJJJ;
        if (viewGroup != null) {
            C339190DRl.LIZIZ(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip() {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew.ip():void");
    }

    public final EcSearchSuggestViewModelNew lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (EcSearchSuggestViewModelNew) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        String string;
        Map mapLJ;
        String enterSearchFrom;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew;
        Fragment fragmentLJI;
        C673030Qab.LIZ.getClass();
        if (((MiddleSnapShotConfig) C673030Qab.LIZJ.getValue()).enable && (iSearchSuggestContextAbilityNew = this.LLJJIJI) != null && !iSearchSuggestContextAbilityNew.I41()) {
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLJJIJI;
            if ((iSearchSuggestContextAbilityNew2 != null ? iSearchSuggestContextAbilityNew2.LJJIJ() : null) == C0QUT.SUGGEST && this.LLJLLL && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
                C683900Qs8 c683900Qs8 = C683900Qs8.LIZ;
                C0QER c0qerV4 = v4();
                int ecSearchEntranceValue = c0qerV4 != null ? c0qerV4.getEcSearchEntranceValue() : -1;
                boolean zLIZ = C467860IWi.LIZ(fragmentLJI.getContext());
                c683900Qs8.getClass();
                C683900Qs8.LIZ(ecSearchEntranceValue, fragmentLJI, zLIZ);
            }
        }
        if (C124100db.LIZ()) {
            C0QCO c0qco = this.LLJJJJJIL;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c0qco != null ? c0qco.LJIILIIL : null;
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
        }
        super.onDestroy();
        C673940Qc4.LIZIZ = null;
        C673940Qc4.LIZJ = null;
        C107500av.LIZ();
        if (C293970Bff.LIZ()) {
            try {
                C0QCO c0qco2 = this.LLJJJJJIL;
                if (c0qco2 != null) {
                    c0qco2.LJIILJJIL = null;
                    c0qco2.LJ = null;
                    c0qco2.LJIIL = null;
                    c0qco2.LIZIZ = null;
                }
                this.LLJJJJJIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (((Boolean) C139000g0.LIZ.getValue()).booleanValue() && (((frameLayout = this.LLJJJJ) == null || frameLayout.getChildCount() != 0) && (frameLayout2 = this.LLJJJJ) != null)) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        C01GW c01gw = C0BIY.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2 || ((Number) c01gw.getValue()).intValue() == 1) {
            C0QUX.LIZ.getClass();
            C0QUX.LIZIZ = null;
            C0QUX.LIZJ.LIZ.LIZ.clear();
        }
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp = lp();
        ListenableFuture<MiddleCouponModel> listenableFuture = ecSearchSuggestViewModelNewLp.LLJIJIL;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        AnonymousClass0956 anonymousClass0956 = ecSearchSuggestViewModelNewLp.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "leave");
        jSONObject.put("page_name", "search_suggest");
        jSONObject.put("duration", this.LLJJLIIIJLLLLLLLZ - this.LLJJL);
        C0QER c0qerV42 = v4();
        jSONObject.put("root_enter_from_type", c0qerV42 != null ? c0qerV42.getEcSearchEntranceValue() : -1);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_trace", jSONObject);
        EventBus.LIZLLL().LJJI(this);
        if (this.LLJLIL) {
            C0QER c0qerV43 = v4();
            String str = "";
            if (c0qerV43 == null || (string = Integer.valueOf(c0qerV43.getEcSearchEntranceValue()).toString()) == null) {
                string = "";
            }
            C0QER c0qerV44 = v4();
            if (c0qerV44 != null && (enterSearchFrom = c0qerV44.getEnterSearchFrom()) != null) {
                str = enterSearchFrom;
            }
            C672020QXo c672020QXoKp = kp();
            C673430QbF c673430QbF = this.LLJJIII;
            if (c673430QbF != null) {
                Pair[] pairArr = new Pair[12];
                pairArr[0] = new Pair("duration", String.valueOf(c673430QbF.LJIIJ - c673430QbF.LJIIIZ));
                pairArr[1] = new Pair("click_history", c673430QbF.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[2] = new Pair("click_recom_search", c673430QbF.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[3] = new Pair("click_search_button", c673430QbF.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[4] = new Pair("view_disappear", c673430QbF.LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[5] = new Pair("edit_search_bar", c673430QbF.LJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[6] = new Pair("delete_history", c673430QbF.LJFF ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[7] = new Pair("long_press_recom_search", c673430QbF.LJI ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[8] = new Pair("blankpage_ready", c673430QbF.LJII ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[9] = new Pair("page_role", c673430QbF.LJIIIIZZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[10] = new Pair("hit_guess_cache", c673430QbF.LJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[11] = new Pair("guess_first_request_success", c673430QbF.LJIIL ? "1" : CardStruct.IStatusCode.DEFAULT);
                mapLJ = C2097608Jq.LJIIIIZZ(pairArr);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            C671990QXl.LIZJ(string, str, c672020QXoKp, mapLJ);
        }
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    public final void sp() {
        SuggestWordResponse.Extra extra;
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp = lp();
        C673430QbF c673430QbF = this.LLJJIII;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C0QWI c0qwi = ecSearchSuggestViewModelNewLp.LLILLL;
            if (c0qwi != null) {
                ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = ecSearchSuggestViewModelNewLp.LLILZLL;
                boolean zXq2 = iSearchSuggestSubPageAbility != null ? iSearchSuggestSubPageAbility.xq2() : false;
                ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility2 = ecSearchSuggestViewModelNewLp.LLILZLL;
                c0qwi.LJ("guess", "request", true, zXq2, iSearchSuggestSubPageAbility2 != null ? iSearchSuggestSubPageAbility2.KF2() : false, null, null, false, false, null);
            }
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = ecSearchSuggestViewModelNewLp.LLILZIL;
            String strH0 = ((InterfaceC673060Qae) ecSearchSuggestViewModelNewLp.zQ2().getOperator()).h0(ecSearchSuggestViewModelNewLp.LLILZ, (iSearchSuggestContextAbilityNew == null || iSearchSuggestContextAbilityNew.n90()) ? false : true);
            C672820QaG.LIZ.getClass();
            SuggestWordResponse suggestWordResponseLJII = C672820QaG.LJII(strH0);
            TemplateData templateDataXQ2 = ecSearchSuggestViewModelNewLp.xQ2(jCurrentTimeMillis, strH0, true);
            C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
            C673320Qb4.LJIILIIL();
            if (templateDataXQ2 == null) {
                C0QWI c0qwi2 = ecSearchSuggestViewModelNewLp.LLILLL;
                if (c0qwi2 != null) {
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility3 = ecSearchSuggestViewModelNewLp.LLILZLL;
                    boolean zXq22 = iSearchSuggestSubPageAbility3 != null ? iSearchSuggestSubPageAbility3.xq2() : false;
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility4 = ecSearchSuggestViewModelNewLp.LLILZLL;
                    c0qwi2.LJ("guess", "response_fail", true, zXq22, iSearchSuggestSubPageAbility4 != null ? iSearchSuggestSubPageAbility4.KF2() : false, null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), false, false, null);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            }
            int iLJFF = C672820QaG.LJFF(suggestWordResponseLJII);
            C0QWI c0qwi3 = ecSearchSuggestViewModelNewLp.LLILLL;
            if (c0qwi3 != null) {
                ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility5 = ecSearchSuggestViewModelNewLp.LLILZLL;
                boolean zXq23 = iSearchSuggestSubPageAbility5 != null ? iSearchSuggestSubPageAbility5.xq2() : false;
                ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility6 = ecSearchSuggestViewModelNewLp.LLILZLL;
                c0qwi3.LJ("guess", "response_success", true, zXq23, iSearchSuggestSubPageAbility6 != null ? iSearchSuggestSubPageAbility6.KF2() : false, Integer.valueOf(iLJFF), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), false, false, (suggestWordResponseLJII == null || (extra = suggestWordResponseLJII.extra) == null) ? null : extra.getTimingLog());
            }
            if (ecSearchSuggestViewModelNewLp.LLIZ && iLJFF > 0 && c673430QbF != null) {
                c673430QbF.LJIIJJI = true;
            }
            ecSearchSuggestViewModelNewLp.LLIZ = false;
            C673510QbN c673510QbN = new C673510QbN(true, jCurrentTimeMillis, suggestWordResponseLJII, templateDataXQ2);
            C0QWI c0qwi4 = this.LLJJIJIIJIL;
            if (c0qwi4 != null) {
                boolean z = !this.LLJLL;
                boolean zKF2 = KF2();
                C672820QaG c672820QaG = C672820QaG.LIZ;
                SuggestWordResponse suggestWordResponse = c673510QbN.LIZJ;
                c672820QaG.getClass();
                c0qwi4.LJ("guess", "update_data", true, z, zKF2, Integer.valueOf(C672820QaG.LJFF(suggestWordResponse)), Long.valueOf(System.currentTimeMillis() - c673510QbN.LIZIZ), false, false, null);
            }
            C0QCO c0qco = this.LLJJJJJIL;
            if (c0qco != null) {
                c0qco.LJIIJ(c673510QbN.LIZLLL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void tp() {
        C0QER c0qer;
        int iQ4;
        ECSearchEntranceData ecSearchEntranceData;
        lp().AQ2();
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp = lp();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0QWI c0qwi = ecSearchSuggestViewModelNewLp.LLILLL;
        if (c0qwi != null) {
            ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = ecSearchSuggestViewModelNewLp.LLILZLL;
            boolean zXq2 = iSearchSuggestSubPageAbility != null ? iSearchSuggestSubPageAbility.xq2() : false;
            ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility2 = ecSearchSuggestViewModelNewLp.LLILZLL;
            c0qwi.LJ("history", "request", true, zXq2, iSearchSuggestSubPageAbility2 != null ? iSearchSuggestSubPageAbility2.KF2() : false, null, null, false, false, null);
        }
        C0QER c0qerV4 = ecSearchSuggestViewModelNewLp.v4();
        List<SearchHistory> listLJIJJLI = (c0qerV4 == null || (ecSearchEntranceData = c0qerV4.getEcSearchEntranceData()) == null || !ecSearchEntranceData.getBooleanStrategy("disable_history_strategy")) ? ((InterfaceC673060Qae) ecSearchSuggestViewModelNewLp.zQ2().getOperator()).LJIJJLI(ecSearchSuggestViewModelNewLp.v4()) : C13BV.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator<SearchHistory> it2 = listLJIJJLI.iterator();
        while (it2.hasNext()) {
            String str = it2.next().keyword;
            if (str != null) {
                HashMap map = new HashMap();
                map.put("word", str);
                arrayList.add(map);
            }
        }
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = ecSearchSuggestViewModelNewLp.LLILZIL;
        String tabName = (iSearchSuggestContextAbilityNew == null || (iQ4 = iSearchSuggestContextAbilityNew.q4()) < 0) ? EnumC669620QOi.SHOP.getTabName() : C669740QOu.LIZLLL(iQ4);
        TemplateData templateData = new TemplateData();
        templateData.LJIILIIL("historyList", arrayList);
        templateData.LJIILIIL("current_tab_name", tabName);
        templateData.LJIILIIL("is_force", Integer.valueOf(arrayList.isEmpty() ? 1 : 0));
        C0QWJ c0qwj = ecSearchSuggestViewModelNewLp.LLILZ;
        templateData.LJIILIIL("enter_from", (c0qwj == null || (c0qer = c0qwj.LIZ) == null) ? null : c0qer.getEnterSearchFrom());
        if (C1223304qV.LIZ()) {
            templateData.LIZJ = "allSearchDataProcess";
        }
        C0QWI c0qwi2 = ecSearchSuggestViewModelNewLp.LLILLL;
        if (c0qwi2 != null) {
            ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility3 = ecSearchSuggestViewModelNewLp.LLILZLL;
            boolean zXq22 = iSearchSuggestSubPageAbility3 != null ? iSearchSuggestSubPageAbility3.xq2() : false;
            ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility4 = ecSearchSuggestViewModelNewLp.LLILZLL;
            c0qwi2.LJ("history", "response_success", true, zXq22, iSearchSuggestSubPageAbility4 != null ? iSearchSuggestSubPageAbility4.KF2() : false, Integer.valueOf(listLJIJJLI.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), false, false, null);
        }
        C0QWI c0qwi3 = this.LLJJIJIIJIL;
        if (c0qwi3 != null) {
            c0qwi3.LJ("history", "update_data", true, !this.LLJLL, KF2(), Integer.valueOf(listLJIJJLI.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), false, false, null);
        }
        C0QCO c0qco = this.LLJJJJJIL;
        if (c0qco != null) {
            c0qco.LJIIJ(templateData);
        }
    }

    public final C0QER v4() {
        C0QWJ c0qwj = this.LLJJIJIL;
        if (c0qwj != null) {
            return c0qwj.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final boolean xq2() {
        return !this.LLJLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0QbB] */
    public EcSearchSuggestAssemNew() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcSearchSuggestViewModelNew.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 160);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(79);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 161), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJI = assemVMLazy;
        this.LLLFF = new TextWatcher() { // from class: X.0QbB
            public boolean LL;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C0QUT c0qutLJJIJ;
                C0QWJ c0qwjQH2;
                String string;
                String enterSearchFrom;
                EcSearchSuggestAssemNew ecSearchSuggestAssemNew = this.LLILLJJLI;
                C673430QbF c673430QbF = ecSearchSuggestAssemNew.LLJJIII;
                if (c673430QbF != null) {
                    c673430QbF.LJ = true;
                }
                if (ecSearchSuggestAssemNew.LLLF == C0QUT.SUGGEST) {
                    ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = ecSearchSuggestAssemNew.LLJJIJI;
                    if (iSearchSuggestContextAbilityNew != null) {
                        c0qutLJJIJ = iSearchSuggestContextAbilityNew.LJJIJ();
                    } else {
                        c0qutLJJIJ = null;
                    }
                    if (c0qutLJJIJ != C0QUT.RESULT && !this.LL) {
                        this.LL = true;
                        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLILLJJLI.LLJJIJI;
                        if (iSearchSuggestContextAbilityNew2 != null && (c0qwjQH2 = iSearchSuggestContextAbilityNew2.QH2()) != null) {
                            EcSearchSuggestAssemNew ecSearchSuggestAssemNew2 = this.LLILLJJLI;
                            C0QER c0qer = c0qwjQH2.LIZ;
                            String str = "";
                            if (c0qer == null || (string = Integer.valueOf(c0qer.getEcSearchEntranceValue()).toString()) == null) {
                                string = "";
                            }
                            C0QER c0qer2 = c0qwjQH2.LIZ;
                            if (c0qer2 != null && (enterSearchFrom = c0qer2.getEnterSearchFrom()) != null) {
                                str = enterSearchFrom;
                            }
                            C671990QXl.LIZ(string, str, "default_search_keyword_edit", C671780QWq.LIZ(C1558520qew.LJIIL(ecSearchSuggestAssemNew2)));
                        }
                    }
                }
            }
        };
        this.LLLFFI = new AwS589S0100000_10(this, 80);
    }

    public final void hp() {
        String routeUri;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ECSearchEntranceData ecSearchEntranceData;
        ECSearchEntranceData ecSearchEntranceData2;
        ECSearchEntranceData ecSearchEntranceData3;
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp = lp();
        C672820QaG c672820QaG = C672820QaG.LIZ;
        C0QER c0qerV4 = ecSearchSuggestViewModelNewLp.v4();
        c672820QaG.getClass();
        C673320Qb4.LIZ.getClass();
        Long lLIZLLL = C673320Qb4.LIZLLL();
        long jLongValue = lLIZLLL != null ? lLIZLLL.longValue() : System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("_ec_start_time", String.valueOf(jLongValue));
        map.put("root_enter_from_type", Integer.valueOf(c0qerV4 != null ? c0qerV4.getEcSearchEntranceValue() : -100));
        map.put("client_ab_params", C2097908Jt.LIZJ(new Pair("ec_search_blank_page_optimize", Integer.valueOf(((Number) C1223304qV.LIZ.getValue()).intValue()))));
        map.put("historyValid", Integer.valueOf(((c0qerV4 == null || (ecSearchEntranceData3 = c0qerV4.getEcSearchEntranceData()) == null || !ecSearchEntranceData3.getBooleanStrategy("disable_history_strategy")) ? 0 : 1) ^ 1));
        map.put("guessValid", Integer.valueOf((c0qerV4 == null || (ecSearchEntranceData2 = c0qerV4.getEcSearchEntranceData()) == null || !ecSearchEntranceData2.getBooleanStrategy("disable_guess_strategy") || C672820QaG.LIZJ(c0qerV4.getEcSearchEntranceData())) ? 1 : 0));
        if (c0qerV4 == null || (ecSearchEntranceData = c0qerV4.getEcSearchEntranceData()) == null || (routeUri = ecSearchEntranceData.getRouteUri()) == null) {
            routeUri = "";
        }
        map.put("route_uri", routeUri);
        C0QCO c0qco = this.LLJJJJJIL;
        if (c0qco == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c0qco.LJIILIIL) == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(map);
    }

    public final C672020QXo kp() {
        return C671780QWq.LIZ(C1558520qew.LJIIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJL = System.currentTimeMillis();
        C673430QbF c673430QbF = new C673430QbF();
        this.LLJJIII = c673430QbF;
        c673430QbF.LJIIIZ = this.LLJJL;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = (ISearchSuggestContextAbilityNew) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchSuggestContextAbilityNew.class, null);
        this.LLJJIJI = iSearchSuggestContextAbilityNew;
        C0QWJ c0qwjQH2 = iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.QH2() : null;
        this.LLJJIJIL = c0qwjQH2;
        this.LLJJIJIIJIL = new C0QWI(c0qwjQH2);
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp = lp();
        C0QWI c0qwi = this.LLJJIJIIJIL;
        C0QWJ c0qwj = this.LLJJIJIL;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLJJIJI;
        ecSearchSuggestViewModelNewLp.LLILLL = c0qwi;
        ecSearchSuggestViewModelNewLp.LLILZ = c0qwj;
        ecSearchSuggestViewModelNewLp.LLILZIL = iSearchSuggestContextAbilityNew2;
        ecSearchSuggestViewModelNewLp.LLILZLL = this;
        EventBus.LIZLLL().LJIJJ(this);
        if (((Number) C00ZY.LIZ.getValue()).intValue() == 1) {
            EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp2 = lp();
            C23250099c.LIZLLL(ecSearchSuggestViewModelNewLp2.getAssemVMScope(), C0PEM.LIZJ, null, new C673370Qb9(ecSearchSuggestViewModelNewLp2, System.currentTimeMillis(), this.LLJJIII, null), 2);
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
            C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, this, ISearchSuggestSubPageAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) == C0QUT.SUGGEST) {
            ip();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        EditText editTextXv;
        C673430QbF c673430QbF;
        super.onStart();
        if (this.LLJLILLLLZIIL && (c673430QbF = this.LLJJIII) != null) {
            c673430QbF.LIZLLL = true;
        }
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if (iSearchSuggestContextAbilityNew == null || (editTextXv = iSearchSuggestContextAbilityNew.Xv()) == null) {
            return;
        }
        editTextXv.addTextChangedListener(this.LLLFF);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        EditText editTextXv;
        super.onStop();
        this.LLJLILLLLZIIL = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJLIIIJLLLLLLLZ = jCurrentTimeMillis;
        C673430QbF c673430QbF = this.LLJJIII;
        if (c673430QbF != null) {
            c673430QbF.LJIIJ = jCurrentTimeMillis;
        }
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        if (iSearchSuggestContextAbilityNew == null || (editTextXv = iSearchSuggestContextAbilityNew.Xv()) == null) {
            return;
        }
        editTextXv.removeTextChangedListener(this.LLLFF);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final C0QUT Zs2() {
        return C0QUT.SUGGEST;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void HF2(Map<String, Object> map) {
        lp().wQ2(map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x03e1  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XE1(X.C0QWA r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew.XE1(X.0QWA):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClickHistoryEvent(C673860Qbw c673860Qbw) {
        RecyclerView recyclerView = this.LLL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 30));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onExpandHistoryEvent(C673660Qbc c673660Qbc) {
        this.LLJZ = true;
        C673760Qbm c673760Qbm = this.LLJZIJLIL;
        if (c673760Qbm != null) {
            C673760Qbm.LLLII(c673760Qbm, true, null, true, 2);
        }
        RecyclerView recyclerView = this.LLL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 31));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHistoryDeleteEvent(C673520QbO c673520QbO) {
        SearchHistory searchHistory = c673520QbO.LIZ;
        if (searchHistory == null) {
            C673760Qbm c673760Qbm = this.LLJZIJLIL;
            if (c673760Qbm != null) {
                c673760Qbm.LL.clear();
                c673760Qbm.LLILLJJLI = C13BV.INSTANCE;
                c673760Qbm.notifyDataSetChanged();
            }
        } else {
            C673760Qbm c673760Qbm2 = this.LLJZIJLIL;
            if (c673760Qbm2 != null) {
                C673760Qbm.LLLII(c673760Qbm2, this.LLJZ, searchHistory, false, 4);
            }
        }
        RecyclerView recyclerView = this.LLL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 32));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        this.LLJJJ = (ViewGroup) view.findViewById(R.id.ueu);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.fh4);
        this.LLJJJJ = (FrameLayout) view.findViewById(R.id.wo1);
        this.LLJJJJLIIL = (LinearLayout) view.findViewById(R.id.nc2);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            C339190DRl.LIZLLL(this.LLJJJIL);
        }
        this.LLL = (RecyclerView) view.findViewById(R.id.jpm);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0QbU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673550QbR) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 138), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0QbS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673550QbR) obj).LLILLJJLI;
            }
        }, null, new AwS624S0100000_10(this, 139), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0QbZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673550QbR) obj).LLILLL;
            }
        }, null, new AwS624S0100000_10(this, 140), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0QbW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673550QbR) obj).LLILZ;
            }
        }, null, new AwS624S0100000_10(this, 141), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0QbY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673550QbR) obj).LLILZIL;
            }
        }, null, new AwS624S0100000_10(this, 137), 6);
        if (C107500av.LIZ() && (viewGroup = this.LLJJJ) != null) {
            InterfaceC674600Qd8 interfaceC674600Qd8 = new InterfaceC674600Qd8() { // from class: X.0Qbb
                @Override // X.InterfaceC674600Qd8
                public final void onHide(int i) {
                }

                @Override // X.InterfaceC674600Qd8
                public final void onShow(int i) {
                }

                @Override // X.InterfaceC674600Qd8
                public final void LIZ() throws JSONException {
                    this.LIZ.mp(0, false);
                }

                @Override // X.InterfaceC674600Qd8
                public final void LIZIZ(int i) throws JSONException {
                    this.LIZ.mp(i, true);
                }
            };
            LifecycleRegistry lifecycle = getLifecycle();
            lifecycle.addObserver(new EcSearchKeyboardMonitor(viewGroup, interfaceC674600Qd8, lifecycle));
        }
    }

    public final void op(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        C0QCO c0qco = this.LLJJJJJIL;
        if (c0qco != null) {
            c0qco.LJIIIIZZ("ttmall_search_transfe_hide_bubble", jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mp(int r5, boolean r6) throws org.json.JSONException {
        /*
            r4 = this;
            boolean r0 = r4.KF2()
            if (r0 != 0) goto L7
            return
        L7:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "visible"
            r3.put(r0, r6)
            r1 = 0
            if (r6 == 0) goto L3f
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L4e
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L4e
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L4e
            float r0 = r0.density
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r1 = r2.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4e
            float r1 = r2.floatValue()
        L39:
            float r0 = (float) r5
            float r0 = r0 / r1
            int r1 = X.C814420VxA.LIZIZ(r0)
        L3f:
            java.lang.String r0 = "height"
            r3.put(r0, r1)
            X.0QCO r1 = r4.LLJJJJJIL
            if (r1 == 0) goto L4d
            java.lang.String r0 = "ecKeyboardStatusChange"
            r1.LJIIIIZZ(r0, r3)
        L4d:
            return
        L4e:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew.mp(int, boolean):void");
    }

    @Override // X.C0QPH
    public final void pc(C0QUT c0qut, C0QUT c0qut2) {
        C0QUT c0qut3 = C0QUT.SUGGEST;
        if (c0qut2 != c0qut3) {
            EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), EcomPersonalizedToastAbility.class, null);
            if (ecomPersonalizedToastAbility != null) {
                ecomPersonalizedToastAbility.dismiss();
            }
            C673320Qb4.LIZ.getClass();
            C673320Qb4.LIZIZ = null;
        }
        if (c0qut == c0qut3) {
            this.LLJLL = true;
        }
    }

    @Override // X.C0QPH
    public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
        SearchResultParam searchResultParamY3;
        String strBN0;
        C0QUV c0quv;
        C0QER searchEnterParam;
        String enterMethod;
        C672020QXo c672020QXoKp;
        C0QXN ecommerceNewUserModel;
        this.LLLF = c0qut;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJIJI;
        String strLJFF = null;
        C0QER c0qer = null;
        strLJFF = null;
        if (iSearchSuggestContextAbilityNew != null) {
            searchResultParamY3 = iSearchSuggestContextAbilityNew.y3();
        } else {
            searchResultParamY3 = null;
        }
        if (searchResultParamY3 != null && (ecommerceNewUserModel = searchResultParamY3.getEcommerceNewUserModel()) != null && ecommerceNewUserModel.landingToNewUserPage) {
            strBN0 = "tiktok_ecom_new_user";
        } else {
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLJJIJI;
            if (iSearchSuggestContextAbilityNew2 != null) {
                strBN0 = iSearchSuggestContextAbilityNew2.bN0(iSearchSuggestContextAbilityNew2.q4());
            } else {
                strBN0 = null;
            }
        }
        if (c0qut == null) {
            C672020QXo c672020QXoKp2 = kp();
            if (c672020QXoKp2 != null) {
                c672020QXoKp2.LIZJ("enter");
            }
            if (c0qut2 == C0QUT.SUGGEST) {
                C673430QbF c673430QbF = this.LLJJIII;
                if (c673430QbF != null) {
                    c673430QbF.LJIIIIZZ = false;
                }
                C672020QXo c672020QXoKp3 = kp();
                if (c672020QXoKp3 != null) {
                    C0QUV c0quv2 = C0QUV.SUGGEST;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("blankpage_enter_method", "enter");
                    C0QWJ c0qwj = this.LLJJIJIL;
                    if (c0qwj != null) {
                        c0qer = c0qwj.LIZ;
                    }
                    pairArr[1] = new Pair("blankpage_enter_from", C0QR7.LIZ(c0qer));
                    c672020QXoKp3.LJ(c0quv2, C2097608Jq.LJIIJ(pairArr));
                }
            }
        } else {
            C0QUT c0qut3 = C0QUT.SUGGEST;
            if (c0qut2 == c0qut3 || c0qut2 == C0QUT.SUG) {
                if (c0qut2 == c0qut3) {
                    c0quv = C0QUV.SUGGEST;
                } else {
                    c0quv = C0QUV.SUG;
                }
                C672020QXo c672020QXoKp4 = kp();
                if (c672020QXoKp4 != null) {
                    Pair[] pairArr2 = new Pair[2];
                    pairArr2[0] = new Pair("blankpage_enter_method", "cancel");
                    if (searchResultParamY3 != null && (searchEnterParam = searchResultParamY3.getSearchEnterParam()) != null) {
                        strLJFF = C0QR7.LJFF(searchEnterParam.getEcSearchEntranceValue(), C0QR7.LIZLLL(searchEnterParam, strBN0));
                    }
                    pairArr2[1] = new Pair("blankpage_enter_from", strLJFF);
                    c672020QXoKp4.LJ(c0quv, C2097608Jq.LJIIJ(pairArr2));
                }
            }
        }
        if (c0qut == C0QUT.RESULT && (c672020QXoKp = kp()) != null) {
            c672020QXoKp.LIZ();
        }
        int i = C672840QaI.LIZ[c0qut2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    EcSearchSuggestViewModelNew ecSearchSuggestViewModelNewLp = lp();
                    if (searchResultParamY3 == null || (enterMethod = searchResultParamY3.getEnterMethod()) == null) {
                        enterMethod = "";
                    }
                    ecSearchSuggestViewModelNewLp.LLJI = enterMethod;
                    C672020QXo c672020QXoKp5 = kp();
                    if (c672020QXoKp5 != null) {
                        c672020QXoKp5.LJFF(C0QUV.RESULT);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            C672020QXo c672020QXoKp6 = kp();
            if (c672020QXoKp6 == null) {
                return;
            }
            c672020QXoKp6.LJFF(C0QUV.SUG);
            return;
        }
        C672020QXo c672020QXoKp7 = kp();
        if (c672020QXoKp7 == null) {
            return;
        }
        c672020QXoKp7.LJFF(C0QUV.SUGGEST);
    }
}
