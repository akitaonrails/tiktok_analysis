package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class RecordEntryPanelParams {
    public static final TypeAdapter ADAPTER = new RecordEntryPanelParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("count")
    public int count;

    @C09CT("should_record")
    public boolean shouldRecord;

    public RecordEntryPanelParams() {
        this(true, 3);
    }

    public RecordEntryPanelParams(boolean z, int i) {
        this.shouldRecord = z;
        this.count = i;
    }
}
