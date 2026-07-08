package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetInfo {
    public static final TypeAdapter ADAPTER = new WidgetInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("group")
    public String group;

    @C09CT("widgets_list")
    public List<String> widgetsList;

    public WidgetInfo() {
        this(null, null, 3, null);
    }

    public WidgetInfo(String str, List<String> list) {
        this.group = str;
        this.widgetsList = list;
    }

    public WidgetInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
