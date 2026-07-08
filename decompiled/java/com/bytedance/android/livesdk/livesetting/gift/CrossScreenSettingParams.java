package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
public final class CrossScreenSettingParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("anchor_resource_preload_delay")
    public long anchorPreloadDelay;

    @C09CT("check_camera_for_action_variant")
    public int checkCameraForAction;

    @C09CT("guest_resource_preload_delay")
    public long guestPreloadDelay;

    @C09CT("ignore_extra_trays")
    public int ignoreExtraTrays;

    @C09CT("ignore_public_screen_message")
    public int ignorePublicScreenMessage;

    @C09CT("sticker_queue_insert_by_priority")
    public int insertByPriority;

    static {
        NormalGson.singleton();
        ADAPTER = new CrossScreenSettingParams_OptTypeAdapter();
    }

    public CrossScreenSettingParams() {
        this(1, 1, 1, 1, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public CrossScreenSettingParams(int i, int i2, int i3, int i4, long j, long j2) {
        this.ignoreExtraTrays = i;
        this.ignorePublicScreenMessage = i2;
        this.insertByPriority = i3;
        this.checkCameraForAction = i4;
        this.anchorPreloadDelay = j;
        this.guestPreloadDelay = j2;
    }
}
