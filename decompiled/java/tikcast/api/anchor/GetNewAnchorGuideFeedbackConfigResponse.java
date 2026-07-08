package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetNewAnchorGuideFeedbackConfigResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("display_interval")
        public int displayInterval;

        @C09CT("guide_display_interval")
        public int guideDisplayInterval;

        @C09CT("guide_style")
        public int guideStyle;

        @C09CT("identity")
        public int identity;

        @C09CT(Scene.SCENE_SERVICE)
        public List<String> scene = new ArrayList();
    }
}
