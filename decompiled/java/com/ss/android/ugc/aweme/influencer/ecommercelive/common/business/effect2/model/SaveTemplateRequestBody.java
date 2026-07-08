package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SaveTemplateRequestBody {

    @C09CT("billboard_activity_info")
    public final BillboardActivityInfo activityInfo;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("field_list")
    public final List<TemplateField> fieldList;

    @C09CT("billboard_giveaway_info")
    public final BillboardGiveawayInfo giveawayInfo;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_sub_type")
    public final Integer templateSubType;

    @C09CT("template_type")
    public final int templateType;

    public SaveTemplateRequestBody(String str, String str2, int i, Integer num, List<TemplateField> list, BillboardActivityInfo billboardActivityInfo, BillboardGiveawayInfo billboardGiveawayInfo) {
        this.authorId = str;
        this.templateId = str2;
        this.templateType = i;
        this.templateSubType = num;
        this.fieldList = list;
        this.activityInfo = billboardActivityInfo;
        this.giveawayInfo = billboardGiveawayInfo;
    }
}
