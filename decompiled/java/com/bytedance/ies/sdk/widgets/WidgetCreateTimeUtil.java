package com.bytedance.ies.sdk.widgets;

import X.C1CC2;
import X.C2097908Jt;
import X.C500260Jjc;
import X.InterfaceC2262351Dgn;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class WidgetCreateTimeUtil implements InterfaceC2262351Dgn {
    public final Function1<com.bytedance.android.widget.Widget, Unit> onWidgetLoadedListener;
    public final Map<String, Object> widgetCreateTimeMap;

    public WidgetCreateTimeUtil() {
        this(null);
    }

    @Override // X.InterfaceC2262351Dgn
    public void onLoad(com.bytedance.android.widget.Widget widget, long j) {
    }

    public final void clear() {
        this.widgetCreateTimeMap.clear();
    }

    public final void send() {
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_widget_create_cost_time")) {
            C1CC2.LJIILJJIL(0, 1, "ttlive_widget_create_cost_time", C2097908Jt.LIZJ(new Pair("widget_time", this.widgetCreateTimeMap)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetCreateTimeUtil(Function1<? super com.bytedance.android.widget.Widget, Unit> function1) {
        this.onWidgetLoadedListener = function1;
        this.widgetCreateTimeMap = new HashMap();
    }

    @Override // X.InterfaceC2262351Dgn
    public boolean needUploadTime(com.bytedance.android.widget.Widget widget) {
        LiveRecyclableWidget liveRecyclableWidget;
        Boolean boolValueOf = null;
        if ((widget instanceof LiveRecyclableWidget) && (liveRecyclableWidget = (LiveRecyclableWidget) widget) != null) {
            boolValueOf = Boolean.valueOf(liveRecyclableWidget.isInitialized());
        }
        return C500260Jjc.LJJIJIIJIL(boolValueOf);
    }
}
