package com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel;

import X.AbstractC316870CbV;
import X.C1559260qg8;
import X.C1565750qqb;
import X.C1573050r2N;
import X.C317290CcB;
import X.C627660Ojc;
import X.C723600SZy;
import X.EnumC1574970r5T;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeaturedVideoAwemeListViewModel extends AssemListViewModel<C1573050r2N, InterfaceC1891350zJl, Long> {
    public final ArrayList<InterfaceC1891350zJl> LL = new ArrayList<>();
    public final C1559260qg8 LLILLJJLI;
    public Aweme LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC1574970r5T enumC1574970r5T = EnumC1574970r5T.DEFAULT;
        C1565750qqb c1565750qqb = (C1565750qqb) this.LLILLJJLI.getValue();
        return new C1573050r2N(enumC1574970r5T, c1565750qqb != null ? c1565750qqb.LLILLJJLI : null, 12);
    }

    public FeaturedVideoAwemeListViewModel() {
        C1559260qg8 c1559260qg8 = new C1559260qg8(new C723600SZy(this, C1565750qqb.class, "hierarchy_data_feature_video"), true);
        this.LLILLJJLI = c1559260qg8;
        C1565750qqb c1565750qqb = (C1565750qqb) c1559260qg8.getValue();
        this.LLILLL = c1565750qqb != null ? c1565750qqb.LLILLJJLI : null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 176));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        Aweme aweme;
        C1565750qqb c1565750qqb = (C1565750qqb) this.LLILLJJLI.getValue();
        if (c1565750qqb != null && (aweme = c1565750qqb.LLILLJJLI) != null) {
            setState(new AwS603S0100000_24(aweme, 586));
            this.LLILLL = aweme;
        }
        return vQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: Exception -> 0x00db, TryCatch #0 {Exception -> 0x00db, blocks: (B:23:0x005f, B:24:0x0062, B:25:0x0064, B:27:0x007a, B:28:0x0080, B:30:0x0086, B:32:0x0098, B:33:0x009a, B:35:0x00ae, B:15:0x003b, B:17:0x0045, B:19:0x0049), top: B:42:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r9) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }
}
