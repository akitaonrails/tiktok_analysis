package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionInfo {

    @C09CT("promotion_id")
    public String promotionId = "";

    @C09CT("product_ids")
    public List<String> productIds = new ArrayList();

    @C09CT("failed_message")
    public String failedMessage = "";
}
