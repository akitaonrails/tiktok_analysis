package com.ss.android.ugc.aweme.fe.method;

import X.C1388190mED;
import X.C1906200zhi;
import X.C1906210zhj;
import X.C19748512Ol;
import X.InterfaceC1041760dDS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.liveevent.CalendarEvent;
import com.ss.android.ugc.aweme.liveevent.EventParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class OpenCalendarMethod extends BaseCommonJavaMethod {
    public OpenCalendarMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String str;
        long j;
        EventParams eventParams = (EventParams) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, String.valueOf(jSONObject), EventParams.class);
        if (Intrinsics.LJFF(eventParams.operation, "add")) {
            CalendarEvent calendarEvent = eventParams.event;
            Context context = this.mContextRef.get();
            if (context != null) {
                String str2 = null;
                if (calendarEvent != null) {
                    str = calendarEvent.title;
                    str2 = calendarEvent.note;
                } else {
                    str = null;
                }
                long j2 = 0;
                if (calendarEvent != null) {
                    j = calendarEvent.startTime;
                    j2 = calendarEvent.endTime;
                } else {
                    j = 0;
                }
                if (C1906200zhi.LIZ(new C1906200zhi(), new C1906210zhj(str, str2, j, j2, "", -1, -1, false), C1388190mED.LIZ(context))) {
                    if (interfaceC1041760dDS != null) {
                        interfaceC1041760dDS.LIZJ(1, "", "Open system calendar app success");
                        return;
                    }
                    return;
                } else {
                    if (interfaceC1041760dDS == null) {
                        return;
                    }
                    interfaceC1041760dDS.LIZ(0, "System calendar app is not installed");
                    return;
                }
            }
            return;
        }
        if (interfaceC1041760dDS == null) {
            return;
        }
        interfaceC1041760dDS.LIZ(0, "Only add operations are supported");
    }
}
