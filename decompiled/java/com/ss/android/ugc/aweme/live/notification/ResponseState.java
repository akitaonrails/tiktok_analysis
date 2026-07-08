package com.ss.android.ugc.aweme.live.notification;

import X.C004I;
import X.C1253040iiE;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseState implements C004I, InterfaceC0148002o {
    public final C1253040iiE cacheEvent;
    public final C1253040iiE networkEvent;
    public final int pushState;
    public final int statusCode;

    public ResponseState() {
        this(-1, -1, null, null);
    }

    public final ResponseState copy(int i, int i2, C1253040iiE c1253040iiE, C1253040iiE c1253040iiE2) {
        return new ResponseState(i, i2, c1253040iiE, c1253040iiE2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseState)) {
            return false;
        }
        ResponseState responseState = (ResponseState) obj;
        return this.pushState == responseState.pushState && this.statusCode == responseState.statusCode && Intrinsics.LJFF(this.cacheEvent, responseState.cacheEvent) && Intrinsics.LJFF(this.networkEvent, responseState.networkEvent);
    }

    public int hashCode() {
        int i = ((this.pushState * 31) + this.statusCode) * 31;
        C1253040iiE c1253040iiE = this.cacheEvent;
        int iHashCode = (i + (c1253040iiE == null ? 0 : c1253040iiE.hashCode())) * 31;
        C1253040iiE c1253040iiE2 = this.networkEvent;
        return iHashCode + (c1253040iiE2 != null ? c1253040iiE2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseState(pushState=");
        sbLIZ.append(this.pushState);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", cacheEvent=");
        sbLIZ.append(this.cacheEvent);
        sbLIZ.append(", networkEvent=");
        sbLIZ.append(this.networkEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1253040iiE getCacheEvent() {
        return this.cacheEvent;
    }

    public final C1253040iiE getNetworkEvent() {
        return this.networkEvent;
    }

    public final int getPushState() {
        return this.pushState;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public ResponseState(int i, int i2, C1253040iiE c1253040iiE, C1253040iiE c1253040iiE2) {
        this.pushState = i;
        this.statusCode = i2;
        this.cacheEvent = c1253040iiE;
        this.networkEvent = c1253040iiE2;
    }
}
