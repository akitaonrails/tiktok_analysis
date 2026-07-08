package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TriadRecMoreConfig {

    @C09CT("cooldown")
    public final RecMoreByTriadCooldownConfigModel cooldown;

    @C09CT("server_fetch_response_timeout_ms")
    public final int timeoutMs;

    @C09CT("with_auto_scroll")
    public final int withAutoScroll;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriadRecMoreConfig)) {
            return false;
        }
        TriadRecMoreConfig triadRecMoreConfig = (TriadRecMoreConfig) obj;
        return Intrinsics.LJFF(this.cooldown, triadRecMoreConfig.cooldown) && this.timeoutMs == triadRecMoreConfig.timeoutMs && this.withAutoScroll == triadRecMoreConfig.withAutoScroll;
    }

    public final int hashCode() {
        return (((this.cooldown.hashCode() * 31) + this.timeoutMs) * 31) + this.withAutoScroll;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriadRecMoreConfig(cooldown=");
        sbLIZ.append(this.cooldown);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.timeoutMs);
        sbLIZ.append(", withAutoScroll=");
        sbLIZ.append(this.withAutoScroll);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TriadRecMoreConfig() {
        this(new RecMoreByTriadCooldownConfigModel(3, new int[]{5, 5, 5, 5}, new int[]{3, 7, 14, 28}), LSPassThroughRecordSizeConfig.DEFAULT, 1);
    }

    public TriadRecMoreConfig(RecMoreByTriadCooldownConfigModel recMoreByTriadCooldownConfigModel, int i, int i2) {
        this.cooldown = recMoreByTriadCooldownConfigModel;
        this.timeoutMs = i;
        this.withAutoScroll = i2;
    }
}
