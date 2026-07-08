package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UpsellEligibilityInfo {

    @C09CT("category")
    public int category;

    @C09CT("is_lop_region")
    public boolean isLopRegion;

    @C09CT("match")
    public boolean match;

    @C09CT("content")
    public String content = "";

    @C09CT("sub_eligibility")
    public List<UpsellEligibilityInfo> subEligibility = new ArrayList();

    @C09CT("schema_url")
    public String schemaUrl = "";
}
