package tikcast.anchor.platform_promotion;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionOperationRecord {

    @C09CT("create_time")
    public long createTime;

    @C09CT("operator_email")
    public String operatorEmail = "";

    @C09CT("diffs")
    public List<PromotionOperationDiff> diffs = new ArrayList();
}
