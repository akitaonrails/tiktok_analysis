package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.style;

import X.C0C64;
import X.C1AF0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager;

/* JADX INFO: loaded from: classes34.dex */
public final class CombinedSkuExpandableFlowLayoutManager extends SkuFlowLayoutManager {
    public View LLILLL;
    public int LLILZ;
    public RecyclerView.LayoutParams LLILZIL;
    public boolean LLILLJJLI = true;
    public final boolean LLILZLL = C0C64.LJIILLIIL().LJIIIZ(31744, "sku_perf_opt_v1_fix", true, false);

    public final void LJIILIIL(View view) {
        try {
            addView(view);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            removeView(view);
            addView(view);
            C1AF0.LJFF(e, "addViewSafe");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02f2 A[PHI: r2
      0x02f2: PHI (r2v6 java.lang.Boolean) = (r2v4 java.lang.Boolean), (r2v7 java.lang.Boolean) binds: [B:108:0x0284, B:117:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178 A[PHI: r12
      0x0178: PHI (r12v5 java.lang.Boolean) = (r12v3 java.lang.Boolean), (r12v6 java.lang.Boolean) binds: [B:46:0x010b, B:55:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C21673319rv r25, X.C21673919s1 r26) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.style.CombinedSkuExpandableFlowLayoutManager.LJIIL(X.19rv, X.19s1):void");
    }
}
