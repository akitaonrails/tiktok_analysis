package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawerFollow {
    public static final TypeAdapter ADAPTER = new DrawerFollow_OptTypeAdapter(NormalGson.singleton());

    @C09CT("drawer_following_entrance")
    public boolean drawerFollowEntrance;

    @C09CT("drawer_following_live_style")
    public int drawerFollowStyle;

    @C09CT("drawer_game_entrance")
    public boolean drawerGameEntrance;

    @C09CT("tt_live_drawer_load_entrance_show_time")
    public int entranceShowTime = 3;

    @C09CT("tt_live_drawer_load_entrances")
    public List<String> unFollowEntrances = new ArrayList();
}
