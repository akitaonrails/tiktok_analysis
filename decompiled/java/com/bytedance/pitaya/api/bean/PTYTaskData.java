package com.bytedance.pitaya.api.bean;

import X.C0NTS;
import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PTYTaskData implements ReflectionCall {
    public C0NTS dataFetcher;
    public final JSONObject params;

    public final PTYTaskData copy(JSONObject jSONObject) {
        return new PTYTaskData(jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PTYTaskData) && Intrinsics.LJFF(this.params, ((PTYTaskData) obj).params);
    }

    public int hashCode() {
        JSONObject jSONObject = this.params;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYTaskData(params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0NTS getDataFetcher() {
        return this.dataFetcher;
    }

    public final JSONObject getParams() {
        return this.params;
    }

    public PTYTaskData(JSONObject jSONObject) {
        this.params = jSONObject;
    }

    public final void setDataFetcher(C0NTS c0nts) {
        this.dataFetcher = c0nts;
    }
}
