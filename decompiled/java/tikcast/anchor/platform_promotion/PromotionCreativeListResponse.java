package tikcast.anchor.platform_promotion;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionCreativeListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("creative_list")
        public List<PromotionCreativeShowInfo> creativeList = new ArrayList();

        @C09CT("page")
        public int page;

        @C09CT("size")
        public int size;

        @C09CT("total")
        public long total;
    }
}
