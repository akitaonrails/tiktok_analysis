package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC1200800hLy;
import X.AbstractC1539010q9T;
import X.C019F;
import X.C1200710hLp;
import X.C1200770hLv;
import X.C1200780hLw;
import X.C1200810hLz;
import X.C1200900hM8;
import X.C1209100hZM;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1541950qED;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2365509Or;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1541990qEH;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimLynxAssem extends UIContentAssem implements IPoiClaimLynxAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJ;
    public InterfaceC1541990qEH LLJI;
    public String LLJIJIL;
    public long LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiClaimLynxAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/claim/vm/PoiClaimViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiClaimLynxAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiClaimViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 881), AFwS256S0000000_18.get$arr$(278), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 808526756) {
            return null;
        }
        return this;
    }

    public final PoiClaimViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (PoiClaimViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onHide();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onShow();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimLynxAssemAbility
    public final void bD2(AbstractC1200800hLy abstractC1200800hLy) {
        ViewGroup viewGroup;
        String strLIZIZ;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        JSONArray jSONArray;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewLJJIJL = LJJIJL();
        String str4 = null;
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            Context context = getContext();
            if (context != null && abstractC1200800hLy != null && (strLIZIZ = abstractC1200800hLy.LIZIZ()) != null) {
                this.LLJILJIL = System.currentTimeMillis();
                this.LLJIJIL = abstractC1200800hLy.LIZ();
                try {
                    C1200710hLp.LIZ.getClass();
                    String string = C1200710hLp.LIZIZ.getString(C1200710hLp.LIZ(), "");
                    if (a0.LJJJIL(string)) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(string);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    C1200780hLw c1200780hLw = Go().LL;
                    if (c1200780hLw != null) {
                        str = c1200780hLw.LIZ;
                    } else {
                        str = null;
                    }
                    C1200780hLw c1200780hLw2 = Go().LL;
                    if (c1200780hLw2 != null) {
                        str2 = c1200780hLw2.LIZIZ;
                    } else {
                        str2 = null;
                    }
                    jSONObject2.put("enter_from", str);
                    jSONObject2.put("session_id", str2);
                    C1200780hLw c1200780hLw3 = Go().LL;
                    if (c1200780hLw3 != null) {
                        str3 = c1200780hLw3.LIZJ;
                    } else {
                        str3 = null;
                    }
                    C1200780hLw c1200780hLw4 = Go().LL;
                    if (c1200780hLw4 != null) {
                        str4 = c1200780hLw4.LIZLLL;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("cache_data", jSONObject);
                    jSONObject3.put("track_params", jSONObject2);
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        Collection collection = (List) C1200900hM8.LIZIZ.getValue();
                        if (collection == null) {
                            collection = C13BV.INSTANCE;
                        }
                        jSONArray = new JSONArray(collection);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        jSONArray = new JSONArray();
                    }
                    C2365509Or.LIZLLL(jSONObject4, "poi_claim_enable_category_list", jSONArray);
                    C2365509Or.LIZLLL(jSONObject4, "poi_claim_work_flow_version", Integer.valueOf(((Number) C1200810hLz.LIZ.getValue()).intValue()));
                    if (str3 != null && str4 != null) {
                        C2365509Or.LIZLLL(jSONObject4, "target_page", str3);
                        C2365509Or.LIZLLL(jSONObject4, "poi_id", str4);
                    }
                    C2365509Or.LIZLLL(jSONObject3, "query_params", jSONObject4);
                    final JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("claim_poi_data", jSONObject3);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("buildSparkView schema=");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" templateData=");
                    sbLIZ.append(jSONObject5);
                    C2188811AlT.LIZIZ(sbLIZ);
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(strLIZIZ);
                    sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0hLx
                        @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                            C1537910q7h c1537910q7h;
                            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                                c1537910q7h.LJIJJ = TemplateData.LJIIIIZZ(C786410Ut5.J3(jSONObject5));
                                c1537910q7h.LJIIIIZZ(new C1208690hYh(this, 5));
                            }
                        }
                    });
                    sparkContext.LJJJJZI(new C1209100hZM(this, 15));
                    C1541950qED.LIZJ.getClass();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                    ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                        marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                    }
                    C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, marginLayoutParams);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                    if (numLIZJ != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.setBackgroundColor(numLIZJ.intValue());
                    }
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                    this.LLJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                    viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("something was wrong when buildSparkView, e=");
                    sbLIZ2.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1200770hLv.LIZ.LIZLLL("build_poi_claim_spark_view", e2.getMessage());
                }
            }
        }
    }
}
