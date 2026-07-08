package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CancelPaymentRequest {

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("tpl_id")
    public String tplId = "";

    @C09CT("sku_name")
    public String skuName = "";

    @C09CT("cancellation_reason_ids")
    public List<Long> cancellationReasonIds = new ArrayList();
}
