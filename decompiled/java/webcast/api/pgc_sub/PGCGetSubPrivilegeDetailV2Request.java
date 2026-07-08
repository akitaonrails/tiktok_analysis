package webcast.api.pgc_sub;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetSubPrivilegeDetailV2Request {

    @C09CT("for_anchor")
    public boolean forAnchor;

    @C09CT("is_new_page")
    public boolean isNewPage;

    @C09CT("live_sub_only_month")
    public long liveSubOnlyMonth;

    @C09CT("live_sub_only_tier")
    public long liveSubOnlyTier;

    @C09CT("with_web_templates")
    public boolean withWebTemplates;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("price_region")
    public String priceRegion = "";

    @C09CT("currency_code")
    public String currencyCode = "";
}
