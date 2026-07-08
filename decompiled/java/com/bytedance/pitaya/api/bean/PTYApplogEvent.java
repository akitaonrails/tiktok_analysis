package com.bytedance.pitaya.api.bean;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PTYApplogEvent implements ReflectionCall {
    public final String args;
    public final String eventName;
    public final double timestamp = System.currentTimeMillis() / 1000.0d;
    public final PTYApplogEventType type;

    public final PTYApplogEvent copy(String str, String str2, PTYApplogEventType pTYApplogEventType) {
        return new PTYApplogEvent(str, str2, pTYApplogEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYApplogEvent)) {
            return false;
        }
        PTYApplogEvent pTYApplogEvent = (PTYApplogEvent) obj;
        return Intrinsics.LJFF(this.eventName, pTYApplogEvent.eventName) && Intrinsics.LJFF(this.args, pTYApplogEvent.args) && this.type == pTYApplogEvent.type;
    }

    public int hashCode() {
        int iHashCode = this.eventName.hashCode() * 31;
        String str = this.args;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYApplogEvent(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", args=");
        sbLIZ.append(this.args);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getArgs() {
        return this.args;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    public final PTYApplogEventType getType() {
        return this.type;
    }

    public PTYApplogEvent(String str, String str2, PTYApplogEventType pTYApplogEventType) {
        this.eventName = str;
        this.args = str2;
        this.type = pTYApplogEventType;
    }
}
