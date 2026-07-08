package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetFunctionInfo {
    public static final TypeAdapter ADAPTER = new WidgetFunctionInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("banned_scene")
    public List<String> bannedScene;

    @C09CT("function")
    public String funcName;

    public WidgetFunctionInfo() {
        this("", null);
    }

    public WidgetFunctionInfo(String str, List<String> list) {
        this.funcName = str;
        this.bannedScene = list;
    }
}
