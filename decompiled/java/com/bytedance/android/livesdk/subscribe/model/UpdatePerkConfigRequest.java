package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdatePerkConfigRequest {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("perk_frequency")
    public int perkFrequency;

    @C09CT("benefit_id_str")
    public String benefitIdStr = "";

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("official_template_id")
    public String officialTemplateId = "";

    @C09CT("content_type_list")
    public String contentTypeList = "";
}
