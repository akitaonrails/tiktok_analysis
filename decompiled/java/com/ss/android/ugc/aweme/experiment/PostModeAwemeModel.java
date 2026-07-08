package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PostModeAwemeModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT(Scene.SCENE_SERVICE)
    public final List<String> scene;

    public PostModeAwemeModel() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeAwemeModel)) {
            return false;
        }
        PostModeAwemeModel postModeAwemeModel = (PostModeAwemeModel) obj;
        return this.enable == postModeAwemeModel.enable && Intrinsics.LJFF(this.scene, postModeAwemeModel.scene);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enable) * 31;
        List<String> list = this.scene;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeAwemeModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PostModeAwemeModel(boolean z, List<String> list) {
        this.enable = z;
        this.scene = list;
    }

    public PostModeAwemeModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? Collections.singletonList("homepage_explore") : list);
    }
}
