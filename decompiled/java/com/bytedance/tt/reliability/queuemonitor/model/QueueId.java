package com.bytedance.tt.reliability.queuemonitor.model;

import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueId {
    public final String callerThreadName;
    public final Map<String, Object> commonParams;
    public final String createStack;
    public final String groupType;
    public final String id;
    public final String name;
    public final QueueType type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueId)) {
            return false;
        }
        QueueId queueId = (QueueId) obj;
        return this.type == queueId.type && Intrinsics.LJFF(this.id, queueId.id) && Intrinsics.LJFF(this.name, queueId.name) && Intrinsics.LJFF(this.groupType, queueId.groupType) && Intrinsics.LJFF(this.callerThreadName, queueId.callerThreadName) && Intrinsics.LJFF(this.createStack, queueId.createStack) && Intrinsics.LJFF(this.commonParams, queueId.commonParams);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.groupType.hashCode()) * 31) + this.callerThreadName.hashCode()) * 31;
        String str = this.createStack;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.commonParams.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueId(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.groupType);
        sbLIZ.append(", callerThreadName=");
        sbLIZ.append(this.callerThreadName);
        sbLIZ.append(", createStack=");
        sbLIZ.append((Object) this.createStack);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.commonParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QueueId(QueueType queueType, String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        this.type = queueType;
        this.id = str;
        this.name = str2;
        this.groupType = str3;
        this.callerThreadName = str4;
        this.createStack = str5;
        this.commonParams = map;
    }
}
