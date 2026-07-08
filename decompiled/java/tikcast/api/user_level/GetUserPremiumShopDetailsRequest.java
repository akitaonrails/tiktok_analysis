package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GetUserPremiumShopDetailsRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("invitation_id")
    public long invitationId;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("user_id")
    public long userId;
}
