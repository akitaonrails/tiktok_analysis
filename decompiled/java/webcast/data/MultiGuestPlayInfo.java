package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestPlayInfo {

    @C09CT("pack_succ_flag")
    public boolean packSuccFlag;

    @C09CT("play_scene_to_config_map")
    public Map<Integer, MultiGuestPlayConfig> playSceneToConfigMap = new LinkedHashMap();

    public static final class MultiGuestPlayConfig {

        @C09CT("feature_config_map")
        public Map<Integer, Integer> featureConfigMap = new LinkedHashMap();

        @C09CT("play_scene")
        public int playScene;
    }
}
