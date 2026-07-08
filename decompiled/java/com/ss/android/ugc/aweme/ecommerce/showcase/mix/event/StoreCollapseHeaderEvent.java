package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoreCollapseHeaderEvent extends BaseMixEvent {

    @C09CT("delay_time")
    public final Float delayTime;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreCollapseHeaderEvent)) {
            return false;
        }
        StoreCollapseHeaderEvent storeCollapseHeaderEvent = (StoreCollapseHeaderEvent) obj;
        return Intrinsics.LJFF(this.delayTime, storeCollapseHeaderEvent.delayTime) && Intrinsics.LJFF(this.scene, storeCollapseHeaderEvent.scene);
    }

    public final int hashCode() {
        Float f = this.delayTime;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.scene;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreCollapseHeaderEvent(delayTime=");
        sbLIZ.append(this.delayTime);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoreCollapseHeaderEvent(Float f, String str) {
        this.delayTime = f;
        this.scene = str;
    }
}
