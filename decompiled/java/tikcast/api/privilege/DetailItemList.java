package tikcast.api.privilege;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class DetailItemList {

    @C09CT("effective_item_num")
    public int effectiveItemNum;

    @C09CT("item_list")
    public List<DetailItem> itemList = new ArrayList();

    @C09CT("list_name")
    public Line listName;

    @C09CT("total_item_num")
    public int totalItemNum;
}
