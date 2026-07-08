package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestTopLivePushCardModel {
    public static final TypeAdapter ADAPTER = new MultiGuestTopLivePushCardModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_seconds")
    public long delaySeconds;

    @C09CT("enable")
    public boolean enable;

    @C09CT("not_consume_controls")
    public List<NotConsumeControlsModel> notConsumeControls;

    @C09CT("residence_seconds")
    public long residenceSeconds;

    public MultiGuestTopLivePushCardModel() {
        this(false, 0L, 0L, null, 15, null);
    }

    public MultiGuestTopLivePushCardModel(boolean z, long j, long j2, List<NotConsumeControlsModel> list) {
        this.enable = z;
        this.delaySeconds = j;
        this.residenceSeconds = j2;
        this.notConsumeControls = list;
    }

    public MultiGuestTopLivePushCardModel(boolean z, long j, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 10L : j, (i & 4) != 0 ? 5L : j2, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
