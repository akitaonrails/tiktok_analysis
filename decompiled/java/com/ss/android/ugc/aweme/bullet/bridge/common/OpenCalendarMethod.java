package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1388190mED;
import X.C1877110ywn;
import X.C1906200zhi;
import X.C1906210zhj;
import X.C19748512Ol;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.liveevent.CalendarEvent;
import com.ss.android.ugc.aweme.liveevent.EventParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class OpenCalendarMethod extends BaseBridgeMethod {
    public static final C1877110ywn Companion = new Object() { // from class: X.0ywn
    };
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenCalendarMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "calendarOperation";
    }

    private final void openSystemCalendarApp(CalendarEvent calendarEvent, InterfaceC1019840ce6 interfaceC1019840ce6) {
        String str;
        String str2;
        long j;
        Activity activityLIZ = null;
        if (calendarEvent != null) {
            str = calendarEvent.title;
            str2 = calendarEvent.note;
        } else {
            str = null;
            str2 = null;
        }
        long j2 = 0;
        if (calendarEvent != null) {
            j = calendarEvent.startTime;
            j2 = calendarEvent.endTime;
        } else {
            j = 0;
        }
        C1906210zhj c1906210zhj = new C1906210zhj(str, str2, j, j2, "", -1, -1, false);
        if (getContext() == null) {
            return;
        }
        C1906200zhi c1906200zhi = new C1906200zhi();
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        }
        if (C1906200zhi.LIZ(c1906200zhi, c1906210zhj, activityLIZ)) {
            interfaceC1019840ce6.LIZJ(1, "", "Open system calendar app success");
        } else {
            interfaceC1019840ce6.LIZ(0, "System calendar app is not installed");
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        EventParams eventParams = (EventParams) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, C786410Ut5.J3(jSONObject), EventParams.class);
        if (Intrinsics.LJFF(eventParams.operation, "add")) {
            openSystemCalendarApp(eventParams.event, interfaceC1019840ce6);
        } else {
            interfaceC1019840ce6.LIZ(0, "Only add operations are supported");
        }
    }
}
