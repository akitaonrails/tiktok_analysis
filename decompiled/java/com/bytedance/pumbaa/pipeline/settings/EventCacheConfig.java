package com.bytedance.pumbaa.pipeline.settings;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class EventCacheConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("queue_max_length")
    public final int queueMaxLength;

    public EventCacheConfig() {
        this(false, 100);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventCacheConfig)) {
            return false;
        }
        EventCacheConfig eventCacheConfig = (EventCacheConfig) obj;
        return this.enable == eventCacheConfig.enable && this.queueMaxLength == eventCacheConfig.queueMaxLength;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.queueMaxLength;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventCacheConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", queueMaxLength=");
        sbLIZ.append(this.queueMaxLength);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventCacheConfig(boolean z, int i) {
        this.enable = z;
        this.queueMaxLength = i;
    }
}
