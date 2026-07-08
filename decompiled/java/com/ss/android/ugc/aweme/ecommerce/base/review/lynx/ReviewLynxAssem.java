package com.ss.android.ugc.aweme.ecommerce.base.review.lynx;

import X.C019F;
import X.C01GW;
import X.C0C64;
import X.C13LE;
import X.C1637806bA;
import X.C1755980vnQ;
import X.C1755990vnR;
import X.C1766470w4L;
import X.C1766480w4M;
import X.C1766490w4N;
import X.C1775710wJF;
import X.C1776240wK6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ReviewSecondPageLynxModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewLynxAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJI;
    public String LLJIJIL;
    public long LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReviewLynxAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/review/lynx/ReviewAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReviewLynxAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReviewAssemVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 315), AFwS264S0000000_24.get$arr$(80), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 314));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 313));
    }

    public final C1755980vnQ Ho() {
        return (C1755980vnQ) this.LLJ.getValue();
    }

    public final ReviewAssemVM Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ReviewAssemVM) assemVMLazy.getValue();
    }

    public final void Lo(C1766490w4N c1766490w4N) {
        if (Jo().LLJ) {
            Jo().LLJILJIL = null;
            C1755980vnQ c1755980vnQHo = Ho();
            if (c1755980vnQHo != null) {
                c1755980vnQHo.LIZJ(Go(c1766490w4N, true));
                return;
            }
            return;
        }
        Jo().LLJILJIL = c1766490w4N;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Jo().LLJIJIL = new C1766480w4M(this);
        C1755980vnQ c1755980vnQHo = Ho();
        if (c1755980vnQHo != null) {
            c1755980vnQHo.setLynxCallback(new C1775710wJF(this, 2));
        }
        C1755980vnQ c1755980vnQHo2 = Ho();
        if (c1755980vnQHo2 != null) {
            c1755980vnQHo2.setSparkLoadCallback(new C1776240wK6(this, 4));
        }
        Jo().LLJ = false;
        Jo().LLJILJIL = new C1766490w4N("loading", null);
        C1755980vnQ c1755980vnQHo3 = Ho();
        if (c1755980vnQHo3 != null && this.LLJI == null) {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ReviewSecondPageLynxModel reviewSecondPageLynxModel = C1766470w4L.LIZ;
            ReviewSecondPageLynxModel reviewSecondPageLynxModel2 = (ReviewSecondPageLynxModel) c0c64LJIILLIIL.LJJII(ReviewSecondPageLynxModel.class, reviewSecondPageLynxModel, "ec_review_second_page_lynx", true);
            if (reviewSecondPageLynxModel2 != null) {
                reviewSecondPageLynxModel = reviewSecondPageLynxModel2;
            }
            String str = reviewSecondPageLynxModel.schema;
            if (str == null || !(!a0.LJJJIL(str))) {
                str = "aweme://lynxview?use_spark=1&spark_perf_biz=pdp_integrate_lynx_air&use_forest=1&bdhm_bid=astro_behavior_lynx&bdhm_pid=pdp_secondary_review&bid=astro_behavior_lynx&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_ecommerce_pdp_review_2nd_page%2Fpages%2Fus%2Ftemplate.js";
            }
            this.LLJI = c1755980vnQHo3.LIZ(new C1755990vnR(null, str), "review_list", (ECBaseFragment) this.LLJILJILJ.getValue());
            c1755980vnQHo3.LIZIZ();
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0w4E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ReviewState) obj).getProductId();
            }
        }, null, new AwS640S0100000_26(this, 164), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0w4D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ReviewState) obj).getDataFetchStatus();
            }
        }, null, new AwS640S0100000_26(this, 26), 6);
    }

    public final String Go(C1766490w4N c1766490w4N, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seller_id", Jo().LLIZ);
        jSONObject.put("product_id", Jo().LLILZLL);
        jSONObject.put("loading_status", c1766490w4N.LIZ);
        if (!z) {
            jSONObject.put("schema_start_time", String.valueOf(System.currentTimeMillis()));
        }
        String str = c1766490w4N.LIZIZ;
        if (str != null) {
            jSONObject.put("product_detail_review", str);
        }
        return C786410Ut5.J3(jSONObject);
    }
}
