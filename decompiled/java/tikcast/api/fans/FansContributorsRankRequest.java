package tikcast.api.fans;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class FansContributorsRankRequest {

    @C09CT("count")
    public int count;

    @C09CT("offset")
    public int offset;

    @C09CT("room_id")
    public long roomId;

    @C09CT("with_crm_display_item")
    public boolean withCrmDisplayItem;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";
}
