package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GeckoStorageOpt {
    public static final TypeAdapter ADAPTER = new GeckoStorageOpt_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ttlive_gecko_resource_unload_channel_list")
    public List<String> channelList = new ArrayList();

    @C09CT("ttlive_gecko_resource_storage_is_delete")
    public boolean isDelete;

    @C09CT("ttlive_gecko_resource_storage_is_opt")
    public boolean isOpt;
}
