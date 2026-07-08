package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLoadRetreatConfigScene {

    @C09CT("delay_disable_time_ms")
    public final long delayDisableTimeMs;

    @C09CT("enter")
    public final String enter;

    @C09CT("exit")
    public final String exit;

    public EcomLoadRetreatConfigScene() {
        this("", "", Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final boolean LIZ(String str) {
        if (Intrinsics.LJFF(this.exit, str) || this.exit.length() == 0 || str.length() == 0) {
            return true;
        }
        return false;
    }

    public EcomLoadRetreatConfigScene(String str, String str2, long j) {
        this.enter = str;
        this.exit = str2;
        this.delayDisableTimeMs = j;
    }
}
