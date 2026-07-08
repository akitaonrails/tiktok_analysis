package com.bytedance.android.livesdk.chatroom.model.backroom;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class BackRoomListSettingConfig {
    public static final TypeAdapter ADAPTER = new BackRoomListSettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_list")
    public List<String> blockList;

    @C09CT("multi_list")
    public List<String> multiList;

    @C09CT("single_list")
    public List<String> singleList;

    public BackRoomListSettingConfig() {
        this(null, null, null);
    }

    public BackRoomListSettingConfig(List<String> list, List<String> list2, List<String> list3) {
        this.blockList = list;
        this.multiList = list2;
        this.singleList = list3;
    }
}
