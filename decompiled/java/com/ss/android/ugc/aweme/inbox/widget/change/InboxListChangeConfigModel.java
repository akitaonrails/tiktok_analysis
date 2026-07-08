package com.ss.android.ugc.aweme.inbox.widget.change;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxListChangeConfigModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("img_change_weight")
    public final float imgChangeWeight;

    @C09CT("image_load_threshold")
    public final int imgLoadThreshold;

    @C09CT("item_change_weight")
    public final float itemChangeWeight;

    @C09CT("list_change_weight")
    public final float listChangeWeight;

    @C09CT("monitor_duration")
    public final long monitorDuration;

    @C09CT("single_change_period_threshold")
    public final long singleChangePeriodThreshold;

    public InboxListChangeConfigModel() {
        this(false, 3000L, 200L, 0.7f, 0.3f, 0.3f, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public InboxListChangeConfigModel(boolean z, long j, long j2, float f, float f2, float f3, int i) {
        this.enable = z;
        this.monitorDuration = j;
        this.singleChangePeriodThreshold = j2;
        this.listChangeWeight = f;
        this.itemChangeWeight = f2;
        this.imgChangeWeight = f3;
        this.imgLoadThreshold = i;
    }
}
