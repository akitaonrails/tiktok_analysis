package tikcast.api.fans;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes8.dex */
public final class GetNonFansUserDataRequest {

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("iap_country_code")
    public String iapCountryCode = "";

    @C09CT("panel_exp_group")
    public long panelExpGroup;

    @C09CT("req_source")
    public int reqSource;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
