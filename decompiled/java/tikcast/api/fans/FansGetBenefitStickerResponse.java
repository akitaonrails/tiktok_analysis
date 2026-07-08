package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.FanCustomBenefit;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetBenefitStickerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("benefits")
        public List<FanCustomBenefit> benefits = new ArrayList();
    }
}
