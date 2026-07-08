package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ToolbarReuseConfig {
    public static final TypeAdapter ADAPTER = new ToolbarReuseConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disable_list")
    public List<String> disableList = new ArrayList();

    @C09CT("enable")
    public boolean enable;
}
