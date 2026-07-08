package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes12.dex */
public final class ChannelsAuthPushAddNewScenes {
    public static final int DEFAULT = 0;
    public static final ChannelsAuthPushAddNewScenes INSTANCE = new ChannelsAuthPushAddNewScenes();
    public static final int ADD_WITHOUT_16VV = 1;
    public static final int ADD_ALL = 2;

    public final boolean add16VV() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "channel_auth_push_new_scene_type", false) == ADD_ALL;
    }

    public final boolean added() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "channel_auth_push_new_scene_type", false) > DEFAULT;
    }
}
