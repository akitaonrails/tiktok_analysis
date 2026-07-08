package com.bytedance.ies.ugc.aweme.rich.model.feed.model.commercialize.adexperience;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AceSurveyUserConvert implements Serializable {

    @C09CT("item_id")
    public final String itemId = CardStruct.IStatusCode.DEFAULT;

    @C09CT("adv_id")
    public final String advId = CardStruct.IStatusCode.DEFAULT;

    @C09CT("ad_id")
    public final String adId = CardStruct.IStatusCode.DEFAULT;

    @C09CT("creative_id")
    public final String cid = CardStruct.IStatusCode.DEFAULT;

    @C09CT("ad_extra_msg")
    public final String adExtraMsg = "";

    public final String getAdExtraMsg() {
        return this.adExtraMsg;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getAdvId() {
        return this.advId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getItemId() {
        return this.itemId;
    }
}
