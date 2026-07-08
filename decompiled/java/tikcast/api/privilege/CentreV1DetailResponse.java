package tikcast.api.privilege;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CentreV1DetailResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("detail_item_list")
        public List<DetailItemList> detailItemList = new ArrayList();
    }
}
