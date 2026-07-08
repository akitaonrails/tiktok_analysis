package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C08JS;
import X.C1906200zhi;
import X.C1906210zhj;
import X.C2214201BlK;
import X.C786410Ut5;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.touchpoint.core.model.CalendarParams;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class CreateCalendarEventMethod extends BaseCommonJavaMethod {
    public CreateCalendarEventMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CreateCalendarEventMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        Activity activityLJFF;
        if (jSONObject == null) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(-1, "Parameter invalid");
            }
        } else {
            if (this.mContextRef.get() == null || (activityLJFF = C2214201BlK.LJFF()) == null) {
                return;
            }
            CalendarParams calendarParams = (CalendarParams) C08JS.LIZ(C786410Ut5.J3(jSONObject), CalendarParams.class);
            if (C1906200zhi.LIZ(new C1906200zhi(), new C1906210zhj(calendarParams.title, calendarParams.notes, calendarParams.startDate, calendarParams.endDate, calendarParams.repeatFrequency, calendarParams.repeatInterval, calendarParams.repeatCount, calendarParams.allDay), activityLJFF)) {
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZJ(1, "", "Open system calendar app success");
                }
            } else {
                if (interfaceC1041760dDS == null) {
                    return;
                }
                interfaceC1041760dDS.LIZ(0, "System calendar app is not installed");
            }
        }
    }
}
