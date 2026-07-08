package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PhotoModeProfileAreaSwipeModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_android2ios")
    public final boolean enable2Ios;

    @C09CT("enable_left_content")
    public final boolean enableFling;

    @C09CT(Scene.SCENE_SERVICE)
    public final List<String> scene;

    public PhotoModeProfileAreaSwipeModel() {
        this(false, false, false, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeProfileAreaSwipeModel)) {
            return false;
        }
        PhotoModeProfileAreaSwipeModel photoModeProfileAreaSwipeModel = (PhotoModeProfileAreaSwipeModel) obj;
        return this.enable == photoModeProfileAreaSwipeModel.enable && this.enableFling == photoModeProfileAreaSwipeModel.enableFling && this.enable2Ios == photoModeProfileAreaSwipeModel.enable2Ios && Intrinsics.LJFF(this.scene, photoModeProfileAreaSwipeModel.scene);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enableFling)) * 31) + C786410Ut5.Z2(this.enable2Ios)) * 31;
        List<String> list = this.scene;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeProfileAreaSwipeModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableFling=");
        sbLIZ.append(this.enableFling);
        sbLIZ.append(", enable2Ios=");
        sbLIZ.append(this.enable2Ios);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoModeProfileAreaSwipeModel(boolean z, boolean z2, boolean z3, List<String> list) {
        this.enable = z;
        this.enableFling = z2;
        this.enable2Ios = z3;
        this.scene = list;
    }

    public PhotoModeProfileAreaSwipeModel(boolean z, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? Collections.singletonList("homepage_hot") : list);
    }
}
