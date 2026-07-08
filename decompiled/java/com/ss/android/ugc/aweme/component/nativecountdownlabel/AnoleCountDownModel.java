package com.ss.android.ugc.aweme.component.nativecountdownlabel;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class AnoleCountDownModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("count_down_support_waiting")
    public final Boolean supportWaiting;

    @C09CT("target_components")
    public final List<String> targetComponents;

    @C09CT("count_down_template_content")
    public final String templateContent;

    @C09CT("count_down_total_seconds")
    public final Integer totalSeconds;

    @C09CT("waiting_content")
    public final String waitingContent;

    public AnoleCountDownModel(Integer num, String str, String str2, List<String> list, Boolean bool) {
        this.totalSeconds = num;
        this.templateContent = str;
        this.waitingContent = str2;
        this.targetComponents = list;
        this.supportWaiting = bool;
    }
}
