package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.AbstractC677870QiP;
import X.C019F;
import X.C12869051v;
import X.C1396605dM;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C259800zU;
import X.C674800QdS;
import X.C675150Qe1;
import X.C675270QeD;
import X.C677890QiR;
import X.C678760Qjq;
import X.C678780Qjs;
import X.C679270Qkf;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC678770Qjr;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.SearchWordCorrectionAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchWordCorrectionAssem extends MixReusedUIAssem<SearchWordCorrectionAssem, C678780Qjs> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static String LLJZ;
    public static String LLJZIJLIL;
    public static String LLL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public final AssemVMLazy LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchWordCorrectionAssem.class, "mixShopBizVM", "getMixShopBizVM()Lcom/ss/android/ugc/aweme/ecommerce/search/page/mix/MixShopSearchBizVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchWordCorrectionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixShopSearchBizVM.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 101), AFwS241S0000000_10.get$arr$(60), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bp4;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public final TuxTextView tp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.job) : null;
            this.LLJLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public static String sp(int i) {
        if (i == EnumC678770Qjr.LEVEL_WEAK.getValue()) {
            return "weak";
        }
        if (i == EnumC678770Qjr.LEVEL_STRONG.getValue()) {
            return "strong";
        }
        EnumC678770Qjr.LEVEL_NO.getValue();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, java.lang.String] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        final C678760Qjq c678760Qjq;
        final String strLIZLLL;
        final String strLIZLLL2;
        C675150Qe1 c675150Qe1;
        C674800QdS c674800QdS;
        JSONObject jSONObject;
        final boolean z;
        LogPbBean logPbBean;
        String imprId;
        LogPbBean logPbBean2;
        n nVar;
        n nVar2;
        final C678780Qjs c678780Qjs = (C678780Qjs) obj;
        AbstractC677870QiP abstractC677870QiP = c678780Qjs.LL;
        if ((abstractC677870QiP instanceof C678760Qjq) && (c678760Qjq = (C678760Qjq) abstractC677870QiP) != null) {
            View viewFindViewById = this.LLJLIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.uncorrected_view);
                } else {
                    viewFindViewById = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(c678760Qjq.LJI);
            View viewFindViewById2 = this.LLJLILLLLZIIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.pti);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(c678760Qjq.LJII);
            C677890QiR c677890QiR = c678780Qjs.LLILLL;
            String strOptString = "";
            if (c677890QiR == null || (nVar2 = c677890QiR.LIZIZ) == null || (strLIZLLL = C12869051v.LIZLLL(nVar2, "search_id")) == null) {
                AssemVMLazy assemVMLazy = this.LLJLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
                n value = ((MixShopSearchBizVM) assemVMLazy.getValue()).LLIZLLLIL.getValue();
                if (value == null || (strLIZLLL = C12869051v.LIZLLL(value, "search_id")) == null) {
                    strLIZLLL = "";
                }
            }
            C1396605dM c1396605dM = op().LLILZ;
            if (c1396605dM == null) {
                c1396605dM = null;
            }
            C675270QeD c675270QeD = c1396605dM.LIZLLL.LJFF;
            C677890QiR c677890QiR2 = c678780Qjs.LLILLL;
            if (c677890QiR2 == null || (nVar = c677890QiR2.LIZIZ) == null || (strLIZLLL2 = C12869051v.LIZLLL(nVar, "keyword")) == null) {
                if (!(c675270QeD instanceof C675150Qe1) || (c675150Qe1 = (C675150Qe1) c675270QeD) == null || (c674800QdS = c675150Qe1.LJFF) == null) {
                    strLIZLLL2 = "";
                } else {
                    strLIZLLL2 = c674800QdS.keyword;
                }
            }
            TuxTextView tuxTextViewTp = tp();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(strLIZLLL2);
            sbLIZ.append('\"');
            tuxTextViewTp.setText(C2188811AlT.LIZIZ(sbLIZ));
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            Object obj2 = ((LinkedHashMap) op().LLILLL).get("searchInitParams");
            if (obj2 instanceof JSONObject) {
                jSONObject = (JSONObject) obj2;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                strOptString = jSONObject.optString("enter_from", "");
                c259800zU.element = jSONObject.optString("search_entrance", strOptString);
            }
            String str = "mall";
            if (!Intrinsics.LJFF(strOptString, "mall") && !Intrinsics.LJFF(strOptString, "homepage_mall")) {
                z = false;
            } else {
                z = true;
            }
            C786410Ut5.h9(tp(), new View.OnClickListener() { // from class: X.0Qjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogPbBean logPbBean3;
                    String str2;
                    LogPbBean logPbBean4;
                    String imprId2 = null;
                    IMixVSearchAbility iMixVSearchAbility = (IMixVSearchAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LL.tp(), null), IMixVSearchAbility.class, null);
                    if (iMixVSearchAbility != null) {
                        iMixVSearchAbility.sv(c678760Qjq.LJIIIIZZ);
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C677890QiR c677890QiR3 = c678780Qjs.LLILLL;
                    if (c677890QiR3 != null) {
                        logPbBean3 = c677890QiR3.LIZ;
                    } else {
                        logPbBean3 = null;
                    }
                    c2344009Gk.LJ(logPbBean3, "log_pb");
                    C677890QiR c677890QiR4 = c678780Qjs.LLILLL;
                    if (c677890QiR4 != null && (logPbBean4 = c677890QiR4.LIZ) != null) {
                        imprId2 = logPbBean4.getImprId();
                    }
                    c2344009Gk.LJIIIIZZ("impr_id", imprId2);
                    c2344009Gk.LJIIIIZZ("search_id", strLIZLLL);
                    c2344009Gk.LJIIIIZZ("search_entrance", c259800zU.element);
                    if (!z) {
                        str2 = "shop";
                    } else {
                        str2 = "mall";
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str2);
                    c2344009Gk.LJIIIIZZ("search_keyword", strLIZLLL2);
                    c2344009Gk.LJIIIIZZ("search_type", "shop");
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    c2344009Gk.LJIIIIZZ("click_type", "original_keyword");
                    c2344009Gk.LJIIIIZZ("corrected_keyword", c678760Qjq.LJIIIIZZ);
                    SearchWordCorrectionAssem searchWordCorrectionAssem = this.LL;
                    int i = c678760Qjq.LJIIIZ;
                    searchWordCorrectionAssem.getClass();
                    c2344009Gk.LJIIIIZZ("correction_type", SearchWordCorrectionAssem.sp(i));
                    c2344009Gk.LJIIIIZZ("original_keyword", strLIZLLL2);
                    C679270Qkf.LIZIZ("search_correction", c2344009Gk.LIZ);
                }
            });
            if (!Intrinsics.LJFF(strLIZLLL, LLJZ) || !Intrinsics.LJFF(strLIZLLL2, LLJZIJLIL) || !Intrinsics.LJFF(c678760Qjq.LJIIIIZZ, LLL)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                C677890QiR c677890QiR3 = c678780Qjs.LLILLL;
                if (c677890QiR3 != null) {
                    logPbBean = c677890QiR3.LIZ;
                } else {
                    logPbBean = null;
                }
                c2344009Gk.LJ(logPbBean, "log_pb");
                C677890QiR c677890QiR4 = c678780Qjs.LLILLL;
                if (c677890QiR4 != null && (logPbBean2 = c677890QiR4.LIZ) != null) {
                    imprId = logPbBean2.getImprId();
                } else {
                    imprId = null;
                }
                c2344009Gk.LJIIIIZZ("impr_id", imprId);
                c2344009Gk.LJIIIIZZ("search_id", strLIZLLL);
                c2344009Gk.LJIIIIZZ("search_entrance", (String) c259800zU.element);
                if (!z) {
                    str = "shop";
                }
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("search_keyword", strLIZLLL2);
                c2344009Gk.LJIIIIZZ("search_type", "shop");
                c2344009Gk.LJIIIIZZ("action_type", "show");
                c2344009Gk.LJIIIIZZ("corrected_keyword", c678760Qjq.LJIIIIZZ);
                c2344009Gk.LJIIIIZZ("correction_type", sp(c678760Qjq.LJIIIZ));
                c2344009Gk.LJIIIIZZ("original_keyword", strLIZLLL2);
                C679270Qkf.LIZIZ("search_correction", c2344009Gk.LIZ);
                LLJZ = strLIZLLL;
                LLJZIJLIL = strLIZLLL2;
                LLL = c678760Qjq.LJIIIIZZ;
            }
        }
    }
}
