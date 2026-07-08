package com.ss.android.ugc.aweme.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class UGPopupRefactorExpData {

    @C09CT("refactor_exp")
    public final int exp;

    @C09CT("limit_time")
    public final int limitTime;

    @C09CT("disallow_popup_list")
    public final List<String> popupId;

    @C09CT("popup_report_delay_time")
    public final long reportDelayTime;

    public UGPopupRefactorExpData() {
        this(0, new ArrayList(), 2, 1000L);
    }

    public UGPopupRefactorExpData(int i, List<String> list, int i2, long j) {
        this.exp = i;
        this.popupId = list;
        this.limitTime = i2;
        this.reportDelayTime = j;
    }
}
