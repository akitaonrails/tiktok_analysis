package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes14.dex */
public final class OutAppPushWsReconnectConfigModel {

    @C09CT("cache_size")
    public final int cache_size;

    @C09CT("mix_chain_fix_delay")
    public final int mix_chain_fix_delay;

    @C09CT("upload_event")
    public final boolean upload_event;

    @C09CT("ws_background_expire_time")
    public final int ws_background_expire_time;

    @C09CT("ws_foreground_expire_time")
    public final int ws_foreground_expire_time;

    @C09CT("ws_reconnect_delay")
    public final int ws_reconnect_delay;

    public OutAppPushWsReconnectConfigModel() {
        this(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, false, LSPassThroughRecordSizeConfig.DEFAULT, 800000, 1750000);
    }

    public OutAppPushWsReconnectConfigModel(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.cache_size = i;
        this.mix_chain_fix_delay = i2;
        this.upload_event = z;
        this.ws_reconnect_delay = i3;
        this.ws_foreground_expire_time = i4;
        this.ws_background_expire_time = i5;
    }
}
