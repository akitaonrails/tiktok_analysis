package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewGuideConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rule_1_trigger_delay_seconds")
    public final int rule1DelaySeconds;

    @C09CT("rule_2_trigger_delay_seconds")
    public final int rule2DelaySeconds;

    @C09CT("max_display_duration")
    public final long showDuration;

    @C09CT("tag2_list")
    public final List<Long> tag2List;

    @C09CT("ui_style")
    public final int uiStyle;

    @C09CT("version_id")
    public final int versionId;

    public LivePreviewGuideConfig() {
        this(false, 1, new ArrayList(), 10000L, 0, 10, 20);
    }

    public LivePreviewGuideConfig(boolean z, int i, List<Long> list, long j, int i2, int i3, int i4) {
        this.enable = z;
        this.uiStyle = i;
        this.tag2List = list;
        this.showDuration = j;
        this.versionId = i2;
        this.rule1DelaySeconds = i3;
        this.rule2DelaySeconds = i4;
    }
}
