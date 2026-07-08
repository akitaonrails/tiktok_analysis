package com.ss.android.ugc.gamora.editor.ailive.util;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class AILiveStarlingConfigList {
    public static final AILiveStarlingConfig LIZ = new AILiveStarlingConfig(C2097608Jq.LJ(), C2097608Jq.LJ());

    public static final class AILiveStarlingConfig {

        @C09CT("code_scene")
        public final Map<String, Map<String, String>> codeScene;

        @C09CT(Scene.SCENE_SERVICE)
        public final Map<String, String> scene;

        public AILiveStarlingConfig() {
            this(C2097608Jq.LJ(), C2097608Jq.LJ());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AILiveStarlingConfig(Map<String, String> map, Map<String, ? extends Map<String, String>> map2) {
            this.scene = map;
            this.codeScene = map2;
        }

        public final String LIZ(String str, String str2) {
            boolean z;
            Map<String, String> orDefault;
            String orDefault2;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z || str2.length() == 0 || (orDefault = this.codeScene.getOrDefault(str, null)) == null || (orDefault2 = orDefault.getOrDefault(str2, null)) == null || orDefault2.length() == 0) {
                return null;
            }
            return orDefault2;
        }
    }
}
