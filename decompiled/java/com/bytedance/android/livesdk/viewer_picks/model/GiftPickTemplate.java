package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPickTemplate {

    @C09CT("extra")
    public GiftPickExtra extra;

    @C09CT("gift_icon")
    public ImageModel giftIcon;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("is_priority_request")
    public boolean isPriorityRequest;

    @C09CT("searchable")
    public boolean searchable;

    @C09CT("template_id")
    public long templateId;

    @C09CT("template_id_str")
    public String templateIdStr = "";

    @C09CT("gift_name")
    public String giftName = "";

    @C09CT("customized_desc")
    public String customizedDesc = "";
}
