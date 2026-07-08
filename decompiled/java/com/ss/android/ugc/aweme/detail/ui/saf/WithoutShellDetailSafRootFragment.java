package com.ss.android.ugc.aweme.detail.ui.saf;

import X.C195R;
import X.C2189821An6;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class WithoutShellDetailSafRootFragment extends DetailSafRootFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpPS46JGs5IGEgHELIOSKSNiHiYnICo5PRw7LSkgDSonKSwgGi41GiojPQkhKSIhLCEn";

    public WithoutShellDetailSafRootFragment() {
        aS(AFwS264S0000000_24.get$arr$(68));
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        DetailNavArgModel navArgModel;
        Integer safAnimDelayMode;
        long jLongValue;
        long j;
        DetailNavArgModel navArgModel2;
        Long safAnimDelayTimeoutMs;
        super.onResume();
        C2189821An6 c2189821An6 = this.LLJLLL;
        if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null || (safAnimDelayMode = navArgModel.getSafAnimDelayMode()) == null || safAnimDelayMode.intValue() != 1) {
            return;
        }
        C2189821An6 c2189821An62 = this.LLJLLL;
        if (c2189821An62 != null && (navArgModel2 = c2189821An62.getNavArgModel()) != null && (safAnimDelayTimeoutMs = navArgModel2.getSafAnimDelayTimeoutMs()) != null) {
            jLongValue = safAnimDelayTimeoutMs.longValue();
            j = 0;
            if (jLongValue > 0) {
                if (jLongValue > 10000) {
                    jLongValue = 10000;
                }
            }
            C195R.LIZIZ(this, j);
        }
        jLongValue = 1000;
        j = jLongValue;
        C195R.LIZIZ(this, j);
    }
}
