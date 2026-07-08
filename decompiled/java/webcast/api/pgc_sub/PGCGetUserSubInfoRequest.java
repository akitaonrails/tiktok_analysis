package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetUserSubInfoRequest {

    @C09CT("live_sub_only_month")
    public long liveSubOnlyMonth;

    @C09CT("live_sub_only_tier")
    public long liveSubOnlyTier;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("price_region")
    public String priceRegion = "";

    @C09CT("currency_code")
    public String currencyCode = "";

    @C09CT("non_sec_anchor_id")
    public String nonSecAnchorId = "";
}
