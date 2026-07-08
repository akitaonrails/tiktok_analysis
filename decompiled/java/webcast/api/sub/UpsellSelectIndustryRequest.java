package webcast.api.sub;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes28.dex */
public final class UpsellSelectIndustryRequest {

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("select_scene")
    public int selectScene;

    @C09CT("selected_industry")
    public long selectedIndustry;
}
