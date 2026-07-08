package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class GeckoLiveGroupOpt {

    @C09CT("gecko_pause_on_destroy")
    public boolean isPause;

    @C09CT("use_gecko_live_normal")
    public boolean isEnable = true;

    @C09CT("gecko_load_strategy")
    public int strategy = 2;

    @C09CT("gecko_channel_list")
    public ArrayList<String> channelList = new ArrayList<>();

    @C09CT("gecko_fail_retry_time")
    public int retryTime = 3;
}
