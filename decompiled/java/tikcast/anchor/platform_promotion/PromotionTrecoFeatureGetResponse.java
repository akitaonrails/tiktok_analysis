package tikcast.anchor.platform_promotion;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PromotionTrecoFeatureGetResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("features")
        public List<PromotionTrecoFeature> features = new ArrayList();

        @C09CT("succeed")
        public boolean succeed;
    }
}
