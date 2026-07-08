package webcast.api.first_recharge;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class CampaignOperateParams {

    @C09CT("req_from")
    public int reqFrom;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("gift_enter_from")
    public String giftEnterFrom = "";

    @C09CT("request_page")
    public String requestPage = "";
}
