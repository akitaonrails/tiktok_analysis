package com.ss.android.ugc.aweme.minis.debug.ui;

import X.AbstractC1882107Yt;
import X.C1882007Ys;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class MinisIAADebugErrorFragment extends MinisM10nDebugErrorFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiEpHELIOSKzo0ZjAlZwI6Jiw/AA4SDCAuPCgWOjcjOwkhKSIhLCEn";

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugErrorFragment
    public final List<AbstractC1882107Yt> MR() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(11003, "ad instance can only show once", false, false, "Ad instance can only show once")));
        arrayList.add(new C1882007Ys(new M10nMockDebugErrorInfo(50000, "Can not play incentive ad video", false, true, "Can not play incentive ad video")));
        return arrayList;
    }
}
