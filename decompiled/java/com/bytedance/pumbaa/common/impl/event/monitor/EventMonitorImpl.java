package com.bytedance.pumbaa.common.impl.event.monitor;

import X.C793770VBv;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class EventMonitorImpl implements IEventMonitor {
    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        C793770VBv.LJ(str, jSONObject);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C793770VBv.LJFF(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C793770VBv.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C793770VBv.LJIIIZ(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusAndEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJIIJ(str, i, jSONObject, jSONObject2, jSONObject3);
    }
}
