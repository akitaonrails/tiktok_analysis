package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeKitaModel {

    @C09CT("disable_on_enter")
    public final boolean disableOnEnter;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("hook_gesture")
    public final boolean enableGesture;

    @C09CT("low_percent")
    public final int lowEndPer;

    @C09CT("low_score")
    public final int lowEndScore;

    @C09CT(Scene.SCENE_SERVICE)
    public final List<String> scene;

    @C09CT("super_low_percent")
    public final int superLowEndPer;

    @C09CT("super_low_score")
    public final int superLowEndScore;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeKitaModel)) {
            return false;
        }
        PhotoModeKitaModel photoModeKitaModel = (PhotoModeKitaModel) obj;
        return this.enable == photoModeKitaModel.enable && this.lowEndScore == photoModeKitaModel.lowEndScore && this.lowEndPer == photoModeKitaModel.lowEndPer && this.enableGesture == photoModeKitaModel.enableGesture && this.disableOnEnter == photoModeKitaModel.disableOnEnter && this.superLowEndScore == photoModeKitaModel.superLowEndScore && this.superLowEndPer == photoModeKitaModel.superLowEndPer && Intrinsics.LJFF(this.scene, photoModeKitaModel.scene);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.lowEndScore) * 31) + this.lowEndPer) * 31) + C786410Ut5.Z2(this.enableGesture)) * 31) + C786410Ut5.Z2(this.disableOnEnter)) * 31) + this.superLowEndScore) * 31) + this.superLowEndPer) * 31;
        List<String> list = this.scene;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeKitaModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", lowEndScore=");
        sbLIZ.append(this.lowEndScore);
        sbLIZ.append(", lowEndPer=");
        sbLIZ.append(this.lowEndPer);
        sbLIZ.append(", enableGesture=");
        sbLIZ.append(this.enableGesture);
        sbLIZ.append(", disableOnEnter=");
        sbLIZ.append(this.disableOnEnter);
        sbLIZ.append(", superLowEndScore=");
        sbLIZ.append(this.superLowEndScore);
        sbLIZ.append(", superLowEndPer=");
        sbLIZ.append(this.superLowEndPer);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoModeKitaModel() {
        this(false, 7, 70, true, true, 6, 50, C1697810uHb.LJIIJJI("homepage_hot", "For You"));
    }

    public PhotoModeKitaModel(boolean z, int i, int i2, boolean z2, boolean z3, int i3, int i4, List<String> list) {
        this.enable = z;
        this.lowEndScore = i;
        this.lowEndPer = i2;
        this.enableGesture = z2;
        this.disableOnEnter = z3;
        this.superLowEndScore = i3;
        this.superLowEndPer = i4;
        this.scene = list;
    }
}
