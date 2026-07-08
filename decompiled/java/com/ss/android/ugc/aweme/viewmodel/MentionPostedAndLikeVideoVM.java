package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC316870CbV;
import X.C1157130gDX;
import X.C1220270hrN;
import X.C12823050b;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MentionPostedAndLikeVideoVM extends BaseVideoListVM<C1220270hrN, C12823050b, Long> {
    public int LLJ;
    public int LLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1220270hrN(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AwS598S0100000_19(this, 591));
        super.manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C12823050b> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 279));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        this.LLILZLL = true;
        return AQ2(this.LLIZLLLIL, 0L, (String) this.LLILZIL.getValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> zQ2(List<? extends Aweme> list) {
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
        if (list != 0 && iTalentAdRevenueShareServiceLJIIL != null && iTalentAdRevenueShareServiceLJIIL.LJIIJ() != null && !iTalentAdRevenueShareServiceLJIIL.LJIIJ().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (aweme != null && (aweme.getAwemeRawAd() == null || !iTalentAdRevenueShareServiceLJIIL.LJIIJ().contains(aweme.getAwemeRawAd().getCreativeIdStr()))) {
                    arrayList.add(aweme);
                }
            }
            return arrayList;
        }
        return list;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return AQ2(this.LLIZLLLIL, ((Number) obj).longValue(), (String) this.LLILZIL.getValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(int r20, long r21, java.lang.String r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM.AQ2(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
