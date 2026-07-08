package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivatePremiumShopRequest {

    @C09CT("premium_shop_id")
    public long premiumShopId;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("user_id")
    public long userId;
}
