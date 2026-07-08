package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetFansBasicInfoReq {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("user_id")
    public long userId;

    @C09CT("info_enums")
    public List<Integer> infoEnums = new ArrayList();

    @C09CT("iap_country_code")
    public String iapCountryCode = "";

    @C09CT("milestone_id")
    public String milestoneId = "";

    @C09CT("faq_scene")
    public String faqScene = "";
}
