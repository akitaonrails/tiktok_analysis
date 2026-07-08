package tikcast.api.privilege;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftTraySponserEntry {

    @C09CT("is_opt_out")
    public boolean isOptOut;

    @C09CT("items")
    public List<GiftTraySponsorItem> items = new ArrayList();
}
