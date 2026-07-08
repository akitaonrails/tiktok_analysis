package com.ss.android.ugc.aweme.ecommerce.search.suggest.ui;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C0BIY;
import X.C0QCO;
import X.C0QER;
import X.C0QR7;
import X.C0QUT;
import X.C0QUV;
import X.C0QUX;
import X.C0QWA;
import X.C0QWI;
import X.C0QWJ;
import X.C0QXL;
import X.C0QXN;
import X.C107500av;
import X.C124100db;
import X.C139000g0;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1507790pL7;
import X.C1558520qew;
import X.C1637806bA;
import X.C1878350yyn;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2190401Ao2;
import X.C2217381BqS;
import X.C23250099c;
import X.C293710BfF;
import X.C293720BfG;
import X.C293970Bff;
import X.C467860IWi;
import X.C671780QWq;
import X.C671990QXl;
import X.C672020QXo;
import X.C672830QaH;
import X.C673030Qab;
import X.C673320Qb4;
import X.C673340Qb6;
import X.C673380QbA;
import X.C673430QbF;
import X.C673520QbO;
import X.C673660Qbc;
import X.C673760Qbm;
import X.C673860Qbw;
import X.C673920Qc2;
import X.C673940Qc4;
import X.C674010QcB;
import X.C683900Qs8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC673930Qc3;
import X.EnumC673970Qc7;
import X.EnumC673980Qc8;
import X.InterfaceC1760590vur;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC674600Qd8;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS110S0100000_10;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
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
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchMiddlePitayaHelper;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchKeyboardMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.EcomPersonalizedToastAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchSuggestAssem extends UISlotAssem implements ISearchSuggestSubPageAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public FrameLayout LLJJI;
    public TuxTextView LLJJIII;
    public ConstraintLayout LLJJIJI;
    public RecyclerView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public ISearchSuggestContextAbilityNew LLJJJ;
    public C0QCO LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public C0QWI LLJJJJJIL;
    public C0QWJ LLJJJJLIIL;
    public long LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public C673760Qbm LLJZ;
    public C673430QbF LLJZIJLIL;
    public C0QUT LLL;
    public final C673380QbA LLLF;
    public final AwS589S0100000_10 LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECSearchSuggestAssem.class, "suggestVm", "getSuggestVm()Lcom/ss/android/ugc/aweme/ecommerce/search/suggest/vm/SuggestAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QbA] */
    public ECSearchSuggestAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestAssemViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 159), AFwS241S0000000_10.get$arr$(78), null, true);
        this.LLLF = new TextWatcher() { // from class: X.0QbA
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
                ECSearchSuggestAssem eCSearchSuggestAssem = this.LLILLJJLI;
                C673430QbF c673430QbF = eCSearchSuggestAssem.LLJZIJLIL;
                if (c673430QbF != null) {
                    c673430QbF.LJ = true;
                }
                if (!this.LL && eCSearchSuggestAssem.LLL == C0QUT.SUGGEST) {
                    ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = eCSearchSuggestAssem.LLJJJ;
                    if (iSearchSuggestContextAbilityNew != null) {
                        c0qutLJJIJ = iSearchSuggestContextAbilityNew.LJJIJ();
                    } else {
                        c0qutLJJIJ = null;
                    }
                    if (c0qutLJJIJ != C0QUT.RESULT) {
                        this.LL = true;
                        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLILLJJLI.LLJJJ;
                        if (iSearchSuggestContextAbilityNew2 != null && (c0qwjQH2 = iSearchSuggestContextAbilityNew2.QH2()) != null) {
                            ECSearchSuggestAssem eCSearchSuggestAssem2 = this.LLILLJJLI;
                            C0QER c0qer = c0qwjQH2.LIZ;
                            String str = "";
                            if (c0qer == null || (string = Integer.valueOf(c0qer.getEcSearchEntranceValue()).toString()) == null) {
                                string = "";
                            }
                            C0QER c0qer2 = c0qwjQH2.LIZ;
                            if (c0qer2 != null && (enterSearchFrom = c0qer2.getEnterSearchFrom()) != null) {
                                str = enterSearchFrom;
                            }
                            C671990QXl.LIZ(string, str, "default_search_keyword_edit", C671780QWq.LIZ(C1558520qew.LJIIL(eCSearchSuggestAssem2)));
                        }
                    }
                }
            }
        };
        this.LLLFF = new AwS589S0100000_10(this, 79);
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
    public final boolean xq2() {
        return true;
    }

    public final void Ap() {
        TemplateData templateDataYQ2;
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        C0QER c0qer2;
        C0QER c0qer3;
        SuggestAssemViewModel suggestAssemViewModelTp = tp();
        C0QWJ c0qwj = suggestAssemViewModelTp.LLILLL;
        int ecSearchEntranceValue = -100;
        if (EcSearchMiddlePitayaHelper.LIZIZ(c0qwj != null ? c0qwj.LIZ : null)) {
            EnumC673980Qc8 enumC673980Qc8 = EnumC673980Qc8.HISTORY_REQUEST;
            C0QWJ c0qwj2 = suggestAssemViewModelTp.LLILLL;
            C673920Qc2 c673920Qc2LIZ = C674010QcB.LIZ(null, enumC673980Qc8, (c0qwj2 == null || (c0qer3 = c0qwj2.LIZ) == null) ? -100 : c0qer3.getEcSearchEntranceValue(), EnumC673970Qc7.SEARCH);
            c673920Qc2LIZ.LIZ.LJFF = Long.valueOf(System.currentTimeMillis());
            c673920Qc2LIZ.LIZ.LJ = EnumC673930Qc3.PITAYA_START_TIME;
            c673920Qc2LIZ.LIZJ();
            AnonymousClass0956 anonymousClass0956 = suggestAssemViewModelTp.LLJJIII;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            suggestAssemViewModelTp.LLJJIII = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(suggestAssemViewModelTp), C2107308Nj.LIZ.LLIILII(), null, new C673340Qb6(suggestAssemViewModelTp, c673920Qc2LIZ, null), 2);
        }
        SuggestAssemViewModel suggestAssemViewModelTp2 = tp();
        C2190401Ao2 c2190401Ao2 = C2190401Ao2.LIZ;
        C0QWJ c0qwj3 = suggestAssemViewModelTp2.LLILLL;
        if (c0qwj3 != null && (c0qer2 = c0qwj3.LIZ) != null) {
            ecSearchEntranceValue = c0qer2.getEcSearchEntranceValue();
        }
        c2190401Ao2.getClass();
        if (C2190401Ao2.LIZ(ecSearchEntranceValue)) {
            templateDataYQ2 = new TemplateData();
        } else {
            templateDataYQ2 = suggestAssemViewModelTp2.yQ2();
            C0QWI c0qwi = suggestAssemViewModelTp2.LLJIJIL;
            if (c0qwi != null) {
                C0QWI.LIZLLL(c0qwi, "history", "request", templateDataYQ2.LIZ == 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
            }
        }
        C0QWI c0qwi2 = this.LLJJJJJIL;
        if (c0qwi2 != null) {
            C0QWI.LIZLLL(c0qwi2, "history", "update_data", templateDataYQ2.LIZ != 0 ? CardStruct.IStatusCode.DEFAULT : "1");
        }
        C0QWI c0qwi3 = this.LLJJJJJIL;
        if (c0qwi3 != null) {
            c0qwi3.LJ("history", "update_data", true, !tp().LL, KF2(), null, null, false, false, null);
        }
        C0QCO c0qco = this.LLJJJIL;
        if (c0qco != null) {
            C0QWJ c0qwj4 = this.LLJJJJLIIL;
            if (c0qwj4 != null && (c0qer = c0qwj4.LIZ) != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("enable_new_user_module")) {
                C0QXL.LIZ.getClass();
                templateDataYQ2.LJIILIIL("newCustomerData", C0QXL.LIZIZ());
            }
            c0qco.LJIIJ(templateDataYQ2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void BP1() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJZIJLIL) == null) {
            return;
        }
        c673430QbF.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void Dx() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJZIJLIL) == null) {
            return;
        }
        c673430QbF.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void K80() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJZIJLIL) == null) {
            return;
        }
        c673430QbF.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void Pa1() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJZIJLIL) == null) {
            return;
        }
        c673430QbF.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void Rz1() {
        C673430QbF c673430QbF;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) != C0QUT.SUGGEST || (c673430QbF = this.LLJZIJLIL) == null) {
            return;
        }
        c673430QbF.LJI = true;
    }

    public final RecyclerView lp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jpm) : null;
            this.LLJJIJIIJIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final LinearLayout mp() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nc2) : null;
            this.LLJJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        FrameLayout frameLayoutSp;
        String string;
        C0QER c0qer;
        String enterSearchFrom;
        C0QER c0qer2;
        C0QER c0qer3;
        FrameLayout frameLayoutSp2;
        FrameLayout frameLayoutSp3;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew;
        Fragment fragmentLJI;
        C0QER c0qer4;
        C673030Qab.LIZ.getClass();
        int ecSearchEntranceValue = -1;
        if (((MiddleSnapShotConfig) C673030Qab.LIZJ.getValue()).enable && (iSearchSuggestContextAbilityNew = this.LLJJJ) != null && !iSearchSuggestContextAbilityNew.I41()) {
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLJJJ;
            if ((iSearchSuggestContextAbilityNew2 != null ? iSearchSuggestContextAbilityNew2.LJJIJ() : null) == C0QUT.SUGGEST && this.LLJLLIL && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
                C683900Qs8 c683900Qs8 = C683900Qs8.LIZ;
                C0QWJ c0qwj = this.LLJJJJLIIL;
                int ecSearchEntranceValue2 = (c0qwj == null || (c0qer4 = c0qwj.LIZ) == null) ? -1 : c0qer4.getEcSearchEntranceValue();
                boolean zLIZ = C467860IWi.LIZ(fragmentLJI.getContext());
                c683900Qs8.getClass();
                C683900Qs8.LIZ(ecSearchEntranceValue2, fragmentLJI, zLIZ);
            }
        }
        if (C124100db.LIZ()) {
            C0QCO c0qco = this.LLJJJIL;
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
                FrameLayout frameLayoutSp4 = sp();
                if ((frameLayoutSp4 == null || frameLayoutSp4.getChildCount() != 0) && (frameLayoutSp = sp()) != null) {
                    C786410Ut5.LJJJJIZL(frameLayoutSp);
                }
                C0QCO c0qco2 = this.LLJJJIL;
                if (c0qco2 != null) {
                    c0qco2.LJIILJJIL = null;
                    c0qco2.LJ = null;
                    c0qco2.LJIIL = null;
                    c0qco2.LIZIZ = null;
                }
                this.LLJJJIL = null;
                SuggestAssemViewModel suggestAssemViewModelTp = tp();
                AnonymousClass0956 anonymousClass0956 = suggestAssemViewModelTp.LLJJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                AnonymousClass0956 anonymousClass09562 = suggestAssemViewModelTp.LLJJI;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                ListenableFuture<MiddleCouponModel> listenableFuture = suggestAssemViewModelTp.LLJILLL;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
                ListenableFuture<String> listenableFuture2 = suggestAssemViewModelTp.LLJILJILJ;
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(true);
                }
                AnonymousClass0956 anonymousClass09563 = suggestAssemViewModelTp.LLJJIII;
                if (anonymousClass09563 != null) {
                    anonymousClass09563.LIZIZ(null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C01GW c01gw = C0BIY.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2 || ((Number) c01gw.getValue()).intValue() == 1) {
            C0QUX.LIZ.getClass();
            C0QUX.LIZIZ = null;
            C0QUX.LIZJ.LIZ.LIZ.clear();
        }
        if (((Boolean) C139000g0.LIZ.getValue()).booleanValue() && (((frameLayoutSp2 = sp()) == null || frameLayoutSp2.getChildCount() != 0) && (frameLayoutSp3 = sp()) != null)) {
            C786410Ut5.LJJJJIZL(frameLayoutSp3);
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "leave");
        jSONObject.put("page_name", "search_suggest");
        jSONObject.put("duration", this.LLJJLIIIJLLLLLLLZ - this.LLJJL);
        C0QWJ c0qwj2 = this.LLJJJJLIIL;
        if (c0qwj2 != null && (c0qer3 = c0qwj2.LIZ) != null) {
            ecSearchEntranceValue = c0qer3.getEcSearchEntranceValue();
        }
        jSONObject.put("root_enter_from_type", ecSearchEntranceValue);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_trace", jSONObject);
        EventBus.LIZLLL().LJJI(this);
        if (this.LLJL) {
            C0QWJ c0qwj3 = this.LLJJJJLIIL;
            String str = "";
            if (c0qwj3 == null || (c0qer2 = c0qwj3.LIZ) == null || (string = Integer.valueOf(c0qer2.getEcSearchEntranceValue()).toString()) == null) {
                string = "";
            }
            C0QWJ c0qwj4 = this.LLJJJJLIIL;
            if (c0qwj4 != null && (c0qer = c0qwj4.LIZ) != null && (enterSearchFrom = c0qer.getEnterSearchFrom()) != null) {
                str = enterSearchFrom;
            }
            C672020QXo c672020QXoKp = kp();
            Pair[] pairArr = new Pair[12];
            pairArr[0] = new Pair("duration", String.valueOf(this.LLJJLIIIJLLLLLLLZ - this.LLJJL));
            C673430QbF c673430QbF = this.LLJZIJLIL;
            pairArr[1] = new Pair("click_history", c673430QbF != null && c673430QbF.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
            C673430QbF c673430QbF2 = this.LLJZIJLIL;
            pairArr[2] = new Pair("click_recom_search", (c673430QbF2 == null || !c673430QbF2.LIZIZ) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF3 = this.LLJZIJLIL;
            pairArr[3] = new Pair("click_search_button", (c673430QbF3 == null || !c673430QbF3.LIZJ) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF4 = this.LLJZIJLIL;
            pairArr[4] = new Pair("view_disappear", (c673430QbF4 == null || !c673430QbF4.LIZLLL) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF5 = this.LLJZIJLIL;
            pairArr[5] = new Pair("edit_search_bar", (c673430QbF5 == null || !c673430QbF5.LJ) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF6 = this.LLJZIJLIL;
            pairArr[6] = new Pair("delete_history", (c673430QbF6 == null || !c673430QbF6.LJFF) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF7 = this.LLJZIJLIL;
            pairArr[7] = new Pair("long_press_recom_search", (c673430QbF7 == null || !c673430QbF7.LJI) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF8 = this.LLJZIJLIL;
            pairArr[8] = new Pair("blankpage_ready", (c673430QbF8 == null || !c673430QbF8.LJII) ? CardStruct.IStatusCode.DEFAULT : "1");
            C673430QbF c673430QbF9 = this.LLJZIJLIL;
            pairArr[9] = new Pair("page_role", (c673430QbF9 == null || !c673430QbF9.LJIIIIZZ) ? CardStruct.IStatusCode.DEFAULT : "1");
            pairArr[10] = new Pair("hit_guess_cache", tp().LLILZLL ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[11] = new Pair("guess_first_request_success", tp().LLIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
            C671990QXl.LIZJ(string, str, c672020QXoKp, C2097608Jq.LJIIIIZZ(pairArr));
        }
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    public final ConstraintLayout op() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ueu) : null;
            this.LLJJIJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final FrameLayout sp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wo1) : null;
            this.LLJJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final SuggestAssemViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (SuggestAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final boolean KF2() {
        ConstraintLayout constraintLayoutOp = op();
        return constraintLayoutOp != null && constraintLayoutOp.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        C786410Ut5.LL(8, op());
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp() {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem.hp():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip() {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem.ip():void");
    }

    public final C672020QXo kp() {
        return C671780QWq.LIZ(C1558520qew.LJIIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJL = System.currentTimeMillis();
        this.LLJZIJLIL = new C673430QbF();
        EventBus.LIZLLL().LJIJJ(this);
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
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = (ISearchSuggestContextAbilityNew) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchSuggestContextAbilityNew.class, null);
        if (iSearchSuggestContextAbilityNew != null) {
            this.LLJJJ = iSearchSuggestContextAbilityNew;
            SuggestAssemViewModel suggestAssemViewModelTp = tp();
            suggestAssemViewModelTp.LLIZLLLIL = iSearchSuggestContextAbilityNew;
            suggestAssemViewModelTp.LLJ = this;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if ((iSearchSuggestContextAbilityNew != null ? iSearchSuggestContextAbilityNew.LJJIJ() : null) == C0QUT.SUGGEST) {
            ip();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        EditText editTextXv;
        C673430QbF c673430QbF;
        super.onStart();
        if (this.LLJLIL && (c673430QbF = this.LLJZIJLIL) != null) {
            c673430QbF.LIZLLL = true;
        }
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if (iSearchSuggestContextAbilityNew == null || (editTextXv = iSearchSuggestContextAbilityNew.Xv()) == null) {
            return;
        }
        editTextXv.addTextChangedListener(this.LLLF);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        EditText editTextXv;
        super.onStop();
        this.LLJLIL = true;
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if (iSearchSuggestContextAbilityNew == null || (editTextXv = iSearchSuggestContextAbilityNew.Xv()) == null) {
            return;
        }
        editTextXv.removeTextChangedListener(this.LLLF);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final C0QUT Zs2() {
        return C0QUT.SUGGEST;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility
    public final void HF2(Map<String, Object> map) {
        C0QCO c0qco = this.LLJJJIL;
        if (c0qco != null) {
            if (C293720BfG.LIZ()) {
                tp().xQ2(c0qco, map);
            } else {
                tp().wQ2(c0qco, map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x030a  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XE1(X.C0QWA r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem.XE1(X.0QWA):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClickHistoryEvent(C673860Qbw c673860Qbw) {
        RecyclerView recyclerViewLp = lp();
        if (recyclerViewLp != null) {
            HandlerHook.viewPost(recyclerViewLp, new ARunnableS110S0100000_10(this, 27));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onExpandHistoryEvent(C673660Qbc c673660Qbc) {
        this.LLJLLL = true;
        C673760Qbm c673760Qbm = this.LLJZ;
        if (c673760Qbm != null) {
            C673760Qbm.LLLII(c673760Qbm, true, null, true, 2);
        }
        RecyclerView recyclerViewLp = lp();
        if (recyclerViewLp != null) {
            HandlerHook.viewPost(recyclerViewLp, new ARunnableS110S0100000_10(this, 28));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHistoryDeleteEvent(C673520QbO c673520QbO) {
        SearchHistory searchHistory = c673520QbO.LIZ;
        if (searchHistory == null) {
            C673760Qbm c673760Qbm = this.LLJZ;
            if (c673760Qbm != null) {
                c673760Qbm.LL.clear();
                c673760Qbm.LLILLJJLI = C13BV.INSTANCE;
                c673760Qbm.notifyDataSetChanged();
            }
        } else {
            C673760Qbm c673760Qbm2 = this.LLJZ;
            if (c673760Qbm2 != null) {
                C673760Qbm.LLLII(c673760Qbm2, this.LLJLLL, searchHistory, false, 4);
            }
        }
        RecyclerView recyclerViewLp = lp();
        if (recyclerViewLp != null) {
            HandlerHook.viewPost(recyclerViewLp, new ARunnableS110S0100000_10(this, 29));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0QWJ c0qwjQH2;
        FrameLayout frameLayoutSp;
        super.onViewCreated(view);
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
        if (iSearchSuggestContextAbilityNew != null) {
            c0qwjQH2 = iSearchSuggestContextAbilityNew.QH2();
        } else {
            c0qwjQH2 = null;
        }
        this.LLJJJJLIIL = c0qwjQH2;
        this.LLJJJJJIL = new C0QWI(c0qwjQH2);
        if (c0qwjQH2 != null) {
            SuggestAssemViewModel suggestAssemViewModelTp = tp();
            C0QWI c0qwi = this.LLJJJJJIL;
            suggestAssemViewModelTp.LLILLL = c0qwjQH2;
            suggestAssemViewModelTp.LLJIJIL = c0qwi;
        }
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0QbP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673540QbQ) obj).LLILLL;
            }
        }, null, new AwS624S0100000_10(this, 133), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0QbT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673540QbQ) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 134), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0QbV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673540QbQ) obj).LLILZ;
            }
        }, null, new AwS624S0100000_10(this, 135), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0QbX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C673540QbQ) obj).LLILZIL;
            }
        }, null, new AwS624S0100000_10(this, 136), 6);
        if (C107500av.LIZ() && (frameLayoutSp = sp()) != null) {
            InterfaceC674600Qd8 interfaceC674600Qd8 = new InterfaceC674600Qd8() { // from class: X.0Qba
                @Override // X.InterfaceC674600Qd8
                public final void onHide(int i) {
                }

                @Override // X.InterfaceC674600Qd8
                public final void onShow(int i) {
                }

                @Override // X.InterfaceC674600Qd8
                public final void LIZ() throws JSONException {
                    this.LIZ.yp(0, false);
                }

                @Override // X.InterfaceC674600Qd8
                public final void LIZIZ(int i) throws JSONException {
                    this.LIZ.yp(i, true);
                }
            };
            LifecycleRegistry lifecycle = getLifecycle();
            lifecycle.addObserver(new EcSearchKeyboardMonitor(frameLayoutSp, interfaceC674600Qd8, lifecycle));
        }
    }

    public final void zp(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        C0QCO c0qco = this.LLJJJIL;
        if (c0qco != null) {
            c0qco.LJIIIIZZ("ttmall_search_transfe_hide_bubble", jSONObject);
        }
    }

    public static String up(C0QWA c0qwa, C0QUT c0qut) {
        if (c0qut != null) {
            int i = C672830QaH.LIZ[c0qut.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    return "result_back";
                }
                return "first_enter";
            }
            if (c0qwa == C0QWA.RETURN) {
                return "sug_back";
            }
            return "sug_clear";
        }
        return "first_enter";
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
            tp().LL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp(int r5, boolean r6) throws org.json.JSONException {
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
            X.0QCO r1 = r4.LLJJJIL
            if (r1 == 0) goto L4d
            java.lang.String r0 = "ecKeyboardStatusChange"
            r1.LJIIIIZZ(r0, r3)
        L4d:
            return
        L4e:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem.yp(int, boolean):void");
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
        this.LLL = c0qut;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLJJJ;
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
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = this.LLJJJ;
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
                C673430QbF c673430QbF = this.LLJZIJLIL;
                if (c673430QbF != null) {
                    c673430QbF.LJIIIIZZ = false;
                }
                C672020QXo c672020QXoKp3 = kp();
                if (c672020QXoKp3 != null) {
                    C0QUV c0quv2 = C0QUV.SUGGEST;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("blankpage_enter_method", "enter");
                    C0QWJ c0qwj = this.LLJJJJLIIL;
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
        int i = C672830QaH.LIZ[c0qut2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    SuggestAssemViewModel suggestAssemViewModelTp = tp();
                    if (searchResultParamY3 == null || (enterMethod = searchResultParamY3.getEnterMethod()) == null) {
                        enterMethod = "";
                    }
                    suggestAssemViewModelTp.LLJJIJI = enterMethod;
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
