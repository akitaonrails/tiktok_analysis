package com.ss.android.ugc.aweme.minis.debug.ui;

import X.AbstractC1882107Yt;
import X.C1882007Ys;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class MinisSubscriptionDebugErrorFragment extends MinisM10nDebugErrorFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiEpKzo0ZjHELIOSAlZwI6Jiw/GjoxOyY+ID8nISoiDSoxPSIJOz08OgM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugErrorFragment
    public final List<AbstractC1882107Yt> MR() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(13013, "subscription payment failed", false, false, "Subscription payment failed")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(20000, "network error", false, false, "Network error")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(50000, "internal error", false, false, "Payment system error")));
        return arrayList;
    }
}
