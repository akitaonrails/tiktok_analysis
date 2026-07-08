package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class AwemeToolFeedbackInfo {
    public static final int $stable = 8;

    @C09CT("cancel_count")
    public final int cancelCount;
    public final int count;

    @C09CT("e_code")
    public final List<AwemeToolFeedbackECode> eCode;
    public final String name;

    @C09CT("success_count")
    public final int successCount;

    public AwemeToolFeedbackInfo() {
        this("", 0, 0, 0, new ArrayList());
    }

    public AwemeToolFeedbackInfo(String str, int i, int i2, int i3, List<AwemeToolFeedbackECode> list) {
        this.name = str;
        this.count = i;
        this.successCount = i2;
        this.cancelCount = i3;
        this.eCode = list;
    }
}
