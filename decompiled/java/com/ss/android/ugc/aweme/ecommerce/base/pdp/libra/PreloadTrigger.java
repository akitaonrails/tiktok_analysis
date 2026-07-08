package com.ss.android.ugc.aweme.ecommerce.base.pdp.libra;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PreloadTrigger {

    @C09CT("delay_ms")
    public final int delayMs;

    @C09CT("event")
    public final Integer event;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("scroll_distance")
    public final Integer scrollDistance;

    public PreloadTrigger() {
        this(null, null, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadTrigger)) {
            return false;
        }
        PreloadTrigger preloadTrigger = (PreloadTrigger) obj;
        return Intrinsics.LJFF(this.event, preloadTrigger.event) && Intrinsics.LJFF(this.scene, preloadTrigger.scene) && this.delayMs == preloadTrigger.delayMs && Intrinsics.LJFF(this.scrollDistance, preloadTrigger.scrollDistance);
    }

    public final int hashCode() {
        Integer num = this.event;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.scene;
        int iHashCode2 = (((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.delayMs) * 31;
        Integer num3 = this.scrollDistance;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTrigger(event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.delayMs);
        sbLIZ.append(", scrollDistance=");
        sbLIZ.append(this.scrollDistance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadTrigger(Integer num, Integer num2, int i, Integer num3) {
        this.event = num;
        this.scene = num2;
        this.delayMs = i;
        this.scrollDistance = num3;
    }
}
