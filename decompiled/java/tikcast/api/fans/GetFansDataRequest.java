package tikcast.api.fans;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GetFansDataRequest {

    @C09CT("fans_data_section")
    public int fansDataSection;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";
}
