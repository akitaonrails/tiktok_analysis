package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorLiveFragmentListRequest {

    @C09CT("fragment_type")
    public int fragmentType;

    @C09CT("fragment_type_v2")
    public int fragmentTypeV2;

    @C09CT("get_result_by")
    public int getResultBy;

    @C09CT("need_share")
    public boolean needShare;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("user_type")
    public int userType;

    @C09CT("room_ids")
    public String roomIds = "";

    @C09CT("fragment_ids")
    public String fragmentIds = "";
}
