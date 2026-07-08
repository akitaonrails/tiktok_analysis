package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button;

import X.C1892050zKt;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class EcProductAddButtonViewModel extends FeedBaseViewModel<C1892050zKt> {
    public final Map<String, Object> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public List<Long> LLILZLL;
    public List<AnchorProductInfo> LLIZ;
    public GetFypAffiliateInfoResponse LLIZLLLIL;
    public Map<String, Object> LLJ;
    public boolean LLJI;
    public int LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1892050zKt(null, null);
    }

    public EcProductAddButtonViewModel() {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("page_name", "affiliate_fyp_button"), new Pair("type", "popup"));
        this.LL = mapLJIIJ;
        this.LLILLJJLI = "";
        this.LLILLL = "add_product";
        this.LLILZ = "";
        this.LLILZIL = "homepage_hot";
        this.LLJ = mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vQ2(com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel r3, java.lang.String r4) {
        /*
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.LLJ
            java.lang.String r0 = "condition"
            r1.put(r0, r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C1892170zL5.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "EVENT_TRIGGER"
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            r2.append(r0)
            r0 = 95
            r2.append(r0)
            r2.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = r3.LLILLJJLI
            X.C1892170zL5.LIZJ(r1, r0)
            java.lang.String r0 = "8"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "7"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoResponse r0 = r3.LLIZLLLIL
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.FypCtaButton r2 = r0.fypCtaButton
        L3f:
            kotlin.jvm.internal.AwS607S0100000_28 r1 = new kotlin.jvm.internal.AwS607S0100000_28
            r0 = 235(0xeb, float:3.3E-43)
            r1.<init>(r2, r0)
            r3.setState(r1)
            return
        L4a:
            com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoResponse r0 = r3.LLIZLLLIL
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.FypCtaButton r2 = r0.fypSubButton
            goto L3f
        L51:
            r2 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel.vQ2(com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel, java.lang.String):void");
    }
}
