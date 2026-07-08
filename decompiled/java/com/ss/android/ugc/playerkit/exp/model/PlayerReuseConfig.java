package com.ss.android.ugc.playerkit.exp.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public class PlayerReuseConfig {

    @C09CT("disable_non_mediabox_player_reuse")
    public boolean disableNonMediaBoxPlayerReuse;

    @C09CT("enable_kernel_reuse")
    public boolean enableKernelReuse;

    @C09CT("enable_kernel_reuse_null_value_center")
    public boolean enableKernelReuseNullValueCenter;

    @C09CT("enable_live_reuse")
    public boolean enableLiveReuse;

    @C09CT("enable_mix_reuse")
    public boolean enableMixReuse;

    @C09CT("enable_vod_reuse")
    public boolean enableVodReuse;

    @C09CT("player_pool_size")
    public int playerPoolSize = 1;

    @C09CT("plugin_pool_size")
    public int pluginPoolSize = 1;

    @C09CT("plugin_reuse_mode")
    public int pluginReuseMode;

    @C09CT("pool_keep_alive_ms")
    public int poolKeepAliveMs;
}
