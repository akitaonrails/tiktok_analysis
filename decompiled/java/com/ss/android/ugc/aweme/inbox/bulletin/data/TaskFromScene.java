package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TaskFromScene {

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("scene_params")
    public final Map<String, Object> sceneParams;

    public TaskFromScene() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskFromScene)) {
            return false;
        }
        TaskFromScene taskFromScene = (TaskFromScene) obj;
        return Intrinsics.LJFF(this.scene, taskFromScene.scene) && Intrinsics.LJFF(this.sceneParams, taskFromScene.sceneParams);
    }

    public final int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.sceneParams;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskFromScene(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", sceneParams=");
        sbLIZ.append(this.sceneParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaskFromScene(String str, Map<String, ? extends Object> map) {
        this.scene = str;
        this.sceneParams = map;
    }
}
