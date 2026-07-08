package com.bytedance.sync.v4.monitor;

import X.C1526300poy;
import X.C1527890prX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class WsMonitor implements GenericLifecycleObserver {
    public long LL;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public boolean LLILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onAnyActivityStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onAnyActivityResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onAnyActivityPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onAnyActivityStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onAnyActivityPause() {
        C1527890prX.LIZ("WsMonitor ON_PAUSE");
        this.LLILLL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onAnyActivityResume() {
        C1527890prX.LIZ("WsMonitor ON_RESUME");
        this.LLILLL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onAnyActivityStart() {
        C1527890prX.LIZ("WsMonitor ON_START");
        this.LLILLL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onAnyActivityStop() {
        C1527890prX.LIZ("WsMonitor ON_STOP");
        this.LLILLL = true;
    }

    public final void LIZ(long j) {
        boolean z = false;
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            if (j <= 0) {
                z = true;
            }
            try {
                jSONObject.put("socket_connected_when_start", z);
                jSONObject.put("foreground_may_launch", this.LLILLL);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", j);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1526300poy.LIZ("sync_sdk_ws_connect_ts", jSONObject, jSONObject2, null);
        }
    }
}
