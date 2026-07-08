package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C20441214yg;
import X.C2188811AlT;
import X.C771400UNu;
import X.EnumC771390UNt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class ShortCutPanelWidget extends LiveWidget {
    public final Map<EnumC771390UNt, BaseSubShortCutPanelWidget> LL = new LinkedHashMap();
    public final Set<EnumC771390UNt> LLILLJJLI = new LinkedHashSet();
    public final Set<EnumC771390UNt> LLILLL = new LinkedHashSet();
    public final Map<EnumC771390UNt, Function0<Unit>> LLILZ = new LinkedHashMap();
    public EnumC771390UNt LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2a;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget.onCreate():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        ((LinkedHashMap) this.LL).clear();
        this.LLILLJJLI.clear();
        this.LLILLL.clear();
        ((LinkedHashMap) this.LLILZ).clear();
    }

    public final void A1(EnumC771390UNt enumC771390UNt) {
        int i;
        int i2 = C771400UNu.LIZ[enumC771390UNt.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    } else {
                        i = R.id.byx;
                    }
                } else {
                    i = R.id.w4u;
                }
            } else {
                i = R.id.oy7;
            }
        } else {
            i = R.id.vqd;
        }
        Widget widget = (Widget) ((LinkedHashMap) this.LL).get(enumC771390UNt);
        if (widget == null) {
            return;
        }
        this.LLILLL.add(enumC771390UNt);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerLazyLoad panel=");
        sbLIZ.append(enumC771390UNt);
        sbLIZ.append(" containerId=");
        sbLIZ.append(i);
        sbLIZ.append(" widget=");
        sbLIZ.append(widget.getClass().getSimpleName());
        C20441214yg.LJIIIZ("ShortCutPanelWidget", C2188811AlT.LIZIZ(sbLIZ));
        this.subWidgetManager.load(i, widget);
    }

    public final boolean x1(EnumC771390UNt enumC771390UNt) {
        if (enumC771390UNt == this.LLILZIL) {
            this.LLILZIL = null;
            return true;
        }
        return false;
    }

    public final boolean y1(EnumC771390UNt enumC771390UNt) {
        int value;
        EnumC771390UNt enumC771390UNt2;
        boolean z = false;
        if (LiveBroadcastCpuOptSetting.enableV2WidgetManager() && !this.LLILLJJLI.contains(enumC771390UNt)) {
            if (!this.LLILLL.contains(enumC771390UNt)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canShowSubPanel blocked and lazy-load requested panel=");
                sbLIZ.append(enumC771390UNt);
                C20441214yg.LJIIIZ("ShortCutPanelWidget", C2188811AlT.LIZIZ(sbLIZ));
                A1(enumC771390UNt);
                return false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("canShowSubPanel allow pending lazy panel=");
            sbLIZ2.append(enumC771390UNt);
            C20441214yg.LJIIIZ("ShortCutPanelWidget", C2188811AlT.LIZIZ(sbLIZ2));
        }
        int value2 = enumC771390UNt.getValue();
        EnumC771390UNt enumC771390UNt3 = this.LLILZIL;
        if (enumC771390UNt3 != null) {
            value = enumC771390UNt3.getValue();
        } else {
            value = 0;
        }
        if (value2 >= value) {
            z = true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("canShowSubPanel panel=");
        sbLIZ3.append(enumC771390UNt);
        sbLIZ3.append(" result=");
        sbLIZ3.append(z);
        sbLIZ3.append(" showingPanel=");
        sbLIZ3.append(this.LLILZIL);
        C20441214yg.LJIIIZ("ShortCutPanelWidget", C2188811AlT.LIZIZ(sbLIZ3));
        if (z && enumC771390UNt != (enumC771390UNt2 = this.LLILZIL)) {
            BaseSubShortCutPanelWidget baseSubShortCutPanelWidget = (BaseSubShortCutPanelWidget) ((LinkedHashMap) this.LL).get(enumC771390UNt2);
            if (baseSubShortCutPanelWidget != null) {
                baseSubShortCutPanelWidget.LLILLL = "shortcut_panel_sub";
                baseSubShortCutPanelWidget.hide();
            }
            this.LLILZIL = enumC771390UNt;
        }
        return z;
    }

    public static void z1(ShortCutPanelWidget shortCutPanelWidget, EnumC771390UNt enumC771390UNt) {
        if (shortCutPanelWidget.LLILLJJLI.contains(enumC771390UNt)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadAndShow loaded panel=");
            sbLIZ.append(enumC771390UNt);
            C20441214yg.LJIIIZ("ShortCutPanelWidget", C2188811AlT.LIZIZ(sbLIZ));
            BaseSubShortCutPanelWidget baseSubShortCutPanelWidget = (BaseSubShortCutPanelWidget) ((LinkedHashMap) shortCutPanelWidget.LL).get(enumC771390UNt);
            if (baseSubShortCutPanelWidget != null) {
                baseSubShortCutPanelWidget.A1(null);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadAndShow lazy panel=");
        sbLIZ2.append(enumC771390UNt);
        sbLIZ2.append(" pending=");
        sbLIZ2.append(shortCutPanelWidget.LLILLL.contains(enumC771390UNt));
        C20441214yg.LJIIIZ("ShortCutPanelWidget", C2188811AlT.LIZIZ(sbLIZ2));
        if (shortCutPanelWidget.LLILLL.contains(enumC771390UNt)) {
            return;
        }
        shortCutPanelWidget.A1(enumC771390UNt);
    }
}
