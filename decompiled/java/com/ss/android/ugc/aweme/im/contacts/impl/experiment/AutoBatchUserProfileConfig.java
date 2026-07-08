package com.ss.android.ugc.aweme.im.contacts.impl.experiment;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoBatchUserProfileConfig {

    @C09CT("batchable_scenes")
    public final List<String> batchableScenes;

    @C09CT("debounce_ms")
    public final long debounceMs;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("max_wait_ms")
    public final long maxWaitMs;

    @C09CT("miss_retry_minutes")
    public final long missRetryMinutes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoBatchUserProfileConfig)) {
            return false;
        }
        AutoBatchUserProfileConfig autoBatchUserProfileConfig = (AutoBatchUserProfileConfig) obj;
        return this.enabled == autoBatchUserProfileConfig.enabled && this.debounceMs == autoBatchUserProfileConfig.debounceMs && this.maxWaitMs == autoBatchUserProfileConfig.maxWaitMs && this.missRetryMinutes == autoBatchUserProfileConfig.missRetryMinutes && Intrinsics.LJFF(this.batchableScenes, autoBatchUserProfileConfig.batchableScenes);
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Y2(this.debounceMs)) * 31) + C786410Ut5.Y2(this.maxWaitMs)) * 31) + C786410Ut5.Y2(this.missRetryMinutes)) * 31) + this.batchableScenes.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoBatchUserProfileConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", debounceMs=");
        sbLIZ.append(this.debounceMs);
        sbLIZ.append(", maxWaitMs=");
        sbLIZ.append(this.maxWaitMs);
        sbLIZ.append(", missRetryMinutes=");
        sbLIZ.append(this.missRetryMinutes);
        sbLIZ.append(", batchableScenes=");
        sbLIZ.append(this.batchableScenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoBatchUserProfileConfig() {
        this(false, 200L, 1000L, 10L, C1697810uHb.LJIIJJI("session_convert", "im_message_request", "vo_convert", "im_avatar", "im_chat_group"));
    }

    public AutoBatchUserProfileConfig(boolean z, long j, long j2, long j3, List<String> list) {
        this.enabled = z;
        this.debounceMs = j;
        this.maxWaitMs = j2;
        this.missRetryMinutes = j3;
        this.batchableScenes = list;
    }
}
