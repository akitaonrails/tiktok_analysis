package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCTemplateListRequest {

    @C09CT("fetch_privilege")
    public boolean fetchPrivilege;

    @C09CT("level_one")
    public long levelOne;

    @C09CT("level_three")
    public long levelThree;

    @C09CT("level_two")
    public long levelTwo;

    @C09CT("level_zero")
    public long levelZero;

    @C09CT("live_sub_only_month")
    public long liveSubOnlyMonth;

    @C09CT("live_sub_only_tier")
    public long liveSubOnlyTier;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("sub_scenario")
    public int subScenario;

    @C09CT("with_web_templates")
    public boolean withWebTemplates;

    @C09CT("to_uid")
    public String toUid = "";

    @C09CT("price_region")
    public String priceRegion = "";

    @C09CT("postal_code")
    public String postalCode = "";

    @C09CT("channel_order_ids_str")
    public String channelOrderIdsStr = "";

    @C09CT("currency_code")
    public String currencyCode = "";

    @C09CT("room_id")
    public String roomId = "";
}
