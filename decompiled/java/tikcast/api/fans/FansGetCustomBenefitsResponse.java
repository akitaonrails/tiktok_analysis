package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.FanBenefitConfig;
import webcast.data.FanCustomBenefit;
import webcast.data.OfficialBenefitTemplate;

/* JADX INFO: loaded from: classes8.dex */
public final class FansGetCustomBenefitsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("benefit_config")
        public FanBenefitConfig benefitConfig;

        @C09CT("show_custom_benefits")
        public boolean showCustomBenefits;

        @C09CT("benefits")
        public List<FanCustomBenefit> benefits = new ArrayList();

        @C09CT("templates")
        public List<OfficialBenefitTemplate> templates = new ArrayList();
    }
}
