package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class LeadingElevatorBar {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("description_text")
    public ECRichText descriptionText;

    @C09CT("type")
    public Integer type;

    public LeadingElevatorBar() {
    }

    public LeadingElevatorBar(ECRichText eCRichText, Integer num, String str) {
        this.descriptionText = eCRichText;
        this.type = num;
        this.daInfo = str;
    }
}
