package com.bytedance.pitaya.api.bean;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PTYNativeTaskData implements ReflectionCall {
    public final Object data;
    public final JSONObject extra;

    public PTYNativeTaskData() {
        this(null, null);
    }

    public final PTYNativeTaskData copy(Object obj, JSONObject jSONObject) {
        return new PTYNativeTaskData(obj, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYNativeTaskData)) {
            return false;
        }
        PTYNativeTaskData pTYNativeTaskData = (PTYNativeTaskData) obj;
        return Intrinsics.LJFF(this.data, pTYNativeTaskData.data) && Intrinsics.LJFF(this.extra, pTYNativeTaskData.extra);
    }

    public int hashCode() {
        Object obj = this.data;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        JSONObject jSONObject = this.extra;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYNativeTaskData(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Object getData() {
        return this.data;
    }

    public final JSONObject getExtra() {
        return this.extra;
    }

    public PTYNativeTaskData(Object obj, JSONObject jSONObject) {
        this.data = obj;
        this.extra = jSONObject;
    }
}
