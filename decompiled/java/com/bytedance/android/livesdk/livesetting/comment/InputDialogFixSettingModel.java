package com.bytedance.android.livesdk.livesetting.comment;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class InputDialogFixSettingModel {
    public static final TypeAdapter ADAPTER = new InputDialogFixSettingModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delayTime")
    public long delayTime;

    @C09CT("enable")
    public boolean enable;

    public InputDialogFixSettingModel() {
        this(false, 0L);
    }

    public InputDialogFixSettingModel(boolean z, long j) {
        this.enable = z;
        this.delayTime = j;
    }
}
