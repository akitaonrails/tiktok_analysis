package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetPhaseInfo {
    public static final TypeAdapter ADAPTER = new WidgetPhaseInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("animate_show_strategy")
    public int animateShow;

    @C09CT("component_delay")
    public Map<String, ? extends Map<String, Long>> componentDelay;

    @C09CT("delay_time")
    public long delayTimes;

    @C09CT("function")
    public List<WidgetFunctionInfo> funcList;

    @C09CT("index")
    public int index;

    @C09CT("load_mode")
    public int loadMode;

    @C09CT("name")
    public String name;

    @C09CT("run_after_frame_draw")
    public boolean runAfterFrameDraw;

    @C09CT("show_strategy")
    public int showStrategy;

    @C09CT("show_when_last_phase_shown")
    public boolean waitLastPhaseShow;

    public WidgetPhaseInfo() {
        this(null, 0, 0, 0L, null, false, 0, null, false, 0, 1023, null);
    }

    public WidgetPhaseInfo(List<WidgetFunctionInfo> list, int i, int i2, long j, String str, boolean z, int i3, Map<String, ? extends Map<String, Long>> map, boolean z2, int i4) {
        this.funcList = list;
        this.loadMode = i;
        this.showStrategy = i2;
        this.delayTimes = j;
        this.name = str;
        this.waitLastPhaseShow = z;
        this.animateShow = i3;
        this.componentDelay = map;
        this.runAfterFrameDraw = z2;
        this.index = i4;
    }

    public WidgetPhaseInfo(List list, int i, int i2, long j, String str, boolean z, int i3, Map map, boolean z2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? C13BV.INSTANCE : list, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0L : j, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? null : map, (i5 & 256) != 0 ? false : z2, (i5 & 512) == 0 ? i4 : 0);
    }
}
