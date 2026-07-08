package webcast.data;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSettingInfo {

    @C09CT("last_layout_settings")
    public List<AnchorLastLayoutSetting> lastLayoutSettings = new ArrayList();

    public static final class AnchorLastLayoutSetting {

        @C09CT("layout_id")
        public String layoutId = "";

        @C09CT(Scene.SCENE_SERVICE)
        public long scene;
    }
}
