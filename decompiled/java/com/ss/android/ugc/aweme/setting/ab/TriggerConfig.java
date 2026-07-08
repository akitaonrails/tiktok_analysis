package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TriggerConfig {

    @C09CT("idle")
    public final IdleTriggerConfig idle;

    @C09CT("memory")
    public final MemoryTriggerConfig memory;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerConfig)) {
            return false;
        }
        TriggerConfig triggerConfig = (TriggerConfig) obj;
        return Intrinsics.LJFF(this.memory, triggerConfig.memory) && Intrinsics.LJFF(this.idle, triggerConfig.idle);
    }

    public final int hashCode() {
        return (this.memory.hashCode() * 31) + this.idle.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggerConfig(memory=");
        sbLIZ.append(this.memory);
        sbLIZ.append(", idle=");
        sbLIZ.append(this.idle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TriggerConfig() {
        this(new MemoryTriggerConfig(false, 1, 20000L, 4000L, 0.55f, 0.9f, 3, 0, 0.2d, 0.5d, Mp4ScreenVideoLoadTimeout.CONTROL), new IdleTriggerConfig(false, 60000L, 2, true));
    }

    public TriggerConfig(MemoryTriggerConfig memoryTriggerConfig, IdleTriggerConfig idleTriggerConfig) {
        this.memory = memoryTriggerConfig;
        this.idle = idleTriggerConfig;
    }
}
