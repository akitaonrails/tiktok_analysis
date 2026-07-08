package org.chromium.wschannel;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* JADX INFO: loaded from: classes14.dex */
public class TrafficChangedObservable extends Observable {
    public static volatile TrafficChangedObservable sInstance;

    public static TrafficChangedObservable inst() {
        if (sInstance == null) {
            synchronized (TrafficChangedObservable.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TrafficChangedObservable();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void notifyTrafficChangedObservers(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    public void onTrafficChanged(String str, long j, long j2, boolean z) {
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("sent_bytes", Long.valueOf(j));
        map.put("received_bytes", Long.valueOf(j2));
        map.put("is_heartbeat_frame", Boolean.valueOf(z));
        notifyTrafficChangedObservers(map);
    }
}
