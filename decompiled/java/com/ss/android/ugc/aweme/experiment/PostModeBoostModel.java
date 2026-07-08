package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PostModeBoostModel {

    @C09CT("fps_monitor")
    public final boolean enableFpsMonitor;

    @C09CT("scroll_boost")
    public final boolean enableScrollBoost;

    @C09CT(Scene.SCENE_SERVICE)
    public final List<String> scene;

    @C09CT("value")
    public final int value;

    public PostModeBoostModel() {
        this(0, false, false, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeBoostModel)) {
            return false;
        }
        PostModeBoostModel postModeBoostModel = (PostModeBoostModel) obj;
        return this.value == postModeBoostModel.value && this.enableFpsMonitor == postModeBoostModel.enableFpsMonitor && this.enableScrollBoost == postModeBoostModel.enableScrollBoost && Intrinsics.LJFF(this.scene, postModeBoostModel.scene);
    }

    public final int hashCode() {
        int iZ2 = ((((this.value * 31) + C786410Ut5.Z2(this.enableFpsMonitor)) * 31) + C786410Ut5.Z2(this.enableScrollBoost)) * 31;
        List<String> list = this.scene;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeBoostModel(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", enableFpsMonitor=");
        sbLIZ.append(this.enableFpsMonitor);
        sbLIZ.append(", enableScrollBoost=");
        sbLIZ.append(this.enableScrollBoost);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PostModeBoostModel(int i, boolean z, boolean z2, List<String> list) {
        this.value = i;
        this.enableFpsMonitor = z;
        this.enableScrollBoost = z2;
        this.scene = list;
    }

    public PostModeBoostModel(int i, boolean z, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
