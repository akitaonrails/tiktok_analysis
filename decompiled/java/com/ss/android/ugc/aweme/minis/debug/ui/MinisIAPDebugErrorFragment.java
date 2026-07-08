package com.ss.android.ugc.aweme.minis.debug.ui;

import X.AbstractC1882107Yt;
import X.C1882007Ys;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class MinisIAPDebugErrorFragment extends MinisM10nDebugErrorFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiEpHELIOSKzo0ZjAlZwI6Jiw/AA4DDCAuPCgWOjcjOwkhKSIhLCEn";

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugErrorFragment
    public final List<AbstractC1882107Yt> MR() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(13000, "check env failed, store connection fail", false, false, "Check env-store connection failed")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(13001, "check env failed, time out", false, false, "Check env-time out")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(13002, "check env failed, device not support", false, false, "Check env-device not supported")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(13013, "IAP payment failed", false, false, "Payment failed")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(20000, "network error", false, false, "Network error")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(30002, "IAP payment, user selected pending form of payment", false, false, "User selected pending form of payment")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(50000, "internal error", false, false, "Payment system error")));
        return arrayList;
    }
}
