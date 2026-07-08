package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes36.dex */
public class LivePublicScreenConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("anim_style")
    public int animStyle;

    @C09CT("fold_message_scroll_type")
    public int foldMessageScrollType;

    @C09CT("fold_message_show_mode")
    public int foldMessageShowMode;

    @C09CT("consume_count_per_loop")
    public int consumeCountPerLoop = 100;

    @C09CT("consume_interval")
    public int consumeInterval = LSPassThroughRecordSizeConfig.DEFAULT;

    @C09CT("first_loop_consume_delay")
    public int firstLoopConsumeDelay = 2000;

    @C09CT("ms_per_inch")
    public int msPerInch = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    @C09CT("others_buffer_size")
    public int othersBufferSize = 100;

    @C09CT("max_message_in_recyclerview")
    public int maxMessageInRecyclerview = 200;

    static {
        NormalGson.singleton();
        ADAPTER = new LivePublicScreenConfig_OptTypeAdapter();
    }

    public final int LIZ() {
        int i = this.consumeCountPerLoop;
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final boolean LIZIZ() {
        return this.foldMessageShowMode == 1;
    }
}
