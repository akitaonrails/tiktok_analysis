package com.bytedance.android.livesdk.shorttouch.ui;

import X.C1078030e9x;
import X.C1099020eho;
import X.C1101600ely;
import X.C1101610elz;
import X.C1101810emJ;
import X.C1101970emZ;
import X.C1102000emc;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.InterfaceC1101990emb;
import X.InterfaceC1102010emd;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchWidgetRecycleSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.bytedance.android.livesdk.shorttouch.ShortTouchMessageEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ShortTouchPreviewWidget extends PerformProcessWidget implements InterfaceC1101990emb, InterfaceC1102010emd {
    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void p1(C1101970emZ c1101970emZ) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveShortTouchWidgetRecycleSetting.INSTANCE.getPreviewWidgetRecycle();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C1101610elz c1101610elz = C1102000emc.LIZ;
        c1101610elz.LIZLLL = null;
        c1101610elz.LJFF = false;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C1078030e9x) {
                    C1099020eho.LIZJ = ((C1078030e9x) obj).LIZ;
                }
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_short_touch_preview_widget_load_finished")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = C1099020eho.LIZJ;
            long j2 = -1;
            if (j != -1) {
                j2 = jElapsedRealtime - j;
            }
            linkedHashMap.put("duration", Long.valueOf(j2));
            C1099020eho.LIZIZ("ttlive_short_touch_preview_widget_load_finished", linkedHashMap);
        }
        C1101610elz c1101610elz = C1102000emc.LIZ;
        C1101600ely c1101600ely = c1101610elz.LJIIJ;
        c1101600ely.getClass();
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            c1101600ely.LLIZ = this;
            c1101600ely.LLILZIL = new C1101810emJ(this);
            c1101600ely.LJFF();
        }
        c1101610elz.LIZLLL = this;
        c1101610elz.LJFF = true;
        c1101610elz.LIZLLL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).VW(this, this.dataChannel);
        }
    }

    public final void x1(C1101970emZ c1101970emZ) {
        if (!this.isDestroyed) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Short touch preview] Notify short touch, id = ");
            sbLIZ.append(c1101970emZ.LIZIZ);
            sbLIZ.append(", operation = ");
            sbLIZ.append(c1101970emZ.LIZ);
            C20441214yg.LIZIZ("TikTok Live Short Touch", C2188811AlT.LIZIZ(sbLIZ));
            this.dataChannel.LC0(ShortTouchMessageEvent.class, c1101970emZ);
        }
    }
}
