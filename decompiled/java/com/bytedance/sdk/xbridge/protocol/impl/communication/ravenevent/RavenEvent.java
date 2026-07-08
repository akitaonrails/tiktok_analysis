package com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent;

import X.C09CT;
import X.C1543800qHC;
import X.C20085613iQ;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2348609Ie;
import com.google.gson.Gson;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.WritableMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class RavenEvent implements Comparable<RavenEvent> {
    public transient boolean LL = true;

    @C09CT("data")
    public final Object data;

    @C09CT("eventName")
    public final String eventName;

    @C09CT("timestamp")
    public long timestamp;

    public final WritableMap LIZJ() {
        Object obj = this.data;
        if (obj instanceof JavaOnlyMap) {
            return JavaOnlyMap.from(C2097608Jq.LJIIJ(new Pair("eventName", this.eventName), new Pair("timestamp", Long.valueOf(this.timestamp)), new Pair("data", this.data)));
        }
        if (obj instanceof Map) {
            return C1543800qHC.LIZ(C2097608Jq.LJIIJ(new Pair("eventName", this.eventName), new Pair("timestamp", Long.valueOf(this.timestamp)), new Pair("data", this.data)));
        }
        if (obj == null) {
            return C1543800qHC.LIZ(C2097608Jq.LJIIJ(new Pair("eventName", this.eventName), new Pair("timestamp", Long.valueOf(this.timestamp))));
        }
        Gson gson = C2348609Ie.LIZ;
        return C1543800qHC.LIZ(C2097608Jq.LJIIJ(new Pair("eventName", this.eventName), new Pair("timestamp", Long.valueOf(this.timestamp)), new Pair("data", C2348609Ie.LIZIZ(new JSONObject(C2348609Ie.LJ(this.data))))));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenEvent(eventName='");
        sbLIZ.append(this.eventName);
        sbLIZ.append("', timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", isSticky=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(RavenEvent ravenEvent) {
        RavenEvent ravenEvent2 = ravenEvent;
        long j = this.timestamp;
        if (j != ravenEvent2.timestamp) {
            return C20085613iQ.LIZIZ(Long.valueOf(j), Long.valueOf(ravenEvent2.timestamp));
        }
        return -1;
    }

    public RavenEvent(String str, long j, Object obj) {
        this.eventName = str;
        this.timestamp = j;
        this.data = obj;
    }
}
