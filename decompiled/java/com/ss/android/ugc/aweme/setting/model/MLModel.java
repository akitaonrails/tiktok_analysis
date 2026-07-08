package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.util.Arrays;

/* JADX INFO: loaded from: classes24.dex */
public class MLModel {

    @C09CT("disable")
    public boolean disable;

    @C09CT("package")
    public String packageUrl;

    @C09CT("params")
    public int[] params;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("type")
    public int type = 3;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MLModel{scene='");
        sbLIZ.append(this.scene);
        sbLIZ.append('\'');
        sbLIZ.append(", packageUrl='");
        sbLIZ.append(this.packageUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", params=");
        sbLIZ.append(Arrays.toString(this.params));
        sbLIZ.append(", disable=");
        sbLIZ.append(this.disable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
