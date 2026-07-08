package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm;

import X.C143400gi;
import X.C2188811AlT;
import X.C639570P6t;
import X.InterfaceC0148002o;
import X.InterfaceC420801kM;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS124S1100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchReviewAggregationCardVM extends AssemViewModel<C143400gi> {
    public InterfaceC420801kM LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C143400gi(null, null);
    }

    public final void vQ2(String str, Map map) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshReviewAggregation, productList = ");
        C639570P6t.LIZ.getClass();
        List listLJFF = C639570P6t.LJFF(str, map);
        if (listLJFF != null) {
            numValueOf = Integer.valueOf(listLJFF.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS124S1100000_10(map, (Map<String, ? extends Object>) str, (String) 15));
    }
}
