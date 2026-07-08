package webcast.api.pgc_sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCTagInfo {

    @C09CT("tag_type")
    public int tagType;

    @C09CT("jump_link")
    public String jumpLink = "";

    @C09CT("activity_name")
    public String activityName = "";

    @C09CT("promotion_title")
    public String promotionTitle = "";

    @C09CT("promotion_desc")
    public String promotionDesc = "";

    @C09CT("promotion_term_desc")
    public List<String> promotionTermDesc = new ArrayList();

    @C09CT("promotion_button")
    public String promotionButton = "";

    @C09CT("clickable_desc")
    public String clickableDesc = "";

    @C09CT("clickable_desc_extra_info")
    public String clickableDescExtraInfo = "";

    @C09CT("package_subscribe_button")
    public String packageSubscribeButton = "";

    @C09CT("new_promotion_desc")
    public String newPromotionDesc = "";
}
