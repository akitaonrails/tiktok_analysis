package com.bytedance.pitaya.api.bean;

import X.C1439705kJ;
import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PTYTaskConfig implements ReflectionCall {
    public static final C1439705kJ Companion = new Object() { // from class: X.05kJ
    };
    public int callType;
    public final String entrance;
    public final float pendingTimeout;
    public final boolean sync;

    public PTYTaskConfig() {
        this(false, null, -1.0f);
    }

    public final PTYTaskConfig copy(boolean z, String str, float f) {
        return new PTYTaskConfig(z, str, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYTaskConfig)) {
            return false;
        }
        PTYTaskConfig pTYTaskConfig = (PTYTaskConfig) obj;
        return this.sync == pTYTaskConfig.sync && Intrinsics.LJFF(this.entrance, pTYTaskConfig.entrance) && Float.compare(this.pendingTimeout, pTYTaskConfig.pendingTimeout) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYTaskConfig(sync=");
        sbLIZ.append(this.sync);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.entrance);
        sbLIZ.append(", pendingTimeout=");
        sbLIZ.append(this.pendingTimeout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.sync;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.entrance;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.pendingTimeout);
    }

    public final int getCallType() {
        return this.callType;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final float getPendingTimeout() {
        return this.pendingTimeout;
    }

    public final boolean getSync() {
        return this.sync;
    }

    public final void setCallType(int i) {
        this.callType = i;
    }

    public PTYTaskConfig(boolean z, String str, float f) {
        this.sync = z;
        this.entrance = str;
        this.pendingTimeout = f;
        this.callType = 1;
    }
}
