package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDynamicInterestList {

    @C09CT("has_clicked")
    public boolean hasClicked;

    @C09CT("interest_list")
    public List<LiveDynamicInterest> interestList = new ArrayList();

    @C09CT("total_count")
    public long totalCount;
}
