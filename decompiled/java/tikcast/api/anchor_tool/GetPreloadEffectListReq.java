package tikcast.api.anchor_tool;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class GetPreloadEffectListReq {

    @C09CT("effect_info_list")
    public List<EffectInfo> effectInfoList = new ArrayList();

    @C09CT("last_effect_id")
    public long lastEffectId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    public static final class EffectInfo {

        @C09CT("download")
        public boolean download;

        @C09CT("effect_id")
        public long effectId;
    }
}
